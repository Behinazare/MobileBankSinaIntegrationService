package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;

import java.util.List;

public class RejectTransferSayadChequeRequest extends BaseRequest {

    private String cif;
    private String sayadId;
    private String destinationIban;
    private String description;
    private List<String> signers;

    public RejectTransferSayadChequeRequest() {
    }

    public RejectTransferSayadChequeRequest(String userId, String cif, String sayadId, String destinationIban, String description, List<String> signers) {
        super(userId);
        this.cif = cif;
        this.sayadId = sayadId;
        this.destinationIban = destinationIban;
        this.description = description;
        this.signers = signers;
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

    public String getDestinationIban() {
        return destinationIban;
    }

    public void setDestinationIban(String destinationIban) {
        this.destinationIban = destinationIban;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSigners() {
        return signers;
    }

    public void setSigners(List<String> signers) {
        this.signers = signers;
    }
}
