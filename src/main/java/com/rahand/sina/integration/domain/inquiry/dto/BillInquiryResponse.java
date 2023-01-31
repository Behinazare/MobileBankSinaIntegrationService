package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;


public class BillInquiryResponse<T extends BillInfo> extends BaseResponse {

    private boolean paid;
    private T billInfo;
    private String inquiryJson;
    private BillType billType;

    public BillInquiryResponse() {
    }

    public BillInquiryResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, boolean paid, T billInfo, String inquiryJson, BillType billType) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.paid = paid;
        this.billInfo = billInfo;
        this.inquiryJson = inquiryJson;
        this.billType = billType;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public T getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(T billInfo) {
        this.billInfo = billInfo;
    }

    public String getInquiryJson() {
        return inquiryJson;
    }

    public void setInquiryJson(String inquiryJson) {
        this.inquiryJson = inquiryJson;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }
}
