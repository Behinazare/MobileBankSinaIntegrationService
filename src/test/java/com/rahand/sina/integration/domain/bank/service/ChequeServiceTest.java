package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.PersonalityType;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChequeServiceTest {

    @Test
    public void inquirySayadChequeByIssuer() {

        ChequeService chequeService = new ChequeService();
        InquirySayadChequeByIssuerRequest inquirySayadChequeByIssuerRequest = new InquirySayadChequeByIssuerRequest();
//        inquirySayadChequeByIssuerRequest.setCif("2613972");
        inquirySayadChequeByIssuerRequest.setSayadChequeId("2856010000684946");
        ResponseDto<InquirySayadChequeByIssuerResponse> response = chequeService.inquirySayadChequeByIssuer(inquirySayadChequeByIssuerRequest);
        InquirySayadChequeByIssuerResponse inquirySayadChequeByIssuerResponse = response.getResponseData();

    }

    @Test
    public void inquirySayadChequeByHolder() {

        ChequeService chequeService = new ChequeService();
        InquirySayadChequeByHolderRequest inquirySayadChequeByHolderRequest = new InquirySayadChequeByHolderRequest();
        inquirySayadChequeByHolderRequest.setCif("2295556");
        inquirySayadChequeByHolderRequest.setSayadChequeId("7193010000684945");
        ResponseDto<InquirySayadChequeByHolderResponse> response = chequeService.inquirySayadChequeByHolder(inquirySayadChequeByHolderRequest);
        InquirySayadChequeByHolderResponse inquirySayadChequeByHolderResponse = response.getResponseData();

    }

    @Test
    public void issueSayadCheque() {

        ChequeService chequeService = new ChequeService();
        IssueSayadChequeRequest issueSayadChequeRequest = new IssueSayadChequeRequest();
        issueSayadChequeRequest.setCif("2613972");
        issueSayadChequeRequest.setSayadId("7193010000684945");
        issueSayadChequeRequest.setAmount(new BigDecimal(10000l));
        issueSayadChequeRequest.setDueDate(CommonUtil.perisanDateToLocalDateTime("1401/09/09"));
        issueSayadChequeRequest.setDescription("تست");
        List<SayadChequeReceiverDto> receivers = new ArrayList<>();
        SayadChequeReceiverDto sayadChequeReceiverDto = new SayadChequeReceiverDto();
        sayadChequeReceiverDto.setName("مریم ایلخانی");
        sayadChequeReceiverDto.setIdentityId("0082205388");
        sayadChequeReceiverDto.setPersonalityType(PersonalityType.ACTUAL);
        receivers.add(sayadChequeReceiverDto);
        issueSayadChequeRequest.setReceivers(receivers);
        ResponseDto<IssueSayadChequeResponse> response = chequeService.issueSayadCheque(issueSayadChequeRequest);
        IssueSayadChequeResponse issueSayadChequeResponse = response.getResponseData();

    }

    @Test
    public void acceptOrRejectSayadCheque() {

        ChequeService chequeService = new ChequeService();
        AcceptanceSayadChequeRequest acceptanceSayadChequeRequest = new AcceptanceSayadChequeRequest();
        acceptanceSayadChequeRequest.setAccept(true);
        acceptanceSayadChequeRequest.setSayadId("2856010000684946");
        acceptanceSayadChequeRequest.setCif("2295556");
        ResponseDto<AcceptanceSayadChequeResponse> response = chequeService.acceptOrRejectSayadCheque(acceptanceSayadChequeRequest);
        AcceptanceSayadChequeResponse SayadChequeReceiverDto = response.getResponseData();

    }

    @Test
    public void inquirySayadChequeTransfer() {

        ChequeService chequeService = new ChequeService();
        InquirySayadChequeTransferRequest inquirySayadChequeTransferRequest = new InquirySayadChequeTransferRequest();
        inquirySayadChequeTransferRequest.setCif("");
        inquirySayadChequeTransferRequest.setSayadChequeId("2856010000684946");
        ResponseDto<InquirySayadChequeTransferResponse> response = chequeService.inquirySayadChequeTransfer(inquirySayadChequeTransferRequest);
        InquirySayadChequeTransferResponse inquirySayadChequeTransferResponse = response.getResponseData();

    }

    @Test
    public void transferSayadCheque() {
        ChequeService chequeService = new ChequeService();
        TransferSayadChequeRequest transferSayadChequeRequest = new TransferSayadChequeRequest();
        transferSayadChequeRequest.setCif("2295556");
        transferSayadChequeRequest.setSayadId("2856010000684946");
        transferSayadChequeRequest.setDescription("تست");
        List<SayadChequeReceiverDto> receivers = new ArrayList<>();
        SayadChequeReceiverDto sayadChequeReceiverDto = new SayadChequeReceiverDto();
        sayadChequeReceiverDto.setName("");
        sayadChequeReceiverDto.setIdentityId("");
        sayadChequeReceiverDto.setPersonalityType(PersonalityType.ACTUAL);
        receivers.add(sayadChequeReceiverDto);
        transferSayadChequeRequest.setReceivers(receivers);
        ResponseDto<TransferSayadChequeResponse> response = chequeService.transferSayadCheque(transferSayadChequeRequest);
        TransferSayadChequeResponse transferSayadChequeResponse = response.getResponseData();

    }

    @Test
    public void rejectTransferSayadCheque() {

        ChequeService chequeService = new ChequeService();
        RejectTransferSayadChequeRequest rejectTransferSayadChequeRequest = new RejectTransferSayadChequeRequest();
        rejectTransferSayadChequeRequest.setCif("");
        rejectTransferSayadChequeRequest.setSayadId("");
        rejectTransferSayadChequeRequest.setDescription("");
        ResponseDto<RejectTransferSayadChequeResponse> response = chequeService.rejectTransferSayadCheque(rejectTransferSayadChequeRequest);
        RejectTransferSayadChequeResponse rejectTransferSayadChequeResponse = response.getResponseData();

    }
}