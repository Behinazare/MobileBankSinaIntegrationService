package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.enums.Gender;
import lombok.Builder;


public class CustomerInfoResponse extends BaseResponse {

    private String cif;
    private String fullName;
    private String IdentityCode;
    private String latinName;
    private Gender gender;
    private String title;

    public CustomerInfoResponse() {
    }

    @Builder
    public CustomerInfoResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String cif, String fullName, String identityCode, String latinName, Gender gender, String title) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.cif = cif;
        this.fullName = fullName;
        IdentityCode = identityCode;
        this.latinName = latinName;
        this.gender = gender;
        this.title = title;
    }


    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentityCode() {
        return IdentityCode;
    }

    public void setIdentityCode(String identityCode) {
        IdentityCode = identityCode;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
