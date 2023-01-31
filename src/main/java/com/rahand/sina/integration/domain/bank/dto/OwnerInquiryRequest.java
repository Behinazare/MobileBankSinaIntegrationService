package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class OwnerInquiryRequest extends BaseRequest {

    private String iban;
    private String depositNumber;
    private String pan;
    private String loanNumber;
    private String sourcePan;

    public OwnerInquiryRequest() {
    }

    @Builder
    public OwnerInquiryRequest(String userId, String iban, String depositNumber, String pan, String loanNumber, String sourcePan) {
        super(userId);
        this.iban = iban;
        this.depositNumber = depositNumber;
        this.pan = pan;
        this.loanNumber = loanNumber;
        this.sourcePan = sourcePan;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getSourcePan() {
        return sourcePan;
    }

    public void setSourcePan(String sourcePan) {
        this.sourcePan = sourcePan;
    }
}
