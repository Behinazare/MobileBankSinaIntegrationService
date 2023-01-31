package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeLockStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    NOT_LOCKED(1, "NOT_LOCKED", "قفل نمی باشد"),
    IS_LOCKED(2, "IS_LOCKED", "قفل می باشد");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeLockStatus(Integer id, String name, String desc) {
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

    public static SayadChequeLockStatus  get(String name) {

        SayadChequeLockStatus sayadChequeLockStatus;

        try {
            sayadChequeLockStatus = SayadChequeLockStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeLockStatus = SayadChequeLockStatus.UNKNOWN;
        }
        return sayadChequeLockStatus;
    }
}
