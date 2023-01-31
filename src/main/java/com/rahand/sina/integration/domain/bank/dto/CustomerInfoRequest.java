package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class CustomerInfoRequest extends BaseRequest {

    private String cif;

    public CustomerInfoRequest() {
    }

    @Builder
    public CustomerInfoRequest(String userId, String cif) {
        super(userId);
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

}
