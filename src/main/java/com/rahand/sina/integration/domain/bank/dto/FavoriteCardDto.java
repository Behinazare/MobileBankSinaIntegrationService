package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rahand.common.dto.BaseDto;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FavoriteCardDto extends BaseDto {

    private String cardNumber;
    private String expireDate;
    private String bankName;
    private String customerName;

    private String bankIcon;

    public FavoriteCardDto() {
    }

    @Builder
    public FavoriteCardDto(String cardNumber, String expireDate, String bankName, String customerName, String bankIcon) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.bankName = bankName;
        this.customerName = customerName;
        this.bankIcon = bankIcon;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBankIcon() {
        return bankIcon;
    }

    public void setBankIcon(String bankIcon) {
        this.bankIcon = bankIcon;
    }
}
