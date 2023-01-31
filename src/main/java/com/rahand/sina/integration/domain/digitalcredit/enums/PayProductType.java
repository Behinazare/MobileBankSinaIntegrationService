package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum PayProductType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    INTERNET_PACKAGE(1,"INTERNET_PACKAGE","بسته اینترنت");


    private Integer id;
    private String name;
    private String desc;

    PayProductType(Integer id, String name, String desc) {
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

    public  static PayProductType get(String name) {

        PayProductType payProductType;
        try {
            payProductType = PayProductType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            payProductType = PayProductType.UNKNOWN;
        }
        return payProductType;
    }


    public  static PayProductType getByDesc(String name) {

        PayProductType payProductType;
        if (PayProductType.INTERNET_PACKAGE.desc.equals(name)){
            payProductType = INTERNET_PACKAGE;
        }else {
            payProductType = UNKNOWN;
        }
        return payProductType;
    }

}
