package com.rahand.sina.integration.domain.bank.dto;

public class TransactionReason {

    private String code;
    private String title;

    public TransactionReason() {
    }

    public TransactionReason(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
