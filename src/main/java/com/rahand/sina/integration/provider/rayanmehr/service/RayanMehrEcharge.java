package com.rahand.sina.integration.provider.rayanmehr.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.PaymentDataResponse;
import com.rahand.common.dto.ResponseDto;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.digitalcredit.dto.*;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditPaymentType;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditProvider;
import com.rahand.sina.integration.domain.digitalcredit.service.DigitalCreditService;
import com.rahand.sina.integration.domain.echarge.dto.*;
import com.rahand.sina.integration.domain.echarge.service.spec.Echarge;
import com.rahand.sina.integration.domain.payment.dto.*;
import com.rahand.sina.integration.domain.payment.service.PaymentService;
import com.rahand.sina.integration.provider.rayanmehr.proxy.*;
import com.rahand.sina.integration.provider.rayanmehr.util.RayanMehrUtil;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;
import com.rahand.sina.lib.wallet.dto.PayWalletRequest;
import com.rahand.sina.lib.wallet.dto.PayWalletResponse;
import com.rahand.sina.lib.wallet.dto.ReverseWalletTransactionRequest;
import com.rahand.sina.lib.wallet.dto.ReverseWalletTransactionResponse;
import com.rahand.sina.lib.wallet.service.WalletService;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.*;

public class RayanMehrEcharge implements Echarge {

    private static Integer merchantId;
    private static IEchargeServiceV7 echargeService;


    static {
        getService();
        merchantId = Integer.valueOf(IntegrationLibConfig.getProperty("RAYAN_MEHR_MERCHANT_ID"));
    }

    private static void getService() {
        EchargeServiceV7Locator echargeServiceV7Locator = new EchargeServiceV7Locator();
        try {
            echargeService = echargeServiceV7Locator.getEchargeTransportServiceEndPointV7();
        } catch (ServiceException e) {
            CommonUtil.logError(RayanMehrEcharge.class.getSimpleName(), "getService", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }
    }

    @Override
    public BuyChargeResponse buyCharge(BuyChargeRequest buyChargeRequest) {
        return null;
    }

    @Override
    public GetInternetPackageResponse getInternetPackageList(GetInternetPackageRequest getInternetPackageRequest) {

        GetInternetPackageResponse getInternetPackageResponse = new GetInternetPackageResponse();
        InternetPackagesResponseV7 internetPackagesResponse;
        InternetPackagesRequestV7 internetPackagesRequest = new InternetPackagesRequestV7();
        internetPackagesRequest.setMerchantId(merchantId);

        try {
            internetPackagesResponse = echargeService.getInternetPackages(internetPackagesRequest);
            List<BoltonV7> boltonList = Arrays.asList(internetPackagesResponse.getBoltons());
            List<InternetPackage> internetPackages = RayanMehrUtil.mapToInternetPackageList(boltonList, getInternetPackageRequest.getEchargeType(), getInternetPackageRequest.getEchargeOperator());
            getInternetPackageResponse.setInternetPackages(internetPackages);
            getInternetPackageResponse.setCount(internetPackages.size());
            getInternetPackageResponse.setEchargeType(getInternetPackageRequest.getEchargeType());
            getInternetPackageResponse.setEchargeOperator(getInternetPackageRequest.getEchargeOperator());
            getInternetPackageResponse.setInternetPackageJson(CommonUtil.toJson(internetPackages));
            getInternetPackageResponse.setInternetPackageContainerJson(CommonUtil.setContainerJson(getInternetPackageResponse.getInternetPackageJson()));

        } catch (RemoteException e) {
            getInternetPackageResponse.setError(true);
            getInternetPackageResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
            CommonUtil.logError(RayanMehrEcharge.class.getSimpleName(), "getInternetPackageList", e.getMessage(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(internetPackagesRequest))
                    .output(e.toString())
                    .build());

        }

        return getInternetPackageResponse;
    }

    @Override
    public BuyInternetPackageResponse buyInternetPackage(BuyInternetPackageRequest buyInternetPackageRequest) {

        BuyInternetPackageResponse buyInternetPackageResponse = new BuyInternetPackageResponse();

        buyInternetPackageResponse.setProductName(buyInternetPackageRequest.getProductName());

        PaymentService paymentService = new PaymentService();

        DigitalCreditService digitalCreditService = null;

        CardPaymentResponse cardPaymentResponse = null;
        DepositPaymentResponse depositPaymentResponse = null;
        DigitalCreditPaymentResponse digitalCreditPaymentResponse = null;
        PayWalletResponse payWalletResponse = null;

        boolean successfulPayment = false;
        String errorPayMessage = "";

        switch (buyInternetPackageRequest.getPaymentMethod()) {

            case BANK_CARD_MPG:

                CardPaymentRequest cardPaymentRequest = buyInternetPackageRequest.getCardPaymentRequest();
                cardPaymentRequest.setUserId(buyInternetPackageRequest.getUserId());
                cardPaymentRequest.setPaymentServiceId(IntegrationLibConfig.getProperty("YAGHUT_PAYMENT_INTERNAET_PACKAGE_SERVICE_ID"));
                ResponseDto<CardPaymentResponse> cardpaymentResponseDto = paymentService.mpgPay(cardPaymentRequest);
                successfulPayment = cardpaymentResponseDto.isError() ? false : true;
                if (successfulPayment) {
                    cardPaymentResponse = cardpaymentResponseDto.getResponseData();
                    buyInternetPackageResponse.setAmount(cardPaymentResponse.getAmount());
                    buyInternetPackageResponse.setRrn(cardPaymentResponse.getRrn());
                    buyInternetPackageResponse.setTransactionDate(cardPaymentResponse.getTransactionDate());
                    buyInternetPackageResponse.setPersianTransactionDate(cardPaymentResponse.getPersianTransactionDate());
                    buyInternetPackageResponse.setTrackNumber(cardPaymentResponse.getTrackNumber());
                    buyInternetPackageResponse.setTrackerId(cardPaymentResponse.getTrackerId());

                } else {
                    errorPayMessage = cardpaymentResponseDto.getMessage();
                }

                break;

            case DEPOSIT:

                DepositPaymentRequest depositPaymentRequest = buyInternetPackageRequest.getDepositPaymentRequest();
                depositPaymentRequest.setUserId(buyInternetPackageRequest.getUserId());
                ResponseDto<DepositPaymentResponse> depositPaymentResponseDto = paymentService.payByDeposit(depositPaymentRequest);
                successfulPayment = depositPaymentResponseDto.isError() ? false : true;
                if (successfulPayment) {
                    depositPaymentResponse = depositPaymentResponseDto.getResponseData();
                    buyInternetPackageResponse.setAmount(depositPaymentResponse.getAmount());
                    buyInternetPackageResponse.setRrn(depositPaymentResponse.getRrn());
                    buyInternetPackageResponse.setTransactionDate(depositPaymentResponse.getTransactionDate());
                    buyInternetPackageResponse.setPersianTransactionDate(depositPaymentResponse.getPersianTransactionDate());
                    buyInternetPackageResponse.setTrackNumber(depositPaymentResponse.getTrackNumber());
                    buyInternetPackageResponse.setTrackerId(depositPaymentResponse.getTrackerId());
                } else {
                    errorPayMessage = depositPaymentResponseDto.getMessage();
                }

                break;

            case DIGITAL_CREDIT_PAYMENT:

                PaymentDataResponse<PaymentDataResponse.DigitalCreditPaymentData> digitalCreditPaymentDataPaymentData = CommonUtil.getPaymentData(buyInternetPackageRequest.getPaymentDataJson());
                digitalCreditService = new DigitalCreditService();
                DigitalCreditPaymentRequest digitalCreditPaymentRequest = new DigitalCreditPaymentRequest();
                digitalCreditPaymentRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                        .digitalCreditProvider(DigitalCreditProvider.get(digitalCreditPaymentDataPaymentData.getPaymentData().getDigitalCreditProvider()))
                        .businessCode(digitalCreditPaymentDataPaymentData.getPaymentData().getBusinessCode())
                        .build());
                digitalCreditPaymentRequest.setPaymentId(UUID.randomUUID().toString());
                digitalCreditPaymentRequest.setPan(digitalCreditPaymentDataPaymentData.getPaymentData().getPan());
                digitalCreditPaymentRequest.setAmount(buyInternetPackageRequest.getAmount());
                digitalCreditPaymentRequest.setOrderId(YaghutUtil.generateOrderId());
                digitalCreditPaymentRequest.setDescription(buyInternetPackageRequest.getDigitalCreditPaymentExtraInfo().getDescription());
                digitalCreditPaymentRequest.setMerchantName(buyInternetPackageRequest.getDigitalCreditPaymentExtraInfo().getMerchantName());
                digitalCreditPaymentRequest.setTerminalId(buyInternetPackageRequest.getDigitalCreditPaymentExtraInfo().getTerminalId());
                digitalCreditPaymentRequest.setMerchantId(buyInternetPackageRequest.getDigitalCreditPaymentExtraInfo().getMerchantId());
                digitalCreditPaymentRequest.setPspCode(buyInternetPackageRequest.getDigitalCreditPaymentExtraInfo().getReceivingInstitutionIdCode());
                digitalCreditPaymentRequest.setReceivingInstitutionIdCode(buyInternetPackageRequest.getDigitalCreditPaymentExtraInfo().getReceivingInstitutionIdCode());
                digitalCreditPaymentRequest.setProductType(buyInternetPackageRequest.getDigitalCreditPaymentExtraInfo().getProductType());

                ResponseDto<DigitalCreditPaymentResponse> digitalCreditPaymentResponseResponseDto = digitalCreditService.payment(digitalCreditPaymentRequest);

                successfulPayment = digitalCreditPaymentResponseResponseDto.isError() ? false : true;

                if (successfulPayment) {
                    digitalCreditPaymentResponse = digitalCreditPaymentResponseResponseDto.getResponseData();
                    buyInternetPackageResponse.setAmount(buyInternetPackageRequest.getAmount());
                    buyInternetPackageResponse.setRrn(digitalCreditPaymentResponse.getRrn());
                    LocalDateTime transactionDate = LocalDateTime.now();
                    buyInternetPackageResponse.setTransactionDate(transactionDate);
                    buyInternetPackageResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(transactionDate));
                    buyInternetPackageResponse.setTrackNumber(digitalCreditPaymentResponse.getPaymentId());
                    buyInternetPackageResponse.setTrackerId(digitalCreditPaymentRequest.getOrderId());

                } else {
                    errorPayMessage = digitalCreditPaymentResponseResponseDto.getMessage();
                }

                break;

            case WALLET:

                WalletService walletService = new WalletService();
                PayWalletRequest payWalletRequest = new PayWalletRequest();
                payWalletRequest.setAmount(buyInternetPackageRequest.getAmount());
                payWalletRequest.setUserId(buyInternetPackageRequest.getUserId());
                payWalletRequest.setPassword(buyInternetPackageRequest.getPayWalletRequest().getPassword());
                payWalletRequest.setPan(buyInternetPackageRequest.getPayWalletRequest().getPan());

                payWalletResponse = walletService.payByWallet(payWalletRequest).getResponseData();
                successfulPayment = payWalletResponse.isError() ? false : true;

                if (successfulPayment) {
                    buyInternetPackageResponse.setAmount(payWalletResponse.getAmount());
                    buyInternetPackageResponse.setRrn(payWalletResponse.getRrn());
                    buyInternetPackageResponse.setTransactionDate(payWalletResponse.getTransactionDate());
                    buyInternetPackageResponse.setPersianTransactionDate(payWalletResponse.getPersianTransactionDate());
                    buyInternetPackageResponse.setTrackNumber(payWalletResponse.getTrackNumber());
                    buyInternetPackageResponse.setTrackerId(payWalletResponse.getTrackerId());
                } else {
                    errorPayMessage = payWalletResponse.getErrorMessage();
                }

                break;
        }

        if (successfulPayment) {

            buyInternetPackageResponse.setSuccessfulPayment(true);
            TopupResponseV7 topupResponse;
            TopupRequestV7 topupRequest = new TopupRequestV7();
            topupRequest.setMerchantId(merchantId);
            topupRequest.setProductId(Integer.valueOf(buyInternetPackageRequest.getProductId()));
            topupRequest.setAmount(buyInternetPackageRequest.getAmount().intValue());
            topupRequest.setMobileNumber(buyInternetPackageRequest.getMobileNumber());
            topupRequest.setReferenceId(RayanMehrUtil.generateReferenceId());
            Map<String, String> nationalCodeMap = new LinkedHashMap<>();
            nationalCodeMap.put("Mobile", buyInternetPackageRequest.getPayerMobileNumber());
            topupRequest.setNationalCode(CommonUtil.toJson(nationalCodeMap));

            try {

                topupResponse = echargeService.registerTopup(topupRequest);

                if (topupResponse.getStatusCode() == 1) {
                    buyInternetPackageResponse.setError(false);

                    if (buyInternetPackageRequest.getPaymentMethod().equals(PaymentMethod.DIGITAL_CREDIT_PAYMENT)) {
                        PaymentDataResponse<PaymentDataResponse.DigitalCreditPaymentData> digitalCreditPaymentDataPaymentData = CommonUtil.getPaymentData(buyInternetPackageRequest.getPaymentDataJson());
                        ResponseDto<DigitalCreditConfirmPaymentResponse> creditConfirmPaymentResponseResponseDto = digitalCreditService.confirmPayment(DigitalCreditConfirmPaymentRequest.builder()
                                .digitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                                        .digitalCreditProvider(DigitalCreditProvider.get(digitalCreditPaymentDataPaymentData.getPaymentData().getDigitalCreditProvider()))
                                        .businessCode(digitalCreditPaymentDataPaymentData.getPaymentData().getBusinessCode())
                                        .build())
                                .digitalCreditPaymentType(DigitalCreditPaymentType.Payment)
                                .paymentId(digitalCreditPaymentResponse.getPaymentId())
                                .build());

                        if (creditConfirmPaymentResponseResponseDto.isError()) {
                            CommonUtil.logError(RayanMehrEcharge.class.getSimpleName(), "buyInternetPackage", "Error in settle Digital credit payment",
                                    ServiceLogsDto.builder()
                                            .input(String.format("PaymentId : %S  ",digitalCreditPaymentResponse.paymentId))
                                            .output(String.format("PaymentId : %S - RRN : ", digitalCreditPaymentResponse.paymentId, depositPaymentResponse.getRrn()))
                                            .build());
                        }
                    }

                } else {
                    buyInternetPackageResponse.setError(true);

                    CommonUtil.logError(RayanMehrEcharge.class.getSimpleName(), "buyInternetPackage", "Status Code : "
                            + String.valueOf(topupResponse.getStatusCode()), ServiceLogsDto.builder()
                            .input(CommonUtil.toJson(topupRequest))
                            .output(CommonUtil.toJson(topupResponse))
                            .build());

                    //Rollback Transaction
                    switch (buyInternetPackageRequest.getPaymentMethod()) {
                        case BANK_CARD_MPG:
                        case DEPOSIT:
                            RollbackTransactionRequest rollbackTransactionRequest = new RollbackTransactionRequest();
                            rollbackTransactionRequest.setReferenceId(buyInternetPackageResponse.getTrackerId());
                            ResponseDto<RollbackTransactionResponse> rollbackTransaction = paymentService.rollbackTransaction(rollbackTransactionRequest);

                            if (rollbackTransaction.isError()) {

                                buyInternetPackageResponse.setRollbackTransactionError(true);
                                buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد در صورت کسر مبلغ از حساب شما و عدم بازگشت مبلغ لطفا با پشتیبانی تماس بگیرید.");

                            } else {
                                if (rollbackTransaction.getResponseData().isStatus()) {
                                    buyInternetPackageResponse.setRollbackTransactionError(false);
                                    buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد در صورت کسر مبلغ از حساب شما حداکثر تا 72 ساعت کاری مبلغ تراکنش به حساب شما باز می گردد");
                                } else {
                                    buyInternetPackageResponse.setRollbackTransactionError(true);
                                    buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد در صورت کسر مبلغ از حساب شما و عدم بازگشت مبلغ لطفا با پشتیبانی تماس بگیرید.");
                                }
                            }

                            break;

                        case DIGITAL_CREDIT_PAYMENT:

                            PaymentDataResponse<PaymentDataResponse.DigitalCreditPaymentData> digitalCreditPaymentDataPaymentData = CommonUtil.getPaymentData(buyInternetPackageRequest.getPaymentDataJson());

                            digitalCreditService = new DigitalCreditService();
                            DigitalCreditRollbackPaymentRequest digitalCreditRollbackPaymentRequest = new DigitalCreditRollbackPaymentRequest();
                            digitalCreditRollbackPaymentRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                                    .digitalCreditProvider(DigitalCreditProvider.get(digitalCreditPaymentDataPaymentData.getPaymentData().getDigitalCreditProvider()))
                                    .businessCode(digitalCreditPaymentDataPaymentData.getPaymentData().getBusinessCode())
                                    .build());

                            digitalCreditRollbackPaymentRequest.setPaymentId(digitalCreditPaymentResponse.getPaymentId());
                            digitalCreditRollbackPaymentRequest.setDigitalCreditPaymentType(DigitalCreditPaymentType.Payment);
                            ResponseDto<DigitalCreditRollbackPaymentResponse> digitalCreditRollbackPaymentResponseDto = digitalCreditService.rollbackPayment(digitalCreditRollbackPaymentRequest);

                            if (digitalCreditRollbackPaymentResponseDto.isError()) {

                                buyInternetPackageResponse.setRollbackTransactionError(true);
                                buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد در صورت کسر مبلغ از اعتبار دیجیتال شما و عدم بازگشت مبلغ لطفا با پشتیبانی تماس بگیرید.");

                            } else {
                                DigitalCreditRollbackPaymentResponse digitalCreditRollbackPaymentResponse = digitalCreditRollbackPaymentResponseDto.getResponseData();

                                if (digitalCreditRollbackPaymentResponse.isSuccess()) {
                                    buyInternetPackageResponse.setRollbackTransactionError(false);
                                    buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد");
                                } else {

                                    buyInternetPackageResponse.setRollbackTransactionError(true);
                                    buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد در صورت کسر مبلغ از اعتبار دیجیتال شما شما و عدم بازگشت مبلغ لطفا با پشتیبانی تماس بگیرید.");

                                }
                            }

                            break;

                        case WALLET:

                            WalletService walletService = new WalletService();
                            ReverseWalletTransactionResponse reverseWalletTransactionResponse = walletService.reverseWalletTransaction(ReverseWalletTransactionRequest
                                    .builder()
                                    .trackerId(buyInternetPackageResponse.getTrackNumber())
                                    .build()).getResponseData();

                            if (reverseWalletTransactionResponse.isError()) {
                                buyInternetPackageResponse.setRollbackTransactionError(true);
                                buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد در صورت کسر مبلغ از کیف پول شما و عدم بازگشت مبلغ لطفا با پشتیبانی تماس بگیرید.");
                            } else {
                                buyInternetPackageResponse.setRollbackTransactionError(false);
                                buyInternetPackageResponse.setErrorMessage("خرید بسته اینترنت با خطا مواجه شد");
                            }

                            break;

                    }
                }

            } catch (RemoteException e) {
                buyInternetPackageResponse.setError(true);
                buyInternetPackageResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
                CommonUtil.logError(RayanMehrEcharge.class.getSimpleName(), "buyInternetPackage", e.getMessage(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(topupRequest))
                        .output(e.toString())
                        .build());
            }

        } else {
            buyInternetPackageResponse.setError(true);
            buyInternetPackageResponse.setErrorMessage(errorPayMessage);
            buyInternetPackageResponse.setSuccessfulPayment(false);
        }

        return buyInternetPackageResponse;
    }

}
