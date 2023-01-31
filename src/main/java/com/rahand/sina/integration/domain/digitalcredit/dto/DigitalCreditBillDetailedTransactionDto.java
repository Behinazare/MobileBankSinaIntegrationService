package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditTransactionProcessingType;
import com.rahand.sina.integration.domain.digitalcredit.enums.PayProductType;
import com.rahand.sina.integration.domain.digitalcredit.enums.TransactionStatus;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DigitalCreditBillDetailedTransactionDto {
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private LocalDateTime startCycleDate;
    private String persianStartCycleDate;
    private BigDecimal amount;
    private BigDecimal fee;
    private String pan;
    private String orderId;

    private String trackNumber;
    private String terminalId;
    private String merchantId;
    private String description;
    private String merchantName;
    private PayProductType productType;

    private TransactionStatus transactionStatus;

    private DigitalCreditTransactionProcessingType digitalCreditTransactionProcessingType;


    public DigitalCreditBillDetailedTransactionDto() {
    }

    @Builder
    public DigitalCreditBillDetailedTransactionDto(LocalDateTime transactionDate, String persianTransactionDate, LocalDateTime startCycleDate, String persianStartCycleDate, BigDecimal amount, BigDecimal fee, String pan, String orderId, String trackNumber, String terminalId, String merchantId, String description, String merchantName, PayProductType productType, TransactionStatus transactionStatus, DigitalCreditTransactionProcessingType digitalCreditTransactionProcessingType) {
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.startCycleDate = startCycleDate;
        this.persianStartCycleDate = persianStartCycleDate;
        this.amount = amount;
        this.fee = fee;
        this.pan = pan;
        this.orderId = orderId;
        this.trackNumber = trackNumber;
        this.terminalId = terminalId;
        this.merchantId = merchantId;
        this.description = description;
        this.merchantName = merchantName;
        this.productType = productType;
        this.transactionStatus = transactionStatus;
        this.digitalCreditTransactionProcessingType = digitalCreditTransactionProcessingType;
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

    public LocalDateTime getStartCycleDate() {
        return startCycleDate;
    }

    public void setStartCycleDate(LocalDateTime startCycleDate) {
        this.startCycleDate = startCycleDate;
    }

    public String getPersianStartCycleDate() {
        return persianStartCycleDate;
    }

    public void setPersianStartCycleDate(String persianStartCycleDate) {
        this.persianStartCycleDate = persianStartCycleDate;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public DigitalCreditTransactionProcessingType getDigitalCreditTransactionProcessingType() {
        return digitalCreditTransactionProcessingType;
    }

    public void setDigitalCreditTransactionProcessingType(DigitalCreditTransactionProcessingType digitalCreditTransactionProcessingType) {
        this.digitalCreditTransactionProcessingType = digitalCreditTransactionProcessingType;
    }

    public PayProductType getProductType() {
        return productType;
    }

    public void setProductType(PayProductType productType) {
        this.productType = productType;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }
}
