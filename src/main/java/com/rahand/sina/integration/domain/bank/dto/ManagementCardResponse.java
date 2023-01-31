package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.common.dto.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ManagementCardResponse extends BaseResponse {

    @JsonProperty("mayCards")
    private MayCards mayCards;

    public ManagementCardResponse() {
    }

    @Builder
    public ManagementCardResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, MayCards mayCards) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.mayCards = mayCards;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MayCards {
        @JsonProperty("sinaBankCards")
        private SinaBankCard sinaBankCard;
        @JsonProperty("otherBanksCards")
        private OtherBankCard otherBankCard;

    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SinaBankCard {
        @JsonProperty("cardsActions")
        private List<ManagementCardRequest.SinaBankCardsAction> sinaBankCardsActions;
        @JsonProperty("cardsList")
        private List<BankCard> bankCards;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherBankCard {
        @JsonProperty("addCardActionProcessKey")
        private String addCardProcessKey;
        @JsonProperty("cardsActions")
        private List<ManagementCardRequest.OtherBankCardsAction> otherBankCardsActions;
        @JsonProperty("cardsList")
        private List<BankCard> bankCards;
    }

    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BankCard {

        @JsonProperty("id")
        private String id;
        @JsonProperty("cardNumber")
        private String cardNumber;
        @JsonProperty("expireDate")
        private String expireDate;
        @JsonProperty("bankName")
        private String bankName;
        @JsonProperty("customerName")
        private String customerName;
        @JsonProperty("bankIcon")
        private String bankIcon;
    }

}
