package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import lombok.Builder;

import java.math.BigDecimal;


public class CardBalanceResponse extends BaseResponse {

    private BigDecimal balance;
    private BigDecimal availableBalance;
    private Currency currency;

    public CardBalanceResponse() {
    }

    @Builder
    public CardBalanceResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, BigDecimal balance, BigDecimal availableBalance, Currency currency) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.balance = balance;
        this.availableBalance = availableBalance;
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
