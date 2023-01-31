package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeAllowedTransferAction {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    TRANSFER(1, "TRANSFER", "انتقال"),
    TRANSFER_OR_REJECT(2, "TRANSFER_OR_REJECT", "انتقال یا رد انتقال"),
    NO_ACTION(3, "NO_ACTION", "عدم امکان انجام عملیات");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeAllowedTransferAction(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public static SayadChequeAllowedTransferAction  get(String name) {

        SayadChequeAllowedTransferAction sayadChequeAllowedTransferAction;

        try {
            sayadChequeAllowedTransferAction = SayadChequeAllowedTransferAction.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeAllowedTransferAction = SayadChequeAllowedTransferAction.UNKNOWN;
        }
        return sayadChequeAllowedTransferAction;
    }
}
