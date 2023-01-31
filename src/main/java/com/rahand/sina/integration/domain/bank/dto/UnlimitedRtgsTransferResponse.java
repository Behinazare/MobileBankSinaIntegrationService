package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class UnlimitedRtgsTransferResponse extends BaseResponse {

    private String referenceNumber;
    private String id;
    private String title;

    public UnlimitedRtgsTransferResponse() {
    }

    @Builder
    public UnlimitedRtgsTransferResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String referenceNumber, String id, String title) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.referenceNumber = referenceNumber;
        this.id = id;
        this.title = title;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
