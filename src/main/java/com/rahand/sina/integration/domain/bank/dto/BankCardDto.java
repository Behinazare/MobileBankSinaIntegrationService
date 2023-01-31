package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import com.rahand.sina.integration.domain.bank.enums.CardStatus;
import com.rahand.sina.integration.domain.bank.enums.CardType;
import lombok.Builder;

import java.time.LocalDateTime;


public class BankCardDto extends BaseDto {

    private String pan;
    private LocalDateTime issueDate;
    private LocalDateTime expireDate;
    private String depositNumber;
    private String customerFirstName;
    private String customerLastname;
    private CardStatus cardStatus;
    private CardType cardType;
    private String persianExpireDate;

    public BankCardDto() {
    }

    @Builder
    public BankCardDto(String pan, LocalDateTime issueDate, LocalDateTime expireDate, String depositNumber, String customerFirstName, String customerLastname, CardStatus cardStatus, CardType cardType, String persianExpireDate) {
        this.pan = pan;
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.depositNumber = depositNumber;
        this.customerFirstName = customerFirstName;
        this.customerLastname = customerLastname;
        this.cardStatus = cardStatus;
        this.cardType = cardType;
        this.persianExpireDate = persianExpireDate;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDateTime getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDateTime expireDate) {
        this.expireDate = expireDate;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastname() {
        return customerLastname;
    }

    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getPersianExpireDate() {
        return persianExpireDate;
    }

    public void setPersianExpireDate(String persianExpireDate) {
        this.persianExpireDate = persianExpireDate;
    }
}
