package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class IssueSayadChequeResponse extends BaseResponse {

    private boolean issued;

    public IssueSayadChequeResponse() {
    }

    @Builder
    public IssueSayadChequeResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean issued) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.issued = issued;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}
