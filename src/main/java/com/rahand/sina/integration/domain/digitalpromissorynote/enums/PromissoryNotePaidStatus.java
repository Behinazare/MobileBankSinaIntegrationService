package com.rahand.sina.integration.domain.digitalpromissorynote.enums;

public enum PromissoryNotePaidStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    PENDING(1, "PENDING", "درحال انتظار"),
    PAID(2, "PAID", "پرداخت شده");

    private Integer id;
    private String name;
    private String desc;

    PromissoryNotePaidStatus(Integer id, String name, String desc) {
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

    public static PromissoryNotePaidStatus get(String name) {

        PromissoryNotePaidStatus promissoryNotePaidStatus;
        try {
            promissoryNotePaidStatus = PromissoryNotePaidStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            promissoryNotePaidStatus = PromissoryNotePaidStatus.UNKNOWN;
        }
        return promissoryNotePaidStatus;
    }
}
