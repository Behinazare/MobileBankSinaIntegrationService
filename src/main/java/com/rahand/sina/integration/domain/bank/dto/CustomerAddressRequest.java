package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class CustomerAddressRequest extends BaseRequest {

    private String cif;
    private Long offset;
    private Long length;

    public CustomerAddressRequest() {
    }

    @Builder
    public CustomerAddressRequest(String userId, String cif, Long offset, Long length) {
        super(userId);
        this.cif = cif;
        this.offset = offset;
        this.length = length;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
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
