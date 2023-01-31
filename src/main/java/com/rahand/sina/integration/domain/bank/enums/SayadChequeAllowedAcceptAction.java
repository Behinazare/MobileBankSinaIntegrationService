package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeAllowedAcceptAction {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    ACCEPT_OR_REJECT(1, "ACCEPT_OR_REJECT", "رد یا تایید"),
    NO_ACTION(2, "NO_ACTION", "عدم امکان انجام عملیات");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeAllowedAcceptAction(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public static SayadChequeAllowedAcceptAction  get(String name) {

        SayadChequeAllowedAcceptAction sayadChequeAllowedAcceptAction;

        try {
            sayadChequeAllowedAcceptAction = SayadChequeAllowedAcceptAction.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeAllowedAcceptAction = SayadChequeAllowedAcceptAction.UNKNOWN;
        }
        return sayadChequeAllowedAcceptAction;
    }


}
