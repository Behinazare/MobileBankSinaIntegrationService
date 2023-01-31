package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditProvider {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    APSAN(1,"APSAN","آپسان");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditProvider(Integer id, String name, String desc) {
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

    public  static DigitalCreditProvider get(String name) {

        DigitalCreditProvider digitalCreditProvider;
        try {
            digitalCreditProvider = DigitalCreditProvider.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditProvider = DigitalCreditProvider.UNKNOWN;
        }
        return digitalCreditProvider;
    }
}
