package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class GetDigitalCreditBillRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;
    private String dossierNumber;

    public GetDigitalCreditBillRequest() {
    }

    @Builder
    public GetDigitalCreditBillRequest(String userId, DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, String dossierNumber) {
        super(userId);
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.dossierNumber = dossierNumber;
    }

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
    }

    public String getDossierNumber() {
        return dossierNumber;
    }

    public void setDossierNumber(String dossierNumber) {
        this.dossierNumber = dossierNumber;
    }
}
