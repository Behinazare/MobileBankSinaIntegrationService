package com.rahand.sina.integration.domain.digitalcertificate.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class DigitalCertificateCreateRequest  extends BaseRequest {

    private String certificateRequestId;
    private String nationalCode;

    private String password;

    public DigitalCertificateCreateRequest() {
    }

    @Builder
    public DigitalCertificateCreateRequest(String userId, String certificateRequestId, String nationalCode, String password) {
        super(userId);
        this.certificateRequestId = certificateRequestId;
        this.nationalCode = nationalCode;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
