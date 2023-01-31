package com.rahand.sina.integration.domain.digitalcredit.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.enums.Gender;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.digitalcredit.dto.*;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditPaymentType;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditProvider;
import com.rahand.sina.integration.domain.digitalcredit.enums.PayProductType;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;

public class DigitalCreditServiceTest {

    @Test
    public void createDossier() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();

        CreateDigitalCreditDossierRequest createDigitalCreditDossierRequest = new CreateDigitalCreditDossierRequest();
        createDigitalCreditDossierRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());
        createDigitalCreditDossierRequest.setFirstName("رضا");
        createDigitalCreditDossierRequest.setLastName("قاسمپوراکبرابادی");
        createDigitalCreditDossierRequest.setFatherName("مسیح");
        createDigitalCreditDossierRequest.setNationalCode("4310687032");
        createDigitalCreditDossierRequest.setMobileNumber("09226054364");
        createDigitalCreditDossierRequest.setPostalCode("1915653546");
        createDigitalCreditDossierRequest.setAddress("تهران جردن");
        createDigitalCreditDossierRequest.setGender(Gender.MALE);
        createDigitalCreditDossierRequest.setBirthDate(CommonUtil.perisanDateToLocalDateTime("1371/12/11"));
        createDigitalCreditDossierRequest.setAmount(new BigDecimal(10000000));

        ResponseDto<CreateDigitalCreditDossierResponse> response = digitalCreditService.createDossier(createDigitalCreditDossierRequest);
        CreateDigitalCreditDossierResponse createDigitalCreditDossierResponse = response.getResponseData();

    }

    @Test
    public void getDigitalCreditDossiers() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();

        GetDigitalCreditDossiersRequest getDigitalCreditDossiersRequest = new GetDigitalCreditDossiersRequest();

        getDigitalCreditDossiersRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());
        getDigitalCreditDossiersRequest.setNationalCode("0082205388");
        getDigitalCreditDossiersRequest.setCustomerNumber("");

        ResponseDto<GetDigitalCreditDossiersResponse> response = digitalCreditService.getDigitalCreditDossiers(getDigitalCreditDossiersRequest);
        GetDigitalCreditDossiersResponse getDigitalCreditDossiersResponse = response.getResponseData();

    }

    @Test
    public void getDigitalCreditDossierBills() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();

        GetDigitalCreditBillRequest getDigitalCreditBillRequest = new GetDigitalCreditBillRequest();
        getDigitalCreditBillRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());
        getDigitalCreditBillRequest.setDossierNumber("207.91.80019474.1");

        ResponseDto<GetDigitalCreditBillResponse> response = digitalCreditService.getDigitalCreditDossierBill(getDigitalCreditBillRequest);
        GetDigitalCreditBillResponse getDigitalCreditBillResponse = response.getResponseData();

    }

    @Test
    public void payment() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();
        DigitalCreditPaymentRequest digitalCreditPaymentRequest = new DigitalCreditPaymentRequest();
        digitalCreditPaymentRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());
        digitalCreditPaymentRequest.setPaymentId(UUID.randomUUID().toString());
        digitalCreditPaymentRequest.setProductType(PayProductType.INTERNET_PACKAGE);
        digitalCreditPaymentRequest.setDescription("بسته 7 روزه 1 گیگ");
        digitalCreditPaymentRequest.setMerchantName("رهند");
        digitalCreditPaymentRequest.setPan("9999999997122798");
        digitalCreditPaymentRequest.setAmount(new BigDecimal(70000));
        digitalCreditPaymentRequest.setOrderId(YaghutUtil.generateOrderId());
        digitalCreditPaymentRequest.setTerminalId("261");
        digitalCreditPaymentRequest.setMerchantId("386");
        digitalCreditPaymentRequest.setPspCode("999999");
        digitalCreditPaymentRequest.setReceivingInstitutionIdCode("999995");
        ResponseDto<DigitalCreditPaymentResponse> response = digitalCreditService.payment(digitalCreditPaymentRequest);
        DigitalCreditPaymentResponse digitalCreditPaymentResponse = response.getResponseData();

    }

    @Test
    public void confirmPayment() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();
        DigitalCreditConfirmPaymentRequest digitalCreditConfirmPaymentRequest = new DigitalCreditConfirmPaymentRequest();
        digitalCreditConfirmPaymentRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());

        digitalCreditConfirmPaymentRequest.setPaymentId("fb3805b0-f7e5-499d-b189-e5af3b5aaad7");
        digitalCreditConfirmPaymentRequest.setDigitalCreditPaymentType(DigitalCreditPaymentType.Payment);
        ResponseDto<DigitalCreditConfirmPaymentResponse> response = digitalCreditService.confirmPayment(digitalCreditConfirmPaymentRequest);
        DigitalCreditConfirmPaymentResponse digitalCreditConfirmPaymentResponse = response.getResponseData();

    }

    @Test
    public void rollbackPayment() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();
        DigitalCreditRollbackPaymentRequest digitalCreditRollbackPaymentRequest = new DigitalCreditRollbackPaymentRequest();
        digitalCreditRollbackPaymentRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());

        digitalCreditRollbackPaymentRequest.setPaymentId("f961c8de-0342-4d2e-982d-5479704f71b1");
        digitalCreditRollbackPaymentRequest.setDigitalCreditPaymentType(DigitalCreditPaymentType.Payment);
        ResponseDto<DigitalCreditRollbackPaymentResponse> response = digitalCreditService.rollbackPayment(digitalCreditRollbackPaymentRequest);
        DigitalCreditRollbackPaymentResponse digitalCreditRollbackPaymentResponse = response.getResponseData();

    }

    @Test
    public void inquiryTransaction() {

    }

    @Test
    public void getBillDetailedTransactions() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();
        GetDigitalCreditBillDetailedTransactionRequest getDigitalCreditBillDetailedTransactionRequest = new GetDigitalCreditBillDetailedTransactionRequest();
        getDigitalCreditBillDetailedTransactionRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());
        getDigitalCreditBillDetailedTransactionRequest.setBillId("0-908675-1671654600000");
        getDigitalCreditBillDetailedTransactionRequest.setCustomerNumber("80019474");
        ResponseDto<GetDigitalCreditBillDetailedTransactionResponse> response = digitalCreditService.getBillDetailedTransactions(getDigitalCreditBillDetailedTransactionRequest);
        GetDigitalCreditBillDetailedTransactionResponse getDigitalCreditBillDetailedTransactionResponse = response.getResponseData();
    }

    @Test
    public void payBill() {

        DigitalCreditService digitalCreditService = new DigitalCreditService();
        DigitalCreditPayBillRequest digitalCreditPayBillRequest = new DigitalCreditPayBillRequest();
        digitalCreditPayBillRequest.setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                .digitalCreditProvider(DigitalCreditProvider.APSAN)
                .businessCode("207")
                .build());
        digitalCreditPayBillRequest.setDossierNumber("207.91.80019474.1");
        digitalCreditPayBillRequest.setAmount(new BigDecimal(20000));
        digitalCreditPayBillRequest.setPaymentId(UUID.randomUUID().toString());
        ResponseDto<DigitalCreditPayBillResponse> response = digitalCreditService.payBill(digitalCreditPayBillRequest);
        DigitalCreditPayBillResponse digitalCreditPayBillResponse = response.getResponseData();

    }
}