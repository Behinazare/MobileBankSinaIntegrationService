package com.rahand.sina.integration.domain.payment.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rahand.common.dto.BaseResponse;
import com.rahand.common.enums.PaymentMethod;
import com.rahand.common.enums.PaymentTransactionStatus;
import com.rahand.common.util.CommonUtil;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentResponse extends BaseResponse {

    private PaymentTransactionStatus paymentTransactionStatus;
    private String source;
    private BigDecimal amount;
    private String trackNumber;
    private String trackerId;
    private String rrn;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private String defaultReceipt;
    private String title;
    private String information;
    private PaymentMethod paymentMethod;

    private String message;

    public PaymentResponse() {
    }


    @Builder
    public PaymentResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, PaymentTransactionStatus paymentTransactionStatus, String source, BigDecimal amount, String trackNumber, String trackerId, String rrn, LocalDateTime transactionDate, String persianTransactionDate, String defaultReceipt, String title, String information, PaymentMethod paymentMethod, String message) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.paymentTransactionStatus = paymentTransactionStatus;
        this.source = source;
        this.amount = amount;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.rrn = rrn;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.defaultReceipt = defaultReceipt;
        this.title = title;
        this.information = information;
        this.paymentMethod = paymentMethod;
        this.message = message;
    }

    public PaymentTransactionStatus getPaymentTransactionStatus() {
        return paymentTransactionStatus;
    }

    public void setPaymentTransactionStatus(PaymentTransactionStatus paymentTransactionStatus) {
        this.paymentTransactionStatus = paymentTransactionStatus;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
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

    public String getDefaultReceipt() {
        return defaultReceipt;
    }

    public void setDefaultReceipt(String defaultReceipt) {
        this.defaultReceipt = defaultReceipt;
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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceipt() {

        Map<String, String> receiptMap = new LinkedHashMap<>();
        receiptMap.put("وضعیت تراکنش",PaymentTransactionStatus.SUCCESSFUL.getDesc());
        receiptMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount())));

        if (title != null) {
            receiptMap.put("عنوان تراکنش", title);

        }
        if (information != null) {
            receiptMap.put("توضیحات", information);

        }
        receiptMap.put("تاریخ تراکنش", persianTransactionDate);
        receiptMap.put("کد پیگیری", trackNumber);
        receiptMap.put("شناسه تراکنش",trackerId);
        receiptMap.put("شماره مرجع", rrn);
        receiptMap.put("روش پرداخت", paymentMethod.getDesc());


        return CommonUtil.toJson(receiptMap);
    }
}
