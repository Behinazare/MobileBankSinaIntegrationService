package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditCardType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),

    DEBIT(1, "DEBIT", "بدهکار"),

    CREDIT(2, "CREDIT", "بستانکار");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditCardType(Integer id, String name, String desc) {
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

    public static DigitalCreditCardType get(String name) {

        DigitalCreditCardType digitalCreditCardType;
        try {
            digitalCreditCardType = DigitalCreditCardType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditCardType = DigitalCreditCardType.UNKNOWN;
        }
        return digitalCreditCardType;
    }
}
