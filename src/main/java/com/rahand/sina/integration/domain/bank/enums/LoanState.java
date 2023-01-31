package com.rahand.sina.integration.domain.bank.enums;

public enum LoanState {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    UNPAID(1,"UNPAID","پرداخت نشده "),
    PAID_INCOMPLETE( 2,"PAID_INCOMPLETE","پرداخت شده ناقص"),
    ACTIVE(3,"ACTIVE","فعال"),
    DOUBTFUL_RECEIPT(4,"DOUBTFUL_RECEIPT","دین حال شده "),
    SETTLEMENT_READY(5,"SETTLEMENT_READY","آماده برای تسویه "),
    FREE(6,"FREE","تسویه شده "),
    OTHER(7,"OTHER","سایر");

    private Integer id;
    private String name;
    private String desc;

    LoanState(Integer id, String name, String desc) {
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

    public static LoanState  get(String name) {

        LoanState loanState;
        try {
            loanState = LoanState.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            loanState = LoanState.UNKNOWN;
        }
        return loanState;
    }
}
