package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditDossierInvoiceFeeType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    TRANSACTION(1, "TRANSACTION", ""),
    TRANSACTION_PROCESSING(2, "TRANSACTION_PROCESSING", ""),
    SURCHARGE(3, "SURCHARGE", ""),
    SUSPEND_PAY_LATEN(4, "SUSPEND_PAY_LATEN", ""),
    STAMP_TAX(5, "STAMP_TAX", ""),
    UNUSED_CREDIT(6, "UNUSED_CREDIT", ""),
    TRANSFER_TO_NEXT(7, "TRANSFER_TO_NEXT", ""),
    RETURN(8, "RETURN", ""),
    GOOD_AND_SERVICE(9, "GOOD_AND_SERVICE", ""),
    CASH(10, "CASH", ""),
    YEARLY(11, "YEARLY", ""),
    CARD_ISSUE(12, "CARD_ISSUE", ""),
    UN_BLOCK(13, "UN_BLOCK", ""),
    UN_REVOKE(14, "UN_REVOKE", ""),
    CHANGES(15, "CHANGES", ""),
    BILLING(16, "BILLING", ""),
    BILL_TYPE(17, "BILL_TYPE", ""),
    PAY_LATEN(18, "PAY_LATEN", ""),
    INSURANCE(19, "INSURANCE", "");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditDossierInvoiceFeeType(Integer id, String name, String desc) {
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

    public static DigitalCreditDossierInvoiceFeeType get(String name) {

        DigitalCreditDossierInvoiceFeeType digitalCreditDossierInvoiceFeeType;
        try {
            digitalCreditDossierInvoiceFeeType = DigitalCreditDossierInvoiceFeeType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditDossierInvoiceFeeType = DigitalCreditDossierInvoiceFeeType.UNKNOWN;
        }
        return digitalCreditDossierInvoiceFeeType;
    }

}
