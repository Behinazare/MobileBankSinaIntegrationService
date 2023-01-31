package com.rahand.sina.integration.provider.yaghut.service.user;


import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.DecryptResponse;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.domain.authentication.enums.AuthenticationRoleType;
import com.rahand.sina.integration.domain.authentication.service.AuthenticationService;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoginResponseBean;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserInfoRequestBean;
import com.rahand.sina.integration.provider.yaghut.service.bpms.YaghutBpmsProxy;
import com.rahand.sina.integration.provider.yaghut.service.user.dto.ChannelUser;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class YaghutUserService {

    public static Map<String, ChannelUser> CHANNEL_USER_SESSIONS = new HashMap<>();

    private final Lock THIRD_PARTY_LOCK = new ReentrantLock();
    private final Lock BPMS_LOCK = new ReentrantLock();

    public static boolean INVALID_THIRD_PARTY_SESSION_ID = true;
    public static boolean INVALID_BPMS_SESSION_ID = true;
    public static LoginResponseBean thirdPartyLoginResponse;
    public static com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.LoginResponseBean bpmsLoginResponse;

    private YaghutUserProxy yaghutUserProxy;

    private YaghutUserService() {
        yaghutUserProxy = new YaghutUserProxy();
    }

    public static YaghutUserService getInstance() {
        return YaghutUserService.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private final static YaghutUserService INSTANCE = new YaghutUserService();
    }

    public LoginResponseBean getSessionId(String userId) {

        LoginResponseBean loginResponseBean;

        String userInitiator = CommonUtil.getInitiatorFromContext();

        AuthenticationRoleType roleType = AuthenticationService.getRoleType(userInitiator);
        userId = userInitiator.replace("BR-", "");

        if (AuthenticationRoleType.CHANNEL_USER.equals(roleType)) {

            Optional<String> userChannelData = getChannelUserData(userId);

            if (userChannelData.isPresent()) {

                DecryptResponse decryptResponse = EncryptionService.decrypt(userChannelData.get());

                if (decryptResponse.isError()) {
                    throw new CustomRuntimeException("errorInDecryptData");
                } else {
                    Map<String, String> clientsData = CommonUtil.jsonToMap(decryptResponse.getDecryptedData());
                    String channelUser = String.valueOf(clientsData.get("Secure_ChannelUserName"));
                    String pass = String.valueOf(clientsData.get("Secure_ChannelPassword"));

                    loginResponseBean = getChannelUserSessionId(channelUser, pass, userId);
                }

            } else {
                CommonUtil.logError(getClass().getSimpleName(), "getSessionId", "BankUserChannelCertificateNotExist", ServiceLogsDto.builder()
                        .input(userId)
                        .output("BankUserChannelCertificateNotExist")
                        .build());
                throw new CustomRuntimeException("UserChannelCertificateNotExist");
            }

        } else if (AuthenticationRoleType.THIRD_PARTY.equals(roleType)) {

            loginResponseBean = getThirdPartySessionId();

        } else if (AuthenticationRoleType.UNKNOWN.equals(roleType)) {

            loginResponseBean = getThirdPartySessionId();

        } else {
            CommonUtil.logError(getClass().getSimpleName(), "getSessionId", "UnauthorizedUser", ServiceLogsDto.builder()
                    .input(userId)
                    .output("UnauthorizedUser")
                    .build());
            throw new CustomRuntimeException("UnauthorizedUser");

        }

        return loginResponseBean;
    }

    public LoginResponseBean getSessionIdForPublicServices(String userId) {

        LoginResponseBean loginResponseBean;

        String userInitiator = CommonUtil.getInitiatorFromContext();

        AuthenticationRoleType roleType = AuthenticationService.getRoleType(userInitiator);
        userId = userInitiator.replace("BR-", "");

        if (AuthenticationRoleType.CHANNEL_USER.equals(roleType)) {

            Optional<String> userChannelData = getChannelUserData(userId);

            if (userChannelData.isPresent()) {

                DecryptResponse decryptResponse = EncryptionService.decrypt(userChannelData.get());

                if (decryptResponse.isError()) {
                    throw new CustomRuntimeException("errorInDecryptData");
                } else {
                    Map<String, String> clientsData = CommonUtil.jsonToMap(decryptResponse.getDecryptedData());
                    String channelUser = String.valueOf(clientsData.get("Secure_ChannelUserName"));
                    String pass = String.valueOf(clientsData.get("Secure_ChannelPassword"));

                    loginResponseBean = getChannelUserSessionId(channelUser, pass, userId);
                }

            } else {
                loginResponseBean = getThirdPartySessionId();

            }

        } else if (AuthenticationRoleType.THIRD_PARTY.equals(roleType)) {

            loginResponseBean = getThirdPartySessionId();

        } else if (AuthenticationRoleType.UNKNOWN.equals(roleType)) {

            loginResponseBean = getThirdPartySessionId();

        } else {
            CommonUtil.logError(getClass().getSimpleName(), "getSessionId", "UnauthorizedUser", ServiceLogsDto.builder()
                    .input(userId)
                    .output("UnauthorizedUser")
                    .build());
            throw new CustomRuntimeException("UnauthorizedUser");

        }

        return loginResponseBean;
    }


    public LoginResponseBean getChannelUserSessionId(String userName, String password, String platformUserId) {

        LoginResponseBean loginResponseBean;

        if (CHANNEL_USER_SESSIONS.containsKey(platformUserId)) {
            ChannelUser channelUser = CHANNEL_USER_SESSIONS.get(platformUserId);
            if (channelUser.getSessionValidTime() > System.currentTimeMillis()) {
                loginResponseBean = channelUser.getLoginResponseBean();
            } else {
                loginResponseBean = loginByChannelUser(userName, password, platformUserId);
                Long validTime = Long.valueOf(IntegrationLibConfig.getProperty("YAGHUT_USER_SESSION_VALID_TIME_MINUTE")) * 60000;
                Long createTime = System.currentTimeMillis();
                channelUser = ChannelUser.builder()
                        .sessionCreateTime(createTime)
                        .sessionValidTime(createTime + validTime)
                        .loginResponseBean(loginResponseBean)
                        .sessionId(loginResponseBean.getSessionId())
                        .userName(userName)
                        .build();
                CHANNEL_USER_SESSIONS.put(platformUserId, channelUser);
            }
        } else {
            loginResponseBean = loginByChannelUser(userName, password, platformUserId);
            Long validTime = Long.valueOf(IntegrationLibConfig.getProperty("YAGHUT_USER_SESSION_VALID_TIME_MINUTE")) * 60000;
            Long createTime = System.currentTimeMillis();
            ChannelUser channelUser = ChannelUser.builder()
                    .sessionCreateTime(createTime)
                    .sessionValidTime(createTime + validTime)
                    .loginResponseBean(loginResponseBean)
                    .sessionId(loginResponseBean.getSessionId())
                    .userName(userName)
                    .build();
            CHANNEL_USER_SESSIONS.put(platformUserId, channelUser);
        }

        return loginResponseBean;
    }

    public LoginResponseBean getThirdPartySessionId() {

        if (YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID) {
            if (THIRD_PARTY_LOCK.tryLock()) {
                try {
                    loginByThirdpartyUser();
                } finally {
                    THIRD_PARTY_LOCK.unlock();
                }
            }
        }

        return thirdPartyLoginResponse;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.LoginResponseBean getBpmsSessionId() {

        if (YaghutUserService.INVALID_BPMS_SESSION_ID) {
            if (BPMS_LOCK.tryLock()) {
                try {
                    loginBpms();
                } finally {
                    BPMS_LOCK.unlock();
                }
            }
        }

        return bpmsLoginResponse;
    }

    private LoginResponseBean loginByThirdpartyUser() {

        UserInfoRequestBean userInfoRequest = new UserInfoRequestBean();
        userInfoRequest.setUsername(IntegrationLibConfig.getProperty("YAGHUT_MOB_APP_USER_NAME"));
        userInfoRequest.setPassword(IntegrationLibConfig.getProperty("YAGHUT_MOB_APP_PASSWORD"));

        try {
            thirdPartyLoginResponse = yaghutUserProxy.loginByUserInfo(userInfoRequest);
        } catch (RemoteException e) {
            CommonUtil.logError(getClass().getSimpleName(), "loginByThirdpartyUser", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(userInfoRequest))
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        YaghutUserService.INVALID_THIRD_PARTY_SESSION_ID = false;

        return thirdPartyLoginResponse;
    }

    private LoginResponseBean loginByChannelUser(String userName, String password, String userId) {

        LoginResponseBean loginResponseBean;
        UserInfoRequestBean userInfoRequest = new UserInfoRequestBean();
        userInfoRequest.setUsername(userName);
        userInfoRequest.setPassword(password);

        try {
            loginResponseBean = yaghutUserProxy.loginByUserInfo(userInfoRequest);
        } catch (RemoteException e) {
            if (YaghutCommonException.checkException(e, "InvalidCredentialsWSException")) {
                AuthenticationService.deleteChannelUserData(userId);

                CommonUtil.logError(getClass().getSimpleName(), "loginByUserInfo", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequest))
                        .output(e.toString())
                        .build());
                throw new RuntimeException("InvalidChannelUserPass");
            } else {
                CommonUtil.logError(getClass().getSimpleName(), "loginByUserInfo", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequest))
                        .output(e.toString())
                        .build());
                throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
            }
        }

        return loginResponseBean;
    }

    public LoginResponseBean loginByChannelUser(String userName, String password) {

        LoginResponseBean loginResponseBean;
        UserInfoRequestBean userInfoRequest = new UserInfoRequestBean();
        userInfoRequest.setUsername(userName);
        userInfoRequest.setPassword(password);

        try {
            loginResponseBean = yaghutUserProxy.loginByUserInfo(userInfoRequest);
        } catch (RemoteException e) {
            if (YaghutCommonException.checkException(e, "InvalidCredentialsWSException")) {

                CommonUtil.logError(getClass().getSimpleName(), "loginByUserInfo", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequest))
                        .output(e.toString())
                        .build());
                throw new RuntimeException("InvalidChannelUserPass");
            } else {
                CommonUtil.logError(getClass().getSimpleName(), "loginByUserInfo", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequest))
                        .output(e.toString())
                        .build());
                throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
            }
        }

        return loginResponseBean;
    }

    private com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.LoginResponseBean loginBpms() {

        YaghutBpmsProxy yaghutBpmsProxy = new YaghutBpmsProxy();

        com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.UserInfoRequestBean userInfoRequest = new com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.UserInfoRequestBean();
        userInfoRequest.setUsername(IntegrationLibConfig.getProperty("SINA_BPMS_USER_NAME"));
        userInfoRequest.setPassword(IntegrationLibConfig.getProperty("SIAN_BPMS_PASSWORD"));

        try {
            bpmsLoginResponse = yaghutBpmsProxy.login(userInfoRequest);
        } catch (RemoteException e) {
            CommonUtil.logError(getClass().getSimpleName(), "loginBpms", e.toString(), ServiceLogsDto.builder()
                    .input(CommonUtil.toJson(userInfoRequest))
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        INVALID_BPMS_SESSION_ID = false;
        return bpmsLoginResponse;
    }

    public Optional<String> getChannelUserData(String userId) {

        String query = "select userid , channeldata from XTI22EBCHANNELDATA where userid = ?";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {
            preparedStatement.setString(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(resultSet.getString(2));
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            CommonUtil.logError(getClass().getSimpleName(), "getChannelUserData", e.toString(), ServiceLogsDto.builder()
                    .input(userId)
                    .output(e.toString())
                    .build());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }
    }

}
