package com.rahand.sina.integration.domain.digitalpromissorynote.enums;

public enum PromissoryNoteSignStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    UNSIGNED(1, "UNSIGNED", "امضاء نشده"),
    SIGNED(2, "SIGNED", "امضاء شده");

    private Integer id;
    private String name;
    private String desc;

    PromissoryNoteSignStatus(Integer id, String name, String desc) {
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

    public static PromissoryNoteSignStatus get(String name) {

        PromissoryNoteSignStatus promissoryNotePaidStatus;
        try {
            promissoryNotePaidStatus = PromissoryNoteSignStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            promissoryNotePaidStatus = PromissoryNoteSignStatus.UNKNOWN;
        }
        return promissoryNotePaidStatus;
    }


}
