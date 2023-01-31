package com.rahand.sina.integration.domain.bank.enums;

public enum CardPinType {
    UNKNOWN(-1,"UNKNOWN","نامشخص"),

    CARD(1,"CARD","رمزاول کارت"),
    E_PAY(2,"EPAY","رمز دوم کارت");

    private Integer id;
    private String name;
    private String desc;

    CardPinType(Integer id, String name, String desc) {
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

    public static CardPinType  get(String name) {

        CardPinType cardPinType;
        try {
            cardPinType = CardPinType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            cardPinType = CardPinType.UNKNOWN;
        }
        return cardPinType;
    }
}
