package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class FinalRegistrationDigitalPromissoryNoteResponse extends BaseResponse {

    private boolean status;
    private String registeredSignedPromissoryNoteBase64;

    public FinalRegistrationDigitalPromissoryNoteResponse() {
    }

    @Builder
    public FinalRegistrationDigitalPromissoryNoteResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean status, String registeredSignedPromissoryNoteBase64) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.status = status;
        this.registeredSignedPromissoryNoteBase64 = registeredSignedPromissoryNoteBase64;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRegisteredSignedPromissoryNoteBase64() {
        return registeredSignedPromissoryNoteBase64;
    }

    public void setRegisteredSignedPromissoryNoteBase64(String registeredSignedPromissoryNoteBase64) {
        this.registeredSignedPromissoryNoteBase64 = registeredSignedPromissoryNoteBase64;
    }
}
