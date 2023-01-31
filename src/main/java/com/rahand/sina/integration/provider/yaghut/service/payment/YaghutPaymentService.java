package com.rahand.sina.integration.provider.yaghut.service.payment;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import com.rahand.sina.integration.domain.payment.dto.*;
import com.rahand.sina.integration.domain.payment.service.spec.Payment;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class YaghutPaymentService implements Payment {

    private YaghutUserService yaghutUserService;
    private YaghutPaymentProxy yaghutPaymentProxy;

    public YaghutPaymentService() {
        yaghutUserService = YaghutUserService.getInstance();
        yaghutPaymentProxy = new YaghutPaymentProxy();
    }

    @Override
    public CardPaymentResponse payByCard(CardPaymentRequest cardPaymentRequest) {

        CardPaymentResponse cardPaymentResponse = new CardPaymentResponse();
        PaymentResponseBean paymentResponseBean;
        LoginResponseBean loginResponse = yaghutUserService.getSessionIdForPublicServices(cardPaymentRequest.getUserId());
        Map<String, String> customContext = new LinkedHashMap<>();
        String trackerId = YaghutUtil.generateTrackerId();
        customContext.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, customContext);
        PaymentRequestBean paymentRequestBean = new PaymentRequestBean();
        PaymentInputParameterBean inputParameter = new PaymentInputParameterBean();
        inputParameter.setKey("1");
        inputParameter.setValue(cardPaymentRequest.getAmount().toString());
        paymentRequestBean.setPan(cardPaymentRequest.getPan());
        paymentRequestBean.setInputParameters(new PaymentInputParameterBean[]{inputParameter});
        CardAuthorizeParamsBean cardAuthorizeParamsBean = new CardAuthorizeParamsBean();
        cardAuthorizeParamsBean.setCvv2(cardPaymentRequest.getCvv2());
        cardAuthorizeParamsBean.setExpDate(cardPaymentRequest.getExpireDate());
        cardAuthorizeParamsBean.setPin(cardPaymentRequest.getPin());
        cardAuthorizeParamsBean.setPinType(PinType.EPAY);
        paymentRequestBean.setCardAuthorizeParams(cardAuthorizeParamsBean);
        paymentRequestBean.setPaymentServiceId(cardPaymentRequest.getPaymentServiceId() != null ?
                cardPaymentRequest.getPaymentServiceId() : IntegrationLibConfig.getProperty("YAGHUT_PAYMENT_MAIN_SERVICE_ID"));

        try {
            paymentResponseBean = yaghutPaymentProxy.doPayment(context, paymentRequestBean);
            cardPaymentResponse.setError(false);
            cardPaymentResponse.setAmount(cardPaymentRequest.getAmount());
            cardPaymentResponse.setRrn(paymentResponseBean.getSwitchResponseRRN());
            cardPaymentResponse.setTrackerId(trackerId);
            cardPaymentResponse.setTrackNumber(paymentResponseBean.getTrackingNumber());
            cardPaymentResponse.setTransactionDate(LocalDateTime.now());
            cardPaymentResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(cardPaymentResponse.getTransactionDate()));
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

                cardPaymentResponse.setSessionExpired(true);
                cardPaymentResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "AuthenticationWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage("اطلاعات کارت نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "NoSufficientFundWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage("مبلغ تراکنش از سقف برداشت کارت بیشتر است");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage("کارت یا سپرده نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "AmountConstrainViolationWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage("مبلغ خرید بیشتر یا کمتر از محدودیت تعیین شده فروشنده می باشد");
            } else if (YaghutCommonException.checkException(e, "InvalidCardStatusWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage("کارت غیر فعال است");
            } else if (YaghutCommonException.checkException(e, "BusinessWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentIdWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentParameterIdWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "InvalidParameterValueWSException")) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                cardPaymentResponse.setError(true);
                cardPaymentResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                cardPaymentResponse.setError(yaghutExceptionResponse.isError());
                cardPaymentResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "pay", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(paymentRequestBean))
                    .output(e.toString())
                    .build());

        }
        return cardPaymentResponse;
    }

    @Override
    public DepositPaymentResponse payByDeposit(DepositPaymentRequest depositPaymentRequest) {

        DepositPaymentResponse depositPaymentResponse = new DepositPaymentResponse();
        LoginResponseBean loginResponse = yaghutUserService.getSessionId(depositPaymentRequest.getUserId());
        PaymentResponseInfoBean paymentResponseInfoBean;
        Map<String, String> customContext = new HashMap<>();
        String trackerId = YaghutUtil.generateTrackerId();
        customContext.put("TRACKER_ID", trackerId);
        ContextEntry[] context = YaghutUtil.createYaghutCustomContext(loginResponse, customContext);
        DepositPaymentRequestBean depositPaymentRequestBean = new DepositPaymentRequestBean();
        DepositPaymentRequestInputParametersBean inputParameter = new DepositPaymentRequestInputParametersBean();
        inputParameter.setKey("1");
        inputParameter.setValue(depositPaymentRequest.getAmount().toString());
        depositPaymentRequestBean.setInputParameters(new DepositPaymentRequestInputParametersBean[]{inputParameter});
        depositPaymentRequestBean.setDepositNumber(depositPaymentRequest.getDepositNumber());

        if (loginResponse.getCif() == null) {
            depositPaymentRequestBean.setCif(depositPaymentRequest.getCif());
        }

        depositPaymentRequestBean.setPaymentServiceId(depositPaymentRequest.getPaymentServiceId() != null ?
                depositPaymentRequest.getPaymentServiceId() : IntegrationLibConfig.getProperty("YAGHUT_PAYMENT_MAIN_SERVICE_ID"));

        try {
            paymentResponseInfoBean = yaghutPaymentProxy.depositPayment(context, depositPaymentRequestBean);
            depositPaymentResponse.setError(false);
            depositPaymentResponse.setAmount(depositPaymentRequest.getAmount());
            depositPaymentResponse.setRrn(paymentResponseInfoBean.getSwitchResponseRRN());
            depositPaymentResponse.setTrackerId(trackerId);
            depositPaymentResponse.setTrackNumber(paymentResponseInfoBean.getTrackingNumber());
            depositPaymentResponse.setTransactionDate(LocalDateTime.now());
            depositPaymentResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(depositPaymentResponse.getTransactionDate()));

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
                depositPaymentResponse.setSessionExpired(true);
                depositPaymentResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidDepositWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("سپرده نامعتبر است");
            }else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "NoSufficientFundWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "AmountConstrainViolationWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("مبلغ خرید بیشتر یا کمتر از محدودیت تعیین شده فروشنده می باشد");
            } else if (YaghutCommonException.checkException(e, "IllegalSourceDepositStateWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("در حال حاضر امکان امکان برداشت از سپرده وجود ندارد ");
            } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("سپرده مورد نظر ارتباطی با مشتری ندارد");
            } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("نوع ارز سپرده برای انجام تراکنش مورد قبول نیست");
            } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage("مبلغ تراکنش از سقف برداشت بیشتر است");
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentIdWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "InvalidPaymentParameterIdWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "InvalidParameterValueWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            } else if (YaghutCommonException.checkException(e, "DuplicateEntityWSException")) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            }else if (YaghutCommonException.yaghutValidatorException(e)) {
                depositPaymentResponse.setError(true);
                depositPaymentResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                depositPaymentResponse.setError(yaghutExceptionResponse.isError());
                depositPaymentResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "payByDeposit", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositPaymentRequestBean))
                    .output(e.toString())
                    .build());

        }

        return depositPaymentResponse;
    }

    @Override
    public PayBillByCardResponse payBillByCard(PayBillByCardRequest payBillByCardRequest) {

        PayBillByCardResponse payBillByCardResponse = new PayBillByCardResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionIdForPublicServices(payBillByCardRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        BillPaymentResponseBean billPaymentResponseBean;
        BillPaymentRequestBean billPaymentRequestBean = new BillPaymentRequestBean();
        billPaymentRequestBean.setBillId(payBillByCardRequest.getBillId());
        billPaymentRequestBean.setPayId(payBillByCardRequest.getPayId());
        billPaymentRequestBean.setPan(payBillByCardRequest.getPan());
        CardAuthorizeParamsBean cardAuthorizeParamsBean = new CardAuthorizeParamsBean();
        cardAuthorizeParamsBean.setCvv2(payBillByCardRequest.getCvv2());
        cardAuthorizeParamsBean.setExpDate(payBillByCardRequest.getExpireDate());
        cardAuthorizeParamsBean.setPin(payBillByCardRequest.getPin());
        cardAuthorizeParamsBean.setPinType(PinType.EPAY);
        billPaymentRequestBean.setCardAuthorizeParams(cardAuthorizeParamsBean);

        try {
            billPaymentResponseBean = yaghutPaymentProxy.billPaymentByCard(context, billPaymentRequestBean);
            payBillByCardResponse.setBillId(billPaymentResponseBean.getBillId());
            payBillByCardResponse.setPayId(billPaymentResponseBean.getPayId());
            payBillByCardResponse.setBillTitle(billPaymentResponseBean.getBillTitle());
            payBillByCardResponse.setBillType(payBillByCardRequest.getBillType());
            payBillByCardResponse.setAmount(billPaymentResponseBean.getAmount());
            payBillByCardResponse.setTransactionDate(YaghutUtil.CalenderToLocalDateTime(billPaymentResponseBean.getDate()));
            payBillByCardResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(payBillByCardResponse.getTransactionDate()));
            payBillByCardResponse.setTrackNumber(billPaymentResponseBean.getReferralNumber());
            payBillByCardResponse.setRrn(YaghutUtil.generateRRN());

            if (payBillByCardResponse.getBillType().equals(BillType.MOBILE)){
                payBillByCardResponse.setMobileNumber(payBillByCardRequest.getMobileNumber());
            }

            if (payBillByCardResponse.getBillType().equals(BillType.TELEPHONE)){
                payBillByCardResponse.setTelephoneNumber(payBillByCardRequest.getTelephoneNumber());
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
                payBillByCardResponse.setSessionExpired(true);
                payBillByCardResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "IllegalBillIdWSException")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("شناسه قبض نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalPayIdWSException")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("شناسه پرداخت نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "DuplicateTransactionWSException")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("قبض قبلا پرداخت شده است");
            } else if (YaghutCommonException.checkException(e, " AuthenticationWSException ")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("اطلاعات کارت نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("موجودی کافی نمی باشد");
            }else if (YaghutCommonException.checkException(e, "NoSufficientFundWSException")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("مبلع قبض بیشتر از سقف برداشت است");
            } else if (YaghutCommonException.checkException(e, "InvalidDepositOrCardWSException")) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage("کارت نامتعبر است");
            } else if (YaghutCommonException.yaghutValidatorException(e)) {
                payBillByCardResponse.setError(true);
                payBillByCardResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            }else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                payBillByCardResponse.setError(yaghutExceptionResponse.isError());
                payBillByCardResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "payBillByCard", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(billPaymentRequestBean))
                    .output(e.toString())
                    .build());
        }

        return payBillByCardResponse;
    }

    @Override
    public PayBillByDepositResponse payBillByDeposit(PayBillByDepositRequest payBillByDepositRequest) {

        PayBillByDepositResponse payBillByDepositResponse = new PayBillByDepositResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(payBillByDepositRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        BillPaymentResponseBean billPaymentResponseBean;
        DepositBillPaymentRequestBean depositBillPaymentRequestBean = new DepositBillPaymentRequestBean();
        depositBillPaymentRequestBean.setDepositNumber(payBillByDepositRequest.getDepositNumber());

        if (loginResponseBean.getCif() == null){
            depositBillPaymentRequestBean.setCif(payBillByDepositRequest.getCif());
        }
        BillInfoSearchRequestBean billInfoSearchRequestBean = new BillInfoSearchRequestBean();
        billInfoSearchRequestBean.setBillId(payBillByDepositRequest.getBillId());
        billInfoSearchRequestBean.setPayId(payBillByDepositRequest.getPayId());
        depositBillPaymentRequestBean.setBillInfo(billInfoSearchRequestBean);
        depositBillPaymentRequestBean.setRequireVerification(false);

        try {
            billPaymentResponseBean = yaghutPaymentProxy.billPaymentByDeposit(context, depositBillPaymentRequestBean);
            payBillByDepositResponse.setBillId(billPaymentResponseBean.getBillId());
            payBillByDepositResponse.setPayId(billPaymentResponseBean.getPayId());
            payBillByDepositResponse.setBillTitle(billPaymentResponseBean.getBillTitle());
            payBillByDepositResponse.setBillType(payBillByDepositRequest.getBillType());
            payBillByDepositResponse.setAmount(billPaymentResponseBean.getAmount());
            payBillByDepositResponse.setTransactionDate(YaghutUtil.CalenderToLocalDateTime(billPaymentResponseBean.getDate()));
            payBillByDepositResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(payBillByDepositResponse.getTransactionDate()));
            payBillByDepositResponse.setTrackNumber(billPaymentResponseBean.getReferralNumber());
            payBillByDepositResponse.setRrn(YaghutUtil.generateRRN());

            if (payBillByDepositResponse.getBillType().equals(BillType.MOBILE)){
                payBillByDepositResponse.setMobileNumber(payBillByDepositRequest.getMobileNumber());
            }

            if (payBillByDepositResponse.getBillType().equals(BillType.TELEPHONE)){
                payBillByDepositResponse.setTelephoneNumber(payBillByDepositRequest.getTelephoneNumber());
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
                payBillByDepositResponse.setSessionExpired(true);
                payBillByDepositResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "IllegalBillIdWSException")) {
                payBillByDepositResponse.setError(true);
                payBillByDepositResponse.setErrorMessage("شناسه قبض نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "IllegalPayIdWSException")) {
                payBillByDepositResponse.setError(true);
                payBillByDepositResponse.setErrorMessage("شناسه پرداخت نامعتبر است");
            } else if (YaghutCommonException.checkException(e, "DuplicateTransactionWSException")) {
                payBillByDepositResponse.setError(true);
                payBillByDepositResponse.setErrorMessage("قبض قبلا پرداخت شده است");
            } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                payBillByDepositResponse.setError(true);
                payBillByDepositResponse.setErrorMessage("موجودی کافی نمی باشد");
            }else if (YaghutCommonException.checkException(e, "NoSufficientFundWSException")) {
                payBillByDepositResponse.setError(true);
                payBillByDepositResponse.setErrorMessage("موجودی کافی نمی باشد");
            } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                payBillByDepositResponse.setError(true);
                payBillByDepositResponse.setErrorMessage("مبلع قبض بیشتر از سقف برداشت است");
            }else if (YaghutCommonException.yaghutValidatorException(e)) {
                payBillByDepositResponse.setError(true);
                payBillByDepositResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                payBillByDepositResponse.setError(yaghutExceptionResponse.isError());
                payBillByDepositResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "payBillByDeposit", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(depositBillPaymentRequestBean))
                    .output(e.toString())
                    .build());
        }
        return payBillByDepositResponse;
    }

    @Override
    public RollbackTransactionResponse rollbackTransaction(RollbackTransactionRequest rollbackTransactionRequest) {

        RollbackTransactionResponse rollbackTransactionResponse = new RollbackTransactionResponse();

        LoginResponseBean loginResponseBean = yaghutUserService.getSessionIdForPublicServices(rollbackTransactionRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        RollbackTransactionRequestBean rollbackTransactionRequestBean = new RollbackTransactionRequestBean();
        rollbackTransactionRequestBean.setReferenceNumber(rollbackTransactionRequest.getReferenceId());

        try {
            yaghutPaymentProxy.rollbackTransaction(context, rollbackTransactionRequestBean);
            rollbackTransactionResponse.setError(false);
            rollbackTransactionResponse.setStatus(true);

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
                rollbackTransactionResponse.setSessionExpired(true);
                rollbackTransactionResponse.setError(true);

            } else if (YaghutCommonException.checkException(e, "InvalidReferenceWSException")) {
                rollbackTransactionResponse.setError(true);
                rollbackTransactionResponse.setErrorMessage("شماره پیگیری نامتعبر است");
            } else if (YaghutCommonException.checkException(e, "ImproperTransactionStateWSException")) {
                rollbackTransactionResponse.setError(true);
                rollbackTransactionResponse.setErrorMessage(" امکان برگشت تراکنش وجود ندارد");
            }else if (YaghutCommonException.yaghutValidatorException(e)) {
                rollbackTransactionResponse.setError(true);
                rollbackTransactionResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                rollbackTransactionResponse.setError(yaghutExceptionResponse.isError());
                rollbackTransactionResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
            }

            CommonUtil.logError(getClass().getSimpleName(), "rollbackTransaction", e.toString(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(rollbackTransactionRequestBean))
                    .output(e.toString())
                    .build());
        }

        return rollbackTransactionResponse;
    }

}
