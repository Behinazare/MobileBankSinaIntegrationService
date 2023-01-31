package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class DepositPaymentRequest extends BaseRequest {

    private BigDecimal amount;
    private String depositNumber;
    private String cif;
    private String paymentServiceId;

    public DepositPaymentRequest() {
    }

    @Builder
    public DepositPaymentRequest(String userId, BigDecimal amount, String depositNumber, String cif, String paymentServiceId) {
        super(userId);
        this.amount = amount;
        this.depositNumber = depositNumber;
        this.cif = cif;
        this.paymentServiceId = paymentServiceId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getPaymentServiceId() {
        return paymentServiceId;
    }

    public void setPaymentServiceId(String paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }
}
