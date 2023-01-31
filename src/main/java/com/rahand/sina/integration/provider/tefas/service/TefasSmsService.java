package com.rahand.sina.integration.provider.tefas.service;

import com.rahand.common.constant.CommonConstants;
import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.sms.dto.SmsRequest;
import com.rahand.sina.integration.domain.sms.dto.SmsResponse;
import com.rahand.sina.integration.domain.sms.service.spec.Sms;
import com.rahand.sina.integration.provider.tefas.constants.TefasConstants;
import com.rahand.sina.integration.provider.tefas.dto.TefasBaseResponse;
import com.rahand.sina.integration.provider.tefas.dto.TokenResponse;
import com.rahand.sina.integration.provider.tefas.util.TefasRestClient;
import com.rahand.sina.integration.provider.tefas.util.TefasUtil;
import okhttp3.Response;

import java.util.LinkedHashMap;

public class TefasSmsService implements Sms {

    private TefasAuthenticationService authenticationService;

    public SmsResponse sendSms(SmsRequest smsRequest) {

        SmsResponse smsResponse = new SmsResponse();

        if (!CommonUtil.mobileValidation(smsRequest.getMobileNumber())) {
            smsResponse = new SmsResponse();
            smsResponse.setSend(false);
            smsResponse.setError(true);
            smsResponse.setErrorMessage(CommonErrorMessage.INVALID_MOBILE_NUMBER);
            CommonUtil.logError(getClass().getSimpleName(), "sendSms", smsResponse.getErrorMessage());
            return smsResponse;

        }

        LinkedHashMap<String, String> requestMap = new LinkedHashMap<>();
        requestMap.put("MobileNo", smsRequest.getMobileNumber());
        requestMap.put("Message", smsRequest.getMessage());
        authenticationService = TefasAuthenticationService.getInstance();
        TokenResponse tokenResponse = authenticationService.getAuthenticationToken();
        if (tokenResponse.isError()) {
            smsResponse.setSend(false);
            smsResponse.setError(true);
            smsResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        } else {
            String url = TefasConstants.BASE_URL + "api/Common/SendSms";
            Response response = TefasRestClient.postRequest(url, requestMap, 30l, tokenResponse.getToken());
            TefasBaseResponse<SmsResponse> tefasBaseResponse;

            if (response.code() == 200) {

                tefasBaseResponse = TefasUtil.mapToBaseResponse(response, SmsResponse.class);
                smsResponse = tefasBaseResponse.getResponseModel();

                if (tefasBaseResponse.isError()) {
                    smsResponse = new SmsResponse();
                    smsResponse.setSend(false);
                    smsResponse.setError(true);
                    smsResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);

                    CommonUtil.logError(getClass().getSimpleName(), "sendSms",
                            String.format(CommonConstants.API_ERROR_LOG_FORMAT, tefasBaseResponse.getMessageCode(),
                                    tefasBaseResponse.getPersianContent()), ServiceLogsDto.builder()
                                    .input(CommonUtil.toJson(requestMap))
                                    .output(CommonUtil.toJson(tefasBaseResponse))
                                    .build());
                } else {
                    smsResponse.setSend(true);
                }

            } else if (response.code() == 403) {
                TefasAuthenticationService.TOKEN_INVALID = true;
                smsResponse = new SmsResponse();
                smsResponse.setSend(false);
                smsResponse.setSessionExpired(true);
                smsResponse.setError(true);
                smsResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "sendSms", TefasConstants.TOKEN_EXPIRED);

            } else {
                String errorResponse = TefasUtil.responseBodyToString(response);
                smsResponse = new SmsResponse();
                smsResponse.setSend(false);
                smsResponse.setErrorMessage(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
                CommonUtil.logError(getClass().getSimpleName(), "sendSms", errorResponse, ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(requestMap))
                        .output(errorResponse)
                        .build());
            }

            response.close();
        }


        return smsResponse;
    }
}
