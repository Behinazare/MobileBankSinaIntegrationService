package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.CardActivityType;
import com.rahand.sina.integration.domain.bank.enums.CardTransactionType;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GetCardTransactionRequest extends BaseRequest {

    private String pan;

    private String description;

    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private boolean showTotalRecord;
    private Long offset;
    private Long length;
    private List<CardTransactionType> cardTransactionTypes;
    private List<CardActivityType> cardActivityTypes;
    private BigDecimal fromAmount;
    private BigDecimal toAmount;
    private boolean showSystemReturnTransactions;
    private String issuerNumber;
    private String opponentIssuerNumber;
    private String opponentPan;
    private String referralNumber;

    public GetCardTransactionRequest() {
    }

    @Builder
    public GetCardTransactionRequest(String userId, String pan, String description, LocalDateTime fromDate, LocalDateTime toDate, boolean showTotalRecord, Long offset, Long length, List<CardTransactionType> cardTransactionTypes, List<CardActivityType> cardActivityTypes, BigDecimal fromAmount, BigDecimal toAmount, boolean showSystemReturnTransactions, String issuerNumber, String opponentIssuerNumber, String opponentPan, String referralNumber) {
        super(userId);
        this.pan = pan;
        this.description = description;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.showTotalRecord = showTotalRecord;
        this.offset = offset;
        this.length = length;
        this.cardTransactionTypes = cardTransactionTypes;
        this.cardActivityTypes = cardActivityTypes;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
        this.showSystemReturnTransactions = showSystemReturnTransactions;
        this.issuerNumber = issuerNumber;
        this.opponentIssuerNumber = opponentIssuerNumber;
        this.opponentPan = opponentPan;
        this.referralNumber = referralNumber;
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

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public boolean isShowTotalRecord() {
        return showTotalRecord;
    }

    public void setShowTotalRecord(boolean showTotalRecord) {
        this.showTotalRecord = showTotalRecord;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public List<CardTransactionType> getCardTransactionTypes() {
        return cardTransactionTypes;
    }

    public void setCardTransactionTypes(List<CardTransactionType> cardTransactionTypes) {
        this.cardTransactionTypes = cardTransactionTypes;
    }

    public List<CardActivityType> getCardActivityTypes() {
        return cardActivityTypes;
    }

    public void setCardActivityTypes(List<CardActivityType> cardActivityTypes) {
        this.cardActivityTypes = cardActivityTypes;
    }

    public BigDecimal getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(BigDecimal fromAmount) {
        this.fromAmount = fromAmount;
    }

    public BigDecimal getToAmount() {
        return toAmount;
    }

    public void setToAmount(BigDecimal toAmount) {
        this.toAmount = toAmount;
    }

    public boolean isShowSystemReturnTransactions() {
        return showSystemReturnTransactions;
    }

    public void setShowSystemReturnTransactions(boolean showSystemReturnTransactions) {
        this.showSystemReturnTransactions = showSystemReturnTransactions;
    }

    public String getIssuerNumber() {
        return issuerNumber;
    }

    public void setIssuerNumber(String issuerNumber) {
        this.issuerNumber = issuerNumber;
    }

    public String getOpponentIssuerNumber() {
        return opponentIssuerNumber;
    }

    public void setOpponentIssuerNumber(String opponentIssuerNumber) {
        this.opponentIssuerNumber = opponentIssuerNumber;
    }

    public String getOpponentPan() {
        return opponentPan;
    }

    public void setOpponentPan(String opponentPan) {
        this.opponentPan = opponentPan;
    }

    public String getReferralNumber() {
        return referralNumber;
    }

    public void setReferralNumber(String referralNumber) {
        this.referralNumber = referralNumber;
    }
}
