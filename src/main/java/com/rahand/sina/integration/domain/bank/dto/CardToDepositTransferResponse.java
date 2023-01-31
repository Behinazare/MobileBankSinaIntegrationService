package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.enums.PaymentTransactionStatus;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.util.BankUtil;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


public class CardToDepositTransferResponse extends BaseResponse {

    private BigDecimal amount;
    private String rrn;
    private String trackNumber;
    private String trackerId;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private Long epochTime;
    private String sourceCard;
    private String destinationDepositNumber;
    private String destinationBankName;
    private PaymentTransactionStatus paymentTransactionStatus;
    private String senderFullName;
    private String receiverFullName;
    private String defaultReceipt;
    private String title;
    private String information;

    public CardToDepositTransferResponse() {
    }

    @Builder
    public CardToDepositTransferResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal amount, String rrn, String trackNumber, String trackerId, LocalDateTime transactionDate, String persianTransactionDate, Long epochTime, String sourceCard, String destinationDepositNumber, String destinationBankName, PaymentTransactionStatus paymentTransactionStatus, String senderFullName, String receiverFullName, String defaultReceipt, String title, String information) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.amount = amount;
        this.rrn = rrn;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.epochTime = epochTime;
        this.sourceCard = sourceCard;
        this.destinationDepositNumber = destinationDepositNumber;
        this.destinationBankName = destinationBankName;
        this.paymentTransactionStatus = paymentTransactionStatus;
        this.senderFullName = senderFullName;
        this.receiverFullName = receiverFullName;
        this.defaultReceipt = defaultReceipt;
        this.title = title;
        this.information = information;
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

    public String getSourceCard() {
        return sourceCard;
    }

    public void setSourceCard(String sourceCard) {
        this.sourceCard = sourceCard;
    }

    public String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }

    public void setDestinationDepositNumber(String destinationDepositNumber) {
        this.destinationDepositNumber = destinationDepositNumber;
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

    public PaymentTransactionStatus getPaymentTransactionStatus() {
        return paymentTransactionStatus;
    }

    public String getDestinationBankName() {
        return destinationBankName;
    }

    public void setDestinationBankName(String destinationBankName) {
        this.destinationBankName = destinationBankName;
    }

    public void setPaymentTransactionStatus(PaymentTransactionStatus paymentTransactionStatus) {
        this.paymentTransactionStatus = paymentTransactionStatus;
    }

    public String getSenderFullName() {
        return senderFullName;
    }

    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getReceipt() {

        Map<String, String> receiptMap = new LinkedHashMap<>();
        receiptMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount())));

        if (title != null) {
            receiptMap.put("عنوان", title);

        }
        if (information != null) {
            receiptMap.put("توضیحات", information);
        }
        receiptMap.put("وضعیت تراکنش", PaymentTransactionStatus.SUCCESSFUL.getDesc());
        receiptMap.put("بانک مبدا", "بانک سینا");
        receiptMap.put("شماره کارت مبدا", BankUtil.maskCardPan(sourceCard));
        receiptMap.put("نام صاحب کارت مبدا", senderFullName);
        receiptMap.put("بانک مقصد", destinationBankName);
        receiptMap.put("شماره سپرده مقصد", BankUtil.maskCardPan(destinationDepositNumber));
        receiptMap.put("نام صاحب سپرده مقصد", receiverFullName);
        receiptMap.put("تاریخ تراکنش", persianTransactionDate);
        receiptMap.put("شماره مرجع", rrn);
        receiptMap.put("شناسه پیگیری", trackerId);

        return CommonUtil.toJson(receiptMap);
    }

}
