package com.rahand.sina.integration.provider.armaghan.util;

import com.rahand.common.constant.CommonErrorMessage;

public class ArmaghanUtil {

    public static String getClientMessage(int errorCode) {

        String errorMessage = "";

        if (errorCode == -137) {
            errorMessage = CommonErrorMessage.INVALID_MOBILE_NUMBER;
        } else if (errorCode == -111) {
            errorMessage = "شماره همراه گیرنده پیام در لیست سیاه قرار دارد.";
        } else {
            errorMessage = CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE;
        }

        return errorMessage;

    }
}
