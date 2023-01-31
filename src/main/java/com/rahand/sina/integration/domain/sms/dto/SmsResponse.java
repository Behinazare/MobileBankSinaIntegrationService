package com.rahand.sina.integration.domain.sms.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SmsResponse extends BaseResponse {

    @JsonProperty("responseMessage")
    private String responseMessage;
    private boolean isSend;
    private String errorMessage;

    public SmsResponse() {
    }

    @Builder
    public SmsResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String responseMessage, boolean isSend, String errorMessage1) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.responseMessage = responseMessage;
        this.isSend = isSend;
        this.errorMessage = errorMessage1;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
