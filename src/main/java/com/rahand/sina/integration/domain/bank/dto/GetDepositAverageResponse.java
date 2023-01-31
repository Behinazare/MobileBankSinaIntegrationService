package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GetDepositAverageResponse extends BaseResponse {

    private BigDecimal average;
    private LocalDateTime from;
    private LocalDateTime to;

    private String persianFromDate;

    private String persianToDate;

    public GetDepositAverageResponse() {
    }

    @Builder
    public GetDepositAverageResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal average, LocalDateTime from, LocalDateTime to, String persianFromDate, String persianToDate) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.average = average;
        this.from = from;
        this.to = to;
        this.persianFromDate = persianFromDate;
        this.persianToDate = persianToDate;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public String getPersianFromDate() {
        return persianFromDate;
    }

    public void setPersianFromDate(String persianFromDate) {
        this.persianFromDate = persianFromDate;
    }

    public String getPersianToDate() {
        return persianToDate;
    }

    public void setPersianToDate(String persianToDate) {
        this.persianToDate = persianToDate;
    }
}
