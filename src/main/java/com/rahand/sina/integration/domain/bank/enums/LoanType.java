package com.rahand.sina.integration.domain.bank.enums;

public enum LoanType {

    UNKNOWN(-1,"UNKNOWN","نامشخص"),
    MOZAREBE(1,"MOZAREBE","مضاربه"),
    MOSHAREKATE_MADANI( 2,"MOSHAREKATE_MADANI","مشارکت مدنی"),
    MOSHAREKATE_HOGHOGHY(3,"MOSHAREKATE_HOGHOGHY","مشارکت حقوقی"),
    FOROOSHE_AGHSATY(4,"FOROOSHE_AGHSATY","فروش اقساطی"),
    EJARE_BE_SHARTE_TAMLIK(5,"EJARE_BE_SHARTE_TAMLIK","اجاره به شرط تملیک"),
    SALAF(6,"SALAF","سلف"),
    JOALE(7,"JOALE","جعاله"),
    SARMAYEGOZARIE_MOSTAGHIM(8,"SARMAYEGOZARIE_MOSTAGHIM","سرمایه گذاری مستقیم"),
    GHARZOLHASANE( 9,"GHARZOLHASANE","قرض الحسنه"),
    ZEMAN(10,"ZEMAN","ضمان"),
    KHARIDE_DEYN(11,"KHARIDE_DEYN","خرید دین"),
    MOZARE_EH(12,"MOZARE_EH","مزارعه"),
    MOSAGHAT(13,"MOSAGHAT","مساقات"),
    KHADAMATE_ETEBARY(14,"KHADAMATE_ETEBARY","خدمات اعتباری"),
    MOZAREBE_AAM(15,"MOZAREBE_AAM","مضاربه عام"),
    MOSHAREKAT_AAM(16,"MOSHAREKAT_AAM","مشارکت عام");

    private Integer id;
    private String name;
    private String desc;

    LoanType(Integer id, String name, String desc) {
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

    public static LoanType  get(String name) {

        LoanType loanType;
        try {
            loanType = LoanType.valueOf(name);
        } catch (IllegalArgumentException illegalArgumentException) {
            loanType = LoanType.UNKNOWN;
        }
        return loanType;
    }
}
