package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;


public class UnlimitedRtgsTransferRequest extends BaseRequest {

    private String methode;
    private String sourceDepositNumber;
    private String cif;
    private BigDecimal amount;
    private String creditorName;
    private String creditorLastName;
    private String destinationIban;
    private String reasonTitle;
    private String reasonCode;
    private List<String> signersCif;
    private String amountString;

    public UnlimitedRtgsTransferRequest() {
    }

    @Builder
    public UnlimitedRtgsTransferRequest(String userId, String methode, String sourceDepositNumber, String cif, BigDecimal amount, String creditorName, String creditorLastName, String destinationIban, String reasonTitle, String reasonCode, List<String> signersCif) {
        super(userId);
        this.methode = methode;
        this.sourceDepositNumber = sourceDepositNumber;
        this.cif = cif;
        this.amount = amount;
        this.creditorName = creditorName;
        this.creditorLastName = creditorLastName;
        this.destinationIban = destinationIban;
        this.reasonTitle = reasonTitle;
        this.reasonCode = reasonCode;
        this.signersCif = signersCif;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }

    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public String getCreditorLastName() {
        return creditorLastName;
    }

    public void setCreditorLastName(String creditorLastName) {
        this.creditorLastName = creditorLastName;
    }

    public String getDestinationIban() {
        return destinationIban;
    }

    public void setDestinationIban(String destinationIban) {
        this.destinationIban = destinationIban;
    }

    public String getReasonTitle() {
        return reasonTitle;
    }

    public void setReasonTitle(String reasonTitle) {
        this.reasonTitle = reasonTitle;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public List<String> getSignersCif() {
        return signersCif;
    }

    public void setSignersCif(List<String> signersCif) {
        this.signersCif = signersCif;
    }

    public String getAmountString() {
        return amountString;
    }

    public void setAmountString(String amountString) {
        this.amountString = amountString;
    }
}
