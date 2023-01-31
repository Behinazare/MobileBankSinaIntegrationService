package com.rahand.sina.integration.domain.digitalpromissorynote.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class GetPaymentUrlDigitalPromissoryNoteRequest extends BaseRequest {

    private String requestId;

    private String callBackUrl;

    public GetPaymentUrlDigitalPromissoryNoteRequest() {
    }

    @Builder
    public GetPaymentUrlDigitalPromissoryNoteRequest(String userId, String requestId, String callBackUrl) {
        super(userId);
        this.requestId = requestId;
        this.callBackUrl = callBackUrl;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }
}
