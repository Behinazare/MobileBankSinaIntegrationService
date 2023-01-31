package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class IssueCardRequest extends BaseRequest {

    private String cif;
    private String depositNumber;
    private String templateId;

    public IssueCardRequest() {
    }

    @Builder
    public IssueCardRequest(String userId, String cif, String depositNumber, String templateId) {
        super(userId);
        this.cif = cif;
        this.depositNumber = depositNumber;
        this.templateId = templateId;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
