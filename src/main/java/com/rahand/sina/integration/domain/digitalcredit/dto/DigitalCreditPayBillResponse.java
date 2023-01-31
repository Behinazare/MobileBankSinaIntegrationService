package com.rahand.sina.integration.domain.digitalcredit.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.math.BigDecimal;

public class DigitalCreditPayBillResponse extends BaseResponse {

    private boolean success;

    private BigDecimal payedAmount;

    private String paymentId;

    public DigitalCreditPayBillResponse() {
    }

    @Builder
    public DigitalCreditPayBillResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean success, BigDecimal payedAmount, String paymentId) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.success = success;
        this.payedAmount = payedAmount;
        this.paymentId = paymentId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public BigDecimal getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
