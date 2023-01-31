package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeBlockStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    NOT_BLOCKED(1, "NOT_BLOCKED", "مسدود نمی باشد"),
    TEMPORARILY_BLOCKED(2, "TEMPORARILY_BLOCKED", "بطور موقت مسدود است"),
    PERMANENTLY_BLOCKED(3, "PERMANENTLY_BLOCKED", "بطور دائم مسدود است"),
    REMOVED_BLOCKED(4, "REMOVED_BLOCKED", "مسدودی حذف شده است");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeBlockStatus(Integer id, String name, String desc) {
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

    public static SayadChequeBlockStatus  get(String name) {

        SayadChequeBlockStatus sayadChequeBlockStatus;

        try {
            sayadChequeBlockStatus = SayadChequeBlockStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeBlockStatus = SayadChequeBlockStatus.UNKNOWN;
        }
        return sayadChequeBlockStatus;
    }
}
