package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;

public class DigitalCreditRollbackPaymentResponse extends BaseResponse {

    private boolean success;

    public DigitalCreditRollbackPaymentResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
