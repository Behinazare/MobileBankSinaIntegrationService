package com.rahand.sina.integration.provider.tefas.service;

import com.rahand.common.constant.CommonConstants;
import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.dto.*;
import com.rahand.sina.integration.domain.inquiry.service.spec.GovernmentalInquiry;
import com.rahand.sina.integration.provider.tefas.constants.TefasConstants;
import com.rahand.sina.integration.provider.tefas.dto.TefasBaseResponse;
import com.rahand.sina.integration.provider.tefas.dto.TokenResponse;
import com.rahand.sina.integration.provider.tefas.util.TefasRestClient;
import com.rahand.sina.integration.provider.tefas.util.TefasUtil;
import okhttp3.Response;

import java.util.LinkedHashMap;

public class TefasInquiryService implements GovernmentalInquiry {

    private TefasAuthenticationService authenticationService;

    public TefasInquiryService() {
        authenticationService = TefasAuthenticationService.getInstance();
    }

    @Override
    public ShahkarResponse shahkarInquiry(ShahkarRequest shahkarRequest) {

        ShahkarResponse shahkarResponse = new ShahkarResponse();
        LinkedHashMap<String, Object> requestMap = new LinkedHashMap<>();
        requestMap.put("identificationType", shahkarRequest.getShahkarIdendtificationType().getId());
        requestMap.put("identificationNo", shahkarRequest.getIdentificationNo());
        requestMap.put("serviceType", shahkarRequest.getServiceType());
        requestMap.put("serviceNumber", shahkarRequest.getServiceNumber());
        TokenResponse tokenResponse = authenticationService.getAuthenticationToken();

        if (tokenResponse.isError()) {
            shahkarResponse.setError(true);
            shahkarResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        } else {
            String url = TefasConstants.BASE_URL + "api/Shahkar/shahkar";
            Response response = TefasRestClient.postRequest(url, requestMap, 30l, tokenResponse.getToken());
            TefasBaseResponse<ShahkarResponse> tefasBaseResponse;

            if (response.code() == 200) {

                tefasBaseResponse = TefasUtil.mapToBaseResponse(response, ShahkarResponse.class);

                if (tefasBaseResponse.isError()) {

                    shahkarResponse = new ShahkarResponse();
                    shahkarResponse.setError(true);
                    shahkarResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
                    CommonUtil.logError(getClass().getSimpleName(), "shahkarInquiry",
                            String.format(CommonConstants.API_ERROR_LOG_FORMAT, tefasBaseResponse.getMessageCode(),
                                    tefasBaseResponse.getPersianContent()), ServiceLogsDto.builder()
                                    .input(CommonUtil.toJson(requestMap))
                                    .output(CommonUtil.toJson(tefasBaseResponse))
                                    .build());
                } else {
                    shahkarResponse = tefasBaseResponse.getResponseModel();

                    if (shahkarResponse.getResponse().equals("200")) {
                        shahkarResponse.setError(false);
                        shahkarResponse.setShahkarStatus(true);
                    } else if (shahkarResponse.getResponse().equals("600")) {
                        shahkarResponse.setError(true);
                        shahkarResponse.setErrorMessage(TefasConstants.SHAHKAR_ERROR_MESSAGE);
                    } else if (shahkarResponse.getResponse().equals("311")) {
                        shahkarResponse.setError(true);
                        shahkarResponse.setErrorMessage(TefasConstants.INVALID_INPUT);
                    } else {
                        shahkarResponse.setError(true);
                        shahkarResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                    }

                    if (shahkarResponse.isError()) {
                        CommonUtil.logError(getClass().getSimpleName(), "shahkarInquiry",
                                String.format(CommonConstants.API_ERROR_LOG_FORMAT, shahkarResponse.getResponse(), shahkarResponse.getComment()), ServiceLogsDto.builder()
                                        .input(CommonUtil.toJson(requestMap))
                                        .output(CommonUtil.toJson(tefasBaseResponse))
                                        .build());
                    }
                }

            } else if (response.code() == 403) {
                TefasAuthenticationService.TOKEN_INVALID = true;
                shahkarResponse = new ShahkarResponse();
                shahkarResponse.setSessionExpired(true);
                shahkarResponse.setError(true);
                shahkarResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "shahkarInquiry", TefasConstants.TOKEN_EXPIRED);

            } else {
                String errorResponse = TefasUtil.responseBodyToString(response);
                shahkarResponse = new ShahkarResponse();
                shahkarResponse.setError(true);
                shahkarResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "shahkarInquiry", errorResponse, ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(requestMap))
                        .output(errorResponse)
                        .build());
            }

            response.close();
        }

        return shahkarResponse;

    }

    @Override
    public PostInquiryResponse postInquiry(PostInquiryRequest postInquiryRequest) {

        PostInquiryResponse inquiryResponse = new PostInquiryResponse();
        LinkedHashMap<String, String> requestMap = new LinkedHashMap<>();
        requestMap.put("Postalcode", postInquiryRequest.getPostalCode());
        authenticationService = TefasAuthenticationService.getInstance();
        TokenResponse tokenResponse = authenticationService.getAuthenticationToken();
        if (tokenResponse.isError()) {
            inquiryResponse.setError(true);
            inquiryResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        } else {
            String url = TefasConstants.BASE_URL + "api/PostOffice/Address";
            Response response = TefasRestClient.postRequest(url, requestMap, 30l, tokenResponse.getToken());
            TefasBaseResponse<PostInquiryResponse> tefasBaseResponse;

            if (response.code() == 200) {

                tefasBaseResponse = TefasUtil.mapToBaseResponse(response, PostInquiryResponse.class);

                if (tefasBaseResponse.isError()) {
                    inquiryResponse = new PostInquiryResponse();
                    inquiryResponse.setError(true);
                    String errorMessage = tefasBaseResponse.getPersianContent().contains("کد") ? TefasConstants.INVALID_POSTAL_CODE : "مشکلی در ارتباط با سرویس استعلام کد پستی رخ داده است";
                    inquiryResponse.setErrorMessage(errorMessage);
                    CommonUtil.logError(getClass().getSimpleName(), "postInquiry",
                            String.format(CommonConstants.API_ERROR_LOG_FORMAT, tefasBaseResponse.getMessageCode(),
                                    tefasBaseResponse.getPersianContent()),ServiceLogsDto.builder()
                                    .input(CommonUtil.toJson(requestMap))
                                    .output(CommonUtil.toJson(tefasBaseResponse))
                                    .build());
                } else {
                    inquiryResponse = tefasBaseResponse.getResponseModel();
                    inquiryResponse.setError(false);
                }

            } else if (response.code() == 403) {
                TefasAuthenticationService.TOKEN_INVALID = true;
                inquiryResponse = new PostInquiryResponse();
                inquiryResponse.setSessionExpired(true);
                inquiryResponse.setError(true);
                inquiryResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "postInquiry", TefasConstants.TOKEN_EXPIRED);

            } else {
                String errorResponse = TefasUtil.responseBodyToString(response);
                inquiryResponse = new PostInquiryResponse();
                inquiryResponse.setError(true);
                inquiryResponse.setErrorMessage(TefasConstants.INVALID_POSTAL_CODE);
                CommonUtil.logError(getClass().getSimpleName(), "postInquiry", errorResponse, ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(requestMap))
                        .output(errorResponse)
                        .build());
            }

            response.close();

        }

        return inquiryResponse;
    }

    @Override
    public PersonalInfoResponse personalInfoInquiry(PersonalInfoRequest personalInfoRequest) {

        PersonalInfoResponse personalInfoResponse = new PersonalInfoResponse();
        LinkedHashMap<String, String> requestMap = new LinkedHashMap<>();
        requestMap.put("nationalCode", personalInfoRequest.getNationalCode());
        requestMap.put("birthDate", personalInfoRequest.getBirthDate().contains("/") ?
                personalInfoRequest.getBirthDate().replaceAll("[/]", "") :
                personalInfoRequest.getBirthDate());
        authenticationService = TefasAuthenticationService.getInstance();
        TokenResponse tokenResponse = authenticationService.getAuthenticationToken();
        if (tokenResponse.isError()) {
            personalInfoResponse.setError(true);
            personalInfoResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        } else {
            String url = TefasConstants.BASE_URL + "api/SabtAhval/PersonalInformation";
            Response response = TefasRestClient.postRequest(url, requestMap, 30l, tokenResponse.getToken());
            TefasBaseResponse<PersonalInfoResponse> tefasBaseResponse;

            if (response.code() == 200) {

                tefasBaseResponse = TefasUtil.mapToBaseResponse(response, PersonalInfoResponse.class);

                if (tefasBaseResponse.isError()) {
                    personalInfoResponse = new PersonalInfoResponse();
                    personalInfoResponse.setError(true);
                    personalInfoResponse.setErrorMessage(tefasBaseResponse.getPersianContent());
                    CommonUtil.logError(getClass().getSimpleName(), "personalInfoInquiry",
                            String.format(CommonConstants.API_ERROR_LOG_FORMAT, tefasBaseResponse.getMessageCode(),
                                    tefasBaseResponse.getPersianContent()), ServiceLogsDto.builder()
                                    .input(CommonUtil.toJson(requestMap))
                                    .output(CommonUtil.toJson(tefasBaseResponse))
                                    .build());
                } else {
                    personalInfoResponse = tefasBaseResponse.getResponseModel();
                    personalInfoResponse.setError(false);
                }

            } else if (response.code() == 403) {
                TefasAuthenticationService.TOKEN_INVALID = true;
                personalInfoResponse = new PersonalInfoResponse();
                personalInfoResponse.setSessionExpired(true);
                personalInfoResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "personalInfoInquiry", TefasConstants.TOKEN_EXPIRED);

            } else {
                String errorResponse = TefasUtil.responseBodyToString(response);
                personalInfoResponse = new PersonalInfoResponse();
                personalInfoResponse.setError(true);
                personalInfoResponse.setErrorMessage(TefasConstants.INVALID_INPUT);
                CommonUtil.logError(getClass().getSimpleName(), "personalInfoInquiry", errorResponse, ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(requestMap))
                        .output(errorResponse)
                        .build());
            }

            response.close();

        }

        return personalInfoResponse;

    }

    @Override
    public PersonalImageResponse personalImageInquiry(PersonalImageRequest personalImageRequest) {

        PersonalImageResponse personalImageResponse = new PersonalImageResponse();
        LinkedHashMap<String, String> requestMap = new LinkedHashMap<>();
        requestMap.put("nationalCode", personalImageRequest.getNationalCode());
        requestMap.put("nationalCodeSerial", personalImageRequest.getNationalCodeSerial());
        authenticationService = TefasAuthenticationService.getInstance();
        TokenResponse tokenResponse = authenticationService.getAuthenticationToken();
        if (tokenResponse.isError()) {
            personalImageResponse.setError(true);
            personalImageResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        } else {
            String url = TefasConstants.BASE_URL + "api/SabtAhval/PersonImage";
            Response response = TefasRestClient.postRequest(url, requestMap, 30l, tokenResponse.getToken());
            TefasBaseResponse<PersonalImageResponse> tefasBaseResponse;

            if (response.code() == 200) {

                tefasBaseResponse = TefasUtil.mapToBaseResponse(response, PersonalImageResponse.class);

                if (tefasBaseResponse.isError()) {
                    personalImageResponse = new PersonalImageResponse();
                    personalImageResponse.setError(true);
                    personalImageResponse.setErrorMessage(tefasBaseResponse.getPersianContent());
                    CommonUtil.logError(getClass().getSimpleName(), "personalImageInquiry",
                            String.format(CommonConstants.API_ERROR_LOG_FORMAT, tefasBaseResponse.getMessageCode(),
                                    tefasBaseResponse.getPersianContent()), ServiceLogsDto.builder()
                                    .input(CommonUtil.toJson(requestMap))
                                    .output(CommonUtil.toJson(tefasBaseResponse))
                                    .build());
                } else {
                    personalImageResponse = tefasBaseResponse.getResponseModel();
                    personalImageResponse.setError(false);
                }

            } else if (response.code() == 403) {
                TefasAuthenticationService.TOKEN_INVALID = true;
                personalImageResponse = new PersonalImageResponse();
                personalImageResponse.setSessionExpired(true);
                personalImageResponse.setError(true);
                personalImageResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "personalImageInquiry", TefasConstants.TOKEN_EXPIRED);

            } else {
                String errorResponse = TefasUtil.responseBodyToString(response);
                personalImageResponse = new PersonalImageResponse();
                personalImageResponse.setError(true);
                personalImageResponse.setErrorMessage(TefasConstants.INVALID_INPUT);
                CommonUtil.logError(getClass().getSimpleName(), "personalImageInquiry", errorResponse, ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(requestMap))
                        .output(errorResponse)
                        .build());
            }

            response.close();
        }


        return personalImageResponse;

    }

}
