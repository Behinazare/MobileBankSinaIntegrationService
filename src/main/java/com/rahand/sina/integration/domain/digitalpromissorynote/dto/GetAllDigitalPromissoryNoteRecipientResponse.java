package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class GetAllDigitalPromissoryNoteRecipientResponse extends BaseResponse {

    private Integer count;
    private List<DigitalPromissoryNoteRecipientDto> digitalPromissoryNoteRecipientList;

    public GetAllDigitalPromissoryNoteRecipientResponse() {
    }

    @Builder
    public GetAllDigitalPromissoryNoteRecipientResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<DigitalPromissoryNoteRecipientDto> digitalPromissoryNoteRecipientList) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.digitalPromissoryNoteRecipientList = digitalPromissoryNoteRecipientList;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<DigitalPromissoryNoteRecipientDto> getDigitalPromissoryNoteRecipientList() {
        return digitalPromissoryNoteRecipientList;
    }

    public void setDigitalPromissoryNoteRecipientList(List<DigitalPromissoryNoteRecipientDto> digitalPromissoryNoteRecipientList) {
        this.digitalPromissoryNoteRecipientList = digitalPromissoryNoteRecipientList;
    }
}
