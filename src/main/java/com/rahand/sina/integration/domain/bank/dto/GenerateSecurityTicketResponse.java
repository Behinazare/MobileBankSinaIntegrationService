package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class GenerateSecurityTicketResponse extends BaseResponse {

    private boolean generate;

    public GenerateSecurityTicketResponse() {
    }

    @Builder
    public GenerateSecurityTicketResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean generate) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.generate = generate;
    }

    public boolean isGenerate() {
        return generate;
    }

    public void setGenerate(boolean generate) {
        this.generate = generate;
    }
}
