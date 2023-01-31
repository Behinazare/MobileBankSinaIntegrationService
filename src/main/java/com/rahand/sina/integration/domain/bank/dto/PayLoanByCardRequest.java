package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;

public class PayLoanByCardRequest extends BaseRequest {

    private String cif;
    private BigDecimal amount;
    private String pan;
    private String cvv2;
    private String expireDate;
    private String pin;
    private String loanNumber;
    private String merchantIdentity;
    private String twoPhaseReferenceCode;

    public PayLoanByCardRequest() {
    }

    @Builder
    public PayLoanByCardRequest(String userId, String cif, BigDecimal amount, String pan, String cvv2, String expireDate, String pin, String loanNumber, String merchantIdentity, String twoPhaseReferenceCode) {
        super(userId);
        this.cif = cif;
        this.amount = amount;
        this.pan = pan;
        this.cvv2 = cvv2;
        this.expireDate = expireDate;
        this.pin = pin;
        this.loanNumber = loanNumber;
        this.merchantIdentity = merchantIdentity;
        this.twoPhaseReferenceCode = twoPhaseReferenceCode;
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

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
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

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getMerchantIdentity() {
        return merchantIdentity;
    }

    public void setMerchantIdentity(String merchantIdentity) {
        this.merchantIdentity = merchantIdentity;
    }

    public String getTwoPhaseReferenceCode() {
        return twoPhaseReferenceCode;
    }

    public void setTwoPhaseReferenceCode(String twoPhaseReferenceCode) {
        this.twoPhaseReferenceCode = twoPhaseReferenceCode;
    }
}
