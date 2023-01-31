package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.bank.enums.SayadChequeAcceptanceStatus;
import lombok.Builder;

import java.time.LocalDateTime;

public class SayadChequeTransferHolderDto extends BaseDto {

    private LocalDateTime lastActionDate;
    private String persianLastActionDate;
    private SayadChequeAcceptanceStatus sayadChequeAcceptanceStatus;

    public SayadChequeTransferHolderDto() {
    }

    @Builder
    public SayadChequeTransferHolderDto(LocalDateTime lastActionDate, String persianLastActionDate, SayadChequeAcceptanceStatus sayadChequeAcceptanceStatus) {
        this.lastActionDate = lastActionDate;
        this.persianLastActionDate = persianLastActionDate;
        this.sayadChequeAcceptanceStatus = sayadChequeAcceptanceStatus;
    }

    public LocalDateTime getLastActionDate() {
        return lastActionDate;
    }

    public void setLastActionDate(LocalDateTime lastActionDate) {
        this.lastActionDate = lastActionDate;
    }

    public String getPersianLastActionDate() {
        return persianLastActionDate;
    }

    public void setPersianLastActionDate(String persianLastActionDate) {
        this.persianLastActionDate = persianLastActionDate;
    }

    public SayadChequeAcceptanceStatus getSayadChequeAcceptanceStatus() {
        return sayadChequeAcceptanceStatus;
    }

    public void setSayadChequeAcceptanceStatus(SayadChequeAcceptanceStatus sayadChequeAcceptanceStatus) {
        this.sayadChequeAcceptanceStatus = sayadChequeAcceptanceStatus;
    }
}
