package com.rahand.sina.integration.domain.bank.dto;

import lombok.Builder;


public class CreateCustomerJobsDto {

    private String field;
    private String desc;

    public CreateCustomerJobsDto() {
    }

    @Builder
    public CreateCustomerJobsDto(String field, String desc) {
        this.field = field;
        this.desc = desc;
    }



    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
