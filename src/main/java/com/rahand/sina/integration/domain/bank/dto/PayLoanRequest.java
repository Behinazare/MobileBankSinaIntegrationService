package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.common.enums.PaymentMethod;
import lombok.Builder;

import java.math.BigDecimal;

public class PayLoanRequest extends BaseRequest {

    private PaymentMethod paymentMethod;
    private String inputPaymentJson;
    private String loanNumber;

    private BigDecimal amount;

    private PayLoanByDepositRequest payLoanByDepositRequest;
    private PayLoanByCardRequest payLoanByCardRequest;

    private String title;
    private String information;

    public PayLoanRequest() {
    }

    @Builder
    public PayLoanRequest(String userId, PaymentMethod paymentMethod, String inputPaymentJson, String loanNumber, BigDecimal amount, PayLoanByDepositRequest payLoanByDepositRequest, PayLoanByCardRequest payLoanByCardRequest, String title, String information) {
        super(userId);
        this.paymentMethod = paymentMethod;
        this.inputPaymentJson = inputPaymentJson;
        this.loanNumber = loanNumber;
        this.amount = amount;
        this.payLoanByDepositRequest = payLoanByDepositRequest;
        this.payLoanByCardRequest = payLoanByCardRequest;
        this.title = title;
        this.information = information;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getInputPaymentJson() {
        return inputPaymentJson;
    }

    public void setInputPaymentJson(String inputPaymentJson) {
        this.inputPaymentJson = inputPaymentJson;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PayLoanByDepositRequest getPayLoanByDepositRequest() {
        return payLoanByDepositRequest;
    }

    public void setPayLoanByDepositRequest(PayLoanByDepositRequest payLoanByDepositRequest) {
        this.payLoanByDepositRequest = payLoanByDepositRequest;
    }

    public PayLoanByCardRequest getPayLoanByCardRequest() {
        return payLoanByCardRequest;
    }

    public void setPayLoanByCardRequest(PayLoanByCardRequest payLoanByCardRequest) {
        this.payLoanByCardRequest = payLoanByCardRequest;
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
}
