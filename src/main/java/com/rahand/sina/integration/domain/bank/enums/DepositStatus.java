package com.rahand.sina.integration.domain.bank.enums;

public enum DepositStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    OPEN(1,"OPEN","باز"),
    CLOSE(2,"CLOSE","بسته"),
    BLOCK(3,"BLOCK","مسدود"),
    OLD(4,"OLD","قدیمی"),
    RESTING(5,"RESTING","راکد"),
    OPENING(6,"OPENING",""),
    NEGATIVE_BLOCK(7,"NEGATIVE_BLOCK",""),
    POSITIVE_BLOCK(8,"POSITIVE_BLOCK","");


    private Integer id;
    private String name;
    private String desc;

    DepositStatus(Integer id, String name, String desc) {
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


    public static DepositStatus get(String name) {

        DepositStatus depositStatus;
        try {
            depositStatus = DepositStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            depositStatus = DepositStatus.UNKNOWN;
        }
        return depositStatus;
    }
}
