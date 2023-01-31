package com.rahand.sina.integration.provider.faraboom.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.digitalpromissorynote.dto.*;
import com.rahand.sina.integration.domain.digitalpromissorynote.enums.PromissoryNotePaidStatus;
import com.rahand.sina.integration.domain.digitalpromissorynote.enums.PromissoryNoteRequestStatus;
import com.rahand.sina.integration.domain.digitalpromissorynote.enums.PromissoryNoteSignStatus;
import com.rahand.sina.integration.domain.digitalpromissorynote.service.spec.DigitalPromissoryNote;
import com.rahand.sina.integration.provider.faraboom.dto.FaraboomErrorResponse;
import com.rahand.sina.integration.provider.faraboom.util.FaraboomRestClient;
import com.rahand.sina.integration.provider.faraboom.util.FaraboomUtil;
import okhttp3.Headers;
import okhttp3.Response;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class FaraboomPromissoryNoteService implements DigitalPromissoryNote {

    private final String BASE_URL = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_BASE_URL");

    private final String USERNAME = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_BOOM_ID");

    private final String PASSWORD = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_PASSWORD");

    private final String APP_KEY = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_APP_KEY");

    private final String TOKEN_ID = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_BOOM_TOKEN_ID");

    private final String DEVICE_ID = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_DEVICE_ID");

    private final String BANK_ID = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_BANK_ID");

    @Override
    public CreateDigitalPromissoryNoteRecipientResponse createDigitalRecipient(CreateDigitalPromissoryNoteRecipientRequest createDigitalPromissoryNoteRecipientRequest) {

        CreateDigitalPromissoryNoteRecipientResponse createDigitalPromissoryNoteRecipientResponse = new CreateDigitalPromissoryNoteRecipientResponse();

        String apiUrl = BASE_URL + "/promissorynote/recipient/create";
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setCreateDigitalRecipientRequest(createDigitalPromissoryNoteRecipientRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            createDigitalPromissoryNoteRecipientResponse = mapTocreateDigitalPromissoryNoteRecipientResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "createDigitalRecipient", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            createDigitalPromissoryNoteRecipientResponse.setError(true);
            createDigitalPromissoryNoteRecipientResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return createDigitalPromissoryNoteRecipientResponse;

    }

    @Override
    public ReceiveDigitalPromissoryNoteResponse receive(ReceiveDigitalPromissoryNoteRequest receiveDigitalPromissoryNoteRequest) {

        ReceiveDigitalPromissoryNoteResponse receiveDigitalPromissoryNoteResponse = new ReceiveDigitalPromissoryNoteResponse();

        String apiUrl = BASE_URL + "/promissorynote/receive";
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setReceiveDigitalPromissoryNoteRequest(receiveDigitalPromissoryNoteRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            receiveDigitalPromissoryNoteResponse = mapToReceiveDigitalPromissoryNoteResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "receive", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            receiveDigitalPromissoryNoteResponse.setError(true);
            receiveDigitalPromissoryNoteResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return receiveDigitalPromissoryNoteResponse;
    }

    @Override
    public GetPaymentUrlDigitalPromissoryNoteResponse getPaymentUrl(GetPaymentUrlDigitalPromissoryNoteRequest getPaymentUrlDigitalPromissoryNoteRequest) {

        GetPaymentUrlDigitalPromissoryNoteResponse getPaymentUrlDigitalPromissoryNoteResponse = new GetPaymentUrlDigitalPromissoryNoteResponse();

        String apiUrl = BASE_URL + "/promissorynote/payment/link";
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setGetPaymentUrlDigitalPromissoryNoteRequest(getPaymentUrlDigitalPromissoryNoteRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            getPaymentUrlDigitalPromissoryNoteResponse = mapToGetPaymentUrlDigitalPromissoryNoteResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "getPaymentUrl", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            getPaymentUrlDigitalPromissoryNoteResponse.setError(true);
            getPaymentUrlDigitalPromissoryNoteResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return getPaymentUrlDigitalPromissoryNoteResponse;

    }

    @Override
    public PaymentStatusDigitalPromissoryNoteResponse getPaymentStatus(PaymentStatusDigitalPromissoryNoteRequest paymentStatusDigitalPromissoryNoteRequest) {

        PaymentStatusDigitalPromissoryNoteResponse paymentStatusDigitalPromissoryNoteResponse = new PaymentStatusDigitalPromissoryNoteResponse();

        if (paymentStatusDigitalPromissoryNoteRequest.getPaymentId() != null) {
            String apiUrl = BASE_URL + "/promissorynote/payment/status";
            FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
            Headers headers = setDefualtHeaders();
            Map<String, Object> requestMap = setPaymentStatusDigitalPromissoryNoteRequest(paymentStatusDigitalPromissoryNoteRequest);
            Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

            if (response.isSuccessful()) {
                String jsonResponse = FaraboomUtil.responseBodyToString(response);
                paymentStatusDigitalPromissoryNoteResponse = mapToPaymentStatusDigitalPromissoryNoteResponse(jsonResponse);
            } else {
                String jsonResponse = FaraboomUtil.responseBodyToString(response);
                FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
                CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "getPaymentStatus", jsonResponse, ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(requestMap))
                        .output(jsonResponse)
                        .build());
                paymentStatusDigitalPromissoryNoteResponse.setError(true);
                paymentStatusDigitalPromissoryNoteResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
            }
        } else {
            InquiryDigitalPromissoryNotesResponse inquiryDigitalPromissoryNotes = inquiryDigitalPromissoryNotes(InquiryDigitalPromissoryNotesRequest.builder()
                    .nationalCode(paymentStatusDigitalPromissoryNoteRequest.getNationalCode())
                    .build());

            if (inquiryDigitalPromissoryNotes.isError()) {
                paymentStatusDigitalPromissoryNoteResponse.setSuccessful(false);
                paymentStatusDigitalPromissoryNoteResponse.setErrorMessage("کارمزد سفته پرداخت نشده است یا خطایی در زمان پرداخت رخ داده است.");
            } else {
                boolean paid = inquiryDigitalPromissoryNotes.getDigitalPromissoryNotes().stream().filter(x -> x.getRequestId()
                                .equals(paymentStatusDigitalPromissoryNoteRequest.getRequestId()) && x.getPaidStatus().equals(PromissoryNotePaidStatus.PAID))
                        .findFirst().isPresent();

                if (paid) {
                    paymentStatusDigitalPromissoryNoteResponse.setSuccessful(true);

                } else {
                    paymentStatusDigitalPromissoryNoteResponse.setError(true);
                    paymentStatusDigitalPromissoryNoteResponse.setSuccessful(false);
                    paymentStatusDigitalPromissoryNoteResponse.setErrorMessage("کارمزد سفته پرداخت نشده است یا خطایی در زمان پرداخت رخ داده است.");
                }
            }
        }


        return paymentStatusDigitalPromissoryNoteResponse;

    }

    @Override
    public SignDigitalPromissoryNoteResponse sign(SignDigitalPromissoryNoteRequest signDigitalPromissoryNoteRequest) {

        SignDigitalPromissoryNoteResponse signDigitalPromissoryNoteResponse = new SignDigitalPromissoryNoteResponse();

        String apiUrl = BASE_URL + "/promissorynote/sign";
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setSignDigitalPromissoryNoteRequest(signDigitalPromissoryNoteRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            signDigitalPromissoryNoteResponse = mapToSignDigitalPromissoryNoteResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "sign", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            signDigitalPromissoryNoteResponse.setError(true);
            signDigitalPromissoryNoteResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return signDigitalPromissoryNoteResponse;

    }

    @Override
    public FinalRegistrationDigitalPromissoryNoteResponse finalRegistration(FinalRegistrationDigitalPromissoryNoteRequest finalRegistrationDigitalPromissoryNoteRequest) {

        FinalRegistrationDigitalPromissoryNoteResponse finalRegistrationDigitalPromissoryNoteResponse = new FinalRegistrationDigitalPromissoryNoteResponse();

        String apiUrl = BASE_URL + "/promissorynote/sign/final";
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setFinalRegistrationDigitalPromissoryNoteRequest(finalRegistrationDigitalPromissoryNoteRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            finalRegistrationDigitalPromissoryNoteResponse = mapToFinalRegistrationDigitalPromissoryNoteResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "finalRegistration", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            finalRegistrationDigitalPromissoryNoteResponse.setError(true);
            finalRegistrationDigitalPromissoryNoteResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return finalRegistrationDigitalPromissoryNoteResponse;

    }

    @Override
    public InquiryDigitalPromissoryNotesResponse inquiryDigitalPromissoryNotes(InquiryDigitalPromissoryNotesRequest inquiryDigitalPromissoryNotesRequest) {

        InquiryDigitalPromissoryNotesResponse inquiryDigitalPromissoryNotesResponse = new InquiryDigitalPromissoryNotesResponse();

        String apiUrl = BASE_URL + String.format("/promissorynote/inquiry?national_code=%s", inquiryDigitalPromissoryNotesRequest.getNationalCode());
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Response response = FaraboomRestClient.getRequest(apiUrl, headers, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            inquiryDigitalPromissoryNotesResponse = mapToInquiryDigitalPromissoryNotesResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "inquiryDigitalPromissoryNotes", jsonResponse, ServiceLogsDto.builder()
                    .input(apiUrl)
                    .output(jsonResponse)
                    .build());
            inquiryDigitalPromissoryNotesResponse.setError(true);
            inquiryDigitalPromissoryNotesResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return inquiryDigitalPromissoryNotesResponse;

    }

    @Override
    public RemoveDigitalPromissoryNoteResponse remove(RemoveDigitalPromissoryNoteRequest removeDigitalPromissoryNoteRequest) {

        RemoveDigitalPromissoryNoteResponse removeDigitalPromissoryNoteResponse = new RemoveDigitalPromissoryNoteResponse();

        String apiUrl = BASE_URL + "/promissorynote/remove";
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setRemoveDigitalPromissoryNoteRequest(removeDigitalPromissoryNoteRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            removeDigitalPromissoryNoteResponse = mapToRemoveDigitalPromissoryNoteResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "remove", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            removeDigitalPromissoryNoteResponse.setError(true);
            removeDigitalPromissoryNoteResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return removeDigitalPromissoryNoteResponse;

    }

    @Override
    public GetAllDigitalPromissoryNoteRecipientResponse getAllRecipient(GetAllDigitalPromissoryNoteRecipientRequest getAllDigitalPromissoryNoteRecipientRequest) {

        GetAllDigitalPromissoryNoteRecipientResponse getAllDigitalPromissoryNoteRecipientResponse = new GetAllDigitalPromissoryNoteRecipientResponse();

        String apiUrl = BASE_URL + "/promissorynote/recipient/list";
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Response response = FaraboomRestClient.getRequest(apiUrl, headers, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            getAllDigitalPromissoryNoteRecipientResponse = mapToGetAllDigitalPromissoryNoteRecipientResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "getAllRecipient", jsonResponse, ServiceLogsDto.builder()
                    .input(apiUrl)
                    .output(jsonResponse)
                    .build());
            getAllDigitalPromissoryNoteRecipientResponse.setError(true);
            getAllDigitalPromissoryNoteRecipientResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return getAllDigitalPromissoryNoteRecipientResponse;

    }

    @Override
    public RemoveDigitalPromissoryNoteRecipientResponse removeRecipient(RemoveDigitalPromissoryNoteRecipientRequest removeDigitalPromissoryNoteRecipientRequest) {

        RemoveDigitalPromissoryNoteRecipientResponse removeDigitalPromissoryNoteRecipientResponse = new RemoveDigitalPromissoryNoteRecipientResponse();

        String apiUrl = BASE_URL + String.format("/promissorynote/recipient/remove/%s", removeDigitalPromissoryNoteRecipientRequest.getRecipientId());
        FaraboomLoginService faraboomLoginService = new FaraboomLoginService();
        Headers headers = setDefualtHeaders();
        Response response = FaraboomRestClient.getRequest(apiUrl, headers, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            removeDigitalPromissoryNoteRecipientResponse = mapToRemoveDigitalPromissoryNoteRecipientResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomPromissoryNoteService.class.getSimpleName(), "removeRecipient", jsonResponse, ServiceLogsDto.builder()
                    .input(apiUrl)
                    .output(jsonResponse)
                    .build());
            removeDigitalPromissoryNoteRecipientResponse.setError(true);
            removeDigitalPromissoryNoteRecipientResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return removeDigitalPromissoryNoteRecipientResponse;

    }

    private Headers setDefualtHeaders() {

        return new Headers.Builder()
                .add("App-Key", APP_KEY)
                .add("Device-Id", DEVICE_ID)
                .add("Bank-Id", BANK_ID)
                .add("Token-Id", TOKEN_ID)
                .add("CLIENT-DEVICE-ID", "127.0.0.1")
                .add("CLIENT-IP-ADDRESS", "127.0.0.1")
                .add("CLIENT-USER-AGENT", "User Agent")
                .add("CLIENT-USER-ID", "09120000000")
                .add("Accept-Language", "fa")
                .add("CLIENT-PLATFORM-TYPE", "WEB")
                .add("CONTENT-TYPE", "application/json")
                .add("ACCEPT-LANGUAGE", "application/json")
                .build();

    }

    private Headers setDefualtHeaders(String sessionId) {

        return new Headers.Builder()
                .add("SESSION", sessionId)
                .add("App-Key", APP_KEY)
                .add("Device-Id", DEVICE_ID)
                .add("Bank-Id", BANK_ID)
                .add("Token-Id", TOKEN_ID)
                .add("CLIENT-DEVICE-ID", "127.0.0.1")
                .add("CLIENT-IP-ADDRESS", "127.0.0.1")
                .add("CLIENT-USER-AGENT", "User Agent")
                .add("CLIENT-USER-ID", "09120000000")
                .add("Accept-Language", "fa")
                .add("CLIENT-PLATFORM-TYPE", "WEB")
                .add("CONTENT-TYPE", "application/json")
                .add("ACCEPT-LANGUAGE", "application/json")
                .build();

    }

    private Map<String, Object> setCreateDigitalRecipientRequest(CreateDigitalPromissoryNoteRecipientRequest createDigitalPromissoryNoteRecipientRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("recipient_full_name", createDigitalPromissoryNoteRecipientRequest.getFullName());
        requestMap.put("recipient_mobile_number", createDigitalPromissoryNoteRecipientRequest.getMobileNumber());
        requestMap.put("recipient_national_code", createDigitalPromissoryNoteRecipientRequest.getNationalCode());
        requestMap.put("recipient_account_number", createDigitalPromissoryNoteRecipientRequest.getAccountNumber());
        requestMap.put("recipient_postal_code", createDigitalPromissoryNoteRecipientRequest.getPostalCode());
        requestMap.put("recipient_address", createDigitalPromissoryNoteRecipientRequest.getAddress());
        requestMap.put("recipient_is_legal", createDigitalPromissoryNoteRecipientRequest.isLegal());
        requestMap.put("recipient_sana_code", createDigitalPromissoryNoteRecipientRequest.getSanaCode());

        return requestMap;
    }

    private CreateDigitalPromissoryNoteRecipientResponse mapTocreateDigitalPromissoryNoteRecipientResponse(String jsonResponse) {

        CreateDigitalPromissoryNoteRecipientResponse createDigitalPromissoryNoteRecipientResponse = new CreateDigitalPromissoryNoteRecipientResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        createDigitalPromissoryNoteRecipientResponse.setRecipientId(String.valueOf(responseMap.get("id")));
        createDigitalPromissoryNoteRecipientResponse.setFullName(String.valueOf(responseMap.get("full_name")));
        createDigitalPromissoryNoteRecipientResponse.setMobileNumber(String.valueOf(responseMap.get("mobile_number")));
        createDigitalPromissoryNoteRecipientResponse.setNationalCode(String.valueOf(responseMap.get("national_code")));
        createDigitalPromissoryNoteRecipientResponse.setAccountNumber(String.valueOf(responseMap.get("account_number")));
        createDigitalPromissoryNoteRecipientResponse.setPostalCode(String.valueOf(responseMap.get("postal_code")));
        createDigitalPromissoryNoteRecipientResponse.setAddress(String.valueOf(responseMap.get("address")));
        createDigitalPromissoryNoteRecipientResponse.setLegal((boolean) responseMap.get("is_legal"));
        createDigitalPromissoryNoteRecipientResponse.setCreateDateTime(toLocalDateTime(String.valueOf(responseMap.get("create_date_time"))));
        createDigitalPromissoryNoteRecipientResponse.setPersianCreateDateTime(toPersianDate(createDigitalPromissoryNoteRecipientResponse.getCreateDateTime()));

        return createDigitalPromissoryNoteRecipientResponse;
    }

    private Map<String, Object> setReceiveDigitalPromissoryNoteRequest(ReceiveDigitalPromissoryNoteRequest receiveDigitalPromissoryNoteRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("amount", receiveDigitalPromissoryNoteRequest.getAmount().longValue());
        requestMap.put("description", receiveDigitalPromissoryNoteRequest.getDescription());
        requestMap.put("due_date", toPersianDate(receiveDigitalPromissoryNoteRequest.getDueDate()));
        requestMap.put("issuer_full_name", receiveDigitalPromissoryNoteRequest.getFullName());
        requestMap.put("issuer_mobile_number", receiveDigitalPromissoryNoteRequest.getMobileNumber());
        requestMap.put("issuer_national_code", receiveDigitalPromissoryNoteRequest.getNationalCode());
        requestMap.put("issuer_account_number", receiveDigitalPromissoryNoteRequest.getAccountNumber());
        requestMap.put("issuer_postal_code", receiveDigitalPromissoryNoteRequest.getPostalCode());
        requestMap.put("issuer_address", receiveDigitalPromissoryNoteRequest.getAddress());
        requestMap.put("issuer_is_legal", receiveDigitalPromissoryNoteRequest.isLegal());
        requestMap.put("recipient_national_code", receiveDigitalPromissoryNoteRequest.getRecipientNationalCode());

        return requestMap;
    }

    private ReceiveDigitalPromissoryNoteResponse mapToReceiveDigitalPromissoryNoteResponse(String jsonResponse) {

        ReceiveDigitalPromissoryNoteResponse receiveDigitalPromissoryNoteResponse = new ReceiveDigitalPromissoryNoteResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        receiveDigitalPromissoryNoteResponse.setPromissoryNoteId(String.valueOf(responseMap.get("promissory_note_id")));
        receiveDigitalPromissoryNoteResponse.setRequestId(String.valueOf(responseMap.get("request_id")));
        receiveDigitalPromissoryNoteResponse.setUnSignedPromissoryNoteBase64(String.valueOf(responseMap.get("unsigned_data")));

        return receiveDigitalPromissoryNoteResponse;
    }

    private Map<String, Object> setGetPaymentUrlDigitalPromissoryNoteRequest(GetPaymentUrlDigitalPromissoryNoteRequest getPaymentUrlDigitalPromissoryNoteRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("request_id", getPaymentUrlDigitalPromissoryNoteRequest.getRequestId());
        requestMap.put("callback_url", getPaymentUrlDigitalPromissoryNoteRequest.getCallBackUrl());

        return requestMap;
    }

    private GetPaymentUrlDigitalPromissoryNoteResponse mapToGetPaymentUrlDigitalPromissoryNoteResponse(String jsonResponse) {

        GetPaymentUrlDigitalPromissoryNoteResponse getPaymentUrlDigitalPromissoryNoteResponse = new GetPaymentUrlDigitalPromissoryNoteResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        getPaymentUrlDigitalPromissoryNoteResponse.setPaymentGateWayUrl(String.valueOf(responseMap.get("payment_gateway_link")));

        return getPaymentUrlDigitalPromissoryNoteResponse;
    }

    private Map<String, Object> setPaymentStatusDigitalPromissoryNoteRequest(PaymentStatusDigitalPromissoryNoteRequest paymentStatusDigitalPromissoryNoteRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("payment_id", paymentStatusDigitalPromissoryNoteRequest.getPaymentId());
        requestMap.put("request_id", paymentStatusDigitalPromissoryNoteRequest.getRequestId());

        return requestMap;

    }

    private PaymentStatusDigitalPromissoryNoteResponse mapToPaymentStatusDigitalPromissoryNoteResponse(String jsonResponse) {

        PaymentStatusDigitalPromissoryNoteResponse paymentStatusDigitalPromissoryNoteResponse = new PaymentStatusDigitalPromissoryNoteResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        paymentStatusDigitalPromissoryNoteResponse.setSuccessful(String.valueOf(responseMap.get("message")).contains("موفقیت"));

        return paymentStatusDigitalPromissoryNoteResponse;
    }

    private Map<String, Object> setSignDigitalPromissoryNoteRequest(SignDigitalPromissoryNoteRequest signDigitalPromissoryNoteRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("national_code", signDigitalPromissoryNoteRequest.getNationalCode());
        requestMap.put("request_id", signDigitalPromissoryNoteRequest.getRequestId());
        requestMap.put("p12_file", signDigitalPromissoryNoteRequest.getDigitalCertificateData());
        requestMap.put("p12_password", signDigitalPromissoryNoteRequest.getDigitalCertificatePassword());

        return requestMap;

    }

    private SignDigitalPromissoryNoteResponse mapToSignDigitalPromissoryNoteResponse(String jsonResponse) {

        SignDigitalPromissoryNoteResponse signDigitalPromissoryNoteResponse = new SignDigitalPromissoryNoteResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        signDigitalPromissoryNoteResponse.setSignedPromissoryNoteBase64(String.valueOf(responseMap.get("signed_pdf")));
        signDigitalPromissoryNoteResponse.setRequestId(String.valueOf(responseMap.get("request_id")));
        signDigitalPromissoryNoteResponse.setStatus(true);

        return signDigitalPromissoryNoteResponse;
    }

    private Map<String, Object> setFinalRegistrationDigitalPromissoryNoteRequest(FinalRegistrationDigitalPromissoryNoteRequest finalRegistrationDigitalPromissoryNoteRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("signed_pdf", finalRegistrationDigitalPromissoryNoteRequest.getSignedPromissoryNoteBase64());
        requestMap.put("request_id", finalRegistrationDigitalPromissoryNoteRequest.getRequestId());

        return requestMap;

    }

    private FinalRegistrationDigitalPromissoryNoteResponse mapToFinalRegistrationDigitalPromissoryNoteResponse(String jsonResponse) {

        FinalRegistrationDigitalPromissoryNoteResponse finalRegistrationDigitalPromissoryNoteResponse = new FinalRegistrationDigitalPromissoryNoteResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        finalRegistrationDigitalPromissoryNoteResponse.setRegisteredSignedPromissoryNoteBase64(String.valueOf(responseMap.get("data")));
        finalRegistrationDigitalPromissoryNoteResponse.setStatus((boolean) responseMap.get("result"));

        return finalRegistrationDigitalPromissoryNoteResponse;

    }

    private InquiryDigitalPromissoryNotesResponse mapToInquiryDigitalPromissoryNotesResponse(String jsonResponse) {

        InquiryDigitalPromissoryNotesResponse inquiryDigitalPromissoryNotesResponse = new InquiryDigitalPromissoryNotesResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        List<Map<String, Object>> promissoryNotesList = (List<Map<String, Object>>) responseMap.get("promissory_notes_list");
        List<DigitalPromissoryNoteDto> digitalPromissoryNoteDtos = new ArrayList<>();

        for (int i = 0; i < promissoryNotesList.size(); i++) {

            Map<String, Object> promissoryNoteMap = promissoryNotesList.get(i);

            String dueDate = String.valueOf(promissoryNoteMap.get("due_date"));
            dueDate = String.format("%s/%s/%s", dueDate.substring(0, 4), dueDate.substring(4, 6), dueDate.substring(6));

            digitalPromissoryNoteDtos.add(DigitalPromissoryNoteDto.builder()
                    .id(String.valueOf(promissoryNoteMap.get("id")))
                    .requestId(String.valueOf(promissoryNoteMap.get("request_id")))
                    .issuerFullName(String.valueOf(promissoryNoteMap.get("issuer_full_name")))
                    .recipientFullName(String.valueOf(promissoryNoteMap.get("recipient_full_name")))
                    .paidStatus(PromissoryNotePaidStatus.get(String.valueOf(promissoryNoteMap.get("paid_status"))))
                    .requestStatus(PromissoryNoteRequestStatus.get(String.valueOf(promissoryNoteMap.get("request_status"))))
                    .signStatus(PromissoryNoteSignStatus.get(String.valueOf(promissoryNoteMap.get("sign_status"))))
                    .dueDate(CommonUtil.perisanDateToLocalDateTime(dueDate))
                    .persianDueDate(dueDate)
                    .createdDateTime(toLocalDateTime(String.valueOf(promissoryNoteMap.get("created_date_time"))))
                    .persianCreatedDateTime(toPersianDate(toLocalDateTime(String.valueOf(promissoryNoteMap.get("created_date_time")))))
                    .createdBy(String.valueOf(promissoryNoteMap.get("created_by")))
                    .description(String.valueOf(promissoryNoteMap.get("description")))
                    .unsignedBase64(String.valueOf(promissoryNoteMap.get("unsigned_pdf")))
                    .signedPdfBase64(String.valueOf(promissoryNoteMap.get("signed_pdf")))
                    .finalPromissoryNoteBase64(String.valueOf(promissoryNoteMap.get("final_promissory_note")))
                    .build());

        }

        inquiryDigitalPromissoryNotesResponse.setCount(digitalPromissoryNoteDtos.size());
        inquiryDigitalPromissoryNotesResponse.setDigitalPromissoryNotes(digitalPromissoryNoteDtos);
        return inquiryDigitalPromissoryNotesResponse;

    }

    private Map<String, Object> setRemoveDigitalPromissoryNoteRequest(RemoveDigitalPromissoryNoteRequest removeDigitalPromissoryNoteRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();

        requestMap.put("request_id", removeDigitalPromissoryNoteRequest.getRequestId());

        return requestMap;

    }

    private RemoveDigitalPromissoryNoteResponse mapToRemoveDigitalPromissoryNoteResponse(String jsonResponse) {

        RemoveDigitalPromissoryNoteResponse removeDigitalPromissoryNoteResponse = new RemoveDigitalPromissoryNoteResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        removeDigitalPromissoryNoteResponse.setRemove(String.valueOf(responseMap.get("message")).contains("موفقیت"));

        return removeDigitalPromissoryNoteResponse;
    }

    private GetAllDigitalPromissoryNoteRecipientResponse mapToGetAllDigitalPromissoryNoteRecipientResponse(String jsonResponse) {

        GetAllDigitalPromissoryNoteRecipientResponse getAllDigitalPromissoryNoteRecipientResponse = new GetAllDigitalPromissoryNoteRecipientResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        List<Map<String, Object>> recipientList = (List<Map<String, Object>>) responseMap.get("recipient_list");
        List<DigitalPromissoryNoteRecipientDto> digitalPromissoryNoteRecipients = new ArrayList<>();

        for (int i = 0; i < recipientList.size(); i++) {

            Map<String, Object> digitalPromissoryNoteRecipientMap = recipientList.get(i);

            digitalPromissoryNoteRecipients.add(DigitalPromissoryNoteRecipientDto.builder()
                    .recipientId(String.valueOf(digitalPromissoryNoteRecipientMap.get("id")))
                    .nationalCode(String.valueOf(digitalPromissoryNoteRecipientMap.get("national_code")))
                    .fullName(String.valueOf(digitalPromissoryNoteRecipientMap.get("full_name")))
                    .legal((boolean) digitalPromissoryNoteRecipientMap.get("is_legal"))
                    .build());

        }

        getAllDigitalPromissoryNoteRecipientResponse.setDigitalPromissoryNoteRecipientList(digitalPromissoryNoteRecipients);

        return getAllDigitalPromissoryNoteRecipientResponse;

    }

    private RemoveDigitalPromissoryNoteRecipientResponse mapToRemoveDigitalPromissoryNoteRecipientResponse(String jsonResponse) {

        RemoveDigitalPromissoryNoteRecipientResponse removeDigitalPromissoryNoteRecipientResponse = new RemoveDigitalPromissoryNoteRecipientResponse();

        Map responseMap = CommonUtil.jsonToMap(jsonResponse);

        removeDigitalPromissoryNoteRecipientResponse.setRemove((boolean) responseMap.get("recipient_found_and_removed"));

        return removeDigitalPromissoryNoteRecipientResponse;

    }

    public static LocalDateTime toLocalDateTime(String yyyyMMdd) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Date date = null;
        try {
            date = simpleDateFormat.parse(yyyyMMdd);
        } catch (ParseException e) {
            CommonUtil.logError(FaraboomDigitalCertificateService.class.getSimpleName(), "toLocalDateTime", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());

    }

    private String toPersianDate(LocalDateTime localDateTime) {

        String date = CommonUtil.convertToPersianDate(localDateTime);

        return date.replaceAll("/", "");
    }
}
