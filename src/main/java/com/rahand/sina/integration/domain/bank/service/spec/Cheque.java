package com.rahand.sina.integration.domain.bank.service.spec;

import com.rahand.sina.integration.domain.bank.dto.*;

public interface Cheque {

    InquirySayadChequeByIssuerResponse inquirySayadChequeByIssuer(InquirySayadChequeByIssuerRequest inquirySayadChequeByIssuerRequest);

    InquirySayadChequeByHolderResponse inquirySayadChequeByHolder(InquirySayadChequeByHolderRequest inquirySayadChequeByHolderRequest);

    IssueSayadChequeResponse issueSayadCheque(IssueSayadChequeRequest issueSayadChequeRequest);

    AcceptanceSayadChequeResponse acceptOrRejectSayadCheque(AcceptanceSayadChequeRequest acceptanceSayadChequeRequest);

    InquirySayadChequeTransferResponse inquirySayadChequeTransfer(InquirySayadChequeTransferRequest inquirySayadChequeTransferRequest);

    TransferSayadChequeResponse transferSayadCheque(TransferSayadChequeRequest transferSayadChequeRequest);

    RejectTransferSayadChequeResponse rejectTransferSayadCheque(RejectTransferSayadChequeRequest rejectTransferSayadChequeRequest);


}
