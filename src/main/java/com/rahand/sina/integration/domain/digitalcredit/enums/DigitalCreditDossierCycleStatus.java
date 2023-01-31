package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditDossierCycleStatus {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    CLOSE(1,"CLOSE","بسته"),
    OPEN(2,"OPEN","باز"),
    CLOSE_OUT_OF_BALANCE(3,"CLOSE_OUT_OF_BALANCE","بسته - مغایرت دارد"),
    CLOSE_IN_BALANCE(4,"CLOSE_IN_BALANCE","بسته - منطبق است"),
    CLOSE_MANUALLY_IN_BALANCE(5,"CLOSE_MANUALLY_IN_BALANCE","بسته - رفع مغایرت شده"),
    CLOSE_BATCH_ID_CONFLICT(6,"CLOSE_BATCH_ID_CONFLICT","بسته - عدم انطباق شماره دسته گردش"),
    ISSUE_STATEMENT(7,"ISSUE_STATEMENT","صدور صورتحساب"),
    OPEN_LOAN(8,"OPEN_LOAN","افتتاح تسهیلات"),
    TRANSFER_TO_NEXT(9,"TRANSFER_TO_NEXT","نقل به دوره بعد"),
    OPEN_LOAN_FOR_ORIGINAL_AMOUNT(10,"OPEN_LOAN_FOR_ORIGINAL_AMOUNT","اففتاح تسهیلات برای مبلغ خالص"),
    CLOSE_SUSPENDED(11,"CLOSE_SUSPENDED","نقل به مطالبات معوق");

    private Integer id;
    private String name;
    private String desc;

    DigitalCreditDossierCycleStatus(Integer id, String name, String desc) {
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

    public  static DigitalCreditDossierCycleStatus get(String name) {

        DigitalCreditDossierCycleStatus digitalCreditDossierCycleStatus;
        try {
            digitalCreditDossierCycleStatus = DigitalCreditDossierCycleStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditDossierCycleStatus = DigitalCreditDossierCycleStatus.UNKNOWN;
        }
        return digitalCreditDossierCycleStatus;
    }
}
