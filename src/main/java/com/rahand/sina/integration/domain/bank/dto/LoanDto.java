package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.LoanStatus;
import com.rahand.sina.integration.domain.bank.enums.LoanType;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class LoanDto extends BaseDto {

    private String loanNumber;
    private String cbLoanNumber;
    private String branchCode;
    private String branchName;
    private BigDecimal amount;
    private BigDecimal loanRemainder;
    private BigDecimal preAmount;
    private Integer installmentCount;
    private LocalDateTime beginDate;

    private String persianBeginDate;
    private LocalDateTime endDate;

    private String persianEndDate;

    private LoanStatus loanStatus;
    private LoanType loanType;
    private Currency currency;

    public LoanDto() {
    }

    @Builder
    public LoanDto(String loanNumber, String cbLoanNumber, String branchCode, String branchName, BigDecimal amount, BigDecimal loanRemainder, BigDecimal preAmount, Integer installmentCount, LocalDateTime beginDate, String persianBeginDate, LocalDateTime endDate, String persianEndDate, LoanStatus loanStatus, LoanType loanType, Currency currency) {
        this.loanNumber = loanNumber;
        this.cbLoanNumber = cbLoanNumber;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.amount = amount;
        this.loanRemainder = loanRemainder;
        this.preAmount = preAmount;
        this.installmentCount = installmentCount;
        this.beginDate = beginDate;
        this.persianBeginDate = persianBeginDate;
        this.endDate = endDate;
        this.persianEndDate = persianEndDate;
        this.loanStatus = loanStatus;
        this.loanType = loanType;
        this.currency = currency;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getCbLoanNumber() {
        return cbLoanNumber;
    }

    public void setCbLoanNumber(String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getLoanRemainder() {
        return loanRemainder;
    }

    public void setLoanRemainder(BigDecimal loanRemainder) {
        this.loanRemainder = loanRemainder;
    }

    public BigDecimal getPreAmount() {
        return preAmount;
    }

    public void setPreAmount(BigDecimal preAmount) {
        this.preAmount = preAmount;
    }

    public Integer getInstallmentCount() {
        return installmentCount;
    }

    public void setInstallmentCount(Integer installmentCount) {
        this.installmentCount = installmentCount;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    public String getPersianBeginDate() {
        return persianBeginDate;
    }

    public void setPersianBeginDate(String persianBeginDate) {
        this.persianBeginDate = persianBeginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getPersianEndDate() {
        return persianEndDate;
    }

    public void setPersianEndDate(String persianEndDate) {
        this.persianEndDate = persianEndDate;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
