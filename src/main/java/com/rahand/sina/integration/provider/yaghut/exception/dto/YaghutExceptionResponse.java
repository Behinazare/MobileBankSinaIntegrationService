package com.rahand.sina.integration.provider.yaghut.exception.dto;


import lombok.Builder;

@Builder
public class YaghutExceptionResponse {

    private boolean error;
    private String errorMessage;
    private String extraErrorData;

    public YaghutExceptionResponse() {
    }

    public YaghutExceptionResponse(boolean error, String errorMessage, String extraErrorData) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.extraErrorData = extraErrorData;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getExtraErrorData() {
        return extraErrorData;
    }

    public void setExtraErrorData(String extraErrorData) {
        this.extraErrorData = extraErrorData;
    }
}
