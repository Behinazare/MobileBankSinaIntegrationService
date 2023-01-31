package com.rahand.sina.integration.domain.bank.enums;

public enum LoanPaymentByDepositMethod {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    AUTO_GET_DEPOSIT(1,"AUTO_GET_DEPOSIT","پرداخت تسهیلات از سپرده پیش فرض"),
    CUSTOM_DEPOSIT(2,"CUSTOM_DEPOSIT","پرداخت تسهیلات از سپرده دلخواه");

    private Integer id;
    private String name;
    private String desc;

    LoanPaymentByDepositMethod(Integer id, String name, String desc) {
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

    public static LoanPaymentByDepositMethod  get(String name) {

        LoanPaymentByDepositMethod loanPaymentByDepositMethod;
        try {
            loanPaymentByDepositMethod = LoanPaymentByDepositMethod.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            loanPaymentByDepositMethod = LoanPaymentByDepositMethod.UNKNOWN;
        }
        return loanPaymentByDepositMethod;
    }
}
