package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.enums.PaymentTransactionStatus;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.util.BankUtil;
import lombok.Builder;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


public class
RtgsTransferResponse extends BaseResponse {

    private BigDecimal amount;
    private Currency currency;

    private String sourceDepositNumber;

    private String serialId;
    private String description;
    private String transferDescription;
    private String factorNumber;
    private String destinationIban;
    private String sourceIban;
    private String receiverFirstName;
    private String receiverLastName;
    private String receiverTelephoneNumber;
    private String receiverFullName;
    private String senderFullName;
    private String destinationBankName;
    private PaymentTransactionStatus transactionStatus;
    private String trackNumber;
    private String trackerId;
    private String rrn;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private String defaultReceipt;
    private String title;
    private String information;

    public RtgsTransferResponse() {
    }


    @Builder
    public RtgsTransferResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal amount, Currency currency, String sourceDepositNumber, String serialId, String description, String transferDescription, String factorNumber, String destinationIban, String sourceIban, String receiverFirstName, String receiverLastName, String receiverTelephoneNumber, String receiverFullName, String senderFullName, String destinationBankName, PaymentTransactionStatus transactionStatus, String trackNumber, String trackerId, String rrn, LocalDateTime transactionDate, String persianTransactionDate, String defaultReceipt, String title, String information) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.amount = amount;
        this.currency = currency;
        this.sourceDepositNumber = sourceDepositNumber;
        this.serialId = serialId;
        this.description = description;
        this.transferDescription = transferDescription;
        this.factorNumber = factorNumber;
        this.destinationIban = destinationIban;
        this.sourceIban = sourceIban;
        this.receiverFirstName = receiverFirstName;
        this.receiverLastName = receiverLastName;
        this.receiverTelephoneNumber = receiverTelephoneNumber;
        this.receiverFullName = receiverFullName;
        this.senderFullName = senderFullName;
        this.destinationBankName = destinationBankName;
        this.transactionStatus = transactionStatus;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.rrn = rrn;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTransferDescription() {
        return transferDescription;
    }

    public void setTransferDescription(String transferDescription) {
        this.transferDescription = transferDescription;
    }

    public String getFactorNumber() {
        return factorNumber;
    }

    public void setFactorNumber(String factorNumber) {
        this.factorNumber = factorNumber;
    }

    public String getDestinationIban() {
        return destinationIban;
    }

    public void setDestinationIban(String destinationIban) {
        this.destinationIban = destinationIban;
    }

    public String getSourceIban() {
        return sourceIban;
    }

    public void setSourceIban(String sourceIban) {
        this.sourceIban = sourceIban;
    }

    public String getReceiverFirstName() {
        return receiverFirstName;
    }

    public void setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    public String getReceiverLastName() {
        return receiverLastName;
    }

    public void setReceiverLastName(String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }

    public String getReceiverTelephoneNumber() {
        return receiverTelephoneNumber;
    }

    public void setReceiverTelephoneNumber(String receiverTelephoneNumber) {
        this.receiverTelephoneNumber = receiverTelephoneNumber;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getSenderFullName() {
        return senderFullName;
    }

    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    public String getDestinationBankName() {
        return destinationBankName;
    }

    public void setDestinationBankName(String destinationBankName) {
        this.destinationBankName = destinationBankName;
    }

    public PaymentTransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(PaymentTransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
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

    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }

    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }

    public String getReceipt() {

        Map<String, String> receiptMap = new LinkedHashMap<>();
        receiptMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(amount)));

        if (title != null) {
            receiptMap.put("عنوان", title);
        }
        if (information != null) {
            receiptMap.put("توضیحات", information);
        }
        receiptMap.put("وضعیت تراکنش",PaymentTransactionStatus.SUCCESSFUL.getDesc());
        receiptMap.put("بانک مبدا", "بانک سینا");
        receiptMap.put("شماره سپرده مبدا", BankUtil.maskDeposit(sourceDepositNumber));
        receiptMap.put("نام صاحب سپرده مبدا", senderFullName);
        receiptMap.put("بانک مقصد", destinationBankName);
        receiptMap.put("شبا مقصد", destinationIban);
        receiptMap.put("نام صاحب شبا مقصد", receiverFullName);
        receiptMap.put("تاریخ تراکنش", persianTransactionDate);
        receiptMap.put("شناسه پیگیری", trackerId);
        receiptMap.put("شماره سریال تراکنش",serialId);

        return CommonUtil.toJson(receiptMap);
    }


}
