package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.bank.enums.*;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class InquirySayadChequeTransferResponse extends BaseResponse {

    private String serialNumber;
    private String sayadId;
    private String reasonCode;
    private String sourceIban;
    private String bankCode;
    private String branchCode;
    private String description;
    private Currency currency;
    private LocalDateTime dueDate;
    private String persianDueDate;
    private BigDecimal amount;
    private List<SayadChequeTransferHolderDto> holders;
    private SayadChequeType sayadChequeType;
    private SayadChequeStatus sayadChequeStatus;
    private SayadChequeGuaranteeStatus sayadChequeGuaranteeStatus;
    private SayadChequeBlockStatus sayadChequeBlockStatus;
    private SayadChequeLockStatus sayadChequeLockStatus;
    private SayadChequeMedia sayadChequeMedia;

    private SayadChequeAllowedTransferAction sayadChequeAllowedTransferAction;

    public InquirySayadChequeTransferResponse() {
    }

    @Builder
    public InquirySayadChequeTransferResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String serialNumber, String sayadId, String reasonCode, String sourceIban, String bankCode, String branchCode, String description, Currency currency, LocalDateTime dueDate, String persianDueDate, BigDecimal amount, List<SayadChequeTransferHolderDto> holders, SayadChequeType sayadChequeType, SayadChequeStatus sayadChequeStatus, SayadChequeGuaranteeStatus sayadChequeGuaranteeStatus, SayadChequeBlockStatus sayadChequeBlockStatus, SayadChequeLockStatus sayadChequeLockStatus, SayadChequeMedia sayadChequeMedia, SayadChequeAllowedTransferAction sayadChequeAllowedTransferAction) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.serialNumber = serialNumber;
        this.sayadId = sayadId;
        this.reasonCode = reasonCode;
        this.sourceIban = sourceIban;
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.description = description;
        this.currency = currency;
        this.dueDate = dueDate;
        this.persianDueDate = persianDueDate;
        this.amount = amount;
        this.holders = holders;
        this.sayadChequeType = sayadChequeType;
        this.sayadChequeStatus = sayadChequeStatus;
        this.sayadChequeGuaranteeStatus = sayadChequeGuaranteeStatus;
        this.sayadChequeBlockStatus = sayadChequeBlockStatus;
        this.sayadChequeLockStatus = sayadChequeLockStatus;
        this.sayadChequeMedia = sayadChequeMedia;
        this.sayadChequeAllowedTransferAction = sayadChequeAllowedTransferAction;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSayadId() {
        return sayadId;
    }

    public void setSayadId(String sayadId) {
        this.sayadId = sayadId;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getSourceIban() {
        return sourceIban;
    }

    public void setSourceIban(String sourceIban) {
        this.sourceIban = sourceIban;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getPersianDueDate() {
        return persianDueDate;
    }

    public void setPersianDueDate(String persianDueDate) {
        this.persianDueDate = persianDueDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<SayadChequeTransferHolderDto> getHolders() {
        return holders;
    }

    public void setHolders(List<SayadChequeTransferHolderDto> holders) {
        this.holders = holders;
    }

    public SayadChequeType getSayadChequeType() {
        return sayadChequeType;
    }

    public void setSayadChequeType(SayadChequeType sayadChequeType) {
        this.sayadChequeType = sayadChequeType;
    }

    public SayadChequeStatus getSayadChequeStatus() {
        return sayadChequeStatus;
    }

    public void setSayadChequeStatus(SayadChequeStatus sayadChequeStatus) {
        this.sayadChequeStatus = sayadChequeStatus;
    }

    public SayadChequeGuaranteeStatus getSayadChequeGuaranteeStatus() {
        return sayadChequeGuaranteeStatus;
    }

    public void setSayadChequeGuaranteeStatus(SayadChequeGuaranteeStatus sayadChequeGuaranteeStatus) {
        this.sayadChequeGuaranteeStatus = sayadChequeGuaranteeStatus;
    }

    public SayadChequeBlockStatus getSayadChequeBlockStatus() {
        return sayadChequeBlockStatus;
    }

    public void setSayadChequeBlockStatus(SayadChequeBlockStatus sayadChequeBlockStatus) {
        this.sayadChequeBlockStatus = sayadChequeBlockStatus;
    }

    public SayadChequeLockStatus getSayadChequeLockStatus() {
        return sayadChequeLockStatus;
    }

    public void setSayadChequeLockStatus(SayadChequeLockStatus sayadChequeLockStatus) {
        this.sayadChequeLockStatus = sayadChequeLockStatus;
    }

    public SayadChequeMedia getSayadChequeMedia() {
        return sayadChequeMedia;
    }

    public void setSayadChequeMedia(SayadChequeMedia sayadChequeMedia) {
        this.sayadChequeMedia = sayadChequeMedia;
    }

    public SayadChequeAllowedTransferAction getSayadChequeAllowedTransferAction() {
        return sayadChequeAllowedTransferAction;
    }

    public void setSayadChequeAllowedTransferAction(SayadChequeAllowedTransferAction sayadChequeAllowedTransferAction) {
        this.sayadChequeAllowedTransferAction = sayadChequeAllowedTransferAction;
    }
}
