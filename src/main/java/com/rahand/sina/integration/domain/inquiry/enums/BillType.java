package com.rahand.sina.integration.domain.inquiry.enums;

public enum BillType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    WATER(1, "WATER", "آب"),
    GAS(2, "GAS", "گاز"),
    MOBILE(3, "MOBILE", "موبایل"),
    TELEPHONE(4, "TELEPHONE", "تلفن"),
    ELECTRICITY(5, "ELECTRICITY", "برق"),
    RAHVAR(6, "RAHVAR", "جریمه راهنمایی و رانندگی"),

    OTHER(7, "OTHER", "سایر");


    private Integer id;
    private String name;
    private String desc;

    BillType(Integer id, String name, String desc) {
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

    public static BillType get(String name) {

        BillType billType;
        try {
            billType = BillType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            billType = BillType.UNKNOWN;
        }
        return billType;
    }

    public static BillType getById(Integer id) {

        BillType billType;

        switch (id) {
            case 1:
                billType = WATER;
                break;
            case 2:
                billType = GAS;
                break;
            case 3:
                billType = MOBILE;
                break;
            case 4:
                billType = TELEPHONE;
                break;
            case 5:
                billType = ELECTRICITY;
                break;
            case 6:
                billType = RAHVAR;
                break;
            default:
                billType = UNKNOWN;
        }

        return billType;
    }

}
