package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class DigitalCreditConfirmPaymentResponse extends BaseResponse {

    private boolean success;

    public DigitalCreditConfirmPaymentResponse() {
    }

    @Builder
    public DigitalCreditConfirmPaymentResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean success) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
