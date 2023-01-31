package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class ChangeLoanAutoPaymentDepositResponse extends BaseResponse {

    private String loanNumber;
    private String depositNumber;

    public ChangeLoanAutoPaymentDepositResponse() {
    }

    @Builder
    public ChangeLoanAutoPaymentDepositResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String loanNumber, String depositNumber) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.loanNumber = loanNumber;
        this.depositNumber = depositNumber;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }
}
