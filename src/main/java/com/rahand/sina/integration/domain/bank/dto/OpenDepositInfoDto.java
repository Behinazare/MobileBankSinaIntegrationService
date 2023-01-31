package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;


@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenDepositInfoDto {

    @JsonProperty("CustomerNumber")
    private String cif;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("OpenDate")
    private String openDate;
    @JsonProperty("ExpireDate")
    private String expireDate;
    @JsonProperty("Currency")
    private String currency;

    public OpenDepositInfoDto() {
    }

    @Builder
    public OpenDepositInfoDto(String cif, String title, String openDate, String expireDate, String currency) {
        this.cif = cif;
        this.title = title;
        this.openDate = openDate;
        this.expireDate = expireDate;
        this.currency = currency;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
