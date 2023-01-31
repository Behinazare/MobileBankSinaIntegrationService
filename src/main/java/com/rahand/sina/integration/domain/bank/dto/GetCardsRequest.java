package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.CardStatus;
import lombok.Builder;


public class GetCardsRequest extends BaseRequest {

    private String cif;
    private String depositNumber;
    private CardStatus cardStatus;
    private String pan;
    private Long length;
    private Long offset;

    private boolean formattedDepositNumber;

    public GetCardsRequest() {
    }

    @Builder
    public GetCardsRequest(String userId, String cif, String depositNumber, CardStatus cardStatus, String pan, Long length, Long offset, boolean formattedDepositNumber) {
        super(userId);
        this.cif = cif;
        this.depositNumber = depositNumber;
        this.cardStatus = cardStatus;
        this.pan = pan;
        this.length = length;
        this.offset = offset;
        this.formattedDepositNumber = formattedDepositNumber;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public boolean isFormattedDepositNumber() {
        return formattedDepositNumber;
    }

    public void setFormattedDepositNumber(boolean formattedDepositNumber) {
        this.formattedDepositNumber = formattedDepositNumber;
    }
}
