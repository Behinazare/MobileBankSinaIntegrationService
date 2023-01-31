package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditDossierStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    GENERATED(1, "GENERATED", "تشکیل شده"),
    FEE_PAID(2, "FEE_PAID", "دریافت هزینه شده"),
    APPROVED(3, "APPROVED", "تایید شده"),
    CARD_REQUESTED(4, "CARD_REQUESTED", "درخواست کارت"),

    ACTIVE(5, "ACTIVE", "فعال"),
    BLOCKED(6, "BLOCKED", "مسدود"),
    SETTLEMENT_REQUESTED(7, "SETTLEMENT_REQUESTED", "درخواست تسویه"),
    CLOSED(8, "CLOSED", "بسته شده"),

    EXPIRED(9, "EXPIRED", "منقضی شده"),
    CONTRACT_ISSUED(10, "CONTRACT_ISSUED", "صدور قرارداد"),
    DELETED(11, "DELETED", "حذف شده"),
    TEMPORARY_BLOCKED(12, "TEMPORARY_BLOCKED", "مسدود موقت");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditDossierStatus(Integer id, String name, String desc) {
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

    public static DigitalCreditDossierStatus get(String name) {

        DigitalCreditDossierStatus digitalCreditDossierStatus;
        try {
            digitalCreditDossierStatus = DigitalCreditDossierStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditDossierStatus = DigitalCreditDossierStatus.UNKNOWN;
        }
        return digitalCreditDossierStatus;
    }
}
