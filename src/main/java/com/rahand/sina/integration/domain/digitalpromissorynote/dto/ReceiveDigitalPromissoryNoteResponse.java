package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class ReceiveDigitalPromissoryNoteResponse extends BaseResponse {

    private String requestId;

    private String promissoryNoteId;

    private String unSignedPromissoryNoteBase64;

    public ReceiveDigitalPromissoryNoteResponse() {
    }

    @Builder
    public ReceiveDigitalPromissoryNoteResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String requestId, String promissoryNoteId, String unSignedPromissoryNoteBase64) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.requestId = requestId;
        this.promissoryNoteId = promissoryNoteId;
        this.unSignedPromissoryNoteBase64 = unSignedPromissoryNoteBase64;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getPromissoryNoteId() {
        return promissoryNoteId;
    }

    public void setPromissoryNoteId(String promissoryNoteId) {
        this.promissoryNoteId = promissoryNoteId;
    }

    public String getUnSignedPromissoryNoteBase64() {
        return unSignedPromissoryNoteBase64;
    }

    public void setUnSignedPromissoryNoteBase64(String unSignedPromissoryNoteBase64) {
        this.unSignedPromissoryNoteBase64 = unSignedPromissoryNoteBase64;
    }
}
