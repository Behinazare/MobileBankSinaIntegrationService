package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.bank.enums.CardActivityType;
import com.rahand.sina.integration.domain.bank.enums.CardTransactionType;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CardTransactionDto extends BaseDto {

    private BigDecimal amount;
    private String pan;
    private String description;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private LocalDateTime transactionSentDate;
    private String persianTransactionSentDate;
    private CardTransactionType cardTransactionType;
    private CardActivityType cardActivityType;
    private String issuerName;
    private String issuerNumber;
    private String opponentIssuerName;
    private String opponentIssuerNumber;
    private String opponentDepositNumber;
    private String opponentPan;
    private String referenceNumber;
    private String traceNumber;

    private boolean showSystemReturnTransactions;

    public CardTransactionDto() {
    }

    @Builder
    public CardTransactionDto(BigDecimal amount, String pan, String description, LocalDateTime transactionDate, String persianTransactionDate, LocalDateTime transactionSentDate, String persianTransactionSentDate, CardTransactionType cardTransactionType, CardActivityType cardActivityType, String issuerName, String issuerNumber, String opponentIssuerName, String opponentIssuerNumber, String opponentDepositNumber, String opponentPan, String referenceNumber, String traceNumber, boolean showSystemReturnTransactions) {
        this.amount = amount;
        this.pan = pan;
        this.description = description;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.transactionSentDate = transactionSentDate;
        this.persianTransactionSentDate = persianTransactionSentDate;
        this.cardTransactionType = cardTransactionType;
        this.cardActivityType = cardActivityType;
        this.issuerName = issuerName;
        this.issuerNumber = issuerNumber;
        this.opponentIssuerName = opponentIssuerName;
        this.opponentIssuerNumber = opponentIssuerNumber;
        this.opponentDepositNumber = opponentDepositNumber;
        this.opponentPan = opponentPan;
        this.referenceNumber = referenceNumber;
        this.traceNumber = traceNumber;
        this.showSystemReturnTransactions = showSystemReturnTransactions;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public LocalDateTime getTransactionSentDate() {
        return transactionSentDate;
    }

    public void setTransactionSentDate(LocalDateTime transactionSentDate) {
        this.transactionSentDate = transactionSentDate;
    }

    public String getPersianTransactionSentDate() {
        return persianTransactionSentDate;
    }

    public void setPersianTransactionSentDate(String persianTransactionSentDate) {
        this.persianTransactionSentDate = persianTransactionSentDate;
    }

    public CardTransactionType getCardTransactionType() {
        return cardTransactionType;
    }

    public void setCardTransactionType(CardTransactionType cardTransactionType) {
        this.cardTransactionType = cardTransactionType;
    }

    public CardActivityType getCardActivityType() {
        return cardActivityType;
    }

    public void setCardActivityType(CardActivityType cardActivityType) {
        this.cardActivityType = cardActivityType;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getIssuerNumber() {
        return issuerNumber;
    }

    public void setIssuerNumber(String issuerNumber) {
        this.issuerNumber = issuerNumber;
    }

    public String getOpponentIssuerName() {
        return opponentIssuerName;
    }

    public void setOpponentIssuerName(String opponentIssuerName) {
        this.opponentIssuerName = opponentIssuerName;
    }

    public String getOpponentIssuerNumber() {
        return opponentIssuerNumber;
    }

    public void setOpponentIssuerNumber(String opponentIssuerNumber) {
        this.opponentIssuerNumber = opponentIssuerNumber;
    }

    public String getOpponentDepositNumber() {
        return opponentDepositNumber;
    }

    public void setOpponentDepositNumber(String opponentDepositNumber) {
        this.opponentDepositNumber = opponentDepositNumber;
    }

    public String getOpponentPan() {
        return opponentPan;
    }

    public void setOpponentPan(String opponentPan) {
        this.opponentPan = opponentPan;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }

    public boolean isShowSystemReturnTransactions() {
        return showSystemReturnTransactions;
    }

    public void setShowSystemReturnTransactions(boolean showSystemReturnTransactions) {
        this.showSystemReturnTransactions = showSystemReturnTransactions;
    }
}
