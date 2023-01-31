package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.authentication.service.AuthenticationService;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.CardPinType;
import com.rahand.sina.integration.domain.bank.enums.CardTransactionType;
import com.rahand.sina.integration.domain.bank.enums.DynamicPinProcessType;
import com.rahand.sina.integration.domain.bank.enums.SpecialCardType;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class CardServiceTest {

    @Test
    public void issueCard() {

        CardService cardService = new CardService();
        IssueCardRequest issueCardRequest = new IssueCardRequest();
        issueCardRequest.setTemplateId("77");
        issueCardRequest.setCif("2295556");
        issueCardRequest.setDepositNumber("119-813-2295556-1");
        ResponseDto<IssueCardResponse> responseDto = cardService.issueCard(issueCardRequest);
        IssueCardResponse issueCardResponse = responseDto.getResponseData();

    }

    @Test
    public void cardOwnerInquiry() {
        CardService cardService = new CardService();
        OwnerInquiryRequest ownerInquiryRequest = new OwnerInquiryRequest();
        ownerInquiryRequest.setPan("6393461046382780");
        ResponseDto<OwnerInquiryResponse> responseDto = cardService.cardOwnerInquiry(ownerInquiryRequest);
        OwnerInquiryResponse ownerInquiryResponse = responseDto.getResponseData();
    }

    @Test
    public void cardTransfer() {
        CardService cardService = new CardService();
        CardTransferRequest cardTransferRequest = new CardTransferRequest();
        cardTransferRequest.setAmount(BigDecimal.valueOf(50000));
        cardTransferRequest.setSourcePan("6393461046382780");
        cardTransferRequest.setCvv2("686");
        cardTransferRequest.setExpireDate("0604");
        cardTransferRequest.setPin("492272470");
        cardTransferRequest.setDestinationPan("6393461046382798");
        cardTransferRequest.setTwoPhaseReferenceCode("");
        ResponseDto<CardTransferResponse> response = cardService.cardTransfer(cardTransferRequest);
        CardTransferResponse cardTransferResponse = response.getResponseData();
    }

    @Test
    public void getCards() {

        CardService cardService = new CardService();
        GetCardsRequest getCardsRequest = new GetCardsRequest();
        getCardsRequest.setCif("2295556");
        getCardsRequest.setFormattedDepositNumber(false);
        ResponseDto<GetCardsResponse> responseDto = cardService.getCards(getCardsRequest);
        GetCardsResponse cardsResponse = responseDto.getResponseData();
    }

    @Test
    public void getCardBalance() {
        CardService cardService = new CardService();
        CardBalanceRequest cardBalanceRequest = new CardBalanceRequest();
        cardBalanceRequest.setPan("6393461046382780");
        cardBalanceRequest.setCvv2("686");
        cardBalanceRequest.setExpireDate("0604");
        cardBalanceRequest.setPin("492272470");
        ResponseDto<CardBalanceResponse> responseDto = cardService.getCardBalance(cardBalanceRequest);
        CardBalanceResponse cardBalanceResponse = responseDto.getResponseData();
    }

    @Test
    public void getCardStatements() {
        CardService cardService = new CardService();
        CardStatementsRequest cardStatementsRequest = new CardStatementsRequest();
        cardStatementsRequest.setPan("6393461046382780");
        cardStatementsRequest.setCvv2("686");
        cardStatementsRequest.setExpireDate("0604");
        cardStatementsRequest.setPin("492272470");
        ResponseDto<CardStatementsResponse> responseDto = cardService.getCardStatements(cardStatementsRequest);
        CardStatementsResponse cardStatementsResponse = responseDto.getResponseData();
    }

    @Test
    public void generateCardPin() {

        CardService cardService = new CardService();
        GenerateCardPinRequest generateCardPinRequest = new GenerateCardPinRequest();
        generateCardPinRequest.setCardPinType(CardPinType.E_PAY);
        generateCardPinRequest.setPan("6393461046383663");
        ResponseDto<GenerateCardPinResponse> responseDto = cardService.generateCardPin(generateCardPinRequest);
        GenerateCardPinResponse generateCardPinResponse = responseDto.getResponseData();
    }

    @Test
    public void generateDynamicPin() {

        String initiator = "BR-9125729214";
        Map<String, String> clientInput = new LinkedHashMap<>();
        clientInput.put("initiator", initiator.replaceAll("BR-", ""));
        clientInput.put("Secure_ChannelUserName", "mmtest");
        clientInput.put("Secure_ChannelPassword", "m123456789");
        clientInput.put("time", String.valueOf(System.currentTimeMillis()));
        clientInput.put("DeviceId", "1.180610.011");

        String data = null;
        data = EncryptionService.encrypt(CommonUtil.toJson(clientInput)).getEncryptedData();
        AuthenticationService.addChannelUserData(data);


        CardService cardService = new CardService();
        DynamicPinRequest dynamicPinRequest = new DynamicPinRequest();
        dynamicPinRequest.setDynamicPinProcessType(DynamicPinProcessType.PASSWORD_CONFIRM_REQUEST);
        dynamicPinRequest.setPan("6393461046382780");
        dynamicPinRequest.setCvv2("686");
//        dynamicPinRequest.setAmount(new BigDecimal(25000000));
        ResponseDto<DynamicPinResponse> responseDto = cardService.generateDynamicPin(dynamicPinRequest);
        DynamicPinResponse generateCardPinResponse = responseDto.getResponseData();
    }


    @Test
    public void loginChannelByCardSwitch() {


        CardService cardService = new CardService();
        LoginCardRequest loginCardRequest = new LoginCardRequest();
        loginCardRequest.setPan("6393461046382780");
        loginCardRequest.setCvv2("686");
        loginCardRequest.setExpireDate("0604");
        loginCardRequest.setPin("492272470");
        ResponseDto<LoginCardResponse> responseDto = cardService.loginChannelByCardSwitch(loginCardRequest);

        if (responseDto.isError()) {
            throw new CustomRuntimeException(responseDto.getMessage());
        }
    }

    @Test
    public void initManagementCardStructure() {

        CardService cardService = new CardService();

        List<ManagementCardRequest.SinaBankCardsAction> sinaBankCardsActions = new ArrayList<>();

        sinaBankCardsActions.add(ManagementCardRequest.SinaBankCardsAction.builder()
                .action("cardBalance")
                .title("موجودی کارت")
                .processKey("Process_bank_card_sina_CardBalance")
                .order(1)
                .active(true)
                .build());

        sinaBankCardsActions.add(ManagementCardRequest.SinaBankCardsAction.builder()
                .action("cardStatements")
                .title("صورتحساب کارت")
                .processKey("Process_bank_card_sina_Statements")
                .order(2)
                .active(true)
                .build());

        sinaBankCardsActions.add(ManagementCardRequest.SinaBankCardsAction.builder()
                .action("generateCardFirstPin")
                .title("ایجاد رمز اول کارت")
                .processKey("Process_bank_card_sina_GenerateCardPin")
                .order(3)
                .active(true)
                .build());

        sinaBankCardsActions.add(ManagementCardRequest.SinaBankCardsAction.builder()
                .action("blockedCard")
                .title("انسداد کارت")
                .processKey("Process_bank_card_sina_Blockcard")
                .order(4)
                .active(true)
                .build());


        List<ManagementCardRequest.OtherBankCardsAction> otherBankCardsActions = new ArrayList<>();

        otherBankCardsActions.add(ManagementCardRequest.OtherBankCardsAction.builder()
                .action("editCard")
                .title("ویرایش کارت")
                .processKey("Process_bank_card_sina_EditOtherBankCard")
                .order(1)
                .active(true)
                .build());

        otherBankCardsActions.add(ManagementCardRequest.OtherBankCardsAction.builder()
                .action("removeCard")
                .title("حذف کارت")
                .processKey("Process_bank_card_sina_RemoveOtherBankCard")
                .order(2)
                .active(true)
                .build());

        ManagementCardRequest managementCardRequest = ManagementCardRequest.builder()
                .userId("9125729214")
                .sinaBankCardsActions(sinaBankCardsActions)
                .otherBankCardsActions(otherBankCardsActions)
                .addCardProcessKey("Process_bank_card_sina_AddOtherBankCard")
                .build();
        ManagementCardResponse managementCardResponse = cardService.initManagementCardStructure(managementCardRequest);

        System.out.println(managementCardResponse.toJson());
    }

    @Test
    public void getBankCards() {
    }

    @Test
    public void getOtherBankCards() {

        CardService cardService = new CardService();
        cardService.getOtherBankCards("9125729214");
    }

    @Test
    public void blockCard() {
        CardService cardService = new CardService();
        BlockCardRequest blockCardRequest = new BlockCardRequest();
        blockCardRequest.setCif("");
        blockCardRequest.setPan("6393461046383663");
        ResponseDto<BlockCardResponse> responseDto = cardService.blockCard(blockCardRequest);
        BlockCardResponse blockCardResponse = responseDto.getResponseData();
    }

    @Test
    public void cardToDepositTransfer() {

        CardService cardService = new CardService();
        CardToDepositTransferRequest cardToDepositTransferRequest = new CardToDepositTransferRequest();
        cardToDepositTransferRequest.setAmount(BigDecimal.valueOf(200000));
        cardToDepositTransferRequest.setSourcePan("6393461046382780");
        cardToDepositTransferRequest.setCvv2("686");
        cardToDepositTransferRequest.setExpireDate("0604");
        cardToDepositTransferRequest.setPin("492272470");
        cardToDepositTransferRequest.setDestinationDepositNumber("119-813-2618257-1");
        ResponseDto<CardToDepositTransferResponse> response = cardService.cardToDepositTransfer(cardToDepositTransferRequest);
        CardToDepositTransferResponse cardToDepositTransferResponse = response.getResponseData();

    }

    @Test
    public void getCardTransactions() {

        CardService cardService = new CardService();
        GetCardTransactionRequest getCardTransactionRequest = new GetCardTransactionRequest();
        getCardTransactionRequest.setPan("6393461046382780");
        getCardTransactionRequest.setShowTotalRecord(true);
        getCardTransactionRequest.setFromDate(CommonUtil.perisanDateToLocalDateTime("1401/10/01"));
        getCardTransactionRequest.setToDate(CommonUtil.perisanDateToLocalDateTime("1401/10/24"));
        getCardTransactionRequest.setCardTransactionTypes(Arrays.asList(CardTransactionType.CREDIT, CardTransactionType.DEBIT));
        ResponseDto<GetCardTransactionsResponse> response = cardService.getCardTransactions(getCardTransactionRequest);
        GetCardTransactionsResponse getCardTransactionsResponse = response.getResponseData();

    }

    @Test
    public void issueSpecialCard() {

        CardService cardService = new CardService();
        IssueSpecialCardRequest issueSpecialCardRequest = new IssueSpecialCardRequest();
        issueSpecialCardRequest.setSpecialCardType(SpecialCardType.GIFT_CARD);
        issueSpecialCardRequest.setTemplateId("43-31");
        issueSpecialCardRequest.setIssuerCif("2295556");
        issueSpecialCardRequest.setHolderCif("2295556");
        issueSpecialCardRequest.setAmount(new BigDecimal(500000));
        issueSpecialCardRequest.setHolderName("رضا");

        ResponseDto<IssueSpecialCardResponse> response = cardService.issueSpecialCard(issueSpecialCardRequest);
        IssueSpecialCardResponse issueSpecialCardResponse = response.getResponseData();

    }

    @Test
    public void chargeSpecialCard() {

        CardService cardService = new CardService();
        ChargeSpecialCardRequest chargeSpecialCardRequest = new ChargeSpecialCardRequest();
        chargeSpecialCardRequest.setCif("2295556");
        chargeSpecialCardRequest.setDepositNumber("119-813-2295556-1");

        List<ChargeSpecialCardRequest.SpecialCardInfo> specialCards = new ArrayList<>();
        specialCards.add(ChargeSpecialCardRequest.SpecialCardInfo.builder()
                        .pan("6393462004421966")
                        .amount(new BigDecimal(2000000))
                .build());
        chargeSpecialCardRequest.setSpecialCards(specialCards);

        ResponseDto<ChargeSpecialCardResponse> response = cardService.chargeSpecialCard(chargeSpecialCardRequest);
        ChargeSpecialCardResponse chargeSpecialCardResponse = response.getResponseData();
    }
}