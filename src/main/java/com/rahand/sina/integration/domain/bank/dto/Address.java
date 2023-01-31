package com.rahand.sina.integration.domain.bank.dto;


import lombok.Builder;

public class Address {

    private String addressType;
    private String postalCode;
    private String postalAddress;
    private String phoneNumber;
    private String fax;
    private String email;

    public Address() {
    }

    @Builder
    public Address(String addressType, String postalCode, String postalAddress, String phoneNumber, String fax, String email) {
        this.addressType = addressType;
        this.postalCode = postalCode;
        this.postalAddress = postalAddress;
        this.phoneNumber = phoneNumber;
        this.fax = fax;
        this.email = email;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
