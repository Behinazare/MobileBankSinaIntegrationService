package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class RollBackPayResponse extends BaseResponse{

    private String message;

    private boolean status;


    public RollBackPayResponse() {
    }


    @Builder
    public RollBackPayResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String message, boolean status) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
