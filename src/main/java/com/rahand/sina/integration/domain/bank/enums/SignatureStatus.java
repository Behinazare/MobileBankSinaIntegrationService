package com.rahand.sina.integration.domain.bank.enums;

public enum SignatureStatus {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    DEPOSIT_OWNER(1,"DEPOSIT_OWNER","مالک سپرده"),
    OWNER_OF_DEPOSIT_AND_SIGNATURE(2,"OWNER_OF_DEPOSIT_AND_SIGNATURE","مالک سپرده و صاحب امضاء"),
    SIGNATURE_OWNER(3,"SIGNATURE_OWNER","صاحب امضاء"),
    BROKER(4,"BROKER","کارگزار به عنوان یک صاحب سپرده");

    private Integer id;
    private String name;
    private String desc;

    SignatureStatus(Integer id, String name, String desc) {
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

    public static SignatureStatus get(String name) {

        SignatureStatus signatureStatus;
        try {
            signatureStatus = SignatureStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            signatureStatus = SignatureStatus.UNKNOWN;
        }
        return signatureStatus;
    }
}
