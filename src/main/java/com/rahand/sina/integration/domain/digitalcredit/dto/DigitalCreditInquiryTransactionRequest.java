package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;

public class DigitalCreditInquiryTransactionRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
    }
}
