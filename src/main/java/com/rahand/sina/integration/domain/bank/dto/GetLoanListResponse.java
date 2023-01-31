package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

public class GetLoanListResponse extends BaseResponse {

    private BigDecimal usedAverageAmount;
    private BigDecimal activeLoanAmount;
    private BigDecimal UnPayedFacilityAmount;
    private List<LoanInfoDto> loanList;
    private List<UsedLoanDto> usedLoanListInAveragePeriod;
    private String loanListJson;
    private String usedLoanJson;

    public GetLoanListResponse() {
    }

    @Builder
    public GetLoanListResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal usedAverageAmount, BigDecimal activeLoanAmount, BigDecimal unPayedFacilityAmount, List<LoanInfoDto> loanList, List<UsedLoanDto> usedLoanListInAveragePeriod, String loanListJson, String usedLoanJson) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.usedAverageAmount = usedAverageAmount;
        this.activeLoanAmount = activeLoanAmount;
        UnPayedFacilityAmount = unPayedFacilityAmount;
        this.loanList = loanList;
        this.usedLoanListInAveragePeriod = usedLoanListInAveragePeriod;
        this.loanListJson = loanListJson;
        this.usedLoanJson = usedLoanJson;
    }

    public BigDecimal getUsedAverageAmount() {
        return usedAverageAmount;
    }

    public void setUsedAverageAmount(BigDecimal usedAverageAmount) {
        this.usedAverageAmount = usedAverageAmount;
    }

    public BigDecimal getActiveLoanAmount() {
        return activeLoanAmount;
    }

    public void setActiveLoanAmount(BigDecimal activeLoanAmount) {
        this.activeLoanAmount = activeLoanAmount;
    }

    public BigDecimal getUnPayedFacilityAmount() {
        return UnPayedFacilityAmount;
    }

    public void setUnPayedFacilityAmount(BigDecimal unPayedFacilityAmount) {
        UnPayedFacilityAmount = unPayedFacilityAmount;
    }

    public List<LoanInfoDto> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<LoanInfoDto> loanList) {
        this.loanList = loanList;
    }

    public String getLoanListJson() {
        return loanListJson;
    }

    public void setLoanListJson(String loanListJson) {
        this.loanListJson = loanListJson;
    }

    public List<UsedLoanDto> getUsedLoanListInAveragePeriod() {
        return usedLoanListInAveragePeriod;
    }

    public void setUsedLoanListInAveragePeriod(List<UsedLoanDto> usedLoanListInAveragePeriod) {
        this.usedLoanListInAveragePeriod = usedLoanListInAveragePeriod;
    }

    public String getUsedLoanJson() {
        return usedLoanJson;
    }

    public void setUsedLoanJson(String usedLoanJson) {
        this.usedLoanJson = usedLoanJson;
    }
}
