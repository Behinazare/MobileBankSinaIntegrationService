package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.LoanStatus;
import com.rahand.sina.integration.domain.bank.enums.LoanType;
import lombok.Builder;

public class GetLoansRequest extends BaseRequest {

    private String cif;
    private String cbLoanNumber;
    private String branchCode;
    private Long offset;
    private Long length;
    private String loanTitle;
    private LoanStatus loanStatus;
    private LoanType loanType;
    private Currency currency;

    public GetLoansRequest() {
    }

    @Builder
    public GetLoansRequest(String userId, String cif, String cbLoanNumber, String branchCode, Long offset, Long length, String loanTitle, LoanStatus loanStatus, LoanType loanType, Currency currency) {
        super(userId);
        this.cif = cif;
        this.cbLoanNumber = cbLoanNumber;
        this.branchCode = branchCode;
        this.offset = offset;
        this.length = length;
        this.loanTitle = loanTitle;
        this.loanStatus = loanStatus;
        this.loanType = loanType;
        this.currency = currency;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCbLoanNumber() {
        return cbLoanNumber;
    }

    public void setCbLoanNumber(String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getLoanTitle() {
        return loanTitle;
    }

    public void setLoanTitle(String loanTitle) {
        this.loanTitle = loanTitle;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
