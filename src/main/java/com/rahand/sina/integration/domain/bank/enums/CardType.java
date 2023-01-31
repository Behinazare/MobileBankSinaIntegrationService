package com.rahand.sina.integration.domain.bank.enums;

public enum CardType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    DEBIT(1,"DEBIT","DEBIT"),
    CREDIT( 2,"CREDIT","اعتباری"),
    GIFT(3,"GIFT","کارت هدیه و بن"),
    CORPORATION(4,"CORPORATION","کارت شرکتی"),
    LOAN(5,"LOAN","کارت تسهیلات"),
    DEPOSIT(6,"DEPOSIT","کارت واریز");


    private Integer id;
    private String name;
    private String desc;

    CardType(Integer id, String name, String desc) {
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

    public static CardType  get(String name) {

        CardType cardType;
        try {
            cardType = CardType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            cardType = CardType.UNKNOWN;
        }
        return cardType;
    }
}
