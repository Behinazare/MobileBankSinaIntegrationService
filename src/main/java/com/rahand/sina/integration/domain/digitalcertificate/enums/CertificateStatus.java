package com.rahand.sina.integration.domain.digitalcertificate.enums;

public enum CertificateStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    PENDING(1, "PENDING", "درحال انتظار"),
    ISSUED(2, "ISSUED", "صادر شده"),
    REMOVED(3, "REMOVED", "حذف شده");


    private Integer id;
    private String name;
    private String desc;

    CertificateStatus(Integer id, String name, String desc) {
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

    public static CertificateStatus get(String name) {

        CertificateStatus certificateStatus;
        try {
            certificateStatus = CertificateStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            certificateStatus = CertificateStatus.UNKNOWN;
        }
        return certificateStatus;
    }
}
