package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.bank.enums.*;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class DepositDto extends BaseDto {

    private String depositNumber;
    private String depositTitle;
    private String iban;
    private BigDecimal balance;
    private BigDecimal availableBalance;
    private BigDecimal blockedBalance;
    private BigDecimal extraAvailableBalance;
    private BigDecimal maximumBalance;
    private BigDecimal minimumBalance;
    private BigDecimal minAmountForInterestInclusion;
    private Currency currency;
    private DepositType depositType;
    private DepositOwnerType depositOwnerType;
    private DepositStatus depositStatus;
    private DepositPersonalityType personalityType;
    private SignatureStatus signatureStatus;
    private DepositWithdrawalOption depositWithdrawalOption;
    private String branchCode;
    private LocalDateTime inaugurationDate;
    private LocalDateTime expireDate;
    private String persianInaugurationDate;
    private String persianExpireDate;
    private String supportDepositNumber;
    private DepositStatus supportDepositStatus;
    private DepositSupportStatus supportStatus;
    private Currency supportCurrency;
    private String creditDeposit;
    private BigDecimal creditRemainAmount;
    private BigDecimal creditLoanRemainAmount;
    private Double creditRateAmount;

    public DepositDto() {
    }

    @Builder
    public DepositDto(String depositNumber, String depositTitle, String iban, BigDecimal balance, BigDecimal availableBalance, BigDecimal blockedBalance, BigDecimal extraAvailableBalance, BigDecimal maximumBalance, BigDecimal minimumBalance, BigDecimal minAmountForInterestInclusion, Currency currency, DepositType depositType, DepositOwnerType depositOwnerType, DepositStatus depositStatus, DepositPersonalityType personalityType, SignatureStatus signatureStatus, DepositWithdrawalOption depositWithdrawalOption, String branchCode, LocalDateTime inaugurationDate, LocalDateTime expireDate, String persianInaugurationDate, String persianExpireDate, String supportDepositNumber, DepositStatus supportDepositStatus, DepositSupportStatus supportStatus, Currency supportCurrency, String creditDeposit, BigDecimal creditRemainAmount, BigDecimal creditLoanRemainAmount, Double creditRateAmount) {
        this.depositNumber = depositNumber;
        this.depositTitle = depositTitle;
        this.iban = iban;
        this.balance = balance;
        this.availableBalance = availableBalance;
        this.blockedBalance = blockedBalance;
        this.extraAvailableBalance = extraAvailableBalance;
        this.maximumBalance = maximumBalance;
        this.minimumBalance = minimumBalance;
        this.minAmountForInterestInclusion = minAmountForInterestInclusion;
        this.currency = currency;
        this.depositType = depositType;
        this.depositOwnerType = depositOwnerType;
        this.depositStatus = depositStatus;
        this.personalityType = personalityType;
        this.signatureStatus = signatureStatus;
        this.depositWithdrawalOption = depositWithdrawalOption;
        this.branchCode = branchCode;
        this.inaugurationDate = inaugurationDate;
        this.expireDate = expireDate;
        this.persianInaugurationDate = persianInaugurationDate;
        this.persianExpireDate = persianExpireDate;
        this.supportDepositNumber = supportDepositNumber;
        this.supportDepositStatus = supportDepositStatus;
        this.supportStatus = supportStatus;
        this.supportCurrency = supportCurrency;
        this.creditDeposit = creditDeposit;
        this.creditRemainAmount = creditRemainAmount;
        this.creditLoanRemainAmount = creditLoanRemainAmount;
        this.creditRateAmount = creditRateAmount;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getDepositTitle() {
        return depositTitle;
    }

    public void setDepositTitle(String depositTitle) {
        this.depositTitle = depositTitle;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getBlockedBalance() {
        return blockedBalance;
    }

    public void setBlockedBalance(BigDecimal blockedBalance) {
        this.blockedBalance = blockedBalance;
    }

    public BigDecimal getExtraAvailableBalance() {
        return extraAvailableBalance;
    }

    public void setExtraAvailableBalance(BigDecimal extraAvailableBalance) {
        this.extraAvailableBalance = extraAvailableBalance;
    }

    public BigDecimal getMaximumBalance() {
        return maximumBalance;
    }

    public void setMaximumBalance(BigDecimal maximumBalance) {
        this.maximumBalance = maximumBalance;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public BigDecimal getMinAmountForInterestInclusion() {
        return minAmountForInterestInclusion;
    }

    public void setMinAmountForInterestInclusion(BigDecimal minAmountForInterestInclusion) {
        this.minAmountForInterestInclusion = minAmountForInterestInclusion;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public DepositType getDepositType() {
        return depositType;
    }

    public void setDepositType(DepositType depositType) {
        this.depositType = depositType;
    }

    public DepositOwnerType getDepositOwnerType() {
        return depositOwnerType;
    }

    public void setDepositOwnerType(DepositOwnerType depositOwnerType) {
        this.depositOwnerType = depositOwnerType;
    }

    public DepositStatus getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(DepositStatus depositStatus) {
        this.depositStatus = depositStatus;
    }

    public DepositPersonalityType getPersonalityType() {
        return personalityType;
    }

    public void setPersonalityType(DepositPersonalityType personalityType) {
        this.personalityType = personalityType;
    }

    public SignatureStatus getSignatureStatus() {
        return signatureStatus;
    }

    public void setSignatureStatus(SignatureStatus signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    public DepositWithdrawalOption getDepositWithdrawalOption() {
        return depositWithdrawalOption;
    }

    public void setDepositWithdrawalOption(DepositWithdrawalOption depositWithdrawalOption) {
        this.depositWithdrawalOption = depositWithdrawalOption;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public LocalDateTime getInaugurationDate() {
        return inaugurationDate;
    }

    public void setInaugurationDate(LocalDateTime inaugurationDate) {
        this.inaugurationDate = inaugurationDate;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public String getPersianInaugurationDate() {
        return persianInaugurationDate;
    }

    public void setPersianInaugurationDate(String persianInaugurationDate) {
        this.persianInaugurationDate = persianInaugurationDate;
    }

    public String getPersianExpireDate() {
        return persianExpireDate;
    }

    public void setPersianExpireDate(String persianExpireDate) {
        this.persianExpireDate = persianExpireDate;
    }

    public String getSupportDepositNumber() {
        return supportDepositNumber;
    }

    public void setSupportDepositNumber(String supportDepositNumber) {
        this.supportDepositNumber = supportDepositNumber;
    }

    public DepositStatus getSupportDepositStatus() {
        return supportDepositStatus;
    }

    public void setSupportDepositStatus(DepositStatus supportDepositStatus) {
        this.supportDepositStatus = supportDepositStatus;
    }

    public DepositSupportStatus getSupportStatus() {
        return supportStatus;
    }

    public void setSupportStatus(DepositSupportStatus supportStatus) {
        this.supportStatus = supportStatus;
    }

    public Currency getSupportCurrency() {
        return supportCurrency;
    }

    public void setSupportCurrency(Currency supportCurrency) {
        this.supportCurrency = supportCurrency;
    }

    public String getCreditDeposit() {
        return creditDeposit;
    }

    public void setCreditDeposit(String creditDeposit) {
        this.creditDeposit = creditDeposit;
    }

    public BigDecimal getCreditRemainAmount() {
        return creditRemainAmount;
    }

    public void setCreditRemainAmount(BigDecimal creditRemainAmount) {
        this.creditRemainAmount = creditRemainAmount;
    }

    public BigDecimal getCreditLoanRemainAmount() {
        return creditLoanRemainAmount;
    }

    public void setCreditLoanRemainAmount(BigDecimal creditLoanRemainAmount) {
        this.creditLoanRemainAmount = creditLoanRemainAmount;
    }

    public Double getCreditRateAmount() {
        return creditRateAmount;
    }

    public void setCreditRateAmount(Double creditRateAmount) {
        this.creditRateAmount = creditRateAmount;
    }
}
