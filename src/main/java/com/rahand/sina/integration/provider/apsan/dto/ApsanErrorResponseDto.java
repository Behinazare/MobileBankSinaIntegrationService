package com.rahand.sina.integration.provider.apsan.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rahand.common.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApsanErrorResponseDto extends BaseDto {

    private boolean success;
    private String errorCode;
    private String errorMessage;
    private List<ValidationErrors> validationErrors;

    private String validationErrorMessage;

    public ApsanErrorResponseDto() {
    }

    @Builder
    public ApsanErrorResponseDto(boolean success, String errorCode, String errorMessage, List<ValidationErrors> validationErrors, String validationErrorMessage) {
        this.success = success;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.validationErrors = validationErrors;
        this.validationErrorMessage = validationErrorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<ValidationErrors> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<ValidationErrors> validationErrors) {
        this.validationErrors = validationErrors;
    }

    public String getValidationErrorMessage() {
        return "اطلاعات وارد شده نامعتبر است"; //TODO ... SET ERROR MESSAGE
    }

    public void setValidationErrorMessage(String validationErrorMessage) {
        this.validationErrorMessage = validationErrorMessage;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ValidationErrors {
        private String field;
        private List<String> errors;


    }

}
