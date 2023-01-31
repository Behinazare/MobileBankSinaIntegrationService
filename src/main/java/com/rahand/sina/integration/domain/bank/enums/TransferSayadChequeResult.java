package com.rahand.sina.integration.domain.bank.enums;

public enum TransferSayadChequeResult {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    COMPLETED(1,"COMPLETED","به پایان رسیده است"),
    REGISTERED_AND_WAITING( 2,"REGISTERED_AND_WAITING","ثبت شده و در انتظار تایید سایر افراد می باشد"),
    CONFIRMED_AND_WAITING(3,"CONFIRMED_AND_WAITING","ثبت و تایید شده است و در انتظار سایر افراد می باشد"),
    CONFIRMED_BY_ALL(4,"CONFIRMED_BY_ALL","توسط همه برای انتقال تایید شده است"),
    CANCELED(5,"CANCELED","لغو شده و نیازمند شروع فرآیند انتقال جدید می باشد");

    private Integer id;
    private String name;
    private String desc;

    TransferSayadChequeResult(Integer id, String name, String desc) {
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

    public static TransferSayadChequeResult  get(String name) {

        TransferSayadChequeResult transferSayadChequeResult;
        try {
            transferSayadChequeResult = TransferSayadChequeResult.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            transferSayadChequeResult = TransferSayadChequeResult.UNKNOWN;
        }
        return transferSayadChequeResult;
    }
}
