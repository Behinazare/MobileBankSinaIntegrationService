package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.util.CommonUtil;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;


public class BillInfo {

    private boolean paid;
    private BigDecimal amount;
    private String billId;
    private String payId;
    @JsonIgnore
    private boolean error;
    @JsonIgnore
    private String errorMessage;

    public BillInfo() {
    }

    public BillInfo(boolean paid, BigDecimal amount, String billId, String payId, boolean error, String errorMessage) {
        this.paid = paid;
        this.amount = amount;
        this.billId = billId;
        this.payId = payId;
        this.error = error;
        this.errorMessage = errorMessage;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getInquiryJson() {

        Map<String, String> inquiryMap = new LinkedHashMap<>();


        return CommonUtil.toJson(inquiryMap);
    }
}
