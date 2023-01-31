package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.LoanValidationType;
import lombok.Builder;

import java.util.List;

public class LoanValidationRequest extends BaseRequest {

    private String instanceId;
    private String nationalCode;
    private List<LoanValidationType> facilityValidationTypes;
    private String depositNumber;

    public LoanValidationRequest() {
    }

    @Builder
    public LoanValidationRequest(String userId, String instanceId, String nationalCode, List<LoanValidationType> facilityValidationTypes, String depositNumber) {
        super(userId);
        this.instanceId = instanceId;
        this.nationalCode = nationalCode;
        this.facilityValidationTypes = facilityValidationTypes;
        this.depositNumber = depositNumber;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public List<LoanValidationType> getFacilityValidationTypes() {
        return facilityValidationTypes;
    }

    public void setFacilityValidationTypes(List<LoanValidationType> facilityValidationTypes) {
        this.facilityValidationTypes = facilityValidationTypes;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }
}
