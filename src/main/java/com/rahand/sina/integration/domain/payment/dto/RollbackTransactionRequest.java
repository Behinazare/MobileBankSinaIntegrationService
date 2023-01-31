package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class RollbackTransactionRequest extends BaseRequest {

    private String referenceId;

    public RollbackTransactionRequest() {
    }

    @Builder
    public RollbackTransactionRequest(String userId, String referenceId) {
        super(userId);
        this.referenceId = referenceId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
}
