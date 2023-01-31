package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.enums.BillTerm;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class TelephoneBillInfo extends BillInfo{

    private BillTerm billTerm;
    private String telephoneNumber;

    public TelephoneBillInfo() {
    }

    @Builder
    public TelephoneBillInfo(boolean paid, BigDecimal amount, String billId, String payId, boolean error, String errorMessage, BillTerm billTerm) {
        super(paid, amount, billId, payId, error, errorMessage);
        this.billTerm = billTerm;
    }

    public void setBillTerm(BillTerm billTerm) {
        this.billTerm = billTerm;
    }

    public BillTerm getBillTerm() {
        return billTerm;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String getInquiryJson() {
        Map<String, String> inquiryMap = new LinkedHashMap<>();
        inquiryMap.put("نوع قبض", BillType.TELEPHONE.getDesc());
        inquiryMap.put("شماره تلفن",telephoneNumber);
        inquiryMap.put("نوع دوره", billTerm.getDesc());
        inquiryMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount().longValue())));
        inquiryMap.put("شناسه قبض", getBillId());
        inquiryMap.put("شناسه پرداخت", getPayId());

        return CommonUtil.toJson(inquiryMap);
    }
}
