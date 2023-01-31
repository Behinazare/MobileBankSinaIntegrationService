package com.rahand.sina.integration.domain.inquiry.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalImageResponse extends BaseResponse {

    @JsonProperty("errorMessage")
    private String errorMessage;
    @JsonProperty("messageList")
    private List messageList;
    @JsonProperty("image")
    private String image;

    public PersonalImageResponse() {
    }

    @Builder
    public PersonalImageResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String errorMessage1, List messageList, String image) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.errorMessage = errorMessage1;
        this.messageList = messageList;
        this.image = image;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List getMessageList() {
        return messageList;
    }

    public void setMessageList(List messageList) {
        this.messageList = messageList;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
