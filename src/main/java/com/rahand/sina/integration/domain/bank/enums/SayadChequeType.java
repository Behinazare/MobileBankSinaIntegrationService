package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    NORMAL(1, "NORMAL", "معمولی"),
    BANK(2, "BANK", "بانکی"),
    CIPHERED(3, "CIPHERED", "رمزدار");


    private Integer id;
    private String name;
    private String desc;

    SayadChequeType(Integer id, String name, String desc) {
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

    public static SayadChequeType get(String name) {

        SayadChequeType sayadChequeType;
        try {
            sayadChequeType = SayadChequeType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeType = SayadChequeType.UNKNOWN;
        }
        return sayadChequeType;
    }
}
