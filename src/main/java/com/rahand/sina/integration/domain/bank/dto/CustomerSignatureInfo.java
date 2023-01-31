package com.rahand.sina.integration.domain.bank.dto;

import lombok.Builder;

import java.time.LocalDateTime;


public class CustomerSignatureInfo {

    private String image;
    private String signatureId;
    private LocalDateTime expireDate;

    public CustomerSignatureInfo() {
    }

    @Builder
    public CustomerSignatureInfo(String image, String signatureId, LocalDateTime expireDate) {
        this.image = image;
        this.signatureId = signatureId;
        this.expireDate = expireDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }
}
