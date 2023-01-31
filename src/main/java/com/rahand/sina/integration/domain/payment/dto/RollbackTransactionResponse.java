package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class RollbackTransactionResponse extends BaseResponse {

    private boolean status;

    public RollbackTransactionResponse() {
    }

    @Builder
    public RollbackTransactionResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean status) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
