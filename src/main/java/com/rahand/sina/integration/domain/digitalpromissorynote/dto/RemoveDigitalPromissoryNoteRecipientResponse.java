package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class RemoveDigitalPromissoryNoteRecipientResponse extends BaseResponse {

    private boolean remove;

    public RemoveDigitalPromissoryNoteRecipientResponse() {
    }

    @Builder
    public RemoveDigitalPromissoryNoteRecipientResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean remove) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.remove = remove;
    }

    public boolean isRemove() {
        return remove;
    }

    public void setRemove(boolean remove) {
        this.remove = remove;
    }
}
