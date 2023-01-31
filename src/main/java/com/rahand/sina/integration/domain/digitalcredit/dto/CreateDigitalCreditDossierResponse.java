package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.enums.Gender;
import com.rahand.sina.integration.domain.digitalcredit.enums.CreateDigitalCreditDossierStatus;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditDossierInquiryStatus;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreateDigitalCreditDossierResponse extends BaseResponse {

    private String firstName;
    private String lastName;
    private String fatherName;
    private String localizedFirstName;
    private String localizedLastName;
    private String localizedFatherName;
    private String nationalCode;
    private String idCardSeries;
    private String mobileNumber;
    private BigDecimal amount;
    private String postalCode;
    private String address;
    private Gender gender;
    private String id;
    private String creditGroup;
    private LocalDateTime creationDateTime;
    private String persianCreationDateTime;
    private CreateDigitalCreditDossierStatus createDigitalCreditDossierStatus;
    private DigitalCreditDossierInquiryStatus creditDossierInquiryStatus;
    private String inquiryMessage;
    private String dossierPattern;
    private String sourceApp;

    private LocalDateTime birthDate;

    private String persianBirthDate;


    public CreateDigitalCreditDossierResponse() {
    }

    @Builder
    public CreateDigitalCreditDossierResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String firstName, String lastName, String fatherName, String localizedFirstName, String localizedLastName, String localizedFatherName, String nationalCode, String idCardSeries, String mobileNumber, BigDecimal amount, String postalCode, String address, Gender gender, String id, String creditGroup, LocalDateTime creationDateTime, String persianCreationDateTime, CreateDigitalCreditDossierStatus createDigitalCreditDossierStatus, DigitalCreditDossierInquiryStatus creditDossierInquiryStatus, String inquiryMessage, String dossierPattern, String sourceApp, LocalDateTime birthDate, String persianBirthDate) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.localizedFirstName = localizedFirstName;
        this.localizedLastName = localizedLastName;
        this.localizedFatherName = localizedFatherName;
        this.nationalCode = nationalCode;
        this.idCardSeries = idCardSeries;
        this.mobileNumber = mobileNumber;
        this.amount = amount;
        this.postalCode = postalCode;
        this.address = address;
        this.gender = gender;
        this.id = id;
        this.creditGroup = creditGroup;
        this.creationDateTime = creationDateTime;
        this.persianCreationDateTime = persianCreationDateTime;
        this.createDigitalCreditDossierStatus = createDigitalCreditDossierStatus;
        this.creditDossierInquiryStatus = creditDossierInquiryStatus;
        this.inquiryMessage = inquiryMessage;
        this.dossierPattern = dossierPattern;
        this.sourceApp = sourceApp;
        this.birthDate = birthDate;
        this.persianBirthDate = persianBirthDate;
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

    public String getLocalizedFirstName() {
        return localizedFirstName;
    }

    public void setLocalizedFirstName(String localizedFirstName) {
        this.localizedFirstName = localizedFirstName;
    }

    public String getLocalizedLastName() {
        return localizedLastName;
    }

    public void setLocalizedLastName(String localizedLastName) {
        this.localizedLastName = localizedLastName;
    }

    public String getLocalizedFatherName() {
        return localizedFatherName;
    }

    public void setLocalizedFatherName(String localizedFatherName) {
        this.localizedFatherName = localizedFatherName;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreditGroup() {
        return creditGroup;
    }

    public void setCreditGroup(String creditGroup) {
        this.creditGroup = creditGroup;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getPersianCreationDateTime() {
        return persianCreationDateTime;
    }

    public void setPersianCreationDateTime(String persianCreationDateTime) {
        this.persianCreationDateTime = persianCreationDateTime;
    }

    public CreateDigitalCreditDossierStatus getCreateDigitalCreditDossierStatus() {
        return createDigitalCreditDossierStatus;
    }

    public void setCreateDigitalCreditDossierStatus(CreateDigitalCreditDossierStatus createDigitalCreditDossierStatus) {
        this.createDigitalCreditDossierStatus = createDigitalCreditDossierStatus;
    }

    public DigitalCreditDossierInquiryStatus getCreditDossierInquiryStatus() {
        return creditDossierInquiryStatus;
    }

    public void setCreditDossierInquiryStatus(DigitalCreditDossierInquiryStatus creditDossierInquiryStatus) {
        this.creditDossierInquiryStatus = creditDossierInquiryStatus;
    }

    public String getInquiryMessage() {
        return inquiryMessage;
    }

    public void setInquiryMessage(String inquiryMessage) {
        this.inquiryMessage = inquiryMessage;
    }

    public String getDossierPattern() {
        return dossierPattern;
    }

    public void setDossierPattern(String dossierPattern) {
        this.dossierPattern = dossierPattern;
    }

    public String getSourceApp() {
        return sourceApp;
    }

    public void setSourceApp(String sourceApp) {
        this.sourceApp = sourceApp;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getPersianBirthDate() {
        return persianBirthDate;
    }

    public void setPersianBirthDate(String persianBirthDate) {
        this.persianBirthDate = persianBirthDate;
    }
}
