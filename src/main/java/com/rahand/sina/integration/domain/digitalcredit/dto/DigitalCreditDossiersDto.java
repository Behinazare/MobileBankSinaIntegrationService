package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.digitalcredit.enums.*;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DigitalCreditDossiersDto extends BaseDto {

   private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String nationalCode;
    private String customerNumber;
    private String DossierNumber;
    private String pan;
    private String title;
    private BigDecimal totalFund;
    private BigDecimal availableFund;
    private Currency currency;
    private DigitalCreditDossierStatus digitalCreditDossierStatus;
    private DigitalCreditDossierCycleLength digitalCreditDossierCycleLength;
    private LocalDateTime openDate;
    private String persianOpenDate;
    private LocalDateTime expireDate;
    private String persianExpireDate;
    private DigitalCreditCardType digitalCreditCardType;
    private DigitalCreditCardStatus digitalCreditCardStatus;


    public DigitalCreditDossiersDto() {
    }

    @Builder
    public DigitalCreditDossiersDto(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, String firstName, String lastName, String fatherName, String nationalCode, String customerNumber, String dossierNumber, String pan, String title, BigDecimal totalFund, BigDecimal availableFund, Currency currency, DigitalCreditDossierStatus digitalCreditDossierStatus, DigitalCreditDossierCycleLength digitalCreditDossierCycleLength, LocalDateTime openDate, String persianOpenDate, LocalDateTime expireDate, String persianExpireDate, DigitalCreditCardType digitalCreditCardType, DigitalCreditCardStatus digitalCreditCardStatus) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.nationalCode = nationalCode;
        this.customerNumber = customerNumber;
        DossierNumber = dossierNumber;
        this.pan = pan;
        this.title = title;
        this.totalFund = totalFund;
        this.availableFund = availableFund;
        this.currency = currency;
        this.digitalCreditDossierStatus = digitalCreditDossierStatus;
        this.digitalCreditDossierCycleLength = digitalCreditDossierCycleLength;
        this.openDate = openDate;
        this.persianOpenDate = persianOpenDate;
        this.expireDate = expireDate;
        this.persianExpireDate = persianExpireDate;
        this.digitalCreditCardType = digitalCreditCardType;
        this.digitalCreditCardStatus = digitalCreditCardStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getDossierNumber() {
        return DossierNumber;
    }

    public void setDossierNumber(String dossierNumber) {
        DossierNumber = dossierNumber;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getTotalFund() {
        return totalFund;
    }

    public void setTotalFund(BigDecimal totalFund) {
        this.totalFund = totalFund;
    }

    public BigDecimal getAvailableFund() {
        return availableFund;
    }

    public void setAvailableFund(BigDecimal availableFund) {
        this.availableFund = availableFund;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public DigitalCreditDossierStatus getDigitalCreditDossierStatus() {
        return digitalCreditDossierStatus;
    }

    public void setDigitalCreditDossierStatus(DigitalCreditDossierStatus digitalCreditDossierStatus) {
        this.digitalCreditDossierStatus = digitalCreditDossierStatus;
    }

    public DigitalCreditDossierCycleLength getDigitalCreditDossierCycleLength() {
        return digitalCreditDossierCycleLength;
    }

    public void setDigitalCreditDossierCycleLength(DigitalCreditDossierCycleLength digitalCreditDossierCycleLength) {
        this.digitalCreditDossierCycleLength = digitalCreditDossierCycleLength;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDateTime openDate) {
        this.openDate = openDate;
    }

    public String getPersianOpenDate() {
        return persianOpenDate;
    }

    public void setPersianOpenDate(String persianOpenDate) {
        this.persianOpenDate = persianOpenDate;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public String getPersianExpireDate() {
        return persianExpireDate;
    }

    public void setPersianExpireDate(String persianExpireDate) {
        this.persianExpireDate = persianExpireDate;
    }

    public DigitalCreditCardType getDigitalCreditCardType() {
        return digitalCreditCardType;
    }

    public void setDigitalCreditCardType(DigitalCreditCardType digitalCreditCardType) {
        this.digitalCreditCardType = digitalCreditCardType;
    }

    public DigitalCreditCardStatus getDigitalCreditCardStatus() {
        return digitalCreditCardStatus;
    }

    public void setDigitalCreditCardStatus(DigitalCreditCardStatus digitalCreditCardStatus) {
        this.digitalCreditCardStatus = digitalCreditCardStatus;
    }

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
    }
}
