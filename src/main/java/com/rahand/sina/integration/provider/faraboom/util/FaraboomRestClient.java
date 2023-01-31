package com.rahand.sina.integration.provider.faraboom.util;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.provider.faraboom.constants.FaraboomConstant;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FaraboomRestClient {

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
                    .addHeader("Accept-Language", "fa")
                    .addHeader("App-Key", FaraboomConstant.APP_KEY)
                    .addHeader("Device-Id", FaraboomConstant.DEVICE_ID)
                    .addHeader("Token-Id", FaraboomConstant.BOOM_TOKEN_ID)
                    .addHeader("CLIENT-DEVICE-ID", "127.0.0.1")
                    .addHeader("CLIENT-IP-ADDRESS", "127.0.0.1")
                    .addHeader("CLIENT-USER-AGENT", "User Agent")
                    .addHeader("CLIENT-USER-ID", "09120000000")
                    .addHeader("CLIENT-PLATFORM-TYPE", "WEB")
                    .post(requestBody)
                    .build();

            response = client.newCall(request).execute();

        } catch (IOException e) {
            CommonUtil.logError(FaraboomRestClient.class.getSimpleName(), "postRequest", e.getMessage(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

    public static Response postRequest(String url, Headers headers, Map requestMap, Long timeout) {

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
                    .headers(headers)
                    .post(requestBody)
                    .build();

            response = client.newCall(request).execute();

        } catch (IOException e) {
            CommonUtil.logError(FaraboomRestClient.class.getSimpleName(), "postRequest", e.getMessage(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

    public static Response getRequest(String url, Headers headers, Long timeout) {

        Response response;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(timeout, TimeUnit.SECONDS);
        builder.writeTimeout(timeout, TimeUnit.SECONDS);
        builder.connectTimeout(timeout, TimeUnit.SECONDS);
        OkHttpClient client = builder.build();

        try {

            Request request = new Request.Builder()
                    .url(url)
                    .headers(headers)
                    .get()
                    .build();

            response = client.newCall(request).execute();

        } catch (IOException e) {
            CommonUtil.logError(FaraboomRestClient.class.getSimpleName(), "getRequest", e.getMessage(), ServiceLogsDto.builder()
                    .input(url)
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

}
