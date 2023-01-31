package com.rahand.sina.integration.domain.bank.service.spec;

import com.rahand.sina.integration.domain.bank.dto.*;

public interface Card {

    LoginCardResponse loginChannelByCard(LoginCardRequest loginCardRequest);

    IssueCardResponse issueCard(IssueCardRequest issueCardRequest);

    IssueSpecialCardResponse issueSpecialCard(IssueSpecialCardRequest issueSpecialCardRequest);

    ChargeSpecialCardResponse chargeSpecialCard(ChargeSpecialCardRequest chargeSpecialCardRequest);

    GenerateCardPinResponse generateCardPin(GenerateCardPinRequest generateCardPinRequest);

    DynamicPinResponse generateDynamicPin(DynamicPinRequest dynamicPinRequest);

    GetCardsResponse getCards(GetCardsRequest getCardsRequest);

    OwnerInquiryResponse inquiryCard(OwnerInquiryRequest ownerInquiryRequest);

    CardTransferResponse cardTransfer(CardTransferRequest cardTransferRequest);

    CardToDepositTransferResponse cardToDepositTransfer(CardToDepositTransferRequest cardToDepositTransferRequest);

    CardBalanceResponse getCardBalance(CardBalanceRequest cardBalanceRequest);

    CardStatementsResponse getCardStatements(CardStatementsRequest cardStatementsRequest);

    GetCardTransactionsResponse getCardTransactions(GetCardTransactionRequest getCardTransactionRequest);

    BlockCardResponse blockCard(BlockCardRequest blockCardRequest);

}
