package com.rahand.sina.integration.provider.faraboom.service;

import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.dto.*;
import com.rahand.sina.integration.domain.inquiry.enums.BillTerm;
import com.rahand.sina.integration.domain.inquiry.enums.BillType;
import com.rahand.sina.integration.domain.inquiry.service.spec.BillInquiry;
import com.rahand.sina.integration.provider.faraboom.constants.FaraboomConstant;
import com.rahand.sina.integration.provider.faraboom.util.FaraboomRestClient;
import com.rahand.sina.integration.provider.faraboom.util.FaraboomUtil;
import okhttp3.Response;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FaraboomBillService implements BillInquiry {

    private final static String BASE_URL = FaraboomConstant.BASE_URL;

    @Override
    public BillInquiryResponse billInquiry(BillInquiryRequest billInquiryRequest) {

        if (billInquiryRequest.getBillType().equals(BillType.RAHVAR)) {
            throw new CustomRuntimeException("به زودی استعلام خلافی خودور فعال خواهد شد.");
        }

        BillInquiryResponse billInquiryResponse = new BillInquiryResponse();

        switch (billInquiryRequest.getBillType()) {
            case WATER:
                WaterBillInfo waterBillInfo = waterBillInquiry(billInquiryRequest);

                billInquiryResponse.setBillType(BillType.WATER);

                if (waterBillInfo.isError()) {
                    billInquiryResponse.setError(waterBillInfo.isError());
                    billInquiryResponse.setErrorMessage(waterBillInfo.getErrorMessage());
                } else {
                    billInquiryResponse.setPaid(waterBillInfo.isPaid());
                    billInquiryResponse.setBillInfo(waterBillInfo);
                    billInquiryResponse.setInquiryJson(waterBillInfo.getInquiryJson());
                }

                break;
            case GAS:
                GasBillInfo gasBillInfo = gasBillInquiry(billInquiryRequest);

                billInquiryResponse.setBillType(BillType.GAS);

                if (gasBillInfo.isError()) {
                    billInquiryResponse.setError(gasBillInfo.isError());
                    billInquiryResponse.setErrorMessage(gasBillInfo.getErrorMessage());
                } else {
                    billInquiryResponse.setPaid(gasBillInfo.isPaid());
                    billInquiryResponse.setBillInfo(gasBillInfo);
                    billInquiryResponse.setInquiryJson(gasBillInfo.getInquiryJson());
                }

                break;
            case MOBILE:
                MobileBillInfo mobileBillInfo = mobileBillInquiry(billInquiryRequest);

                billInquiryResponse.setBillType(BillType.MOBILE);

                if (mobileBillInfo.isError()) {
                    billInquiryResponse.setError(mobileBillInfo.isError());
                    billInquiryResponse.setErrorMessage(mobileBillInfo.getErrorMessage());
                } else {
                    billInquiryResponse.setPaid(mobileBillInfo.isPaid());
                    billInquiryResponse.setBillInfo(mobileBillInfo);
                    billInquiryResponse.setInquiryJson(mobileBillInfo.getInquiryJson());
                }

                break;
            case TELEPHONE:
                TelephoneBillInfo telephoneBillInfo = telephoneBillInquiry(billInquiryRequest);

                billInquiryResponse.setBillType(BillType.TELEPHONE);

                if (telephoneBillInfo.isError()) {
                    billInquiryResponse.setError(telephoneBillInfo.isError());
                    billInquiryResponse.setErrorMessage(telephoneBillInfo.getErrorMessage());
                } else {
                    billInquiryResponse.setPaid(telephoneBillInfo.isPaid());
                    billInquiryResponse.setBillInfo(telephoneBillInfo);
                    billInquiryResponse.setInquiryJson(telephoneBillInfo.getInquiryJson());
                }

                break;
            case ELECTRICITY:
                ElectricityBillInfo electricityBillInfo = electricityBillInquiry(billInquiryRequest);

                billInquiryResponse.setBillType(BillType.ELECTRICITY);

                if (electricityBillInfo.isError()) {
                    billInquiryResponse.setError(electricityBillInfo.isError());
                    billInquiryResponse.setErrorMessage(electricityBillInfo.getErrorMessage());
                } else {
                    billInquiryResponse.setPaid(electricityBillInfo.isPaid());
                    billInquiryResponse.setBillInfo(electricityBillInfo);
                    billInquiryResponse.setInquiryJson(electricityBillInfo.getInquiryJson());
                }

                break;
            case RAHVAR:
                RahvarBillInfo rahvarBillInfo = rahvarBillInquiry(billInquiryRequest);

                billInquiryResponse.setBillType(BillType.RAHVAR);

                if (rahvarBillInfo.isError()) {
                    billInquiryResponse.setError(rahvarBillInfo.isError());
                    billInquiryResponse.setErrorMessage(rahvarBillInfo.getErrorMessage());
                } else {
                    billInquiryResponse.setPaid(rahvarBillInfo.isPaid());
                    billInquiryResponse.setBillInfo(rahvarBillInfo);
                    billInquiryResponse.setInquiryJson(rahvarBillInfo.getInquiryJson());
                }

                break;
            default:
                billInquiryResponse.setError(true);
                billInquiryResponse.setErrorMessage("نوع قبض مورد نظر نامشخص است و امکان استعلام قبض وجود ندارد");
                CommonUtil.logError(getClass().getSimpleName(), "billInquiry", "Invalid billType");
        }
        if (billInquiryResponse.isPaid()) {
            billInquiryResponse.setExtraInfo("صورت حسابی برای پرداخت وجود ندارد. قبض پرداخت شده است.");
        }
        return billInquiryResponse;
    }

    @Override
    public BillInquiryResponse getBillInfo(BillInquiryRequest billInquiryRequest) {
        return null;
    }

    private WaterBillInfo waterBillInquiry(BillInquiryRequest billInquiryRequest) {

        WaterBillInfo waterBillInfo = new WaterBillInfo();

        String methodUrl = BASE_URL + "/vas/abfa/bills";

        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("bill_id", billInquiryRequest.getBillId());
        Response response = FaraboomRestClient.postRequest(methodUrl, requestMap, 30l);

        if (response.isSuccessful()) {
            waterBillInfo = FaraboomUtil.mapToWaterBillInfo(response);

            if (waterBillInfo.getPayId().equals("null") || waterBillInfo.getPayId().equals("0") || waterBillInfo.getBillId().equals("null") || waterBillInfo.getAmount().equals("null")
                    || waterBillInfo.getPayId().equals("0") || waterBillInfo.getBillId().equals("0") || waterBillInfo.getAmount().longValue() == 0) {
                waterBillInfo.setPaid(true);
            }

        } else {
            String errorResponse = FaraboomUtil.responseBodyToString(response);
            Map errorMap = CommonUtil.jsonToMap(errorResponse);
            List<LinkedHashMap> errorList = (List<LinkedHashMap>) errorMap.get("errors");
            String errorCode = String.valueOf(errorList.get(0).get("code"));
            String serverErrorMessage = String.valueOf(errorList.get(0).get("message"));
            waterBillInfo.setError(true);
            waterBillInfo.setErrorMessage(errorCode.equals("071") ? "شناسه قبض نامتعبر است" : serverErrorMessage);
            CommonUtil.logError(getClass().getSimpleName(), "waterBillInquiry", serverErrorMessage, ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponse)
                    .build());
        }

        response.close();

        return waterBillInfo;
    }

    private GasBillInfo gasBillInquiry(BillInquiryRequest billInquiryRequest) {

        GasBillInfo gasBillInfo = new GasBillInfo();

        String methodUrl = BASE_URL + "/vas/gas/bills";
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("customer_id", billInquiryRequest.getBillId());
        Response response = FaraboomRestClient.postRequest(methodUrl, requestMap, 30l);

        if (response.isSuccessful()) {

            gasBillInfo = FaraboomUtil.mapToGasBillInfo(response);


            if (gasBillInfo.getPayId().equals("null") || gasBillInfo.getPayId().equals("0") || gasBillInfo.getBillId().equals("null") || gasBillInfo.getAmount().equals("null")
                    || gasBillInfo.getPayId().equals("0") || gasBillInfo.getBillId().equals("0") || gasBillInfo.getAmount().longValue() == 0) {
                gasBillInfo.setPaid(true);
            }

        } else {
            String errorResponse = FaraboomUtil.responseBodyToString(response);
            Map errorMap = CommonUtil.jsonToMap(errorResponse);
            List<LinkedHashMap> errorList = (List<LinkedHashMap>) errorMap.get("errors");
            String errorCode = String.valueOf(errorList.get(0).get("code"));
            String serverErrorMessage = String.valueOf(errorList.get(0).get("message"));
            gasBillInfo.setError(true);
            gasBillInfo.setErrorMessage(errorCode.equals("071") ? "شناسه قبض نامتعبر است" : serverErrorMessage);
            CommonUtil.logError(getClass().getSimpleName(), "gasBillInquiry", serverErrorMessage,ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponse)
                    .build());
        }

        response.close();

        return gasBillInfo;
    }

    private MobileBillInfo mobileBillInquiry(BillInquiryRequest billInquiryRequest) {

        MobileBillInfo mobileBillInfo;
        mobileBillInfo = new MobileBillInfo();

        String methodUrl = BASE_URL + "/vas/mobile/bills";
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("mobile", billInquiryRequest.getBillId());
        requestMap.put("midterm", billInquiryRequest.isMidterm());
        Response response = FaraboomRestClient.postRequest(methodUrl, requestMap, 30l);

        if (response.isSuccessful()) {
            mobileBillInfo = FaraboomUtil.mapToMobileBillInfo(response);
            mobileBillInfo.setMobileNumber(billInquiryRequest.getBillId());

            if (mobileBillInfo.getPayId().equals("null") || mobileBillInfo.getBillId().equals("null") || mobileBillInfo.getAmount().equals("null")
                    || mobileBillInfo.getPayId().equals("0") || mobileBillInfo.getBillId().equals("0") || mobileBillInfo.getAmount().longValue() == 0) {
                mobileBillInfo.setPaid(true);
            }

            mobileBillInfo.setBillTerm(billInquiryRequest.isMidterm() ? BillTerm.MIDTERM : BillTerm.END_TERM);
        } else {
            String errorResponse = FaraboomUtil.responseBodyToString(response);
            Map errorMap = CommonUtil.jsonToMap(errorResponse);
            List<LinkedHashMap> errorList = (List<LinkedHashMap>) errorMap.get("errors");
            String errorCode = String.valueOf(errorList.get(0).get("code"));
            String serverErrorMessage = String.valueOf(errorList.get(0).get("message"));
            mobileBillInfo.setError(true);
            mobileBillInfo.setErrorMessage(errorCode.equals("071") ? "شماره موبایل نامعتبر است" : serverErrorMessage);
            CommonUtil.logError(getClass().getSimpleName(), "mobileBillInquiry", serverErrorMessage,ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponse)
                    .build());
        }

        response.close();

        return mobileBillInfo;
    }

    private TelephoneBillInfo telephoneBillInquiry(BillInquiryRequest billInquiryRequest) {

        TelephoneBillInfo telephoneBillInfo = new TelephoneBillInfo();

        String methodUrl = BASE_URL + "/vas/phone/bills";
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("phone", billInquiryRequest.getBillId());
        requestMap.put("midterm", billInquiryRequest.isMidterm());
        Response response = FaraboomRestClient.postRequest(methodUrl, requestMap, 30l);

        if (response.isSuccessful()) {

            telephoneBillInfo = FaraboomUtil.mapToTelephoneBillInfo(response);
            telephoneBillInfo.setTelephoneNumber(billInquiryRequest.getBillId());

            if (telephoneBillInfo.getPayId().equals("null") || telephoneBillInfo.getBillId().equals("null") || telephoneBillInfo.getAmount().equals("null")
                    || telephoneBillInfo.getPayId().equals("0") || telephoneBillInfo.getBillId().equals("0") || telephoneBillInfo.getAmount().longValue() == 0) {
                telephoneBillInfo.setPaid(true);
            }

            telephoneBillInfo.setBillTerm(billInquiryRequest.isMidterm() ? BillTerm.MIDTERM : BillTerm.END_TERM);

        } else {
            String errorResponse = FaraboomUtil.responseBodyToString(response);
            Map errorMap = CommonUtil.jsonToMap(errorResponse);
            List<LinkedHashMap> errorList = (List<LinkedHashMap>) errorMap.get("errors");
            String errorCode = String.valueOf(errorList.get(0).get("code"));
            String serverErrorMessage = String.valueOf(errorList.get(0).get("message"));
            telephoneBillInfo.setError(true);
            telephoneBillInfo.setErrorMessage(errorCode.equals("071") ? "شماره تلفن نامتعبر است" : serverErrorMessage);
            CommonUtil.logError(getClass().getSimpleName(), "telephoneBillInquiry", serverErrorMessage,ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponse)
                    .build());
        }

        response.close();

        return telephoneBillInfo;
    }

    private ElectricityBillInfo electricityBillInquiry(BillInquiryRequest billInquiryRequest) {

        ElectricityBillInfo electricityBillInfo = new ElectricityBillInfo();

        String methodUrl = BASE_URL + "/vas/tavanir/bills";
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("bill_id", billInquiryRequest.getBillId());
        Response response = FaraboomRestClient.postRequest(methodUrl, requestMap, 30l);

        if (response.isSuccessful()) {

            electricityBillInfo = FaraboomUtil.mapToElectricityBillInfo(response);


            if (electricityBillInfo.getPayId().equals("null") || electricityBillInfo.getPayId().equals("0") || electricityBillInfo.getBillId().equals("null") || electricityBillInfo.getAmount().equals("null")
                    || electricityBillInfo.getPayId().equals("0") || electricityBillInfo.getBillId().equals("0") || electricityBillInfo.getAmount().equals("0")) {
                electricityBillInfo.setPaid(true);
            }

        } else {
            String errorResponse = FaraboomUtil.responseBodyToString(response);
            Map errorMap = CommonUtil.jsonToMap(errorResponse);            List<LinkedHashMap> errorList = (List<LinkedHashMap>) errorMap.get("errors");
            String errorCode = String.valueOf(errorList.get(0).get("code"));
            String serverErrorMessage = String.valueOf(errorList.get(0).get("message"));
            electricityBillInfo.setError(true);
            electricityBillInfo.setErrorMessage(errorCode.equals("071") ? "شناسه قبض نامتعبر است" : serverErrorMessage);
            CommonUtil.logError(getClass().getSimpleName(), "electricityBillInquiry", serverErrorMessage,ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponse)
                    .build());
        }

        response.close();

        return electricityBillInfo;
    }

    private RahvarBillInfo rahvarBillInquiry(BillInquiryRequest billInquiryRequest) {

        RahvarBillInfo rahvarBillInfo = new RahvarBillInfo();

        String methodUrl = BASE_URL + "/vas/rahvar/fines";
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("barcode", billInquiryRequest.getBillId());
        Response response = FaraboomRestClient.postRequest(methodUrl, requestMap, 30l);

        if (response.isSuccessful()) {
            rahvarBillInfo = FaraboomUtil.mapToRahvarBillInfo(response);
        } else {
            String errorResponse = FaraboomUtil.responseBodyToString(response);
            Map errorMap = CommonUtil.jsonToMap(errorResponse);
            List<LinkedHashMap> errorList = (List<LinkedHashMap>) errorMap.get("errors");
            String errorCode = String.valueOf(errorList.get(0).get("code"));
            String serverErrorMessage = String.valueOf(errorList.get(0).get("message"));
            rahvarBillInfo.setError(true);
            rahvarBillInfo.setErrorMessage(errorCode.equals("071") ? "شناسه قبض نامتعبر است" : serverErrorMessage);
            CommonUtil.logError(getClass().getSimpleName(), "rahvarBillInquiry", serverErrorMessage,ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(requestMap))
                    .output(errorResponse)
                    .build());
        }

        response.close();

        return rahvarBillInfo;
    }
}
