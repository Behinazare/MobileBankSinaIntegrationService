package com.rahand.sina.integration.domain.payment.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


public class PayBillByCardResponse extends BaseResponse {

    private BigDecimal amount;
    private String rrn;
    private String trackNumber;
    private String trackerId;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private Long epochTime;
    private String billId;
    private String payId;
    private String billTitle;
    private BillType billType;

    private String mobileNumber;

    private String telephoneNumber;

    public PayBillByCardResponse() {
    }

    @Builder
    public PayBillByCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal amount, String rrn, String trackNumber, String trackerId, LocalDateTime transactionDate, String persianTransactionDate, Long epochTime, String billId, String payId, String billTitle, BillType billType, String mobileNumber, String telephoneNumber) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.amount = amount;
        this.rrn = rrn;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.epochTime = epochTime;
        this.billId = billId;
        this.payId = payId;
        this.billTitle = billTitle;
        this.billType = billType;
        this.mobileNumber = mobileNumber;
        this.telephoneNumber = telephoneNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getPersianTransactionDate() {
        return persianTransactionDate;
    }

    public void setPersianTransactionDate(String persianTransactionDate) {
        this.persianTransactionDate = persianTransactionDate;
    }

    public Long getEpochTime() {
        return epochTime;
    }

    public void setEpochTime(Long epochTime) {
        this.epochTime = epochTime;
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

    public String getBillTitle() {
        return billTitle;
    }

    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getPayBillReceipt() {

        Map<String, String> billReceipt = new LinkedHashMap<>();

        billReceipt.put("شرح", " پرداخت قبوض خدماتی");
        billReceipt.put("نوع قبض", getBillTitle());

        if (billType.equals(BillType.MOBILE)){
            billReceipt.put("شماره همراه", mobileNumber);
        }

        if (billType.equals(BillType.TELEPHONE)){
            billReceipt.put("شماره تلفن", telephoneNumber);
        }

        billReceipt.put("شناسه قبض", getBillId());
        billReceipt.put("تاریخ تراکنش", getPersianTransactionDate());
        billReceipt.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount().longValue())));
        billReceipt.put("وضعیت تراکنش", "موفق");

        return CommonUtil.toJson(billReceipt);
    }
}
