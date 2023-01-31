package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class InquiryDigitalPromissoryNotesResponse extends BaseResponse {

    private Integer count;

    private List<DigitalPromissoryNoteDto> digitalPromissoryNotes;

    public InquiryDigitalPromissoryNotesResponse() {
    }

    @Builder
    public InquiryDigitalPromissoryNotesResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<DigitalPromissoryNoteDto> digitalPromissoryNotes) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.digitalPromissoryNotes = digitalPromissoryNotes;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<DigitalPromissoryNoteDto> getDigitalPromissoryNotes() {
        return digitalPromissoryNotes;
    }

    public void setDigitalPromissoryNotes(List<DigitalPromissoryNoteDto> digitalPromissoryNotes) {
        this.digitalPromissoryNotes = digitalPromissoryNotes;
    }
}
