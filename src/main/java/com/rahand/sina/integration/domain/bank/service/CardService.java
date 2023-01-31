package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ResponseDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.service.spec.Card;
import com.rahand.sina.integration.provider.yaghut.service.card.YaghutCardService;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserService;
import com.rahand.sina.lib.repository.MainRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CardService {

    private Card cardService;

    public CardService() {
        cardService = new YaghutCardService();
    }

    public ResponseDto<LoginCardResponse> loginChannelByCardSwitch(LoginCardRequest loginCardRequest) {

        ResponseDto<LoginCardResponse> response = new ResponseDto<>();
        LoginCardResponse loginCardResponse = cardService.loginChannelByCard(loginCardRequest);

        if (loginCardResponse.isSessionExpired()) {
            loginCardResponse = cardService.loginChannelByCard(loginCardRequest);
        }

        if (loginCardResponse.isError()) {
            response.setError(true);
            response.setMessage(loginCardResponse.getErrorMessage());
            response.setResponseData(loginCardResponse);
        } else {
            response.setError(false);
            response.setResponseData(loginCardResponse);
        }

        return response;
    }

    public ResponseDto<IssueCardResponse> issueCard(IssueCardRequest issueCardRequest) {

        ResponseDto<IssueCardResponse> response = new ResponseDto<>();
        IssueCardResponse issueCardResponse = cardService.issueCard(issueCardRequest);

        if (issueCardResponse.isError()) {
            response.setError(true);
            response.setMessage(issueCardResponse.getErrorMessage());
            response.setResponseData(issueCardResponse);
        } else {
            response.setError(false);
            response.setResponseData(issueCardResponse);
        }

        return response;
    }

    public ResponseDto<IssueSpecialCardResponse> issueSpecialCard(IssueSpecialCardRequest issueSpecialCardRequest) {

        ResponseDto<IssueSpecialCardResponse> response = new ResponseDto<>();
        IssueSpecialCardResponse issueSpecialCardResponse = cardService.issueSpecialCard(issueSpecialCardRequest);

        if (issueSpecialCardResponse.isSessionExpired()) {
            issueSpecialCardResponse = cardService.issueSpecialCard(issueSpecialCardRequest);
        }

        if (issueSpecialCardResponse.isError()) {
            response.setError(true);
            response.setMessage(issueSpecialCardResponse.getErrorMessage());
            response.setResponseData(issueSpecialCardResponse);
        } else {
            response.setError(false);
            response.setResponseData(issueSpecialCardResponse);
        }

        return response;
    }

    public ResponseDto<ChargeSpecialCardResponse> chargeSpecialCard(ChargeSpecialCardRequest chargeSpecialCardRequest) {

        ResponseDto<ChargeSpecialCardResponse> response = new ResponseDto<>();
        ChargeSpecialCardResponse chargeSpecialCardResponse = cardService.chargeSpecialCard(chargeSpecialCardRequest);

        if (chargeSpecialCardResponse.isSessionExpired()) {
            chargeSpecialCardResponse = cardService.chargeSpecialCard(chargeSpecialCardRequest);
        }

        if (chargeSpecialCardResponse.isError()) {
            response.setError(true);
            response.setMessage(chargeSpecialCardResponse.getErrorMessage());
            response.setResponseData(chargeSpecialCardResponse);
        } else {
            response.setError(false);
            response.setResponseData(chargeSpecialCardResponse);
        }

        return response;
    }


    public ResponseDto<GenerateCardPinResponse> generateCardPin(GenerateCardPinRequest generateCardPinRequest) {

        ResponseDto<GenerateCardPinResponse> response = new ResponseDto<>();
        GenerateCardPinResponse generateCardPinResponse = cardService.generateCardPin(generateCardPinRequest);

        if (generateCardPinResponse.isSessionExpired()) {
            generateCardPinResponse = cardService.generateCardPin(generateCardPinRequest);
        }

        if (generateCardPinResponse.isError()) {
            response.setError(true);
            response.setMessage(generateCardPinResponse.getErrorMessage());
            response.setResponseData(generateCardPinResponse);
        } else {
            response.setError(false);
            response.setResponseData(generateCardPinResponse);
        }

        return response;
    }

    public ResponseDto<DynamicPinResponse> generateDynamicPin(DynamicPinRequest dynamicPinRequest) {

        ResponseDto<DynamicPinResponse> response = new ResponseDto<>();
        DynamicPinResponse dynamicPinResponse = cardService.generateDynamicPin(dynamicPinRequest);

        if (dynamicPinResponse.isSessionExpired()) {
            dynamicPinResponse = cardService.generateDynamicPin(dynamicPinRequest);
        }
        if (dynamicPinResponse.isError()) {
            response.setError(true);
            response.setMessage(dynamicPinResponse.getErrorMessage());
            response.setResponseData(dynamicPinResponse);
        } else {
            response.setError(false);
            response.setResponseData(dynamicPinResponse);
        }

        return response;
    }

    public ResponseDto<GetCardsResponse> getCards(GetCardsRequest getCardsRequest) {

        ResponseDto<GetCardsResponse> response = new ResponseDto<>();
        GetCardsResponse cardsResponse = cardService.getCards(getCardsRequest);

        if (cardsResponse.isSessionExpired()) {
            cardsResponse = cardService.getCards(getCardsRequest);
        }

        if (cardsResponse.isError()) {
            response.setError(true);
            response.setMessage(cardsResponse.getErrorMessage());
            response.setResponseData(cardsResponse);
        } else {
            response.setError(false);
            response.setResponseData(cardsResponse);
        }

        return response;
    }

    public ResponseDto<OwnerInquiryResponse> cardOwnerInquiry(OwnerInquiryRequest ownerInquiryRequest) {

        ResponseDto<OwnerInquiryResponse> response = new ResponseDto<>();
        OwnerInquiryResponse ownerInquiryResponse = cardService.inquiryCard(ownerInquiryRequest);

        if (ownerInquiryResponse.isSessionExpired()) {
            ownerInquiryResponse = cardService.inquiryCard(ownerInquiryRequest);
        }

        if (ownerInquiryResponse.isError()) {
            response.setError(true);
            response.setMessage(ownerInquiryResponse.getErrorMessage());
            response.setResponseData(ownerInquiryResponse);
        } else {
            response.setError(false);
            response.setResponseData(ownerInquiryResponse);
        }

        return response;
    }

    public ResponseDto<CardTransferResponse> cardTransfer(CardTransferRequest cardTransferRequest) {

        ResponseDto<CardTransferResponse> response = new ResponseDto<>();
        CardTransferResponse cardTransferResponse = cardService.cardTransfer(cardTransferRequest);

        if (cardTransferResponse.isSessionExpired()) {
            cardTransferResponse = cardService.cardTransfer(cardTransferRequest);
        }

        if (cardTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(cardTransferResponse.getErrorMessage());
            response.setResponseData(cardTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(cardTransferResponse);
        }

        return response;
    }

    public ResponseDto<CardToDepositTransferResponse> cardToDepositTransfer(CardToDepositTransferRequest cardToDepositTransferRequest) {

        ResponseDto<CardToDepositTransferResponse> response = new ResponseDto<>();
        CardToDepositTransferResponse cardToDepositTransferResponse = cardService.cardToDepositTransfer(cardToDepositTransferRequest);

        if (cardToDepositTransferResponse.isSessionExpired()) {
            cardToDepositTransferResponse = cardService.cardToDepositTransfer(cardToDepositTransferRequest);
        }

        if (cardToDepositTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(cardToDepositTransferResponse.getErrorMessage());
            response.setResponseData(cardToDepositTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(cardToDepositTransferResponse);
        }

        return response;
    }

    public ResponseDto<CardBalanceResponse> getCardBalance(CardBalanceRequest cardBalanceRequest) {

        ResponseDto<CardBalanceResponse> response = new ResponseDto<>();
        CardBalanceResponse cardBalance = cardService.getCardBalance(cardBalanceRequest);

        if (cardBalance.isSessionExpired()) {
            cardBalance = cardService.getCardBalance(cardBalanceRequest);
        }

        if (cardBalance.isError()) {
            response.setError(true);
            response.setMessage(cardBalance.getErrorMessage());
            response.setResponseData(cardBalance);
        } else {
            response.setError(false);
            response.setResponseData(cardBalance);
        }

        return response;
    }

    public ResponseDto<CardStatementsResponse> getCardStatements(CardStatementsRequest cardStatementsRequest) {

        ResponseDto<CardStatementsResponse> response = new ResponseDto<>();
        CardStatementsResponse cardStatements = cardService.getCardStatements(cardStatementsRequest);

        if (cardStatements.isSessionExpired()) {
            cardStatements = cardService.getCardStatements(cardStatementsRequest);
        }

        if (cardStatements.isError()) {
            response.setError(true);
            response.setMessage(cardStatements.getErrorMessage());
            response.setResponseData(cardStatements);
        } else {
            response.setError(false);
            response.setResponseData(cardStatements);
        }

        return response;
    }

    public ResponseDto<GetCardTransactionsResponse> getCardTransactions(GetCardTransactionRequest getCardTransactionRequest) {

        ResponseDto<GetCardTransactionsResponse> response = new ResponseDto<>();
        GetCardTransactionsResponse getCardTransactionsResponse = cardService.getCardTransactions(getCardTransactionRequest);

        if (getCardTransactionsResponse.isSessionExpired()) {
            getCardTransactionsResponse = cardService.getCardTransactions(getCardTransactionRequest);
        }

        if (getCardTransactionsResponse.isError()) {
            response.setError(true);
            response.setMessage(getCardTransactionsResponse.getErrorMessage());
            response.setResponseData(getCardTransactionsResponse);
        } else {
            response.setError(false);
            response.setResponseData(getCardTransactionsResponse);
        }

        return response;
    }

    public ResponseDto<BlockCardResponse> blockCard(BlockCardRequest blockCardRequest) {

        ResponseDto<BlockCardResponse> response = new ResponseDto<>();
        BlockCardResponse blockCardResponse = cardService.blockCard(blockCardRequest);

        if (blockCardResponse.isSessionExpired()) {
            blockCardResponse = cardService.blockCard(blockCardRequest);
        }

        if (blockCardResponse.isError()) {
            response.setError(true);
            response.setMessage(blockCardResponse.getErrorMessage());
            response.setResponseData(blockCardResponse);
        } else {
            response.setError(false);
            response.setResponseData(blockCardResponse);
        }

        return response;
    }

    public ManagementCardResponse initManagementCardStructure(ManagementCardRequest managementCardRequest) {

        ManagementCardResponse managementCardResponse = new ManagementCardResponse();
        List<ManagementCardResponse.BankCard> otherBankCardList = getOtherBankCards(managementCardRequest.getUserId());
        List<ManagementCardResponse.BankCard> sinaCardList = getBankCards(managementCardRequest.getUserId());

        ManagementCardResponse.MayCards mayCards = ManagementCardResponse.MayCards.builder()
                .sinaBankCard(ManagementCardResponse.SinaBankCard.builder()
                        .sinaBankCardsActions(managementCardRequest.getSinaBankCardsActions())
                        .bankCards(sinaCardList)
                        .build())
                .otherBankCard(ManagementCardResponse.OtherBankCard.builder()
                        .addCardProcessKey(managementCardRequest.getAddCardProcessKey())
                        .otherBankCardsActions(managementCardRequest.getOtherBankCardsActions())
                        .bankCards(otherBankCardList)
                        .build())
                .build();

        managementCardResponse.setMayCards(mayCards);

        return managementCardResponse;

    }

    public List<ManagementCardResponse.BankCard> getBankCards(String userId) {

        List<ManagementCardResponse.BankCard> bankCards = new ArrayList<>();
        MainRepository mainRepository = new MainRepository();
        Optional<String> userCif = mainRepository.getAuthenticatedUserCif(userId);
        Optional<String> channelData = YaghutUserService.getInstance().getChannelUserData(userId);
        if (userCif.isPresent() && channelData.isPresent()) {
            String bankIcon = IntegrationLibConfig.getProperty("MAIN_BANK_ICON_LINK");
            CardService cardService = new CardService();
            GetCardsRequest getCardsRequest = GetCardsRequest.builder().cif(userCif.get()).build();
            ResponseDto<GetCardsResponse> getCardsResponseDto = cardService.getCards(getCardsRequest);
            if (getCardsResponseDto.isError()) {
                CommonUtil.logError(getClass().getSimpleName(), "getBankCards", "errorInGetBankCards");
            } else {
                GetCardsResponse cardsResponse = getCardsResponseDto.getResponseData();
                for (BankCardDto cardDto : cardsResponse.getCards()) {

                    bankCards.add(ManagementCardResponse.BankCard.builder()
                            .id("")
                            .cardNumber(cardDto.getPan())
                            .expireDate(cardDto.getPersianExpireDate())
                            .customerName(cardDto.getCustomerFirstName() + " " + cardDto.getCustomerLastname())
                            .bankName("بانک سینا")
                            .bankIcon(bankIcon != null ? bankIcon : "")
                            .build());
                }

            }

        }

        return bankCards;
    }

    public List<ManagementCardResponse.BankCard> getOtherBankCards(String userId) {

        List<ManagementCardResponse.BankCard> otherBankCardList = new ArrayList<>();

        String query = "SELECT FAV_BANK.*, BA_INFO.LOGOADDRESS  FROM  XTI22CARDFAVORITE fav_bank  left join  XTI22CARTBANKINFO ba_info on BA_INFO.PRECARTNUMBER = SUBSTR(FAV_BANK.VALUE_,0,6)  WHERE fav_bank.USERID =?";
        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {

            preparedStatement.setString(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                Map<String, String> cardMap = CommonUtil.jsonToMap(resultSet.getString("EXTRA_"));
                ManagementCardResponse.BankCard bankCard = ManagementCardResponse.BankCard.builder()
                        .id(resultSet.getString("ID"))
                        .cardNumber(resultSet.getString("VALUE_"))
                        .expireDate(cardMap.get("expireDate"))
                        .customerName(cardMap.get("customerName"))
                        .bankName(cardMap.get("bankName"))
                        .bankIcon(resultSet.getString("LOGOADDRESS") != null ? resultSet.getString("LOGOADDRESS") : "")
                        .build();

                otherBankCardList.add(bankCard);
            }
        } catch (SQLException e) {
            CommonUtil.logError(getClass().getSimpleName(), "getOtherBankCards", e.toString());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return otherBankCardList;
    }


}
