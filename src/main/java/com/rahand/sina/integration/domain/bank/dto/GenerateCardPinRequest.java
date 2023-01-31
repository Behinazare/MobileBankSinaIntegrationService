package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.CardPinType;
import lombok.Builder;


public class GenerateCardPinRequest extends BaseRequest {

    private String pan;
    private CardPinType cardPinType;

    public GenerateCardPinRequest() {
    }

    @Builder
    public GenerateCardPinRequest(String userId, String pan, CardPinType cardPinType) {
        super(userId);
        this.pan = pan;
        this.cardPinType = cardPinType;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public CardPinType getCardPinType() {
        return cardPinType;
    }

    public void setCardPinType(CardPinType cardPinType) {
        this.cardPinType = cardPinType;
    }
}
