package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class RemoveDigitalPromissoryNoteRecipientRequest extends BaseRequest {

    private String recipientId;

    public RemoveDigitalPromissoryNoteRecipientRequest() {
    }

    @Builder
    public RemoveDigitalPromissoryNoteRecipientRequest(String userId, String recipientId) {
        super(userId);
        this.recipientId = recipientId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }
}
