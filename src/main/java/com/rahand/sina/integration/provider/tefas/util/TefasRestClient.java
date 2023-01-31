package com.rahand.sina.integration.provider.tefas.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TefasRestClient {

    public static Response postRequest(String url, Map requestMap, Long timeout) {

        Response response;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(timeout, TimeUnit.SECONDS);
        builder.writeTimeout(timeout, TimeUnit.SECONDS);
        builder.connectTimeout(timeout, TimeUnit.SECONDS);
        OkHttpClient client = builder.build();

        try {
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8")
                    , CommonUtil.toJson(requestMap));

            Request request = new Request.Builder()
                    .url(url)
                    .post(requestBody)
                    .build();

            response = client.newCall(request).execute();

        } catch (IOException e) {
            CommonUtil.logError(TefasRestClient.class.getSimpleName(), "postRequest", e.getMessage(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

    public static Response postRequest(String url, Map requestMap, Long timeout, String token) {

        Response response;

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(timeout, TimeUnit.SECONDS);
        builder.writeTimeout(timeout, TimeUnit.SECONDS);
        builder.connectTimeout(timeout, TimeUnit.SECONDS);
        OkHttpClient client = builder.build();

        try {
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8")
                    , new ObjectMapper().writeValueAsBytes(requestMap));

            Request request = new Request.Builder()
                    .addHeader("Authorization", String.format("Bearer %s", token))
                    .url(url)
                    .post(requestBody)
                    .build();

            response = client.newCall(request).execute();
        } catch (IOException e) {

            CommonUtil.logError(TefasRestClient.class.getSimpleName(), "postRequest", e.getMessage(),ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

}
