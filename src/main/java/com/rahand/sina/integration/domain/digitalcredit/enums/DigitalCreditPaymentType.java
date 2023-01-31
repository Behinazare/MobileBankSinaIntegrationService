package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditPaymentType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    Payment(1,"Payment","پرداخت"),
    Refund(1,"Refund","برگشت بخشی از مبلغ"),
    PayCreditBill (1,"PayCreditBill ","پرداخت صورتحساب");



    private Integer id;
    private String name;
    private String desc;

    DigitalCreditPaymentType(Integer id, String name, String desc) {
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

    public  static DigitalCreditPaymentType get(String name) {

        DigitalCreditPaymentType digitalCreditPaymentType;
        try {
            digitalCreditPaymentType = DigitalCreditPaymentType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditPaymentType = DigitalCreditPaymentType.UNKNOWN;
        }
        return digitalCreditPaymentType;
    }
}
