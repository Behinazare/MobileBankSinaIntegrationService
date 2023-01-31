package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class FinalRegistrationDigitalPromissoryNoteRequest extends BaseRequest {

    private String signedPromissoryNoteBase64;
    private String requestId;

    public FinalRegistrationDigitalPromissoryNoteRequest() {
    }

    @Builder
    public FinalRegistrationDigitalPromissoryNoteRequest(String userId, String signedPromissoryNoteBase64, String requestId) {
        super(userId);
        this.signedPromissoryNoteBase64 = signedPromissoryNoteBase64;
        this.requestId = requestId;
    }

    public String getSignedPromissoryNoteBase64() {
        return signedPromissoryNoteBase64;
    }

    public void setSignedPromissoryNoteBase64(String signedPromissoryNoteBase64) {
        this.signedPromissoryNoteBase64 = signedPromissoryNoteBase64;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
