package com.rahand.sina.integration.domain.bank.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class CardStatement {

    private BigDecimal amount;
    private BigDecimal balanceAfterTransaction;
    private String description;
    private String referenceId;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;

    public CardStatement() {
    }

    @Builder
    public CardStatement(BigDecimal amount, BigDecimal balanceAfterTransaction, String description, String referenceId, LocalDateTime transactionDate, String persianTransactionDate) {
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.description = description;
        this.referenceId = referenceId;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }

    public void setBalanceAfterTransaction(BigDecimal balanceAfterTransaction) {
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getPersianTransactionDate() {
        return persianTransactionDate;
    }

    public void setPersianTransactionDate(String persianTransactionDate) {
        this.persianTransactionDate = persianTransactionDate;
    }
}
