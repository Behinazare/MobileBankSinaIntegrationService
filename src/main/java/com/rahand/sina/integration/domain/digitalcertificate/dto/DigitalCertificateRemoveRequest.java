package com.rahand.sina.integration.domain.digitalcertificate.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.digitalcertificate.enums.CertificateRemoveReason;
import lombok.Builder;

public class DigitalCertificateRemoveRequest extends BaseRequest {

    private String certificateRequestId;
    private String nationalCode;
    private CertificateRemoveReason reason;

    public DigitalCertificateRemoveRequest() {
    }

    @Builder
    public DigitalCertificateRemoveRequest(String userId, String certificateRequestId, String nationalCode, CertificateRemoveReason reason) {
        super(userId);
        this.certificateRequestId = certificateRequestId;
        this.nationalCode = nationalCode;
        this.reason = reason;
    }

    public String getCertificateRequestId() {
        return certificateRequestId;
    }

    public void setCertificateRequestId(String certificateRequestId) {
        this.certificateRequestId = certificateRequestId;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public CertificateRemoveReason getReason() {
        return reason;
    }

    public void setReason(CertificateRemoveReason reason) {
        this.reason = reason;
    }
}
