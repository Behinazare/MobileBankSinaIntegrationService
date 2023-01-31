package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

public class LoanOwnerResponse extends BaseResponse {

    private String cif;
    private String identityCode;
    private String ssn;
    private String name;
    private String fatherName;
    private boolean legalCustomer;
    private LocalDateTime date;
    private String persianDate;
    private List<LoanInfo> loansInfo;

    public LoanOwnerResponse() {
    }

    @Builder
    public LoanOwnerResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String cif, String identityCode, String ssn, String name, String fatherName, boolean legalCustomer, LocalDateTime date, String persianDate, List<LoanInfo> loansInfo) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.cif = cif;
        this.identityCode = identityCode;
        this.ssn = ssn;
        this.name = name;
        this.fatherName = fatherName;
        this.legalCustomer = legalCustomer;
        this.date = date;
        this.persianDate = persianDate;
        this.loansInfo = loansInfo;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public boolean isLegalCustomer() {
        return legalCustomer;
    }

    public void setLegalCustomer(boolean legalCustomer) {
        this.legalCustomer = legalCustomer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPersianDate() {
        return persianDate;
    }

    public void setPersianDate(String persianDate) {
        this.persianDate = persianDate;
    }

    public List<LoanInfo> getLoansInfo() {
        return loansInfo;
    }

    public void setLoansInfo(List<LoanInfo> loansInfo) {
        this.loansInfo = loansInfo;
    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class LoanInfo{
        private String loanNumber;
        private String loanIban;
    }
}
