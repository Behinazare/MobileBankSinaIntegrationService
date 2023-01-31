package com.rahand.sina.integration.domain.bank.enums;

public enum AchTransferStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    READY_TO_TRANSFER(1,"READY_TO_TRANSFER","آماده برای انجام انتقال وجه"),
    PROCESSED(2,"PROCESSED","انجام شده"),
    SUSPEND(3,"SUSPEND","معلق"),
    CANCEL(4,"CANCEL","لغو شده"),
    WAIT_FOR_CUSTOMER_ACCEPT(5,"WAIT_FOR_CUSTOMER_ACCEPT","منتظر تایید کاربر"),
    WAIT_FOR_BRANCH_ACCEPT(6,"WAIT_FOR_BRANCH_ACCEPT","منتظر تایید شعبه"),
    BRANCH_REJECT(7,"BRANCH_REJECT","برگشت داده شده توسط شعبه");

    private Integer id;
    private String name;
    private String desc;

    AchTransferStatus(Integer id, String name, String desc) {
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

    public static AchTransferStatus  get(String name) {

        AchTransferStatus achTransferStatus;
        try {
            achTransferStatus = AchTransferStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            achTransferStatus = AchTransferStatus.UNKNOWN;
        }
        return achTransferStatus;
    }
}
