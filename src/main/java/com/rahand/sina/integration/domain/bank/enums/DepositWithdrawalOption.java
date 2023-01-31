package com.rahand.sina.integration.domain.bank.enums;

public enum DepositWithdrawalOption {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    NONE(1,"NONE","غیر قابل برداشت"),
    MASHRUT(2,"MASHRUT","قابل برداشت مشروط"),
    BE_TANHAYEE(3,"BE_TANHAYEE","قابل برداشت به تنهایی");


    private Integer id;
    private String name;
    private String desc;

    DepositWithdrawalOption(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public static DepositWithdrawalOption get(String name) {

        DepositWithdrawalOption depositSupportStatus;
        try {
            depositSupportStatus = DepositWithdrawalOption.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            depositSupportStatus = DepositWithdrawalOption.UNKNOWN;
        }
        return depositSupportStatus;
    }
}
