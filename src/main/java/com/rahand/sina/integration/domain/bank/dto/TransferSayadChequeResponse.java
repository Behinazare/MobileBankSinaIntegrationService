package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.bank.enums.TransferSayadChequeResult;
import lombok.Builder;

public class TransferSayadChequeResponse extends BaseResponse {

    public TransferSayadChequeResult transferSayadChequeResult;

    public TransferSayadChequeResponse() {
    }

    @Builder
    public TransferSayadChequeResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, TransferSayadChequeResult transferSayadChequeResult) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.transferSayadChequeResult = transferSayadChequeResult;
    }

    public TransferSayadChequeResult getTransferSayadChequeResult() {
        return transferSayadChequeResult;
    }

    public void setTransferSayadChequeResult(TransferSayadChequeResult transferSayadChequeResult) {
        this.transferSayadChequeResult = transferSayadChequeResult;
    }
}
