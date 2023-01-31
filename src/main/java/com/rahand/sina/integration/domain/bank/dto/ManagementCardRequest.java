package com.rahand.sina.integration.domain.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagementCardRequest {

    private String userId;
    private List<SinaBankCardsAction> sinaBankCardsActions;
    private List<OtherBankCardsAction> otherBankCardsActions;
    private String addCardProcessKey;



    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SinaBankCardsAction{
        private String action;
        private String title;
        private String processKey;
        private Integer order;
        private boolean active;
    }

    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class OtherBankCardsAction{
        private String action;
        private String title;
        private String processKey;
        private Integer order;
        private boolean active;
    }
}
