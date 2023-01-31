package com.rahand.sina.integration.domain.echarge.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.sina.integration.domain.echarge.enums.EchargeOperator;
import com.rahand.sina.integration.domain.payment.dto.CardPaymentRequest;
import com.rahand.sina.integration.domain.payment.dto.DepositPaymentRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class BuyChargeRequest extends BaseRequest {

    private PaymentMethod paymentMethod;
    private String mobileNumber;
    private BigDecimal amount;
    private CardPaymentRequest cardPaymentRequest;
    private DepositPaymentRequest depositPaymentRequest;
    private String payerMobileNumber;
    private String title;
    private String information;
    private EchargeOperator echargeOperator;

    public BuyChargeRequest() {
    }

    @Builder
    public BuyChargeRequest(String userId, PaymentMethod paymentMethod, String mobileNumber, BigDecimal amount, CardPaymentRequest cardPaymentRequest, DepositPaymentRequest depositPaymentRequest, String payerMobileNumber, String title, String information, EchargeOperator echargeOperator) {
        super(userId);
        this.paymentMethod = paymentMethod;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.cardPaymentRequest = cardPaymentRequest;
        this.depositPaymentRequest = depositPaymentRequest;
        this.payerMobileNumber = payerMobileNumber;
        this.title = title;
        this.information = information;
        this.echargeOperator = echargeOperator;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CardPaymentRequest getCardPaymentRequest() {
        return cardPaymentRequest;
    }

    public void setCardPaymentRequest(CardPaymentRequest cardPaymentRequest) {
        this.cardPaymentRequest = cardPaymentRequest;
    }

    public DepositPaymentRequest getDepositPaymentRequest() {
        return depositPaymentRequest;
    }

    public void setDepositPaymentRequest(DepositPaymentRequest depositPaymentRequest) {
        this.depositPaymentRequest = depositPaymentRequest;
    }

    public String getPayerMobileNumber() {
        return payerMobileNumber;
    }

    public void setPayerMobileNumber(String payerMobileNumber) {
        this.payerMobileNumber = payerMobileNumber;
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

    public EchargeOperator getEchargeOperator() {
        return echargeOperator;
    }

    public void setEchargeOperator(EchargeOperator echargeOperator) {
        this.echargeOperator = echargeOperator;
    }
}
