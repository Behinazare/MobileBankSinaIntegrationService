package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class CustomerInfoDetailRequest extends BaseRequest {

    private String identityCode;
    private String cif;

    public CustomerInfoDetailRequest() {
    }

    @Builder
    public CustomerInfoDetailRequest(String userId, String identityCode, String cif) {
        super(userId);
        this.identityCode = identityCode;
        this.cif = cif;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
