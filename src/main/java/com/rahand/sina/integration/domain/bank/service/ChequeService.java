package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.service.spec.Cheque;
import com.rahand.sina.integration.provider.yaghut.service.cheque.YaghutChequeService;

public class ChequeService {

    private Cheque chequeService;

    public ChequeService() {

        chequeService = new YaghutChequeService();
    }

    public ResponseDto<InquirySayadChequeByIssuerResponse> inquirySayadChequeByIssuer(InquirySayadChequeByIssuerRequest inquirySayadChequeByIssuerRequest){

        ResponseDto<InquirySayadChequeByIssuerResponse> response = new ResponseDto<>();
        InquirySayadChequeByIssuerResponse inquirySayadChequeByIssuerResponse = chequeService.inquirySayadChequeByIssuer(inquirySayadChequeByIssuerRequest);

        if (inquirySayadChequeByIssuerResponse.isSessionExpired()){
            inquirySayadChequeByIssuerResponse = chequeService.inquirySayadChequeByIssuer(inquirySayadChequeByIssuerRequest);
        }

        if (inquirySayadChequeByIssuerResponse.isError()){
            response.setError(true);
            response.setMessage(inquirySayadChequeByIssuerResponse.getErrorMessage());
        }else {
            response.setError(false);
            response.setResponseData(inquirySayadChequeByIssuerResponse);
        }

        return response;
    }

    public ResponseDto<InquirySayadChequeByHolderResponse> inquirySayadChequeByHolder(InquirySayadChequeByHolderRequest inquirySayadChequeByHolderRequest){

        ResponseDto<InquirySayadChequeByHolderResponse> response = new ResponseDto<>();
        InquirySayadChequeByHolderResponse inquirySayadChequeByHolderResponse = chequeService.inquirySayadChequeByHolder(inquirySayadChequeByHolderRequest);

        if (inquirySayadChequeByHolderResponse.isSessionExpired()){
            inquirySayadChequeByHolderResponse = chequeService.inquirySayadChequeByHolder(inquirySayadChequeByHolderRequest);
        }

        if (inquirySayadChequeByHolderResponse.isError()){
            response.setError(true);
            response.setMessage(inquirySayadChequeByHolderResponse.getErrorMessage());
        }else {
            response.setError(false);
            response.setResponseData(inquirySayadChequeByHolderResponse);
        }

        return response;
    }

    public ResponseDto<IssueSayadChequeResponse> issueSayadCheque(IssueSayadChequeRequest issueSayadChequeRequest){

        ResponseDto<IssueSayadChequeResponse> response = new ResponseDto<>();
        IssueSayadChequeResponse issueSayadChequeResponse = chequeService.issueSayadCheque(issueSayadChequeRequest);

        if (issueSayadChequeResponse.isSessionExpired()){
            issueSayadChequeResponse = chequeService.issueSayadCheque(issueSayadChequeRequest);
        }

        if (issueSayadChequeResponse.isError()){
            response.setError(true);
            response.setMessage(issueSayadChequeResponse.getErrorMessage());
        }else {
            response.setError(false);
            response.setResponseData(issueSayadChequeResponse);
        }

        return response;
    }

    public ResponseDto<AcceptanceSayadChequeResponse> acceptOrRejectSayadCheque(AcceptanceSayadChequeRequest acceptanceSayadChequeRequest){

        ResponseDto<AcceptanceSayadChequeResponse> response = new ResponseDto<>();
        AcceptanceSayadChequeResponse acceptanceSayadChequeResponse = chequeService.acceptOrRejectSayadCheque(acceptanceSayadChequeRequest);

        if (acceptanceSayadChequeResponse.isSessionExpired()){
            acceptanceSayadChequeResponse = chequeService.acceptOrRejectSayadCheque(acceptanceSayadChequeRequest);
        }

        if (acceptanceSayadChequeResponse.isError()){
            response.setError(true);
            response.setMessage(acceptanceSayadChequeResponse.getErrorMessage());
        }else {
            response.setError(false);
            response.setResponseData(acceptanceSayadChequeResponse);
        }

        return response;
    }

    public ResponseDto<InquirySayadChequeTransferResponse> inquirySayadChequeTransfer(InquirySayadChequeTransferRequest inquirySayadChequeTransferRequest){

        ResponseDto<InquirySayadChequeTransferResponse> response = new ResponseDto<>();
        InquirySayadChequeTransferResponse inquirySayadChequeTransferResponse = chequeService.inquirySayadChequeTransfer(inquirySayadChequeTransferRequest);

        if (inquirySayadChequeTransferResponse.isSessionExpired()){
            inquirySayadChequeTransferResponse = chequeService.inquirySayadChequeTransfer(inquirySayadChequeTransferRequest);
        }

        if (inquirySayadChequeTransferResponse.isError()){
            response.setError(true);
            response.setMessage(inquirySayadChequeTransferResponse.getErrorMessage());
        }else {
            response.setError(false);
            response.setResponseData(inquirySayadChequeTransferResponse);
        }

        return response;
    }

    public ResponseDto<TransferSayadChequeResponse> transferSayadCheque(TransferSayadChequeRequest transferSayadChequeRequest){

        ResponseDto<TransferSayadChequeResponse> response = new ResponseDto<>();
        TransferSayadChequeResponse transferSayadChequeResponse = chequeService.transferSayadCheque(transferSayadChequeRequest);

        if (transferSayadChequeResponse.isSessionExpired()){
            transferSayadChequeResponse = chequeService.transferSayadCheque(transferSayadChequeRequest);
        }

        if (transferSayadChequeResponse.isError()){
            response.setError(true);
            response.setMessage(transferSayadChequeResponse.getErrorMessage());
        }else {
            response.setError(false);
            response.setResponseData(transferSayadChequeResponse);
        }

        return response;
    }
    public ResponseDto<RejectTransferSayadChequeResponse> rejectTransferSayadCheque(RejectTransferSayadChequeRequest rejectTransferSayadChequeRequest){

        ResponseDto<RejectTransferSayadChequeResponse> response = new ResponseDto<>();
        RejectTransferSayadChequeResponse rejectTransferSayadChequeResponse = chequeService.rejectTransferSayadCheque(rejectTransferSayadChequeRequest);

        if (rejectTransferSayadChequeResponse.isSessionExpired()){
            rejectTransferSayadChequeResponse = chequeService.rejectTransferSayadCheque(rejectTransferSayadChequeRequest);
        }

        if (rejectTransferSayadChequeResponse.isError()){
            response.setError(true);
            response.setMessage(rejectTransferSayadChequeResponse.getErrorMessage());
        }else {
            response.setError(false);
            response.setResponseData(rejectTransferSayadChequeResponse);
        }

        return response;
    }

}
