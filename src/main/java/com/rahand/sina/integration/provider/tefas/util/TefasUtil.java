package com.rahand.sina.integration.provider.tefas.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.provider.tefas.dto.TefasBaseResponse;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;

public class TefasUtil {

    public static TefasBaseResponse mapToBaseResponse(Response response, Class responseType) {

        TefasBaseResponse tefasBaseResponse;

        try {
            ObjectMapper mapper = new ObjectMapper();
            Map responseMap = mapper.readValue(response.body().string(), Map.class);
            tefasBaseResponse = mapper.readValue(mapper.writeValueAsString(responseMap.get("message")), TefasBaseResponse.class);
            tefasBaseResponse.setResponseModel(mapper.readValue(mapper.writeValueAsString(tefasBaseResponse.getModelClass()), responseType));

        } catch (JsonMappingException | JsonGenerationException | JsonParseException e) {
            CommonUtil.logError(TefasUtil.class.getSimpleName(), "mapToBaseResponse", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        } catch (IOException e) {
            CommonUtil.logError(TefasUtil.class.getSimpleName(), "mapToBaseResponse", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return tefasBaseResponse;

    }

    public static String responseBodyToString(Response response){

        String responseString = "";
        try {
            responseString = response.body().string();
            if (responseString.equals("")){
                responseString = response.toString();
            }
        } catch (IOException e) {
            CommonUtil.logError(TefasUtil.class.getSimpleName(), "responseBodyToString", e.getMessage());
        }

        return responseString;
    }
}
