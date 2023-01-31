package com.rahand.sina.integration.provider.yaghut.service.card;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.enums.PaymentTransactionStatus;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.DynamicPinProcessDetailParameter;
import com.rahand.sina.integration.domain.bank.enums.DynamicPinProcessType;
import com.rahand.sina.integration.domain.bank.service.spec.Card;
import com.rahand.sina.integration.domain.bank.util.BankUtil;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutMapper;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class YaghutCardService implements Card {

    private YaghutUserService yaghutUserService;
    private YaghutCardProxy yaghutCardProxy;

    public YaghutCardService() {
        yaghutUserService = YaghutUserService.getInstance();
        yaghutCardProxy = new YaghutCardProxy();
    }

    @Override
    public LoginCardResponse loginChannelByCard(LoginCardRequest loginCardRequest) {

        LoginCardResponse loginCardResponse = new LoginCardResponse();
        LoginResponseBean loginResponseBean;
        LoginSwitchCardRequestBean loginSwitchCardRequestBean = new LoginSwitchCardRequestBean();
        CardAuthorizeParamsBean cardAuthorizeParamsBean = new CardAuthorizeParamsBean();
        cardAuthorizeParamsBean.setPinType(PinType.EPAY);
        cardAuthorizeParamsBean.setPin(loginCardRequest.getPin());
        cardAuthorizeParamsBean.setCvv2(loginCardRequest.getCvv2());
        cardAuthorizeParamsBean.setExpDate(loginCardRequest.getExpireDate());
        loginSwitchCardRequestBean.setCardAuthorizeParamsBean(cardAuthorizeParamsBean);
        loginSwitchCardRequestBean.setPan(loginCardRequest.getPan());

        try {
            loginResponseBean = yaghutCardProxy.loginByCardInfo(loginSwitchCardRequestBean);
            loginCardResponse.setFailedLogin(false);
            loginCardResponse.setNationalCode(loginResponseBean.getCode());
        } catch (RemoteException e) {
            if (YaghutCommonException.checkException(e, "InvalidCredentialsWSException")) {
                loginCardResponse.setError(true);
                loginCardResponse.setErrorMessage("اطلاعات کارت اشتباه است");
                loginCardResponse.setFailedLogin(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                loginCardResponse.setError(yaghutExceptionResponse.isError());
                loginCardResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
                loginCardResponse.setFailedLogin(true);
            }

            CommonUtil.logError(getClass().getSimpleName(), "loginChannelByCard", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(loginSwitchCardRequestBean))
                    .output(e.toString())
                    .build());
        }
        return loginCardResponse;

    }

    @Override
    public IssueCardResponse issueCard(IssueCardRequest issueCardRequest) {

        IssueCardResponse issueCardResponse = new IssueCardResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getThirdPartySessionId();
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        IssueDebitCardResponseBean issueDebitCardResponseBean;
        IssueDebitCardRequestBean issueDebitCardRequestBean = new IssueDebitCardRequestBean();
        issueDebitCardRequestBean.setCif(issueCardRequest.getCif());
        issueDebitCardRequestBean.setDepositNumber(issueCardRequest.getDepositNumber());
        issueDebitCardRequestBean.setTemplateId(issueCardRequest.getTemplateId());
        try {
            issueDebitCardResponseBean = yaghutCardProxy.issueCard(context, issueDebitCardRequestBean);
            issueCardResponse.setError(false);
            issueCardResponse.setCustomerName(issueDebitCardResponseBean.getCustomerName());
            issueCardResponse.setPan(issueDebitCardResponseBean.getPan());
            issueCardResponse.setExpireDate(YaghutUtil.CalenderToLocalDateTime(issueDebitCardResponseBean.getExpireDate()));
            issueCardResponse.setPersianExpireDate(CommonUtil.convertToPersianDate(issueCardResponse.getExpireDate()));
            issueCardResponse.setCvv2(issueDebitCardResponseBean.getCvv2());
            issueCardResponse.setTrack1(issueDebitCardResponseBean.getTrack1());
            issueCardResponse.setTrack2(issueDebitCardResponseBean.getTrack2());
            issueCardResponse.setTrack3(issueDebitCardResponseBean.getTrack3());

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
                issueCardResponse.setSessionExpired(true);
                issueCardResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {

                issueCardResponse.setError(true);
                issueCardResponse.setErrorMessage("سپرده نامعتبر است");

            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                issueCardResponse.setError(true);
                issueCardResponse.setErrorMessage("شماره مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                issueCardResponse.setError(true);
                issueCardResponse.setErrorMessage("به دلیل تامرتبط بودن شماره مشتری و شماره سپرده امکان صدور کارت وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "DepositIssueCardWSException")) {
                issueCardResponse.setError(true);
                issueCardResponse.setErrorMessage("امکان صدور کارت برای این سپرده وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "DepositMultipleCardsWSException")) {
                issueCardResponse.setError(true);
                issueCardResponse.setErrorMessage("سپرده کارت فعال دارد. امکان وجود همزمان چند کارت فعال برای این سپرده وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidCardTemplateWSException")) {
                issueCardResponse.setError(true);
                issueCardResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                issueCardResponse.setError(true);
                issueCardResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                issueCardResponse.setError(yaghutExceptionResponse.isError());
                issueCardResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "issueCard", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(issueDebitCardRequestBean))
                    .output(e.toString())
                    .build());
        }

        return issueCardResponse;
    }

    @Override
    public IssueSpecialCardResponse issueSpecialCard(IssueSpecialCardRequest issueSpecialCardRequest) {

        IssueSpecialCardResponse issueSpecialCardResponse = new IssueSpecialCardResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getThirdPartySessionId();
        Map<String, String> map = new HashMap<>();
        String trackerId = String.valueOf(UUID.randomUUID());
        map.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponseBean, map);
        IssueSpecialCardResponseBean issueSpecialCardResponseBean;
        IssueSpecialCardRequestBean issueSpecialCardRequestBean = new IssueSpecialCardRequestBean();
        issueSpecialCardRequestBean.setSpecialCardType(SpecialCardType.fromValue(issueSpecialCardRequest.getSpecialCardType().getName()));
        issueSpecialCardRequestBean.setCardTemplateId(issueSpecialCardRequest.getTemplateId());
        issueSpecialCardRequestBean.setCif(issueSpecialCardRequest.getIssuerCif());

        if (issueSpecialCardRequest.getHolderCif() != null) {
            issueSpecialCardRequestBean.setHolderCif(issueSpecialCardRequest.getHolderCif());
        }

        issueSpecialCardRequestBean.setHolderName(issueSpecialCardRequest.getHolderName());
        issueSpecialCardRequestBean.setAmount(issueSpecialCardRequest.getAmount());

        try {
            issueSpecialCardResponseBean = yaghutCardProxy.issueSpecialCard(context, issueSpecialCardRequestBean);
            issueSpecialCardResponse.setHolderName(issueSpecialCardResponseBean.getHolderName());
            issueSpecialCardResponse.setPan(issueSpecialCardResponseBean.getPan());
            issueSpecialCardResponse.setCvv2(issueSpecialCardResponseBean.getCvv2());
            issueSpecialCardResponse.setExpirationDate(YaghutUtil.CalenderToLocalDateTime(issueSpecialCardResponseBean.getExpirationDate()));
            issueSpecialCardResponse.setPersianExpireDate(CommonUtil.convertToPersianDate(issueSpecialCardResponse.getExpirationDate()));
            issueSpecialCardResponse.setShortExpirationDate(issueSpecialCardResponse.getPersianExpireDate()
                    .replaceAll("/", "").substring(0, 4));
            issueSpecialCardResponse.setTrack1(issueSpecialCardResponseBean.getTrack1());
            issueSpecialCardResponse.setTrack2(issueSpecialCardResponseBean.getTrack2());
            issueSpecialCardResponse.setTrack3(issueSpecialCardResponseBean.getTrack3());

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
                issueSpecialCardResponse.setSessionExpired(true);
                issueSpecialCardResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidAmountWSException")) {
                issueSpecialCardResponse.setError(true);
                issueSpecialCardResponse.setErrorMessage("مبلغ کارت هدیه معتبر نیست");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                issueSpecialCardResponse.setError(true);
                issueSpecialCardResponse.setErrorMessage("دسترسی درخواست و صدور کارت را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                issueSpecialCardResponse.setError(true);
                issueSpecialCardResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "InvalidCardTemplateWSException")) {
                issueSpecialCardResponse.setError(true);
                issueSpecialCardResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "InvalidCardTemplateWSException")) {
                issueSpecialCardResponse.setError(true);
                issueSpecialCardResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                issueSpecialCardResponse.setError(true);
                issueSpecialCardResponse.setErrorMessage("دسترسی درخواست و صدور کارت را ندارید");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                issueSpecialCardResponse.setError(true);
                issueSpecialCardResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                issueSpecialCardResponse.setError(yaghutExceptionResponse.isError());
                issueSpecialCardResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "issueSpecialCard", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(issueSpecialCardRequestBean))
                    .output(e.toString())
                    .build());

        }
        return issueSpecialCardResponse;
    }

    @Override
    public ChargeSpecialCardResponse chargeSpecialCard(ChargeSpecialCardRequest chargeSpecialCardRequest) {

        ChargeSpecialCardResponse chargeSpecialCardResponse = new ChargeSpecialCardResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getThirdPartySessionId();
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        ChargeCardResponseBean[] chargeCardResponseBean;
        ChargeCardRequestBean chargeCardRequestBean = new ChargeCardRequestBean();
        chargeCardRequestBean.setCif(chargeSpecialCardRequest.getCif());
        chargeCardRequestBean.setDepositNumber(chargeSpecialCardRequest.getDepositNumber());

        ChargeCardBean[] chargeCardBeans = new ChargeCardBean[chargeSpecialCardRequest.getSpecialCards().size()];

        for (int i = 0; i < chargeSpecialCardRequest.getSpecialCards().size(); i++) {
            ChargeSpecialCardRequest.SpecialCardInfo specialCardInfo = chargeSpecialCardRequest.getSpecialCards().get(i);
            ChargeCardBean chargeCardBean = new ChargeCardBean();
            chargeCardBean.setCardPan(specialCardInfo.getPan());
            chargeCardBean.setAmount(specialCardInfo.getAmount());
            chargeCardBeans[i] = chargeCardBean;
        }

        chargeCardRequestBean.setChargeCards(chargeCardBeans);

        try {
            chargeCardResponseBean = yaghutCardProxy.chargeCard(context, chargeCardRequestBean);
            boolean isCharged = chargeCardResponseBean[0].isDoneCompletely();
            if (isCharged) {
                chargeSpecialCardResponse.setCharged(true);
            } else {
                chargeSpecialCardResponse.setError(true);
                chargeSpecialCardResponse.setCharged(false);
                if (chargeCardResponseBean[0].getErrorType().getValue().equals("InsufficientFundsException")) {
                    chargeSpecialCardResponse.setErrorMessage("موجودی سپرده کافی نمی باشد");
                } else if (chargeCardResponseBean[0].getErrorType().getValue().equals("InvalidCardStatusException")) {
                    chargeSpecialCardResponse.setErrorMessage("کارت مورد نظر قابل شارژ نمی باشد یا تعداد دفعات شارژ کارت از حد مجاز گذشته است");
                } else if (chargeCardResponseBean[0].getErrorType().getValue().equals("InvalidDepositException")) {
                    chargeSpecialCardResponse.setErrorMessage("شماره سپرده نامعتبر است");
                } else if (chargeCardResponseBean[0].getErrorType().getValue().equals("AmountCostraintException")) {
                    chargeSpecialCardResponse.setErrorMessage("مبلغ شارژ کارت نامعتبر است");
                } else if (chargeCardResponseBean[0].getErrorType().getValue().equals("InvalidCardException")) {
                    chargeSpecialCardResponse.setErrorMessage("کارت نامعتبر است");
                } else if (chargeCardResponseBean[0].getErrorType().getValue().equals("PermissionException")) {
                    chargeSpecialCardResponse.setErrorMessage("دسترسی انجام این عملیات را ندارید");
                } else {
                    chargeSpecialCardResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
                }

                CommonUtil.logError(getClass().getSimpleName(), "chargeSpecialCard", chargeCardResponseBean[0].getErrorType().getValue(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(chargeSpecialCardRequest))
                        .output(chargeCardResponseBean[0].getErrorType().getValue())
                        .build());
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
                chargeSpecialCardResponse.setSessionExpired(true);
                chargeSpecialCardResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                chargeSpecialCardResponse.setError(true);
                chargeSpecialCardResponse.setErrorMessage("دسترسی انجام این عملیات را ندارید");
            }

            CommonUtil.logError(getClass().getSimpleName(), "chargeSpecialCard", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(chargeSpecialCardRequest))
                    .output(e.toString())
                    .build());
        }

        return chargeSpecialCardResponse;
    }

    @Override
    public GenerateCardPinResponse generateCardPin(GenerateCardPinRequest generateCardPinRequest) {

        GenerateCardPinResponse generateCardPinResponse = new GenerateCardPinResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(generateCardPinRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        CardPinResponseBean cardPinResponseBean;
        CardPinRequestBean cardPinRequestBean = new CardPinRequestBean();

        if (generateCardPinRequest.getCardPinType().getName().equals(PinType._CARD)) {
            cardPinRequestBean.setPinType(PinType.CARD);

        } else if (generateCardPinRequest.getCardPinType().getName().equals(PinType._EPAY)) {
            cardPinRequestBean.setPinType(PinType.EPAY);

        }

        cardPinRequestBean.setPan(generateCardPinRequest.getPan());

        try {
            cardPinResponseBean = yaghutCardProxy.generateCardPin(context, cardPinRequestBean);
            generateCardPinResponse.setPin(cardPinResponseBean.getPin());
            generateCardPinResponse.setCvv2(cardPinResponseBean.getCvv2());
            generateCardPinResponse.setCardOwnerName(cardPinResponseBean.getOwnerName());
            generateCardPinResponse.setError(false);
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
                generateCardPinResponse.setSessionExpired(true);
                generateCardPinResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                generateCardPinResponse.setError(true);
                generateCardPinResponse.setErrorMessage("شماره کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCardStatusWSException")) {
                generateCardPinResponse.setError(true);
                generateCardPinResponse.setErrorMessage("وضعیت کارت معتبر نیست");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                generateCardPinResponse.setError(true);
                generateCardPinResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                generateCardPinResponse.setError(yaghutExceptionResponse.isError());
                generateCardPinResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "generateCardPin", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardPinRequestBean))
                    .output(e.toString())
                    .build());
        }

        return generateCardPinResponse;
    }

    @Override
    public DynamicPinResponse generateDynamicPin(DynamicPinRequest dynamicPinRequest) {
        //todo ....
        DynamicPinResponse dynamicPinResponse = new DynamicPinResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(dynamicPinRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        HarimOtpResponseBean harimOtpResponseBean;
        HarimOtpRequestBean harimOtpRequestBean = new HarimOtpRequestBean();
        CardInfoBean cardInfoBean = new CardInfoBean();
        cardInfoBean.setPan(dynamicPinRequest.getPan());
        cardInfoBean.setCvv2(dynamicPinRequest.getCvv2());
        harimOtpRequestBean.setCardInfoBean(cardInfoBean);

        if (dynamicPinRequest.getAmount().longValue() > 0) {
            harimOtpRequestBean.setAmount(dynamicPinRequest.getAmount());
        }

        harimOtpRequestBean.setProcessType(ProcessTypeBean.fromString(dynamicPinRequest.getDynamicPinProcessType().getName()));

        ProcessDetailBean processDetailBean = new ProcessDetailBean();

        String query = "SELECT  max(key_),max(a.TEXT_) FROM CMAB6ACT_HI_PROCINST b , CMAB6ACT_RE_PROCDEF c , CMAB6ACT_HI_VARINST a\n" +
                "WHERE b.PROC_DEF_ID_  = c.ID_  AND b.PROC_INST_ID_  = a.PROC_INST_ID_  AND b.PROC_INST_ID_  = ? \n" +
                "AND CASE KEY_ WHEN cast('Process_contact_BuyCharge' AS nvarchar2(100) ) THEN cast('Mobile' AS nvarchar2(100) ) \n" +
                "\tWHEN cast('Process_pay_sina_BuyCharge' AS nvarchar2(100) ) THEN cast('Mobile' AS nvarchar2(100) ) \n" +
                "\tWHEN cast('Process_pay_sina_BillPayment' AS nvarchar2(100) ) THEN cast('billOrgType' AS nvarchar2(100) ) \n" +
                "\tWHEN cast('Process_bank_card_sina_CardTransfer' AS nvarchar2(100) ) THEN cast('DestinationPan' AS nvarchar2(100) ) \n" +
                "\tWHEN cast('Process_sina_SinaCif_Singletone_CustomerAuth' AS nvarchar2(100) ) THEN cast('ProcessDynamicPinType' AS nvarchar2(100) ) \n" +
                "\tWHEN cast('Process_bank_card_sina_CardToDepositTransfer' AS nvarchar2(100) ) THEN cast('DestinationDeposit' AS nvarchar2(100) ) \n" +
                "\tWHEN cast('Process_bank_deposit_sina_Transfer' AS nvarchar2(100) ) THEN cast('DestinationForPin' AS nvarchar2(100) ) \n" +
                "END = a.NAME_";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {
            preparedStatement.setString(1, dynamicPinRequest.getInstanceId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String processKey = resultSet.getString(1);
                String parameter = resultSet.getString(2);
                if (processKey != null) {

                    if (processKey.equals("Process_sina_SinaCif_Singletone_CustomerAuth") && (parameter != null && parameter.equals("PASSWORD_CONFIRM_REQUEST"))) {
                        harimOtpRequestBean.setProcessType(ProcessTypeBean.fromString(DynamicPinProcessType.PASSWORD_CONFIRM_REQUEST.getName()));
                    }

                    switch (processKey) {
                        case "Process_pay_sina_BuyCharge":
                            processDetailBean.setParameterType(ParameterTypeBean.fromString(DynamicPinProcessDetailParameter.MOBILE.getName()));
                            processDetailBean.setValue(resultSet.getString(2));
                            break;
                        case "Process_contact_BuyCharge":
                            processDetailBean.setParameterType(ParameterTypeBean.fromString(DynamicPinProcessDetailParameter.MOBILE.getName()));
                            processDetailBean.setValue(resultSet.getString(2));
                            break;
                        case "Process_bank_card_sina_CardTransfer":
                            processDetailBean.setParameterType(ParameterTypeBean.fromString(DynamicPinProcessDetailParameter.PAN.getName()));
                            processDetailBean.setValue(resultSet.getString(2));
                            harimOtpRequestBean.setProcessType(ProcessTypeBean.fromString(DynamicPinProcessType.TRANSFER_TO.getName()));
                            break;
                        case "Process_bank_card_sina_CardToDepositTransfer":
                            processDetailBean.setParameterType(ParameterTypeBean.fromString(DynamicPinProcessDetailParameter.DEPOSIT_NUMBER.getName()));
                            processDetailBean.setValue(resultSet.getString(2));
                            harimOtpRequestBean.setProcessType(ProcessTypeBean.fromString(DynamicPinProcessType.TRANSFER_TO.getName()));
                            break;
                        case "Process_bank_deposit_sina_Transfer":
                            String[] destinationData = parameter.split("[|]");
                            String type = destinationData[0];
                            String value = destinationData[1];

                            if (type.equals("Card2Deposit")) {
                                processDetailBean.setParameterType(ParameterTypeBean.fromString(DynamicPinProcessDetailParameter.DEPOSIT_NUMBER.getName()));
                                processDetailBean.setValue(value);
                                harimOtpRequestBean.setProcessType(ProcessTypeBean.fromString(DynamicPinProcessType.TRANSFER_TO.getName()));
                            } else if (type.equals("Card2Card")) {
                                processDetailBean.setParameterType(ParameterTypeBean.fromString(DynamicPinProcessDetailParameter.PAN.getName()));
                                processDetailBean.setValue(value);
                                harimOtpRequestBean.setProcessType(ProcessTypeBean.fromString(DynamicPinProcessType.TRANSFER_TO.getName()));
                            }

                            break;
                        case "Process_pay_sina_BillPayment":
                            processDetailBean.setParameterType(ParameterTypeBean.fromString(DynamicPinProcessDetailParameter.TEXT.getName()));
                            processDetailBean.setValue(resultSet.getString(2));
                            break;

                        default:
                            processDetailBean.setParameterType(ParameterTypeBean.PAN);
                            processDetailBean.setValue(dynamicPinRequest.getPan());
                    }
                } else {
                    processDetailBean.setParameterType(ParameterTypeBean.PAN);
                    processDetailBean.setValue(dynamicPinRequest.getPan());
                }

            }

        } catch (SQLException e) {
            dynamicPinResponse.setError(true);
            dynamicPinResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
            CommonUtil.logError(getClass().getSimpleName(), "generateDynamicPin", e.toString());
        }

        if (dynamicPinRequest.getDynamicPinProcessType().equals(DynamicPinProcessType.BALANCE_INQUIRY)) {
            ProcessTypeBean.fromString(DynamicPinProcessType.BALANCE_INQUIRY.getName());
        }

        if (dynamicPinRequest.getDynamicPinProcessType().equals(DynamicPinProcessType.SUMMARY_REQUEST)) {
            ProcessTypeBean.fromString(DynamicPinProcessType.SUMMARY_REQUEST.getName());
        }
        harimOtpRequestBean.setProcessDetail(processDetailBean);

        try {
            harimOtpResponseBean = yaghutCardProxy.requestHarimOtp(context, harimOtpRequestBean);
            dynamicPinResponse.setError(false);
            dynamicPinResponse.setCorrelationId(harimOtpResponseBean.getCorrelationId());
            dynamicPinResponse.setReferenceNumber(String.valueOf(harimOtpResponseBean.getReferenceNumber()));
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
                dynamicPinResponse.setSessionExpired(true);
                dynamicPinResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCardStatusWSException")) {
                dynamicPinResponse.setError(true);
                dynamicPinResponse.setErrorMessage("کارت نامتعبر است");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                dynamicPinResponse.setError(true);
                dynamicPinResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                dynamicPinResponse.setError(yaghutExceptionResponse.isError());
                dynamicPinResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "generateDynamicPin", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(harimOtpRequestBean))
                    .output(e.toString())
                    .build());

        }
        return dynamicPinResponse;
    }

    @Override
    public GetCardsResponse getCards(GetCardsRequest getCardsRequest) {

        GetCardsResponse cardsResponse = new GetCardsResponse();
        CardBean[] cardBeans;
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(getCardsRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        CardsSearchRequestBean cardsSearchRequestBean = new CardsSearchRequestBean();
        cardsSearchRequestBean.setCardStatus(CardStatus.OK);

        if (loginResponseBean.getCif() == null) {
            cardsSearchRequestBean.setCif(getCardsRequest.getCif());
        }
        cardsSearchRequestBean.setDepositNumber(getCardsRequest.getDepositNumber());
        cardsSearchRequestBean.setPan(getCardsRequest.getPan());
        cardsSearchRequestBean.setLength(100l);
        cardsSearchRequestBean.setOffset(0l);
        cardsSearchRequestBean.setFormattedDepositNumber(getCardsRequest.isFormattedDepositNumber());

        try {
            cardBeans = yaghutCardProxy.getCards(context, cardsSearchRequestBean);
            cardsResponse.setError(false);
            List<BankCardDto> cards = new ArrayList<>();

            for (int i = 0; i < cardBeans.length; i++) {
                CardBean cardBean = cardBeans[i];
                BankCardDto bankCardDto = YaghutMapper.mapToBankCardDto(cardBean);
                cards.add(bankCardDto);
            }
            cardsResponse.setCount(cards.size());
            cardsResponse.setCards(cards);

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
                cardsResponse.setSessionExpired(true);
                cardsResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                cardsResponse.setError(true);
                cardsResponse.setErrorMessage("امکان دسترسی به این سرویس وجود ندارد");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                cardsResponse.setError(true);
                cardsResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardsResponse.setError(yaghutExceptionResponse.isError());
                cardsResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCustomerCards", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardsSearchRequestBean))
                    .output(e.toString())
                    .build());
        }
        return cardsResponse;
    }

    @Override
    public OwnerInquiryResponse inquiryCard(OwnerInquiryRequest ownerInquiryRequest) {
        OwnerInquiryResponse cardOwnerResponse = new OwnerInquiryResponse();
        CardOwnerResponseBean cardOwnerResponseBean;
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(ownerInquiryRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        CardOwnerRequestBean cardOwnerRequestBean = new CardOwnerRequestBean();
        cardOwnerRequestBean.setDestinationPan(ownerInquiryRequest.getPan());
        cardOwnerRequestBean.setPan(ownerInquiryRequest.getSourcePan());

        try {
            cardOwnerResponseBean = yaghutCardProxy.inquiryOwner(context, cardOwnerRequestBean);
            cardOwnerResponse.setError(false);
            cardOwnerResponse.setFirstName(cardOwnerResponseBean.getFirstName());
            cardOwnerResponse.setLastName(cardOwnerResponseBean.getLastName());
            cardOwnerResponse.setFullName(cardOwnerResponse.getFirstName() + " " + cardOwnerResponse.getLastName());
            cardOwnerResponse.setReferenceCode(cardOwnerResponseBean.getTwoPhaseReferenceCode());
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
                cardOwnerResponse.setSessionExpired(true);
                cardOwnerResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                cardOwnerResponse.setError(true);
                cardOwnerResponse.setErrorMessage("شماره کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCardIssuerWSException")) {
                cardOwnerResponse.setError(true);
                cardOwnerResponse.setErrorMessage("صادر کننده کارت اشتباه است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                cardOwnerResponse.setError(true);
                cardOwnerResponse.setErrorMessage("شماره کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "CardIssuerResponsibilityWSException")) {
                cardOwnerResponse.setError(true);
                cardOwnerResponse.setErrorMessage("پاسخی از بانک دریافت نشد لطفا لحظاتی بعد دوباره تلاش نمایید");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                cardOwnerResponse.setError(true);
                cardOwnerResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardOwnerResponse.setError(yaghutExceptionResponse.isError());
                cardOwnerResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "inquiryCard", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardOwnerRequestBean))
                    .output(e.toString())
                    .build());
        }

        return cardOwnerResponse;
    }

    @Override
    public CardTransferResponse cardTransfer(CardTransferRequest cardTransferRequest) {

        CardTransferResponse cardTransferResponse = new CardTransferResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(cardTransferRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        FinancialServiceResponseBean financialServiceResponseBean;
        FundTransferRequestBean fundTransferRequestBean = new FundTransferRequestBean();
        fundTransferRequestBean.setDestinationType(DepositOrPanWS.PAN);
        fundTransferRequestBean.setPinType(PinType.EPAY);
        fundTransferRequestBean.setAmount(cardTransferRequest.getAmount());
        fundTransferRequestBean.setPan(cardTransferRequest.getSourcePan());
        fundTransferRequestBean.setCvv2(cardTransferRequest.getCvv2());
        fundTransferRequestBean.setExpDate(cardTransferRequest.getExpireDate());
        fundTransferRequestBean.setPin(cardTransferRequest.getPin());
        fundTransferRequestBean.setDestination(cardTransferRequest.getDestinationPan());

        try {
            financialServiceResponseBean = yaghutCardProxy.cardTransfer(context, fundTransferRequestBean);
            cardTransferResponse.setError(false);
            cardTransferResponse.setAmount(cardTransferRequest.getAmount());
            cardTransferResponse.setRrn(financialServiceResponseBean.getSwitchResponseRRN());
            cardTransferResponse.setTrackNumber(YaghutUtil.generateTrackerId());
            cardTransferResponse.setTrackerId(YaghutUtil.generateTrackerId());
            cardTransferResponse.setTransactionDate(LocalDateTime.now());
            cardTransferResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(cardTransferResponse.getTransactionDate()));
            cardTransferResponse.setPaymentTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
            cardTransferResponse.setSenderFullName(cardTransferRequest.getSenderFullName());
            cardTransferResponse.setSourceCard(cardTransferRequest.getSourcePan());
            cardTransferResponse.setReceiverFullName(cardTransferRequest.getReceiverFullName());
            cardTransferResponse.setDestinationBankName(BankUtil.getBankName(cardTransferRequest.getDestinationPan()));
            cardTransferResponse.setDestinationCard(cardTransferRequest.getDestinationPan());
            cardTransferResponse.setTitle(cardTransferRequest.getTitle());
            cardTransferResponse.setInformation(cardTransferRequest.getInformation());
            cardTransferResponse.setDefaultReceipt(cardTransferResponse.getReceipt());


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
                cardTransferResponse.setSessionExpired(true);
                cardTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCardIssuerWSException")) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage("شماره کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "AuthenticationWSException")) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage("اطلاعات کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "NoSufficientFundWSException")) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage("مبلغ تراکنش بیشتر از سقف برداشت است");
            } else if (YaghutCommonException.checkException(e, "ExceedStaticPinWithdrawalWSException")) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage("مبلغ تراکنش بیشتر از سقف برداشت با رمز دوم ایستا است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "CardIssuerResponsibilityWSException")) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage("پاسخی از صادر کننده بانک دریافت نشد");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                cardTransferResponse.setError(true);
                cardTransferResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardTransferResponse.setError(yaghutExceptionResponse.isError());
                cardTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "cardTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(fundTransferRequestBean))
                    .output(e.toString())
                    .build());

        }

        return cardTransferResponse;
    }

    @Override
    public CardToDepositTransferResponse cardToDepositTransfer(CardToDepositTransferRequest cardToDepositTransferRequest) {

        CardToDepositTransferResponse cardToDepositTransferResponse = new CardToDepositTransferResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(cardToDepositTransferRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        FinancialServiceResponseBean financialServiceResponseBean;
        FundTransferRequestBean fundTransferRequestBean = new FundTransferRequestBean();
        fundTransferRequestBean.setDestinationType(DepositOrPanWS.DEPOSIT);
        fundTransferRequestBean.setPinType(PinType.EPAY);
        fundTransferRequestBean.setAmount(cardToDepositTransferRequest.getAmount());
        fundTransferRequestBean.setPan(cardToDepositTransferRequest.getSourcePan());
        fundTransferRequestBean.setCvv2(cardToDepositTransferRequest.getCvv2());
        fundTransferRequestBean.setExpDate(cardToDepositTransferRequest.getExpireDate());
        fundTransferRequestBean.setPin(cardToDepositTransferRequest.getPin());
        fundTransferRequestBean.setDestination(cardToDepositTransferRequest.getDestinationDepositNumber());
        fundTransferRequestBean.setTrack2(cardToDepositTransferRequest.getTrack2());

        try {
            financialServiceResponseBean = yaghutCardProxy.cardTransfer(context, fundTransferRequestBean);
            cardToDepositTransferResponse.setError(false);
            cardToDepositTransferResponse.setAmount(cardToDepositTransferRequest.getAmount());
            cardToDepositTransferResponse.setRrn(financialServiceResponseBean.getSwitchResponseRRN());
            cardToDepositTransferResponse.setTrackNumber(YaghutUtil.generateTrackerId());
            cardToDepositTransferResponse.setTrackerId(YaghutUtil.generateTrackerId());
            cardToDepositTransferResponse.setTransactionDate(LocalDateTime.now());
            cardToDepositTransferResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(cardToDepositTransferResponse.getTransactionDate()));
            cardToDepositTransferResponse.setPaymentTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
            cardToDepositTransferResponse.setSenderFullName(cardToDepositTransferRequest.getSenderFullName());
            cardToDepositTransferResponse.setSourceCard(cardToDepositTransferRequest.getSourcePan());
            cardToDepositTransferResponse.setReceiverFullName(cardToDepositTransferRequest.getReceiverFullName());
            cardToDepositTransferResponse.setDestinationBankName(BankUtil.getBankNameByDepositNumber(cardToDepositTransferRequest.getDestinationDepositNumber()));
            cardToDepositTransferResponse.setDestinationDepositNumber(cardToDepositTransferRequest.getDestinationDepositNumber());
            cardToDepositTransferResponse.setTitle(cardToDepositTransferRequest.getTitle());
            cardToDepositTransferResponse.setInformation(cardToDepositTransferRequest.getInformation());
            cardToDepositTransferResponse.setDefaultReceipt(cardToDepositTransferResponse.getReceipt());


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
                cardToDepositTransferResponse.setSessionExpired(true);
                cardToDepositTransferResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage("شماره شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCardIssuerWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "AuthenticationWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage("اطلاعات کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "NoSufficientFundWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage("مبلغ تراکنش بیشتر از سقف برداشت است");
            } else if (YaghutCommonException.checkException(e, "ExceedStaticPinWithdrawalWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage("مبلغ تراکنش بیشتر از سقف برداشت با رمز دوم ایستا است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "CardIssuerResponsibilityWSException")) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage("پاسخی از صادر کننده بانک دریافت نشد");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                cardToDepositTransferResponse.setError(true);
                cardToDepositTransferResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardToDepositTransferResponse.setError(yaghutExceptionResponse.isError());
                cardToDepositTransferResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "cardToDepositTransfer", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(fundTransferRequestBean))
                    .output(e.toString())
                    .build());

        }
        return cardToDepositTransferResponse;
    }

    @Override
    public CardBalanceResponse getCardBalance(CardBalanceRequest cardBalanceRequest) {

        CardBalanceResponse cardBalanceResponse = new CardBalanceResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(cardBalanceRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        CardBalanceResponseBean cardBalanceResponseBean;
        CardBalanceRequestBean cardBalanceRequestBean = new CardBalanceRequestBean();
        cardBalanceRequestBean.setPan(cardBalanceRequest.getPan());
        cardBalanceRequestBean.setDepositNumber(cardBalanceRequest.getDepositNumber());
        CardAuthorizeParamsBean cardAuthorizeParamsBean = new CardAuthorizeParamsBean();
        cardAuthorizeParamsBean.setCvv2(cardBalanceRequest.getCvv2());
        cardAuthorizeParamsBean.setExpDate(cardBalanceRequest.getExpireDate());
        cardAuthorizeParamsBean.setPin(cardBalanceRequest.getPin());
        cardAuthorizeParamsBean.setPinType(PinType.EPAY);
        cardBalanceRequestBean.setCardAuthorizeParams(cardAuthorizeParamsBean);

        try {
            cardBalanceResponseBean = yaghutCardProxy.getCardBalance(context, cardBalanceRequestBean);
            cardBalanceResponse.setError(false);
            cardBalanceResponse.setBalance(cardBalanceResponseBean.getLedgerBalance().getValue());
            cardBalanceResponse.setBalance(cardBalanceResponseBean.getAvailableBalance().getValue());
            cardBalanceResponse.setCurrency(com.rahand.sina.integration.domain.bank.enums.Currency.IRR);
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
                cardBalanceResponse.setSessionExpired(true);
                cardBalanceResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCardIssuerWSException")) {
                cardBalanceResponse.setError(true);
                cardBalanceResponse.setErrorMessage("شماره کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "AuthenticationWSException")) {
                cardBalanceResponse.setError(true);
                cardBalanceResponse.setErrorMessage("اطلاعات کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                cardBalanceResponse.setError(true);
                cardBalanceResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                cardBalanceResponse.setError(true);
                cardBalanceResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardBalanceResponse.setError(yaghutExceptionResponse.isError());
                cardBalanceResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCardBalance", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardBalanceRequestBean))
                    .output(e.toString())
                    .build());
        }
        return cardBalanceResponse;
    }

    @Override
    public CardStatementsResponse getCardStatements(CardStatementsRequest cardStatementsRequest) {

        CardStatementsResponse cardStatementsResponse = new CardStatementsResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(cardStatementsRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        CardStatementBean[] cardStatementBeans;
        CardStatementRequestBean cardStatementRequestBean = new CardStatementRequestBean();
        cardStatementRequestBean.setPan(cardStatementsRequest.getPan());
        cardStatementRequestBean.setDepositNumber(cardStatementsRequest.getDepositNumber());
        CardAuthorizeParamsBean cardAuthorizeParamsBean = new CardAuthorizeParamsBean();
        cardAuthorizeParamsBean.setCvv2(cardStatementsRequest.getCvv2());
        cardAuthorizeParamsBean.setExpDate(cardStatementsRequest.getExpireDate());
        cardAuthorizeParamsBean.setPin(cardStatementsRequest.getPin());
        cardAuthorizeParamsBean.setPinType(PinType.EPAY);
        cardStatementRequestBean.setCardAuthorizeParams(cardAuthorizeParamsBean);

        try {
            cardStatementBeans = yaghutCardProxy.getCardStatementInquiry(context, cardStatementRequestBean);
            List<CardStatement> cardStatements = new ArrayList<>();
            CardStatement cardStatement;

            if (cardStatementBeans != null || cardStatementBeans.length > 0) {
                for (int i = 0; i < cardStatementBeans.length; i++) {
                    CardStatementBean cardStatementBean = cardStatementBeans[i];
                    cardStatement = new CardStatement();
                    cardStatement.setAmount(cardStatementBean.getAmount());
                    cardStatement.setBalanceAfterTransaction(cardStatementBean.getBalance());
                    cardStatement.setReferenceId(cardStatementBean.getDocumentSerial());
                    cardStatement.setDescription(cardStatementBean.getDescription());
                    cardStatement.setTransactionDate(YaghutUtil.CalenderToLocalDateTime(cardStatementBean.getDate()));
                    cardStatement.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(cardStatement.getTransactionDate()));
                    cardStatements.add(cardStatement);
                }
            }

            cardStatementsResponse.setError(false);
            cardStatementsResponse.setCount(cardStatements.size());
            cardStatementsResponse.setCardStatements(cardStatements);

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
                cardStatementsResponse.setSessionExpired(true);
                cardStatementsResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidCardIssuerWSException")) {
                cardStatementsResponse.setError(true);
                cardStatementsResponse.setErrorMessage("شماره کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "AuthenticationWSException")) {
                cardStatementsResponse.setError(true);
                cardStatementsResponse.setErrorMessage("اطلاعات کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                cardStatementsResponse.setError(true);
                cardStatementsResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                cardStatementsResponse.setError(true);
                cardStatementsResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardStatementsResponse.setError(yaghutExceptionResponse.isError());
                cardStatementsResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCardStatements", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardStatementRequestBean))
                    .output(e.toString())
                    .build());
        }

        return cardStatementsResponse;
    }

    @Override
    public GetCardTransactionsResponse getCardTransactions(GetCardTransactionRequest getCardTransactionRequest) {

        Long dayInterval = ChronoUnit.DAYS.between(getCardTransactionRequest.getFromDate(), getCardTransactionRequest.getToDate());

        if (dayInterval > 30) {
            throw new CustomRuntimeException("بازه زمانی انتخاب شده نباید بیشتر از 30 روز باشد");
        }

        GetCardTransactionsResponse getCardTransactionsResponse = new GetCardTransactionsResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(getCardTransactionRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        CardTransactionsResponseBean cardTransactionsResponseBean;
        CardTransactionsRequestBean cardTransactionsRequestBean = new CardTransactionsRequestBean();

        Calendar from = YaghutUtil.localDateTimeToCalender(getCardTransactionRequest.getFromDate());
        from.set(Calendar.HOUR_OF_DAY, 0);
        from.set(Calendar.MINUTE, 0);
        cardTransactionsRequestBean.setFromDate(from);
        Calendar to = YaghutUtil.localDateTimeToCalender(getCardTransactionRequest.getToDate());
        to.set(Calendar.HOUR_OF_DAY, 23);
        to.set(Calendar.MINUTE, 59);
        to.set(Calendar.SECOND, 59);
        cardTransactionsRequestBean.setToDate(to);

        cardTransactionsRequestBean.setFromDate(from);
        cardTransactionsRequestBean.setToDate(to);
        cardTransactionsRequestBean.setPan(getCardTransactionRequest.getPan());
        cardTransactionsRequestBean.setShowTotalRecord(getCardTransactionRequest.isShowTotalRecord());
        cardTransactionsRequestBean.setShowSystemReturnTransactions(getCardTransactionRequest.isShowSystemReturnTransactions());
        cardTransactionsRequestBean.setFromAmount(getCardTransactionRequest.getFromAmount());
        cardTransactionsRequestBean.setToAmount(getCardTransactionRequest.getToAmount());
        cardTransactionsRequestBean.setIssuerNumber(getCardTransactionRequest.getIssuerNumber());
        cardTransactionsRequestBean.setReferralNumber(getCardTransactionRequest.getReferralNumber());
        cardTransactionsRequestBean.setOpponentPan(getCardTransactionRequest.getOpponentPan());
        cardTransactionsRequestBean.setOpponentIssuerNumber(getCardTransactionRequest.getOpponentIssuerNumber());
        cardTransactionsRequestBean.setLength(getCardTransactionRequest.getLength() != null ? getCardTransactionRequest.getLength() : 100l);
        cardTransactionsRequestBean.setOffset(getCardTransactionRequest.getOffset() != null ? getCardTransactionRequest.getOffset() : 0l);

        if (getCardTransactionRequest.getCardActivityTypes() != null) {

            CardActivityTypeWS[] cardActivityTypeWS = new CardActivityTypeWS[getCardTransactionRequest.getCardActivityTypes().size()];

            for (int i = 0; i < getCardTransactionRequest.getCardActivityTypes().size(); i++) {
                cardActivityTypeWS[i] = CardActivityTypeWS.fromString(getCardTransactionRequest.getCardActivityTypes().get(i).getName());
            }

            cardTransactionsRequestBean.setActivityTypes(cardActivityTypeWS);
        }

        if (getCardTransactionRequest.getCardTransactionTypes() != null) {

            CardTransactionTypeWS[] cardTransactionTypeWS = new CardTransactionTypeWS[getCardTransactionRequest.getCardTransactionTypes().size()];

            for (int i = 0; i < getCardTransactionRequest.getCardTransactionTypes().size(); i++) {
                cardTransactionTypeWS[i] = CardTransactionTypeWS.fromString(getCardTransactionRequest.getCardTransactionTypes().get(i).getName());
            }

            cardTransactionsRequestBean.setTypes(cardTransactionTypeWS);
        }

        try {
            cardTransactionsResponseBean = yaghutCardProxy.getCardTransactions(context, cardTransactionsRequestBean);
            List<CardTransactionDto> cardTransactions = new ArrayList<>();
            CardTransactionDto cardTransactionDto;

            if (cardTransactionsResponseBean.getTransactions() != null) {
                for (int i = 0; i < cardTransactionsResponseBean.getTransactions().length; i++) {
                    CardTransactionResponseBean cardTransactionResponseBean = cardTransactionsResponseBean.getTransactions(i);
                    cardTransactionDto = YaghutMapper.mapToCardTransactionDto(cardTransactionResponseBean);
                    cardTransactions.add(cardTransactionDto);
                }
            }

            cardTransactions = cardTransactions.stream().sorted(Collections.reverseOrder(Comparator.comparing(CardTransactionDto::getTransactionDate)))
                    .collect(Collectors.toList());

            getCardTransactionsResponse.setError(false);
            getCardTransactionsResponse.setCount(cardTransactions.size());
            getCardTransactionsResponse.setCardTransactions(cardTransactions);

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
                getCardTransactionsResponse.setSessionExpired(true);
                getCardTransactionsResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                getCardTransactionsResponse.setError(yaghutExceptionResponse.isError());
                getCardTransactionsResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getCardTransactions", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardTransactionsRequestBean))
                    .output(e.toString())
                    .build());
        }

        return getCardTransactionsResponse;
    }

    @Override
    public BlockCardResponse blockCard(BlockCardRequest blockCardRequest) {

        BlockCardResponse blockCardResponse = new BlockCardResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(blockCardRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        PanRequestBean panRequestBean = new PanRequestBean();
        if (loginResponseBean.getCif() == null) {
            panRequestBean.setCif(blockCardRequest.getCif());
        }
        panRequestBean.setPan(blockCardRequest.getPan());
        try {
            yaghutCardProxy.hotCard(context, panRequestBean);
            blockCardResponse.setBlocked(true);
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
                blockCardResponse.setSessionExpired(true);
                blockCardResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "CardNotFoundWSException")) {
                blockCardResponse.setError(true);
                blockCardResponse.setErrorMessage("اطلاعات کارت نامتعبر است یا کارت مورد نظر یافت نشد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                blockCardResponse.setError(yaghutExceptionResponse.isError());
                blockCardResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "blockCard", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(panRequestBean))
                    .output(e.toString())
                    .build());
        }
        return blockCardResponse;
    }


}
