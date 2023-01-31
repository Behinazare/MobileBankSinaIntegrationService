package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class GetCardsResponse extends BaseResponse {

    private Integer count;
    private List<BankCardDto> cards;

    public GetCardsResponse() {
    }

    @Builder
    public GetCardsResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, Integer count, List<BankCardDto> cards) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.count = count;
        this.cards = cards;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<BankCardDto> getCards() {
        return cards;
    }

    public void setCards(List<BankCardDto> cards) {
        this.cards = cards;
    }
}
