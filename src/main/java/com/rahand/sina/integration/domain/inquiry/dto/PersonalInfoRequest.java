package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class PersonalInfoRequest  extends BaseRequest {

    private String nationalCode;
    private String birthDate;

    public PersonalInfoRequest() {
    }

    @Builder
    public PersonalInfoRequest(String userId, String nationalCode, String birthDate) {
        super(userId);
        this.nationalCode = nationalCode;
        this.birthDate = birthDate;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
