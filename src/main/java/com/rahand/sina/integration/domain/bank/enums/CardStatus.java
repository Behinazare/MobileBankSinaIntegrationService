package com.rahand.sina.integration.domain.bank.enums;

public enum CardStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    OK(1,"OK","DEBIT"),
    HOT( 2,"HOT",""),
    WARM(3,"WARM",""),
    BLOCKED(4,"BLOCKED",""),
    CAPTURED(5,"CAPTURED",""),
    INACTIVE(6,"INACTIVE",""),
    SETTLEMENT(7,"SETTLEMENT",""),
    CLOSED(8,"CLOSED","");

    private Integer id;
    private String name;
    private String desc;

    CardStatus(Integer id, String name, String desc) {
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

    public static CardStatus  get(String name) {

        CardStatus cardStatus;
        try {
            cardStatus = CardStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            cardStatus = CardStatus.UNKNOWN;
        }
        return cardStatus;
    }
}
