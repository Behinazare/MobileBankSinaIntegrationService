package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;

public class PaymentStatusDigitalPromissoryNoteRequest extends BaseRequest {

    private String paymentId;
    private String requestId;

    public String nationalCode;

    public PaymentStatusDigitalPromissoryNoteRequest() {
    }

    public PaymentStatusDigitalPromissoryNoteRequest(String userId, String paymentId, String requestId, String nationalCode) {
        super(userId);
        this.paymentId = paymentId;
        this.requestId = requestId;
        this.nationalCode = nationalCode;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
