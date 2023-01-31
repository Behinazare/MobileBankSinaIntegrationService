package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeMedia {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    PAPER(1, "PAPER", "کاغذی"),
    DIGITAL(2, "DIGITAL", "دیجیتالی");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeMedia(Integer id, String name, String desc) {
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

    public static SayadChequeMedia  get(String name) {

        SayadChequeMedia sayadChequeMedia;

        try {
            sayadChequeMedia = SayadChequeMedia.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeMedia = SayadChequeMedia.UNKNOWN;
        }
        return sayadChequeMedia;
    }

}
