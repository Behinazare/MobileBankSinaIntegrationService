package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;


public class CreateCustomerImagesDto {

    @JsonProperty("Images")
    private String image;
    @JsonProperty("Type")
    private String type;

    public CreateCustomerImagesDto() {
    }

    @Builder
    public CreateCustomerImagesDto(String image, String type) {
        this.image = image;
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
