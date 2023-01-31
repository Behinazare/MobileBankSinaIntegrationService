package com.rahand.sina.integration.domain.bank.dto;

import lombok.Builder;


public class CustomerAddress {

    private String address;
    public String addressId;

    public CustomerAddress() {
    }

    @Builder
    public CustomerAddress(String address, String addressId) {
        this.address = address;
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
