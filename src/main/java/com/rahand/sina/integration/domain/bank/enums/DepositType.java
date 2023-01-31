package com.rahand.sina.integration.domain.bank.enums;

public enum DepositType {


    UNKNOWN(-1, "UNKNOWN", "نامشخص"),

    SHORT_ACCOUNT(1, "SHORT_ACCOUNT", "کوتاه مدت"),
    LONG_ACCOUNT(2, "LONG_ACCOUNT", "بلند مدت"),
    SPECIAL_SHORT_ACCOUNT(3, "SPECIAL_SHORT_ACCOUNT", "کوتاه مدت ویژه"),
    SPECIAL_LONG_ACCOUNT(4, "SPECIAL_LONG_ACCOUNT", "بلتد مدت ویژه"),
    JARI_ACCOUNT(5, "JARI_ACCOUNT", "جاری"),
    PASANDAZ_ACCOUNT(6, "PASANDAZ", "پس انداز"),
    PASANDAZ(7, "PASANDAZ", "پس انداز"),
    ANDOKHTE_ACCOUNT(8, "ANDOKHTE_ACCOUNT", "اندوخته"),
    EDARE_SHODE_ACCOUNT(9, "EDARE_SHODE", "اداره شده"),
    EDARE_SHODE(10, "EDARE_SHODE", "اداره شده"),
    OTHERS_ACCOUNT(11, "OTHERS", "سایر"),
    OTHERS(12, "OTHERS", "سایر");

    private Integer id;
    private String name;
    private String desc;

    DepositType(Integer id, String name, String desc) {
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

    public static DepositType get(String name) {

        DepositType depositType;
        try {
            depositType = DepositType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            depositType = DepositType.UNKNOWN;
        }
        return depositType;
    }
}
