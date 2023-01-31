package com.rahand.sina.integration.provider.faraboom.service;


import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.provider.faraboom.dto.FaraboomLoginRequest;
import com.rahand.sina.integration.provider.faraboom.dto.FaraboomLoginResponse;
import com.rahand.sina.integration.provider.faraboom.util.FaraboomRestClient;
import com.rahand.sina.integration.provider.faraboom.util.FaraboomUtil;
import okhttp3.Headers;
import okhttp3.Response;

import java.util.LinkedHashMap;
import java.util.Map;

public class FaraboomLoginService {

    public FaraboomLoginResponse login(FaraboomLoginRequest faraboomLoginRequest) {

        FaraboomLoginResponse faraboomLoginResponse = new FaraboomLoginResponse();

        Map<String, String> requestMap = new LinkedHashMap<>();
        requestMap.put("username", faraboomLoginRequest.getUserName());
        requestMap.put("password", faraboomLoginRequest.getPassword());

        Headers headers = new Headers.Builder()
                .add("Accept-Language", "fa")
                .add("App-Key", "13774")
                .add("Device-Id", "192.168.1.1")
                .add("Bank-Id", "ETEMIR")
                .add("Token-Id", "p8VOFaS7w5MB62bUtDQ46uvuuwxG1csIA5AXYIgp3LsXfoR9xcc36nzVrFMeYez9nEty1RAqxuozHzAqCDBc8yKklk")
                .add("CLIENT-DEVICE-ID", "127.0.0.1")
                .add("CLIENT-IP-ADDRESS", "127.0.0.1")
                .add("CLIENT-USER-AGENT", "User Agent")
                .add("CLIENT-USER-ID", "09120000000")
                .add("CLIENT-PLATFORM-TYPE", "WEB")
                .add("CONTENT-TYPE", "application/json")
                .add("ACCEPT-LANGUAGE", "application/json")
                .build();

        Response response = FaraboomRestClient.postRequest("https://api.sandbox.faraboom.co/v1/auth/login", headers, requestMap, 30l);

        if (response.isSuccessful()) {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            faraboomLoginResponse = CommonUtil.jsonToObject(jsonResponse, FaraboomLoginResponse.class);

        } else {
            String jsonResponse = FaraboomUtil.responseBodyToString(response);
            CommonUtil.logError(FaraboomLoginService.class.getSimpleName(), "login", jsonResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(jsonResponse)
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return faraboomLoginResponse;
    }

}
