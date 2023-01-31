package com.rahand.sina.integration.provider.faraboom.util;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.inquiry.dto.*;
import com.rahand.sina.integration.provider.faraboom.dto.FaraboomErrorResponse;
import com.rahand.sina.integration.provider.tefas.util.TefasRestClient;
import okhttp3.Response;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FaraboomUtil {

    public static WaterBillInfo mapToWaterBillInfo(Response response) {

        WaterBillInfo waterBillInfo = new WaterBillInfo();
        String responseJson;

        try {
            responseJson = response.body().string();

        } catch (IOException e) {
            CommonUtil.logError(TefasRestClient.class.getSimpleName(), "mapToWaterBillInfo", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        Map<String, String> responseMap = CommonUtil.jsonToMap(responseJson);
        waterBillInfo.setBillId(responseMap.get("bill_id"));
        waterBillInfo.setPayId(responseMap.get("pay_id"));
        waterBillInfo.setAmount(new BigDecimal(String.valueOf(responseMap.get("amount"))));
        waterBillInfo.setOwnerName(responseMap.get("owner_name"));

        return waterBillInfo;
    }

    public static GasBillInfo mapToGasBillInfo(Response response) {

        GasBillInfo gasBillInfo = new GasBillInfo();
        String responseJson;

        try {
            responseJson = response.body().string();

        } catch (IOException e) {
            CommonUtil.logError(FaraboomUtil.class.getSimpleName(), "mapToGasBillInfo", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        Map responseMap = CommonUtil.jsonToMap(responseJson);
        gasBillInfo.setBillId(String.valueOf(responseMap.get("bill_id")));
        gasBillInfo.setPayId(String.valueOf(responseMap.get("pay_id")));
        gasBillInfo.setAmount(new BigDecimal(String.valueOf(responseMap.get("amount"))));
        gasBillInfo.setOwnerName(String.valueOf(responseMap.get("owner_name")));
        return gasBillInfo;
    }

    public static ElectricityBillInfo mapToElectricityBillInfo(Response response) {

        ElectricityBillInfo electricityBillInfo = new ElectricityBillInfo();
        String responseJson;

        try {
            responseJson = response.body().string();
        } catch (IOException e) {
            CommonUtil.logError(FaraboomUtil.class.getSimpleName(), "mapToElectricityBillInfo", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        Map responseMap = CommonUtil.jsonToMap(responseJson);
        electricityBillInfo.setBillId(String.valueOf(responseMap.get("bill_id")));
        electricityBillInfo.setPayId(String.valueOf(responseMap.get("pay_id")));
        electricityBillInfo.setAmount(new BigDecimal(String.valueOf(responseMap.get("amount"))));
        electricityBillInfo.setOwnerName(String.valueOf(responseMap.get("customer_name")));
        return electricityBillInfo;
    }

    public static TelephoneBillInfo mapToTelephoneBillInfo(Response response) {

        TelephoneBillInfo telephoneBillInfo = new TelephoneBillInfo();
        String responseJson;

        try {
            responseJson = response.body().string();

        } catch (IOException e) {
            CommonUtil.logError(FaraboomUtil.class.getSimpleName(), "mapToTelephoneBillInfo", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        Map<String, String> responseMap = CommonUtil.jsonToMap(responseJson);
        telephoneBillInfo.setBillId(String.valueOf(responseMap.get("bill_id")));
        telephoneBillInfo.setPayId(String.valueOf(responseMap.get("pay_id")));
        telephoneBillInfo.setAmount(new BigDecimal(String.valueOf(responseMap.get("amount"))));


        return telephoneBillInfo;
    }

    public static MobileBillInfo mapToMobileBillInfo(Response response) {

        MobileBillInfo mobileBillInfo = new MobileBillInfo();
        String responseJson;

        try {
            responseJson = response.body().string();

        } catch (IOException e) {
            CommonUtil.logError(FaraboomUtil.class.getSimpleName(), "mapToMobileBillInfo", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        Map<String, String> responseMap = CommonUtil.jsonToMap(responseJson);
        mobileBillInfo.setBillId(String.valueOf(responseMap.get("bill_id")));
        mobileBillInfo.setPayId(String.valueOf(responseMap.get("pay_id")));
        mobileBillInfo.setAmount(new BigDecimal(String.valueOf(responseMap.get("amount"))));
        return mobileBillInfo;
    }

    public static RahvarBillInfo mapToRahvarBillInfo(Response response) {

        RahvarBillInfo rahvarBillInfo = new RahvarBillInfo();
        String responseJson;

        try {
            responseJson = response.body().string();

        } catch (IOException e) {
            CommonUtil.logError(FaraboomUtil.class.getSimpleName(), "mapToRahvarBillInfo", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        Map<String, String> responseMap = CommonUtil.jsonToMap(responseJson);

        return rahvarBillInfo;
    }

    public static LocalDateTime millisecondToLocalDateTime(Long millisecond) {

        Date date = new Date(millisecond);
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millisecond), ZoneId.systemDefault());
    }

    public static String responseBodyToString(Response response) {

        String responseString = "";

        try {
            responseString = response.body().string();
        } catch (IOException e) {
            CommonUtil.logError(FaraboomUtil.class.getSimpleName(), "responseBodyToString", e.getMessage());
        }

        return responseString;
    }

    public static FaraboomErrorResponse mapToErrorResponse(String json) {

        FaraboomErrorResponse errorResponse = new FaraboomErrorResponse();

        Map errorMap = CommonUtil.jsonToMap(json);
        List<LinkedHashMap> errorList = (List<LinkedHashMap>) errorMap.get("errors");
        errorResponse.setRefId(String.valueOf(errorMap.get("ref_id")));
        errorResponse.setErrors(CommonUtil.jsonToListOfObject(CommonUtil.toJson(errorList), FaraboomErrorResponse.FaraboomError.class));

        return errorResponse;
    }

}
