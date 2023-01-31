package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class AchTransferRequest extends BaseRequest {

    private BigDecimal amount;
    private String cif;
    private String sourceDepositNumber;
    private String senderFullName;
    private String destinationIbanNumber;
    private String receiverFullName;
    private String description;
    private String transferDescription;
    private String additionalDocumentDesc;
    private String reasonTitle;
    private String reasonCode;
    private String payId;
    private String title;
    private String information;

    public AchTransferRequest() {
    }

    @Builder
    public AchTransferRequest(String userId, BigDecimal amount, String cif, String sourceDepositNumber, String senderFullName, String destinationIbanNumber, String receiverFullName, String description, String transferDescription, String additionalDocumentDesc, String reasonTitle, String reasonCode, String payId, String title, String information) {
        super(userId);
        this.amount = amount;
        this.cif = cif;
        this.sourceDepositNumber = sourceDepositNumber;
        this.senderFullName = senderFullName;
        this.destinationIbanNumber = destinationIbanNumber;
        this.receiverFullName = receiverFullName;
        this.description = description;
        this.transferDescription = transferDescription;
        this.additionalDocumentDesc = additionalDocumentDesc;
        this.reasonTitle = reasonTitle;
        this.reasonCode = reasonCode;
        this.payId = payId;
        this.title = title;
        this.information = information;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }

    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }

    public String getSenderFullName() {
        return senderFullName;
    }

    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDestinationIbanNumber() {
        return destinationIbanNumber;
    }

    public void setDestinationIbanNumber(String destinationIbanNumber) {
        this.destinationIbanNumber = destinationIbanNumber;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransferDescription() {
        return transferDescription;
    }

    public void setTransferDescription(String transferDescription) {
        this.transferDescription = transferDescription;
    }

    public String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }

    public void setAdditionalDocumentDesc(String additionalDocumentDesc) {
        this.additionalDocumentDesc = additionalDocumentDesc;
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

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
