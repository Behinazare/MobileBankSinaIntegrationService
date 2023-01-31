package com.rahand.sina.integration.domain.bank.enums;

public enum DepositOwnerType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    BE_TANHAYI(1,"BE_TANHAYI","سپرده انفرادی"),
    MOSHTARAK(2,"MOSHTARAK","مشترک");

    private Integer id;
    private String name;
    private String desc;

    DepositOwnerType(Integer id, String name, String desc) {
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

    public static DepositOwnerType get(String name) {

        DepositOwnerType depositOwnerType;
        try {
            depositOwnerType = DepositOwnerType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            depositOwnerType = DepositOwnerType.UNKNOWN;
        }
        return depositOwnerType;
    }
}
