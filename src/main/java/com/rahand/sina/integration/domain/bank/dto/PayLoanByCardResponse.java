package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.time.LocalDateTime;

public class PayLoanByCardResponse extends BaseResponse {

    private String rrn;
    private String trackingNumber;
    private String sourcePan;
    private LocalDateTime paymentDate;

    private String trackerId;


    public PayLoanByCardResponse() {
    }

    @Builder
    public PayLoanByCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String rrn, String trackingNumber, String sourcePan, LocalDateTime paymentDate, String trackerId) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.rrn = rrn;
        this.trackingNumber = trackingNumber;
        this.sourcePan = sourcePan;
        this.paymentDate = paymentDate;
        this.trackerId = trackerId;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getSourcePan() {
        return sourcePan;
    }

    public void setSourcePan(String sourcePan) {
        this.sourcePan = sourcePan;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }
}
