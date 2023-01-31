package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

public class LoanOwnerRequest extends BaseRequest {

    private String cif;
    private String loanNumber;
    private String loanIban;

    public LoanOwnerRequest() {
    }

    @Builder
    public LoanOwnerRequest(String userId, String cif, String loanNumber, String loanIban) {
        super(userId);
        this.cif = cif;
        this.loanNumber = loanNumber;
        this.loanIban = loanIban;
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

    public String getLoanIban() {
        return loanIban;
    }

    public void setLoanIban(String loanIban) {
        this.loanIban = loanIban;
    }
}
