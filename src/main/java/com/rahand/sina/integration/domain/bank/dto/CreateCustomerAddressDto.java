package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;


public class CreateCustomerAddressDto {

    @JsonProperty("AddressType")
    private String addressType;
    @JsonProperty("Address1")
    private String address1;
    @JsonProperty("Address2")
    private String address2;
    @JsonProperty("Address3")
    private String address3;
    @JsonProperty("ZipCode")
    private String zipCode;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Fax")
    private String fax;
    @JsonProperty("TelFax")
    private String telFax;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("CityCode")
    private String cityCode;
    @JsonProperty("StateCode")
    private String stateCode;

    public CreateCustomerAddressDto() {
    }

    @Builder
    public CreateCustomerAddressDto(String addressType, String address1, String address2, String address3, String zipCode, String phone, String fax, String telFax, String email, String cityCode, String stateCode) {
        this.addressType = addressType;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.zipCode = zipCode;
        this.phone = phone;
        this.fax = fax;
        this.telFax = telFax;
        this.email = email;
        this.cityCode = cityCode;
        this.stateCode = stateCode;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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

    public String getTelFax() {
        return telFax;
    }

    public void setTelFax(String telFax) {
        this.telFax = telFax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }


}
