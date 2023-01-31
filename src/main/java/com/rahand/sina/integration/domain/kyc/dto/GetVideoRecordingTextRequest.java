package com.rahand.sina.integration.domain.kyc.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class GetVideoRecordingTextRequest extends BaseRequest {

    private String requestId;

    public GetVideoRecordingTextRequest() {
    }

    @Builder
    public GetVideoRecordingTextRequest(String userId, String requestId) {
        super(userId);
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
