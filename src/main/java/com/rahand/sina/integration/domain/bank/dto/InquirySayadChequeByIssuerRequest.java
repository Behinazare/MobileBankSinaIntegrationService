package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class InquirySayadChequeByIssuerRequest extends BaseRequest {

    private String cif;
    private String sayadChequeId;

    public InquirySayadChequeByIssuerRequest() {
    }

    @Builder
    public InquirySayadChequeByIssuerRequest(String userId, String cif, String sayadChequeId) {
        super(userId);
        this.cif = cif;
        this.sayadChequeId = sayadChequeId;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getSayadChequeId() {
        return sayadChequeId;
    }

    public void setSayadChequeId(String sayadChequeId) {
        this.sayadChequeId = sayadChequeId;
    }
}
