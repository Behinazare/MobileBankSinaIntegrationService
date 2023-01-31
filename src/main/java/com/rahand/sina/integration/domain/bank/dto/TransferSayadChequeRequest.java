package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.util.List;

public class TransferSayadChequeRequest extends BaseRequest {

    private String cif;
    private String sayadId;
    private String reasonCode;
    private String destinationIban;
    private String description;
    private List<SayadChequeReceiverDto> receivers;
    private List<String> signers;

    public TransferSayadChequeRequest() {
    }

    @Builder
    public TransferSayadChequeRequest(String userId, String cif, String sayadId, String reasonCode, String destinationIban, String description, List<SayadChequeReceiverDto> receivers, List<String> signers) {
        super(userId);
        this.cif = cif;
        this.sayadId = sayadId;
        this.reasonCode = reasonCode;
        this.destinationIban = destinationIban;
        this.description = description;
        this.receivers = receivers;
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

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
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

    public List<SayadChequeReceiverDto> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<SayadChequeReceiverDto> receivers) {
        this.receivers = receivers;
    }

    public List<String> getSigners() {
        return signers;
    }

    public void setSigners(List<String> signers) {
        this.signers = signers;
    }
}
