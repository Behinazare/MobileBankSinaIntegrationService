package com.rahand.sina.integration.provider.tefas.service;

import com.rahand.common.constant.CommonConstants;
import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.provider.tefas.constants.TefasConstants;
import com.rahand.sina.integration.provider.tefas.dto.TefasBaseResponse;
import com.rahand.sina.integration.provider.tefas.dto.TokenResponse;
import com.rahand.sina.integration.provider.tefas.util.TefasRestClient;
import com.rahand.sina.integration.provider.tefas.util.TefasUtil;
import okhttp3.Response;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TefasAuthenticationService {

    public static boolean TOKEN_INVALID = true;
    private static TokenResponse tokenResponse;
    private final Lock lock = new ReentrantLock();

    private TefasAuthenticationService() {

    }

    private static class SingletonHolder {
        private final static TefasAuthenticationService INSTANCE = new TefasAuthenticationService();
    }

    public static TefasAuthenticationService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public TokenResponse authenticationToken() {

        tokenResponse = new TokenResponse();
        LinkedHashMap<String, String> requestMap = new LinkedHashMap<>();
        requestMap.put("userName", TefasConstants.USER_NAME);
        requestMap.put("password", TefasConstants.PASSWORD);
        String url = TefasConstants.BASE_URL + "api/user/authenticate";

        Response response = TefasRestClient.postRequest(url, requestMap, 30l);
        TefasBaseResponse<TokenResponse> tefasBaseResponse;

        if (response.code() == 200) {

            tefasBaseResponse = TefasUtil.mapToBaseResponse(response, TokenResponse.class);
            response.close();
            if (tefasBaseResponse.isError()) {
                CommonUtil.logError(getClass().getSimpleName(), "getAuthenticationToken",
                        String.format(CommonConstants.API_ERROR_LOG_FORMAT, tefasBaseResponse.getMessageCode(), tefasBaseResponse.getPersianContent()), ServiceLogsDto.builder()
                                .input(CommonUtil.toJson(requestMap))
                                .output(CommonUtil.toJson(tefasBaseResponse))
                                .build());
                tokenResponse.setError(true);
                tokenResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
            } else {
                tokenResponse = tefasBaseResponse.getResponseModel();
                TefasAuthenticationService.TOKEN_INVALID = false;
            }

        } else {
            String errorResponse = TefasUtil.responseBodyToString(response);
            tokenResponse.setError(true);
            tokenResponse.setErrorMessage(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
            CommonUtil.logError(getClass().getSimpleName(), "getAuthenticationToken", errorResponse, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponse)
                    .build());
        }

        response.close();

        return tokenResponse;
    }

    public TokenResponse getAuthenticationToken() {

        if (TefasAuthenticationService.TOKEN_INVALID) {
            if (lock.tryLock()) {
                try {
                    authenticationToken();
                } finally {
                    lock.unlock();
                }
            }
        }

        return tokenResponse;
    }
}
