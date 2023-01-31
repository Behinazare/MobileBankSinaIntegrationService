package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class CreateDigitalPromissoryNoteRecipientRequest extends BaseRequest {

    private String fullName;

    private String mobileNumber;

    private String accountNumber;

    private String nationalCode;

    private String address;

    private String postalCode;

    private boolean legal;

    private String sanaCode;

    public CreateDigitalPromissoryNoteRecipientRequest() {
    }

    @Builder
    public CreateDigitalPromissoryNoteRecipientRequest(String userId, String fullName, String mobileNumber, String accountNumber, String nationalCode, String address, String postalCode, boolean legal, String sanaCode) {
        super(userId);
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.accountNumber = accountNumber;
        this.nationalCode = nationalCode;
        this.address = address;
        this.postalCode = postalCode;
        this.legal = legal;
        this.sanaCode = sanaCode;
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
}
