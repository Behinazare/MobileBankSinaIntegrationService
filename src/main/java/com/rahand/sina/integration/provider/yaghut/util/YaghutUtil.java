package com.rahand.sina.integration.provider.yaghut.util;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.bank.dto.IbanConvertorDto;
import com.rahand.sina.integration.domain.bank.service.DepositService;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoginResponseBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ContextEntry;
import org.apache.commons.lang.math.RandomUtils;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class YaghutUtil {

    public static void loadSslCertificate() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL mainInput = classLoader.getResource(IntegrationLibConfig.getProperty("CERTIFICATE_FILE_NAME"));
        String certificateFilePath;
        try {
            certificateFilePath = Paths.get(mainInput.toURI()).toFile().getPath();
        } catch (URISyntaxException e) {
            CommonUtil.logError(YaghutUtil.class.getSimpleName(), "loadSslCertificate", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        System.setProperty("javax.net.ssl.keyStore", certificateFilePath);
        System.setProperty("javax.net.ssl.keyStoreType", IntegrationLibConfig.getProperty("CERTIFICATE_FILE_TYPE"));
        System.setProperty("javax.net.ssl.keyStorePassword", IntegrationLibConfig.getProperty("CERTIFICATE_FILE_PASSWORD"));

    }

    public static com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[] createYaghutSessionContext(LoginResponseBean loginResponse) {
        return new com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[]{
                new com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry("SESSIONID", loginResponse.getSessionId())};
    }

    public static com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[] createYaghutCustomContext(LoginResponseBean loginResponse, Map<String, String> map) {

        com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[] entries = new com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry[map.size() + 1];
        entries[0] = new com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry("SESSIONID", loginResponse.getSessionId());
        for (int i = 0; i < map.size(); i++) {
            Set<String> keys = map.keySet();
            String key = keys.toArray()[i].toString();
            entries[i + 1] = new com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ContextEntry(key, map.get(key));
        }

        return entries;
    }

    public static ContextEntry[] createYaghutBpmsSessionContext(
            com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.LoginResponseBean loginResponse) {

        return new ContextEntry[]{
                new ContextEntry("SESSIONID", loginResponse.getSessionId())};
    }


    public static Calendar localDateTimeToCalender(LocalDateTime localDateTime) {

        Calendar calendar = Calendar.getInstance();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        calendar.setTime(date);
        return calendar;
    }


    public static LocalDateTime CalenderToLocalDateTime(Calendar calendar) {
        return LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId());
    }

    public static boolean checkInvalidSessionException(String exception) {
        return exception.equals("InvalidSessionWSException");
    }

    public static String generateTrackerId() {
        return String.valueOf(RandomUtils.nextLong());
    }

    public static String generateRRN() {

        String trackCNumber = "";
        Long uniqNumber = System.currentTimeMillis() % 10000000L;
        SecureRandom secureRandom = new SecureRandom();
        Integer randomNumber = secureRandom.nextInt(999999);
        trackCNumber = String.format("%s%s", uniqNumber, randomNumber);
        return trackCNumber;
    }

    public static String generateOrderId() {

        String trackCNumber = "";
        Long uniqNumber = System.currentTimeMillis() % 10000000L;
        SecureRandom secureRandom = new SecureRandom();
        Integer randomNumber = secureRandom.nextInt(999999);
        trackCNumber = String.format("%s%s", uniqNumber, randomNumber);
        return trackCNumber;
    }

    public static String getBankNameByIban(String iban) {

        String bankName = null;
        String query = "select a.bankname from XTI22BANKS  a  , xti22cartbankinfo b where a.id = b.bankid and a.cbicode= ?";
        String bankCode = iban.substring(4, 7);
        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {
            preparedStatement.setString(1, bankCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                bankName = resultSet.getString(1);
            }
        } catch (SQLException e) {
            CommonUtil.logError(YaghutUtil.class.getSimpleName(), "getBankNameByIban", e.getMessage());
            bankName = null;
        }

        return bankName;
    }

    public static String getBankNameByCardNumber(String cardNumber) {

        String bankName = null;
        String query = "select a.bankname from XTI22BANKS  a  , xti22cartbankinfo b where a.id = b.bankid and b.precartnumber = ?";
        String bankCode = cardNumber.substring(0, 6);
        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {
            preparedStatement.setString(1, bankCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                bankName = resultSet.getString(1);
            }
        } catch (SQLException e) {
            CommonUtil.logError(YaghutUtil.class.getSimpleName(), "getBankNameByIban", e.getMessage());
            bankName = null;
        }

        return bankName;
    }

    public static String getBankNameByDepositNumber(String DepositNumber) {

        String bankName = null;

        String query = "select a.bankname from XTI22BANKS  a  , xti22cartbankinfo b where a.id = b.bankid and a.cbicode= ?";
        IbanConvertorDto ibanConvertorDto = new DepositService().depositNumberToIban(IbanConvertorDto.builder()
                .depositNumber(DepositNumber).build()).getResponseData();
        String iban = ibanConvertorDto.isError() ? null : ibanConvertorDto.getIban();

        if (iban != null){
            String bankCode = iban.substring(4, 7);
            try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {
                preparedStatement.setString(1, bankCode);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    bankName = resultSet.getString(1);
                }
            } catch (SQLException e) {
                CommonUtil.logError(YaghutUtil.class.getSimpleName(), "getBankNameByIban", e.getMessage());
                bankName = null;
            }
        }


        return bankName;
    }

}
