package com.rahand.sina.integration.domain.bank.service.spec;

import com.rahand.sina.integration.domain.bank.dto.*;

public interface Deposit {

    OpenDepositResponse openDeposit(OpenDepositRequest openDepositRequest);

    DepositsResponse getDeposits(DepositsRequest depositsRequest);

    DepositsResponse getLegalDeposits(LegalDepositsRequest depositsRequest);

    GetCardsResponse getDepositCards(GetCardsRequest getCardsRequest);

    DepositCustomersResponse getDepositCustomers(DepositCustomersRequest depositCustomersRequest);

    DepositCustomersResponse getLegalDepositCustomers(DepositCustomersRequest depositCustomersRequest);

    DepositBalanceResponse getDepositBalance(DepositBalanceRequest depositBalanceRequest);

    DepositBalanceResponse getLegalDepositBalance(DepositBalanceRequest depositBalanceRequest);


    StatementsResponse getStatements(StatementsRequest statementsRequest);

    IbanConvertorDto depositNumberToIban(IbanConvertorDto ibanConvertorDto);

    IbanConvertorDto ibanToDepositNumber(IbanConvertorDto ibanConvertorRequest);

    IbanInfoResponse getIbanInfo(IbanInfoRequest ibanInfoRequest);

    OwnerInquiryResponse inquiryDepositNumber(OwnerInquiryRequest ownerInquiryResponse);

    OwnerInquiryResponse inquiryIban(OwnerInquiryRequest ownerInquiryRequest);

    TransactionReasonResponse getAchTransactionReason();

    TransactionReasonResponse getRtgsTransactionReason();

    DepositTransferResponse depositTransfer(DepositTransferRequest depositTransferRequest);

    AchTransferResponse achTransfer(AchTransferRequest achTransferRequest);

    RtgsTransferResponse rtgsTransfer(RtgsTransferRequest rtgsTransferRequest);

    CartableRtgsTransferResponse cartableRtgsTransfer(RtgsTransferRequest rtgsTransferRequest);


    UnlimitedRtgsTransferResponse unlimitedRtgsTransfer(UnlimitedRtgsTransferRequest unlimitedRtgsTransferRequest);

    InstantTransferResponse instantTransfer(InstantTransferRequest instantTransferRequest);

    GenerateSecurityTicketResponse generateSecurityTicket(GenerateSecurityTicketRequest generateSecurityTicketRequest);

    GetDepositAverageResponse getDepositsAverage(GetDepositAverageRequest getDepositAverageRequest);

}
