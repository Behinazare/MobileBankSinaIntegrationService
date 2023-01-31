package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseDto;
import lombok.Builder;


public class BranchInfo extends BaseDto {

    private String name;
    private String code;
    private String city;
    private String address;
    private String phone;
    private String fax;
    private String zipCode;

    public BranchInfo() {
    }

    @Builder
    public BranchInfo(String name, String code, String city, String address, String phone, String fax, String zipCode) {
        this.name = name;
        this.code = code;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
