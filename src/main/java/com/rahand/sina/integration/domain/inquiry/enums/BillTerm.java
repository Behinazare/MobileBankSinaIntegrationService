package com.rahand.sina.integration.domain.inquiry.enums;

public enum BillTerm {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    MIDTERM(1, "MIDTERM", "میان دوره"),
    END_TERM(-2, "END_TERM", "پایان دوره");

    private Integer id;
    private String name;
    private String desc;

    BillTerm(Integer id, String name, String desc) {
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

    public static BillTerm get(String name) {

        BillTerm billTerm;
        try {
            billTerm = BillTerm.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            billTerm = BillTerm.UNKNOWN;
        }
        return billTerm;
    }
}
