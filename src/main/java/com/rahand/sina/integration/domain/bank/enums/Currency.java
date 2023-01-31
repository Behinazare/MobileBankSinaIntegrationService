package com.rahand.sina.integration.domain.bank.enums;

public enum Currency {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    IRR(1,"IRR","ریال");

    private Integer id;
    private String name;
    private String desc;

    Currency(Integer id, String name, String desc) {
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


    public  static Currency get(String name) {

        Currency currency;
        try {
            currency = Currency.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            currency = Currency.UNKNOWN;
        }
        return currency;
    }


}
