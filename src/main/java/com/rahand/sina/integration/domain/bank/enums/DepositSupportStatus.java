package com.rahand.sina.integration.domain.bank.enums;

public enum DepositSupportStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    ACCOUNT(1,"ACCOUNT","حساب"),
    DEPOSIT(2,"DEPOSIT","سپرده");


    private Integer id;
    private String name;
    private String desc;

    DepositSupportStatus(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public static DepositSupportStatus get(String name) {

        DepositSupportStatus depositSupportStatus;
        try {
            depositSupportStatus = DepositSupportStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            depositSupportStatus = DepositSupportStatus.UNKNOWN;
        }
        return depositSupportStatus;
    }
}
