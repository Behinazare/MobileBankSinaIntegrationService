package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class DigitalCreditPaymentResponse extends BaseResponse {

    private String rrn;
    public String paymentId;

    public DigitalCreditPaymentResponse() {
    }

    @Builder
    public DigitalCreditPaymentResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String rrn, String paymentId) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.rrn = rrn;
        this.paymentId = paymentId;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
