package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class GetPaymentUrlDigitalPromissoryNoteResponse extends BaseResponse {

    private String paymentGateWayUrl;

    public GetPaymentUrlDigitalPromissoryNoteResponse() {
    }

    @Builder
    public GetPaymentUrlDigitalPromissoryNoteResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String paymentGateWayUrl) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.paymentGateWayUrl = paymentGateWayUrl;
    }

    public String getPaymentGateWayUrl() {
        return paymentGateWayUrl;
    }

    public void setPaymentGateWayUrl(String paymentGateWayUrl) {
        this.paymentGateWayUrl = paymentGateWayUrl;
    }
}
