package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;

public class CardPaymentRequest extends BaseRequest {

    private BigDecimal amount;
    private String pan;
    private String cvv2;
    private String expireDate;
    private String pin;
    private String paymentServiceId;


    public CardPaymentRequest() {
    }

    @Builder
    public CardPaymentRequest(String userId, BigDecimal amount, String pan, String cvv2, String expireDate, String pin, String paymentServiceId) {
        super(userId);
        this.amount = amount;
        this.pan = pan;
        this.cvv2 = cvv2;
        this.expireDate = expireDate;
        this.pin = pin;
        this.paymentServiceId = paymentServiceId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPaymentServiceId() {
        return paymentServiceId;
    }

    public void setPaymentServiceId(String paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }
}
