package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.sina.integration.domain.bank.enums.SignatureStatus;
import lombok.Builder;

import java.time.LocalDateTime;



public class DepositCustomer {

    private String cif;
    private String name;
    private LocalDateTime relationExpireDate;
    private Integer sharePercent;
    private CustomerSignatureInfo customerSignature;
    private SignatureStatus signatureStatus;

    public DepositCustomer() {
    }

    @Builder
    public DepositCustomer(String cif, String name, LocalDateTime relationExpireDate, Integer sharePercent, CustomerSignatureInfo customerSignature, SignatureStatus signatureStatus) {
        this.cif = cif;
        this.name = name;
        this.relationExpireDate = relationExpireDate;
        this.sharePercent = sharePercent;
        this.customerSignature = customerSignature;
        this.signatureStatus = signatureStatus;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRelationExpireDate() {
        return relationExpireDate;
    }

    public void setRelationExpireDate(LocalDateTime relationExpireDate) {
        this.relationExpireDate = relationExpireDate;
    }

    public Integer getSharePercent() {
        return sharePercent;
    }

    public void setSharePercent(Integer sharePercent) {
        this.sharePercent = sharePercent;
    }

    public CustomerSignatureInfo getCustomerSignature() {
        return customerSignature;
    }

    public void setCustomerSignature(CustomerSignatureInfo customerSignature) {
        this.customerSignature = customerSignature;
    }

    public SignatureStatus getSignatureStatus() {
        return signatureStatus;
    }

    public void setSignatureStatus(SignatureStatus signatureStatus) {
        this.signatureStatus = signatureStatus;
    }
}
