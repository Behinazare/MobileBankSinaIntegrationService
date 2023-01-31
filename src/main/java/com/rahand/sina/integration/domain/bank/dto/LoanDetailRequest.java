package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.LoanPayStatus;
import lombok.Builder;

public class LoanDetailRequest extends BaseRequest {

    private String cif;
    private String loanNumber;
    private String cbLoanNumber;
    private boolean hasDetail;
    private Long length;
    private Long offset;
    private LoanPayStatus loanPayStatus;

    public LoanDetailRequest() {
    }

    @Builder
    public LoanDetailRequest(String userId, String cif, String loanNumber, String cbLoanNumber, boolean hasDetail, Long length, Long offset, LoanPayStatus loanPayStatus) {
        super(userId);
        this.cif = cif;
        this.loanNumber = loanNumber;
        this.cbLoanNumber = cbLoanNumber;
        this.hasDetail = hasDetail;
        this.length = length;
        this.offset = offset;
        this.loanPayStatus = loanPayStatus;
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

    public String getCbLoanNumber() {
        return cbLoanNumber;
    }

    public void setCbLoanNumber(String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }

    public boolean isHasDetail() {
        return hasDetail;
    }

    public void setHasDetail(boolean hasDetail) {
        this.hasDetail = hasDetail;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public LoanPayStatus getLoanPayStatus() {
        return loanPayStatus;
    }

    public void setLoanPayStatus(LoanPayStatus loanPayStatus) {
        this.loanPayStatus = loanPayStatus;
    }
}
