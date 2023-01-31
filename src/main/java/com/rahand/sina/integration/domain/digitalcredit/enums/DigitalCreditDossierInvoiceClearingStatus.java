package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditDossierInvoiceClearingStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    FULL_SETTLED(1,"FULL_SETTLED","تسویه کامل شده"),
    PARTIAL_SETTLED(2,"PARTIAL_SETTLED","تسویه جزئی شده"),
    NO_SETTLED(3,"NO_SETTLED","تسویه نشده"),
    FULL_SETTLED_STF(4,"FULL_SETTLED_STF","تسویه کامل شده (STF)"),
    SETTLED_BY_LOAN(5,"SETTLED_BY_LOAN","تسویه با افتتاح تسهیلات"),
    FULL_SETTLED_IN_NEXT_CYCLE(6,"FULL_SETTLED_IN_NEXT_CYCLE","تسویه با نقل به دوره بعد"),
    SETTLED_BY_SUSPENDING(7,"SETTLED_BY_SUSPENDING","تسویه با نقل به مطالبات معوق");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditDossierInvoiceClearingStatus(Integer id, String name, String desc) {
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

    public  static DigitalCreditDossierInvoiceClearingStatus get(String name) {

        DigitalCreditDossierInvoiceClearingStatus digitalCreditDossierInvoiceClearingStatus;
        try {
            digitalCreditDossierInvoiceClearingStatus = DigitalCreditDossierInvoiceClearingStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditDossierInvoiceClearingStatus = DigitalCreditDossierInvoiceClearingStatus.UNKNOWN;
        }
        return digitalCreditDossierInvoiceClearingStatus;
    }
}
