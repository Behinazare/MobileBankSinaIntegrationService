package com.rahand.sina.integration.domain.digitalcredit.enums;

public enum TransactionStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),

    OK(1,"OK","موفق"),
    REVERSED (2,"REVERSED ","برگشت خورده");


    private Integer id;
    private String name;
    private String desc;

    TransactionStatus(Integer id, String name, String desc) {
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

    public  static TransactionStatus get(String name) {

        TransactionStatus transactionStatus;
        try {
            transactionStatus = TransactionStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            transactionStatus = TransactionStatus.UNKNOWN;
        }
        return transactionStatus;
    }

}
