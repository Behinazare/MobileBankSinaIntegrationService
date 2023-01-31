package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

public class CartableRtgsTransferResponse extends BaseResponse {

    private String cartableId;

    public CartableRtgsTransferResponse() {
    }

    @Builder
    public CartableRtgsTransferResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String cartableId) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.cartableId = cartableId;
    }

    public String getCartableId() {
        return cartableId;
    }

    public void setCartableId(String cartableId) {
        this.cartableId = cartableId;
    }
}
