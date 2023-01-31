package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;

public class BlockCardResponse extends BaseResponse {

    private boolean blocked;

    public BlockCardResponse() {
    }

    public BlockCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean blocked) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
