package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.bank.enums.LoanPayStatus;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class InstallmentInfoDto extends BaseDto {

    private LocalDateTime payDate;
    private String persianDate;
    private Integer delayDay;
    private BigDecimal payedAmount;
    private BigDecimal penaltyAmount;
    private BigDecimal unpaidAmount;
    private LoanPayStatus loanPayStatus;

    public InstallmentInfoDto() {
    }

    @Builder
    public InstallmentInfoDto(LocalDateTime payDate, String persianDate, Integer delayDay, BigDecimal payedAmount, BigDecimal penaltyAmount, BigDecimal unpaidAmount, LoanPayStatus loanPayStatus) {
        this.payDate = payDate;
        this.persianDate = persianDate;
        this.delayDay = delayDay;
        this.payedAmount = payedAmount;
        this.penaltyAmount = penaltyAmount;
        this.unpaidAmount = unpaidAmount;
        this.loanPayStatus = loanPayStatus;
    }

    public LocalDateTime getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDateTime payDate) {
        this.payDate = payDate;
    }

    public String getPersianDate() {
        return persianDate;
    }

    public void setPersianDate(String persianDate) {
        this.persianDate = persianDate;
    }

    public Integer getDelayDay() {
        return delayDay;
    }

    public void setDelayDay(Integer delayDay) {
        this.delayDay = delayDay;
    }

    public BigDecimal getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
    }

    public BigDecimal getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(BigDecimal penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public BigDecimal getUnpaidAmount() {
        return unpaidAmount;
    }

    public void setUnpaidAmount(BigDecimal unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public LoanPayStatus getLoanPayStatus() {
        return loanPayStatus;
    }

    public void setLoanPayStatus(LoanPayStatus loanPayStatus) {
        this.loanPayStatus = loanPayStatus;
    }
}
