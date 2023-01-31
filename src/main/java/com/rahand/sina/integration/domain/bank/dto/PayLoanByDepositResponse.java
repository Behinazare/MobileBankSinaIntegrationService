package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.LoanState;
import lombok.Builder;

import java.math.BigDecimal;

public class PayLoanByDepositResponse extends BaseResponse {

    private BigDecimal appliedAmount;
    private String documentNumber;
    private String documentTitle;
    private Currency currency;
    private LoanState loanState;

    private String trackerId;

    public PayLoanByDepositResponse() {
    }

    @Builder
    public PayLoanByDepositResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal appliedAmount, String documentNumber, String documentTitle, Currency currency, LoanState loanState, String trackerId) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.appliedAmount = appliedAmount;
        this.documentNumber = documentNumber;
        this.documentTitle = documentTitle;
        this.currency = currency;
        this.loanState = loanState;
        this.trackerId = trackerId;
    }

    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LoanState getLoanState() {
        return loanState;
    }

    public void setLoanState(LoanState loanState) {
        this.loanState = loanState;
    }

    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }
}
