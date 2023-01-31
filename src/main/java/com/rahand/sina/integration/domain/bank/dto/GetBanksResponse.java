package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class GetBanksResponse extends BaseResponse {

    private Integer count;
    private List<BankInfo> banks;

    public GetBanksResponse() {
    }

    @Builder
    public GetBanksResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<BankInfo> banks) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.banks = banks;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<BankInfo> getBanks() {
        return banks;
    }

    public void setBanks(List<BankInfo> banks) {
        this.banks = banks;
    }
}
