package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class SignDigitalPromissoryNoteRequest extends BaseRequest {

    private String requestId;
    private String nationalCode;

    private String digitalCertificateData;

    private String digitalCertificatePassword;

    public SignDigitalPromissoryNoteRequest() {
    }

    @Builder
    public SignDigitalPromissoryNoteRequest(String userId, String requestId, String nationalCode, String digitalCertificateData, String digitalCertificatePassword) {
        super(userId);
        this.requestId = requestId;
        this.nationalCode = nationalCode;
        this.digitalCertificateData = digitalCertificateData;
        this.digitalCertificatePassword = digitalCertificatePassword;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getDigitalCertificateData() {
        return digitalCertificateData;
    }

    public void setDigitalCertificateData(String digitalCertificateData) {
        this.digitalCertificateData = digitalCertificateData;
    }

    public String getDigitalCertificatePassword() {
        return digitalCertificatePassword;
    }

    public void setDigitalCertificatePassword(String digitalCertificatePassword) {
        this.digitalCertificatePassword = digitalCertificatePassword;
    }
}
