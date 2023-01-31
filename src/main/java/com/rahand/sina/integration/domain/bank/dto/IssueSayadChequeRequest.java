package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class IssueSayadChequeRequest extends BaseRequest {

    private String cif;
    private String seriesNumber;
    private String serialNumber;
    private BigDecimal amount;
    private String sayadId;
    private String reasonCode;
    private String destinationIban;
    private String description;
    private LocalDateTime dueDate;
    private List<SayadChequeReceiverDto> receivers;

    public IssueSayadChequeRequest() {
    }

    @Builder
    public IssueSayadChequeRequest(String userId, String cif, String seriesNumber, String serialNumber, BigDecimal amount, String sayadId, String reasonCode, String destinationIban, String description, LocalDateTime dueDate, List<SayadChequeReceiverDto> receivers) {
        super(userId);
        this.cif = cif;
        this.seriesNumber = seriesNumber;
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.sayadId = sayadId;
        this.reasonCode = reasonCode;
        this.destinationIban = destinationIban;
        this.description = description;
        this.dueDate = dueDate;
        this.receivers = receivers;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSayadId() {
        return sayadId;
    }

    public void setSayadId(String sayadId) {
        this.sayadId = sayadId;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getDestinationIban() {
        return destinationIban;
    }

    public void setDestinationIban(String destinationIban) {
        this.destinationIban = destinationIban;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public List<SayadChequeReceiverDto> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<SayadChequeReceiverDto> receivers) {
        this.receivers = receivers;
    }
}
