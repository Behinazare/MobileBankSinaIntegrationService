package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class SignDigitalPromissoryNoteResponse extends BaseResponse {

    private boolean status;
    private String signedPromissoryNoteBase64;
    private String requestId;

    public SignDigitalPromissoryNoteResponse() {
    }

    @Builder
    public SignDigitalPromissoryNoteResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean status, String signedPromissoryNoteBase64, String requestId) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.status = status;
        this.signedPromissoryNoteBase64 = signedPromissoryNoteBase64;
        this.requestId = requestId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
