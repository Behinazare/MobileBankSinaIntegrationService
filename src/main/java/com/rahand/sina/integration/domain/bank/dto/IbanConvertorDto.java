package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


public class IbanConvertorDto extends BaseResponse {

    private String userId;
    private String iban;
    private String depositNumber;
    private String cardPan;

    public IbanConvertorDto() {
    }

    @Builder
    public IbanConvertorDto(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String userId, String iban, String depositNumber, String cardPan) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.userId = userId;
        this.iban = iban;
        this.depositNumber = depositNumber;
        this.cardPan = cardPan;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getCardPan() {
        return cardPan;
    }

    public void setCardPan(String cardPan) {
        this.cardPan = cardPan;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
