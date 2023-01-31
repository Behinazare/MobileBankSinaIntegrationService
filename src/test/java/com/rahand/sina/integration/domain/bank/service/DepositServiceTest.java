package com.rahand.sina.integration.domain.bank.service;

import com.rahand.common.dto.ResponseDto;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.DepositPersonalityType;
import com.rahand.sina.integration.domain.bank.enums.SignatureStatus;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DepositServiceTest {

    @Test
    public void getDeposits() {

        DepositService depositService = new DepositService();
        DepositsRequest depositsRequest = new DepositsRequest();
        depositsRequest.setCif("2295556");
        depositsRequest.setDepositPersonalityType(DepositPersonalityType.ACTUAL);
        ResponseDto<DepositsResponse> responseDto = depositService.getDeposits(depositsRequest);
        DepositsResponse depositsResponse = responseDto.getResponseData();

    }

    @Test
    public void openDeposit() {

        DepositService depositService = new DepositService();

        OpenDepositRequest.OpenAmountSources openAmountSource = OpenDepositRequest.OpenAmountSources.builder()
                .type("account")
                .data(OpenDepositRequest.Data.builder()
                        .amount(new BigDecimal("1"))
                        .signerIds(Arrays.asList(2618257))
                        .description("")
                        .comment("")
                        .accountId(OpenDepositRequest.AccountId.builder()
                                .branchCode(114)
                                .typeCode(2286)
                                .serial(3)
                                .build())
                        .build())
                .build();

        List<OpenDepositRequest.OpenAmountSources> openAmountSources = new ArrayList<>();
        openAmountSources.add(openAmountSource);

        OpenDepositRequest.CustomersInfo customersInfo = OpenDepositRequest.CustomersInfo.builder()
                .customerId(2618257)
                .relationCode(0)
                .sharePercent(100)
                .build();

        List<OpenDepositRequest.CustomersInfo> customersInfos = new ArrayList<>();
        customersInfos.add(customersInfo);

        OpenDepositRequest.Signs sign = OpenDepositRequest.Signs.builder()
                .customerId(2618257)
                .signSerial(1)
                .build();

        List<OpenDepositRequest.Signs> signs = new ArrayList<>();
        signs.add(sign);

        OpenDepositRequest openDepositRequest = OpenDepositRequest.builder()
                .customerId(2618257)
                .typeCode(800)
                .depositCreateOptionsDTO(OpenDepositRequest.DepositCreateOptionsDTO.builder()
                        .branchCode(396)
                        .currency("IRR")
                        .hasCard(1)
                        .openAmountSources(openAmountSources)
                        .customersInfo(customersInfos)
                        .signs(signs)
                        .build())
                .depositContextDTO(OpenDepositRequest.DepositContextDTO.builder()
                        .customerId(2618257)
                        .ignoreCustomerToDepositRelation(false)
                        .build()
                )
                .build();

        ResponseDto<OpenDepositResponse> response = depositService.openDeposit(openDepositRequest);
        OpenDepositResponse openDepositResponse = response.getResponseData();
    }

    @Test
    public void getDepositCards() {

        DepositService depositService = new DepositService();
        GetCardsRequest getCardsRequest = new GetCardsRequest();
        getCardsRequest.setCif("2295556");
        getCardsRequest.setDepositNumber("119-813-2618257-1");
        ResponseDto<GetCardsResponse> responseDto = depositService.getDepositCards(getCardsRequest);
        GetCardsResponse cardsResponse = responseDto.getResponseData();

    }

    @Test
    public void getStatements() {

        DepositService depositService = new DepositService();
        StatementsRequest statementsRequest = new StatementsRequest();
        statementsRequest.setDepositNumber("393-4-2104878-1");
        statementsRequest.setFromDate(CommonUtil.perisanDateToLocalDateTime("1401/01/18"));
        statementsRequest.setToDate(CommonUtil.perisanDateToLocalDateTime("1401/07/18"));
        ResponseDto<StatementsResponse> responseDto = depositService.getStatements(statementsRequest);
        StatementsResponse statementsResponse = responseDto.getResponseData();
    }

    @Test
    public void getDepositBalance() {

        DepositService depositService = new DepositService();
        DepositBalanceRequest depositBalanceRequest = new DepositBalanceRequest();
        depositBalanceRequest.setDepositNumber("116-800-947418-1");
        depositBalanceRequest.setCif("947418");
        ResponseDto<DepositBalanceResponse> responseDto = depositService.getDepositBalance(depositBalanceRequest);
        DepositBalanceResponse depositBalanceResponse = responseDto.getResponseData();
    }

    @Test
    public void inquiryOwnerDeposit() {

        DepositService depositService = new DepositService();
        OwnerInquiryRequest ownerInquiryRequest = new OwnerInquiryRequest();
        ownerInquiryRequest.setDepositNumber("393-4-2104878-1");
        ResponseDto<OwnerInquiryResponse> responseDto = depositService.inquiryOwnerDeposit(ownerInquiryRequest);
        OwnerInquiryResponse ownerInquiryResponse = responseDto.getResponseData();

    }

    @Test
    public void inquiryOwnerIban() {
        DepositService depositService = new DepositService();
        OwnerInquiryRequest ownerInquiryRequest = new OwnerInquiryRequest();
        ownerInquiryRequest.setIban("IR660590011680000947418001");
        ResponseDto<OwnerInquiryResponse> responseDto = depositService.inquiryOwnerIban(ownerInquiryRequest);
        OwnerInquiryResponse ownerInquiryResponse = responseDto.getResponseData();

    }

    @Test
    public void getIbanInfo() {

        DepositService depositService = new DepositService();
        IbanInfoRequest ibanInfoRequest = new IbanInfoRequest();
        ibanInfoRequest.setIban("IR660590011680000947418001");
        ResponseDto<IbanInfoResponse> responseDto = depositService.getIbanInfo(ibanInfoRequest);
        IbanInfoResponse ibanInfoResponse = responseDto.getResponseData();

    }

    @Test
    public void ibanToDepositNumber() {

        DepositService depositService = new DepositService();
        IbanConvertorDto ibanConvertorDto = new IbanConvertorDto();
        ibanConvertorDto.setIban("IR870640011099920880007001");
        ResponseDto<IbanConvertorDto> responseDto = depositService.ibanToDepositNumber(ibanConvertorDto);
        IbanConvertorDto ibanConvertorResponse = responseDto.getResponseData();


    }

    @Test
    public void depositNumberToIban() {

        DepositService depositService = new DepositService();
        IbanConvertorDto ibanConvertorDto = new IbanConvertorDto();
        ibanConvertorDto.setDepositNumber("119-813-2295556-1");
        ResponseDto<IbanConvertorDto> responseDto = depositService.depositNumberToIban(ibanConvertorDto);
        IbanConvertorDto ibanConvertorResponse = responseDto.getResponseData();

    }

    @Test
    public void achTransfer() {

        DepositService depositService = new DepositService();
        AchTransferRequest achTransferRequest = new AchTransferRequest();
        achTransferRequest.setCif("2295556");
        achTransferRequest.setAmount(BigDecimal.valueOf(1000000));
        achTransferRequest.setSourceDepositNumber("119-813-2295556-1");
        achTransferRequest.setDestinationIbanNumber("IR420570077700000034861001");
        achTransferRequest.setReceiverFullName("رضا قاسمپور");
        achTransferRequest.setDescription("test ach");
        achTransferRequest.setTransferDescription("تست پایا");
        achTransferRequest.setReasonCode("GPAC");
        achTransferRequest.setReasonTitle("هزينه عمومي و امور روزمره");
        ResponseDto<AchTransferResponse> responseDto = depositService.achTransfer(achTransferRequest);
        AchTransferResponse achTransferResponse = responseDto.getResponseData();

    }

    @Test
    public void rtgsTransfer() {

        DepositService depositService = new DepositService();
        RtgsTransferRequest rtgsTransferRequest = new RtgsTransferRequest();
        rtgsTransferRequest.setCif("2295556");
        rtgsTransferRequest.setAmount(BigDecimal.valueOf(100000000));
        rtgsTransferRequest.setSourceDepositNumber("119-813-2295556-1");
        rtgsTransferRequest.setDestinationIbanNumber("IR420570077700000034861001");
        rtgsTransferRequest.setReceiverFirstName("رضا");
        rtgsTransferRequest.setReceiverLastName("قاسمپور");
        rtgsTransferRequest.setDescription("test rtgs");
        rtgsTransferRequest.setTransferDescription("تست ساتنا");
        rtgsTransferRequest.setReasonCode("GPAC");
        rtgsTransferRequest.setReasonTitle("هزينه عمومي و امور روزمره");
        ResponseDto<RtgsTransferResponse> responseDto = depositService.rtgsTransfer(rtgsTransferRequest);
        RtgsTransferResponse rtgsTransferResponse = responseDto.getResponseData();
    }

    @Test
    public void depositTransfer() {

        DepositService depositService = new DepositService();
        DepositTransferRequest depositTransferRequest = new DepositTransferRequest();
        depositTransferRequest.setAmount(BigDecimal.valueOf(10000000));
        depositTransferRequest.setCif("2295556");
        depositTransferRequest.setSourceDepositNumber("119-813-2295556-1");
        depositTransferRequest.setDestinationDepositNumber("119-813-6040494-1");
        depositTransferRequest.setSourceComment("یادداشت واریز کننده");
        depositTransferRequest.setDestinationComment("یادداشت برای دریافت کننده");
        depositTransferRequest.setReceiverFullName("منيره کرمي");
//        depositTransferRequest.setPayId("123654789");
        ResponseDto<DepositTransferResponse> responseDto = depositService.depositTransfer(depositTransferRequest);
        DepositTransferResponse depositTransferResponse = responseDto.getResponseData();
    }

    @Test
    public void getAchTransactionReason() {

        DepositService depositService = new DepositService();
        ResponseDto<TransactionReasonResponse> responseDto = depositService.getAchTransactionReason();
        TransactionReasonResponse transactionReasonResponse = responseDto.getResponseData();
    }

    @Test
    public void getRtgsTransactionReason() {

        DepositService depositService = new DepositService();
        ResponseDto<TransactionReasonResponse> responseDto = depositService.getRtgsTransactionReason();
        TransactionReasonResponse transactionReasonResponse = responseDto.getResponseData();
    }

    @Test
    public void unlimitedRtgsTransfer() {

        DepositService depositService = new DepositService();
        UnlimitedRtgsTransferRequest unlimitedRtgsTransferRequest = new UnlimitedRtgsTransferRequest();
        unlimitedRtgsTransferRequest.setCif("2295556");
        unlimitedRtgsTransferRequest.setSourceDepositNumber("119-813-2295556-1");
        unlimitedRtgsTransferRequest.setAmount(BigDecimal.valueOf(1000000000));
        unlimitedRtgsTransferRequest.setDestinationIban("IR420570077700000034861001");
        unlimitedRtgsTransferRequest.setCreditorName("رضا");
        unlimitedRtgsTransferRequest.setCreditorLastName("قاسمپور");
        unlimitedRtgsTransferRequest.setReasonCode("CDAP");
        List<String> strings = new ArrayList<>();
        strings.add("2295556");
        unlimitedRtgsTransferRequest.setSignersCif(strings);

        ResponseDto<UnlimitedRtgsTransferResponse> responseDto = depositService.unlimitedRtgsTransfer(unlimitedRtgsTransferRequest);
        UnlimitedRtgsTransferResponse unlimitedRtgsTransferResponse = responseDto.getResponseData();
    }

    @Test
    public void instantTransfer() {
        DepositService depositService = new DepositService();
        InstantTransferRequest instantTransferRequest = new InstantTransferRequest();
        instantTransferRequest.setAmount(BigDecimal.valueOf(300000));
        instantTransferRequest.setCif("2295556");
        instantTransferRequest.setSourceDepositNumber("119-813-2295556-1");
        instantTransferRequest.setDestinationIbanNumber("IR110590011981302295556001");
        instantTransferRequest.setReceiverFullName("رضا قاسمپور");
        instantTransferRequest.setReasonCode("GPAC");
        instantTransferRequest.setReasonTitle("هزينه عمومي و امور روزمره");
        ResponseDto<InstantTransferResponse> responseDto = depositService.instantTransfer(instantTransferRequest);
        InstantTransferResponse instantTransferResponse = responseDto.getResponseData();
    }

    @Test
    public void getDepositCustomers() {

        DepositService depositService = new DepositService();
        DepositCustomersRequest depositCustomersRequest = new DepositCustomersRequest();
        depositCustomersRequest.setDepositNumber("393-4-2104878-1");
        depositCustomersRequest.setCif("2104878");
        depositCustomersRequest.setAttachedSignature(true);
        depositCustomersRequest.setLength(100l);
        depositCustomersRequest.setOffset(0l);
        ResponseDto<DepositCustomersResponse> responseDto = depositService.getDepositCustomers(depositCustomersRequest);
        DepositCustomersResponse depositCustomersResponse = responseDto.getResponseData();
    }

    @Test
    public void getDepositsWithoutCard() {

        DepositService depositService = new DepositService();
        DepositsRequest depositsRequest = new DepositsRequest();
        depositsRequest.setCif("2730769");
        ResponseDto<DepositsResponse> responseDto = depositService.getDepositsWithoutCard(depositsRequest);
        DepositsResponse depositsResponse = responseDto.getResponseData();

    }

    @Test
    public void getLegalDeposits() {
        DepositService depositService = new DepositService();
        LegalDepositsRequest depositsRequest = new LegalDepositsRequest();
        depositsRequest.setUserName(EncryptionService.encrypt("Sa2104878").getEncryptedData());
        depositsRequest.setPassword(EncryptionService.encrypt("04520374").getEncryptedData());
        depositsRequest.setCif("2104878");
        depositsRequest.setSignatureStatus(SignatureStatus.OWNER_OF_DEPOSIT_AND_SIGNATURE);
        depositsRequest.setDepositPersonalityType(DepositPersonalityType.LEGAL);
        depositsRequest.setDepositNumbers(Arrays.asList("393-4-2104878-1"));
        ResponseDto<DepositsResponse> responseDto = depositService.getLegalDeposits(depositsRequest);
        DepositsResponse depositsResponse = responseDto.getResponseData();
    }

    @Test
    public void getLegalDepositBalance() {
        DepositService depositService = new DepositService();
        DepositBalanceRequest depositBalanceRequest = new DepositBalanceRequest();
        depositBalanceRequest.setDepositNumber("393-4-2104878-1");
        depositBalanceRequest.setCif("2104878");
        depositBalanceRequest.setUserName(EncryptionService.encrypt("Sa2104878").getEncryptedData());
        depositBalanceRequest.setPassword(EncryptionService.encrypt("04520374").getEncryptedData());
        ResponseDto<DepositBalanceResponse> responseDto = depositService.getLegalDepositBalance(depositBalanceRequest);
        DepositBalanceResponse depositBalanceResponse = responseDto.getResponseData();
    }

    @Test
    public void getLegalDepositCustomers() {

        DepositService depositService = new DepositService();
        DepositCustomersRequest depositCustomersRequest = new DepositCustomersRequest();
        depositCustomersRequest.setDepositNumber("393-4-2104878-1");
        depositCustomersRequest.setCif("2104878");
        depositCustomersRequest.setAttachedSignature(true);
        depositCustomersRequest.setLength(100l);
        depositCustomersRequest.setOffset(0l);
        depositCustomersRequest.setUserName(EncryptionService.encrypt("Sa2104878").getEncryptedData());
        depositCustomersRequest.setPassword(EncryptionService.encrypt("04520374").getEncryptedData());
        ResponseDto<DepositCustomersResponse> responseDto = depositService.getDepositCustomers(depositCustomersRequest);
        DepositCustomersResponse depositCustomersResponse = responseDto.getResponseData();

    }

    @Test
    public void cartableRtgsTransfer() {

        DepositService depositService = new DepositService();
        RtgsTransferRequest rtgsTransferRequest = new RtgsTransferRequest();
        rtgsTransferRequest.setCif("");
        rtgsTransferRequest.setAmount(BigDecimal.valueOf(100000000));
        rtgsTransferRequest.setSourceDepositNumber("");
        rtgsTransferRequest.setDestinationIbanNumber("");
        rtgsTransferRequest.setReceiverFirstName("");
        rtgsTransferRequest.setReceiverLastName("");
        rtgsTransferRequest.setDescription("");
        rtgsTransferRequest.setTransferDescription("");
        rtgsTransferRequest.setReasonCode("");
        rtgsTransferRequest.setReasonTitle("");
        ResponseDto<CartableRtgsTransferResponse> responseDto = depositService.cartableRtgsTransfer(rtgsTransferRequest);
        CartableRtgsTransferResponse cartableRtgsTransferResponse = responseDto.getResponseData();
    }

    @Test
    public void getDepositsAverage() {

        DepositService depositService = new DepositService();
        GetDepositAverageRequest getDepositAverageRequest = new GetDepositAverageRequest();
        getDepositAverageRequest.setCif("");
        List<String> depositNumbers = new ArrayList<>();
        depositNumbers.add("393-4-2104878-1");
        getDepositAverageRequest.setDepositNumbers(depositNumbers);
        getDepositAverageRequest.setFrom(CommonUtil.perisanDateToLocalDateTime("1401/01/01"));
        getDepositAverageRequest.setTo(CommonUtil.perisanDateToLocalDateTime("1401/11/01"));

        ResponseDto<GetDepositAverageResponse> response = depositService.getDepositsAverage(getDepositAverageRequest);
        GetDepositAverageResponse getDepositAverageResponse = response.getResponseData();
    }

    @Test
    public void depositTransferByThirdParty() {

        DepositService depositService = new DepositService();
        DepositTransferRequest depositTransferRequest = new DepositTransferRequest();
        depositTransferRequest.setAmount(BigDecimal.valueOf(10000000));
        depositTransferRequest.setCif("2295556");
        depositTransferRequest.setSourceDepositNumber("119-813-2295556-1");
        depositTransferRequest.setDestinationDepositNumber("119-813-6040494-1");
        depositTransferRequest.setSourceComment("یادداشت واریز کننده");
        depositTransferRequest.setDestinationComment("یادداشت برای دریافت کننده");
        depositTransferRequest.setReceiverFullName("منيره کرمي");
        ResponseDto<DepositTransferResponse> responseDto = depositService.depositTransferByThirdParty(depositTransferRequest);
        DepositTransferResponse depositTransferResponse = responseDto.getResponseData();

    }
}