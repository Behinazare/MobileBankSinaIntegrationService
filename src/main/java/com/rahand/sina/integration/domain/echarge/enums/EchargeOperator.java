package com.rahand.sina.integration.domain.echarge.enums;

public enum EchargeOperator {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    MTNI(1,"MTNI","ایرانسل"),
    IRTC(2,"IRTC","همراه اول"),
    RITL(3,"RITL","رایتل");

    private Integer id;
    private String name;
    private String desc;

    EchargeOperator(Integer id, String name, String desc) {
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

    public static EchargeOperator get(String name) {

        EchargeOperator echargeOperator;
        try {
            echargeOperator = EchargeOperator.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            echargeOperator = EchargeOperator.UNKNOWN;
        }
        return echargeOperator;
    }

    public static EchargeOperator getById(Integer id) {


        EchargeOperator echargeOperator;

        switch (id) {
            case 1:
                echargeOperator = MTNI;
                break;
            case 2:
                echargeOperator = IRTC;
                break;
            case 3:
                echargeOperator = RITL;
                break;
            default:
                echargeOperator = UNKNOWN;
        }

        return echargeOperator;
    }
}
