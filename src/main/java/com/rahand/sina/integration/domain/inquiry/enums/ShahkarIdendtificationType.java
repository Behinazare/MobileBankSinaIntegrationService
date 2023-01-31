package com.rahand.sina.integration.domain.inquiry.enums;

import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.sina.integration.provider.tefas.constants.TefasConstants;

public enum ShahkarIdendtificationType {

    NATIONAL_CODE("کد ملی",0),
    PASSPORT("گذرنامه",1),
    AMAYESH("آمایش",2),
    REFUGE("پناهدگی",3),
    IDENTITY("هویت",4),
    NATIONAL_ID("شناسه ملی",5),
    UNIVERSAL_NO("شماره فراگیر",6);

    private String title;
    private Integer id;

    ShahkarIdendtificationType(String title, Integer id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public static ShahkarIdendtificationType getIdentificationType(Integer id){
        ShahkarIdendtificationType shahkarIdendtificationType=null;
        switch (id){
            case 0:
                shahkarIdendtificationType=NATIONAL_CODE;
             break;

            case 1:
                shahkarIdendtificationType=PASSPORT;
                break;

            case 2:
                shahkarIdendtificationType=AMAYESH;
                break;

            case 3:
                shahkarIdendtificationType=REFUGE;
                break;

            case 4:
                shahkarIdendtificationType=IDENTITY;
                break;

            case 5:
                shahkarIdendtificationType=NATIONAL_ID;
                break;

            case 6:
                shahkarIdendtificationType=UNIVERSAL_NO;
                break;

                default:
                    throw new CustomRuntimeException(TefasConstants.INVALID_SHAHKAR_IDENTIFICATION_TYPE);
        }
        return shahkarIdendtificationType;
    }


}
