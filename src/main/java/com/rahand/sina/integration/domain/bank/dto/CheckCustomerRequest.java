package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class CheckCustomerRequest extends BaseRequest {

    String nationalCode;

    public CheckCustomerRequest() {
    }

    @Builder
    public CheckCustomerRequest(String userId, String nationalCode) {
        super(userId);
        this.nationalCode = nationalCode;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
