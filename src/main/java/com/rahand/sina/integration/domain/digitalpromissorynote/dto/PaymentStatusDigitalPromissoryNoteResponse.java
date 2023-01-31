package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class PaymentStatusDigitalPromissoryNoteResponse extends BaseResponse {

    private boolean successful;

    public PaymentStatusDigitalPromissoryNoteResponse() {
    }

    @Builder
    public PaymentStatusDigitalPromissoryNoteResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean successful) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.successful = successful;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
