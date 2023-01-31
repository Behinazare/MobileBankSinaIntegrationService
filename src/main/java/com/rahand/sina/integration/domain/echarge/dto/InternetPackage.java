package com.rahand.sina.integration.domain.echarge.dto;

import lombok.Builder;


public class InternetPackage {

    private String id;
    private String detail;
    private String durationCat;
    private String duration;
    private String price;
    private String description;
    private String operator;

    public InternetPackage() {
    }

    @Builder
    public InternetPackage(String id, String detail, String durationCat, String duration, String price, String description, String operator) {
        this.id = id;
        this.detail = detail;
        this.durationCat = durationCat;
        this.duration = duration;
        this.price = price;
        this.description = description;
        this.operator = operator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDurationCat() {
        return durationCat;
    }

    public void setDurationCat(String durationCat) {
        this.durationCat = durationCat;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
