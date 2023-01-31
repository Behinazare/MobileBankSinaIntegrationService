package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class GetDigitalCreditDossiersRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;

    private String nationalCode;

    private String customerNumber;

    private String creditGroup;


    public GetDigitalCreditDossiersRequest() {
    }

    @Builder
    public GetDigitalCreditDossiersRequest(String userId, DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, String nationalCode, String customerNumber, String creditGroup) {
        super(userId);
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.nationalCode = nationalCode;
        this.customerNumber = customerNumber;
        this.creditGroup = creditGroup;
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

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCreditGroup() {
        return creditGroup;
    }

    public void setCreditGroup(String creditGroup) {
        this.creditGroup = creditGroup;
    }

}
