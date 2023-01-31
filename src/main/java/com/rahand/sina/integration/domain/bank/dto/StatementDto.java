package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class StatementDto extends BaseDto {

    private BigDecimal amount;
    private BigDecimal balance;
    private LocalDateTime transactionDate;
    private String persianDate;
    private String description;
    private String referenceNumber;
    private String serial;
    private String serialNumber;
    private String paymentId;
    private String statementId;
    private String registrationNumber;
    private String branchCode;
    private String agentBranchCode;
    private String branchName;
    private String agentBranchName;

    public StatementDto() {
    }

    @Builder
    public StatementDto(BigDecimal amount, BigDecimal balance, LocalDateTime transactionDate, String persianDate, String description, String referenceNumber, String serial, String serialNumber, String paymentId, String statementId, String registrationNumber, String branchCode, String agentBranchCode, String branchName, String agentBranchName) {
        this.amount = amount;
        this.balance = balance;
        this.transactionDate = transactionDate;
        this.persianDate = persianDate;
        this.description = description;
        this.referenceNumber = referenceNumber;
        this.serial = serial;
        this.serialNumber = serialNumber;
        this.paymentId = paymentId;
        this.statementId = statementId;
        this.registrationNumber = registrationNumber;
        this.branchCode = branchCode;
        this.agentBranchCode = agentBranchCode;
        this.branchName = branchName;
        this.agentBranchName = agentBranchName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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

    public String getPersianDate() {
        return persianDate;
    }

    public void setPersianDate(String persianDate) {
        this.persianDate = persianDate;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAgentBranchCode() {
        return agentBranchCode;
    }

    public void setAgentBranchCode(String agentBranchCode) {
        this.agentBranchCode = agentBranchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAgentBranchName() {
        return agentBranchName;
    }

    public void setAgentBranchName(String agentBranchName) {
        this.agentBranchName = agentBranchName;
    }
}
