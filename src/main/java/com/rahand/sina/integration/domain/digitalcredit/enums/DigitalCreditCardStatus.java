package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditCardStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    OK(1, "OK", "فعال"),
    HOT(2, "OK", "سوخته"),
    BLOCKED(3, "BLOCKED", "مسدود دائم"),
    EXPIRED(4, "EXPIRED", "منقضی شده"),
    INACTIVE(5, "INACTIVE", "غیر فعال"),
    SETTLEMENT(6, "SETTLEMENT", "تسویه شده"),
    CLOSED(7, "CLOSED", "بسته");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditCardStatus(Integer id, String name, String desc) {
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

    public static DigitalCreditCardStatus get(String name) {

        DigitalCreditCardStatus digitalCreditCardStatus;
        try {
            digitalCreditCardStatus = DigitalCreditCardStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditCardStatus = DigitalCreditCardStatus.UNKNOWN;
        }
        return digitalCreditCardStatus;
    }
}
