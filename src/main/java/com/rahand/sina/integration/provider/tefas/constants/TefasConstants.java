package com.rahand.sina.integration.provider.tefas.constants;

import com.rahand.sina.integration.config.IntegrationLibConfig;

public class TefasConstants {

    public final static String USER_NAME = IntegrationLibConfig.getProperty("TEFAS_USER_NAME");
    public final static String PASSWORD = IntegrationLibConfig.getProperty("TEFAS_PASSWORD");
    public final static String BASE_URL = IntegrationLibConfig.getProperty("BASE_URL");


    // Error Message :

    public final static String TOKEN_EXPIRED = "Token Expired";
    public final static String INVALID_POSTAL_CODE = "کد پستی نامتعبر است";
    public final static String INVALID_INPUT = "اطلاعات وارد شده نامتعبر است";
    public final static String INVALID_SHAHKAR_IDENTIFICATION_TYPE = "اطلاعات وارد شده نامتعبر است(shahkarIdendtificationType)";
    public final static String SHAHKAR_ERROR_MESSAGE = "اطلاعات ارسالی با مرجع تطبیق در یکی یا بیشتر از فیلدها مشابهت ندارد";
}
