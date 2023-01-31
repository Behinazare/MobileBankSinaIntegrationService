package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class InquiryDigitalPromissoryNotesRequest extends BaseRequest {

    private String nationalCode;

    public InquiryDigitalPromissoryNotesRequest() {
    }

    @Builder
    public InquiryDigitalPromissoryNotesRequest(String userId, String nationalCode) {
        super(userId);
        this.nationalCode = nationalCode;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
