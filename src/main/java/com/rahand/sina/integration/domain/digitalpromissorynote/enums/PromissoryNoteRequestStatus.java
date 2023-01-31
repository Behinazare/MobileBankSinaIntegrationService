package com.rahand.sina.integration.domain.digitalpromissorynote.enums;

public enum PromissoryNoteRequestStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    INITIAL(1, "INITIAL", "ثبت اولیه"),
    FINAL(2, "FINAL", "ثبت نهایی");

    private Integer id;
    private String name;
    private String desc;

    PromissoryNoteRequestStatus(Integer id, String name, String desc) {
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

    public static PromissoryNoteRequestStatus get(String name) {

        PromissoryNoteRequestStatus promissoryNoteRequestStatus;
        try {
            promissoryNoteRequestStatus = PromissoryNoteRequestStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            promissoryNoteRequestStatus = PromissoryNoteRequestStatus.UNKNOWN;
        }
        return promissoryNoteRequestStatus;
    }
}
