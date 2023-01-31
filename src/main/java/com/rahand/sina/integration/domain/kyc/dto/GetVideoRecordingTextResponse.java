package com.rahand.sina.integration.domain.kyc.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class GetVideoRecordingTextResponse extends BaseResponse {

    private String text;
    private Integer maxTime;

    private Integer minTime;

    public GetVideoRecordingTextResponse() {
    }

    @Builder
    public GetVideoRecordingTextResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String text, Integer maxTime, Integer minTime) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.text = text;
        this.maxTime = maxTime;
        this.minTime = minTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public Integer getMinTime() {
        return minTime;
    }

    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }
}
