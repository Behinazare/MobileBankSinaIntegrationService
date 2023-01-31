package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class RtgsTransferRequest extends BaseRequest {


    private String userName;
    private String password;
    private BigDecimal amount;
    private String sourceDepositNumber;

    private String senderFullName;

    private String cif;
    private String destinationIbanNumber;
    private String receiverFirstName;
    private String receiverLastName;
    private String receiverTelephoneNumber;
    private String description;
    private String transferDescription;
    private String additionalDocumentDesc;
    private String reasonTitle;
    private String reasonCode;
    private String payId;
    private String title;
    private String information;

    public RtgsTransferRequest() {
    }

    @Builder
    public RtgsTransferRequest(String userId, String userName, String password, BigDecimal amount, String sourceDepositNumber, String senderFullName, String cif, String destinationIbanNumber, String receiverFirstName, String receiverLastName, String receiverTelephoneNumber, String description, String transferDescription, String additionalDocumentDesc, String reasonTitle, String reasonCode, String payId, String title, String information) {
        super(userId);
        this.userName = userName;
        this.password = password;
        this.amount = amount;
        this.sourceDepositNumber = sourceDepositNumber;
        this.senderFullName = senderFullName;
        this.cif = cif;
        this.destinationIbanNumber = destinationIbanNumber;
        this.receiverFirstName = receiverFirstName;
        this.receiverLastName = receiverLastName;
        this.receiverTelephoneNumber = receiverTelephoneNumber;
        this.description = description;
        this.transferDescription = transferDescription;
        this.additionalDocumentDesc = additionalDocumentDesc;
        this.reasonTitle = reasonTitle;
        this.reasonCode = reasonCode;
        this.payId = payId;
        this.title = title;
        this.information = information;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    public void setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    public String getReceiverLastName() {
        return receiverLastName;
    }

    public void setReceiverLastName(String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }

    public String getReceiverTelephoneNumber() {
        return receiverTelephoneNumber;
    }

    public void setReceiverTelephoneNumber(String receiverTelephoneNumber) {
        this.receiverTelephoneNumber = receiverTelephoneNumber;
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
