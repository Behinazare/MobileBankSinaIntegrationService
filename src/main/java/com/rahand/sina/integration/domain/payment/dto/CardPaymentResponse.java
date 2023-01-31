package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CardPaymentResponse extends BaseResponse {

    private BigDecimal amount;
    private String rrn;
    private String trackNumber;
    private String trackerId;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private Long epochTime;
    private String defaultReceipt;

    public CardPaymentResponse() {
    }

    @Builder
    public CardPaymentResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal amount, String rrn, String trackNumber, String trackerId, LocalDateTime transactionDate, String persianTransactionDate, Long epochTime, String defaultReceipt) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.amount = amount;
        this.rrn = rrn;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.epochTime = epochTime;
        this.defaultReceipt = defaultReceipt;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
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

    public Long getEpochTime() {
        return epochTime;
    }

    public void setEpochTime(Long epochTime) {
        this.epochTime = epochTime;
    }

    public String getDefaultReceipt() {
        return defaultReceipt;
    }

    public void setDefaultReceipt(String defaultReceipt) {
        this.defaultReceipt = defaultReceipt;
    }
}
