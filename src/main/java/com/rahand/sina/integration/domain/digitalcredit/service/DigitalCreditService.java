package com.rahand.sina.integration.domain.digitalcredit.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.digitalcredit.dto.*;
import com.rahand.sina.integration.domain.digitalcredit.enums.*;
import com.rahand.sina.integration.domain.digitalcredit.service.spec.DigitalCredit;
import com.rahand.sina.integration.provider.apsan.sevice.ApsanDigitalCreditService;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalCreditService {

    private DigitalCredit digitalCreditService;

    public DigitalCreditService() {
        digitalCreditService = new ApsanDigitalCreditService();
    }

    public ResponseDto<CreateDigitalCreditDossierResponse> createDossier(CreateDigitalCreditDossierRequest createDigitalCreditDossierRequest) {

        ResponseDto<CreateDigitalCreditDossierResponse> response = new ResponseDto<>();


        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = createDigitalCreditDossierRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {

            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                createDigitalCreditDossierRequest.setCreditGroup(digitalCreditProviderDossierInfo.getBusinessCode());
                CreateDigitalCreditDossierResponse createDigitalCreditDossierResponse = digitalCreditService.createDossier(createDigitalCreditDossierRequest);

                if (createDigitalCreditDossierResponse.isError()) {
                    response.setError(true);
                    response.setMessage(createDigitalCreditDossierResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(createDigitalCreditDossierResponse);
                }
                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        return response;
    }

    public ResponseDto<GetDigitalCreditDossiersResponse> getDigitalCreditDossiers(GetDigitalCreditDossiersRequest getDigitalCreditDossiersRequest) {

        ResponseDto<GetDigitalCreditDossiersResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = getDigitalCreditDossiersRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                getDigitalCreditDossiersRequest.setCreditGroup(digitalCreditProviderDossierInfo.getBusinessCode());
                GetDigitalCreditDossiersResponse getDigitalCreditDossiersResponse = digitalCreditService.getDigitalCreditDossiers(getDigitalCreditDossiersRequest);

                if (getDigitalCreditDossiersResponse.isError()) {
                    response.setError(true);
                    response.setMessage(getDigitalCreditDossiersResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(getDigitalCreditDossiersResponse);
                }
                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        return response;
    }

    public ResponseDto<GetDigitalCreditBillResponse> getDigitalCreditDossierBill(GetDigitalCreditBillRequest getDigitalCreditBillRequest) {

        ResponseDto<GetDigitalCreditBillResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = getDigitalCreditBillRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                GetDigitalCreditBillResponse getDigitalCreditBillResponse = digitalCreditService.getDigitalCreditDossierBill(getDigitalCreditBillRequest);

                if (getDigitalCreditBillResponse.isError()) {
                    response.setError(true);
                    response.setMessage(getDigitalCreditBillResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(getDigitalCreditBillResponse);
                }
                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        if (getDigitalCreditBillRequest.isMock()) {
            List<DigitalCreditBillDto> creditBillDtos = new ArrayList<>();
            creditBillDtos.add(DigitalCreditBillDto.builder()
                    .billId("1234")
                    .amount(new BigDecimal(0))
                    .withDrawableAmount(new BigDecimal(100000))
                    .preDebitAmount(new BigDecimal(0))
                    .payedAmount(new BigDecimal(0))
                    .fees(Arrays.asList())
                    .currency(Currency.IRR)
                    .respiteDate(LocalDateTime.now())
                    .persianRespiteDate("1401/10/14")
                    .startCycleDate(CommonUtil.perisanDateToLocalDateTime("1401/10/01"))
                    .persianStartCycleDate("1401/10/01")
                    .endCycleDate(CommonUtil.perisanDateToLocalDateTime("1401/10/30"))
                    .persianEndCycleDate("1401/10/30")
                    .clearingStatus(DigitalCreditDossierInvoiceClearingStatus.NO_SETTLED)
                    .cycleStatus(DigitalCreditDossierCycleStatus.OPEN)
                    .build());

            creditBillDtos.add(DigitalCreditBillDto.builder()
                    .billId("123456")
                    .amount(new BigDecimal(0))
                    .withDrawableAmount(new BigDecimal(0))
                    .preDebitAmount(new BigDecimal(0))
                    .payedAmount(new BigDecimal(0))
                    .fees(Arrays.asList())
                    .currency(Currency.IRR)
                    .respiteDate(LocalDateTime.now())
                    .persianRespiteDate("1401/10/05")
                    .startCycleDate(CommonUtil.perisanDateToLocalDateTime("1401/09/01"))
                    .persianStartCycleDate("1401/09/01")
                    .endCycleDate(CommonUtil.perisanDateToLocalDateTime("1401/09/30"))
                    .persianEndCycleDate("1401/09/30")
                    .clearingStatus(DigitalCreditDossierInvoiceClearingStatus.NO_SETTLED)
                    .cycleStatus(DigitalCreditDossierCycleStatus.OPEN)
                    .build());

            GetDigitalCreditBillResponse getDigitalCreditBillResponse = new GetDigitalCreditBillResponse();
            getDigitalCreditBillResponse.setError(false);
            getDigitalCreditBillResponse.setDigitalCreditBills(creditBillDtos);
            getDigitalCreditBillResponse.setCount(creditBillDtos.size());

            response.setError(false);
            response.setResponseData(getDigitalCreditBillResponse);
        }

        return response;

    }

    public ResponseDto<DigitalCreditPaymentResponse> payment(DigitalCreditPaymentRequest digitalCreditPaymentRequest) {

        ResponseDto<DigitalCreditPaymentResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = digitalCreditPaymentRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                DigitalCreditPaymentResponse digitalCreditPaymentResponse = digitalCreditService.payment(digitalCreditPaymentRequest);

                if (digitalCreditPaymentResponse.isError()) {
                    response.setError(true);
                    response.setMessage(digitalCreditPaymentResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(digitalCreditPaymentResponse);
                }
                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        return response;
    }

    public ResponseDto<DigitalCreditConfirmPaymentResponse> confirmPayment(DigitalCreditConfirmPaymentRequest digitalCreditConfirmPaymentRequest) {

        ResponseDto<DigitalCreditConfirmPaymentResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = digitalCreditConfirmPaymentRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                DigitalCreditConfirmPaymentResponse digitalCreditConfirmPaymentResponse = digitalCreditService.confirmPayment(digitalCreditConfirmPaymentRequest);

                if (digitalCreditConfirmPaymentResponse.isError()) {
                    response.setError(true);
                    response.setMessage(digitalCreditConfirmPaymentResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(digitalCreditConfirmPaymentResponse);
                }
                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        return response;

    }

    public ResponseDto<DigitalCreditRollbackPaymentResponse> rollbackPayment(DigitalCreditRollbackPaymentRequest digitalCreditRollbackPaymentRequest) {

        ResponseDto<DigitalCreditRollbackPaymentResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = digitalCreditRollbackPaymentRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();

                DigitalCreditRollbackPaymentResponse digitalCreditRollbackPaymentResponse = digitalCreditService.rollbackPayment(digitalCreditRollbackPaymentRequest);

                if (digitalCreditRollbackPaymentResponse.isError()) {
                    response.setError(true);
                    response.setMessage(digitalCreditRollbackPaymentResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(digitalCreditRollbackPaymentResponse);
                }
                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        return response;

    }

    public ResponseDto<DigitalCreditInquiryTransactionResponse> inquiryTransaction(DigitalCreditInquiryTransactionRequest digitalCreditInquiryTransactionRequest) {

        ResponseDto<DigitalCreditInquiryTransactionResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = digitalCreditInquiryTransactionRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                DigitalCreditInquiryTransactionResponse digitalCreditInquiryTransactionResponse = digitalCreditService.inquiryTransaction(digitalCreditInquiryTransactionRequest);

                if (digitalCreditInquiryTransactionResponse.isError()) {
                    response.setError(true);
                    response.setMessage(digitalCreditInquiryTransactionResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(digitalCreditInquiryTransactionResponse);
                }

                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        return response;
    }

    public ResponseDto<GetDigitalCreditBillDetailedTransactionResponse> getBillDetailedTransactions(GetDigitalCreditBillDetailedTransactionRequest getDigitalCreditBillDetailedTransactionRequest) {

        ResponseDto<GetDigitalCreditBillDetailedTransactionResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = getDigitalCreditBillDetailedTransactionRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                GetDigitalCreditBillDetailedTransactionResponse getDigitalCreditBillDetailedTransactionResponse = digitalCreditService.getBillDetailedTransactions(getDigitalCreditBillDetailedTransactionRequest);

                if (getDigitalCreditBillDetailedTransactionResponse.isError()) {
                    response.setError(true);
                    response.setMessage(getDigitalCreditBillDetailedTransactionResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(getDigitalCreditBillDetailedTransactionResponse);
                }
                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }

        if (getDigitalCreditBillDetailedTransactionRequest.isMock()) {
            List<DigitalCreditBillDetailedTransactionDto> digitalCreditBillDetailedTransactionDtos = new ArrayList<>();
            digitalCreditBillDetailedTransactionDtos.add(DigitalCreditBillDetailedTransactionDto.builder()
                    .pan("9999999997122798")
                    .transactionDate(LocalDateTime.now())
                    .persianTransactionDate("1401/01/10")
                    .startCycleDate(CommonUtil.perisanDateToLocalDateTime("1401/10/01"))
                    .persianStartCycleDate("1401/10/01")
                    .amount(new BigDecimal(10000))
                    .fee(new BigDecimal(0))
                    .orderId(YaghutUtil.generateOrderId())
                    .trackNumber("11222222")
                    .terminalId("1")
                    .merchantId("2")
                    .description("بسته اینترنت 1 روزه 1 گیگ")
                    .merchantName("رهند")
                    .productType(PayProductType.INTERNET_PACKAGE)
                    .transactionStatus(TransactionStatus.OK)
                    .digitalCreditTransactionProcessingType(DigitalCreditTransactionProcessingType.GOODS_AND_SERVICE)
                    .build());

            digitalCreditBillDetailedTransactionDtos.add(DigitalCreditBillDetailedTransactionDto.builder()
                    .pan("9999999997122798")
                    .transactionDate(LocalDateTime.now())
                    .persianTransactionDate("1401/01/10")
                    .startCycleDate(CommonUtil.perisanDateToLocalDateTime("1401/10/01"))
                    .persianStartCycleDate("1401/10/01")
                    .amount(new BigDecimal(10000))
                    .fee(new BigDecimal(0))
                    .orderId(YaghutUtil.generateOrderId())
                    .trackNumber("543212345")
                    .merchantId("2")
                    .description("بسته اینترنت 1 روزه 1 گیگ")
                    .merchantName("رهند")
                    .productType(PayProductType.INTERNET_PACKAGE)
                    .transactionStatus(TransactionStatus.OK)
                    .digitalCreditTransactionProcessingType(DigitalCreditTransactionProcessingType.GOODS_AND_SERVICE)
                    .build());


            GetDigitalCreditBillDetailedTransactionResponse getDigitalCreditBillDetailedTransactionResponse = new GetDigitalCreditBillDetailedTransactionResponse();
            getDigitalCreditBillDetailedTransactionResponse.setError(false);
            getDigitalCreditBillDetailedTransactionResponse.setCount(digitalCreditBillDetailedTransactionDtos.size());
            getDigitalCreditBillDetailedTransactionResponse.setDigitalCreditBillDetailedTransactions(digitalCreditBillDetailedTransactionDtos);

            response.setError(false);
            response.setResponseData(getDigitalCreditBillDetailedTransactionResponse);

        }


        return response;
    }

    public ResponseDto<DigitalCreditPayBillResponse> payBill(DigitalCreditPayBillRequest digitalCreditPayBillRequest) {

        ResponseDto<DigitalCreditPayBillResponse> response = new ResponseDto<>();

        DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo = digitalCreditPayBillRequest.getDigitalCreditProviderDossierInfo();

        switch (digitalCreditProviderDossierInfo.getDigitalCreditProvider()) {
            case APSAN:
                digitalCreditService = new ApsanDigitalCreditService();
                DigitalCreditPayBillResponse digitalCreditPayBillResponse = digitalCreditService.payBill(digitalCreditPayBillRequest);

                if (digitalCreditPayBillResponse.isError()) {
                    response.setError(true);
                    response.setMessage(digitalCreditPayBillResponse.getErrorMessage());
                } else {
                    response.setError(false);
                    response.setResponseData(digitalCreditPayBillResponse);
                }

                break;
            default:
                response.setError(true);
                response.setMessage("خطایی در ارتباط با تامین کننده خدمات اعتبار دیجیتال رخ داده است لطفا با پشتیبانی بگیرید");
        }
        return response;

    }

}
