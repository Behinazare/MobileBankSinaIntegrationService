package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;


public class CardTransferRequest extends BaseRequest {

    private BigDecimal amount;
    private String sourcePan;
    private String cvv2;
    private String expireDate;
    private String pin;
    private String destinationPan;
    private String twoPhaseReferenceCode;

    private String senderFullName;

    private String receiverFullName;
    private String title;
    private String information;

    public CardTransferRequest() {
    }


    @Builder
    public CardTransferRequest(String userId, BigDecimal amount, String sourcePan, String cvv2, String expireDate, String pin, String destinationPan, String twoPhaseReferenceCode, String senderFullName, String receiverFullName, String title, String information) {
        super(userId);
        this.amount = amount;
        this.sourcePan = sourcePan;
        this.cvv2 = cvv2;
        this.expireDate = expireDate;
        this.pin = pin;
        this.destinationPan = destinationPan;
        this.twoPhaseReferenceCode = twoPhaseReferenceCode;
        this.senderFullName = senderFullName;
        this.receiverFullName = receiverFullName;
        this.title = title;
        this.information = information;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSourcePan() {
        return sourcePan;
    }

    public void setSourcePan(String sourcePan) {
        this.sourcePan = sourcePan;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDestinationPan() {
        return destinationPan;
    }

    public void setDestinationPan(String destinationPan) {
        this.destinationPan = destinationPan;
    }

    public String getTwoPhaseReferenceCode() {
        return twoPhaseReferenceCode;
    }

    public void setTwoPhaseReferenceCode(String twoPhaseReferenceCode) {
        this.twoPhaseReferenceCode = twoPhaseReferenceCode;
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

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }
}
