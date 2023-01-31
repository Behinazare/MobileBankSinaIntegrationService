package com.rahand.sina.integration.provider.apsan.sevice;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.enums.Gender;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.digitalcredit.dto.*;
import com.rahand.sina.integration.domain.digitalcredit.enums.Currency;
import com.rahand.sina.integration.domain.digitalcredit.enums.*;
import com.rahand.sina.integration.domain.digitalcredit.service.spec.DigitalCredit;
import com.rahand.sina.integration.provider.apsan.dto.ApsanErrorResponseDto;
import com.rahand.sina.integration.provider.apsan.util.ApsanRestClient;
import okhttp3.Headers;
import okhttp3.Response;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class ApsanDigitalCreditService implements DigitalCredit {

    private final static String CPG_API_BASE_URL = IntegrationLibConfig.getProperty("APSAN_CPG_API_BASE_URL");
    private final static String TALLY_API_BASE_URL = IntegrationLibConfig.getProperty("APSAN_TALLY_API_BASE_URL");
    private final static String SOURCE_APP = IntegrationLibConfig.getProperty("APSAN_SOURCE_APP");
    private final static String CREDIT_GROUP = IntegrationLibConfig.getProperty("APSAN_CREDIT_GROUP");


    @Override
    public CreateDigitalCreditDossierResponse createDossier(CreateDigitalCreditDossierRequest createDigitalCreditDossierRequest) {

        CreateDigitalCreditDossierResponse createDigitalCreditDossierResponse = new CreateDigitalCreditDossierResponse();
        String apiUrl = TALLY_API_BASE_URL + "/credit-requests/custom-Inquiry-credit-request";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getTallyAuthorization())
                .build();

        Map<String, Object> requestMap = setCreateDigitalCreditDossierRequest(createDigitalCreditDossierRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            createDigitalCreditDossierResponse = mapToCreateDigitalCreditDossierResponse(responseJson);
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            createDigitalCreditDossierResponse.setError(true);
            createDigitalCreditDossierResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "createDossier", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }

        return createDigitalCreditDossierResponse;

    }

    @Override
    public GetDigitalCreditDossiersResponse getDigitalCreditDossiers(GetDigitalCreditDossiersRequest getDigitalCreditDossiersRequest) {

        GetDigitalCreditDossiersResponse getDigitalCreditDossiersResponse = new GetDigitalCreditDossiersResponse();
        String apiUrl = CPG_API_BASE_URL + "/Credits/GetCreditDossiers";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getCpgBasicAuthorization())
                .build();

        Map<String, Object> requestMap = setGetDigitalCreditDossiersRequest(getDigitalCreditDossiersRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            getDigitalCreditDossiersResponse = mapToGetDigitalCreditDossiersResponse(responseJson);
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            getDigitalCreditDossiersResponse.setError(true);
            getDigitalCreditDossiersResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "getDigitalCreditDossiers", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }

        return getDigitalCreditDossiersResponse;

    }

    @Override
    public GetDigitalCreditBillResponse getDigitalCreditDossierBill(GetDigitalCreditBillRequest getDigitalCreditBillRequest) {

        GetDigitalCreditBillResponse getDigitalCreditBillResponse = new GetDigitalCreditBillResponse();
        String apiUrl = CPG_API_BASE_URL + "/Cards/CreditBillByDossier";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getCpgBasicAuthorization())
                .build();

        Map<String, Object> requestMap = setGetDigitalCreditBillRequest(getDigitalCreditBillRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            getDigitalCreditBillResponse = mapToGetDigitalCreditBillResponse(responseJson);
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            getDigitalCreditBillResponse.setError(true);
            getDigitalCreditBillResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "getDigitalCreditDossierInvoice", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }

        return getDigitalCreditBillResponse;

    }

    @Override
    public DigitalCreditPaymentResponse payment(DigitalCreditPaymentRequest digitalCreditPaymentRequest) {

        DigitalCreditPaymentResponse digitalCreditPaymentResponse = new DigitalCreditPaymentResponse();
        String apiUrl = CPG_API_BASE_URL + "/Cards/Payment";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getCpgBasicAuthorization())
                .build();

        Map<String, Object> requestMap = setDigitalCreditPaymentRequest(digitalCreditPaymentRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            digitalCreditPaymentResponse = mapToDigitalCreditPaymentResponse(responseJson);
            digitalCreditPaymentResponse.setPaymentId(digitalCreditPaymentRequest.getPaymentId());
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            digitalCreditPaymentResponse.setError(true);
            digitalCreditPaymentResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "payment", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }

        return digitalCreditPaymentResponse;
    }

    @Override
    public DigitalCreditConfirmPaymentResponse confirmPayment(DigitalCreditConfirmPaymentRequest digitalCreditConfirmPaymentRequest) {

        DigitalCreditConfirmPaymentResponse digitalCreditConfirmPaymentResponse = new DigitalCreditConfirmPaymentResponse();

        String apiUrl = CPG_API_BASE_URL + "/Cards/Settle";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getCpgBasicAuthorization())
                .build();

        Map<String, Object> requestMap = setDigitalCreditConfirmPaymentRequest(digitalCreditConfirmPaymentRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            digitalCreditConfirmPaymentResponse = mapToDigitalCreditConfirmPaymentResponse(responseJson);
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            digitalCreditConfirmPaymentResponse.setError(true);
            digitalCreditConfirmPaymentResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "confirmPayment", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }

        return digitalCreditConfirmPaymentResponse;
    }

    @Override
    public DigitalCreditRollbackPaymentResponse rollbackPayment(DigitalCreditRollbackPaymentRequest digitalCreditRollbackPaymentRequest) {

        DigitalCreditRollbackPaymentResponse digitalCreditRollbackPaymentResponse = new DigitalCreditRollbackPaymentResponse();
        String apiUrl = CPG_API_BASE_URL + "/Cards/Rollback";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getCpgBasicAuthorization())
                .build();

        Map<String, Object> requestMap = setDigitalCreditRollbackPaymentRequest(digitalCreditRollbackPaymentRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            digitalCreditRollbackPaymentResponse = mapToDigitalCreditRollbackPaymentResponse(responseJson);
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            digitalCreditRollbackPaymentResponse.setError(true);
            digitalCreditRollbackPaymentResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "rollbackPayment", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }
        return digitalCreditRollbackPaymentResponse;
    }

    @Override
    public DigitalCreditInquiryTransactionResponse inquiryTransaction(DigitalCreditInquiryTransactionRequest digitalCreditInquiryTransactionRequest) {
        return null;
    }

    @Override
    public GetDigitalCreditBillDetailedTransactionResponse getBillDetailedTransactions(GetDigitalCreditBillDetailedTransactionRequest getDigitalCreditBillDetailedTransactionRequest) {

        GetDigitalCreditBillDetailedTransactionResponse getDigitalCreditBillDetailedTransactionResponse = new GetDigitalCreditBillDetailedTransactionResponse();
        String apiUrl = CPG_API_BASE_URL + "/Cards/BillDetailedTransactions";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getCpgBasicAuthorization())
                .build();

        Map<String, Object> requestMap = setGetDigitalCreditBillDetailedTransactionRequest(getDigitalCreditBillDetailedTransactionRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            getDigitalCreditBillDetailedTransactionResponse = mapToGetDigitalCreditBillDetailedTransactionResponse(responseJson);
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            getDigitalCreditBillDetailedTransactionResponse.setError(true);
            getDigitalCreditBillDetailedTransactionResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "getBillDetailedTransactions", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }

        return getDigitalCreditBillDetailedTransactionResponse;

    }

    @Override
    public DigitalCreditPayBillResponse payBill(DigitalCreditPayBillRequest digitalCreditPayBillRequest) {

        DigitalCreditPayBillResponse digitalCreditPayBillResponse = new DigitalCreditPayBillResponse();
        String apiUrl = CPG_API_BASE_URL + "/Cards/PayCreditBillByDossierNumber";
        Headers headers = new Headers.Builder()
                .add("Authorization", ApsanLoginService.getCpgBasicAuthorization())
                .build();

        Map<String, Object> requestMap = setGetDigitalCreditPayBillRequest(digitalCreditPayBillRequest);

        Response response = ApsanRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String responseJson = ApsanRestClient.responseBodyToString(response);
            digitalCreditPayBillResponse = mapToDigitalCreditPayBillResponse(responseJson);
            digitalCreditPayBillResponse.setPaymentId(digitalCreditPayBillRequest.getPaymentId());
        } else {
            String errorResponseJson = ApsanRestClient.responseBodyToString(response);
            ApsanErrorResponseDto errorResponseDto = ApsanRestClient.mapToErrorResponse(errorResponseJson);
            digitalCreditPayBillResponse.setError(true);
            digitalCreditPayBillResponse.setErrorMessage(errorResponseDto.getErrorMessage() != null ? errorResponseDto.getErrorMessage() : errorResponseDto.getValidationErrorMessage());

            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "payBill", errorResponseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponseJson)
                    .build());
        }

        return digitalCreditPayBillResponse;
    }

    //private methode :

    private Map<String, Object> setCreateDigitalCreditDossierRequest(CreateDigitalCreditDossierRequest createDigitalCreditDossierRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("amount", createDigitalCreditDossierRequest.getAmount());
        requestMap.put("creditGroup", createDigitalCreditDossierRequest.getCreditGroup() != null ?
                createDigitalCreditDossierRequest.getCreditGroup() : CREDIT_GROUP);
        requestMap.put("sourceApp", SOURCE_APP);
        requestMap.put("needCheckSabtAhval", false);
        requestMap.put("needCheckShakar", false);

        Map<String, Object> personalInfo = new LinkedHashMap<>();
        personalInfo.put("localize_Name", createDigitalCreditDossierRequest.getFirstName());
        personalInfo.put("localize_Surname", createDigitalCreditDossierRequest.getLastName());
        personalInfo.put("localize_FatherName", createDigitalCreditDossierRequest.getFatherName());
        personalInfo.put("nationalCode", createDigitalCreditDossierRequest.getNationalCode());
        personalInfo.put("phoneNumber", createDigitalCreditDossierRequest.getMobileNumber());
        personalInfo.put("birthdate", convertToGregorianDate(createDigitalCreditDossierRequest.getBirthDate()));

        if (createDigitalCreditDossierRequest.getGender().equals(Gender.FEMALE)) {
            personalInfo.put("gender", "Female");

        } else if (createDigitalCreditDossierRequest.getGender().equals(Gender.MALE)) {
            personalInfo.put("gender", "Male");

        }
        requestMap.put("personalInfo", personalInfo);

        Map<String, Object> addressMap = new LinkedHashMap<>();
        addressMap.put("address", createDigitalCreditDossierRequest.getAddress());
        addressMap.put("postalCode", createDigitalCreditDossierRequest.getPostalCode());
        requestMap.put("address", addressMap);

        return requestMap;

    }

    private CreateDigitalCreditDossierResponse mapToCreateDigitalCreditDossierResponse(String responseJson) {

        CreateDigitalCreditDossierResponse createDigitalCreditDossierResponse = new CreateDigitalCreditDossierResponse();

        Map responseMap = CommonUtil.jsonToMap(responseJson);
        Map personalInfoMap = (Map) responseMap.get("personalInfo");
        createDigitalCreditDossierResponse.setFirstName(String.valueOf(personalInfoMap.get("localizedName")));
        createDigitalCreditDossierResponse.setLastName(String.valueOf(personalInfoMap.get("localizedSurname")));
        createDigitalCreditDossierResponse.setFatherName(String.valueOf(personalInfoMap.get("localizedFatherName")));
        createDigitalCreditDossierResponse.setNationalCode(String.valueOf(personalInfoMap.get("nationalCode")));
        createDigitalCreditDossierResponse.setBirthDate(toLocalDateTimeInCreate(String.valueOf(personalInfoMap.get("birthdate"))));
        createDigitalCreditDossierResponse.setPersianBirthDate(CommonUtil.convertToPersianDate(createDigitalCreditDossierResponse.getBirthDate()));

        String gender = String.valueOf(String.valueOf(personalInfoMap.get("Gender")));
        if (gender.equals("Female")) {
            createDigitalCreditDossierResponse.setGender(Gender.FEMALE);
        } else if (gender.equals("Male")) {
            createDigitalCreditDossierResponse.setGender(Gender.MALE);
        }

        if (responseMap.get("address") != null) {
            Map addressMap = (Map) responseMap.get("address");
            createDigitalCreditDossierResponse.setAddress(String.valueOf(addressMap.get("address")));
            createDigitalCreditDossierResponse.setPostalCode(String.valueOf(addressMap.get("postalCode")));
        }

        createDigitalCreditDossierResponse.setId(String.valueOf(responseMap.get("id")));
        createDigitalCreditDossierResponse.setCreditGroup(String.valueOf(responseMap.get("creditGroup")));
        createDigitalCreditDossierResponse.setSourceApp(String.valueOf(responseMap.get("sourceApp")));
        String digitalCreditDossierStatus = String.valueOf(responseMap.get("status"));
        String creditDossierInquiryStatus = String.valueOf(responseMap.get("inquiryStatus"));
        createDigitalCreditDossierResponse.setCreateDigitalCreditDossierStatus(CreateDigitalCreditDossierStatus.get(digitalCreditDossierStatus));
        createDigitalCreditDossierResponse.setCreditDossierInquiryStatus(DigitalCreditDossierInquiryStatus.get(creditDossierInquiryStatus));

        return createDigitalCreditDossierResponse;

    }

    private Map<String, Object> setGetDigitalCreditDossiersRequest(GetDigitalCreditDossiersRequest getDigitalCreditDossiersRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("nationalCode", getDigitalCreditDossiersRequest.getNationalCode());
        requestMap.put("customerNumber", getDigitalCreditDossiersRequest.getCustomerNumber());
        requestMap.put("creditGroup", getDigitalCreditDossiersRequest.getCreditGroup() != null ?
                Integer.valueOf(getDigitalCreditDossiersRequest.getCreditGroup()) : Integer.valueOf(CREDIT_GROUP));

        return requestMap;
    }

    private GetDigitalCreditDossiersResponse mapToGetDigitalCreditDossiersResponse(String responseJson) {

        GetDigitalCreditDossiersResponse getDigitalCreditDossiersResponse = new GetDigitalCreditDossiersResponse();

        Map responseMap = CommonUtil.jsonToMap(responseJson);

        List<Map<String, Object>> dossiers = (List<Map<String, Object>>) responseMap.get("dossiers");
        getDigitalCreditDossiersResponse.setCount(dossiers.size());

        List<DigitalCreditDossiersDto> digitalCreditDossiers = new ArrayList<>();

        for (int i = 0; i < dossiers.size(); i++) {
            Map<String, Object> dossier = dossiers.get(i);
            Map<String, Object> customerInfo = (Map<String, Object>) dossier.get("customer");
            Map<String, Object> defaultCard = (Map<String, Object>) dossier.get("defaultCard");
            LocalDateTime openDate = toLocalDateTime(String.valueOf(dossier.get("openDate")));
            LocalDateTime expireDate = toLocalDateTime(String.valueOf(dossier.get("expireDate")));
            digitalCreditDossiers.add(DigitalCreditDossiersDto.builder()
                    .firstName(String.valueOf(customerInfo.get("firstName")))
                    .lastName(String.valueOf(customerInfo.get("lastName")))
                    .fatherName(String.valueOf(customerInfo.get("fatherName")))
                    .nationalCode(String.valueOf(customerInfo.get("nationalCode")))
                    .customerNumber(String.valueOf(customerInfo.get("cif")))
                    .totalFund(new BigDecimal(String.valueOf(dossier.get("totalFund"))))
                    .availableFund(new BigDecimal(String.valueOf(dossier.get("availableFund"))))
                    .dossierNumber(String.valueOf(dossier.get("number")))
                    .pan(String.valueOf(defaultCard.get("pan")))
                    .openDate(openDate)
                    .persianOpenDate(CommonUtil.convertToPersianDate(openDate))
                    .expireDate(expireDate)
                    .persianExpireDate(CommonUtil.convertToPersianDate(expireDate))
                    .currency(Currency.get(String.valueOf(dossier.get("currency"))))
                    .digitalCreditDossierStatus(DigitalCreditDossierStatus.get(String.valueOf(dossier.get("modernStatus"))))
                    .digitalCreditDossierCycleLength(DigitalCreditDossierCycleLength.get(String.valueOf(dossier.get("cycleLength"))))
                    .digitalCreditCardStatus(DigitalCreditCardStatus.get(String.valueOf(defaultCard.get("status"))))
                    .title(String.valueOf(dossier.get("title")))
                    .build());
        }

        getDigitalCreditDossiersResponse.setDigitalCreditDossiers(digitalCreditDossiers);

        return getDigitalCreditDossiersResponse;
    }

    private Map<String, Object> setGetDigitalCreditBillRequest(GetDigitalCreditBillRequest getDigitalCreditBillRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("dossierNumber", getDigitalCreditBillRequest.getDossierNumber());

        return requestMap;
    }

    private GetDigitalCreditBillResponse mapToGetDigitalCreditBillResponse(String responseJson) {

        GetDigitalCreditBillResponse getDigitalCreditBillResponse = new GetDigitalCreditBillResponse();

        Map responseMap = CommonUtil.jsonToMap(responseJson);

        List<Map<String, Object>> bills = (List<Map<String, Object>>) responseMap.get("bills");
        getDigitalCreditBillResponse.setCount(bills.size());

        List<DigitalCreditBillDto> digitalCreditBills = new ArrayList<>();

        for (int i = 0; i < bills.size(); i++) {

            Map<String, Object> bill = bills.get(i);
            Map<String, Object> proposalLoan = (Map<String, Object>) bill.get("proposalLoan");
            List<Map<String, Object>> fees = (List<Map<String, Object>>) bill.get("fees");
            fees = fees != null ? fees : Arrays.asList();

            LocalDateTime respiteDate = toLocalDateTime(String.valueOf(bill.get("respiteDate")));
            LocalDateTime startCycleDate = toLocalDateTime(String.valueOf(bill.get("startCycleDate")));
            LocalDateTime endCycleDate = toLocalDateTime(String.valueOf(bill.get("endCycleDate")));

            digitalCreditBills.add(DigitalCreditBillDto.builder()
                    .billId(String.valueOf(bill.get("billId")))
                    .amount(new BigDecimal(String.valueOf(bill.get("amount"))))
                    .withDrawableAmount(new BigDecimal(String.valueOf(bill.get("withdrawableAmount"))))
                    .preDebitAmount(new BigDecimal(String.valueOf(bill.get("preDebitAmount"))))
                    .payedAmount(new BigDecimal(String.valueOf(bill.get("payedAmount"))))
                    .fees(fees.stream().map(f -> DigitalCreditBillDto.Fee.builder()
                            .credit((boolean) f.get("credit"))
                            .amount(new BigDecimal(String.valueOf(f.get("amount"))))
                            .feeType(DigitalCreditDossierInvoiceFeeType.get(String.valueOf(f.get("type"))))
                            .build()).collect(Collectors.toList()))
                    .currency(Currency.get(String.valueOf(responseMap.get("currency"))))
                    .respiteDate(respiteDate)
                    .persianRespiteDate(CommonUtil.convertToPersianDate(respiteDate))
                    .startCycleDate(startCycleDate)
                    .persianStartCycleDate(CommonUtil.convertToPersianDate(startCycleDate))
                    .endCycleDate(endCycleDate)
                    .persianEndCycleDate(CommonUtil.convertToPersianDate(endCycleDate))
                    .clearingStatus(DigitalCreditDossierInvoiceClearingStatus.get(String.valueOf(bill.get("clearingStatus"))))
                    .cycleStatus(DigitalCreditDossierCycleStatus.get(String.valueOf(bill.get("cycleStatus"))))
                    .build());

        }

        getDigitalCreditBillResponse.setDigitalCreditBills(digitalCreditBills);

        return getDigitalCreditBillResponse;
    }

    private Map<String, Object> setDigitalCreditPaymentRequest(DigitalCreditPaymentRequest digitalCreditPaymentRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("paymentId", digitalCreditPaymentRequest.getPaymentId());
        requestMap.put("subsystem", digitalCreditPaymentRequest.getProductType().getDesc());
        requestMap.put("description", digitalCreditPaymentRequest.getDescription());
        requestMap.put("merchantName", digitalCreditPaymentRequest.getMerchantName());

        Map<String, Object> issuerPaymentMap = new LinkedHashMap<>();
        issuerPaymentMap.put("pan", digitalCreditPaymentRequest.getPan());
        issuerPaymentMap.put("amount", digitalCreditPaymentRequest.getAmount());
        issuerPaymentMap.put("invoiceNumber", digitalCreditPaymentRequest.getOrderId());
        issuerPaymentMap.put("terminalId", digitalCreditPaymentRequest.getTerminalId());
        issuerPaymentMap.put("merchantId", digitalCreditPaymentRequest.getMerchantId());
        issuerPaymentMap.put("pspCode", digitalCreditPaymentRequest.getPspCode());
        issuerPaymentMap.put("receivingInstitutionIdCode", digitalCreditPaymentRequest.getReceivingInstitutionIdCode());

        Map<String, Object> cardAuthorizeParamsMap = new LinkedHashMap<>();
        cardAuthorizeParamsMap.put("pinType", "CARD");
        cardAuthorizeParamsMap.put("expDate", "");
        cardAuthorizeParamsMap.put("cvv2", "");
        cardAuthorizeParamsMap.put("pin", "");
        cardAuthorizeParamsMap.put("track2", "");

        issuerPaymentMap.put("cardAuthorizeParams", cardAuthorizeParamsMap);

        requestMap.put("issuerPayment", issuerPaymentMap);
        Map<String, Object> settlementDataMap = new LinkedHashMap<>();
        settlementDataMap.put("settlementDate", convertToGregorianDate(LocalDateTime.now()));
        settlementDataMap.put("settlementType", "Net");
        settlementDataMap.put("netAmount", digitalCreditPaymentRequest.getAmount().doubleValue());
        settlementDataMap.put("commission", 0.0);
        List<Map<String, Object>> settlementDataList = new ArrayList<>();
        Map<String, Object> settlementData = new LinkedHashMap<>();
        settlementData.put("ibanNumber", "IR420570077700000034861001");
        settlementData.put("amount", digitalCreditPaymentRequest.getAmount().doubleValue());
        settlementData.put("isCommission", false);
        settlementDataList.add(settlementData);
        settlementDataMap.put("sharingItems", settlementDataList);
        requestMap.put("settlementData", settlementDataMap);

        return requestMap;
    }

    private DigitalCreditPaymentResponse mapToDigitalCreditPaymentResponse(String responseJson) {

        DigitalCreditPaymentResponse digitalCreditPaymentResponse = new DigitalCreditPaymentResponse();
        Map responseMap = CommonUtil.jsonToMap(responseJson);
        digitalCreditPaymentResponse.setRrn(String.valueOf(responseMap.get("switchResponseRrn")));
        return digitalCreditPaymentResponse;
    }

    private Map<String, Object> setDigitalCreditConfirmPaymentRequest(DigitalCreditConfirmPaymentRequest digitalCreditConfirmPaymentRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("requestId", digitalCreditConfirmPaymentRequest.getPaymentId());
        requestMap.put("transactionType", digitalCreditConfirmPaymentRequest.getDigitalCreditPaymentType().getName());

        return requestMap;
    }

    private DigitalCreditConfirmPaymentResponse mapToDigitalCreditConfirmPaymentResponse(String responseJson) {

        DigitalCreditConfirmPaymentResponse digitalCreditConfirmPaymentResponse = new DigitalCreditConfirmPaymentResponse();
        Map responseMap = CommonUtil.jsonToMap(responseJson);

        digitalCreditConfirmPaymentResponse.setSuccess((boolean) responseMap.get("isSuccess"));

        return digitalCreditConfirmPaymentResponse;
    }

    private Map<String, Object> setDigitalCreditRollbackPaymentRequest(DigitalCreditRollbackPaymentRequest digitalCreditRollbackPaymentRequest) {
        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("requestId", digitalCreditRollbackPaymentRequest.getPaymentId());
        requestMap.put("transactionType", digitalCreditRollbackPaymentRequest.getDigitalCreditPaymentType().getName());

        return requestMap;
    }

    private DigitalCreditRollbackPaymentResponse mapToDigitalCreditRollbackPaymentResponse(String responseJson) {

        DigitalCreditRollbackPaymentResponse digitalCreditRollbackPaymentResponse = new DigitalCreditRollbackPaymentResponse();

        Map responseMap = CommonUtil.jsonToMap(responseJson);

        digitalCreditRollbackPaymentResponse.setSuccess((boolean) responseMap.get("isSuccess"));

        return digitalCreditRollbackPaymentResponse;

    }

    private Map<String, Object> setGetDigitalCreditBillDetailedTransactionRequest(GetDigitalCreditBillDetailedTransactionRequest getDigitalCreditBillDetailedTransactionRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("billId", getDigitalCreditBillDetailedTransactionRequest.getBillId());
        requestMap.put("customerNumber", getDigitalCreditBillDetailedTransactionRequest.getCustomerNumber());

        return requestMap;
    }

    private GetDigitalCreditBillDetailedTransactionResponse mapToGetDigitalCreditBillDetailedTransactionResponse(String responseJson) {

        GetDigitalCreditBillDetailedTransactionResponse getDigitalCreditBillDetailedTransactionResponse = new GetDigitalCreditBillDetailedTransactionResponse();
        Map responseMap = CommonUtil.jsonToMap(responseJson);
        List<Map<String, Object>> billDetailedTransactionsList = (List<Map<String, Object>>) responseMap.get("billDetailedTransactionsResponse");
        List<DigitalCreditBillDetailedTransactionDto> creditBillDetailedTransactions = new ArrayList<>();

        for (int i = 0; i < billDetailedTransactionsList.size(); i++) {
            Map<String, Object> billDetailedTransaction = billDetailedTransactionsList.get(i);
            LocalDateTime transactionDate = toLocalDateTime(String.valueOf(billDetailedTransaction.get("date")));
            LocalDateTime startCycleDate = toLocalDateTime(String.valueOf(billDetailedTransaction.get("startCycleDate")));

            creditBillDetailedTransactions.add(DigitalCreditBillDetailedTransactionDto.builder()
                    .transactionDate(transactionDate)
                    .persianTransactionDate(CommonUtil.convertToPersianDate(transactionDate))
                    .startCycleDate(startCycleDate)
                    .persianStartCycleDate(CommonUtil.convertToPersianDate(startCycleDate))
                    .amount(new BigDecimal(String.valueOf(billDetailedTransaction.get("amount"))))
                    .fee(new BigDecimal(String.valueOf(billDetailedTransaction.get("fee"))))
                    .pan(String.valueOf(billDetailedTransaction.get("pan")))
                    .orderId(String.valueOf(billDetailedTransaction.get("traceNumber")))
                    .trackNumber(String.valueOf(billDetailedTransaction.get("referenceNumber")))
                    .merchantId(String.valueOf(billDetailedTransaction.get("merchantId")))
                    .description(String.valueOf(billDetailedTransaction.get("description")))
                    .merchantName(String.valueOf(billDetailedTransaction.get("merchantName")))
                    .productType(PayProductType.getByDesc(String.valueOf(billDetailedTransaction.get("subsystem"))))
                    .transactionStatus(TransactionStatus.get(String.valueOf(billDetailedTransaction.get("transactionStatus"))))
                    .digitalCreditTransactionProcessingType(DigitalCreditTransactionProcessingType.get(String.valueOf(billDetailedTransaction.get("processingCode"))))
                    .build());
        }

        getDigitalCreditBillDetailedTransactionResponse.setDigitalCreditBillDetailedTransactions(creditBillDetailedTransactions);
        getDigitalCreditBillDetailedTransactionResponse.setCount(creditBillDetailedTransactions.size());

        return getDigitalCreditBillDetailedTransactionResponse;

    }

    private Map<String, Object> setGetDigitalCreditPayBillRequest(DigitalCreditPayBillRequest digitalCreditPayBillRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("dossierNumber", digitalCreditPayBillRequest.getDossierNumber());
        requestMap.put("requestId", digitalCreditPayBillRequest.getPaymentId());
        requestMap.put("amount", digitalCreditPayBillRequest.getAmount().doubleValue());
        requestMap.put("fullSettlement", false);

        return requestMap;

    }

    private DigitalCreditPayBillResponse mapToDigitalCreditPayBillResponse(String responseJson) {

        DigitalCreditPayBillResponse digitalCreditPayBillResponse = new DigitalCreditPayBillResponse();
        Map responseMap = CommonUtil.jsonToMap(responseJson);

        digitalCreditPayBillResponse.setSuccess((boolean) responseMap.get("isSuccess"));
        digitalCreditPayBillResponse.setPayedAmount(new BigDecimal(String.valueOf(responseMap.get("amount"))));

        return digitalCreditPayBillResponse;

    }

    public static LocalDateTime toLocalDateTime(String yyyyMMdd) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sssZ");
        Date date = null;
        try {
            date = simpleDateFormat.parse(yyyyMMdd);
        } catch (ParseException e) {
            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "toLocalDateTime", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());

    }

    public static LocalDateTime toLocalDateTimeInInvoice(String yyyyMMdd) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Date date = null;
        try {
            date = simpleDateFormat.parse(yyyyMMdd);
        } catch (ParseException e) {
            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "toLocalDateTimeInInvoice", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());

    }

    public static LocalDateTime toLocalDateTimeInCreate(String yyyyMMdd) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(yyyyMMdd.substring(0, 10));
        } catch (ParseException e) {
            CommonUtil.logError(ApsanDigitalCreditService.class.getSimpleName(), "toLocalDateTimeInCreate", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());

    }

    public static String convertToGregorianDate(LocalDateTime localDateTime) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Date date = Date.from(Timestamp.valueOf(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))).toInstant());
        return simpleDateFormat.format(date);
    }
}
