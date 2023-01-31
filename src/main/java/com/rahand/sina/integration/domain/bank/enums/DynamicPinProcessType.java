package com.rahand.sina.integration.domain.bank.enums;

public enum DynamicPinProcessType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    PAYMENT(1,"PAYMENT","پرداخت"),
    TRANSFER_TO(2,"TRANSFER_TO","انتقال وجه"),
    BALANCE_INQUIRY(3,"BALANCE_INQUIRY","استعلام موجودی"),
    PASSWORD_CONFIRM_REQUEST(4,"PASSWORD_CONFIRM_REQUEST","درخواست تایید رمز کارت"),
    SUMMARY_REQUEST(5,"SUMMARY_REQUEST","درخواست چکیده");

    private Integer id;
    private String name;
    private String desc;

    DynamicPinProcessType(Integer id, String name, String desc) {
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

    public static DynamicPinProcessType get(String name) {

        DynamicPinProcessType dynamicPinProcessType;
        try {
            dynamicPinProcessType = DynamicPinProcessType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            dynamicPinProcessType = DynamicPinProcessType.UNKNOWN;
        }
        return dynamicPinProcessType;
    }
}
