package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class GenerateChannelUserRequest extends BaseRequest {

    private String cif;
    private String nationalCode;

    public GenerateChannelUserRequest() {
    }

    @Builder
    public GenerateChannelUserRequest(String userId, String cif, String nationalCode) {
        super(userId);
        this.cif = cif;
        this.nationalCode = nationalCode;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
