package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class GetDigitalCreditBillDetailedTransactionRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;

    private String customerNumber;
    private String billId;

    public GetDigitalCreditBillDetailedTransactionRequest() {
    }

    @Builder
    public GetDigitalCreditBillDetailedTransactionRequest(String userId, DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, String customerNumber, String billId) {
        super(userId);
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.customerNumber = customerNumber;
        this.billId = billId;
    }

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}
