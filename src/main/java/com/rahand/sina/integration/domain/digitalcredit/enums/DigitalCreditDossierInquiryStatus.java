package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditDossierInquiryStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    InqueryFailCheck(1, "InqueryFailCheck", "عدم استعلام"),
    BankLoan(2, "BankLoan", "بدهکار بانکی"),
    ChequeReturned(3, "ChequeReturned", "چک برگشتی"),
    Successed(4, "Successed", "موفق");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditDossierInquiryStatus(Integer id, String name, String desc) {
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

    public static DigitalCreditDossierInquiryStatus get(String name) {

        DigitalCreditDossierInquiryStatus digitalCreditDossierInquiryStatus;
        try {
            digitalCreditDossierInquiryStatus = DigitalCreditDossierInquiryStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditDossierInquiryStatus = DigitalCreditDossierInquiryStatus.UNKNOWN;
        }
        return digitalCreditDossierInquiryStatus;
    }
}
