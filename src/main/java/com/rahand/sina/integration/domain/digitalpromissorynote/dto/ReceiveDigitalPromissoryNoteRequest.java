package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReceiveDigitalPromissoryNoteRequest extends BaseRequest {

    private String recipientNationalCode;
    private String fullName;

    private String mobileNumber;

    private String accountNumber;

    private String nationalCode;

    private String address;

    private String postalCode;

    private boolean legal;

    private BigDecimal amount;

    private String description;

    private LocalDateTime dueDate;

    public ReceiveDigitalPromissoryNoteRequest() {
    }

    @Builder
    public ReceiveDigitalPromissoryNoteRequest(String userId, String recipientNationalCode, String fullName, String mobileNumber, String accountNumber, String nationalCode, String address, String postalCode, boolean legal, BigDecimal amount, String description, LocalDateTime dueDate) {
        super(userId);
        this.recipientNationalCode = recipientNationalCode;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.accountNumber = accountNumber;
        this.nationalCode = nationalCode;
        this.address = address;
        this.postalCode = postalCode;
        this.legal = legal;
        this.amount = amount;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getRecipientNationalCode() {
        return recipientNationalCode;
    }

    public void setRecipientNationalCode(String recipientNationalCode) {
        this.recipientNationalCode = recipientNationalCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
