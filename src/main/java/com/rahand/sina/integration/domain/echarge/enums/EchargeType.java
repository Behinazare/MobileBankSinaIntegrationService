package com.rahand.sina.integration.domain.echarge.enums;

public enum EchargeType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    CREDIT(1,"CREDIT","اعتباری"),
    FIXED(2,"FIXED","ثابت"),
    DATA(3,"FIXED","دیتا");

    private Integer id;
    private String name;
    private String desc;

    EchargeType(Integer id, String name, String desc) {
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

    public static EchargeType get(String name) {

        EchargeType echargeType;
        try {
            echargeType = EchargeType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            echargeType = EchargeType.UNKNOWN;
        }
        return echargeType;
    }

    public static EchargeType getById(Integer id) {

        EchargeType echargeType;

        switch (id) {
            case 1:
                echargeType = CREDIT;
                break;
            case 2:
                echargeType = FIXED;
                break;
            case 3:
                echargeType = DATA;
                break;
            default:
                echargeType = UNKNOWN;
        }

        return echargeType;
    }

}
