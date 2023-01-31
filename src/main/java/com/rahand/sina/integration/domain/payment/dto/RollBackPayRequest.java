package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.common.enums.PaymentMethod;
import lombok.Builder;


public class RollBackPayRequest extends BaseRequest {

    private String paymentDataJson;

    private PaymentMethod paymentMethod;
    private String trackerId;

    public RollBackPayRequest() {
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @Builder
    public RollBackPayRequest(String userId, String paymentDataJson, PaymentMethod paymentMethod, String trackerId) {
        super(userId);
        this.paymentDataJson = paymentDataJson;
        this.paymentMethod = paymentMethod;
        this.trackerId = trackerId;
    }

    public String getPaymentDataJson() {
        return paymentDataJson;
    }

    public void setPaymentDataJson(String paymentDataJson) {
        this.paymentDataJson = paymentDataJson;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }
}
