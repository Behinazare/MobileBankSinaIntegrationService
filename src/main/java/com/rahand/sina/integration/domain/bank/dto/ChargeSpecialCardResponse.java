package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class ChargeSpecialCardResponse extends BaseResponse {

    private boolean charged;

    public ChargeSpecialCardResponse() {
    }

    @Builder
    public ChargeSpecialCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean charged) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.charged = charged;
    }


    public boolean isCharged() {
        return charged;
    }

    public void setCharged(boolean charged) {
        this.charged = charged;
    }
}
