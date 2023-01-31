package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class CheckCustomerResponse  extends BaseResponse {

    private boolean customer;

    public CheckCustomerResponse() {
    }

    @Builder
    public CheckCustomerResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean customer) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.customer = customer;
    }

    public boolean isCustomer() {
        return customer;
    }

    public void setCustomer(boolean customer) {
        this.customer = customer;
    }
}
