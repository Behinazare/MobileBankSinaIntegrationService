package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.enums.BillTerm;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;


public class MobileBillInfo extends BillInfo{

    private BillTerm billTerm;
    private String mobileNumber;

    public MobileBillInfo() {
    }

    @Builder
    public MobileBillInfo(boolean paid, BigDecimal amount, String billId, String payId, boolean error, String errorMessage, BillTerm billTerm, String mobileNumber) {
        super(paid, amount, billId, payId, error, errorMessage);
        this.billTerm = billTerm;
        this.mobileNumber = mobileNumber;
    }

    public BillTerm getBillTerm() {
        return billTerm;
    }

    public void setBillTerm(BillTerm billTerm) {
        this.billTerm = billTerm;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String getInquiryJson() {

        Map<String, String> inquiryMap = new LinkedHashMap<>();
        inquiryMap.put("نوع قبض", BillType.MOBILE.getDesc());
        inquiryMap.put("شماره همراه",mobileNumber);
        inquiryMap.put("نوع دوره", billTerm.getDesc());
        inquiryMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount().longValue())));
        inquiryMap.put("شناسه قبض", getBillId());
        inquiryMap.put("شناسه پرداخت", getPayId());

        return CommonUtil.toJson(inquiryMap);
    }
}
