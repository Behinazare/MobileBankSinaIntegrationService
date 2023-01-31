package com.rahand.sina.integration.domain.echarge.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.util.CommonUtil;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


public class BuyChargeResponse extends BaseResponse {

    private BigDecimal amount;
    private BigDecimal chargedAmount;
    private String operatorTitle;
    private String operatorForeignTitle;
    private String rrn;
    private String trackNumber;
    private String trackerId;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private boolean rollbackTransactionError;
    private String defaultReceipt;
    private String title;
    private String information;
    private String mobileNumber;

    public BuyChargeResponse() {
    }

    @Builder
    public BuyChargeResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal amount, BigDecimal chargedAmount, String operatorTitle, String operatorForeignTitle, String rrn, String trackNumber, String trackerId, LocalDateTime transactionDate, String persianTransactionDate, boolean rollbackTransactionError, String defaultReceipt, String title, String information, String mobileNumber) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.amount = amount;
        this.chargedAmount = chargedAmount;
        this.operatorTitle = operatorTitle;
        this.operatorForeignTitle = operatorForeignTitle;
        this.rrn = rrn;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.rollbackTransactionError = rollbackTransactionError;
        this.defaultReceipt = defaultReceipt;
        this.title = title;
        this.information = information;
        this.mobileNumber = mobileNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getChargedAmount() {
        return chargedAmount;
    }

    public void setChargedAmount(BigDecimal chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public String getOperatorTitle() {
        return operatorTitle;
    }

    public void setOperatorTitle(String operatorTitle) {
        this.operatorTitle = operatorTitle;
    }

    public String getOperatorForeignTitle() {
        return operatorForeignTitle;
    }

    public void setOperatorForeignTitle(String operatorForeignTitle) {
        this.operatorForeignTitle = operatorForeignTitle;
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

    public boolean isRollbackTransactionError() {
        return rollbackTransactionError;
    }

    public void setRollbackTransactionError(boolean rollbackTransactionError) {
        this.rollbackTransactionError = rollbackTransactionError;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getDefaultReceipt() {
        return defaultReceipt;
    }

    public void setDefaultReceipt(String defaultReceipt) {
        this.defaultReceipt = defaultReceipt;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getReceipt() {
        Map<String, String> inquiryMap = new LinkedHashMap<>();

        inquiryMap.put("شرح", "خرید شارژ تلفن همراه");
        inquiryMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount().longValue())));
        inquiryMap.put("شماره موبایل", mobileNumber );
        inquiryMap.put("اپراتور", operatorTitle);
        inquiryMap.put("تاریخ تراکنش", getPersianTransactionDate());
        inquiryMap.put("کد پیگیری", trackerId);

        if (isError()) {
            inquiryMap.put("وضعیت", "ناموفق");
            inquiryMap.put("توضیحات", getErrorMessage());

        } else {
            inquiryMap.put("وضعیت تراکنش", "موفق");

        }

        return CommonUtil.toJson(inquiryMap);
    }
}
