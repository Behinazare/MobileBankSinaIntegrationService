package com.rahand.sina.integration.provider.apsan.sevice;

import com.rahand.sina.integration.config.IntegrationLibConfig;
import sun.misc.BASE64Encoder;

import java.nio.charset.StandardCharsets;

public class ApsanLoginService {

    private final static String USERNAME = IntegrationLibConfig.getProperty("APSAN_USERNAME");
    private final static String PASSWORD = IntegrationLibConfig.getProperty("APSAN_PASSWORD");
    private final static String API_KEY = IntegrationLibConfig.getProperty("APSAN_API_KEY");


    public static String getCpgBasicAuthorization() {

        String authParams = String.format("%s:%s", USERNAME, PASSWORD);
        byte[] bytes = authParams.getBytes(StandardCharsets.UTF_8);
        String encodedAuthParams = new BASE64Encoder().encode(bytes);
        String basicAuth = "Basic " + encodedAuthParams;
        return basicAuth;

    }

    public static String getTallyAuthorization() {
        return String.format("ApiKey %s", API_KEY);
    }


}
