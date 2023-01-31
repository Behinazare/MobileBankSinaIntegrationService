package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.digitalcredit.enums.PayProductType;
import lombok.Builder;

import java.math.BigDecimal;

public class DigitalCreditPaymentRequest extends BaseRequest {

    private DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo;
    private BigDecimal amount;
    private String pan;
    private String paymentId;
    private String orderId;
    private String terminalId;
    private String merchantId;
    private String pspCode;
    private String receivingInstitutionIdCode;
    private String description;
    private String merchantName;
    private PayProductType productType;

    public DigitalCreditPaymentRequest() {
    }

    @Builder
    public DigitalCreditPaymentRequest(String userId, DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo, BigDecimal amount, String pan, String paymentId, String orderId, String terminalId, String merchantId, String pspCode, String receivingInstitutionIdCode, String description, String merchantName, PayProductType productType) {
        super(userId);
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
        this.amount = amount;
        this.pan = pan;
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.terminalId = terminalId;
        this.merchantId = merchantId;
        this.pspCode = pspCode;
        this.receivingInstitutionIdCode = receivingInstitutionIdCode;
        this.description = description;
        this.merchantName = merchantName;
        this.productType = productType;
    }

    public DigitalCreditProviderDossierInfo getDigitalCreditProviderDossierInfo() {
        return digitalCreditProviderDossierInfo;
    }

    public void setDigitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo digitalCreditProviderDossierInfo) {
        this.digitalCreditProviderDossierInfo = digitalCreditProviderDossierInfo;
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

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
