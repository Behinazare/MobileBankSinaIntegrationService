package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditPaymentType;
import lombok.Builder;

public class DigitalCreditRollbackPaymentRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;

    private String paymentId;

    private DigitalCreditPaymentType digitalCreditPaymentType;

    public DigitalCreditRollbackPaymentRequest() {
    }

    @Builder
    public DigitalCreditRollbackPaymentRequest(String userId, DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, String paymentId, DigitalCreditPaymentType digitalCreditPaymentType) {
        super(userId);
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.paymentId = paymentId;
        this.digitalCreditPaymentType = digitalCreditPaymentType;
    }

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public DigitalCreditPaymentType getDigitalCreditPaymentType() {
        return digitalCreditPaymentType;
    }

    public void setDigitalCreditPaymentType(DigitalCreditPaymentType digitalCreditPaymentType) {
        this.digitalCreditPaymentType = digitalCreditPaymentType;
    }
}
