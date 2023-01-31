package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;

public class CardStatementsResponse extends BaseResponse {

    private Integer count;
    private List<CardStatement> cardStatements;

    public CardStatementsResponse() {
    }

    @Builder
    public CardStatementsResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<CardStatement> cardStatements) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.cardStatements = cardStatements;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CardStatement> getCardStatements() {
        return cardStatements;
    }

    public void setCardStatements(List<CardStatement> cardStatements) {
        this.cardStatements = cardStatements;
    }
}
