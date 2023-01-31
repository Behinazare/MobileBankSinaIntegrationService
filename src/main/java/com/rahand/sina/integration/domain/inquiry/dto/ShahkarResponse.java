package com.rahand.sina.integration.domain.inquiry.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ShahkarResponse extends BaseResponse {


    @JsonProperty("response")
    private String response;
    @JsonProperty("requestId")
    private String requestId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("result")
    private String result;
    @JsonProperty("comment")
    private String comment;
    private boolean shahkarStatus;

    public ShahkarResponse() {
    }

    @Builder
    public ShahkarResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String response, String requestId, String id, String result, String comment, boolean shahkarStatus) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.response = response;
        this.requestId = requestId;
        this.id = id;
        this.result = result;
        this.comment = comment;
        this.shahkarStatus = shahkarStatus;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isShahkarStatus() {
        return shahkarStatus;
    }

    public void setShahkarStatus(boolean shahkarStatus) {
        this.shahkarStatus = shahkarStatus;
    }
}
