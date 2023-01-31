package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum CreateDigitalCreditDossierStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    Incomplete(1, "Incomplete", "تکمیل نشده"),
    PendingPayment(2, "PendingPayment", "در انتظار پرداخت"),
    PendingCheck(3, "PendingCheck", "در انتظار بررسی"),
    Checking(4, "Checking", "در حال بررسی"),
    NeedChange(5, "NeedChange", "نیازمند اصلاح"),
    Reject(6, "Reject", "مردود"),
    InProgress(7, "InProgress", "در حال پردازش"),
    Approved(8, "Approved", "تایید شده"),
    Completed(9, "Completed", "تکمیل شده"),
    DossierCreated(10, "DossierCreated", "پرونده ایجاد شده");

    private Integer id;
    private String name;
    private String desc;

    CreateDigitalCreditDossierStatus(Integer id, String name, String desc) {
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

    public  static CreateDigitalCreditDossierStatus get(String name) {

        CreateDigitalCreditDossierStatus createDigitalCreditDossierStatus;
        try {
            createDigitalCreditDossierStatus = CreateDigitalCreditDossierStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            createDigitalCreditDossierStatus = CreateDigitalCreditDossierStatus.UNKNOWN;
        }
        return createDigitalCreditDossierStatus;
    }
}
