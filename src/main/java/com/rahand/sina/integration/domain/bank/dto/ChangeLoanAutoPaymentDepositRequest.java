package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class ChangeLoanAutoPaymentDepositRequest extends BaseRequest {

    private String cif;
    private String loanNumber;
    private String depositNumber;

    public ChangeLoanAutoPaymentDepositRequest() {
    }

    @Builder
    public ChangeLoanAutoPaymentDepositRequest(String userId, String cif, String loanNumber, String depositNumber) {
        super(userId);
        this.cif = cif;
        this.loanNumber = loanNumber;
        this.depositNumber = depositNumber;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
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
