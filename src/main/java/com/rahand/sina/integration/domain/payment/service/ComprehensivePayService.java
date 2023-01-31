package com.rahand.sina.integration.domain.payment.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.PaymentDataResponse;
import com.rahand.common.dto.PaymentMethodConfigRequest;
import com.rahand.common.dto.PaymentMethodConfigResponse;
import com.rahand.common.dto.ResponseDto;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.common.enums.PaymentTransactionStatus;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.DynamicPinProcessType;
import com.rahand.sina.integration.domain.bank.repository.CardRepository;
import com.rahand.sina.integration.domain.bank.service.CardService;
import com.rahand.sina.integration.domain.bank.service.DepositService;
import com.rahand.sina.integration.domain.digitalcredit.dto.*;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditPaymentType;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditProvider;
import com.rahand.sina.integration.domain.digitalcredit.repository.DigitalCreditRepository;
import com.rahand.sina.integration.domain.digitalcredit.service.DigitalCreditService;
import com.rahand.sina.integration.domain.payment.dto.*;
import com.rahand.sina.integration.domain.payment.service.spec.Pay;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;
import com.rahand.sina.lib.repository.MainRepository;
import com.rahand.sina.lib.wallet.dto.*;
import com.rahand.sina.lib.wallet.service.WalletService;

import java.time.LocalDateTime;
import java.util.*;

public class ComprehensivePayService implements Pay {

    @Override
    public PaymentResponse pay(PaymentRequest paymentRequest) {

        PaymentResponse paymentResponse = new PaymentResponse();
        PaymentMethod paymentMethod = CommonUtil.getPaymentData(paymentRequest.getPaymentDataJson()).getPaymentMethod();

        switch (paymentMethod) {
            case WALLET:
                PaymentDataResponse<PaymentDataResponse.WalletPaymentData> walletPaymentData = CommonUtil.getPaymentData(paymentRequest.getPaymentDataJson());

                WalletService walletService = new WalletService();

                PayWalletRequest payWalletRequest = PayWalletRequest.builder()
                        .userId(paymentRequest.getUserId())
                        .amount(paymentRequest.getAmount())
                        .password(walletPaymentData.getPaymentData().getPassword())
                        .pan(walletPaymentData.getPaymentData().getPan())
                        .build();

                ResponseDto<PayWalletResponse> payWalletResponseDto = walletService.payByWallet(payWalletRequest);

                if (payWalletResponseDto.isError()) {
                    paymentResponse.setError(true);
                    paymentResponse.setErrorMessage(payWalletResponseDto.getMessage());
                    paymentResponse.setMessage(payWalletResponseDto.getMessage());
                } else {
                    PayWalletResponse payWalletResponse = payWalletResponseDto.getResponseData();

                    paymentResponse.setAmount(payWalletResponse.getAmount());
                    paymentResponse.setSource(payWalletResponse.getSource());
                    paymentResponse.setPaymentTransactionStatus(payWalletResponse.getPaymentTransactionStatus());
                    paymentResponse.setRrn(payWalletResponse.getRrn());
                    paymentResponse.setTrackerId(payWalletResponse.getTrackerId());
                    paymentResponse.setTrackNumber(payWalletResponse.getTrackNumber());
                    paymentResponse.setTransactionDate(payWalletResponse.getTransactionDate());
                    paymentResponse.setPersianTransactionDate(payWalletResponse.getPersianTransactionDate());
                    paymentResponse.setPaymentMethod(paymentMethod);
                    paymentResponse.setTitle(paymentRequest.getTitle());
                    paymentResponse.setInformation(paymentRequest.getInformation());
                    paymentResponse.setDefaultReceipt(paymentResponse.getReceipt());
                }

                break;

            case DIGITAL_CREDIT_PAYMENT:
                PaymentDataResponse<PaymentDataResponse.DigitalCreditPaymentData> digitalCreditPaymentDataPaymentData = CommonUtil.getPaymentData(paymentRequest.getPaymentDataJson());
                DigitalCreditService digitalCreditService = new DigitalCreditService();
                DigitalCreditPaymentRequest digitalCreditPaymentRequest = new DigitalCreditPaymentRequest();
                digitalCreditPaymentRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                        .digitalCreditProvider(DigitalCreditProvider.get(digitalCreditPaymentDataPaymentData.getPaymentData().getDigitalCreditProvider()))
                        .businessCode(digitalCreditPaymentDataPaymentData.getPaymentData().getBusinessCode())
                        .build());
                digitalCreditPaymentRequest.setPaymentId(UUID.randomUUID().toString());
                digitalCreditPaymentRequest.setPan(digitalCreditPaymentDataPaymentData.getPaymentData().getPan());
                digitalCreditPaymentRequest.setAmount(paymentRequest.getAmount());
                digitalCreditPaymentRequest.setOrderId(YaghutUtil.generateOrderId());
                digitalCreditPaymentRequest.setDescription(paymentRequest.getDigitalCreditPaymentExtraInfo().getDescription());
                digitalCreditPaymentRequest.setMerchantName(paymentRequest.getDigitalCreditPaymentExtraInfo().getMerchantName());
                digitalCreditPaymentRequest.setTerminalId(paymentRequest.getDigitalCreditPaymentExtraInfo().getTerminalId());
                digitalCreditPaymentRequest.setMerchantId(paymentRequest.getDigitalCreditPaymentExtraInfo().getMerchantId());
                digitalCreditPaymentRequest.setPspCode(paymentRequest.getDigitalCreditPaymentExtraInfo().getReceivingInstitutionIdCode());
                digitalCreditPaymentRequest.setReceivingInstitutionIdCode(paymentRequest.getDigitalCreditPaymentExtraInfo().getReceivingInstitutionIdCode());
                digitalCreditPaymentRequest.setProductType(paymentRequest.getDigitalCreditPaymentExtraInfo().getProductType());

                ResponseDto<DigitalCreditPaymentResponse> digitalCreditPaymentResponseResponseDto = digitalCreditService.payment(digitalCreditPaymentRequest);

                if (digitalCreditPaymentResponseResponseDto.isError()) {
                    paymentResponse.setError(true);
                    paymentResponse.setErrorMessage(digitalCreditPaymentResponseResponseDto.getMessage());
                    paymentResponse.setMessage(digitalCreditPaymentResponseResponseDto.getMessage());
                } else {
                    DigitalCreditPaymentResponse digitalCreditPaymentResponse = digitalCreditPaymentResponseResponseDto.getResponseData();
                    paymentResponse.setAmount(digitalCreditPaymentRequest.getAmount());
                    paymentResponse.setRrn(digitalCreditPaymentResponse.getRrn());
                    paymentResponse.setTrackerId(digitalCreditPaymentRequest.getOrderId());
                    paymentResponse.setTrackNumber(digitalCreditPaymentResponse.paymentId);
                    LocalDateTime transactionDate = LocalDateTime.now();
                    paymentResponse.setTransactionDate(transactionDate);
                    paymentResponse.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(transactionDate));
                    paymentResponse.setSource(digitalCreditPaymentRequest.getPan());
                    paymentResponse.setPaymentTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
                    paymentResponse.setPaymentMethod(paymentMethod);
                    paymentResponse.setTitle(paymentRequest.getTitle());
                    paymentResponse.setInformation(paymentRequest.getInformation());
                    paymentResponse.setDefaultReceipt(paymentResponse.getReceipt());
                }

                break;

            case DEPOSIT:
                PaymentDataResponse<PaymentDataResponse.DepositPaymentData> depositPaymentData = CommonUtil.getPaymentData(paymentRequest.getPaymentDataJson());

                PaymentService depositPaymentService = new PaymentService();

                DepositPaymentRequest depositPaymentRequest = DepositPaymentRequest.builder()
                        .userId(paymentRequest.getUserId())
                        .paymentServiceId(paymentRequest.getPaymentServiceId())
                        .amount(paymentRequest.getAmount())
                        .cif(depositPaymentData.getPaymentData().getCif())
                        .depositNumber(depositPaymentData.getPaymentData().getDepositNumber())
                        .build();

                ResponseDto<DepositPaymentResponse> depositPaymentResponseDto = depositPaymentService.payByDeposit(depositPaymentRequest);

                if (depositPaymentResponseDto.isError()) {
                    paymentResponse.setError(true);
                    paymentResponse.setErrorMessage(depositPaymentResponseDto.getMessage());
                    paymentResponse.setMessage(depositPaymentResponseDto.getMessage());
                } else {
                    DepositPaymentResponse depositPaymentResponse = depositPaymentResponseDto.getResponseData();

                    paymentResponse.setAmount(depositPaymentResponse.getAmount());
                    paymentResponse.setRrn(depositPaymentResponse.getRrn());
                    paymentResponse.setTrackerId(depositPaymentResponse.getTrackerId());
                    paymentResponse.setTrackNumber(depositPaymentResponse.getTrackNumber());
                    paymentResponse.setTransactionDate(depositPaymentResponse.getTransactionDate());
                    paymentResponse.setPersianTransactionDate(depositPaymentResponse.getPersianTransactionDate());
                    paymentResponse.setSource(depositPaymentRequest.getDepositNumber());
                    paymentResponse.setPaymentTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
                    paymentResponse.setPaymentMethod(paymentMethod);
                    paymentResponse.setTitle(paymentRequest.getTitle());
                    paymentResponse.setInformation(paymentRequest.getInformation());
                    paymentResponse.setDefaultReceipt(paymentResponse.getReceipt());

                }

                break;

            case BANK_CARD_MPG:
                PaymentDataResponse<PaymentDataResponse.CardPaymentData> cardMpgPaymentData = CommonUtil.getPaymentData(paymentRequest.getPaymentDataJson());

                PaymentService mpgPaymentService = new PaymentService();

                CardPaymentRequest cardPaymentRequest = CardPaymentRequest.builder()
                        .userId(paymentRequest.getUserId())
                        .paymentServiceId(paymentRequest.getPaymentServiceId())
                        .amount(paymentRequest.getAmount())
                        .pan(cardMpgPaymentData.getPaymentData().getPan())
                        .cvv2(cardMpgPaymentData.getPaymentData().getCvv2())
                        .expireDate(cardMpgPaymentData.getPaymentData().getExpireDate())
                        .pin(cardMpgPaymentData.getPaymentData().getPin())
                        .build();

                ResponseDto<CardPaymentResponse> mpgPaymentResponseDto = mpgPaymentService.mpgPay(cardPaymentRequest);

                if (mpgPaymentResponseDto.isError()) {
                    paymentResponse.setError(true);
                    paymentResponse.setErrorMessage(mpgPaymentResponseDto.getMessage());
                    paymentResponse.setMessage(mpgPaymentResponseDto.getMessage());
                } else {
                    CardPaymentResponse cardPaymentResponse = mpgPaymentResponseDto.getResponseData();

                    paymentResponse.setAmount(cardPaymentResponse.getAmount());
                    paymentResponse.setRrn(cardPaymentResponse.getRrn());
                    paymentResponse.setTrackerId(cardPaymentResponse.getTrackerId());
                    paymentResponse.setTrackNumber(cardPaymentResponse.getTrackNumber());
                    paymentResponse.setTransactionDate(cardPaymentResponse.getTransactionDate());
                    paymentResponse.setPersianTransactionDate(cardPaymentResponse.getPersianTransactionDate());
                    paymentResponse.setSource(cardPaymentRequest.getPan());
                    paymentResponse.setPaymentTransactionStatus(PaymentTransactionStatus.SUCCESSFUL);
                    paymentResponse.setPaymentMethod(paymentMethod);
                    paymentResponse.setTitle(paymentRequest.getTitle());
                    paymentResponse.setInformation(paymentRequest.getInformation());
                    paymentResponse.setDefaultReceipt(paymentResponse.getReceipt());

                }

                break;

            case BANK_CARD_IPG:
                paymentResponse.setError(true);
                paymentResponse.setErrorMessage("سرویس پرداخت از درگاه وب در حال حاضر در دسترس نیست.");
                paymentResponse.setExtraErrorData("IpgPaymentNotImplement");
                CommonUtil.logError(getClass().getSimpleName(), "pay", paymentResponse.getExtraErrorData());
                break;


            default:
                paymentResponse.setError(true);
                paymentResponse.setErrorMessage("سرویس پرداخت انتخاب شده در حال حاضر در دسترس نیست.");
                paymentResponse.setExtraErrorData("InvalidPaymentMethode");
                CommonUtil.logError(getClass().getSimpleName(), "pay", paymentResponse.getExtraErrorData());
        }

        return paymentResponse;
    }

    @Override
    public RollBackPayResponse rollBack(RollBackPayRequest rollBackPayRequest) {

        RollBackPayResponse rollBackPayResponse = new RollBackPayResponse();

        switch (rollBackPayRequest.getPaymentMethod()) {

            case WALLET:
                WalletService walletService = new WalletService();
                ReverseWalletTransactionRequest reverseWalletTransactionRequest = new ReverseWalletTransactionRequest();
                reverseWalletTransactionRequest.setTrackerId(rollBackPayRequest.getTrackerId());

                ResponseDto<ReverseWalletTransactionResponse> reverseWalletTransactionResponse = walletService.reverseWalletTransaction(reverseWalletTransactionRequest);

                if (reverseWalletTransactionResponse.isError()) {
                    rollBackPayResponse.setError(true);
                    rollBackPayResponse.setErrorMessage(reverseWalletTransactionResponse.getMessage());
                    rollBackPayResponse.setMessage(reverseWalletTransactionResponse.getMessage());

                } else {
                    rollBackPayResponse.setStatus(reverseWalletTransactionResponse.getResponseData().isStatus());
                    rollBackPayResponse.setErrorMessage(reverseWalletTransactionResponse.getMessage());
                    rollBackPayResponse.setMessage(reverseWalletTransactionResponse.getMessage());
                }
                break;

            case DIGITAL_CREDIT_PAYMENT:

                PaymentDataResponse<PaymentDataResponse.DigitalCreditPaymentData> digitalCreditPaymentDataPaymentData = CommonUtil.getPaymentData(rollBackPayRequest.getPaymentDataJson());

                DigitalCreditService digitalCreditService = new DigitalCreditService();
                DigitalCreditRollbackPaymentRequest digitalCreditRollbackPaymentRequest = new DigitalCreditRollbackPaymentRequest();
                digitalCreditRollbackPaymentRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                        .digitalCreditProvider(DigitalCreditProvider.get(digitalCreditPaymentDataPaymentData.getPaymentData().getDigitalCreditProvider()))
                        .businessCode(digitalCreditPaymentDataPaymentData.getPaymentData().getBusinessCode())
                        .build());

                digitalCreditRollbackPaymentRequest.setPaymentId(rollBackPayRequest.getTrackerId());
                digitalCreditRollbackPaymentRequest.setDigitalCreditPaymentType(DigitalCreditPaymentType.Payment);
                ResponseDto<DigitalCreditRollbackPaymentResponse> digitalCreditRollbackPaymentResponseDto = digitalCreditService.rollbackPayment(digitalCreditRollbackPaymentRequest);
                if (digitalCreditRollbackPaymentResponseDto.isError()) {
                    rollBackPayResponse.setError(true);
                    rollBackPayResponse.setErrorMessage(digitalCreditRollbackPaymentResponseDto.getMessage());
                    rollBackPayResponse.setMessage(digitalCreditRollbackPaymentResponseDto.getMessage());
                } else {
                    DigitalCreditRollbackPaymentResponse digitalCreditRollbackPaymentResponse = digitalCreditRollbackPaymentResponseDto.getResponseData();
                    rollBackPayResponse.setStatus(digitalCreditRollbackPaymentResponse.isSuccess());
                    rollBackPayResponse.setErrorMessage(digitalCreditRollbackPaymentResponse.getErrorMessage());
                    rollBackPayResponse.setMessage(digitalCreditRollbackPaymentResponse.getErrorMessage());
                }

                break;

            case DEPOSIT:

                PaymentService depositPaymentService = new PaymentService();
                RollbackTransactionRequest depositRollbackTransactionRequest = new RollbackTransactionRequest();
                depositRollbackTransactionRequest.setReferenceId(rollBackPayRequest.getTrackerId());
                ResponseDto<RollbackTransactionResponse> depositRollbackTransactionResponse = depositPaymentService.rollbackTransaction(depositRollbackTransactionRequest);

                if (depositRollbackTransactionResponse.isError()) {

                    rollBackPayResponse.setError(true);
                    rollBackPayResponse.setErrorMessage(depositRollbackTransactionResponse.getMessage());
                    rollBackPayResponse.setMessage(depositRollbackTransactionResponse.getMessage());

                } else {
                    rollBackPayResponse.setStatus(depositRollbackTransactionResponse.getResponseData().isStatus());
                    rollBackPayResponse.setErrorMessage(depositRollbackTransactionResponse.getMessage());
                    rollBackPayResponse.setMessage(depositRollbackTransactionResponse.getMessage());
                }

                break;

            case BANK_CARD_MPG:

                PaymentService mpgPaymentService = new PaymentService();
                RollbackTransactionRequest mpgRollbackTransactionRequest = new RollbackTransactionRequest();
                mpgRollbackTransactionRequest.setReferenceId(rollBackPayRequest.getTrackerId());
                ResponseDto<RollbackTransactionResponse> mpgRollbackTransactionResponse = mpgPaymentService.rollbackTransaction(mpgRollbackTransactionRequest);

                if (mpgRollbackTransactionResponse.isError()) {

                    rollBackPayResponse.setError(true);
                    rollBackPayResponse.setErrorMessage(mpgRollbackTransactionResponse.getMessage());
                    rollBackPayResponse.setMessage(mpgRollbackTransactionResponse.getMessage());

                } else {
                    rollBackPayResponse.setStatus(mpgRollbackTransactionResponse.getResponseData().isStatus());
                    rollBackPayResponse.setErrorMessage(mpgRollbackTransactionResponse.getMessage());
                    rollBackPayResponse.setMessage(mpgRollbackTransactionResponse.getMessage());
                }

                break;

            default:
                rollBackPayResponse.setError(true);
                rollBackPayResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                rollBackPayResponse.setMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                rollBackPayResponse.setExtraErrorData("InvalidPaymentMethode");
                CommonUtil.logError(getClass().getSimpleName(), "rollBack", "InvalidPaymentMethode");
        }

        return rollBackPayResponse;
    }

    public PaymentMethodConfigResponse getPaymentMethodConfig(PaymentMethodConfigRequest paymentMethodConfigRequest) {

        PaymentMethodConfigResponse paymentMethodConfigResponse;

        PaymentMethodConfigResponse.PayMethodConfig paymentMethodConfig = PaymentMethodConfigResponse.PayMethodConfig.builder()
                .digitalCreditPayConfig(PaymentMethodConfigResponse.DigitalCreditPayConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.DIGITAL_CREDIT_PAYMENT)))
                        .digitalCredits(Arrays.asList())
                        .build())
                .walletPayConfig(PaymentMethodConfigResponse.WalletPayConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.WALLET)))
                        .walletList(Arrays.asList())
                        .build())
                .depositPayConfig(PaymentMethodConfigResponse.DepositPayConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.DEPOSIT)))
                        .depositList(Arrays.asList())
                        .securityCodeProcess("Process_MPSina_Sina_MP_GenerateSecurityCode")
                        .build())
                .mpgPayConfig(PaymentMethodConfigResponse.MpgPayConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.BANK_CARD_MPG)))
                        .cardList(Arrays.asList())
                        .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                        .dynamicPinProcessType(DynamicPinProcessType.PAYMENT.getName())
                        .build())
                .transferConfig(PaymentMethodConfigResponse.CardTransferConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.TRANSFER_CARD)))
                        .cardList(Arrays.asList())
                        .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                        .dynamicPinProcessType(DynamicPinProcessType.TRANSFER_TO.getName())
                        .build())
                .getCardBalanceConfig(PaymentMethodConfigResponse.CardInquiryConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.BANK_CARD_INQUIRY_BALANCE)))
                        .cardList(Arrays.asList())
                        .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                        .dynamicPinProcessType(DynamicPinProcessType.BALANCE_INQUIRY.getName())
                        .build())
                .getStatementsConfig(PaymentMethodConfigResponse.CardInquiryConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.BANK_CARD_GET_STATEMENTS)))
                        .cardList(Arrays.asList())
                        .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                        .dynamicPinProcessType(DynamicPinProcessType.BALANCE_INQUIRY.getName())
                        .build())
                .ipgPayConfig(PaymentMethodConfigResponse.IpgPayConfig.builder()
                        .active(String.valueOf(paymentMethodConfigRequest.getActivePaymentMethods()
                                .contains(PaymentMethod.BANK_CARD_IPG)))
                        .url("")
                        .build()).build();


        PaymentMethodConfigResponse.WalletPayConfig walletPayConfig;
        PaymentMethodConfigResponse.MpgPayConfig mpgPayConfig;
        PaymentMethodConfigResponse.CardTransferConfig cardTransferConfig;
        PaymentMethodConfigResponse.CardInquiryConfig getCardBalanceConfig;
        PaymentMethodConfigResponse.CardInquiryConfig getCardStatementsConfig;
        PaymentMethodConfigResponse.DepositPayConfig depositPayConfig;
        PaymentMethodConfigResponse.IpgPayConfig ipgPayConfig;
        PaymentMethodConfigResponse.DigitalCreditPayConfig digitalCreditPayConfig;


        MainRepository mainRepository = new MainRepository();
        Optional<String> userCif = mainRepository.getAuthenticatedUserCif(paymentMethodConfigRequest.getUserId());
        Optional<String> userCahannelData = YaghutUserService.getInstance().getChannelUserData(paymentMethodConfigRequest.getUserId());

        List<PaymentMethod> activePaymentMethod = paymentMethodConfigRequest.getActivePaymentMethods();

        if (activePaymentMethod.contains(PaymentMethod.DIGITAL_CREDIT_PAYMENT)) {

            DigitalCreditRepository digitalCreditRepository = new DigitalCreditRepository();
            Optional<List<DigitalCreditDossiersDto>> optionalDigitalCreditDossiers = digitalCreditRepository.getUserDigitalCreditDossiers(paymentMethodConfigRequest.getUserId());

            if (optionalDigitalCreditDossiers.isPresent()) {

                List<DigitalCreditDossiersDto> digitalCreditDossiers = optionalDigitalCreditDossiers.get();
                List<PaymentMethodConfigResponse.DigitalCreditPayConfig.DigitalCredit> digitalCredits = new ArrayList<>();

                for (DigitalCreditDossiersDto digitalCreditDossiersDto : digitalCreditDossiers) {
                    digitalCredits.add(PaymentMethodConfigResponse.DigitalCreditPayConfig.DigitalCredit.builder()
                            .title(digitalCreditDossiersDto.getTitle())
                            .pan(digitalCreditDossiersDto.getPan())
                            .availableFund(String.valueOf(digitalCreditDossiersDto.getAvailableFund().longValue()))
                            .totalFund(String.valueOf(digitalCreditDossiersDto.getTotalFund().longValue()))
                            .dossierNumber(digitalCreditDossiersDto.getDossierNumber())
                            .digitalCreditProvider(digitalCreditDossiersDto.getDigitalCreditProviderDossierInfo().getDigitalCreditProvider().getName())
                            .businessCode(digitalCreditDossiersDto.getDigitalCreditProviderDossierInfo().getBusinessCode())
                            .build());
                }

                digitalCreditPayConfig = PaymentMethodConfigResponse.DigitalCreditPayConfig.builder()
                        .active("true")
                        .digitalCredits(digitalCredits)
                        .build();
            } else {
                digitalCreditPayConfig = PaymentMethodConfigResponse.DigitalCreditPayConfig.builder()
                        .active("false")
                        .digitalCredits(Arrays.asList())
                        .build();
            }

            paymentMethodConfig.setDigitalCreditPayConfig(digitalCreditPayConfig);

        }

        if (activePaymentMethod.contains(PaymentMethod.WALLET)) {
            WalletService walletService = new WalletService();
            WalletInfoRequest walletInfoRequest = WalletInfoRequest.builder().userId(paymentMethodConfigRequest.getUserId()).build();
            ResponseDto<WalletInfoResponse> walletInfoResponse = walletService.getWalletInfo(walletInfoRequest);
            if (walletInfoResponse.isError()) {
                CommonUtil.logError(getClass().getSimpleName(), "getPaymentMethodConfig", "errorInGetWalletInfo");
                walletPayConfig = PaymentMethodConfigResponse.WalletPayConfig.builder()
                        .active("false")
                        .build();
                paymentMethodConfig.setWalletPayConfig(walletPayConfig);
            } else {
                walletPayConfig = PaymentMethodConfigResponse.WalletPayConfig.builder()
                        .active("true")
                        .walletList(Arrays.asList(PaymentMethodConfigResponse.WalletPayConfig.WalletPay.builder()
                                .pan(walletInfoResponse.getResponseData().getPan())
                                .balance(walletInfoResponse.getResponseData().getBalance().toPlainString()).build()))
                        .build();

                paymentMethodConfig.setWalletPayConfig(walletPayConfig);
            }
        }

        if (activePaymentMethod.contains(PaymentMethod.DEPOSIT) && userCif.isPresent() && userCahannelData.isPresent()) {
            DepositService depositService = new DepositService();
            ResponseDto<DepositsResponse> depositsResponseDto = depositService.getDeposits(DepositsRequest.builder().cif(userCif.get()).build());
            if (depositsResponseDto.isError()) {
                CommonUtil.logError(getClass().getSimpleName(), "getPaymentMethodConfig", "errorInGetDeposits");
                depositPayConfig = PaymentMethodConfigResponse.DepositPayConfig.builder()
                        .active("false")
                        .depositList(Arrays.asList())
                        .securityCodeProcess("Process_MPSina_Sina_MP_GenerateSecurityCode")
                        .build();

                paymentMethodConfig.setDepositPayConfig(depositPayConfig);
            } else {
                List<PaymentMethodConfigResponse.DepositPayConfig.DepositPay> depositList = new ArrayList<>();
                for (DepositDto depositDto : depositsResponseDto.getResponseData().getDeposits()) {
                    depositList.add(PaymentMethodConfigResponse.DepositPayConfig.DepositPay.builder()
                            .cif(userCif.get())
                            .depositNumber(depositDto.getDepositNumber())
                            .depositTitle(depositDto.getDepositTitle())
                            .depositBalance(depositDto.getAvailableBalance().toPlainString())
                            .defaultDeposit("")
                            .build());
                }
                depositPayConfig = PaymentMethodConfigResponse.DepositPayConfig.builder()
                        .active(depositList.isEmpty() ? "false" : "true")
                        .depositList(depositList)
                        .securityCodeProcess("Process_MPSina_Sina_MP_GenerateSecurityCode")
                        .securityCodeActive(String.valueOf(paymentMethodConfigRequest.isDepositTransferSecurityCodeActive()))
                        .build();
                paymentMethodConfig.setDepositPayConfig(depositPayConfig);

            }
        } else {
            depositPayConfig = PaymentMethodConfigResponse.DepositPayConfig.builder()
                    .active("false")
                    .depositList(Arrays.asList())
                    .securityCodeProcess("Process_MPSina_Sina_MP_GenerateSecurityCode")
                    .build();

            paymentMethodConfig.setDepositPayConfig(depositPayConfig);
        }

        if (activePaymentMethod.contains(PaymentMethod.BANK_CARD_MPG)) {

            List<PaymentMethodConfigResponse.MpgPayConfig.MpgPay> cardList = new ArrayList<>();

            if (userCif.isPresent() && userCahannelData.isPresent()) {
                String bankIcon = IntegrationLibConfig.getProperty("MAIN_BANK_ICON_LINK");
                CardService cardService = new CardService();
                GetCardsRequest getCardsRequest = GetCardsRequest.builder().cif(userCif.get()).build();
                ResponseDto<GetCardsResponse> getCardsResponseDto = cardService.getCards(getCardsRequest);
                if (getCardsResponseDto.isError()) {
                    CommonUtil.logError(getClass().getSimpleName(), "getPaymentMethodConfig", "errorInGetBankCards");
                } else {
                    GetCardsResponse cardsResponse = getCardsResponseDto.getResponseData();
                    for (BankCardDto cardDto : cardsResponse.getCards()) {

                        cardList.add(PaymentMethodConfigResponse.MpgPayConfig.MpgPay.builder()
                                .cardNumber(cardDto.getPan())
                                .expireDate(cardDto.getPersianExpireDate())
                                .customerName(cardDto.getCustomerFirstName() + " " + cardDto.getCustomerLastname())
                                .bankName("بانک سینا")
                                .defaultCard("")
                                .bankIcon(bankIcon != null ? bankIcon : "")
                                .build());
                    }

                }
            }

            Optional<List<FavoriteCardDto>> favoriteCardsOptioanl = new CardRepository().getFavoritesCards(paymentMethodConfigRequest.getUserId());

            if (favoriteCardsOptioanl.isPresent()) {
                List<FavoriteCardDto> favoriteCards = favoriteCardsOptioanl.get();
                for (FavoriteCardDto favoriteCardDto : favoriteCards) {
                    cardList.add(PaymentMethodConfigResponse.MpgPayConfig.MpgPay.builder()
                            .cardNumber(favoriteCardDto.getCardNumber())
                            .expireDate(favoriteCardDto.getExpireDate().replace("/", ""))
                            .customerName(favoriteCardDto.getCustomerName())
                            .bankName(favoriteCardDto.getBankName())
                            .defaultCard("")
                            .bankIcon(favoriteCardDto.getBankIcon())
                            .build());
                }
            }

            cardList.add(PaymentMethodConfigResponse.MpgPayConfig.MpgPay.builder()
                    .cardNumber(null).expireDate(null).customerName(null).bankName(null).defaultCard(null).build());

//            Collections.reverse(cardList);
            mpgPayConfig = PaymentMethodConfigResponse.MpgPayConfig.builder()
                    .active("true")
                    .cardList(cardList)
                    .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                    .dynamicPinProcessType(DynamicPinProcessType.PAYMENT.getName())
                    .build();

            paymentMethodConfig.setMpgPayConfig(mpgPayConfig);

        }

        if (activePaymentMethod.contains(PaymentMethod.TRANSFER_CARD)) {

            List<PaymentMethodConfigResponse.CardTransferConfig.CardTransfer> cardList = new ArrayList<>();

            if (userCif.isPresent()) {
                CardService cardService = new CardService();
                GetCardsRequest getCardsRequest = GetCardsRequest.builder().cif(userCif.get()).build();
                ResponseDto<GetCardsResponse> getCardsResponseDto = cardService.getCards(getCardsRequest);
                if (getCardsResponseDto.isError()) {
                    CommonUtil.logError(getClass().getSimpleName(), "getPaymentMethodConfig", "errorInGetBankCards");
                    throw new CustomRuntimeException("مشکلی در ارتباط با فراخوانی لیست کارت های مقصد رخ داده است");
                } else {
                    GetCardsResponse cardsResponse = getCardsResponseDto.getResponseData();
                    for (BankCardDto cardDto : cardsResponse.getCards()) {

                        cardList.add(PaymentMethodConfigResponse.CardTransferConfig.CardTransfer.builder()
                                .cardNumber(cardDto.getPan())
                                .expireDate(cardDto.getPersianExpireDate())
                                .customerName(cardDto.getCustomerFirstName() + " " + cardDto.getCustomerLastname())
                                .bankName("بانک سینا")
                                .defaultCard("")
                                .build());
                    }

                }
            }

            if (cardList.isEmpty()) {
                throw new CustomRuntimeException("مشتری محترم کارت بانکی فعالی برای شما یافت نشد");
            }

            Collections.reverse(cardList);
            cardTransferConfig = PaymentMethodConfigResponse.CardTransferConfig.builder()
                    .active("true")
                    .cardList(cardList)
                    .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                    .dynamicPinProcessType(DynamicPinProcessType.TRANSFER_TO.getName())
                    .build();

            paymentMethodConfig.setTransferConfig(cardTransferConfig);

        }

        if (activePaymentMethod.contains(PaymentMethod.BANK_CARD_INQUIRY_BALANCE)) {

            List<PaymentMethodConfigResponse.CardInquiryConfig.CardInquiry> cardList = new ArrayList<>();


            if (userCif.isPresent()) {
                CardService cardService = new CardService();
                GetCardsRequest getCardsRequest = GetCardsRequest.builder().cif(userCif.get()).build();
                ResponseDto<GetCardsResponse> getCardsResponseDto = cardService.getCards(getCardsRequest);
                if (getCardsResponseDto.isError()) {
                    CommonUtil.logError(getClass().getSimpleName(), "getPaymentMethodConfig", "errorInGetBankCards");
                    throw new CustomRuntimeException("مشکلی در ارتباط با فراخوانی لیست کارت های مقصد رخ داده است");
                } else {
                    GetCardsResponse cardsResponse = getCardsResponseDto.getResponseData();
                    for (BankCardDto cardDto : cardsResponse.getCards()) {

                        cardList.add(PaymentMethodConfigResponse.CardInquiryConfig.CardInquiry.builder()
                                .cardNumber(cardDto.getPan())
                                .expireDate(cardDto.getPersianExpireDate())
                                .customerName(cardDto.getCustomerFirstName() + " " + cardDto.getCustomerLastname())
                                .bankName("بانک سینا")
                                .defaultCard("")
                                .build());
                    }

                }
            }

            if (cardList.isEmpty()) {
                throw new CustomRuntimeException("مشتری محترم کارت بانکی فعالی برای شما یافت نشد");
            }
            Collections.reverse(cardList);
            getCardBalanceConfig = PaymentMethodConfigResponse.CardInquiryConfig.builder()
                    .active("true")
                    .cardList(cardList)
                    .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                    .dynamicPinProcessType(DynamicPinProcessType.BALANCE_INQUIRY.getName())
                    .build();

            paymentMethodConfig.setGetCardBalanceConfig(getCardBalanceConfig);

        }

        if (activePaymentMethod.contains(PaymentMethod.BANK_CARD_GET_STATEMENTS)) {

            List<PaymentMethodConfigResponse.CardInquiryConfig.CardInquiry> cardList = new ArrayList<>();

            if (userCif.isPresent()) {
                CardService cardService = new CardService();
                GetCardsRequest getCardsRequest = GetCardsRequest.builder().cif(userCif.get()).build();
                ResponseDto<GetCardsResponse> getCardsResponseDto = cardService.getCards(getCardsRequest);
                if (getCardsResponseDto.isError()) {
                    CommonUtil.logError(getClass().getSimpleName(), "getPaymentMethodConfig", "errorInGetBankCards");
                    throw new CustomRuntimeException("مشکلی در ارتباط با فراخوانی لیست کارت های مقصد رخ داده است");
                } else {
                    GetCardsResponse cardsResponse = getCardsResponseDto.getResponseData();
                    for (BankCardDto cardDto : cardsResponse.getCards()) {

                        cardList.add(PaymentMethodConfigResponse.CardInquiryConfig.CardInquiry.builder()
                                .cardNumber(cardDto.getPan())
                                .expireDate(cardDto.getPersianExpireDate())
                                .customerName(cardDto.getCustomerFirstName() + " " + cardDto.getCustomerLastname())
                                .bankName("بانک سینا")
                                .defaultCard("")
                                .build());
                    }

                }
            }

            if (cardList.isEmpty()) {
                throw new CustomRuntimeException("مشتری محترم کارت بانکی فعالی برای شما یافت نشد");
            }

            Collections.reverse(cardList);
            getCardStatementsConfig = PaymentMethodConfigResponse.CardInquiryConfig.builder()
                    .active("true")
                    .cardList(cardList)
                    .dynamicPasswordCodeProcess("Process_MPSina_DynamicPasswordRequest")
                    .dynamicPinProcessType(DynamicPinProcessType.BALANCE_INQUIRY.getName())
                    .build();

            paymentMethodConfig.setGetStatementsConfig(getCardStatementsConfig);

        }

        if (activePaymentMethod.contains(PaymentMethod.BANK_CARD_IPG)) {
            ipgPayConfig = PaymentMethodConfigResponse.IpgPayConfig.builder()
                    .active("true")
                    .url(paymentMethodConfigRequest.getIpgUrl())
                    .build();
            paymentMethodConfig.setIpgPayConfig(ipgPayConfig);
        }

        paymentMethodConfigResponse = PaymentMethodConfigResponse.builder().payMethodConfig(paymentMethodConfig)
                .amount(paymentMethodConfigRequest.getAmount() != null ? paymentMethodConfigRequest.getAmount().toPlainString() : "0").build();

        return paymentMethodConfigResponse;

    }

}
