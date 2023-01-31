package com.rahand.sina.integration.domain.bank.enums;

public enum AchTransactionStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    ACCEPTED(1, "ACCEPTED", "از طرف بانک پذیرفته شده"),
    ERROR_GENERAL(2, "ERROR_GENERAL", "خطا رخ داده است");

    private Integer id;
    private String name;
    private String desc;

    AchTransactionStatus(Integer id, String name, String desc) {
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

    public static AchTransactionStatus  get(String name) {

        AchTransactionStatus achTransactionStatus;
        try {
            achTransactionStatus = AchTransactionStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            achTransactionStatus = AchTransactionStatus.UNKNOWN;
        }
        return achTransactionStatus;
    }
}
