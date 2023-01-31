package com.rahand.sina.integration.domain.bank.enums;

public enum LoanValidationType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    CREDITـRATING(1,"CREDITـRATING","استعلام رتبه اعتباری"),
    SAMAT(2,"SAMAT","استعلام تسهیلات و تعهدات"),
    SAMA_CHEQUE(3,"SAMA_CHEQUE","استعلام سوابق چک برگشتی"),
    NEZAM_VAZIFEH(4,"NEZAM_VAZIFEH","استعلام  نظام وظیقه"),
    ANTI_MONEY_LAUNDRY(5,"ANTI_MONEY_LAUNDRY","استعلام مبارزه پولشویی");
    private Integer id;
    private String name;
    private String desc;

    LoanValidationType(Integer id, String name, String desc) {
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

    public static LoanValidationType get(String name) {

        LoanValidationType depositType;
        try {
            depositType = LoanValidationType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            depositType = LoanValidationType.UNKNOWN;
        }
        return depositType;
    }
}
