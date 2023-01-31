package com.rahand.sina.integration.provider.yaghut.exception.deposit;


import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;

public class YaghutDepositException {

    public final static String NOT_FOUND_DEPOSIT = "سپرده ای برای مشتری یافت نشد";
    public final static String INVALID_DEPOSIT_NUMBER = "شماره سپرده نامتعبر است";


    public static YaghutExceptionResponse getDepositCardsHandelException(Exception e) {

        return null;
    }
}
