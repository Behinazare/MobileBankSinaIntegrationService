package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeAcceptanceStatus {


    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    NO_ACTION(1,"NO_ACTION","تایید یا عدم تاییدی انجام نشده است"),
    REJECTED( 2,"REJECTED","تایید نشده است"),
    ACCEPTED(3,"ACCEPTED","تایید شده است "),
    IN_PROGRESS(4,"IN_PROGRESS","فرآیند تایید توسط مالکان چک کامل نشده است");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeAcceptanceStatus(Integer id, String name, String desc) {
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

    public static SayadChequeAcceptanceStatus  get(String name) {

        SayadChequeAcceptanceStatus sayadChequeAcceptanceStatus;
        try {
            sayadChequeAcceptanceStatus = SayadChequeAcceptanceStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeAcceptanceStatus = SayadChequeAcceptanceStatus.UNKNOWN;
        }
        return sayadChequeAcceptanceStatus;
    }
}
