package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class CustomerAddressResponse extends BaseResponse {

    private Integer count;
    public List<CustomerAddress> customerAddresses;

    public CustomerAddressResponse() {
    }

    @Builder
    public CustomerAddressResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<CustomerAddress> customerAddresses) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.customerAddresses = customerAddresses;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CustomerAddress> getCustomerAddresses() {
        return customerAddresses;
    }

    public void setCustomerAddresses(List<CustomerAddress> customerAddresses) {
        this.customerAddresses = customerAddresses;
    }
}
