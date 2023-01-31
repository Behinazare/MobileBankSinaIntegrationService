package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class InstantTransferRequest extends BaseRequest {

    private BigDecimal amount;
    private String sourceDepositNumber;
    private String senderFullName;

    private String cif;
    private String destinationIbanNumber;
    private String receiverFullName;
    private String destinationComment;
    private String reasonTitle;
    private String reasonCode;
    private String payId;

    private String title;
    private String information;

    public InstantTransferRequest() {
    }

    @Builder
    public InstantTransferRequest(String userId, BigDecimal amount, String sourceDepositNumber, String senderFullName, String cif, String destinationIbanNumber, String receiverFullName, String destinationComment, String reasonTitle, String reasonCode, String payId, String title, String information) {
        super(userId);
        this.amount = amount;
        this.sourceDepositNumber = sourceDepositNumber;
        this.senderFullName = senderFullName;
        this.cif = cif;
        this.destinationIbanNumber = destinationIbanNumber;
        this.receiverFullName = receiverFullName;
        this.destinationComment = destinationComment;
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

    public String getDestinationComment() {
        return destinationComment;
    }

    public void setDestinationComment(String destinationComment) {
        this.destinationComment = destinationComment;
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
