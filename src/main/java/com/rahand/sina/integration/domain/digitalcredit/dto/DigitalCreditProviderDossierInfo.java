package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditProvider;
import lombok.Builder;

public class DigitalCreditProviderDossierInfo {

    private DigitalCreditProvider digitalCreditProvider;

    private String businessCode;

    private String id;

    public DigitalCreditProviderDossierInfo() {
    }

    @Builder
    public DigitalCreditProviderDossierInfo(DigitalCreditProvider digitalCreditProvider, String businessCode, String id) {
        this.digitalCreditProvider = digitalCreditProvider;
        this.businessCode = businessCode;
        this.id = id;
    }

    public DigitalCreditProvider getDigitalCreditProvider() {
        return digitalCreditProvider;
    }

    public void setDigitalCreditProvider(DigitalCreditProvider digitalCreditProvider) {
        this.digitalCreditProvider = digitalCreditProvider;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
