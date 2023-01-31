package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.SpecialCardType;
import lombok.Builder;

import java.math.BigDecimal;

public class IssueSpecialCardRequest extends BaseRequest {

    private SpecialCardType specialCardType;
    private BigDecimal amount;
    private String templateId;
    private String issuerCif;
    private String holderCif;
    private String holderName;

    public IssueSpecialCardRequest() {
    }

    @Builder
    public IssueSpecialCardRequest(String userId, SpecialCardType specialCardType, BigDecimal amount, String templateId, String issuerCif, String holderCif, String holderName) {
        super(userId);
        this.specialCardType = specialCardType;
        this.amount = amount;
        this.templateId = templateId;
        this.issuerCif = issuerCif;
        this.holderCif = holderCif;
        this.holderName = holderName;
    }

    public SpecialCardType getSpecialCardType() {
        return specialCardType;
    }

    public void setSpecialCardType(SpecialCardType specialCardType) {
        this.specialCardType = specialCardType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getIssuerCif() {
        return issuerCif;
    }

    public void setIssuerCif(String issuerCif) {
        this.issuerCif = issuerCif;
    }

    public String getHolderCif() {
        return holderCif;
    }

    public void setHolderCif(String holderCif) {
        this.holderCif = holderCif;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
