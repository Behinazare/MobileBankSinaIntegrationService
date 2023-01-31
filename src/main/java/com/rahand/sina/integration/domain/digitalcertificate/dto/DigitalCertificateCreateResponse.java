package com.rahand.sina.integration.domain.digitalcertificate.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.digitalcertificate.enums.CertificateStatus;
import lombok.Builder;

import java.time.LocalDateTime;

public class DigitalCertificateCreateResponse extends BaseResponse {

    private String certificateP12file;
    private LocalDateTime expireDate;
    private String persianExpireDate;
    private CertificateStatus certificateStatus;

    public DigitalCertificateCreateResponse() {
    }

    @Builder
    public DigitalCertificateCreateResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String certificateP12file, LocalDateTime expireDate, String persianExpireDate, CertificateStatus certificateStatus) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.certificateP12file = certificateP12file;
        this.expireDate = expireDate;
        this.persianExpireDate = persianExpireDate;
        this.certificateStatus = certificateStatus;
    }

    public String getCertificateP12file() {
        return certificateP12file;
    }

    public void setCertificateP12file(String certificateP12file) {
        this.certificateP12file = certificateP12file;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public String getPersianExpireDate() {
        return persianExpireDate;
    }

    public void setPersianExpireDate(String persianExpireDate) {
        this.persianExpireDate = persianExpireDate;
    }

    public CertificateStatus getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(CertificateStatus certificateStatus) {
        this.certificateStatus = certificateStatus;
    }
}
