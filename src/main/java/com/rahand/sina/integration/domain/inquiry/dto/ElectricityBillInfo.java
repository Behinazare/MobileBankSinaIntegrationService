package com.rahand.sina.integration.domain.inquiry.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ElectricityBillInfo extends BillInfo {

    private String ownerName;
    private String ownerFamily;
    private String fullName;
    private LocalDateTime paymentDeadLine;
    private String persianPaymentDeadLine;
    private LocalDateTime previousReadDate;
    private String persianPreviousReadDate;
    private LocalDateTime currentReadDate;
    private String persianCurrentReadDate;
    private BigDecimal previousDebt;

    public ElectricityBillInfo() {
    }

    @Builder
    public ElectricityBillInfo(boolean paid, BigDecimal amount, String billId, String payId, boolean error, String errorMessage, String ownerName, String ownerFamily, String fullName, LocalDateTime paymentDeadLine, String persianPaymentDeadLine, LocalDateTime previousReadDate, String persianPreviousReadDate, LocalDateTime currentReadDate, String persianCurrentReadDate, BigDecimal previousDebt) {
        super(paid, amount, billId, payId, error, errorMessage);
        this.ownerName = ownerName;
        this.ownerFamily = ownerFamily;
        this.fullName = fullName;
        this.paymentDeadLine = paymentDeadLine;
        this.persianPaymentDeadLine = persianPaymentDeadLine;
        this.previousReadDate = previousReadDate;
        this.persianPreviousReadDate = persianPreviousReadDate;
        this.currentReadDate = currentReadDate;
        this.persianCurrentReadDate = persianCurrentReadDate;
        this.previousDebt = previousDebt;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerFamily() {
        return ownerFamily;
    }

    public void setOwnerFamily(String ownerFamily) {
        this.ownerFamily = ownerFamily;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getPaymentDeadLine() {
        return paymentDeadLine;
    }

    public void setPaymentDeadLine(LocalDateTime paymentDeadLine) {
        this.paymentDeadLine = paymentDeadLine;
    }

    public String getPersianPaymentDeadLine() {
        return persianPaymentDeadLine;
    }

    public void setPersianPaymentDeadLine(String persianPaymentDeadLine) {
        this.persianPaymentDeadLine = persianPaymentDeadLine;
    }

    public LocalDateTime getPreviousReadDate() {
        return previousReadDate;
    }

    public void setPreviousReadDate(LocalDateTime previousReadDate) {
        this.previousReadDate = previousReadDate;
    }

    public String getPersianPreviousReadDate() {
        return persianPreviousReadDate;
    }

    public void setPersianPreviousReadDate(String persianPreviousReadDate) {
        this.persianPreviousReadDate = persianPreviousReadDate;
    }

    public LocalDateTime getCurrentReadDate() {
        return currentReadDate;
    }

    public void setCurrentReadDate(LocalDateTime currentReadDate) {
        this.currentReadDate = currentReadDate;
    }

    public String getPersianCurrentReadDate() {
        return persianCurrentReadDate;
    }

    public void setPersianCurrentReadDate(String persianCurrentReadDate) {
        this.persianCurrentReadDate = persianCurrentReadDate;
    }

    public BigDecimal getPreviousDebt() {
        return previousDebt;
    }

    public void setPreviousDebt(BigDecimal previousDebt) {
        this.previousDebt = previousDebt;
    }

    @Override
    public String getInquiryJson() {

        Map<String, String> inquiryMap = new LinkedHashMap<>();

        inquiryMap.put("نوع قبض", BillType.ELECTRICITY.getDesc());
        inquiryMap.put("نام مشتری", ownerName);
        inquiryMap.put("مبلغ", String.format("%s ریال",NumberFormat.getInstance().format(getAmount().longValue())));
        inquiryMap.put("شناسه قبض", getBillId());
        inquiryMap.put("شناسه پرداخت", getPayId());

        return CommonUtil.toJson(inquiryMap);
    }
}
