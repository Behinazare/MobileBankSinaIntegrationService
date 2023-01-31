package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;



public class CustomerSignaturesResponse extends BaseResponse {

    private Integer count;
    private List<CustomerSignatureInfo> customerSignatures;

    public CustomerSignaturesResponse() {
    }

    @Builder
    public CustomerSignaturesResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<CustomerSignatureInfo> customerSignatures) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.customerSignatures = customerSignatures;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CustomerSignatureInfo> getCustomerSignatures() {
        return customerSignatures;
    }

    public void setCustomerSignatures(List<CustomerSignatureInfo> customerSignatures) {
        this.customerSignatures = customerSignatures;
    }
}
