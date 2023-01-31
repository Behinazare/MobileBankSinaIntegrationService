package com.rahand.sina.integration.provider.faraboom.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.enums.Gender;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.digitalcertificate.dto.*;
import com.rahand.sina.integration.domain.digitalcertificate.enums.CertificateStatus;
import com.rahand.sina.integration.domain.digitalcertificate.enums.CertificateType;
import com.rahand.sina.integration.domain.digitalcertificate.service.spec.DigitalCertificate;
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

public class FaraboomDigitalCertificateService implements DigitalCertificate {

    private final String BASE_URL = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_BASE_URL");
    private final String APP_KEY = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_APP_KEY");
    private final String TOKEN_ID = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_BOOM_TOKEN_ID");
    private final String DEVICE_ID = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_DEVICE_ID");
    private final String BANK_ID = IntegrationLibConfig.getProperty("RAHAND_FARABOOM_BANK_ID");

    @Override
    public DigitalCertificateIntroduceResponse introduce(DigitalCertificateIntroduceRequest digitalCertificateIntroduceRequest) {

        DigitalCertificateIntroduceResponse digitalCertificateIntroduceResponse = new DigitalCertificateIntroduceResponse();
        String apiUrl = BASE_URL + "/certificate/introduce";
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setIntroduceRequest(digitalCertificateIntroduceRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            digitalCertificateIntroduceResponse = mapToDigitalCertificateIntroduceResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomDigitalCertificateService.class.getSimpleName(), "introduce", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            digitalCertificateIntroduceResponse.setError(true);
            digitalCertificateIntroduceResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return digitalCertificateIntroduceResponse;
    }

    @Override
    public DigitalCertificateCreateResponse create(DigitalCertificateCreateRequest digitalCertificateCreateRequest) {

        DigitalCertificateCreateResponse digitalCertificateCreateResponse = new DigitalCertificateCreateResponse();

        String passJson = EncryptionService.decrypt(digitalCertificateCreateRequest.getPassword()).getDecryptedData();
        Map<String,String> passMap = CommonUtil.jsonToMap(passJson);
        String paas = passMap.get("Secure_signPass");
        String repeatPass = passMap.get("Secure_signPassR");

        if(!paas.matches("^[0-9]*$")){
            digitalCertificateCreateResponse.setError(true);
            digitalCertificateCreateResponse.setErrorMessage("رمز عبور فقط می تواند شامل اعداد باشد");
        }else {
            if (paas.equals(repeatPass)){
                digitalCertificateCreateRequest.setPassword(paas);

                String apiUrl = BASE_URL + "/certificate/create";
                Headers headers = setDefualtHeaders();
                Map<String, Object> requestMap = setCreateRequest(digitalCertificateCreateRequest);
                Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

                if (response.isSuccessful()) {
                    String jsonResponse = FaraboomUtil.responseBodyToString(response);
                    digitalCertificateCreateResponse = mapToDigitalCertificateInCreateResponse(jsonResponse);
                } else {
                    String jsonResponse = FaraboomUtil.responseBodyToString(response);
                    FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
                    CommonUtil.logError(FaraboomDigitalCertificateService.class.getSimpleName(), "create", jsonResponse, ServiceLogsDto.builder()
                            .input(CommonUtil.toJson(requestMap))
                            .output(jsonResponse)
                            .build());
                    digitalCertificateCreateResponse.setError(true);
                    digitalCertificateCreateResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
                }
            }else {
                digitalCertificateCreateResponse.setError(true);
                digitalCertificateCreateResponse.setErrorMessage("تکرار رمز عبور اشتباه است");
            }

        }


        return digitalCertificateCreateResponse;
    }

    @Override
    public DigitalCertificateRemoveResponse remove(DigitalCertificateRemoveRequest digitalCertificateRemoveRequest) {

        DigitalCertificateRemoveResponse digitalCertificateRemoveResponse = new DigitalCertificateRemoveResponse();

        String apiUrl = BASE_URL + "/certificate/remove";
        Headers headers = setDefualtHeaders();
        Map<String, Object> requestMap = setRemoveRequest(digitalCertificateRemoveRequest);
        Response response = FaraboomRestClient.postRequest(apiUrl, headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            digitalCertificateRemoveResponse = mapToDigitalCertificateInRemoveResponse(jsonResponse);
        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            FaraboomErrorResponse errorResponse = FaraboomUtil.mapToErrorResponse(jsonResponse);
            CommonUtil.logError(FaraboomDigitalCertificateService.class.getSimpleName(), "remove", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            digitalCertificateRemoveResponse.setError(true);
            digitalCertificateRemoveResponse.setErrorMessage(errorResponse.getErrors().get(0).getMessage());
        }

        return digitalCertificateRemoveResponse;
    }

    public List<Map<String, Object>> getStates() {

        List<Map<String, Object>> statesList = new ArrayList<>();
        String apiUrl = BASE_URL + "/certificate/state/all";
        Headers headers = setDefualtHeaders();
        Response response = FaraboomRestClient.getRequest(apiUrl, headers, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            Object list = CommonUtil.jsonToMap(jsonResponse).get("state_list");
            statesList = (List<Map<String, Object>>) list;
        }

        return statesList;
    }

    public List<Map<String, Object>> getStateCites(Integer stateCode) {

        List<Map<String, Object>> cityList = new ArrayList<>();
        String apiUrl = BASE_URL + String.format("/certificate/state/%s/city", stateCode);
        Headers headers = setDefualtHeaders();
        Response response = FaraboomRestClient.getRequest(apiUrl, headers, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            Object list = CommonUtil.jsonToMap(jsonResponse).get("city_list");
            cityList = (List<Map<String, Object>>) list;
        }

        return cityList;
    }

    public List<Map<String, Object>> getNonGovernmentalOrganizationType() {

        List<Map<String, Object>> organizationTypeList = new ArrayList<>();
        String apiUrl = BASE_URL + "/certificate/nonGovernmentalOrganizationType";
        Headers headers = setDefualtHeaders();
        Response response = FaraboomRestClient.getRequest(apiUrl, headers, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            Object list = CommonUtil.jsonToMap(jsonResponse).get("organization_types");
            organizationTypeList = (List<Map<String, Object>>) list;
        }

        return organizationTypeList;
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

    private Map<String, Object> setIntroduceRequest(DigitalCertificateIntroduceRequest digitalCertificateIntroduceRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();
        requestMap.put("address", digitalCertificateIntroduceRequest.getAddress());
        requestMap.put("birth_date", toPersianDate(digitalCertificateIntroduceRequest.getBirthDate()));
        requestMap.put("city_code", digitalCertificateIntroduceRequest.getCityCode());
        requestMap.put("email", digitalCertificateIntroduceRequest.getEmail());
        requestMap.put("en_first_name", digitalCertificateIntroduceRequest.getLatinFirstName());
        requestMap.put("en_last_name", digitalCertificateIntroduceRequest.getLatinLastName());
        requestMap.put("fa_first_name", digitalCertificateIntroduceRequest.getFirstName());
        requestMap.put("fa_last_name", digitalCertificateIntroduceRequest.getLastName());
        requestMap.put("father_name", digitalCertificateIntroduceRequest.getFatherName());

        Integer gender = 0;

        if (digitalCertificateIntroduceRequest.getGender().equals(Gender.FEMALE)) {
            gender = 2;
        } else if (digitalCertificateIntroduceRequest.getGender().equals(Gender.MALE)) {
            gender = 1;
        } else if (digitalCertificateIntroduceRequest.getGender().equals(Gender.UNKNOWN)) {
            gender = 3;
        }

        requestMap.put("gender", gender);
        requestMap.put("job_title", digitalCertificateIntroduceRequest.getJobTitle());
        requestMap.put("mobile_number", digitalCertificateIntroduceRequest.getMobileNumber());
        requestMap.put("national_code", digitalCertificateIntroduceRequest.getNationalCode());
        requestMap.put("phone_number", digitalCertificateIntroduceRequest.getPhoneNumber());
        requestMap.put("postal_code", digitalCertificateIntroduceRequest.getPostalCode());
        requestMap.put("state_code", digitalCertificateIntroduceRequest.getStatCode());
        requestMap.put("is_organizational_person", digitalCertificateIntroduceRequest.isOrganizationPerson());
//        requestMap.put("organization", null);


        return requestMap;
    }

    private Map<String, Object> setCreateRequest(DigitalCertificateCreateRequest digitalCertificateCreateRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();
        requestMap.put("certificate_request_id", digitalCertificateCreateRequest.getCertificateRequestId());
        requestMap.put("national_code", digitalCertificateCreateRequest.getNationalCode());
        requestMap.put("password", digitalCertificateCreateRequest.getPassword());
        return requestMap;
    }

    private Map<String, Object> setRemoveRequest(DigitalCertificateRemoveRequest digitalCertificateRemoveRequest) {

        Map<String, Object> requestMap = new LinkedHashMap<>();
        requestMap.put("certificate_request_id", digitalCertificateRemoveRequest.getCertificateRequestId());
        requestMap.put("national_code", digitalCertificateRemoveRequest.getNationalCode());
        requestMap.put("reason", digitalCertificateRemoveRequest.getReason().getId());
        return requestMap;
    }

    private DigitalCertificateIntroduceResponse mapToDigitalCertificateIntroduceResponse(String json) {

        DigitalCertificateIntroduceResponse digitalCertificateIntroduceResponse = new DigitalCertificateIntroduceResponse();
        Map responseMap = CommonUtil.jsonToMap(json);
        Map clientView = (Map) responseMap.get("client_view");
        if(clientView == null){
            digitalCertificateIntroduceResponse.setRequestId(String.valueOf(responseMap.get("request_id")));

        }else {
            digitalCertificateIntroduceResponse.setRequestId(String.valueOf(clientView.get("request_id")));

        }
        digitalCertificateIntroduceResponse.setCertificateType(CertificateType.ACTUAL);
        digitalCertificateIntroduceResponse.setCertificateStatus(CertificateStatus.PENDING);
        return digitalCertificateIntroduceResponse;
    }

    private DigitalCertificateCreateResponse mapToDigitalCertificateInCreateResponse(String json) {

        DigitalCertificateCreateResponse digitalCertificateCreateResponse = new DigitalCertificateCreateResponse();
        Map responseMap = CommonUtil.jsonToMap(json);
        digitalCertificateCreateResponse.setCertificateP12file(String.valueOf(responseMap.get("p12_file")));
        digitalCertificateCreateResponse.setCertificateStatus(CertificateStatus.ISSUED);
        digitalCertificateCreateResponse.setExpireDate(toLocalDateTime(String.valueOf(responseMap.get("expire_date") != null ? responseMap.get("expire_date") : responseMap.get("expire_ate"))));
        digitalCertificateCreateResponse.setPersianExpireDate(CommonUtil.convertToPersianDate(digitalCertificateCreateResponse.getExpireDate()));
        return digitalCertificateCreateResponse;
    }

    private DigitalCertificateRemoveResponse mapToDigitalCertificateInRemoveResponse(String json) {

        DigitalCertificateRemoveResponse digitalCertificateRemoveResponse = new DigitalCertificateRemoveResponse();
        Map responseMap = CommonUtil.jsonToMap(json);
        digitalCertificateRemoveResponse.setRemove(true);
        return digitalCertificateRemoveResponse;
    }

    public static LocalDateTime toLocalDateTime(String yyyyMMdd) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
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

        return date.replaceAll("/", "-");
    }
}
