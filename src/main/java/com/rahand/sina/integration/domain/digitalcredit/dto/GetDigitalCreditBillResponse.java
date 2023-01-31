package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class GetDigitalCreditBillResponse extends BaseResponse {

    private Integer count;
    private List<DigitalCreditBillDto> digitalCreditBills;

    public GetDigitalCreditBillResponse() {
    }

    @Builder
    public GetDigitalCreditBillResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<DigitalCreditBillDto> digitalCreditBills) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.digitalCreditBills = digitalCreditBills;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<DigitalCreditBillDto> getDigitalCreditBills() {
        return digitalCreditBills;
    }

    public void setDigitalCreditBills(List<DigitalCreditBillDto> digitalCreditBills) {
        this.digitalCreditBills = digitalCreditBills;
    }
}
