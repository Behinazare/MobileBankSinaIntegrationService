package com.rahand.sina.integration.domain.bank.enums;

public enum CardActivityType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    TRANSFER(1, "TRANSFER", "انتقال وجه"),
    BILL_PAYMENT(2, "BILL_PAYMENT", "پرداخت قبض"),
    PURCHASE(3, "PURCHASE", "خرید"),
    DEPOSIT(4, "DEPOSIT", "واریز وجه"),
    WITHDRAWAL(5, "WITHDRAWAL", "برداشت وجه"),
    CHARGE_BACK(6, "CHARGE_BACK", "شارژبک"),
    CHANGE_SECOND_PIN(7, "CHANGE_SECOND_PIN", "تغيير رمز دوم"),
    CHANGE_FIRST_PIN(8, "CHANGE_FIRST_PIN", "تغيير رمز"),
    UNBLOCK(9, "UNBLOCK", "رفع مسدودی"),
    CAPTURED(10, "CAPTURED", "ضبط کارت"),
    STATEMENT(11, "STATEMENT", "صورتحساب"),
    BALANCE(12, "BALANCE", "مانده"),
    RETURN(13, "RETURN", "برگشت "),
    OTHER(14, "OTHER", "فعالیت های دیگر"),
    CREDIT_DEBIT(15, "CREDIT_DEBIT", "واریز یا برداشت");

    private Integer id;
    private String name;
    private String desc;

    CardActivityType(Integer id, String name, String desc) {
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

    public static CardActivityType get(String name) {

        CardActivityType cardActivityType;
        try {
            cardActivityType = CardActivityType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            cardActivityType = CardActivityType.UNKNOWN;
        }
        return cardActivityType;
    }
}
