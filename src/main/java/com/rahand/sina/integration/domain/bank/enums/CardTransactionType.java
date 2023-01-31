package com.rahand.sina.integration.domain.bank.enums;

public enum CardTransactionType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    CREDIT(1, "CREDIT", "واریز"),
    DEBIT(2, "DEBIT", "برداشت"),
    ACTIVITY(3, "ACTIVITY", "هر عملیات با اهمیت غیر از واریز و برداشت "),
    OTHER(4, "OTHER", "فعالیت های دیگر");

    private Integer id;
    private String name;
    private String desc;

    CardTransactionType(Integer id, String name, String desc) {
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

    public static CardTransactionType get(String name) {

        CardTransactionType cardTransactionType;
        try {
            cardTransactionType = CardTransactionType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            cardTransactionType = CardTransactionType.UNKNOWN;
        }
        return cardTransactionType;
    }
}
