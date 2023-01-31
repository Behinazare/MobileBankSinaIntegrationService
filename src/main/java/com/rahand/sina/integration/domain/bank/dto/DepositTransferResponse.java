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


public class DepositTransferResponse extends BaseResponse {

    private BigDecimal amount;
    private String referenceId;
    private BigDecimal commissionAmount;
    private String commissionDepositNumber;
    private Currency commissionCurrency;
    private String senderFullName;
    private String receiverFullName;

    private String destinationBankName;

    private String rrn;
    private String trackNumber;
    private String trackerId;
    private LocalDateTime transactionDate;
    private String persianTransactionDate;
    private PaymentTransactionStatus transactionStatus;
    private String sourceDeposit;
    private String destinationDeposit;
    private String defaultReceipt;
    private String title;
    private String information;

    public DepositTransferResponse() {
    }

    @Builder
    public DepositTransferResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal amount, String referenceId, BigDecimal commissionAmount, String commissionDepositNumber, Currency commissionCurrency, String senderFullName, String receiverFullName, String destinationBankName, String rrn, String trackNumber, String trackerId, LocalDateTime transactionDate, String persianTransactionDate, PaymentTransactionStatus transactionStatus, String sourceDeposit, String destinationDeposit, String defaultReceipt, String title, String information) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.amount = amount;
        this.referenceId = referenceId;
        this.commissionAmount = commissionAmount;
        this.commissionDepositNumber = commissionDepositNumber;
        this.commissionCurrency = commissionCurrency;
        this.senderFullName = senderFullName;
        this.receiverFullName = receiverFullName;
        this.destinationBankName = destinationBankName;
        this.rrn = rrn;
        this.trackNumber = trackNumber;
        this.trackerId = trackerId;
        this.transactionDate = transactionDate;
        this.persianTransactionDate = persianTransactionDate;
        this.transactionStatus = transactionStatus;
        this.sourceDeposit = sourceDeposit;
        this.destinationDeposit = destinationDeposit;
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

    public String getDestinationBankName() {
        return destinationBankName;
    }

    public void setDestinationBankName(String destinationBankName) {
        this.destinationBankName = destinationBankName;
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

    public PaymentTransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(PaymentTransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getSourceDeposit() {
        return sourceDeposit;
    }

    public void setSourceDeposit(String sourceDeposit) {
        this.sourceDeposit = sourceDeposit;
    }

    public String getDestinationDeposit() {
        return destinationDeposit;
    }

    public void setDestinationDeposit(String destinationDeposit) {
        this.destinationDeposit = destinationDeposit;
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
        receiptMap.put("مبلغ", String.format("%s ریال", NumberFormat.getInstance().format(getAmount())));

        if (title != null) {
            receiptMap.put("عنوان", title);
        }
        if (information != null) {
            receiptMap.put("توضیحات", information);
        }

        receiptMap.put("وضعیت تراکنش", PaymentTransactionStatus.SUCCESSFUL.getDesc());
        receiptMap.put("بانک مبدا", "بانک سینا");
        receiptMap.put("سپرده مبدا", BankUtil.maskDeposit(sourceDeposit));
        receiptMap.put("نام صاحب سپرده مبدا", senderFullName);
        receiptMap.put("بانک مقصد",  destinationBankName);
        receiptMap.put("سپرده مقصد", destinationDeposit);
        receiptMap.put("نام صاحب سپرده مقصد", receiverFullName);
        receiptMap.put("تاریخ تراکنش", persianTransactionDate);
        receiptMap.put("شناسه پیگیری", trackerId);
        receiptMap.put("شماره پیگیری بانکی",referenceId);

        return CommonUtil.toJson(receiptMap);
    }

}
