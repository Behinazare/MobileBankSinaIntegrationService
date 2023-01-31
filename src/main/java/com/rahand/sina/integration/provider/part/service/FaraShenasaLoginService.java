package com.rahand.sina.integration.provider.part.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.provider.part.dto.FaraShensaLoginRequest;
import com.rahand.sina.integration.provider.part.dto.FaraShensaLoginResponse;
import com.rahand.sina.integration.provider.part.util.PartRestClient;
import okhttp3.Headers;
import okhttp3.Response;

import java.time.LocalDateTime;
import java.util.Map;

public class FaraShenasaLoginService {

    private static FaraShensaLoginResponse loginResponse;


    public static FaraShensaLoginResponse login() {

        if (loginResponse == null || loginResponse.getExpireDate().isAfter(LocalDateTime.now())) {
            getToken();
        }

        return loginResponse;

    }

    private static FaraShensaLoginResponse getToken() {

        String apiUrl = IntegrationLibConfig.getProperty("FARASHENASA_BASE_URL") + "/service/onlineAuth@3/authenticate";
        FaraShensaLoginRequest faraShensaLoginRequest = FaraShensaLoginRequest.builder()
                .system(IntegrationLibConfig.getProperty("FARASHENASA_SYSTEM"))
                .authenticationPack(FaraShensaLoginRequest.AuthenticationPack.builder()
                        .username(IntegrationLibConfig.getProperty("FARASHENASA_BASE_URL"))
                        .password(IntegrationLibConfig.getProperty("FARASHENASA_PASSWORD"))
                        .build())
                .build();

        Headers headers = new Headers.Builder()
                .build();

        Response response = PartRestClient.postRequest(apiUrl, headers, CommonUtil.toJson(faraShensaLoginRequest), 30l);

        if (response.isSuccessful()) {
            String responseJson = PartRestClient.responseBodyToString(response);
            Map<String, String> responseMap = CommonUtil.jsonToMap(responseJson);
            Map<String, String> dataMap = CommonUtil.jsonToMap(responseMap.get("data"));
            Map<String, String> metaMap = CommonUtil.jsonToMap(responseMap.get("meta"));
            loginResponse = new FaraShensaLoginResponse();
            loginResponse.setToken(dataMap.get("token"));
            String persianExpireDate = metaMap.get("shamsiDate");
            persianExpireDate = String.format("%s/%s/%s", persianExpireDate.substring(0, 4), persianExpireDate.substring(4, 6), persianExpireDate.substring(6, 8));
            loginResponse.setExpireDate(CommonUtil.perisanDateToLocalDateTime(persianExpireDate));
        } else {
            String responseJson = PartRestClient.responseBodyToString(response);
            CommonUtil.logError(FaraShenasaLoginService.class.getSimpleName(), "getToken", responseJson, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(faraShensaLoginRequest))
                    .output(responseJson)
                    .build());

            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);

        }

        return loginResponse;

    }
}
