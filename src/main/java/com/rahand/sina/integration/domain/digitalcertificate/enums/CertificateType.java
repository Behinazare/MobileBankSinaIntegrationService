package com.rahand.sina.integration.domain.digitalcertificate.enums;

public enum CertificateType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    ACTUAL(1, "ACTUAL", "حقیقی- متقاضی مستقل"),
    LEGAL(2, "LEGAL", "حقوقی");

    private Integer id;
    private String name;
    private String desc;

    CertificateType(Integer id, String name, String desc) {
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

    public static CertificateType get(String name) {

        CertificateType certificateType;
        try {
            certificateType = CertificateType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            certificateType = CertificateType.UNKNOWN;
        }
        return certificateType;
    }
}
