package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;

public class BlockCardRequest extends BaseRequest {

    private String cif;
    private String pan;

    public BlockCardRequest() {
    }

    public BlockCardRequest(String userId, String cif, String pan) {
        super(userId);
        this.cif = cif;
        this.pan = pan;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
}
