package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.common.enums.Gender;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreateDigitalCreditDossierRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;
    private String firstName;
    private String lastName;

    private String fatherName;

    private String nationalCode;

    private String idCardSeries;

    private String mobileNumber;

    private BigDecimal amount;

    private String postalCode;

    private String address;

    private Gender gender;

    private LocalDateTime birthDate;

    private String creditGroup;



    public CreateDigitalCreditDossierRequest() {
    }

    @Builder
    public CreateDigitalCreditDossierRequest(String userId, DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, String firstName, String lastName, String fatherName, String nationalCode, String idCardSeries, String mobileNumber, BigDecimal amount, String postalCode, String address, Gender gender, LocalDateTime birthDate, String creditGroup) {
        super(userId);
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.nationalCode = nationalCode;
        this.idCardSeries = idCardSeries;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.postalCode = postalCode;
        this.address = address;
        this.gender = gender;
        this.birthDate = birthDate;
        this.creditGroup = creditGroup;
    }

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
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

    public String getIdCardSeries() {
        return idCardSeries;
    }

    public void setIdCardSeries(String idCardSeries) {
        this.idCardSeries = idCardSeries;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getCreditGroup() {
        return creditGroup;
    }

    public void setCreditGroup(String creditGroup) {
        this.creditGroup = creditGroup;
    }
}
