package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class GetBranchRequest extends BaseRequest {

    private String name;
    private String code;
    private String city;
    private String address;
    private String phone;
    private String searchKeyword;
    private Long offset;
    private Long length;

    public GetBranchRequest() {
    }

    @Builder
    public GetBranchRequest(String userId, String name, String code, String city, String address, String phone, String searchKeyword, Long offset, Long length) {
        super(userId);
        this.name = name;
        this.code = code;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.searchKeyword = searchKeyword;
        this.offset = offset;
        this.length = length;
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

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }
}
