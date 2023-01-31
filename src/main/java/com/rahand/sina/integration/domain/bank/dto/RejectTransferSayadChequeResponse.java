package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.sina.integration.domain.bank.enums.TransferSayadChequeResult;
import lombok.Builder;

public class RejectTransferSayadChequeResponse extends BaseResponse {

    public TransferSayadChequeResult transferSayadChequeResult;

    public RejectTransferSayadChequeResponse() {
    }

    @Builder
    public RejectTransferSayadChequeResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, TransferSayadChequeResult transferSayadChequeResult) {
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
