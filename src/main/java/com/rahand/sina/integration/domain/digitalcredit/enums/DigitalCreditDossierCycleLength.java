package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditDossierCycleLength {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    INFINITE(1,"INFINITE","نامحدود"),
    BETWEEN_1_79_DAYS(2,"BETWEEN_1_79_DAYS","یک تا 79 روز"),
    WEEKLY(3,"WEEKLY","هفتگی"),
    TOW_WEEKLY(4,"TOW_WEEKLY","دو هفته ای"),
    FIFTEEN_DAYS(5,"FIFTEEN_DAYS","پانزده روز"),
    MONTHLY(6,"MONTHLY","ماهیانه"),
    THREE_MONTHLY(7,"THREE_MONTHLY","سه ماهه"),
    SIX_MONTHLY(8,"SIX_MONTHLY","شش ماهه");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditDossierCycleLength(Integer id, String name, String desc) {
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

    public  static DigitalCreditDossierCycleLength get(String name) {

        DigitalCreditDossierCycleLength digitalCreditDossierCycleLength;
        try {
            digitalCreditDossierCycleLength = DigitalCreditDossierCycleLength.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditDossierCycleLength = DigitalCreditDossierCycleLength.UNKNOWN;
        }
        return digitalCreditDossierCycleLength;
    }
}
