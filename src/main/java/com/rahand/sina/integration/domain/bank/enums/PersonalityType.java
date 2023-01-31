package com.rahand.sina.integration.domain.bank.enums;

public enum PersonalityType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    ACTUAL(1, "ACTUAL", "حقیقی"),
    LEGAL(2, "LEGAL", "حقوقی"),
    SPECIAL(3, "SPECIAL", "خاص");


    private Integer id;
    private String name;
    private String desc;

    PersonalityType(Integer id, String name, String desc) {
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

    public static PersonalityType get(String name) {

        PersonalityType depositPersonalityType;
        try {
            depositPersonalityType = PersonalityType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            depositPersonalityType = PersonalityType.UNKNOWN;
        }
        return depositPersonalityType;
    }
}
