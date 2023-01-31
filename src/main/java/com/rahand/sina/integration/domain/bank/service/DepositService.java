package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.CardStatus;
import com.rahand.sina.integration.domain.bank.enums.DepositOwnerType;
import com.rahand.sina.integration.domain.bank.enums.DepositWithdrawalOption;
import com.rahand.sina.integration.domain.bank.service.spec.Card;
import com.rahand.sina.integration.domain.bank.service.spec.Deposit;
import com.rahand.sina.integration.provider.yaghut.service.card.YaghutCardService;
import com.rahand.sina.integration.provider.yaghut.service.deposit.YaghutDepositService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DepositService {

    private Deposit depositService;

    public DepositService() {
        depositService = new YaghutDepositService();
    }

    public ResponseDto<OpenDepositResponse> openDeposit(OpenDepositRequest openDepositRequest) {

        ResponseDto<OpenDepositResponse> response = new ResponseDto<>();
        OpenDepositResponse openDepositResponse = depositService.openDeposit(openDepositRequest);

        if (openDepositResponse.isError()) {
            response.setError(true);
            response.setMessage(openDepositResponse.getErrorMessage());
            response.setResponseData(openDepositResponse);
        } else {
            response.setError(false);
            response.setResponseData(openDepositResponse);
        }

        return response;
    }

    public ResponseDto<DepositsResponse> getDeposits(DepositsRequest depositsRequest) {

        ResponseDto<DepositsResponse> response = new ResponseDto<>();
        DepositsResponse depositsResponse = depositService.getDeposits(depositsRequest);

        if (depositsResponse.isSessionExpired()) {
            depositsResponse = depositService.getDeposits(depositsRequest);
        }

        if (depositsResponse.isError()) {
            response.setError(true);
            response.setMessage(depositsResponse.getErrorMessage());
            response.setResponseData(depositsResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositsResponse);
        }

        return response;
    }

    public ResponseDto<DepositsResponse> getLegalDeposits(LegalDepositsRequest depositsRequest) {

        ResponseDto<DepositsResponse> response = new ResponseDto<>();
        DepositsResponse depositsResponse = depositService.getLegalDeposits(depositsRequest);

        if (depositsResponse.isSessionExpired()) {
            depositsResponse = depositService.getLegalDeposits(depositsRequest);
        }

        if (depositsResponse.isError()) {
            response.setError(true);
            response.setMessage(depositsResponse.getErrorMessage());
            response.setResponseData(depositsResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositsResponse);
        }

        return response;
    }

    public ResponseDto<GetCardsResponse> getDepositCards(GetCardsRequest getCardsRequest) {

        ResponseDto<GetCardsResponse> response = new ResponseDto<>();
        GetCardsResponse cardsResponse = depositService.getDepositCards(getCardsRequest);

        if (cardsResponse.isSessionExpired()) {
            cardsResponse = depositService.getDepositCards(getCardsRequest);
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

    public ResponseDto<DepositCustomersResponse> getDepositCustomers(DepositCustomersRequest depositCustomersRequest) {

        ResponseDto<DepositCustomersResponse> response = new ResponseDto<>();
        DepositCustomersResponse depositCustomersResponse = depositService.getDepositCustomers(depositCustomersRequest);

        if (depositCustomersResponse.isSessionExpired()) {
            depositCustomersResponse = depositService.getDepositCustomers(depositCustomersRequest);
        }

        if (depositCustomersResponse.isError()) {
            response.setError(true);
            response.setMessage(depositCustomersResponse.getErrorMessage());
            response.setResponseData(depositCustomersResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositCustomersResponse);
        }

        return response;
    }

    public ResponseDto<DepositCustomersResponse> getLegalDepositCustomers(DepositCustomersRequest depositCustomersRequest) {

        ResponseDto<DepositCustomersResponse> response = new ResponseDto<>();
        DepositCustomersResponse depositCustomersResponse = depositService.getLegalDepositCustomers(depositCustomersRequest);

        if (depositCustomersResponse.isSessionExpired()) {
            depositCustomersResponse = depositService.getLegalDepositCustomers(depositCustomersRequest);
        }

        if (depositCustomersResponse.isError()) {
            response.setError(true);
            response.setMessage(depositCustomersResponse.getErrorMessage());
            response.setResponseData(depositCustomersResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositCustomersResponse);
        }

        return response;
    }

    public ResponseDto<DepositBalanceResponse> getDepositBalance(DepositBalanceRequest depositBalanceRequest) {

        ResponseDto<DepositBalanceResponse> response = new ResponseDto<>();
        DepositBalanceResponse depositBalanceResponse = depositService.getDepositBalance(depositBalanceRequest);

        if (depositBalanceResponse.isSessionExpired()) {
            depositBalanceResponse = depositService.getDepositBalance(depositBalanceRequest);
        }

        if (depositBalanceResponse.isError()) {
            response.setError(true);
            response.setMessage(depositBalanceResponse.getErrorMessage());
            response.setResponseData(depositBalanceResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositBalanceResponse);
        }

        return response;
    }

    public ResponseDto<DepositBalanceResponse> getLegalDepositBalance(DepositBalanceRequest depositBalanceRequest) {

        ResponseDto<DepositBalanceResponse> response = new ResponseDto<>();
        DepositBalanceResponse depositBalanceResponse = depositService.getLegalDepositBalance(depositBalanceRequest);

        if (depositBalanceResponse.isSessionExpired()) {
            depositBalanceResponse = depositService.getLegalDepositBalance(depositBalanceRequest);
        }

        if (depositBalanceResponse.isError()) {
            response.setError(true);
            response.setMessage(depositBalanceResponse.getErrorMessage());
            response.setResponseData(depositBalanceResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositBalanceResponse);
        }

        return response;
    }

    public ResponseDto<StatementsResponse> getStatements(StatementsRequest statementsRequest) {

        ResponseDto<StatementsResponse> response = new ResponseDto<>();
        StatementsResponse statementsResponse = depositService.getStatements(statementsRequest);

        if (statementsResponse.isSessionExpired()) {
            statementsResponse = depositService.getStatements(statementsRequest);
        }

        if (statementsResponse.isError()) {
            response.setError(true);
            response.setMessage(statementsResponse.getErrorMessage());
            response.setResponseData(statementsResponse);
        } else {
            response.setError(false);
            response.setResponseData(statementsResponse);
        }

        return response;
    }

    public ResponseDto<IbanConvertorDto> ibanToDepositNumber(IbanConvertorDto ibanConvertorRequest) {

        ResponseDto<IbanConvertorDto> response = new ResponseDto<>();
        IbanConvertorDto ibanConvertorResponse = depositService.ibanToDepositNumber(ibanConvertorRequest);

        if (ibanConvertorResponse.isError()) {
            response.setError(true);
            response.setMessage(ibanConvertorResponse.getErrorMessage());
            response.setResponseData(ibanConvertorResponse);
        } else {
            response.setError(false);
            response.setResponseData(ibanConvertorResponse);
        }

        return response;
    }

    public ResponseDto<IbanConvertorDto> depositNumberToIban(IbanConvertorDto ibanConvertorRequest) {

        ResponseDto<IbanConvertorDto> response = new ResponseDto<>();
        IbanConvertorDto ibanConvertorResponse = depositService.depositNumberToIban(ibanConvertorRequest);

        if (ibanConvertorResponse.isError()) {
            response.setError(true);
            response.setMessage(ibanConvertorResponse.getErrorMessage());
            response.setResponseData(ibanConvertorResponse);
        } else {
            response.setError(false);
            response.setResponseData(ibanConvertorResponse);
        }

        return response;
    }

    public ResponseDto<IbanInfoResponse> getIbanInfo(IbanInfoRequest ibanInfoRequest) {

        ResponseDto<IbanInfoResponse> response = new ResponseDto<>();
        IbanInfoResponse ibanInfoResponse = depositService.getIbanInfo(ibanInfoRequest);

        if (ibanInfoResponse.isSessionExpired()) {
            ibanInfoResponse = depositService.getIbanInfo(ibanInfoRequest);
        }

        if (ibanInfoResponse.isError()) {
            response.setError(true);
            response.setMessage(ibanInfoResponse.getErrorMessage());
            response.setResponseData(ibanInfoResponse);
        } else {
            response.setError(false);
            response.setResponseData(ibanInfoResponse);
        }

        return response;
    }

    public ResponseDto<OwnerInquiryResponse> inquiryOwnerDeposit(OwnerInquiryRequest ownerInquiryRequest) {

        ResponseDto<OwnerInquiryResponse> response = new ResponseDto<>();
        OwnerInquiryResponse depositInquiryResponse = depositService.inquiryDepositNumber(ownerInquiryRequest);

        if (depositInquiryResponse.isSessionExpired()) {
            depositInquiryResponse = depositService.inquiryDepositNumber(ownerInquiryRequest);
        }

        if (depositInquiryResponse.isError()) {
            response.setError(true);
            response.setMessage(depositInquiryResponse.getErrorMessage());
            response.setResponseData(depositInquiryResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositInquiryResponse);
        }

        return response;
    }

    public ResponseDto<OwnerInquiryResponse> inquiryOwnerIban(OwnerInquiryRequest ownerInquiryRequest) {

        ResponseDto<OwnerInquiryResponse> response = new ResponseDto<>();
        OwnerInquiryResponse ibanInquiryResponse = depositService.inquiryIban(ownerInquiryRequest);

        if (ibanInquiryResponse.isSessionExpired()) {
            ibanInquiryResponse = depositService.inquiryIban(ownerInquiryRequest);
        }

        if (ibanInquiryResponse.isError()) {
            response.setError(true);
            response.setMessage(ibanInquiryResponse.getErrorMessage());
            response.setResponseData(ibanInquiryResponse);
        } else {
            response.setError(false);
            response.setResponseData(ibanInquiryResponse);
        }

        return response;
    }

    public ResponseDto<TransactionReasonResponse> getAchTransactionReason() {

        ResponseDto<TransactionReasonResponse> response = new ResponseDto<>();
        TransactionReasonResponse transactionReasonResponse = depositService.getAchTransactionReason();

        if (transactionReasonResponse.isSessionExpired()) {
            transactionReasonResponse = depositService.getAchTransactionReason();
        }

        if (transactionReasonResponse.isError()) {
            response.setError(true);
            response.setMessage(transactionReasonResponse.getErrorMessage());
            response.setResponseData(transactionReasonResponse);
        } else {
            response.setError(false);
            response.setResponseData(transactionReasonResponse);
        }

        return response;
    }

    public ResponseDto<TransactionReasonResponse> getRtgsTransactionReason() {

        ResponseDto<TransactionReasonResponse> response = new ResponseDto<>();
        TransactionReasonResponse transactionReasonResponse = depositService.getRtgsTransactionReason();

        if (transactionReasonResponse.isSessionExpired()) {
            transactionReasonResponse = depositService.getRtgsTransactionReason();
        }

        if (transactionReasonResponse.isError()) {
            response.setError(true);
            response.setMessage(transactionReasonResponse.getErrorMessage());
            response.setResponseData(transactionReasonResponse);
        } else {
            response.setError(false);
            response.setResponseData(transactionReasonResponse);
        }

        return response;
    }

    public ResponseDto<DepositTransferResponse> depositTransfer(DepositTransferRequest depositTransferRequest) {

        ResponseDto<DepositTransferResponse> response = new ResponseDto<>();
        DepositTransferResponse depositTransferResponse = depositService.depositTransfer(depositTransferRequest);

        if (depositTransferResponse.isSessionExpired()) {
            depositTransferResponse = depositService.depositTransfer(depositTransferRequest);
        }

        if (depositTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(depositTransferResponse.getErrorMessage());
            response.setResponseData(depositTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositTransferResponse);
        }

        return response;
    }

    public ResponseDto<AchTransferResponse> achTransfer(AchTransferRequest achTransferRequest) {

        ResponseDto<AchTransferResponse> response = new ResponseDto<>();
        AchTransferResponse achTransferResponse = depositService.achTransfer(achTransferRequest);

        if (achTransferResponse.isSessionExpired()) {
            achTransferResponse = depositService.achTransfer(achTransferRequest);
        }

        if (achTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(achTransferResponse.getErrorMessage());
            response.setResponseData(achTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(achTransferResponse);
        }

        return response;
    }

    public ResponseDto<RtgsTransferResponse> rtgsTransfer(RtgsTransferRequest rtgsTransferRequest) {

        ResponseDto<RtgsTransferResponse> response = new ResponseDto<>();
        RtgsTransferResponse rtgsTransferResponse = depositService.rtgsTransfer(rtgsTransferRequest);

        if (rtgsTransferResponse.isSessionExpired()) {
            rtgsTransferResponse = depositService.rtgsTransfer(rtgsTransferRequest);
        }

        if (rtgsTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(rtgsTransferResponse.getErrorMessage());
            response.setResponseData(rtgsTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(rtgsTransferResponse);
        }

        return response;
    }

    public ResponseDto<CartableRtgsTransferResponse> cartableRtgsTransfer(RtgsTransferRequest rtgsTransferRequest) {

        ResponseDto<CartableRtgsTransferResponse> response = new ResponseDto<>();
        CartableRtgsTransferResponse cartableRtgsTransferResponse = depositService.cartableRtgsTransfer(rtgsTransferRequest);

        if (cartableRtgsTransferResponse.isSessionExpired()) {
            cartableRtgsTransferResponse = depositService.cartableRtgsTransfer(rtgsTransferRequest);
        }

        if (cartableRtgsTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(cartableRtgsTransferResponse.getErrorMessage());
            response.setResponseData(cartableRtgsTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(cartableRtgsTransferResponse);
        }

        return response;
    }

    public ResponseDto<UnlimitedRtgsTransferResponse> unlimitedRtgsTransfer(UnlimitedRtgsTransferRequest unlimitedRtgsTransferRequest) {

        ResponseDto<UnlimitedRtgsTransferResponse> response = new ResponseDto<>();
        UnlimitedRtgsTransferResponse unlimitedRtgsTransferResponse = depositService.unlimitedRtgsTransfer(unlimitedRtgsTransferRequest);

        if (unlimitedRtgsTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(unlimitedRtgsTransferResponse.getErrorMessage());
            response.setResponseData(unlimitedRtgsTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(unlimitedRtgsTransferResponse);
        }

        return response;
    }

    public ResponseDto<InstantTransferResponse> instantTransfer(InstantTransferRequest instantTransferRequest) {

        ResponseDto<InstantTransferResponse> response = new ResponseDto<>();
        InstantTransferResponse instantTransfer = depositService.instantTransfer(instantTransferRequest);

        if (instantTransfer.isSessionExpired()) {
            instantTransfer = depositService.instantTransfer(instantTransferRequest);
        }

        if (instantTransfer.isError()) {
            response.setError(true);
            response.setMessage(instantTransfer.getErrorMessage());
            response.setResponseData(instantTransfer);
        } else {
            response.setError(false);
            response.setResponseData(instantTransfer);
        }

        return response;
    }

    public ResponseDto<DepositsResponse> getDepositsWithoutCard(DepositsRequest depositsRequest) {

        ResponseDto<DepositsResponse> response = new ResponseDto<>();
        Card cardService = new YaghutCardService();
        DepositsResponse depositsResponse = depositService.getDeposits(depositsRequest);
        GetCardsRequest getCardsRequest = new GetCardsRequest();
        getCardsRequest.setCardStatus(CardStatus.OK);
        getCardsRequest.setCif(depositsRequest.getCif());
        GetCardsResponse cardsResponse = cardService.getCards(getCardsRequest);

        if (depositsResponse.isSessionExpired()) {
            depositsResponse = depositService.getDeposits(depositsRequest);
        }

        if (depositsResponse.isSessionExpired()) {
            cardsResponse = cardService.getCards(getCardsRequest);
        }

        if (depositsResponse.isError() || cardsResponse.isError()) {
            response.setError(true);
            response.setMessage(depositsResponse.getErrorMessage());
            response.setResponseData(depositsResponse);
        } else {
            response.setError(false);
            if (depositsResponse.getDeposits().isEmpty() || cardsResponse.getCards().isEmpty()) {
                response.setResponseData(depositsResponse);
            } else {
                DepositsResponse depositsResponseWithoutCard = new DepositsResponse();
                List<DepositDto> depositsWithoutCard = new ArrayList<>();
                List<String> cardsDepositNumbers = cardsResponse.getCards().stream().map(x -> x.getDepositNumber()).collect(Collectors.toList());

                for (int i = 0; i < depositsResponse.getDeposits().size(); i++) {

                    if (!cardsDepositNumbers.contains(depositsResponse.getDeposits().get(i).getDepositNumber().replaceAll("-", "."))) {
                        depositsWithoutCard.add(depositsResponse.getDeposits().get(i));
                    }
                }
                depositsWithoutCard.removeIf(x -> x.getDepositOwnerType().equals(DepositOwnerType.MOSHTARAK)
                        && !x.getDepositWithdrawalOption().equals(DepositWithdrawalOption.BE_TANHAYEE));
                depositsResponseWithoutCard.setCount(depositsWithoutCard.size());
                depositsResponseWithoutCard.setDeposits(depositsWithoutCard);
                response.setResponseData(depositsResponseWithoutCard);
            }
        }

        return response;
    }

    public ResponseDto<GetDepositAverageResponse> getDepositsAverage(GetDepositAverageRequest getDepositAverageRequest) {

        ResponseDto<GetDepositAverageResponse> response = new ResponseDto<>();

        GetDepositAverageResponse getDepositAverageResponse = depositService.getDepositsAverage(getDepositAverageRequest);

        if (getDepositAverageResponse.isSessionExpired()) {
            getDepositAverageResponse = depositService.getDepositsAverage(getDepositAverageRequest);
        }

        if (getDepositAverageResponse.isError()) {
            response.setError(true);
            response.setMessage(getDepositAverageResponse.getErrorMessage());
            response.setResponseData(getDepositAverageResponse);
        } else {
            response.setError(false);
            response.setResponseData(getDepositAverageResponse);
        }

        return response;

    }

    public ResponseDto<DepositTransferResponse> depositTransferByThirdParty(DepositTransferRequest depositTransferRequest) {

        ResponseDto<DepositTransferResponse> response = new ResponseDto<>();
        DepositTransferResponse depositTransferResponse = depositService.depositTransfer(depositTransferRequest);

        if (depositTransferResponse.isSessionExpired()) {
            depositTransferResponse = depositService.depositTransfer(depositTransferRequest);
        }

        if (depositTransferResponse.isError()) {
            response.setError(true);
            response.setMessage(depositTransferResponse.getErrorMessage());
            response.setResponseData(depositTransferResponse);
        } else {
            response.setError(false);
            response.setResponseData(depositTransferResponse);
        }

        return response;
    }


}
