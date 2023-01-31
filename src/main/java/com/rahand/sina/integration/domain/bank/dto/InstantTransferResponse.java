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


public class InstantTransferResponse extends BaseResponse {

    private BigDecimal amount;
    private String referenceId;
    private String receiverFullName;
    private String destinationIban;
    private String sourceDepositNumber;
    private String senderFullName;
    private PaymentTransactionStatus transactionStatus;
    private String trackNumber;
    private String trackerId;
    private String rrn;

    private BigDecimal commissionAmount;
    private String commissionDepositNumber;
    private Currency commissionCurrency;
    private String destinationBankName;
    private String destinationBankCode;

    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private String defaultReceipt;
    private String title;
    private String information;

    public InstantTransferResponse() {
    }

    @Builder
    public InstantTransferResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal amount, String referenceId, String receiverFullName, String destinationIban, String sourceDepositNumber, String senderFullName, PaymentTransactionStatus transactionStatus, String trackNumber, String trackerId, String rrn, BigDecimal commissionAmount, String commissionDepositNumber, Currency commissionCurrency, String destinationBankName, String destinationBankCode, LocalDateTime transactionDate, String persianTransactionDate, String defaultReceipt, String title, String information) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.amount = amount;
        this.referenceId = referenceId;
        this.receiverFullName = receiverFullName;
        this.destinationIban = destinationIban;
        this.sourceDepositNumber = sourceDepositNumber;
        this.senderFullName = senderFullName;
        this.transactionStatus = transactionStatus;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.rrn = rrn;
        this.commissionAmount = commissionAmount;
        this.commissionDepositNumber = commissionDepositNumber;
        this.commissionCurrency = commissionCurrency;
        this.destinationBankName = destinationBankName;
        this.destinationBankCode = destinationBankCode;
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

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    public void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getDestinationIban() {
        return destinationIban;
    }

    public void setDestinationIban(String destinationIban) {
        this.destinationIban = destinationIban;
    }

    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }

    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }

    public String getSenderFullName() {
        return senderFullName;
    }

    public void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
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

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getCommissionDepositNumber() {
        return commissionDepositNumber;
    }

    public void setCommissionDepositNumber(String commissionDepositNumber) {
        this.commissionDepositNumber = commissionDepositNumber;
    }

    public Currency getCommissionCurrency() {
        return commissionCurrency;
    }

    public void setCommissionCurrency(Currency commissionCurrency) {
        this.commissionCurrency = commissionCurrency;
    }

    public String getDestinationBankName() {
        return destinationBankName;
    }

    public void setDestinationBankName(String destinationBankName) {
        this.destinationBankName = destinationBankName;
    }

    public String getDestinationBankCode() {
        return destinationBankCode;
    }

    public void setDestinationBankCode(String destinationBankCode) {
        this.destinationBankCode = destinationBankCode;
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

    public String getReceipt() {

        Map<String, String> receiptMap = new LinkedHashMap<>();
        receiptMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(amount)));

        if (title != null) {
            receiptMap.put("عنوان", title);
        }
        if (information != null) {
            receiptMap.put("توضیحات", information);
        }
        receiptMap.put("وضعیت تراکنش", PaymentTransactionStatus.SUCCESSFUL.getDesc());
        receiptMap.put("بانک مبدا", "بانک سینا");
        receiptMap.put("شماره سپرده مبدا", BankUtil.maskDeposit(sourceDepositNumber));
        receiptMap.put("نام صاحب سپرده مبدا", senderFullName);
        receiptMap.put("بانک مقصد", destinationBankName);
        receiptMap.put("شبا مقصد", destinationIban);
        receiptMap.put("نام صاحب شبا مقصد", receiverFullName);
        receiptMap.put("تاریخ تراکنش", persianTransactionDate);
        receiptMap.put("شناسه پیگیری", trackerId);
        receiptMap.put("شماره پیگیری انتقال وجه پایا",referenceId);

        return CommonUtil.toJson(receiptMap);
    }
}
