package com.rahand.sina.integration.domain.bank.enums;

public enum SecurityTicketServiceType {

    UNKNOWN(-1, "UNKNOWN", "نامشخص"),
    NORMAL_TRANSFER(1, "NORMAL_TRANSFER", "انتقال وجه"),
    NORMAL_ACH_TRANSFER(2, "NORMAL_ACH_TRANSFER", "پایا"),
    NORMAL_RTGS_TRANSFER(3, "SATNA", "ساتنا"),
    DEPOSIT_PAYMENT(4, "DEPOSIT_PAYMENT", "پرداخت با سپرده"),
    DEPOSIT_BILL_PAYMENT(5, "DEPOSIT_BILL_PAYMENT", "پرداخت قبض با سپرده"),
    TOP_UP_MOBILE_BY_DEPOSIT(6, "TOPUP_MOBILE_BY_DEPOSIT", "پرداخت شارژ موبایل با سپرده");

    private Integer id;
    private String name;
    private String desc;

    SecurityTicketServiceType(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public static SecurityTicketServiceType get(String name) {

        SecurityTicketServiceType securityTicketServiceType;

        switch (name) {
            case "NORMAL_TRANSFER":
                securityTicketServiceType = NORMAL_TRANSFER;
                break;
            case "NORMAL_ACH_TRANSFER":
                securityTicketServiceType = NORMAL_ACH_TRANSFER;
                break;
            case "SATNA":
                securityTicketServiceType = NORMAL_RTGS_TRANSFER;
                break;
            case "DEPOSIT_PAYMENT":
                securityTicketServiceType = DEPOSIT_PAYMENT;
                break;
            case "DEPOSIT_BILL_PAYMENT":
                securityTicketServiceType = DEPOSIT_BILL_PAYMENT;
                break;
            case "TOPUP_MOBILE_BY_DEPOSIT":
                securityTicketServiceType = TOP_UP_MOBILE_BY_DEPOSIT;
                break;
            default:
                securityTicketServiceType = UNKNOWN;
        }

        return securityTicketServiceType;
    }
}
