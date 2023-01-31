package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import lombok.Builder;


public class GetBankRequest extends BaseRequest {

    private Long offset;
    private Long length;

    public GetBankRequest() {
    }

    @Builder
    public GetBankRequest(String userId, Long offset, Long length) {
        super(userId);
        this.offset = offset;
        this.length = length;
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
