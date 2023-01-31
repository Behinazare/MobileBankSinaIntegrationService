package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class IbanInfoRequest extends BaseRequest {

    private String iban;
    private BigDecimal amount;
    private String payId;

    public IbanInfoRequest() {
    }

    @Builder
    public IbanInfoRequest(String userId, String iban, BigDecimal amount, String payId) {
        super(userId);
        this.iban = iban;
        this.amount = amount;
        this.payId = payId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }
}
