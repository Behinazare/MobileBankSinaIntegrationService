package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

public class ChargeSpecialCardRequest extends BaseRequest {

    private List<SpecialCardInfo> specialCards;
    private String cif;
    private String depositNumber;

    public ChargeSpecialCardRequest() {

    }

    @Builder
    public ChargeSpecialCardRequest(String userId, List<SpecialCardInfo> specialCards, String cif, String depositNumber) {
        super(userId);
        this.specialCards = specialCards;
        this.cif = cif;
        this.depositNumber = depositNumber;
    }

    public List<SpecialCardInfo> getSpecialCards() {
        return specialCards;
    }

    public void setSpecialCards(List<SpecialCardInfo> specialCards) {
        this.specialCards = specialCards;
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

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class SpecialCardInfo{
        private String pan;
        private BigDecimal amount;


    }
}
