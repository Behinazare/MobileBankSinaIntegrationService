package com.rahand.sina.integration.provider.faraboom.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FaraboomErrorResponse {

    private String refId;
    private List<FaraboomError> errors;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public List<FaraboomError> getErrors() {
        return errors;
    }

    public void setErrors(List<FaraboomError> errors) {
        this.errors = errors;
    }

    public FaraboomErrorResponse() {
    }

    @Builder
    public FaraboomErrorResponse(String refId, List<FaraboomError> errors) {
        this.refId = refId;
        this.errors = errors;
    }

    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FaraboomError{
        private String code;
        private String message;
        private String info;

    }
}
