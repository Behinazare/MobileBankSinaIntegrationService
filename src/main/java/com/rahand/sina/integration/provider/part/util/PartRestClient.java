package com.rahand.sina.integration.provider.part.util;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PartRestClient {

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
            CommonUtil.logError(PartRestClient.class.getSimpleName(), "postRequest", e.getMessage(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

    public static Response postRequest(String url, Headers headers, String json, Long timeout) {

        Response response;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(timeout, TimeUnit.SECONDS);
        builder.writeTimeout(timeout, TimeUnit.SECONDS);
        builder.connectTimeout(timeout, TimeUnit.SECONDS);
        OkHttpClient client = builder.build();

        try {
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8")
                    , json);

            Request request = new Request.Builder()
                    .url(url)
                    .headers(headers)
                    .post(requestBody)
                    .build();

            response = client.newCall(request).execute();

        } catch (IOException e) {
            CommonUtil.logError(PartRestClient.class.getSimpleName(), "postRequest", e.getMessage(), ServiceLogsDto.builder()
                    .input(json)
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

    public static Response multiPartPostRequest(String url, Headers headers, Map requestMap, Long timeout) {

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
            CommonUtil.logError(PartRestClient.class.getSimpleName(), "multiPartPostRequest", e.getMessage(), ServiceLogsDto.builder()
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
            CommonUtil.logError(PartRestClient.class.getSimpleName(), "getRequest", e.getMessage(), ServiceLogsDto.builder()
                    .input(url)
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE);
        }

        return response;
    }

    public static String responseBodyToString(Response response) {

        String responseString = "";

        try {
            responseString = response.body().string();
        } catch (IOException e) {
            CommonUtil.logError(PartRestClient.class.getSimpleName(), "responseBodyToString", e.getMessage());
        }

        return responseString;
    }
}
