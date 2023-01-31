package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class RemoveDigitalPromissoryNoteRequest extends BaseRequest {

    private String requestId;

    public RemoveDigitalPromissoryNoteRequest() {
    }

    @Builder
    public RemoveDigitalPromissoryNoteRequest(String userId, String requestId) {
        super(userId);
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
