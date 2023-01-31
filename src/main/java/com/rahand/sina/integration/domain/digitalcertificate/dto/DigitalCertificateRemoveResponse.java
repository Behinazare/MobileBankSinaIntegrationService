package com.rahand.sina.integration.domain.digitalcertificate.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class DigitalCertificateRemoveResponse extends BaseResponse {

    private boolean remove;

    public DigitalCertificateRemoveResponse() {
    }

    @Builder
    public DigitalCertificateRemoveResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean remove) {
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
