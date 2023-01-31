package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class GetCardTransactionsResponse extends BaseResponse {

    private Integer count;
    private List<CardTransactionDto> cardTransactions;

    public GetCardTransactionsResponse() {
    }

    @Builder
    public GetCardTransactionsResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<CardTransactionDto> cardTransactions) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.cardTransactions = cardTransactions;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CardTransactionDto> getCardTransactions() {
        return cardTransactions;
    }

    public void setCardTransactions(List<CardTransactionDto> cardTransactions) {
        this.cardTransactions = cardTransactions;
    }
}
