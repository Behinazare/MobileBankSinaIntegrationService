package com.rahand.sina.integration.provider.yaghut.service.echarge;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.echarge.dto.*;
import com.rahand.sina.integration.domain.echarge.service.spec.Echarge;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.rmi.RemoteException;
import java.time.LocalDateTime;

public class YaghutEchargeService implements Echarge {

    private YaghutUserService yaghutUserService;
    private YaghutEchargeProxy yaghutEchargeProxy;

    public YaghutEchargeService() {
        yaghutUserService = YaghutUserService.getInstance();
        yaghutEchargeProxy = new YaghutEchargeProxy();
    }

    @Override
    public BuyChargeResponse buyCharge(BuyChargeRequest buyChargeRequest) {

        BuyChargeResponse buyChargeResponse = new BuyChargeResponse();
        LoginResponseBean loginResponseBean = yaghutUserService.getSessionId(buyChargeRequest.getUserId());
        ContextEntry[] context = YaghutUtil.createYaghutSessionContext(loginResponseBean);
        TopupMobileResponseBean topupMobileResponseBean;

        if (PaymentMethod.BANK_CARD_MPG.equals(buyChargeRequest.getPaymentMethod())) {

            TopupMobileRequestBean topupMobileRequestBean = new TopupMobileRequestBean();
            topupMobileRequestBean.setMobileNumber(buyChargeRequest.getMobileNumber());
            topupMobileRequestBean.setAmount(buyChargeRequest.getAmount());
            topupMobileRequestBean.setPan(buyChargeRequest.getCardPaymentRequest().getPan());

            CardAuthorizeParamsBean cardAuthorizeParamsBean = new CardAuthorizeParamsBean();
            cardAuthorizeParamsBean.setCvv2(buyChargeRequest.getCardPaymentRequest().getCvv2());
            cardAuthorizeParamsBean.setExpDate(buyChargeRequest.getCardPaymentRequest().getExpireDate());
            cardAuthorizeParamsBean.setPin(buyChargeRequest.getCardPaymentRequest().getPin());
            cardAuthorizeParamsBean.setPinType(PinType.EPAY);

            topupMobileRequestBean.setCardAuthorizeParams(cardAuthorizeParamsBean);

            try {
                topupMobileResponseBean = yaghutEchargeProxy.topUpMobileByCard(context, topupMobileRequestBean);
                buyChargeResponse.setAmount(topupMobileResponseBean.getAmount());
                buyChargeResponse.setMobileNumber(buyChargeRequest.getMobileNumber());
                buyChargeResponse.setRrn(topupMobileResponseBean.getSwitchResponseRRN());
                buyChargeResponse.setTrackNumber(YaghutUtil.generateTrackerId());
                buyChargeResponse.setTrackerId(YaghutUtil.generateTrackerId());
                buyChargeResponse.setTransactionDate(LocalDateTime.now());
                buyChargeResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(buyChargeResponse.getTransactionDate()));
                buyChargeResponse.setTitle(buyChargeRequest.getTitle());
                buyChargeResponse.setInformation(buyChargeRequest.getInformation());
                buyChargeResponse.setOperatorTitle(buyChargeRequest.getEchargeOperator().getDesc());
                buyChargeResponse.setDefaultReceipt(buyChargeResponse.getReceipt());

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
                    buyChargeResponse.setSessionExpired(true);
                    buyChargeResponse.setError(true);

                } else if (YaghutCommonException.checkException(e, "CardNotFoundWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("شماره کارت صحیح نیست");
                } else if (YaghutCommonException.checkException(e, "OperationNotPermittedWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("کارت امکان انجام تراکنش را ندارد");
                } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("مبلغ تراکنش از سقف برداشت کارت بیشتر است");
                } else if (YaghutCommonException.checkException(e, "InvalidCardStatusWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("کارت غیر فعال است");
                } else if (YaghutCommonException.checkException(e, "AmountConstrainViolationWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("مبلغ خرید بیشتر یا کمتر از محدودیت تعیین شده فروشنده می باشد");
                } else if (YaghutCommonException.checkException(e, "AuthenticationWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("اطلاعات وارد شده کارت صحیح نیست");
                } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("موجودی کافی نیست");
                } else if (YaghutCommonException.checkException(e, "ExternalAccountNotPermittedWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("امکان شارژ مستقیم وجود ندارد");
                } else if (YaghutCommonException.checkException(e, "InvalidExternalAccountIdWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("شماره موبایل نامعتبر است");
                } else if (YaghutCommonException.checkException(e, "ExternalServiceProviderNotFoundWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("اپراتور سرویس دهنده موبایل در دسترس نیست");
                } else if (YaghutCommonException.checkException(e, "AmountNotPermittedWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("امکان شارژ مستقیم با مبلغ وارد شده وجود ندارد");
                } else if (YaghutCommonException.yaghutValidatorException(e)){
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
                }else {
                    YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                    buyChargeResponse.setError(yaghutExceptionResponse.isError());
                    buyChargeResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
                }

                CommonUtil.logError(getClass().getSimpleName(), "buyCharge", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(topupMobileRequestBean))
                        .output(e.toString())
                        .build());

            }

        } else if (PaymentMethod.DEPOSIT.equals(buyChargeRequest.getPaymentMethod())) {
            TopupDepositResponseBean topupDepositResponseBean;
            TopupDepositRequestBean topupDepositRequestBean = new TopupDepositRequestBean();
            topupDepositRequestBean.setMobileNumber(buyChargeRequest.getMobileNumber());
            topupDepositRequestBean.setAmount(buyChargeRequest.getAmount());
            topupDepositRequestBean.setDepositNumber(buyChargeRequest.getDepositPaymentRequest().getDepositNumber());
            topupDepositRequestBean.setCif(buyChargeRequest.getDepositPaymentRequest().getCif());

            try {
                topupDepositResponseBean = yaghutEchargeProxy.topUpMobileByDeposit(context, topupDepositRequestBean);
                buyChargeResponse.setAmount(topupDepositResponseBean.getAmount());
                buyChargeResponse.setMobileNumber(buyChargeRequest.getMobileNumber());
                buyChargeResponse.setRrn(topupDepositResponseBean.getSwitchResponseRRN());
                buyChargeResponse.setTrackNumber(YaghutUtil.generateTrackerId());
                buyChargeResponse.setTrackerId(YaghutUtil.generateTrackerId());
                buyChargeResponse.setTransactionDate(LocalDateTime.now());
                buyChargeResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(buyChargeResponse.getTransactionDate()));
                buyChargeResponse.setTitle(buyChargeRequest.getTitle());
                buyChargeResponse.setInformation(buyChargeRequest.getInformation());
                buyChargeResponse.setOperatorTitle(buyChargeRequest.getEchargeOperator().getDesc());
                buyChargeResponse.setDefaultReceipt(buyChargeResponse.getReceipt());
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
                    buyChargeResponse.setSessionExpired(true);
                    buyChargeResponse.setError(true);
                } else if (YaghutCommonException.checkException(e, "PermissionWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("سپرده مورد نظر ارتباطی با مشتری ندارد");
                } else if (YaghutCommonException.checkException(e, "IllegalDepositStateWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("امکان برداشت از سپرده وجود ندارد");
                } else if (YaghutCommonException.checkException(e, "InvalidDepositNumberWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("شماره سپرده نامتعبر است");
                } else if (YaghutCommonException.checkException(e, "InvalidCurrencyWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("نوع ارز سپرده برای انجام تراکنش مورد قبول نیست");
                } else if (YaghutCommonException.checkException(e, "ExceedWithdrawalWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("مبلغ تراکنش از سقف برداشت بیشتر است");
                } else if (YaghutCommonException.checkException(e, "AmountConstrainViolationWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("مبلغ خرید بیشتر یا کمتر از محدودیت تعیین شده فروشنده می باشد");
                } else if (YaghutCommonException.checkException(e, "InsufficientFundsWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("موجودی کافی نیست");
                } else if (YaghutCommonException.checkException(e, "ExternalAccountNotPermittedWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("امکان شارژ مستقیم وجود ندارد");
                } else if (YaghutCommonException.checkException(e, "InvalidExternalAccountIdWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("شماره موبایل نامعتبر است");
                } else if (YaghutCommonException.checkException(e, "ExternalServiceProviderNotFoundWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("اپراتور سرویس دهنده موبایل در دسترس نیست");
                } else if (YaghutCommonException.checkException(e, "AmountNotPermittedWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("امکان شارژ مستقیم با مبلغ وارد شده وجود ندارد");
                } else if (YaghutCommonException.checkException(e, "AmountNotPermittedWSException")) {
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage("امکان شارژ مستقیم با مبلغ وارد شده وجود ندارد");
                }else if (YaghutCommonException.yaghutValidatorException(e)){
                    buyChargeResponse.setError(true);
                    buyChargeResponse.setErrorMessage(CommonErrorMessage.INVALID_INPUT);
                } else {
                    YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                    buyChargeResponse.setError(yaghutExceptionResponse.isError());
                    buyChargeResponse.setErrorMessage(yaghutExceptionResponse.getErrorMessage());
                }

                CommonUtil.logError(getClass().getSimpleName(), "buyCharge", e.toString(),ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(topupDepositRequestBean))
                        .output(e.toString())
                        .build());
            }
        } else {
            buyChargeResponse.setError(true);
            buyChargeResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
            CommonUtil.logError(getClass().getSimpleName(), "buyCharge", "invalidPaymentMethodCall",ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(buyChargeRequest))
                    .output("invalidPaymentMethodCall")
                    .build());
        }

        return buyChargeResponse;
    }

    @Override
    public GetInternetPackageResponse getInternetPackageList(GetInternetPackageRequest getInternetPackageRequest) {
        return null;
    }

    @Override
    public BuyInternetPackageResponse buyInternetPackage(BuyInternetPackageRequest buyInternetPackageRequest) {
        return null;
    }
}
