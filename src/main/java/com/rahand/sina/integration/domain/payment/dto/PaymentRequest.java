package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.digitalcredit.dto.DigitalCreditPaymentExtraInfo;
import lombok.Builder;

import java.math.BigDecimal;

public class PaymentRequest extends BaseRequest {

    private String paymentDataJson;
    private String paymentServiceId;
    private BigDecimal amount;
    private String title;
    private String information;

    private DigitalCreditPaymentExtraInfo digitalCreditPaymentExtraInfo;


    public PaymentRequest() {
    }

    @Builder
    public PaymentRequest(String userId, String paymentDataJson, String paymentServiceId, BigDecimal amount, String title, String information, DigitalCreditPaymentExtraInfo digitalCreditPaymentExtraInfo) {
        super(userId);
        this.paymentDataJson = paymentDataJson;
        this.paymentServiceId = paymentServiceId;
        this.amount = amount;
        this.title = title;
        this.information = information;
        this.digitalCreditPaymentExtraInfo = digitalCreditPaymentExtraInfo;
    }

    public String getPaymentDataJson() {
        return paymentDataJson;
    }

    public void setPaymentDataJson(String paymentDataJson) {
        this.paymentDataJson = paymentDataJson;
    }

    public String getPaymentServiceId() {
        return paymentServiceId;
    }

    public void setPaymentServiceId(String paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public DigitalCreditPaymentExtraInfo getDigitalCreditPaymentExtraInfo() {
        return digitalCreditPaymentExtraInfo;
    }

    public void setDigitalCreditPaymentExtraInfo(DigitalCreditPaymentExtraInfo digitalCreditPaymentExtraInfo) {
        this.digitalCreditPaymentExtraInfo = digitalCreditPaymentExtraInfo;
    }
}
