package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class AcceptanceSayadChequeResponse extends BaseResponse {

    private boolean accepted;

    public AcceptanceSayadChequeResponse() {
    }

    @Builder
    public AcceptanceSayadChequeResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean accepted) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.accepted = accepted;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}
