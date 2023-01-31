package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class GetDigitalCreditBillDetailedTransactionResponse extends BaseResponse {

   private Integer count;
   private List<DigitalCreditBillDetailedTransactionDto> digitalCreditBillDetailedTransactions;

    public GetDigitalCreditBillDetailedTransactionResponse() {
    }

    @Builder
    public GetDigitalCreditBillDetailedTransactionResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<DigitalCreditBillDetailedTransactionDto> digitalCreditBillDetailedTransactions) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.digitalCreditBillDetailedTransactions = digitalCreditBillDetailedTransactions;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<DigitalCreditBillDetailedTransactionDto> getDigitalCreditBillDetailedTransactions() {
        return digitalCreditBillDetailedTransactions;
    }

    public void setDigitalCreditBillDetailedTransactions(List<DigitalCreditBillDetailedTransactionDto> digitalCreditBillDetailedTransactions) {
        this.digitalCreditBillDetailedTransactions = digitalCreditBillDetailedTransactions;
    }
}
