package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class DynamicPinResponse extends BaseResponse {

     private String correlationId;
     private String referenceNumber;

    public DynamicPinResponse() {
    }

    @Builder
    public DynamicPinResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String correlationId, String referenceNumber) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.correlationId = correlationId;
        this.referenceNumber = referenceNumber;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}
