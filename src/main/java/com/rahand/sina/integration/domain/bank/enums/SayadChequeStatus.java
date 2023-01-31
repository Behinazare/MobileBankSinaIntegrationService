package com.rahand.sina.integration.domain.bank.enums;

public enum SayadChequeStatus {


    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    ISSUED(1,"ISSUED","ثبت شده است"),
    CASHED( 2,"CASHED","نقد شده است"),
    CANCELED(3,"CANCELED","لغو شده است"),
    RETURNED(4,"RETURNED","بازگشت داده شده است"),
    PART_RETURNED(5,"PART_RETURNED","بخشی از آن بازگشت داده شده است"),
    WAITING_FOR_SIGNATURE(6,"WAITING_FOR_SIGNATURE","انتظار برای امضاء دارنده چک"),
    ISSUING_IS_WAITED(7,"ISSUING_IS_WAITED","ثبت چک در انتظار تایید دریافت کننده چک می باشد"),
    TRANSFERING_IS_WAITED(8,"TRANSFERING_IS_WAITED","انتقال چک در انتظار تایید دریافت کننده چک می باشد");

    private Integer id;
    private String name;
    private String desc;

    SayadChequeStatus(Integer id, String name, String desc) {
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

    public static SayadChequeStatus  get(String name) {

        SayadChequeStatus sayadChequeStatus;
        try {
            sayadChequeStatus = SayadChequeStatus.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            sayadChequeStatus = SayadChequeStatus.UNKNOWN;
        }
        return sayadChequeStatus;
    }
}
