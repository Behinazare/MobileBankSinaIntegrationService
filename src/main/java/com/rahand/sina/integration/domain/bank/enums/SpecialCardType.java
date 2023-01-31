package com.rahand.sina.integration.domain.bank.enums;

public enum SpecialCardType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    GIFT_CARD(1,"GIFT_CARD","کارت هدیه"),
    CHARGEABLE_CARD(2,"CHARGEABLE_CARD","بن کارت");

    private Integer id;
    private String name;
    private String desc;


    SpecialCardType(Integer id, String name, String desc) {
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

    public static SpecialCardType get(String name) {

        SpecialCardType specialCardType;
        try {
            specialCardType = SpecialCardType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            specialCardType = SpecialCardType.UNKNOWN;
        }
        return specialCardType;
    }
}
