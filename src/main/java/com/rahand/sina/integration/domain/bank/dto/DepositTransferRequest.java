package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class DepositTransferRequest extends BaseRequest {

    private BigDecimal amount;
    private String cif;
    private String sourceDepositNumber;
    private String senderFullName;
    private String destinationDepositNumber;
    private String receiverFullName;
    private String sourceComment;
    private String destinationComment;
    private String additionalDocumentDesc;

    private String payId;
    private String title;
    private String information;

    public DepositTransferRequest() {
    }

    @Builder
    public DepositTransferRequest(String userId, BigDecimal amount, String cif, String sourceDepositNumber, String senderFullName, String destinationDepositNumber, String receiverFullName, String sourceComment, String destinationComment, String additionalDocumentDesc, String payId, String title, String information) {
        super(userId);
        this.amount = amount;
        this.cif = cif;
        this.sourceDepositNumber = sourceDepositNumber;
        this.senderFullName = senderFullName;
        this.destinationDepositNumber = destinationDepositNumber;
        this.receiverFullName = receiverFullName;
        this.sourceComment = sourceComment;
        this.destinationComment = destinationComment;
        this.additionalDocumentDesc = additionalDocumentDesc;
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

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }

    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }

    public String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }

    public void setDestinationDepositNumber(String destinationDepositNumber) {
        this.destinationDepositNumber = destinationDepositNumber;
    }

    public String getSourceComment() {
        return sourceComment;
    }

    public void setSourceComment(String sourceComment) {
        this.sourceComment = sourceComment;
    }

    public String getDestinationComment() {
        return destinationComment;
    }

    public void setDestinationComment(String destinationComment) {
        this.destinationComment = destinationComment;
    }

    public String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }

    public void setAdditionalDocumentDesc(String additionalDocumentDesc) {
        this.additionalDocumentDesc = additionalDocumentDesc;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
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

    public String getSenderFullName() {
        return senderFullName;
    }

    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }
}
