package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeGuaranteeStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    NO_GUARANTEE(1,"NO_GUARANTEE","بدون ضمانت"),
    IN_PROGRESS( 2,"IN_PROGRESS","فرآیند ضمانت در حال انجام است"),
    EXPIRED(3,"EXPIRED","فرآیند ضمانت ناتمام مانده و منقضی شده است"),
    CONFIRMED_BY_ALL(4,"CONFIRMED_BY_ALL","فرآیند ضمانت به اتمام رسیده است و توسط تمام ضمانت کننده ها تایید شده است"),
    REJECTED(5,"REJECTED","فرآیند انجام ضمانت با عدم تایید بعضی از ضمانت کننده ها به اتمام رسیده است");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeGuaranteeStatus(Integer id, String name, String desc) {
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

    public static SayadChequeGuaranteeStatus  get(String name) {

        SayadChequeGuaranteeStatus sayadChequeGuaranteeStatus;
        try {
            sayadChequeGuaranteeStatus = SayadChequeGuaranteeStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeGuaranteeStatus = SayadChequeGuaranteeStatus.UNKNOWN;
        }
        return sayadChequeGuaranteeStatus;
    }
}
