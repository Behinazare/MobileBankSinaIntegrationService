package com.rahand.sina.integration.provider.yaghut.service.deposit;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.DecryptResponse;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.enums.PaymentTransactionStatus;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.AchTransactionStatus;
import com.rahand.sina.integration.domain.bank.enums.AchTransferStatus;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.SignatureStatus;
import com.rahand.sina.integration.domain.bank.service.spec.Deposit;
import com.rahand.sina.integration.domain.bank.util.BankUtil;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonErrorMessage;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessDetailsBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessDetailsByInstanceIdResponseBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessParameterValueBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.StartProcessInstanceResponseBean;
import com.rahand.sina.integration.provider.yaghut.service.bpms.YaghutBpmsService;
import com.rahand.sina.integration.provider.yaghut.service.bpms.dto.GetProcessDetailResponse;
import com.rahand.sina.integration.provider.yaghut.service.bpms.dto.StartProcessResponse;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutMapper;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;
import org.apache.commons.lang.math.RandomUtils;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class YaghutDepositService implements Deposit {

    private final YaghutDepositProxy yaghutDepositProxy;
    private final YaghutUserService yaghutUserService;

    public YaghutDepositService() {
        yaghutDepositProxy = new YaghutDepositProxy();
        yaghutUserService = YaghutUserService.getInstance();
    }

    @Override
    public OpenDepositResponse openDeposit(OpenDepositRequest openDepositRequest) {

        OpenDepositResponse openDepositResponse = new OpenDepositResponse();
        YaghutBpmsService yaghutBpmsService = new YaghutBpmsService();
        String processDefinitionId = IntegrationLibConfig.getProperty("OPEN_DEPOSIT_PROCESS_DEFINITION_ID");
        ProcessParameterValueBean[] processParameterValueBeans = YaghutMapper.initOpenDepositProcessParameter(openDepositRequest);

        StartProcessResponse startProcessResponse = yaghutBpmsService.startProcessInstance(processDefinitionId, processParameterValueBeans);

        if (startProcessResponse.isSessionExpired()) {
            startProcessResponse = yaghutBpmsService.startProcessInstance(processDefinitionId, processParameterValueBeans);
        }

        if (startProcessResponse.isError()) {
            openDepositResponse.setError(true);
            openDepositResponse.setErrorMessage(startProcessResponse.getErrorMessage());
        } else {
            StartProcessInstanceResponseBean startProcessInstanceResponseBean = startProcessResponse.getStartProcessInstanceResponseBean();
            openDepositResponse.setId(startProcessInstanceResponseBean.getProcess().getId());
            openDepositResponse.setReferenceId(startProcessInstanceResponseBean.getProcess().getReferenceNumber());

            GetProcessDetailResponse getProcessDetailResponse = yaghutBpmsService.getProcessDetailsByInstanceId(openDepositResponse.getId());

            if (getProcessDetailResponse.isSessionExpired()) {
                getProcessDetailResponse = yaghutBpmsService.getProcessDetailsByInstanceId(openDepositResponse.getId());
            }

            if (getProcessDetailResponse.isError()) {
                openDepositResponse.setError(true);
                openDepositResponse.setErrorMessage(getProcessDetailResponse.getErrorMessage());
            } else {
                ProcessDetailsByInstanceIdResponseBean processDetailsByInstanceIdResponse = getProcessDetailResponse.getProcessDetailsByInstanceIdResponseBean();

                Optional<ProcessDetailsBean> errorInProcess = Arrays.stream(processDetailsByInstanceIdResponse.getProcessDetails())
                        .filter(processDetails -> processDetails.getTitle().equals("Error")).findFirst();

                if (errorInProcess.isPresent()) {

                    String error = errorInProcess.get().getValue();
                    openDepositResponse.setError(true);
                    openDepositResponse.setErrorMessage("مشکلی در فرایند افتتاح حساب رخ داده است");
                    openDepositResponse.setExtraErrorData(error);
                    CommonUtil.logError(getClass().getSimpleName(), "openDeposit", error, ServiceLogsDto.builder()
                            .input(CommonUtil.toJson(openDepositRequest))
                            .output(error)
                            .build());

                } else {

                    String depositNumberJson = Arrays.stream(processDetailsByInstanceIdResponse.getProcessDetails())
                            .filter(x -> x.getTitle().equals("depositId")).findFirst().get().getValue();

                    String depositNumber = CommonUtil.jsonToMap(depositNumberJson).get("DepositId");

                    String depositInfoJson = Arrays.stream(processDetailsByInstanceIdResponse.getProcessDetails())
                            .filter(x -> x.getTitle().equals("depositInfo")).findFirst().get().getValue();

                    OpenDepositInfoDto depositInfoDto = CommonUtil.jsonToObject(depositInfoJson, OpenDepositInfoDto.class);

                    openDepositResponse.setError(false);
                    openDepositResponse.setDepositNumber(depositNumber);
                    openDepositResponse.setDepositInfo(depositInfoDto);
                }

            }

        }
        return openDepositResponse;
    }

    @Override
    public DepositsResponse getDeposits(DepositsRequest depositsRequest) {

        DepositsResponse depositResponse = new DepositsResponse();

        LoginResponseBean loginResponse = yaghutUserService.getSessionId(depositsRequest.getUserId());
        DepositResponseBean depositResponseBean;
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        DepositSearchRequestBean depositSearchRequest = new DepositSearchRequestBean();

        if (loginResponse.getCif() == null) {
            depositSearchRequest.setCif(depositsRequest.getCif());
        }
        if (depositsRequest.getDepositStatus() != null) {
            depositSearchRequest.setDepositStatus(DepositStatusWS.fromValue(depositsRequest.getSignatureStatus().getName()));
        }

        if (depositsRequest.getDepositNumbers() != null) {
            depositSearchRequest.setDepositNumbers((String[]) depositsRequest.getDepositNumbers().toArray());
        }

        if (depositsRequest.getDepositPersonalityType() != null) {
            PersonalityType[] depositPersonalityTypes = new PersonalityType[1];
            depositPersonalityTypes[0] = PersonalityType.fromValue(depositsRequest.getDepositPersonalityType().getName());
            depositSearchRequest.setPersonality(depositPersonalityTypes);
        }

        if (depositsRequest.getSignatureStatus() != null) {
            depositSearchRequest.setSignatureStatus(new SignatureOwnerStatus[]{SignatureOwnerStatus.fromValue(depositsRequest.getSignatureStatus().getName())});
        }

        depositSearchRequest.setLength(depositsRequest.getLength() != null ? depositsRequest.getLength() : 100l);
        depositSearchRequest.setOffset(depositsRequest.getOffset() != null ? depositsRequest.getOffset() : 0l);


        try {
            depositResponseBean = yaghutDepositProxy.getDeposits(context, depositSearchRequest);

            List<DepositDto> deposits = new ArrayList<>();

            if (depositResponseBean.getDepositBeans() != null) {
                for (int i = 0; i < depositResponseBean.getDepositBeans().length; i++) {
                    DepositBean depositBean = depositResponseBean.getDepositBeans(i);
                    deposits.add(YaghutMapper.mapToDepositDto(depositBean));
                }
            }

            depositResponse.setError(false);
            depositResponse.setCount(deposits.size());
            depositResponse.setDeposits(deposits);

        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                depositResponse.setSessionExpired(true);
                depositResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositResponse.setError(yaghutExceptionResponse.isError());
                depositResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCustomerDeposits", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositSearchRequest))
                    .output(e.toString())
                    .build());
        }

        return depositResponse;
    }

    @Override
    public DepositsResponse getLegalDeposits(LegalDepositsRequest depositsRequest) {

        DecryptResponse userNameDecryptResponse = EncryptionService.decrypt(depositsRequest.getUserName());
        DecryptResponse passDecryptResponse = EncryptionService.decrypt(depositsRequest.getPassword());

        String userName;
        String pass;

        if (!userNameDecryptResponse.isError() && !passDecryptResponse.isError()) {
            userName = userNameDecryptResponse.getDecryptedData();
            pass = passDecryptResponse.getDecryptedData();
        } else {
            throw new CustomRuntimeException("errorInDecryptData");
        }

        DepositsResponse depositResponse = new DepositsResponse();

        LoginResponseBean loginResponse = yaghutUserService.loginByChannelUser(userName, pass);
        DepositResponseBean depositResponseBean;
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        DepositSearchRequestBean depositSearchRequest = new DepositSearchRequestBean();

        if (loginResponse.getCif() == null) {
            depositSearchRequest.setCif(depositsRequest.getCif());
        }

        if (depositsRequest.getDepositStatus() != null) {
            depositSearchRequest.setDepositStatus(DepositStatusWS.fromValue(depositsRequest.getSignatureStatus().getName()));
        }

        if (depositsRequest.getDepositNumbers() != null) {
            depositSearchRequest.setDepositNumbers((String[]) depositsRequest.getDepositNumbers().toArray());
        }

        if (depositsRequest.getDepositPersonalityType() != null) {
            PersonalityType[] depositPersonalityTypes = new PersonalityType[1];
            depositPersonalityTypes[0] = PersonalityType.fromValue(depositsRequest.getDepositPersonalityType().getName());
            depositSearchRequest.setPersonality(depositPersonalityTypes);
        }

        if (depositsRequest.getSignatureStatus() != null) {
            depositSearchRequest.setSignatureStatus(new SignatureOwnerStatus[]{SignatureOwnerStatus.fromValue(depositsRequest.getSignatureStatus().getName())});
        }

        depositSearchRequest.setLength(depositsRequest.getLength() != null ? depositsRequest.getLength() : 100l);
        depositSearchRequest.setOffset(depositsRequest.getOffset() != null ? depositsRequest.getOffset() : 0l);


        try {
            depositResponseBean = yaghutDepositProxy.getDeposits(context, depositSearchRequest);

            List<DepositDto> deposits = new ArrayList<>();

            if (depositResponseBean.getDepositBeans() != null) {
                for (int i = 0; i < depositResponseBean.getDepositBeans().length; i++) {
                    DepositBean depositBean = depositResponseBean.getDepositBeans(i);
                    deposits.add(YaghutMapper.mapToDepositDto(depositBean));
                }
            }

            depositResponse.setError(false);
            depositResponse.setCount(deposits.size());
            depositResponse.setDeposits(deposits);

        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                depositResponse.setSessionExpired(true);
                depositResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositResponse.setError(yaghutExceptionResponse.isError());
                depositResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCustomerDeposits", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositSearchRequest))
                    .output(e.toString())
                    .build());
        }

        return depositResponse;
    }

    @Override
    public GetCardsResponse getDepositCards(GetCardsRequest getCardsRequest) {

        GetCardsResponse cardsResponse = new GetCardsResponse();
        CardBean[] cardBeans;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(getCardsRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        CardsSearchRequestBean cardsSearchRequestBean = new CardsSearchRequestBean();
        cardsSearchRequestBean.setCardStatus(CardStatus.OK);

        if (loginResponse.getCif() == null) {
            cardsSearchRequestBean.setCif(getCardsRequest.getCif());

        }
        cardsSearchRequestBean.setDepositNumber(getCardsRequest.getDepositNumber());
        cardsSearchRequestBean.setLength(100l);
        cardsSearchRequestBean.setOffset(0l);

        try {
            cardBeans = yaghutDepositProxy.getCards(context, cardsSearchRequestBean);
            cardsResponse.setError(false);
            List<BankCardDto> cards = new ArrayList<>();

            for (int i = 0; i < cardBeans.length; i++) {
                CardBean cardBean = cardBeans[i];
                BankCardDto bankCardDto = YaghutMapper.mapToBankCardDto(cardBean);
                cards.add(bankCardDto);
            }
            cardsResponse.setCards(cards);

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                cardsResponse.setSessionExpired(true);
                cardsResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                cardsResponse.setError(true);
                cardsResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                cardsResponse.setError(true);
                cardsResponse.setErrorMessage("امکان دسترسی به این سپرده وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardsResponse.setError(yaghutExceptionResponse.isError());
                cardsResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
                cardsResponse.setExtraErrorData(yaghutExceptionResponse.getExtraErrorData());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getDepositCards", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardsSearchRequestBean))
                    .output(e.toString())
                    .build());
        }
        return cardsResponse;
    }

    @Override
    public DepositCustomersResponse getDepositCustomers(DepositCustomersRequest depositCustomersRequest) {

        DepositCustomersResponse depositCustomersResponse = new DepositCustomersResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(depositCustomersRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        DepositCustomerResponseBean depositCustomerResponseBean;
        DepositCustomerRequestBean depositCustomerRequestBean = new DepositCustomerRequestBean();
        depositCustomerRequestBean.setDepositNumber(depositCustomersRequest.getDepositNumber());
        depositCustomerRequestBean.setAttachedSignature(depositCustomersRequest.isAttachedSignature());
        depositCustomerRequestBean.setLength(depositCustomersRequest.getLength() != null ? depositCustomersRequest.getLength() : 100l);
        depositCustomerRequestBean.setOffset(depositCustomersRequest.getOffset() != null ? depositCustomersRequest.getOffset() : 0l);

        try {
            depositCustomerResponseBean = yaghutDepositProxy.getDepositCustomers(context, depositCustomerRequestBean);
            depositCustomersResponse.setError(false);

            DepositCustomerBean[] depositCustomerBeans = depositCustomerResponseBean.getDepositCustomers();
            List<DepositCustomer> depositCustomers = new ArrayList<>();

            if (depositCustomerBeans != null) {
                DepositCustomer depositCustomer;
                for (int i = 0; i < depositCustomerBeans.length; i++) {
                    DepositCustomerBean depositCustomerBean = depositCustomerBeans[i];
                    depositCustomer = new DepositCustomer();
                    depositCustomer.setCif(depositCustomerBean.getCif());
                    depositCustomer.setName(depositCustomerBean.getName());
                    depositCustomer.setSharePercent(depositCustomerBean.getSharePercent());
                    depositCustomer.setSignatureStatus(SignatureStatus.get(depositCustomerBean.getSignatureStatus().getValue()));
                    CustomerSignatureBean customerSignatureBean = depositCustomerBean.getSignature();
                    CustomerSignatureInfo customerSignatureInfo = new CustomerSignatureInfo();
                    customerSignatureInfo.setImage(customerSignatureBean.getImage());
                    customerSignatureInfo.setExpireDate(YaghutUtil.CalenderToLocalDateTime(customerSignatureBean.getExpireDate()));
                    depositCustomer.setCustomerSignature(customerSignatureInfo);
                    depositCustomer.setRelationExpireDate(YaghutUtil.CalenderToLocalDateTime(depositCustomerBean.getRelationExpireDate()));

                    depositCustomers.add(depositCustomer);
                }

                depositCustomersResponse.setOpenerCustomerCif(depositCustomerResponseBean.getOpenerCustomerCif());
                depositCustomersResponse.setOpenerCustomerName(depositCustomerResponseBean.getOpenerCustomerName());
                depositCustomersResponse.setDepositCustomers(depositCustomers);
                depositCustomersResponse.setCount(depositCustomers.size());
            }

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponseBean.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                depositCustomersResponse.setSessionExpired(true);
                depositCustomersResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositCustomersResponse.setError(true);
                depositCustomersResponse.setErrorMessage("شماره سپرده معتبر نیست");
            } else if (YaghutCommonException.checkException(e, "PermissionDeniedWSException")) {
                depositCustomersResponse.setError(true);
                depositCustomersResponse.setErrorMessage("سپرده متعلق به کاربر نیست");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositCustomersResponse.setError(yaghutExceptionResponse.isError());
                depositCustomersResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getDepositCustomers", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositCustomerRequestBean))
                    .output(e.toString())
                    .build());
        }

        return depositCustomersResponse;
    }

    @Override
    public DepositCustomersResponse getLegalDepositCustomers(DepositCustomersRequest depositCustomersRequest) {

        DecryptResponse userNameDecryptResponse = EncryptionService.decrypt(depositCustomersRequest.getUserName());
        DecryptResponse passDecryptResponse = EncryptionService.decrypt(depositCustomersRequest.getPassword());

        String userName;
        String pass;

        if (!userNameDecryptResponse.isError() && !passDecryptResponse.isError()) {
            userName = userNameDecryptResponse.getDecryptedData();
            pass = passDecryptResponse.getDecryptedData();
        } else {
            throw new CustomRuntimeException("errorInDecryptData");
        }

        DepositCustomersResponse depositCustomersResponse = new DepositCustomersResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.loginByChannelUser(userName, pass);
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        DepositCustomerResponseBean depositCustomerResponseBean;
        DepositCustomerRequestBean depositCustomerRequestBean = new DepositCustomerRequestBean();
        depositCustomerRequestBean.setDepositNumber(depositCustomersRequest.getDepositNumber());
        depositCustomerRequestBean.setAttachedSignature(depositCustomersRequest.isAttachedSignature());
        depositCustomerRequestBean.setLength(depositCustomersRequest.getLength() != null ? depositCustomersRequest.getLength() : 100l);
        depositCustomerRequestBean.setOffset(depositCustomersRequest.getOffset() != null ? depositCustomersRequest.getOffset() : 0l);

        try {
            depositCustomerResponseBean = yaghutDepositProxy.getDepositCustomers(context, depositCustomerRequestBean);
            depositCustomersResponse.setError(false);

            DepositCustomerBean[] depositCustomerBeans = depositCustomerResponseBean.getDepositCustomers();
            List<DepositCustomer> depositCustomers = new ArrayList<>();

            if (depositCustomerBeans != null) {
                DepositCustomer depositCustomer;
                for (int i = 0; i < depositCustomerBeans.length; i++) {
                    DepositCustomerBean depositCustomerBean = depositCustomerBeans[i];
                    depositCustomer = new DepositCustomer();
                    depositCustomer.setCif(depositCustomerBean.getCif());
                    depositCustomer.setName(depositCustomerBean.getName());
                    depositCustomer.setSharePercent(depositCustomerBean.getSharePercent());
                    depositCustomer.setSignatureStatus(SignatureStatus.get(depositCustomerBean.getSignatureStatus().getValue()));
                    CustomerSignatureBean customerSignatureBean = depositCustomerBean.getSignature();
                    CustomerSignatureInfo customerSignatureInfo = new CustomerSignatureInfo();
                    customerSignatureInfo.setImage(customerSignatureBean.getImage());
                    customerSignatureInfo.setExpireDate(YaghutUtil.CalenderToLocalDateTime(customerSignatureBean.getExpireDate()));
                    depositCustomer.setCustomerSignature(customerSignatureInfo);
                    depositCustomer.setRelationExpireDate(YaghutUtil.CalenderToLocalDateTime(depositCustomerBean.getRelationExpireDate()));

                    depositCustomers.add(depositCustomer);
                }

                depositCustomersResponse.setOpenerCustomerCif(depositCustomerResponseBean.getOpenerCustomerCif());
                depositCustomersResponse.setOpenerCustomerName(depositCustomerResponseBean.getOpenerCustomerName());
                depositCustomersResponse.setDepositCustomers(depositCustomers);
                depositCustomersResponse.setCount(depositCustomers.size());
            }

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponseBean.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }
                depositCustomersResponse.setSessionExpired(true);
                depositCustomersResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositCustomersResponse.setError(true);
                depositCustomersResponse.setErrorMessage("شماره سپرده معتبر نیست");
            } else if (YaghutCommonException.checkException(e, "PermissionDeniedWSException")) {
                depositCustomersResponse.setError(true);
                depositCustomersResponse.setErrorMessage("سپرده متعلق به کاربر نیست");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositCustomersResponse.setError(yaghutExceptionResponse.isError());
                depositCustomersResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getDepositCustomers", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositCustomerRequestBean))
                    .output(e.toString())
                    .build());
        }

        return depositCustomersResponse;
    }

    @Override
    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest depositBalanceRequest) {

        DepositBalanceResponse depositBalanceResponse = new DepositBalanceResponse();
        DepositBalanceResponseBean depositBalanceResponseBean;
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(depositBalanceRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        DepositBalanceRequestBean depositBalanceRequestBean = new DepositBalanceRequestBean();
        depositBalanceRequestBean.setDepositNumber(depositBalanceRequest.getDepositNumber());

        if (loginResponseBean.getCif() == null) {
            depositBalanceRequestBean.setCif(depositBalanceRequest.getCif());
        }

        try {
            depositBalanceResponseBean = yaghutDepositProxy.getDepositBalance(context, depositBalanceRequestBean);
            depositBalanceResponse.setError(false);
            depositBalanceResponse.setBalance(depositBalanceResponseBean.getBalance().getPrice());
            depositBalanceResponse.setAvailableBalance(depositBalanceResponseBean.getBalance().getAvailablePrice());
            depositBalanceResponse.setBlockedBalance(depositBalanceResponseBean.getBlockedBalance());
            depositBalanceResponse.setCurrency(Currency.get(depositBalanceResponseBean.getCurrency()));
        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponseBean.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                depositBalanceResponse.setSessionExpired(true);
                depositBalanceResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositBalanceResponse.setError(true);
                depositBalanceResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                depositBalanceResponse.setError(true);
                depositBalanceResponse.setErrorMessage("امکان دسترسی به این سپرده وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositBalanceResponse.setError(yaghutExceptionResponse.isError());
                depositBalanceResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getDepositBalance", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositBalanceRequestBean))
                    .output(e.toString())
                    .build());
        }

        return depositBalanceResponse;
    }

    @Override
    public DepositBalanceResponse getLegalDepositBalance(DepositBalanceRequest depositBalanceRequest) {

        DecryptResponse userNameDecryptResponse = EncryptionService.decrypt(depositBalanceRequest.getUserName());
        DecryptResponse passDecryptResponse = EncryptionService.decrypt(depositBalanceRequest.getPassword());

        String userName;
        String pass;

        if (!userNameDecryptResponse.isError() && !passDecryptResponse.isError()) {
            userName = userNameDecryptResponse.getDecryptedData();
            pass = passDecryptResponse.getDecryptedData();
        } else {
            throw new CustomRuntimeException("errorInDecryptData");
        }

        DepositBalanceResponse depositBalanceResponse = new DepositBalanceResponse();
        DepositBalanceResponseBean depositBalanceResponseBean;
        LoginResponseBean loginResponseBean = yaghutUserService.loginByChannelUser(userName, pass);
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        DepositBalanceRequestBean depositBalanceRequestBean = new DepositBalanceRequestBean();
        depositBalanceRequestBean.setDepositNumber(depositBalanceRequest.getDepositNumber());

        if (loginResponseBean.getCif() == null) {
            depositBalanceRequestBean.setCif(depositBalanceRequest.getCif());
        }

        try {
            depositBalanceResponseBean = yaghutDepositProxy.getDepositBalance(context, depositBalanceRequestBean);
            depositBalanceResponse.setError(false);
            depositBalanceResponse.setBalance(depositBalanceResponseBean.getBalance().getPrice());
            depositBalanceResponse.setAvailableBalance(depositBalanceResponseBean.getBalance().getAvailablePrice());
            depositBalanceResponse.setBlockedBalance(depositBalanceResponseBean.getBlockedBalance());
            depositBalanceResponse.setCurrency(Currency.get(depositBalanceResponseBean.getCurrency()));
        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponseBean.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                depositBalanceResponse.setSessionExpired(true);
                depositBalanceResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositBalanceResponse.setError(true);
                depositBalanceResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                depositBalanceResponse.setError(true);
                depositBalanceResponse.setErrorMessage("امکان دسترسی به این سپرده وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositBalanceResponse.setError(yaghutExceptionResponse.isError());
                depositBalanceResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getDepositBalance", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositBalanceRequestBean))
                    .output(e.toString())
                    .build());
        }

        return depositBalanceResponse;
    }

    @Override
    public StatementsResponse getStatements(StatementsRequest statementsRequest) {

        StatementsResponse statementsResponse = new StatementsResponse();
        StatementResponseBean statementResponseBean;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(statementsRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);

        StatementSearchRequestBean statementSearchRequest = new StatementSearchRequestBean();
        statementSearchRequest.setDepositNumber(statementsRequest.getDepositNumber());

        if (statementsRequest.getAction() != null) {
            statementSearchRequest.setAction(statementsRequest.getAction().name().equals(ActionType._CREDIT) ? ActionType.CREDIT : ActionType.DEBIT);
        }
        if (statementsRequest.getFromDate() != null && statementsRequest.getToDate() != null) {

            Long yearInterval = ChronoUnit.DAYS.between(statementsRequest.getFromDate(), statementsRequest.getToDate());

            if (yearInterval <= 365) {
                Calendar from = YaghutUtil.localDateTimeToCalender(statementsRequest.getFromDate());
                from.set(Calendar.HOUR_OF_DAY, 0);
                from.set(Calendar.MINUTE, 0);
                statementSearchRequest.setFromDate(from);
                Calendar to = YaghutUtil.localDateTimeToCalender(statementsRequest.getToDate());
                to.set(Calendar.HOUR_OF_DAY, 23);
                to.set(Calendar.MINUTE, 59);
                to.set(Calendar.SECOND, 59);
                statementSearchRequest.setToDate(to);
            }

        }

        statementSearchRequest.setLength(statementsRequest.getLength() != null ? statementsRequest.getLength() : 100l);
        statementSearchRequest.setOffset(statementsRequest.getOffset() != null ? statementsRequest.getOffset() : 0l);

        try {
            statementResponseBean = yaghutDepositProxy.getStatement(context, statementSearchRequest);

            List<StatementDto> statements = new ArrayList<>();
            if (statementResponseBean.getStatementBeans() != null) {

                for (int i = 0; i < statementResponseBean.getStatementBeans().length; i++) {

                    StatementBean statementBean = statementResponseBean.getStatementBeans(i);
                    statements.add(YaghutMapper.mapToStatementDto(statementBean));

                }
            }


            statementsResponse.setStatements(statements);
            statementsResponse.setError(false);
            statementsResponse.setCount(statements.size());

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                statementsResponse.setSessionExpired(true);
                statementsResponse.setError(true);

            } else if (e.toString().equals("InvalidDepositWSException")) {
                statementsResponse.setError(true);
                statementsResponse.setErrorMessage(YaghutCommonErrorMessage.INVALID_DEPOSIT_NUMBER);
            } else if (e.toString().equals("PermissionWSException")) {
                statementsResponse.setError(true);
                statementsResponse.setErrorMessage("امکان دسترسی به این سرویس را ندارید");
            } else if (e.toString().equals("ValidatorWSException")) {
                statementsResponse.setError(true);
                statementsResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                statementsResponse.setError(yaghutExceptionResponse.isError());
                statementsResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getStatement", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(statementSearchRequest))
                    .output(e.toString())
                    .build());
        }
        return statementsResponse;
    }

    @Override
    public IbanConvertorDto depositNumberToIban(IbanConvertorDto ibanConvertorDto) {

        IbanConvertorDto ibanConvertorResponse = new IbanConvertorDto();
        DepositNumberToIbanRequestBean depositNumberToIbanRequestBean = new DepositNumberToIbanRequestBean();
        depositNumberToIbanRequestBean.setDepositNumber(ibanConvertorDto.getDepositNumber());

        try {
            String iban = yaghutDepositProxy.depositNumberToIban(depositNumberToIbanRequestBean);
            ibanConvertorResponse.setIban(iban);
            ibanConvertorResponse.setDepositNumber(ibanConvertorDto.getDepositNumber());
            ibanConvertorResponse.setError(false);
        } catch (RemoteException e) {
            if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                ibanConvertorResponse.setError(true);
                ibanConvertorResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                ibanConvertorResponse.setError(true);
                ibanConvertorResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                ibanConvertorResponse.setError(yaghutExceptionResponse.isError());
                ibanConvertorResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "depositNumberToIban", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositNumberToIbanRequestBean))
                    .output(e.toString())
                    .build());
        }
        return ibanConvertorResponse;
    }

    @Override
    public IbanConvertorDto ibanToDepositNumber(IbanConvertorDto ibanConvertorRequest) {

        IbanConvertorDto ibanConvertorResponse = new IbanConvertorDto();
        IbanToDepositRequestBean ibanToDepositRequestBean = new IbanToDepositRequestBean();
        ibanToDepositRequestBean.setIban(ibanConvertorRequest.getIban());

        try {
            String depositNumber = yaghutDepositProxy.ibanToDepositNumber(ibanToDepositRequestBean);
            ibanConvertorResponse.setDepositNumber(depositNumber);
            ibanConvertorResponse.setIban(ibanConvertorRequest.getIban());
            ibanConvertorResponse.setError(false);
        } catch (RemoteException e) {

            if (YaghutCommonException.checkException(e, "InvalidIBANWSException")) {
                ibanConvertorResponse.setError(true);
                ibanConvertorResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                ibanConvertorResponse.setError(true);
                ibanConvertorResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalBankWSException")) {
                ibanConvertorResponse.setError(true);
                ibanConvertorResponse.setErrorMessage("شماره شبا مورد نظر در لیست شماره شباهای بانک وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                ibanConvertorResponse.setError(yaghutExceptionResponse.isError());
                ibanConvertorResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "ibanToDepositNumber", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(ibanToDepositRequestBean))
                    .output(e.toString())
                    .build());

        }
        return ibanConvertorResponse;
    }

    @Override
    public IbanInfoResponse getIbanInfo(IbanInfoRequest ibanInfoRequest) {

        IbanInfoResponse ibanInfoResponse = new IbanInfoResponse();
        IbanInformationBean ibanInformationBean;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(ibanInfoRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        IbanInformationRequestBean ibanInformationRequestBean = new IbanInformationRequestBean();
        ibanInformationRequestBean.setIban(ibanInfoRequest.getIban());
        ibanInformationRequestBean.setAmount(ibanInfoRequest.getAmount());
        ibanInformationRequestBean.setPayId(ibanInfoRequest.getPayId());

        try {
            ibanInformationBean = yaghutDepositProxy.getIbanInfo(context, ibanInformationRequestBean);
            ibanInfoResponse.setBankName(ibanInformationBean.getBankName());
            ibanInfoResponse.setBankCode(ibanInformationBean.getBankCode());
            ibanInfoResponse.setDepositNumber(ibanInformationBean.getTraditionalNumber());

            List<IbanInfoResponse.OwnerInfo> ownerInfos = new ArrayList<>();
            for (int i = 0; i < ibanInformationBean.getOwnersInfo().length; i++) {
                IbanInfoResponse.OwnerInfo ownerInfo = new IbanInfoResponse.OwnerInfo(ibanInformationBean.getOwnersInfo()[i].getFirstName(),
                        ibanInformationBean.getOwnersInfo()[i].getLastName());
                ownerInfos.add(ownerInfo);
            }

            ibanInfoResponse.setOwnersInfo(ownerInfos);


        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                ibanInfoResponse.setSessionExpired(true);
                ibanInfoResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidIBANWSException")) {
                ibanInfoResponse.setError(true);
                ibanInfoResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                ibanInfoResponse.setError(true);
                ibanInfoResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                ibanInfoResponse.setError(yaghutExceptionResponse.isError());
                ibanInfoResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getIbanInfo", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(ibanInformationRequestBean))
                    .output(e.toString())
                    .build());
        }

        return ibanInfoResponse;
    }

    @Override
    public OwnerInquiryResponse inquiryDepositNumber(OwnerInquiryRequest ownerInquiryRequest) {

        OwnerInquiryResponse depositOwnerResponse = new OwnerInquiryResponse();
        CardOwnerResponseBean cardOwnerResponseBean;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(ownerInquiryRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        CardOwnerRequestBean cardOwnerRequestBean = new CardOwnerRequestBean();
        cardOwnerRequestBean.setDepositNumber(ownerInquiryRequest.getDepositNumber());

        try {
            cardOwnerResponseBean = yaghutDepositProxy.inquiryOwner(context, cardOwnerRequestBean);
            depositOwnerResponse.setError(false);
            depositOwnerResponse.setFirstName(cardOwnerResponseBean.getFirstName());
            depositOwnerResponse.setLastName(cardOwnerResponseBean.getLastName());
            depositOwnerResponse.setFullName(depositOwnerResponse.getFirstName() + " " + depositOwnerResponse.getLastName());
            depositOwnerResponse.setReferenceCode(cardOwnerResponseBean.getTwoPhaseReferenceCode());
        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                depositOwnerResponse.setSessionExpired(true);
                depositOwnerResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                depositOwnerResponse.setError(true);
                depositOwnerResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                depositOwnerResponse.setError(true);
                depositOwnerResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "CardIssuerResponsibilityWSException")) {
                depositOwnerResponse.setError(true);
                depositOwnerResponse.setErrorMessage("پاسخی از بانک دریافت نشد لطفا لحظاتی بعد دوباره تلاش نمایید");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositOwnerResponse.setError(yaghutExceptionResponse.isError());
                depositOwnerResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "inquiryDepositNumber", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardOwnerRequestBean))
                    .output(e.toString())
                    .build());
        }

        return depositOwnerResponse;
    }

    @Override
    public OwnerInquiryResponse inquiryIban(OwnerInquiryRequest ownerInquiryRequest) {

        OwnerInquiryResponse ibanOwnerResponse = new OwnerInquiryResponse();
        CardOwnerResponseBean cardOwnerResponseBean;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(ownerInquiryRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        CardOwnerRequestBean cardOwnerRequestBean = new CardOwnerRequestBean();
        cardOwnerRequestBean.setIbanNumber(ownerInquiryRequest.getIban());

        try {
            cardOwnerResponseBean = yaghutDepositProxy.inquiryOwner(context, cardOwnerRequestBean);
            ibanOwnerResponse.setError(false);
            ibanOwnerResponse.setFirstName(cardOwnerResponseBean.getFirstName());
            ibanOwnerResponse.setLastName(cardOwnerResponseBean.getLastName());
            ibanOwnerResponse.setFullName(ibanOwnerResponse.getFirstName() + " " + ibanOwnerResponse.getLastName());
            ibanOwnerResponse.setReferenceCode(cardOwnerResponseBean.getTwoPhaseReferenceCode());
        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                ibanOwnerResponse.setSessionExpired(true);
                ibanOwnerResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                ibanOwnerResponse.setError(true);
                ibanOwnerResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "CardIssuerResponsibilityWSException")) {
                ibanOwnerResponse.setError(true);
                ibanOwnerResponse.setErrorMessage("پاسخی از بانک دریافت نشد لطفا لحظاتی بعد دوباره تلاش نمایید");
            } else if (YaghutCommonException.checkException(e, "InvalidCardIssuerWSException")) {
                ibanOwnerResponse.setError(true);
                ibanOwnerResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                ibanOwnerResponse.setError(yaghutExceptionResponse.isError());
                ibanOwnerResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "inquiryIban", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardOwnerRequestBean))
                    .output(e.toString())
                    .build());
        }

        return ibanOwnerResponse;
    }

    @Override
    public TransactionReasonResponse getAchTransactionReason() {
        TransactionReasonResponse transactionReasonResponseon = new TransactionReasonResponse();
        LoginResponseBean loginResponse = yaghutUserService.getThirdPartySessionId();
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        AchTransactionReasonInfoBean[] achTransactionReasonResponses;
        AchTransactionReasonRequestBean achTransactionReasonRequestBean = new AchTransactionReasonRequestBean();

        try {
            achTransactionReasonResponses = yaghutDepositProxy.achTransactionReasonRequestBean(context, achTransactionReasonRequestBean);
            List<TransactionReason> transactionReasonList = new ArrayList<>();

            if (achTransactionReasonResponses != null) {
                TransactionReason transactionReason;
                for (int i = 0; i < achTransactionReasonResponses.length; i++) {
                    transactionReason = new TransactionReason();
                    transactionReason.setCode(achTransactionReasonResponses[i].getCode());
                    transactionReason.setTitle(achTransactionReasonResponses[i].getDescription());
                    transactionReasonList.add(transactionReason);
                }
                transactionReasonResponseon.setError(false);
                transactionReasonResponseon.setTransactionReasons(transactionReasonList);
                transactionReasonResponseon.setCount(transactionReasonList.size());
            }

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                transactionReasonResponseon.setSessionExpired(true);
                transactionReasonResponseon.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                transactionReasonResponseon.setError(yaghutExceptionResponse.isError());
                transactionReasonResponseon.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getAchTransactionReason", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(achTransactionReasonRequestBean))
                    .output(e.toString())
                    .build());

        }

        return transactionReasonResponseon;
    }

    @Override
    public TransactionReasonResponse getRtgsTransactionReason() {
        TransactionReasonResponse transactionReasonResponseon = new TransactionReasonResponse();
        LoginResponseBean loginResponse = yaghutUserService.getThirdPartySessionId();
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        RtgsTransactionReasonInfoBean[] rtgsTransactionReasonInfoBeans;
        RtgsTransactionReasonRequestBean rtgsTransactionReasonRequestBean = new RtgsTransactionReasonRequestBean();

        try {
            rtgsTransactionReasonInfoBeans = yaghutDepositProxy.rtgsTransactionReasonRequestBean(context, rtgsTransactionReasonRequestBean);
            List<TransactionReason> transactionReasonList = new ArrayList<>();

            if (rtgsTransactionReasonInfoBeans != null) {
                TransactionReason transactionReason;
                for (int i = 0; i < rtgsTransactionReasonInfoBeans.length; i++) {
                    transactionReason = new TransactionReason();
                    transactionReason.setCode(rtgsTransactionReasonInfoBeans[i].getCode());
                    transactionReason.setTitle(rtgsTransactionReasonInfoBeans[i].getDescription());
                    transactionReasonList.add(transactionReason);
                }
                transactionReasonResponseon.setError(false);
                transactionReasonResponseon.setTransactionReasons(transactionReasonList);
                transactionReasonResponseon.setCount(transactionReasonList.size());
            }

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                transactionReasonResponseon.setSessionExpired(true);
                transactionReasonResponseon.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                transactionReasonResponseon.setError(yaghutExceptionResponse.isError());
                transactionReasonResponseon.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getRtgsTransactionReason", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(rtgsTransactionReasonRequestBean))
                    .output(e.toString())
                    .build());

        }

        return transactionReasonResponseon;
    }

    @Override
    public DepositTransferResponse depositTransfer(DepositTransferRequest depositTransferRequest) {

        DepositTransferResponse depositTransferResponse = new DepositTransferResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(depositTransferRequest.getUserId());
        Map<String, String> map = new HashMap<>();
        String trackerId = String.valueOf(RandomUtils.nextLong());
        map.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, map);
        NormalTransferServiceResponseBean normalTransferServiceResponseBean;
        NormalTransferRequestBean normalTransferRequestBean = new NormalTransferRequestBean();

        if (loginResponse.getCif() == null) {
            normalTransferRequestBean.setCif(depositTransferRequest.getCif());

        }
        normalTransferRequestBean.setAmount(depositTransferRequest.getAmount());
        normalTransferRequestBean.setSourceDeposit(depositTransferRequest.getSourceDepositNumber());
        normalTransferRequestBean.setDestinationDeposit(depositTransferRequest.getDestinationDepositNumber());
        normalTransferRequestBean.setSourceComment(depositTransferRequest.getSourceComment());
        normalTransferRequestBean.setDestinationComment(depositTransferRequest.getDestinationComment());
        normalTransferRequestBean.setPayId(depositTransferRequest.getPayId());
        normalTransferRequestBean.setAdditionalDocumentDesc(depositTransferRequest.getAdditionalDocumentDesc());

        try {
            normalTransferServiceResponseBean = yaghutDepositProxy.fundTransfer(context, normalTransferRequestBean);
            depositTransferResponse.setError(false);
            depositTransferResponse.setAmount(depositTransferRequest.getAmount());
            depositTransferResponse.setReferenceId(normalTransferServiceResponseBean.getSerialNumber());
            depositTransferResponse.setReceiverFullName(depositTransferRequest.getReceiverFullName());
            depositTransferResponse.setRrn(YaghutUtil.generateRRN());
            depositTransferResponse.setTrackerId(trackerId);
            depositTransferResponse.setTrackNumber(YaghutUtil.generateTrackerId());
            depositTransferResponse.setTransactionDate(LocalDateTime.now());
            depositTransferResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(depositTransferResponse.getTransactionDate()));
            depositTransferResponse.setDestinationDeposit(depositTransferRequest.getDestinationDepositNumber());
            depositTransferResponse.setSourceDeposit(depositTransferRequest.getSourceDepositNumber());
            depositTransferResponse.setSenderFullName(depositTransferRequest.getSenderFullName());
            depositTransferResponse.setTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
            depositTransferResponse.setDestinationBankName(BankUtil.getBankNameByDepositNumber(depositTransferRequest.getDestinationDepositNumber()));
            depositTransferResponse.setTitle(depositTransferRequest.getTitle());
            depositTransferResponse.setInformation(depositTransferRequest.getInformation());
            depositTransferResponse.setDefaultReceipt(depositTransferResponse.getReceipt());

            if (normalTransferServiceResponseBean.getCommissionResultInfo() != null) {
                depositTransferResponse.setCommissionAmount(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionAmount());
                depositTransferResponse.setCommissionDepositNumber(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionDepositNumber());
                depositTransferResponse.setCommissionCurrency(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionCurrency() != null ?
                        Currency.get(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionCurrency()) : Currency.UNKNOWN);
            }

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                depositTransferResponse.setSessionExpired(true);
                depositTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("ارز سپرده مبدا و مقصد متفاوت است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("دسترسی و امکان برداشت از این سپرده را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("IllegalDestinationDepositStateWSException");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("انجام این تراکنش مالی برای این سپرده مقصد امکان پذیر نیست");
            } else if (YaghutCommonException.checkException(e, "IllegalSourceDepositStateWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("انجام این تراکنش مالی برای این سپرده مبدا امکان پذیر نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerRuntimeWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شماره مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentIdRuntimeWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شناسه پرداخت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PaymentIdIsRequiredWSRuntimeException ")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شناسه پرداخت الزامی می باشد");
            } else if (YaghutCommonException.checkException(e, "IPaymentIdDoesNotAcceptWSRuntimeException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "PaymentIdDoesNotAcceptWSRuntimeException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "IllegalDepositPersonalityTypeWSRuntimeException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("امکان انجام تراکنش برای سپرده های خاص نزد بانک وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositTransferResponse.setError(yaghutExceptionResponse.isError());
                depositTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "depositTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(normalTransferRequestBean))
                    .output(e.toString())
                    .build());

        }

        return depositTransferResponse;
    }

    public DepositTransferResponse depositTransferByThirdParty(DepositTransferRequest depositTransferRequest) {

        DepositTransferResponse depositTransferResponse = new DepositTransferResponse();
        LoginResponseBean loginResponse = yaghutUserService.getThirdPartySessionId();
        Map<String, String> map = new HashMap<>();
        String trackerId = String.valueOf(RandomUtils.nextLong());
        map.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, map);
        NormalTransferServiceResponseBean normalTransferServiceResponseBean;
        NormalTransferRequestBean normalTransferRequestBean = new NormalTransferRequestBean();

        normalTransferRequestBean.setCif(depositTransferRequest.getCif());

        normalTransferRequestBean.setAmount(depositTransferRequest.getAmount());
        normalTransferRequestBean.setSourceDeposit(depositTransferRequest.getSourceDepositNumber());
        normalTransferRequestBean.setDestinationDeposit(depositTransferRequest.getDestinationDepositNumber());
        normalTransferRequestBean.setSourceComment(depositTransferRequest.getSourceComment());
        normalTransferRequestBean.setDestinationComment(depositTransferRequest.getDestinationComment());
        normalTransferRequestBean.setPayId(depositTransferRequest.getPayId());
        normalTransferRequestBean.setAdditionalDocumentDesc(depositTransferRequest.getAdditionalDocumentDesc());

        try {
            normalTransferServiceResponseBean = yaghutDepositProxy.fundTransfer(context, normalTransferRequestBean);
            depositTransferResponse.setError(false);
            depositTransferResponse.setAmount(depositTransferRequest.getAmount());
            depositTransferResponse.setReferenceId(normalTransferServiceResponseBean.getSerialNumber());
            depositTransferResponse.setReceiverFullName(depositTransferRequest.getReceiverFullName());
            depositTransferResponse.setRrn(YaghutUtil.generateRRN());
            depositTransferResponse.setTrackerId(trackerId);
            depositTransferResponse.setTrackNumber(YaghutUtil.generateTrackerId());
            depositTransferResponse.setTransactionDate(LocalDateTime.now());
            depositTransferResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(depositTransferResponse.getTransactionDate()));
            depositTransferResponse.setDestinationDeposit(depositTransferRequest.getDestinationDepositNumber());
            depositTransferResponse.setSourceDeposit(depositTransferRequest.getSourceDepositNumber());
            depositTransferResponse.setSenderFullName(depositTransferRequest.getSenderFullName());
            depositTransferResponse.setTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
            depositTransferResponse.setDestinationBankName(BankUtil.getBankNameByDepositNumber(depositTransferRequest.getDestinationDepositNumber()));
            depositTransferResponse.setTitle(depositTransferRequest.getTitle());
            depositTransferResponse.setInformation(depositTransferRequest.getInformation());
            depositTransferResponse.setDefaultReceipt(depositTransferResponse.getReceipt());

            if (normalTransferServiceResponseBean.getCommissionResultInfo() != null) {
                depositTransferResponse.setCommissionAmount(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionAmount());
                depositTransferResponse.setCommissionDepositNumber(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionDepositNumber());
                depositTransferResponse.setCommissionCurrency(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionCurrency() != null ?
                        Currency.get(normalTransferServiceResponseBean.getCommissionResultInfo().getCommissionCurrency()) : Currency.UNKNOWN);
            }

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                depositTransferResponse.setSessionExpired(true);
                depositTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("ارز سپرده مبدا و مقصد متفاوت است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("دسترسی و امکان برداشت از این سپرده را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("IllegalDestinationDepositStateWSException");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("انجام این تراکنش مالی برای این سپرده مقصد امکان پذیر نیست");
            } else if (YaghutCommonException.checkException(e, "IllegalSourceDepositStateWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("انجام این تراکنش مالی برای این سپرده مبدا امکان پذیر نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerRuntimeWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شماره مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentIdRuntimeWSException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شناسه پرداخت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PaymentIdIsRequiredWSRuntimeException ")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("شناسه پرداخت الزامی می باشد");
            } else if (YaghutCommonException.checkException(e, "IPaymentIdDoesNotAcceptWSRuntimeException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "PaymentIdDoesNotAcceptWSRuntimeException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "IllegalDepositPersonalityTypeWSRuntimeException")) {
                depositTransferResponse.setError(true);
                depositTransferResponse.setErrorMessage("امکان انجام تراکنش برای سپرده های خاص نزد بانک وجود ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositTransferResponse.setError(yaghutExceptionResponse.isError());
                depositTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "depositTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(normalTransferRequestBean))
                    .output(e.toString())
                    .build());

        }

        return depositTransferResponse;
    }


    @Override
    public AchTransferResponse achTransfer(AchTransferRequest achTransferRequest) {

        AchTransferResponse achTransferResponse = new AchTransferResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(achTransferRequest.getUserId());
        Map<String, String> map = new HashMap<>();
        String trackerId = String.valueOf(RandomUtils.nextLong());
        map.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, map);
        NormalAchTransferResultBean normalAchTransferResultBean;
        AchNormalTransferRequestBean achNormalTransferRequestBean = new AchNormalTransferRequestBean();
        achNormalTransferRequestBean.setAmount(achTransferRequest.getAmount());

        if (loginResponse.getCif() == null) {
            achNormalTransferRequestBean.setCif(achTransferRequest.getCif());
        }

        achNormalTransferRequestBean.setSourceDepositNumber(achTransferRequest.getSourceDepositNumber());
        achNormalTransferRequestBean.setIbanNumber(achTransferRequest.getDestinationIbanNumber());
        achNormalTransferRequestBean.setOwnerName(achTransferRequest.getReceiverFullName());
        achNormalTransferRequestBean.setDescription(achTransferRequest.getDescription());
        achNormalTransferRequestBean.setReasonCode(achTransferRequest.getReasonCode());
        achNormalTransferRequestBean.setReasonTitle(achTransferRequest.getReasonTitle());
        try {
            normalAchTransferResultBean = yaghutDepositProxy.achNormalTransfer(context, achNormalTransferRequestBean);
            achTransferResponse.setError(false);
            achTransferResponse.setAchTransferStatus(AchTransferStatus.get(normalAchTransferResultBean.getTransferStatus().getValue()));
            achTransferResponse.setAchTransactionStatus(AchTransactionStatus.get(normalAchTransferResultBean.getTransactionStatus().getValue()));
            achTransferResponse.setAmount(normalAchTransferResultBean.getAmount());
            achTransferResponse.setCurrency(Currency.get(normalAchTransferResultBean.getCurrency()));
            achTransferResponse.setReferenceId(normalAchTransferResultBean.getReferenceId());
            achTransferResponse.setDescription(normalAchTransferResultBean.getDescription());
            achTransferResponse.setTransferDescription(normalAchTransferResultBean.getTransferDescription());
            achTransferResponse.setFactorNumber(normalAchTransferResultBean.getFactorNumber());
            achTransferResponse.setSourceIban(normalAchTransferResultBean.getSourceIbanNumber());
            achTransferResponse.setSourceDepositNumber(achTransferRequest.getSourceDepositNumber());
            achTransferResponse.setSenderFullName(achTransferRequest.getSenderFullName());
            achTransferResponse.setReceiverFullName(normalAchTransferResultBean.getOwnerName());
            achTransferResponse.setDestinationIban(normalAchTransferResultBean.getIbanNumber());
            achTransferResponse.setDestinationBankName(BankUtil.getBankNameByIban(achTransferRequest.getDestinationIbanNumber()));
            achTransferResponse.setRrn(YaghutUtil.generateRRN());
            achTransferResponse.setTrackerId(trackerId);
            achTransferResponse.setTrackNumber(YaghutUtil.generateTrackerId());
            achTransferResponse.setTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
            achTransferResponse.setTransactionDate(LocalDateTime.now());
            achTransferResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(achTransferResponse.getTransactionDate()));
            achTransferResponse.setTitle(achTransferRequest.getTitle());
            achTransferResponse.setInformation(achTransferRequest.getInformation());
            achTransferResponse.setDefaultReceipt(achTransferResponse.getReceipt());

        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {
                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                achTransferResponse.setSessionExpired(true);
                achTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("شماره سپرده مبدا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("دسترسی و امکان برداشت از این سپرده را ندارید");
            } else if (YaghutCommonException.checkException(e, "IllegalSourceDepositStateWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("انجام این تراکنش مالی برای این سپرده مبدا امکان پذیر نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidIBANWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalDestinationBankWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("شماره شبای مقصد در لیست شماره شباهای طرف قرار داد بانک وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "IncorrectCustomerInformationWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("اطلاعات مشتری ناقص است امکان انجام تراکنش وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("ارز مبدا و مقصد تراکنش یکسان نیست");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSRuntimeException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentIdRuntimeWSException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("شناسه پرداخت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PaymentIdIsRequiredWSRuntimeException ")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("شناسه پرداخت الزامی می باشد");
            } else if (YaghutCommonException.checkException(e, "IPaymentIdDoesNotAcceptWSRuntimeException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "IPaymentIdDoesNotAcceptWSRuntimeException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "InvalidReasonCodeWSRuntimeException")) {
                achTransferResponse.setError(true);
                achTransferResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                achTransferResponse.setError(yaghutExceptionResponse.isError());
                achTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "achTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(achNormalTransferRequestBean))
                    .output(e.toString())
                    .build());
        }
        return achTransferResponse;
    }

    @Override
    public RtgsTransferResponse rtgsTransfer(RtgsTransferRequest rtgsTransferRequest) {

        RtgsTransferResponse rtgsTransferResponse = new RtgsTransferResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(rtgsTransferRequest.getUserId());
        Map<String, String> map = new HashMap<>();
        String trackerId = String.valueOf(RandomUtils.nextLong());
        map.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, map);
        NormalRtgsTransferResponseBean normalRtgsTransferResponseBean;
        RtgsNormalTransferRequestBean rtgsNormalTransferRequestBean = new RtgsNormalTransferRequestBean();
        rtgsNormalTransferRequestBean.setAmount(rtgsTransferRequest.getAmount());

        if (loginResponse.getCif() == null) {
            rtgsNormalTransferRequestBean.setCif(rtgsTransferRequest.getCif());
        }

        rtgsNormalTransferRequestBean.setSourceDepositNumber(rtgsTransferRequest.getSourceDepositNumber());
        rtgsNormalTransferRequestBean.setDestinationIbanNumber(rtgsTransferRequest.getDestinationIbanNumber());
        rtgsNormalTransferRequestBean.setReceiverName(rtgsTransferRequest.getReceiverFirstName());
        rtgsNormalTransferRequestBean.setReceiverFamily(rtgsTransferRequest.getReceiverLastName());
        rtgsNormalTransferRequestBean.setDescription(rtgsTransferRequest.getDescription());
        rtgsNormalTransferRequestBean.setReasonCode(rtgsTransferRequest.getReasonCode());
        rtgsNormalTransferRequestBean.setReasonTitle(rtgsTransferRequest.getReasonTitle());

        try {
            normalRtgsTransferResponseBean = yaghutDepositProxy.rtgsNormalTransfer(context, rtgsNormalTransferRequestBean);
            rtgsTransferResponse.setError(false);
            rtgsTransferResponse.setAmount(rtgsTransferRequest.getAmount());
            rtgsTransferResponse.setCurrency(Currency.get(normalRtgsTransferResponseBean.getCurrency()));
            rtgsTransferResponse.setSerialId(normalRtgsTransferResponseBean.getId());
            rtgsTransferResponse.setDescription(rtgsTransferRequest.getDescription());
            rtgsTransferResponse.setTransferDescription(rtgsTransferRequest.getTransferDescription());
            rtgsTransferResponse.setFactorNumber(rtgsTransferRequest.getPayId());
            rtgsTransferResponse.setDestinationIban(rtgsTransferRequest.getDestinationIbanNumber());
            rtgsTransferResponse.setDestinationBankName(BankUtil.getBankNameByIban(rtgsTransferResponse.getDestinationIban()));
            rtgsTransferResponse.setReceiverFirstName(rtgsTransferRequest.getReceiverFirstName());
            rtgsTransferResponse.setReceiverLastName(rtgsTransferRequest.getReceiverLastName());
            rtgsTransferResponse.setReceiverFullName(rtgsTransferResponse.getReceiverFirstName() + " " + rtgsTransferResponse.getReceiverLastName());
            rtgsTransferResponse.setTransactionDate(LocalDateTime.now());
            rtgsTransferResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(rtgsTransferResponse.getTransactionDate()));
            rtgsTransferResponse.setSenderFullName(rtgsTransferRequest.getSenderFullName());
            rtgsTransferResponse.setSourceDepositNumber(rtgsTransferRequest.getSourceDepositNumber());
            rtgsTransferResponse.setTrackerId(trackerId);
            rtgsTransferResponse.setTrackNumber(YaghutUtil.generateTrackerId());
            rtgsTransferResponse.setRrn(YaghutUtil.generateRRN());
            rtgsTransferResponse.setTitle(rtgsTransferRequest.getTitle());
            rtgsTransferResponse.setInformation(rtgsTransferRequest.getInformation());
            rtgsTransferResponse.setTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
            rtgsTransferResponse.setDefaultReceipt(rtgsTransferResponse.getReceipt());

        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {
                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                rtgsTransferResponse.setSessionExpired(true);
                rtgsTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "RtgsPolicyViolatedWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("تراکنش به علت عدم رعایت محدودیت های ساتنا قابل انجام نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("شماره سپرده مبدا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("دسترسی و امکان برداشت از این سپرده را ندارید");
            } else if (YaghutCommonException.checkException(e, "IllegalSourceDepositStateWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("انجام این تراکنش مالی برای این سپرده مبدا امکان پذیر نیست");
            } else if (YaghutCommonException.checkException(e, "InvalidIBANWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("شماره شبا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalDestinationBankWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("شماره شبای مقصد در لیست شماره شباهای طرف قرار داد بانک وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "IncorrectCustomerInformationWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("اطلاعات مشتری ناقص است امکان انجام تراکنش وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("ارز مبدا و مقصد تراکنش یکسان نیست");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentIdRuntimeWSException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("شناسه پرداخت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PaymentIdIsRequiredWSRuntimeException ")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("شناسه پرداخت الزامی می باشد");
            } else if (YaghutCommonException.checkException(e, "IPaymentIdDoesNotAcceptWSRuntimeException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "IPaymentIdDoesNotAcceptWSRuntimeException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage("سپرده مقصد شناسه پرداخت نمی پذیرد");
            } else if (YaghutCommonException.checkException(e, "InvalidReasonCodeWSRuntimeException")) {
                rtgsTransferResponse.setError(true);
                rtgsTransferResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                rtgsTransferResponse.setError(yaghutExceptionResponse.isError());
                rtgsTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "rtgsTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(rtgsNormalTransferRequestBean))
                    .output(e.toString())
                    .build());

        }

        return rtgsTransferResponse;
    }

    @Override
    public CartableRtgsTransferResponse cartableRtgsTransfer(RtgsTransferRequest rtgsTransferRequest) {

        CartableRtgsTransferResponse cartableRtgsTransferResponse = new CartableRtgsTransferResponse();

        DecryptResponse userNameDecryptResponse = EncryptionService.decrypt(rtgsTransferRequest.getUserName());
        DecryptResponse passDecryptResponse = EncryptionService.decrypt(rtgsTransferRequest.getPassword());

        String userName;
        String pass;

        if (!userNameDecryptResponse.isError() && !passDecryptResponse.isError()) {
            userName = userNameDecryptResponse.getDecryptedData();
            pass = passDecryptResponse.getDecryptedData();
        } else {
            throw new CustomRuntimeException("errorInDecryptData");
        }

        LoginResponseBean loginResponse = yaghutUserService.loginByChannelUser(userName, pass);
        Map<String, String> map = new HashMap<>();
        String trackerId = String.valueOf(RandomUtils.nextLong());
        map.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, map);
        KartablTransferBean kartablTransferBean;
        RtgsNormalTransferRequestBean rtgsNormalTransferRequestBean = new RtgsNormalTransferRequestBean();
        rtgsNormalTransferRequestBean.setAmount(rtgsTransferRequest.getAmount());

        if (loginResponse.getCif() == null) {
            rtgsNormalTransferRequestBean.setCif(rtgsTransferRequest.getCif());
        }

        rtgsNormalTransferRequestBean.setSourceDepositNumber(rtgsTransferRequest.getSourceDepositNumber());
        rtgsNormalTransferRequestBean.setDestinationIbanNumber(rtgsTransferRequest.getDestinationIbanNumber());
        rtgsNormalTransferRequestBean.setReceiverName(rtgsTransferRequest.getReceiverFirstName());
        rtgsNormalTransferRequestBean.setReceiverFamily(rtgsTransferRequest.getReceiverLastName());
        rtgsNormalTransferRequestBean.setDescription(rtgsTransferRequest.getDescription());
        rtgsNormalTransferRequestBean.setReasonCode(rtgsTransferRequest.getReasonCode());
        rtgsNormalTransferRequestBean.setReasonTitle(rtgsTransferRequest.getReasonTitle());

        try {
            kartablTransferBean = yaghutDepositProxy.kartablRtgsNormalTransfer(context, rtgsNormalTransferRequestBean);
            cartableRtgsTransferResponse.setCartableId(kartablTransferBean.getKartablId());

        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {
                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                cartableRtgsTransferResponse.setSessionExpired(true);
                cartableRtgsTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                cartableRtgsTransferResponse.setError(true);
                cartableRtgsTransferResponse.setErrorMessage("سپرده کارتابلی نیست یا شما امکان ثبت کارتابل بر روی سپرده ندارید");
            } else if (YaghutCommonException.checkException(e, "KartablRegistrationWSException")) {
                cartableRtgsTransferResponse.setError(true);
                cartableRtgsTransferResponse.setErrorMessage("به علت تنظیمات محدودیت کارتابل انجام این عملیات امکان پذیر نیست");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cartableRtgsTransferResponse.setError(yaghutExceptionResponse.isError());
                cartableRtgsTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "cartableRtgsTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(rtgsNormalTransferRequestBean))
                    .output(e.toString())
                    .build());

        }

        return cartableRtgsTransferResponse;
    }

    @Override
    public UnlimitedRtgsTransferResponse unlimitedRtgsTransfer(UnlimitedRtgsTransferRequest unlimitedRtgsTransferRequest) {

        UnlimitedRtgsTransferResponse unlimitedRtgsTransferResponse = new UnlimitedRtgsTransferResponse();
        YaghutBpmsService yaghutBpmsService = new YaghutBpmsService();
        unlimitedRtgsTransferRequest.setMethode(unlimitedRtgsTransferRequest.getMethode() != null ?
                unlimitedRtgsTransferRequest.getMethode() : "RTGS_Mediator_SERVICE");
        String processDefinitionId = IntegrationLibConfig.getProperty("RTGS_TRANSFER_PROCESS_DEFINITION_ID");
        ProcessParameterValueBean[] processParameterValueBeans = YaghutMapper.initRtgsProcessParameter(unlimitedRtgsTransferRequest);

        StartProcessResponse startProcessResponse = yaghutBpmsService.startProcessInstance(processDefinitionId, processParameterValueBeans);

        if (startProcessResponse.isSessionExpired()) {
            startProcessResponse = yaghutBpmsService.startProcessInstance(processDefinitionId, processParameterValueBeans);
        }

        if (startProcessResponse.isError()) {
            unlimitedRtgsTransferResponse.setError(true);
            unlimitedRtgsTransferResponse.setErrorMessage(startProcessResponse.getErrorMessage());
        } else {
            StartProcessInstanceResponseBean startProcessInstanceResponseBean = startProcessResponse.getStartProcessInstanceResponseBean();
            unlimitedRtgsTransferResponse.setId(startProcessInstanceResponseBean.getProcess().getId());
            unlimitedRtgsTransferResponse.setTitle(startProcessInstanceResponseBean.getProcess().getTitle());
            unlimitedRtgsTransferResponse.setReferenceNumber(startProcessInstanceResponseBean.getProcess().getReferenceNumber());
        }

        return unlimitedRtgsTransferResponse;
    }

    @Override
    public InstantTransferResponse instantTransfer(InstantTransferRequest instantTransferRequest) {

        InstantTransferResponse instantTransferResponse = new InstantTransferResponse();

        LoginResponseBean loginResponse = yaghutUserService.getSessionId(instantTransferRequest.getUserId());
        Map<String, String> map = new HashMap<>();
        String trackerId = String.valueOf(RandomUtils.nextLong());
        map.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, map);
        InstantInterbankTransferResponseBean instantInterbankTransferResponseBean;
        InstantInterbankTransferRequestBean instantInterbankTransferRequestBean = new InstantInterbankTransferRequestBean();

        if (loginResponse.getCif() == null) {
            instantInterbankTransferRequestBean.setCif(instantTransferRequest.getCif());
        }

        instantInterbankTransferRequestBean.setSourceDeposit(instantTransferRequest.getSourceDepositNumber());
        instantInterbankTransferRequestBean.setAmount(instantTransferRequest.getAmount());
        instantInterbankTransferRequestBean.setDestinationIBAN(instantTransferRequest.getDestinationIbanNumber());
        instantInterbankTransferRequestBean.setDestinationIbanOwnerName(instantTransferRequest.getReceiverFullName());
        instantInterbankTransferRequestBean.setReasonCode(instantTransferRequest.getReasonCode());
        instantInterbankTransferRequestBean.setReasonTitle(instantTransferRequest.getReasonTitle());
        instantInterbankTransferRequestBean.setSourceDescription(instantTransferRequest.getDestinationComment());

        try {
            instantInterbankTransferResponseBean = yaghutDepositProxy.instantTransfer(context, instantInterbankTransferRequestBean);
            instantTransferResponse.setError(false);
            instantTransferResponse.setAmount(instantInterbankTransferResponseBean.getAmountBean().getValue());
            instantTransferResponse.setTrackNumber(instantInterbankTransferResponseBean.getTraceNumber());
            instantTransferResponse.setTrackerId(trackerId);
            instantTransferResponse.setRrn(YaghutUtil.generateRRN());
            instantTransferResponse.setSourceDepositNumber(instantInterbankTransferResponseBean.getSourceDeposit());
            instantTransferResponse.setSenderFullName(instantTransferRequest.getSenderFullName());
            instantTransferResponse.setReceiverFullName(instantInterbankTransferResponseBean.getDestinationIbanOwnerName());
            instantTransferResponse.setDestinationIban(instantInterbankTransferResponseBean.getDestinationIBAN());
            if (instantInterbankTransferResponseBean.getDestinationBank() != null) {
                instantTransferResponse.setDestinationBankName(instantInterbankTransferResponseBean.getDestinationBank().getName());
                instantTransferResponse.setDestinationBankCode(instantInterbankTransferResponseBean.getDestinationBank().getCode());
            } else {
                instantTransferResponse.setDestinationBankName(BankUtil.getBankNameByIban(instantTransferResponse.getDestinationIban()));
                instantTransferResponse.setDestinationBankCode("");
            }
            instantTransferResponse.setTransactionDate(LocalDateTime.now());
            instantTransferResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(instantTransferResponse.getTransactionDate()));
            instantTransferResponse.setTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
            if (instantInterbankTransferResponseBean.getCommissionResultInfoDto() != null) {
                instantTransferResponse.setCommissionAmount(instantInterbankTransferResponseBean.getCommissionResultInfoDto().getCommissionAmount());
                instantTransferResponse.setCommissionDepositNumber(instantInterbankTransferResponseBean.getCommissionResultInfoDto().getCommissionDepositNumber());
                instantTransferResponse.setCommissionCurrency(instantInterbankTransferResponseBean.getCommissionResultInfoDto().getCommissionCurrency() != null ?
                        Currency.get(instantInterbankTransferResponseBean.getCommissionResultInfoDto().getCommissionCurrency()) : Currency.UNKNOWN);
            }
            instantTransferResponse.setTitle(instantTransferRequest.getTitle());
            instantTransferResponse.setInformation(instantTransferRequest.getInformation());
            instantTransferResponse.setDefaultReceipt(instantTransferResponse.getReceipt());

        } catch (RemoteException e) {
            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {

                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                instantTransferResponse.setSessionExpired(true);
                instantTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "IllegalDestinationBankWSException ")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("بانک مقصد نامتعبر می باشد");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException ")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException ")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalSourceDepositStateWSException ")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("وضعیت سپرده برای انجام تراکنش نامتعبر می باشد");
            } else if (YaghutCommonException.checkException(e, "IllegalBankWSException ")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("بانک مبدا نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalDestinationIBANWSException ")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("شبای مقصد متعلق به بانک مبدا است امکان این تراکنش در این نوع انتقال وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "WithdrawalIdDoesNotAcceptWSException ")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("امکان برداشت از سپرده برای مشتری وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                instantTransferResponse.setError(true);
                instantTransferResponse.setErrorMessage("اجازه دسترسی به این سپرده برای این مشتری وجود ندارد. مشتری با سپرده رابطه ای ندارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                instantTransferResponse.setError(yaghutExceptionResponse.isError());
                instantTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "instantTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(instantInterbankTransferRequestBean))
                    .output(e.toString())
                    .build());

        }

        return instantTransferResponse;
    }

    @Override
    public GenerateSecurityTicketResponse generateSecurityTicket(GenerateSecurityTicketRequest generateSecurityTicketRequest) {

        GenerateSecurityTicketResponse generateSecurityTicketResponse = new GenerateSecurityTicketResponse();

        LoginResponseBean loginResponse = yaghutUserService.getSessionId(generateSecurityTicketRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        GenerateTicketResponseBean generateTicketResponseBean;
        GenerateTicketRequestBean generateTicketRequestBean = new GenerateTicketRequestBean();

        try {
            generateTicketResponseBean = yaghutDepositProxy.generateTicket(context, generateTicketRequestBean);
        } catch (RemoteException e) {

            if (YaghutCommonException.checkInvalidSessionException(e.toString())) {
                if (loginResponse.getCif() != null) {
                    String userInitiator = CommonUtil.getInitiatorFromContext();
                    String platformUserId = userInitiator.replace("BR-", "");
                    if (YaghutUserService.CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
                        YaghutUserService.CHANNEL_USER_SESSIONS.remove(platformUserId);
                    }
                } else {
                    YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = true;
                }

                generateSecurityTicketResponse.setSessionExpired(true);
                generateSecurityTicketResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                generateSecurityTicketResponse.setError(yaghutExceptionResponse.isError());
                generateSecurityTicketResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "generateSecurityTicket", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(generateTicketRequestBean))
                    .output(e.toString())
                    .build());

        }

        return generateSecurityTicketResponse;
    }

    @Override
    public GetDepositAverageResponse getDepositsAverage(GetDepositAverageRequest getDepositAverageRequest) {

        GetDepositAverageResponse getDepositAverageResponse = new GetDepositAverageResponse();

        // mock
        getDepositAverageResponse.setAverage(new BigDecimal(RandomUtils.nextInt(8)));
        getDepositAverageResponse.setFrom(getDepositAverageRequest.getFrom());
        getDepositAverageResponse.setTo(getDepositAverageRequest.getTo());
        getDepositAverageResponse.setPersianFromDate(CommonUtil.convertToPersianDate(getDepositAverageResponse.getFrom()));
        getDepositAverageResponse.setPersianToDate(CommonUtil.convertToPersianDate(getDepositAverageResponse.getTo()));

        return getDepositAverageResponse;

    }

}

