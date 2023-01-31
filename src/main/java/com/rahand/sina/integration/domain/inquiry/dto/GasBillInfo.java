package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;


public class GasBillInfo extends BillInfo{

    private String ownerName;

    public GasBillInfo() {
    }

    @Builder
    public GasBillInfo(boolean paid, BigDecimal amount, String billId, String payId, boolean error, String errorMessage, String ownerName) {
        super(paid, amount, billId, payId, error, errorMessage);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String getInquiryJson() {

        Map<String, String> inquiryMap = new LinkedHashMap<>();
        inquiryMap.put("نوع قبض", BillType.GAS.getDesc());
        inquiryMap.put("نام مشتری", ownerName);
        inquiryMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount().longValue())));
        inquiryMap.put("شناسه قبض", getBillId());
        inquiryMap.put("شناسه پرداخت", getPayId());

        return CommonUtil.toJson(inquiryMap);
    }
}
