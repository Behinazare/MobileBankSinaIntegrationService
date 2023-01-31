package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseDto;
import lombok.Builder;

public class DigitalPromissoryNoteRecipientDto extends BaseDto {

    private String recipientId;
    private String fullName;
    private String nationalCode;
    private boolean legal;

    public DigitalPromissoryNoteRecipientDto() {
    }

    @Builder
    public DigitalPromissoryNoteRecipientDto(String recipientId, String fullName, String nationalCode, boolean legal) {
        this.recipientId = recipientId;
        this.fullName = fullName;
        this.nationalCode = nationalCode;
        this.legal = legal;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }
}
