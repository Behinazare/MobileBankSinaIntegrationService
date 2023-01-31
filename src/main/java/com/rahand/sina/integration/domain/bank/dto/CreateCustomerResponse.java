package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;


public class CreateCustomerResponse<T> extends BaseResponse {

    private String cif;
    private String referenceId;
    private String id;
    private T customerInfo;

    public CreateCustomerResponse() {
    }

    public CreateCustomerResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String cif, String referenceId, String id, T customerInfo) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.cif = cif;
        this.referenceId = referenceId;
        this.id = id;
        this.customerInfo = customerInfo;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
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

    public T getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(T customerInfo) {
        this.customerInfo = customerInfo;
    }
}
