package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.sina.integration.domain.digitalcredit.enums.PayProductType;
import lombok.Builder;

public class DigitalCreditPaymentExtraInfo {

    private String terminalId;
    private String merchantId;
    private String pspCode;
    private String receivingInstitutionIdCode;
    private String description;
    private String merchantName;
    private PayProductType productType;

    public DigitalCreditPaymentExtraInfo() {
    }

    @Builder
    public DigitalCreditPaymentExtraInfo(String terminalId, String merchantId, String pspCode, String receivingInstitutionIdCode, String description, String merchantName, PayProductType productType) {
        this.terminalId = terminalId;
        this.merchantId = merchantId;
        this.pspCode = pspCode;
        this.receivingInstitutionIdCode = receivingInstitutionIdCode;
        this.description = description;
        this.merchantName = merchantName;
        this.productType = productType;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPspCode() {
        return pspCode;
    }

    public void setPspCode(String pspCode) {
        this.pspCode = pspCode;
    }

    public String getReceivingInstitutionIdCode() {
        return receivingInstitutionIdCode;
    }

    public void setReceivingInstitutionIdCode(String receivingInstitutionIdCode) {
        this.receivingInstitutionIdCode = receivingInstitutionIdCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public PayProductType getProductType() {
        return productType;
    }

    public void setProductType(PayProductType productType) {
        this.productType = productType;
    }
}
