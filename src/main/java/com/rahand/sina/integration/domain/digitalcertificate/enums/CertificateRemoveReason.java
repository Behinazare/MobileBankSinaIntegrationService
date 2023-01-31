package com.rahand.sina.integration.domain.digitalcertificate.enums;

public enum CertificateRemoveReason {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    KEY_CONCEPTS(1, "KEY_CONCEPTS", "ایطال به خاطر مفاهیم کلیدی"),
    INCOMPATIBILITY(2, "INCOMPATIBILITY", "ابطال به خاطر ناسازگاری");

    private Integer id;
    private String name;
    private String desc;

    CertificateRemoveReason(Integer id, String name, String desc) {
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

    public static CertificateRemoveReason get(String name) {

        CertificateRemoveReason certificateRemoveReason;
        try {
            certificateRemoveReason = CertificateRemoveReason.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            certificateRemoveReason = CertificateRemoveReason.UNKNOWN;
        }
        return certificateRemoveReason;
    }
}
