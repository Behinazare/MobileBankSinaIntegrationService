package com.rahand.sina.integration.domain.bank.enums;

public enum DynamicPinProcessDetailParameter {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    PAN(1,"PAN",""),
    MOBILE(2,"MOBILE",""),
    TEXT(3,"TEXT",""),
    DEPOSIT_NUMBER(4,"DEPOSIT_NUMBER",""),
    IBAN(5,"IBAN","");

    private Integer id;
    private String name;
    private String desc;

    DynamicPinProcessDetailParameter(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static DynamicPinProcessDetailParameter get(String name) {

        DynamicPinProcessDetailParameter dynamicPinProcessDetailParameter;
        try {
            dynamicPinProcessDetailParameter = DynamicPinProcessDetailParameter.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            dynamicPinProcessDetailParameter = DynamicPinProcessDetailParameter.UNKNOWN;
        }
        return dynamicPinProcessDetailParameter;
    }
}
