package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;



public class BillInquiryRequest extends BaseRequest {

    private BillType billType;
    private String billId;
    private String payId;
    private boolean midterm;

    public BillInquiryRequest() {
    }

    @Builder
    public BillInquiryRequest(String userId, BillType billType, String billId, String payId, boolean midterm) {
        super(userId);
        this.billType = billType;
        this.billId = billId;
        this.payId = payId;
        this.midterm = midterm;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
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

    public boolean isMidterm() {
        return midterm;
    }

    public void setMidterm(boolean midterm) {
        this.midterm = midterm;
    }
}
