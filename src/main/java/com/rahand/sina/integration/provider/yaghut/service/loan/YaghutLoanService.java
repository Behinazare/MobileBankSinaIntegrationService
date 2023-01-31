package com.rahand.sina.integration.provider.yaghut.service.loan;

import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.LoanPayStatus;
import com.rahand.sina.integration.domain.bank.enums.LoanValidationType;
import com.rahand.sina.integration.domain.bank.service.spec.Loan;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutMapper;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;
import java.util.*;
import java.util.stream.Collectors;

public class YaghutLoanService implements Loan {

    private YaghutUserService yaghutUserService;
    private YaghutLoanProxy yaghutLoanProxy;

    public YaghutLoanService() {
        yaghutUserService = YaghutUserService.getInstance();
        yaghutLoanProxy = new YaghutLoanProxy();
    }

    @Override
    public OwnerInquiryResponse inquiryOtherLoan(OwnerInquiryRequest ownerInquiryRequest) {

        OwnerInquiryResponse loanOwnerResponse = new OwnerInquiryResponse();
        CardOwnerResponseBean cardOwnerResponseBean;
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(ownerInquiryRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        CardOwnerRequestBean cardOwnerRequestBean = new CardOwnerRequestBean();
        cardOwnerRequestBean.setLoanNumber(ownerInquiryRequest.getLoanNumber());

        try {
            cardOwnerResponseBean = yaghutLoanProxy.inquiryOwner(context, cardOwnerRequestBean);
            loanOwnerResponse.setError(false);
            loanOwnerResponse.setFirstName(cardOwnerResponseBean.getFirstName());
            loanOwnerResponse.setLastName(cardOwnerResponseBean.getLastName());
            loanOwnerResponse.setFullName(loanOwnerResponse.getFirstName() + " " + loanOwnerResponse.getLastName());
            loanOwnerResponse.setReferenceCode(cardOwnerResponseBean.getTwoPhaseReferenceCode());
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

                loanOwnerResponse.setSessionExpired(true);
                loanOwnerResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                loanOwnerResponse.setError(true);
                loanOwnerResponse.setErrorMessage("شماره تسهیلات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ValidatorWSException")) {
                loanOwnerResponse.setError(true);
                loanOwnerResponse.setErrorMessage("شماره تسهیلات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "CardIssuerResponsibilityWSException")) {
                loanOwnerResponse.setError(true);
                loanOwnerResponse.setErrorMessage("پاسخی از بانک دریافت نشد لطفا لحظاتی بعد دوباره تلاش نمایید");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                loanOwnerResponse.setError(yaghutExceptionResponse.isError());
                loanOwnerResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "inquiryOtherLoan", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(cardOwnerRequestBean))
                    .output(e.toString())
                    .build());
        }

        return loanOwnerResponse;
    }

    @Override
    public LoanOwnerResponse getLoanInfo(LoanOwnerRequest loanOwnerRequest) {

        LoanOwnerResponse loanOwnerResponse = new LoanOwnerResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(loanOwnerRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        LoanOwnerInfoResponseBean loanOwnerInfoResponseBean;
        LoanOwnerInfoRequestBean loanOwnerInfoRequestBean = new LoanOwnerInfoRequestBean();

        if (loanOwnerResponse.getCif() == null) {
            loanOwnerInfoRequestBean.setCif(loanOwnerRequest.getCif());
        }

        loanOwnerInfoRequestBean.setLoanNumber(loanOwnerRequest.getLoanNumber());
        loanOwnerInfoRequestBean.setLoanIban(loanOwnerRequest.getLoanIban());

        try {
            loanOwnerInfoResponseBean = yaghutLoanProxy.getLoanOwnerInfo(context, loanOwnerInfoRequestBean);
            loanOwnerResponse.setCif(loanOwnerInfoResponseBean.getCif());
            loanOwnerResponse.setIdentityCode(loanOwnerInfoResponseBean.getCustomerCode());
            loanOwnerResponse.setName(loanOwnerInfoResponseBean.getCustomerName());
            loanOwnerResponse.setFatherName(loanOwnerInfoResponseBean.getCustomerFatherName());
            loanOwnerResponse.setSsn(loanOwnerInfoResponseBean.getSsn());
            loanOwnerResponse.setDate(YaghutUtil.CalenderToLocalDateTime(loanOwnerInfoResponseBean.getBirthDate()));
            loanOwnerResponse.setPersianDate(CommonUtil.convertToPersianDate(loanOwnerResponse.getDate()));
            loanOwnerResponse.setLegalCustomer(loanOwnerInfoResponseBean.isLegal());
            loanOwnerResponse.setLoansInfo(Arrays.stream(loanOwnerInfoResponseBean.getLoansInfo())
                    .map(loanInfoBean -> LoanOwnerResponse.LoanInfo.builder().loanNumber(loanInfoBean.getLoanNumber()).loanIban(loanInfoBean.getLoanIban()).build())
                    .collect(Collectors.toList()));
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

                loanOwnerResponse.setSessionExpired(true);
                loanOwnerResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidLoanNumberWSException")) {
                loanOwnerResponse.setError(true);
                loanOwnerResponse.setErrorMessage("شماره تسهیلات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCustomerWSException")) {
                loanOwnerResponse.setError(true);
                loanOwnerResponse.setErrorMessage("شماره مشتری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidIBANWSException")) {
                loanOwnerResponse.setError(true);
                loanOwnerResponse.setErrorMessage("اطلاعات تسهیلات مورد نظر وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "IllegalBankWSException")) {
                loanOwnerResponse.setError(true);
                loanOwnerResponse.setErrorMessage("شما به این تسهیلات دسترسی ندارید");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                loanOwnerResponse.setError(yaghutExceptionResponse.isError());
                loanOwnerResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getLoanInfo", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(loanOwnerInfoRequestBean))
                    .output(e.toString())
                    .build());
        }

        return loanOwnerResponse;
    }

    @Override
    public GetLoansResponse getLoans(GetLoansRequest getLoansRequest) {

        GetLoansResponse getLoansResponse = new GetLoansResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(getLoansRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        LoansResponseBean loansResponseBean;
        LoansSearchRequestBean loansSearchRequestBean = new LoansSearchRequestBean();

        if (loginResponse.getCif() == null) {
            loansSearchRequestBean.setCif(getLoansRequest.getCif());
        }
        loansSearchRequestBean.setLoanStatus(getLoansRequest.getLoanStatus() != null ? LoanStatus.fromValue(getLoansRequest.getLoanStatus().getName()) : null);
        loansSearchRequestBean.setType(getLoansRequest.getLoanType() != null ? LoanType.fromValue(getLoansRequest.getLoanType().getName()) : null);
        loansSearchRequestBean.setCbLoanNumber(getLoansRequest.getCbLoanNumber());
        loansSearchRequestBean.setLoanTitle(getLoansRequest.getLoanTitle());
        loansSearchRequestBean.setBranchCode(getLoansRequest.getBranchCode());
        loansSearchRequestBean.setCurrency(getLoansRequest.getCurrency() != null ? getLoansRequest.getCurrency().getName() : null);
        loansSearchRequestBean.setLength(getLoansRequest.getLength() != null ? getLoansRequest.getLength() : 100l);
        loansSearchRequestBean.setOffset(getLoansRequest.getOffset() != null ? getLoansRequest.getOffset() : 0l);

        try {
            loansResponseBean = yaghutLoanProxy.getLoans(context, loansSearchRequestBean);

            List<LoanDto> loans = new ArrayList<>();
            if (loansResponseBean.getLoanBeans() != null) {
                for (int i = 0; i < loansResponseBean.getLoanBeans().length; i++) {
                    LoanBean loanBean = loansResponseBean.getLoanBeans(i);
                    LoanDto loanDto = YaghutMapper.mapToLoanDto(loanBean);
                    loans.add(loanDto);
                }
            }
            getLoansResponse.setLoans(loans);
            getLoansResponse.setCount(loans.size());

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

                getLoansResponse.setSessionExpired(true);
                getLoansResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                getLoansResponse.setError(yaghutExceptionResponse.isError());
                getLoansResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getLoans", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(loansSearchRequestBean))
                    .output(e.toString())
                    .build());
        }

        return getLoansResponse;
    }

    @Override
    public GetLoansResponse getLoanList(GetLoansRequest getLoansRequest) {

        GetLoansResponse getLoansResponse = new GetLoansResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(getLoansRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        LoansListResponseBean loansListResponseBean;
        LoansSearchListRequestBean loansSearchRequestBean = new LoansSearchListRequestBean();

        if (loginResponse.getCif() == null) {
            loansSearchRequestBean.setCif(getLoansRequest.getCif());
        }
        loansSearchRequestBean.setCbLoanNumber(getLoansRequest.getCbLoanNumber());
        loansSearchRequestBean.setLoanTitle(getLoansRequest.getLoanTitle());
        loansSearchRequestBean.setBranchCode(getLoansRequest.getBranchCode());
        loansSearchRequestBean.setCurrency(getLoansRequest.getCurrency() != null ? getLoansRequest.getCurrency().getName() : null);
        loansSearchRequestBean.setLength(getLoansRequest.getLength() != null ? getLoansRequest.getLength() : 100l);
        loansSearchRequestBean.setOffset(getLoansRequest.getOffset() != null ? getLoansRequest.getOffset() : 0l);

        try {
            loansListResponseBean = yaghutLoanProxy.getLoanList(context, loansSearchRequestBean);

            List<LoanDto> loans = new ArrayList<>();
            if (loansListResponseBean.getLoanListBeans() != null) {
                for (int i = 0; i < loansListResponseBean.getLoanListBeans().length; i++) {
                    LoanListBean loanListBeans = loansListResponseBean.getLoanListBeans(i);
                    LoanDto loanDto = YaghutMapper.mapToLoanDto(loanListBeans);
                    loans.add(loanDto);
                }
            }
            getLoansResponse.setLoans(loans);
            getLoansResponse.setCount(loans.size());

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

                getLoansResponse.setSessionExpired(true);
                getLoansResponse.setError(true);

            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                getLoansResponse.setError(yaghutExceptionResponse.isError());
                getLoansResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getLoanList", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(loansSearchRequestBean))
                    .output(e.toString())
                    .build());
        }

        return getLoansResponse;
    }

    @Override
    public ChangeLoanAutoPaymentDepositResponse changeLoanAutoPaymentDeposit(ChangeLoanAutoPaymentDepositRequest changeLoanAutoPaymentDepositRequest) {

        ChangeLoanAutoPaymentDepositResponse changeLoanAutoPaymentDepositResponse = new ChangeLoanAutoPaymentDepositResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(changeLoanAutoPaymentDepositRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        ChangeLoanAutoPaymentDepositResponseBean changeLoanAutoPaymentDepositResponseBean;
        ChangeLoanAutoPaymentDepositRequestBean changeLoanAutoPaymentDepositRequestBean = new ChangeLoanAutoPaymentDepositRequestBean();

        if (loginResponse.getCif() == null) {
            changeLoanAutoPaymentDepositRequestBean.setCif(changeLoanAutoPaymentDepositRequest.getCif());
        }
        changeLoanAutoPaymentDepositRequestBean.setLoanNumber(changeLoanAutoPaymentDepositRequest.getLoanNumber());
        changeLoanAutoPaymentDepositRequestBean.setDepositNumber(changeLoanAutoPaymentDepositRequest.getDepositNumber());

        try {
            changeLoanAutoPaymentDepositResponseBean = yaghutLoanProxy.changeLoanAutoPaymentDeposit(context, changeLoanAutoPaymentDepositRequestBean);
            changeLoanAutoPaymentDepositResponse.setLoanNumber(changeLoanAutoPaymentDepositResponseBean.getLoanNumber());
            changeLoanAutoPaymentDepositResponse.setDepositNumber(changeLoanAutoPaymentDepositResponseBean.getDepositNumber());

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

                changeLoanAutoPaymentDepositResponse.setSessionExpired(true);
                changeLoanAutoPaymentDepositResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidLoanNumberWSException")) {
                changeLoanAutoPaymentDepositResponse.setError(true);
                changeLoanAutoPaymentDepositResponse.setErrorMessage("شماره تسهیلات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                changeLoanAutoPaymentDepositResponse.setError(true);
                changeLoanAutoPaymentDepositResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                changeLoanAutoPaymentDepositResponse.setError(true);
                changeLoanAutoPaymentDepositResponse.setErrorMessage("امکان دسترسی برای انجام  این عملیات بر روی این سپرده یا تسهیلات مورد نظر را ندارید");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                changeLoanAutoPaymentDepositResponse.setError(yaghutExceptionResponse.isError());
                changeLoanAutoPaymentDepositResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "changeLoanAutoPaymentDeposit", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(changeLoanAutoPaymentDepositRequestBean))
                    .output(e.toString())
                    .build());
        }

        return changeLoanAutoPaymentDepositResponse;
    }

    @Override
    public LoanDetailResponse getLoanDetail(LoanDetailRequest loanDetailRequest) {

        LoanDetailResponse loanDetailResponse = new LoanDetailResponse();

        LoginResponseBean loginResponse = yaghutUserService.getSessionId(loanDetailRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponse);
        LoanDetailResponseBean loanDetailResponseBean;
        LoanDetailSearchRequestBean loanDetailSearchRequestBean = new LoanDetailSearchRequestBean();

        if (loginResponse.getCif() == null) {
            loanDetailSearchRequestBean.setCif(loanDetailRequest.getCif());
        }
        loanDetailSearchRequestBean.setLoanNumber(loanDetailRequest.getLoanNumber());
        loanDetailSearchRequestBean.setCbLoanNumber(loanDetailRequest.getCbLoanNumber());
        loanDetailSearchRequestBean.setHasDetail(loanDetailRequest.isHasDetail());
        loanDetailSearchRequestBean.setPayStatus(loanDetailRequest.getLoanPayStatus() != null ? PayStatusWS.fromValue(loanDetailRequest.getLoanPayStatus().getName()) : null);
        loanDetailSearchRequestBean.setLength(loanDetailRequest.getLength() != null ? loanDetailRequest.getLength() : 100l);
        loanDetailSearchRequestBean.setOffset(loanDetailRequest.getOffset() != null ? loanDetailRequest.getOffset() : 0l);

        try {
            loanDetailResponseBean = yaghutLoanProxy.getLoanDetail(context, loanDetailSearchRequestBean);
            loanDetailResponse.setError(false);
            loanDetailResponse.setLoanNumber(loanDetailRequest.getLoanNumber());
            loanDetailResponse.setAutomaticPaymentAccountNumber(loanDetailResponseBean.getAutomaticPaymentAccountNumber());
            loanDetailResponse.setCbLoanNumber(loanDetailResponseBean.getCbLoanNumber());
            loanDetailResponse.setLoanState(com.rahand.sina.integration.domain.bank.enums.LoanState.get(loanDetailResponseBean.getState().getValue()));
            loanDetailResponse.setCurrency(com.rahand.sina.integration.domain.bank.enums.Currency.get(loanDetailResponseBean.getCurrency()));
            loanDetailResponse.setAmount(loanDetailResponseBean.getAmount());
            loanDetailResponse.setDiscount(loanDetailResponseBean.getDiscount());
            loanDetailResponse.setPenalty(loanDetailResponseBean.getPenalty());
            loanDetailResponse.setTotalPaidAmount(loanDetailResponseBean.getTotalPaidAmount());
            loanDetailResponse.setCountOfPaid(loanDetailResponseBean.getCountOfPaid());
            loanDetailResponse.setTotalUnpaidAmount(loanDetailResponseBean.getTotalUnpaidAmount());
            loanDetailResponse.setCountOfUnpaid(loanDetailResponseBean.getCountOfUnpaid());
            loanDetailResponse.setTotalMaturedUnpaidAmount(loanDetailResponseBean.getTotalMaturedUnpaidAmount());
            loanDetailResponse.setCountOfMaturedUnpaid(loanDetailResponseBean.getCountOfMaturedUnpaid());
            if (loanDetailResponseBean.getLoanRows() != null) {
                loanDetailResponse.setInstallmentInfos(Arrays.stream(loanDetailResponseBean.getLoanRows())
                        .map(installmentIfoBean -> InstallmentInfoDto.builder()
                                .payDate(YaghutUtil.CalenderToLocalDateTime(installmentIfoBean.getPayDate()))
                                .persianDate(CommonUtil.convertToPersianDate(YaghutUtil.CalenderToLocalDateTime(installmentIfoBean.getPayDate())))
                                .delayDay(installmentIfoBean.getDelayDay())
                                .payedAmount(installmentIfoBean.getPayedAmount())
                                .penaltyAmount(installmentIfoBean.getPenaltyAmount())
                                .unpaidAmount(installmentIfoBean.getUnpaidAmount())
                                .loanPayStatus(LoanPayStatus.get(installmentIfoBean.getPayStatus().getValue()))
                                .build())
                        .collect(Collectors.toList()));
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

                loanDetailResponse.setSessionExpired(true);
                loanDetailResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidLoanNumberWSException")) {
                loanDetailResponse.setError(true);
                loanDetailResponse.setErrorMessage("شماره تسهیلات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "DuplicateEntityWSRuntimeException")) {
                loanDetailResponse.setError(true);
                loanDetailResponse.setErrorMessage("با این شماره تسهیلات بیش از یک تسهیلات وجود دارد");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                loanDetailResponse.setError(yaghutExceptionResponse.isError());
                loanDetailResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "getLoanDetail", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(loanDetailSearchRequestBean))
                    .output(e.toString())
                    .build());
        }

        return loanDetailResponse;
    }

    @Override
    public PayLoanByDepositResponse payLoanByDeposit(PayLoanByDepositRequest payLoanByDepositRequest) {

        PayLoanByDepositResponse payLoanByDepositResponse = new PayLoanByDepositResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(payLoanByDepositRequest.getUserId());
        Map<String, String> customContext = new LinkedHashMap<>();
        String trackerId = YaghutUtil.generateTrackerId();
        customContext.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, customContext);
        LoanPaymentResponseBean loanPaymentResponseBean;
        LoanPaymentRequestBean loanPaymentRequestBean = new LoanPaymentRequestBean();

        if (loginResponse.getCif() == null) {
            loanPaymentRequestBean.setCif(payLoanByDepositRequest.getCif());
        }
        loanPaymentRequestBean.setPaymentMethod(loanPaymentRequestBean.getPaymentMethod() != null ? LoanPaymentMethodWS.fromValue(loanPaymentRequestBean.getPaymentMethod().getValue()) : LoanPaymentMethodWS.CUSTOM_DEPOSIT);
        loanPaymentRequestBean.setLoanNumber(payLoanByDepositRequest.getLoanNumber());
        loanPaymentRequestBean.setAmount(payLoanByDepositRequest.getAmount());
        loanPaymentRequestBean.setCustomDepositNumber(payLoanByDepositRequest.getCustomDepositNumber());
        loanPaymentRequestBean.setAdditionalDescription(payLoanByDepositRequest.getAdditionalDescription());

        try {
            loanPaymentResponseBean = yaghutLoanProxy.pay(context, loanPaymentRequestBean);
            payLoanByDepositResponse.setAppliedAmount(loanPaymentResponseBean.getAppliedAmount());
            payLoanByDepositResponse.setDocumentNumber(loanPaymentResponseBean.getDocumentNumber());
            payLoanByDepositResponse.setDocumentTitle(loanPaymentResponseBean.getDocumentTitle());
            payLoanByDepositResponse.setLoanState(com.rahand.sina.integration.domain.bank.enums.LoanState.get(loanPaymentResponseBean.getLoanState().getValue()));
            payLoanByDepositResponse.setCurrency(Currency.get(loanPaymentResponseBean.getCurrency()));
            payLoanByDepositResponse.setTrackerId(trackerId);
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

                payLoanByDepositResponse.setSessionExpired(true);
                payLoanByDepositResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidLoanNumberWSException")) {
                payLoanByDepositResponse.setError(true);
                payLoanByDepositResponse.setErrorMessage("شماره تسهیلات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                payLoanByDepositResponse.setError(true);
                payLoanByDepositResponse.setErrorMessage("شماره سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                payLoanByDepositResponse.setError(true);
                payLoanByDepositResponse.setErrorMessage("امکان برداشت از این سپرده را ندارید");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                payLoanByDepositResponse.setError(true);
                payLoanByDepositResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                payLoanByDepositResponse.setError(true);
                payLoanByDepositResponse.setErrorMessage("ارز تسهیلات و سپرده یکسان نیست. امکان پرداخت وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "NotPayableLoanWSException")) {
                payLoanByDepositResponse.setError(true);
                payLoanByDepositResponse.setErrorMessage("امکان پرداخت برای این تسهیلات وجود ندارد یا مبلغ وارد شده از مبلغ باقی مانده قابل پرداخت تسهیلات بیشتر است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                payLoanByDepositResponse.setError(yaghutExceptionResponse.isError());
                payLoanByDepositResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "payLoanByDeposit", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(loanPaymentRequestBean))
                    .output(e.toString())
                    .build());
        }

        return payLoanByDepositResponse;
    }

    @Override
    public PayLoanByCardResponse payLoanByCard(PayLoanByCardRequest payLoanByCardRequest) {

        PayLoanByCardResponse payLoanByCardResponse = new PayLoanByCardResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(payLoanByCardRequest.getUserId());
        Map<String, String> customContext = new LinkedHashMap<>();
        String trackerId = YaghutUtil.generateTrackerId();
        customContext.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, customContext);
        CardLoanPaymentResponseBean loanPaymentResponseBean;
        CardLoanPaymentRequestBean loanPaymentRequestBean = new CardLoanPaymentRequestBean();
        loanPaymentRequestBean.setLoanNumber(payLoanByCardRequest.getLoanNumber());
        loanPaymentRequestBean.setApplyAmount(payLoanByCardRequest.getAmount());
        loanPaymentRequestBean.setPan(payLoanByCardRequest.getPan());

        CardAuthorizeParamsBean cardAuthorizeParamsBean = new CardAuthorizeParamsBean();
        cardAuthorizeParamsBean.setPinType(PinType.EPAY);
        cardAuthorizeParamsBean.setCvv2(payLoanByCardRequest.getCvv2());
        cardAuthorizeParamsBean.setExpDate(payLoanByCardRequest.getExpireDate());
        cardAuthorizeParamsBean.setPin(payLoanByCardRequest.getPin());

        loanPaymentRequestBean.setCardAuthorizeParams(cardAuthorizeParamsBean);

        try {
            loanPaymentResponseBean = yaghutLoanProxy.payLoanByCard(context, loanPaymentRequestBean);
            payLoanByCardResponse.setRrn(loanPaymentResponseBean.getSwitchResponseRRN());
            payLoanByCardResponse.setTrackingNumber(loanPaymentResponseBean.getTrackingNumber());
            payLoanByCardResponse.setSourcePan(loanPaymentResponseBean.getSourcePan());
            payLoanByCardResponse.setPaymentDate(YaghutUtil.CalenderToLocalDateTime(loanPaymentResponseBean.getPaymentDate()));
            payLoanByCardResponse.setTrackerId(trackerId);

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
                payLoanByCardResponse.setSessionExpired(true);
                payLoanByCardResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidLoanNumberWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("شماره تسهیلات نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException ")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage(" مبلغ بیشتر از سقف برداشت می باشد ");
            } else if (YaghutCommonException.checkException(e, "AuthenticationWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("اطلاعات کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("ارز تسهیلات و کارت یکسان نیست. امکان پرداخت وجود ندارد");
            } else if (YaghutCommonException.checkException(e, "NotPayableLoanWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("امکان پرداخت برای این تسهیلات وجود ندارد یا مبلغ وارد شده از مبلغ باقی مانده قابل پرداخت تسهیلات بیشتر است");
            } else if (YaghutCommonException.checkException(e, "InvalidCardStatusWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("کارت منقضی یا مسدود شده است");
            } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("امکان انجام این عملیات را ندارید");
            } else if (YaghutCommonException.checkException(e, "InvalidAmountWSException")) {
                payLoanByCardResponse.setError(true);
                payLoanByCardResponse.setErrorMessage("مبلغ قابل پرداخت تسیهلات مشخص نیست یا نامعتبر است");
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                payLoanByCardResponse.setError(yaghutExceptionResponse.isError());
                payLoanByCardResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "payLoanByCard", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(loanPaymentRequestBean))
                    .output(e.toString())
                    .build());
        }
        return payLoanByCardResponse;
    }

    @Override
    public void initLoanValidation(LoanValidationRequest loanValidationRequest) {

        initInsert(loanValidationRequest);

        new Thread(() -> {

            for (int i = 0; i < loanValidationRequest.getFacilityValidationTypes().size(); i++) {
                LoanValidationType facilityValidationType = loanValidationRequest.getFacilityValidationTypes().get(i);

                switch (facilityValidationType) {
                    case CREDITـRATING:
                        //call api
                        updateLoanValidationRecord(loanValidationRequest, facilityValidationType);
                        break;

                    case SAMAT:
                        //call api
                        updateLoanValidationRecord(loanValidationRequest, facilityValidationType);
                        break;

                    case SAMA_CHEQUE:
                        //call api
                        updateLoanValidationRecord(loanValidationRequest, facilityValidationType);
                        break;

                    case NEZAM_VAZIFEH:
                        //call api
                        updateLoanValidationRecord(loanValidationRequest, facilityValidationType);
                        break;

                    case ANTI_MONEY_LAUNDRY:
                        //call api
                        updateLoanValidationRecord(loanValidationRequest, facilityValidationType);
                        break;

                    default:

                }
            }

        }).start();

    }

    @Override
    public GetLoanValidationResultResponse getLoanValidationResult(GetLoanValidationResultRequest getLoanValidationResultRequest) {

        GetLoanValidationResultResponse getLoanValidationResultResponse = new GetLoanValidationResultResponse();

        return getLoanValidationResultResponse;

    }

    private void initInsert(LoanValidationRequest loanValidationRequest) {

        for (int i = 0; i < loanValidationRequest.getFacilityValidationTypes().size(); i++) {

        }

    }

    private void updateLoanValidationRecord(LoanValidationRequest loanValidationRequest, LoanValidationType facilityValidationType) {

    }
}
