package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class OwnerInquiryResponse  extends BaseResponse {

    private String firstName;
    private String lastName;
    private String fullName;
    private String referenceCode;

    public OwnerInquiryResponse() {
    }

    @Builder
    public OwnerInquiryResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String firstName, String lastName, String fullName, String referenceCode) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.referenceCode = referenceCode;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }
}
