package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum DigitalCreditTransactionProcessingType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    GOODS_AND_SERVICE(1,"GOODS_AND_SERVICE","خرید کالا و خدمات"),
    DEBIT_PAYMENT  (2,"DEBIT_PAYMENT  ","بازپرداخت بدهی" );


    private Integer id;
    private String name;
    private String desc;

    DigitalCreditTransactionProcessingType(Integer id, String name, String desc) {
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

    public  static DigitalCreditTransactionProcessingType get(String name) {

        DigitalCreditTransactionProcessingType digitalCreditTransactionProcessingType;
        try {
            digitalCreditTransactionProcessingType = DigitalCreditTransactionProcessingType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            digitalCreditTransactionProcessingType = DigitalCreditTransactionProcessingType.UNKNOWN;
        }
        return digitalCreditTransactionProcessingType;
    }
}
