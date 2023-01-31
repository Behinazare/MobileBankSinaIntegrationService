package com.rahand.sina.integration.domain.authentication.enums;

public enum AuthenticationRoleType {

    UNKNOWN(-1, "none", "نامشخص"),
    CHANNEL_USER(1, "user", "کاربر کانال بانکی"),
    THIRD_PARTY(2, "thirdParty", "کاربر عمومی(ادمین)");

    private Integer id;
    private String name;
    private String desc;

    AuthenticationRoleType(Integer id, String name, String desc) {
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

    public static AuthenticationRoleType get(String name) {

        AuthenticationRoleType authenticationRoleType;
        if (CHANNEL_USER.name.equals(name)) {
            authenticationRoleType = CHANNEL_USER;
        } else if (THIRD_PARTY.name.equals(name)) {
            authenticationRoleType = THIRD_PARTY;
        } else {
            authenticationRoleType = UNKNOWN;
        }
        return authenticationRoleType;
    }
}
