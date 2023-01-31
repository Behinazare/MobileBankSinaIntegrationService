package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.dto.BaseRequest;


public class PersonalImageRequest extends BaseRequest {

    private String nationalCode;
    private String nationalCodeSerial;

    public PersonalImageRequest() {
    }

    public PersonalImageRequest(String userId, String nationalCode, String nationalCodeSerial) {
        super(userId);
        this.nationalCode = nationalCode;
        this.nationalCodeSerial = nationalCodeSerial;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getNationalCodeSerial() {
        return nationalCodeSerial;
    }

    public void setNationalCodeSerial(String nationalCodeSerial) {
        this.nationalCodeSerial = nationalCodeSerial;
    }
}
