package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;

public class AcceptanceSayadChequeRequest extends BaseRequest {

    private boolean accept;
    private String cif;
    private String sayadId;
    private String description;
    private String acceptorAgentNationalCode;

    public AcceptanceSayadChequeRequest() {
    }

    public AcceptanceSayadChequeRequest(String userId, boolean accept, String cif, String sayadId, String description, String acceptorAgentNationalCode) {
        super(userId);
        this.accept = accept;
        this.cif = cif;
        this.sayadId = sayadId;
        this.description = description;
        this.acceptorAgentNationalCode = acceptorAgentNationalCode;
    }

    public boolean isAccept() {
        return accept;
    }

    public void setAccept(boolean accept) {
        this.accept = accept;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getSayadId() {
        return sayadId;
    }

    public void setSayadId(String sayadId) {
        this.sayadId = sayadId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAcceptorAgentNationalCode() {
        return acceptorAgentNationalCode;
    }

    public void setAcceptorAgentNationalCode(String acceptorAgentNationalCode) {
        this.acceptorAgentNationalCode = acceptorAgentNationalCode;
    }
}
