package com.rahand.sina.integration.domain.inquiry.dto;

import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


public class WaterBillInfo extends BillInfo {

    private BigDecimal totalAmount;
    private String ownerName;
    private String province;
    private String city;
    private String postalCode;
    private String address;
    private String billSerial;
    private LocalDateTime paymentDeadLine;
    private String persianPaymentDeadLine;
    private LocalDateTime previousReadDate;
    private String persianPreviousReadDate;
    private LocalDateTime currentReadDate;
    private String persianCurrentReadDate;
    private BigDecimal tax;
    private BigDecimal previous_debt;
    private Integer totalDay;
    private String info;
    private String extraInfo;

    public WaterBillInfo() {
    }

    @Builder
    public WaterBillInfo(boolean paid, BigDecimal amount, String billId, String payId, boolean error, String errorMessage, BigDecimal totalAmount, String ownerName, String province, String city, String postalCode, String address, String billSerial, LocalDateTime paymentDeadLine, String persianPaymentDeadLine, LocalDateTime previousReadDate, String persianPreviousReadDate, LocalDateTime currentReadDate, String persianCurrentReadDate, BigDecimal tax, BigDecimal previous_debt, Integer totalDay, String info, String extraInfo) {
        super(paid, amount, billId, payId, error, errorMessage);
        this.totalAmount = totalAmount;
        this.ownerName = ownerName;
        this.province = province;
        this.city = city;
        this.postalCode = postalCode;
        this.address = address;
        this.billSerial = billSerial;
        this.paymentDeadLine = paymentDeadLine;
        this.persianPaymentDeadLine = persianPaymentDeadLine;
        this.previousReadDate = previousReadDate;
        this.persianPreviousReadDate = persianPreviousReadDate;
        this.currentReadDate = currentReadDate;
        this.persianCurrentReadDate = persianCurrentReadDate;
        this.tax = tax;
        this.previous_debt = previous_debt;
        this.totalDay = totalDay;
        this.info = info;
        this.extraInfo = extraInfo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBillSerial() {
        return billSerial;
    }

    public void setBillSerial(String billSerial) {
        this.billSerial = billSerial;
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

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getPrevious_debt() {
        return previous_debt;
    }

    public void setPrevious_debt(BigDecimal previous_debt) {
        this.previous_debt = previous_debt;
    }

    public Integer getTotalDay() {
        return totalDay;
    }

    public void setTotalDay(Integer totalDay) {
        this.totalDay = totalDay;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public String getInquiryJson() {

        Map<String, String> inquiryMap = new LinkedHashMap<>();
        inquiryMap.put("نوع قبض", BillType.WATER.getDesc());
        inquiryMap.put("نام مشتری", ownerName);
        inquiryMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount().longValue())));
        inquiryMap.put("شناسه قبض", getBillId());
        inquiryMap.put("شناسه پرداخت", getPayId());

        return CommonUtil.toJson(inquiryMap);
    }
}
