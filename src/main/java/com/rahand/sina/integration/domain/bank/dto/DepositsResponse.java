package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class DepositsResponse extends BaseResponse {

    private List<DepositDto> deposits;

    private Integer count;

    public DepositsResponse() {
    }

    @Builder
    public DepositsResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, List<DepositDto> deposits, Integer count) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.deposits = deposits;
        this.count = count;
    }

    public List<DepositDto> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<DepositDto> deposits) {
        this.deposits = deposits;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
