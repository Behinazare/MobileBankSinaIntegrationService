package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class OpenDepositResponse extends BaseResponse {

    private String referenceId;
    private String id;
    private String depositNumber;
    private OpenDepositInfoDto depositInfo;

    public OpenDepositResponse() {
    }

    @Builder
    public OpenDepositResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String referenceId, String id, String depositNumber, OpenDepositInfoDto depositInfo) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.referenceId = referenceId;
        this.id = id;
        this.depositNumber = depositNumber;
        this.depositInfo = depositInfo;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public OpenDepositInfoDto getDepositInfo() {
        return depositInfo;
    }

    public void setDepositInfo(OpenDepositInfoDto depositInfo) {
        this.depositInfo = depositInfo;
    }
}
