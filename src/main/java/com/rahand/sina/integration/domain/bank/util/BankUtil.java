package com.rahand.sina.integration.domain.bank.util;

import com.rahand.bpm.framework.bpmEngine.reporting.ReportingUtil;
import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.ResponseDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.service.BankCustomerService;
import com.rahand.sina.integration.domain.bank.service.DepositService;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class BankUtil {

    public static String createDepositInfoJson(DepositsResponse depositsResponse) {

        String json = "";

        List<Map<String, String>> jsonList = new ArrayList<>();
        for (int i = 0; i < depositsResponse.getDeposits().size(); i++) {

            Map<String, String> jsonMap = new HashMap<>();

            DepositDto depositDto = depositsResponse.getDeposits().get(i);

            jsonMap.put("description", depositDto.getDepositNumber());
            jsonMap.put("detail", depositDto.getDepositNumber());
            jsonMap.put("duration", depositDto.getDepositTitle());
            jsonMap.put("durationCat", depositDto.getDepositTitle());
            jsonMap.put("price", String.valueOf(depositDto.getAvailableBalance().longValue()));
            jsonMap.put("operator", "");
            jsonMap.put("id", String.valueOf(i + 1));
            jsonList.add(jsonMap);

        }

        json = CommonUtil.toJson(jsonList);

        return json;
    }

    public static String createCardsInfoJson(GetCardsResponse getCardsResponse) {
        String json = "";
        List<Map<String, String>> jsonList = new ArrayList<>();
        for (int i = 0; i < getCardsResponse.getCards().size(); i++) {
            Map<String, String> jsonMap = new HashMap<>();
            BankCardDto bankCardDto = getCardsResponse.getCards().get(i);
            jsonMap.put("description", "");
            jsonMap.put("detail", "");
            jsonMap.put("duration", bankCardDto.getPan());
            jsonMap.put("durationCat", bankCardDto.getPan());
            jsonMap.put("price", "");
            jsonMap.put("operator", "");
            jsonMap.put("id", String.valueOf(i + 1));
            jsonList.add(jsonMap);
        }
        json = CommonUtil.toJson(jsonList);
        return json;
    }

    public static String createCardListForTransfer(GetCardsResponse getCardsResponse) {
        String json = "";
        List<Map<String, String>> jsonList = new ArrayList<>();
        for (int i = 0; i < getCardsResponse.getCards().size(); i++) {
            BankCardDto bankCardDto = getCardsResponse.getCards().get(i);
            Map<String, String> jsonMap = new HashMap<>();
            jsonMap.put("title", "");
            jsonMap.put("type", bankCardDto.getPan());
            jsonMap.put("fee", "");
            jsonList.add(jsonMap);

        }
        json = CommonUtil.toJson(jsonList);
        return json;
    }

    public static String createInvoicesInfoJson(StatementsResponse statementsResponse) {

        String json = "";

        List<StatementDto> statements = statementsResponse.getStatements();
        NumberFormat myFormat = NumberFormat.getInstance();
        List<Map<String, String>> jsonList = new ArrayList<>();
        for (int i = 0; i < statements.size(); i++) {
            Map<String, String> jsonMap = new LinkedHashMap<>();
            StatementDto statementDto = statements.get(i);
            BigDecimal amount = statementDto.getAmount();
            jsonMap.put("مبلغ (ریال)", myFormat.format(Math.abs(amount.longValue())));
            jsonMap.put("تاریخ تراکنش", statementDto.getPersianDate());
            jsonMap.put("سریال تراکنش", statementDto.getSerial());
            jsonMap.put("شرح", statementDto.getDescription());
            jsonMap.put("نوع تراکنش", amount.intValue() < 0 ? "برداشت" : "واریز");
            jsonMap.put("مانده (ریال)",myFormat.format(statementDto.getBalance()));
            jsonList.add(jsonMap);
        }
        json = CommonUtil.toJson(jsonList);

        return json;
    }

    public static String createCardListsJson() {

        List<Map<String, String>> jsonList = new ArrayList<>();
        ResultSet resultSet = null;
        String quiry = "select u.desc_ , u.pvalue from xti22config u where u.pname ='CardIssuanceFee' and u.customername='SinaBank' AND u.groupname='Guides'";
        try {
            resultSet = ReportingUtil.executeSelectSqlQuery(quiry);

            while (resultSet.next()) {
                Map<String, String> jsonMap = new HashMap<>();
                jsonMap.put("title", "لیست کارت ها");
                jsonMap.put("type", resultSet.getString(1));
                jsonMap.put("fee", resultSet.getString(2));

                jsonList.add(jsonMap);

            }
        } catch (Exception e) {
            CommonUtil.logError(BankUtil.class.getSimpleName(), "createCardListsJson", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }
        return CommonUtil.toJson(jsonList);
    }

    public static String createAddressJson(String nationalCode) {

        String json = "";
        BankCustomerService bankCustomerService = new BankCustomerService();
        CustomerInfoDetailRequest customerInfoDetailRequest = new CustomerInfoDetailRequest();
        customerInfoDetailRequest.setIdentityCode(nationalCode);
        ResponseDto<CustomerInfoDetailResponse> customerInfoDetailResponse = bankCustomerService.getCustomerDetailInfo(customerInfoDetailRequest);
        CustomerInfoDetailResponse customerInfo = customerInfoDetailResponse.getResponseData();
        List<Address> addressList = customerInfo.getAddresses();

        List<Map<String, String>> jsonList = new ArrayList<>();
        for (int i = 0; i < addressList.size(); i++) {
            Map<String, String> jsonMap = new LinkedHashMap<>();
            jsonMap.put("title", addressList.get(i).getPostalAddress());
            jsonMap.put("type", addressList.get(i).getPostalCode());
            jsonMap.put("fee", "0");
            jsonList.add(jsonMap);

        }
        json = CommonUtil.toJson(jsonList);
        return json;
    }

    public static String createBranchListJson() {
        List<Map<String, String>> jsonList = new ArrayList<>();
        ResultSet resultSet = null;
        String quiry = "select a.branchid , a.branchcode  , a.name , level level_  , connect_by_isleaf ,\n" +
                "       prior sys_connect_by_path(a.name , '/') parent_path ,\n" +
                "       sys_connect_by_path(a.name , '/') path_ \n" +
                "from xti22branch a connect by prior a.branchid = a.parentbranchid\n" +
                "start with parentbranchid = 0";
        try {
            resultSet = ReportingUtil.executeSelectSqlQuery(quiry);
            while (resultSet.next()) {
                Map<String, String> jsonMap = new HashMap<>();
                jsonMap.put("description", resultSet.getString(6));
                jsonMap.put("detail", resultSet.getString(7));
                jsonMap.put("duration", "لیست شعب");
                jsonMap.put("durationCat", "");
                jsonMap.put("price", resultSet.getString(2));
                jsonMap.put("operator", "");
                jsonMap.put("id", resultSet.getString(1));
                jsonList.add(jsonMap);
            }
        } catch (Exception e) {
            CommonUtil.logError(BankUtil.class.getSimpleName(), "createBranchListJson", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }
        return CommonUtil.toJson(jsonList);
    }

    public static String depositBalanceInfoInquiry(String depositNumber, String balance, String availableBalance) throws IOException {
        String json = "";
        Map<String, String> jsonMap = new LinkedHashMap<>();
        jsonMap.put("شرح", "دریافت موجودی سپرده");
        jsonMap.put("شماره سپرده", depositNumber);
        jsonMap.put("موجودی واقعی", balance + " " + "ریال");
        jsonMap.put("موجودی قابل برداشت", availableBalance + " " + "ریال");
        json = CommonUtil.toJson(jsonMap);

        return json;
    }

    public static void dateValidation(String fromDate, String toDate) {

        LocalDateTime fromDateTime = CommonUtil.perisanDateToLocalDateTime(fromDate);
        LocalDateTime toDateTime = CommonUtil.perisanDateToLocalDateTime(toDate);

        if (toDateTime.isBefore(fromDateTime)) {
            throw new CustomRuntimeException("بازه زمانی وارد شده نامتعبر است");
        }
        Long daysInterval = ChronoUnit.DAYS.between(fromDateTime, toDateTime);

        if (daysInterval > 365) {
            throw new CustomRuntimeException("بازه زمانی دریافت صورتحساب نمی تواند بیشتر از یک سال باشد");
        }

    }

    public static String prepareDataInTransfer(String destinationAddress, Integer amount) {
        String destinationType = "";
        if (destinationAddress.length() == 24 || destinationAddress.length() == 26) {
            if (amount <= 50000000) {
                destinationType = "Paya";
            } else {
                destinationType = "RTGS";
            }
        } else if (destinationAddress.length() == 16) {
            destinationType = "CardToCard";
        } else {
            DepositService depositService = new DepositService();
            OwnerInquiryRequest ownerInquiryRequest = new OwnerInquiryRequest();
            ownerInquiryRequest.setDepositNumber(destinationAddress);
            ResponseDto<OwnerInquiryResponse> responseDto = depositService.inquiryOwnerDeposit(ownerInquiryRequest);
            if (responseDto.isError()) {
                throw new CustomRuntimeException("آدرس مقصد صحیح نمی باشد.");
            } else {
                destinationType = "DepositToDeposit";
            }
        }
        return destinationType;
    }

    public static String calculationMoneyTransferFees(String destinationType, Integer amount) {
        String transferFee = "";
        double count;
        if (destinationType == "CardToCard") {
            if (amount <= 10000000) {
                transferFee = "6000";
            } else if (10000000 < amount && amount <= 20000000) {
                transferFee = "8400";
            } else if (20000000 < amount && amount <= 30000000) {
                transferFee = "10800";
            } else if (30000000 < amount && amount <= 40000000) {
                transferFee = "13200";
            } else if (40000000 < amount && amount <= 50000000) {
                transferFee = "15600";
            } else if (50000000 < amount && amount <= 60000000) {
                transferFee = "18000";
            } else if (60000000 < amount && amount <= 70000000) {
                transferFee = "20400";
            } else if (70000000 < amount && amount <= 80000000) {
                transferFee = "22800";
            } else if (80000000 < amount && amount <= 90000000) {
                transferFee = "25200";
            } else if (90000000 < amount && amount <= 100000000) {
                transferFee = "27600";
            }
        } else if (destinationType == "DepositToDeposit") {
            transferFee = "0";
        } else if (destinationType == "Paya") {
            count = (0.01 * amount) / 100;
            if (count < 2000) {
                count = 2000;
            } else if (count > 25000) {
                count = 25000;
            }
            transferFee = String.valueOf(BigDecimal.valueOf(count).intValue());
        } else if (destinationType == "RTGS") {
            count = (0.02 * amount) / 100;
            if (count > 250000) {
                count = 250000;
            }
            transferFee = String.valueOf(BigDecimal.valueOf(count).intValue());
        }
        return transferFee;
    }

    public static String getIssueCardsReportJson() {

        String json = "";

        return json;

    }

    public static String maskCardPan(String pan) {

        String maskedPan = null;

        String partOwn = pan.substring(0, 4);
        String partTwo = pan.substring(4, 8);
        partTwo = partTwo.replace(String.valueOf(partTwo.charAt(3)), "*");
        partTwo = partTwo.replace(String.valueOf(partTwo.charAt(2)), "*");
        String partThree = pan.substring(8, 12);
        String partFour = pan.substring(12);
        maskedPan = String.format("%s%s%s%s", partOwn, partTwo, "****", partFour);

        return maskedPan;

    }

    public static String maskDeposit(String depositNumber) {

        String[] strings = depositNumber.split("-");

        String partOwn = strings[0];
        String partTwo = strings[1];
        String partThree = strings[2];
        String partFour = strings[3];

        partThree = partThree.replaceAll("[0-9]", "*");

        return String.format("%s-%s-%s-%s", partOwn, partTwo, partThree, partFour);

    }

    public static String getBankName(String cardNumber) {

        String bankName = "";

        cardNumber = cardNumber.substring(0, 6);
        switch (cardNumber) {

            case "636214":
                bankName = "بانک آینده";
                break;

            case "627381":
                bankName = "بانک انصار";
                break;

            case "505785":
                bankName = "بانک ایران زمین";
                break;

            case "622106":
            case "627884":
            case "639194":
                bankName = "بانک پارسیان";
                break;

            case "502229":
            case "639347":
                bankName = "بانک پاسارگاد";
                break;

            case "627760":
                bankName = "پست بانک ایران";
                break;

            case "585983":
            case "627353":
                bankName = "بانک تجارت";
                break;

            case "502908":
                bankName = "بانک توسعه تعاون";
                break;

            case "504172":
                bankName = "بانک رسالت";
                break;

            case "207177":
            case "627648":
                bankName = "بانک توسعه صادرات";
                break;

            case "636949":
                bankName = "بانک حکمت ایرانیان";
                break;

            case "585947":
                bankName = "بانک خاورمیانه";
                break;

            case "627412":
                bankName = "بانک اقتصاد نوین";
                break;

            case "502938":
                bankName = "بانک دی";
                break;

            case "589463":
                bankName = "بانک رفاه کارگران";
                break;

            case "621986":
                bankName = "بانک سامان";
                break;

            case "589210":
                bankName = "بانک سپه";
                break;

            case "639607":
                bankName = "بانک سرمایه";
                break;

            case "639346":
                bankName = "بانک سینا";
                break;

            case "504706":
            case "502806":
                bankName = "بانک شهر";
                break;

            case "603769":
                bankName = "بانک صادرات ایران";
                break;

            case "627961":
                bankName = "بانک صنعت و معدن";
                break;

            case "639599":
                bankName = "بانک قوامین";
                break;

            case "627488":
            case "502910":
                bankName = "بانک کارآفرین";
                break;

            case "639217":
            case "603770":
                bankName = "بانک کشاورزی";
                break;

            case "505416":
                bankName = "بانک گردشگری";
                break;

            case "636795":
                bankName = "بانک مرکزی";
                break;

            case "628023":
                bankName = "بانک مسکن";
                break;

            case "991975":
            case "610433":
                bankName = "بانک ملت";
                break;

            case "603799":
                bankName = "بانک ملی ایران";
                break;

            case "606373":
                bankName = "بانک قرض الحسنه مهر ایران";
                break;

            case "505801":
                bankName = "موسسه کوثر";
                break;

            case "606256":
                bankName = "موسسه اعتباری ملل";
                break;

            case "628157":
                bankName = "موسسه اعتباری توسعه";
                break;

            case "639370":
                bankName = "بانک مهر اقتصاد";
                break;
            case "581874":
                bankName = "ایران ونزوئلا";
                break;

            default:
                bankName = "";
        }

        return bankName;
    }

    public static String getBankNameByIban(String iban) {

        String bankName = "";

        String bankCode = iban.substring(4, 7);

        switch (bankCode) {

            case "010":
                bankName = "بانک مرکزی";
                break;
            case "011":
                bankName = "بانک صنعت و معدن";
                break;
            case "012":
                bankName = "بانک ملت";
                break;
            case "013":
                bankName = "بانک رفاه کارگران";
                break;
            case "014":
                bankName = "بانک مسکن";
                break;
            case "015":
                bankName = "بانک سپه";
                break;
            case "016":
                bankName = "بانک کشاورزی";
                break;
            case "017":
                bankName = "بانک ملی ایران";
                break;
            case "018":
                bankName = "بانک تجارت";
                break;
            case "019":
                bankName = "بانک صادرات ایران";
                break;
            case "020":
                bankName = "بانک توسعه صادرات";
                break;
            case "021":
                bankName = "پست بانک ایران";
                break;
            case "022":
                bankName = "بانک توسعه تعاون";
                break;
            case "051":
                bankName = "موسسه اعتباری توسعه";
                break;
            case "052":
                bankName = "بانک قوامین";
                break;
            case "053":
                bankName = "بانک کارآفرین";
                break;
            case "054":
                bankName = "بانک پارسیان";
                break;
            case "055":
                bankName = "بانک اقتصاد نوین";
                break;
            case "056":
                bankName = "بانک سامان";
                break;
            case "057":
                bankName = "بانک پاسارگاد";
                break;
            case "058":
                bankName = "بانک سرمایه";
                break;
            case "059":
                bankName = "بانک سینا";
                break;
            case "060":
                bankName = "بانک مهر ایران";
                break;
            case "062":
                bankName = "بانک آینده";
                break;
            case "063":
                bankName = "بانک انصار";
                break;
            case "064":
                bankName = "بانک گردشگری";
                break;
            case "065":
                bankName = "بانک حکمت ایرانیان";
                break;
            case "066":
                bankName = "بانک دی";
                break;
            case "069":
                bankName = "بانک ایران زمین";
                break;
            case "070":
                bankName = "بانک قرض الحسنه رسالت";
                break;
            case "073":
                bankName = "موسسه اعتباری کوثر";
                break;
            case "075":
                bankName = "موسسه اعتباری ملل";
                break;
            case "078":
                bankName = "بانک خاورمیانه";
                break;
            case "079":
                bankName = "بانک مهر اقتصاد";
                break;
            case "080":
                bankName = "موسسه اعتباری نور";
                break;
            case "090":
                bankName = "بانک مهر ایران";
                break;
            case "095":
                bankName = "بانک ایران ونزوئلا";
                break;

            default:
                bankName = "";
        }

        return bankName;
    }

    public static String getBankNameByDepositNumber(String DepositNumber) {

        String bankName = "";

        IbanConvertorDto ibanConvertorDto = new DepositService().depositNumberToIban(IbanConvertorDto.builder()
                .depositNumber(DepositNumber).build()).getResponseData();

        bankName = ibanConvertorDto.isError() ? bankName : getBankNameByIban(ibanConvertorDto.getIban());

        return bankName;
    }

}
