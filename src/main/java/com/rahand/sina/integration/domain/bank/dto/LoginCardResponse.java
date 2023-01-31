package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class LoginCardResponse extends BaseResponse {

    private boolean failedLogin;
    public String nationalCode;

    public LoginCardResponse() {
    }

    @Builder
    public LoginCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean failedLogin, String nationalCode) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.failedLogin = failedLogin;
        this.nationalCode = nationalCode;
    }


    public boolean isFailedLogin() {
        return failedLogin;
    }

    public void setFailedLogin(boolean failedLogin) {
        this.failedLogin = failedLogin;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
