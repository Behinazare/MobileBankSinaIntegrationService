package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class DepositCustomersResponse extends BaseResponse {

    private Integer count;
    private List<DepositCustomer> depositCustomers;
    private String openerCustomerCif;
    private String openerCustomerName;

    public DepositCustomersResponse() {
    }

    @Builder
    public DepositCustomersResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<DepositCustomer> depositCustomers, String openerCustomerCif, String openerCustomerName) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.depositCustomers = depositCustomers;
        this.openerCustomerCif = openerCustomerCif;
        this.openerCustomerName = openerCustomerName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<DepositCustomer> getDepositCustomers() {
        return depositCustomers;
    }

    public void setDepositCustomers(List<DepositCustomer> depositCustomers) {
        this.depositCustomers = depositCustomers;
    }

    public String getOpenerCustomerCif() {
        return openerCustomerCif;
    }

    public void setOpenerCustomerCif(String openerCustomerCif) {
        this.openerCustomerCif = openerCustomerCif;
    }

    public String getOpenerCustomerName() {
        return openerCustomerName;
    }

    public void setOpenerCustomerName(String openerCustomerName) {
        this.openerCustomerName = openerCustomerName;
    }
}
