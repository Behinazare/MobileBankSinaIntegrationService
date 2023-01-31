package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.digitalcredit.enums.Currency;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditDossierCycleStatus;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditDossierInvoiceClearingStatus;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditDossierInvoiceFeeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class DigitalCreditBillDto extends BaseDto {

    private String billId;
    private BigDecimal amount;
    private BigDecimal withDrawableAmount;
    private BigDecimal preDebitAmount;
    private BigDecimal payedAmount;
    private List<Fee> fees;
    private Currency currency;
    private LocalDateTime respiteDate;
    private String persianRespiteDate;
    private LocalDateTime startCycleDate;
    private String persianStartCycleDate;
    private LocalDateTime endCycleDate;
    private String persianEndCycleDate;
    private DigitalCreditDossierInvoiceClearingStatus clearingStatus;
    private DigitalCreditDossierCycleStatus cycleStatus;
    public DigitalCreditBillDto() {
    }

    @Builder
    public DigitalCreditBillDto(String billId, BigDecimal amount, BigDecimal withDrawableAmount, BigDecimal preDebitAmount, BigDecimal payedAmount, List<Fee> fees, Currency currency, LocalDateTime respiteDate, String persianRespiteDate, LocalDateTime startCycleDate, String persianStartCycleDate, LocalDateTime endCycleDate, String persianEndCycleDate, DigitalCreditDossierInvoiceClearingStatus clearingStatus, DigitalCreditDossierCycleStatus cycleStatus) {
        this.billId = billId;
        this.amount = amount;
        this.withDrawableAmount = withDrawableAmount;
        this.preDebitAmount = preDebitAmount;
        this.payedAmount = payedAmount;
        this.fees = fees;
        this.currency = currency;
        this.respiteDate = respiteDate;
        this.persianRespiteDate = persianRespiteDate;
        this.startCycleDate = startCycleDate;
        this.persianStartCycleDate = persianStartCycleDate;
        this.endCycleDate = endCycleDate;
        this.persianEndCycleDate = persianEndCycleDate;
        this.clearingStatus = clearingStatus;
        this.cycleStatus = cycleStatus;
    }


    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getWithDrawableAmount() {
        return withDrawableAmount;
    }

    public void setWithDrawableAmount(BigDecimal withDrawableAmount) {
        this.withDrawableAmount = withDrawableAmount;
    }

    public BigDecimal getPreDebitAmount() {
        return preDebitAmount;
    }

    public void setPreDebitAmount(BigDecimal preDebitAmount) {
        this.preDebitAmount = preDebitAmount;
    }

    public BigDecimal getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDateTime getRespiteDate() {
        return respiteDate;
    }

    public void setRespiteDate(LocalDateTime respiteDate) {
        this.respiteDate = respiteDate;
    }

    public String getPersianRespiteDate() {
        return persianRespiteDate;
    }

    public void setPersianRespiteDate(String persianRespiteDate) {
        this.persianRespiteDate = persianRespiteDate;
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

    public LocalDateTime getEndCycleDate() {
        return endCycleDate;
    }

    public void setEndCycleDate(LocalDateTime endCycleDate) {
        this.endCycleDate = endCycleDate;
    }

    public String getPersianEndCycleDate() {
        return persianEndCycleDate;
    }

    public void setPersianEndCycleDate(String persianEndCycleDate) {
        this.persianEndCycleDate = persianEndCycleDate;
    }

    public DigitalCreditDossierInvoiceClearingStatus getClearingStatus() {
        return clearingStatus;
    }

    public void setClearingStatus(DigitalCreditDossierInvoiceClearingStatus clearingStatus) {
        this.clearingStatus = clearingStatus;
    }

    public DigitalCreditDossierCycleStatus getCycleStatus() {
        return cycleStatus;
    }

    public void setCycleStatus(DigitalCreditDossierCycleStatus cycleStatus) {
        this.cycleStatus = cycleStatus;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Fee {

        private BigDecimal amount;
        private boolean credit;
        private DigitalCreditDossierInvoiceFeeType feeType;

    }
}
