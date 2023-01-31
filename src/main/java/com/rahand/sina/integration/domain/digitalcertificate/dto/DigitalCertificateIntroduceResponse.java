package com.rahand.sina.integration.domain.digitalcertificate.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.digitalcertificate.enums.CertificateStatus;
import com.rahand.sina.integration.domain.digitalcertificate.enums.CertificateType;
import lombok.Builder;

public class DigitalCertificateIntroduceResponse extends BaseResponse {

    private String requestId;
    private CertificateType certificateType;
    private CertificateStatus certificateStatus;

    public DigitalCertificateIntroduceResponse() {
    }

    @Builder
    public DigitalCertificateIntroduceResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String requestId, CertificateType certificateType, CertificateStatus certificateStatus) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.requestId = requestId;
        this.certificateType = certificateType;
        this.certificateStatus = certificateStatus;
    }



    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CertificateType getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(CertificateType certificateType) {
        this.certificateType = certificateType;
    }

    public CertificateStatus getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(CertificateStatus certificateStatus) {
        this.certificateStatus = certificateStatus;
    }
}
