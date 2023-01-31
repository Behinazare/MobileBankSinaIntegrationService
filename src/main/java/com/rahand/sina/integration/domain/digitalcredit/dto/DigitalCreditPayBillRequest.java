package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;

public class DigitalCreditPayBillRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;

    private String nationalCode;
    private String dossierNumber;
    private BigDecimal amount;
    private String paymentId;
    private String creditGroup;

    private boolean fullSettlement;

    public DigitalCreditPayBillRequest() {
    }

    @Builder
    public DigitalCreditPayBillRequest(String userId, DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, String nationalCode, String dossierNumber, BigDecimal amount, String paymentId, String creditGroup, boolean fullSettlement) {
        super(userId);
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.nationalCode = nationalCode;
        this.dossierNumber = dossierNumber;
        this.amount = amount;
        this.paymentId = paymentId;
        this.creditGroup = creditGroup;
        this.fullSettlement = fullSettlement;
    }

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getDossierNumber() {
        return dossierNumber;
    }

    public void setDossierNumber(String dossierNumber) {
        this.dossierNumber = dossierNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCreditGroup() {
        return creditGroup;
    }

    public void setCreditGroup(String creditGroup) {
        this.creditGroup = creditGroup;
    }

    public boolean isFullSettlement() {
        return fullSettlement;
    }

    public void setFullSettlement(boolean fullSettlement) {
        this.fullSettlement = fullSettlement;
    }
}
