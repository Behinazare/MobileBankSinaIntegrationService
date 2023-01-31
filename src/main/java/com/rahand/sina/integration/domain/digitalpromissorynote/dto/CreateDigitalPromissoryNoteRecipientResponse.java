package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.time.LocalDateTime;

public class CreateDigitalPromissoryNoteRecipientResponse extends BaseResponse {

    private String recipientId;
    private String fullName;

    private String mobileNumber;

    private String accountNumber;

    private String nationalCode;

    private String address;

    private String postalCode;

    private boolean legal;

    private String sanaCode;

    private LocalDateTime createDateTime;

    private String persianCreateDateTime;

    public CreateDigitalPromissoryNoteRecipientResponse() {
    }

    @Builder
    public CreateDigitalPromissoryNoteRecipientResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String recipientId, String fullName, String mobileNumber, String accountNumber, String nationalCode, String address, String postalCode, boolean legal, String sanaCode, LocalDateTime createDateTime, String persianCreateDateTime) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.recipientId = recipientId;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.accountNumber = accountNumber;
        this.nationalCode = nationalCode;
        this.address = address;
        this.postalCode = postalCode;
        this.legal = legal;
        this.sanaCode = sanaCode;
        this.createDateTime = createDateTime;
        this.persianCreateDateTime = persianCreateDateTime;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    public String getSanaCode() {
        return sanaCode;
    }

    public void setSanaCode(String sanaCode) {
        this.sanaCode = sanaCode;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getPersianCreateDateTime() {
        return persianCreateDateTime;
    }

    public void setPersianCreateDateTime(String persianCreateDateTime) {
        this.persianCreateDateTime = persianCreateDateTime;
    }
}
