package com.rahand.sina.integration.provider.tefas.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TefasBaseResponse<T> {


    @JsonProperty("message")
    private Map message;
    @JsonProperty("messageCode")
    private int messageCode;
    @JsonProperty("englishContent")
    private String englishContent;
    @JsonProperty("persianContent")
    private String persianContent;
    @JsonProperty("isError")
    private boolean isError;
    @JsonProperty("responseDate")
    private String responseDate;
    @JsonProperty("modelClass")
    private T modelClass;
    @JsonProperty("modelClassList")
    private List modelClassList;
    @JsonProperty("stackTrace")
    private String stackTrace;
    @JsonProperty("errorData")
    private String errorData;

    private T responseModel;

    public Map getMessage() {
        return message;
    }

    public void setMessage(Map message) {
        this.message = message;
    }

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public String getEnglishContent() {
        return englishContent;
    }

    public void setEnglishContent(String englishContent) {
        this.englishContent = englishContent;
    }

    public String getPersianContent() {
        return persianContent;
    }

    public void setPersianContent(String persianContent) {
        this.persianContent = persianContent;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public String getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }

    public T getModelClass() {
        return modelClass;
    }

    public void setModelClass(T modelClass) {
        this.modelClass = modelClass;
    }

    public List getModelClassList() {
        return modelClassList;
    }

    public void setModelClassList(List modelClassList) {
        this.modelClassList = modelClassList;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getErrorData() {
        return errorData;
    }

    public void setErrorData(String errorData) {
        this.errorData = errorData;
    }

    public T getResponseModel() {
        return responseModel;
    }

    public void setResponseModel(T responseModel) {
        this.responseModel = responseModel;
    }
}
