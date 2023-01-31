package com.rahand.sina.integration.domain.bank.enums;

public enum LoanPayStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    PAID(1,"PAID","پرداخت شده "),
    NOT_PAID_BEFORE_MATURITY(5,"NOT_PAID_BEFORE_MATURITY","اقساط پرداخت نشده ای که تاریخ پرداخت آن نرسیده است"),
    NOT_PAID_AFTER_MATURITY(6,"NOT_PAID_AFTER_MATURITY","اقساط پرداخت نشده ای که تاریخ پرداخت آن گذشته است");

    private Integer id;
    private String name;
    private String desc;

    LoanPayStatus(Integer id, String name, String desc) {
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

    public static LoanPayStatus  get(String name) {

        LoanPayStatus loanPayStatus;
        try {
            loanPayStatus = LoanPayStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            loanPayStatus = LoanPayStatus.UNKNOWN;
        }
        return loanPayStatus;
    }
}
