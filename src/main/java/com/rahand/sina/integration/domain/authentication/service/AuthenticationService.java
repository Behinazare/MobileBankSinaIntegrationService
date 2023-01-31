package com.rahand.sina.integration.domain.authentication.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.DecryptResponse;
import com.rahand.common.dto.ResponseDto;
import com.rahand.common.dto.ServiceLogsDto;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.service.EncryptionService;
import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.domain.authentication.dto.ChannelAuthenticationRequest;
import com.rahand.sina.integration.domain.authentication.dto.ChannelAuthenticationResponse;
import com.rahand.sina.integration.domain.authentication.enums.AuthenticationRoleType;
import com.rahand.sina.integration.provider.yaghut.exception.common.YaghutCommonException;
import com.rahand.sina.integration.provider.yaghut.exception.dto.YaghutExceptionResponse;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoginResponseBean;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserInfoRequestBean;
import com.rahand.sina.integration.provider.yaghut.service.user.YaghutUserProxy;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {

    public static Map<String, Map> channelUsersData = new HashMap<>();

    public static AuthenticationRoleType getRoleType(String userId) {

        AuthenticationRoleType roleType;
        String query = "select case when nvl(max(replace(lower(r.name),'sinalevel','')),0) = 0 then 'none'\n" +
                "            when nvl(max(replace(lower(r.name),'sinalevel','')),0) in (1,2,3,4,5) then 'thirdParty'\n" +
                "            when nvl(max(replace(lower(r.name),'sinalevel','')),0) in (6,7,8,9) then 'user' else 'none' end \n" +
                "  roletype from cmsb6syncoperole r where r.id in (\n" +
                "select m.syncoperole_id from cmsb6membership m where m.syncopeuser_id = (\n" +
                "select t.id from cmsb6syncopeuser t where t.username = ?)\n" +
                ")and instr(lower(r.name),'sinalevel') != 0";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {
            preparedStatement.setString(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                roleType = AuthenticationRoleType.get(resultSet.getString(1));
            } else {
                roleType = AuthenticationRoleType.UNKNOWN;
            }
        } catch (SQLException e) {
            CommonUtil.logError(AuthenticationService.class.getSimpleName(), "getRoleType", e.toString());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return roleType;
    }

    public static void addChannelUserData(String userData) {


        if (userData != null && !userData.equals("")) {

            DecryptResponse decryptResponse = EncryptionService.decrypt(userData);

            if (decryptResponse.isError()) {
                throw new CustomRuntimeException("errorInDecryptData");
            } else {

                Map<String, String> clientRequestData = CommonUtil.jsonToMap(decryptResponse.getDecryptedData());

                String userId = clientRequestData.get("initiator");

                String query = "begin\n" +
                        "merge into XTI22EBCHANNELDATA t using \n" +
                        "(select ? userid from dual)v on (t.userid= v.userid)\n" +
                        "when not matched then insert (t.userid,t.channeldata) values(v.userid , ? )\n" +
                        "  when matched then update set t.channeldata = ?;\n" +
                        "commit;\n" +
                        "end;";

                try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {
                    preparedStatement.setString(1, userId);
                    preparedStatement.setString(2, userData);
                    preparedStatement.setString(3, userData);

                    preparedStatement.executeQuery();

                } catch (SQLException e) {
                    CommonUtil.logError(AuthenticationService.class.getSimpleName(), "addChannelUserData", e.toString());
                    throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
                }
            }
        }
    }

    public static void addChannelUserDataInMemory(String userData) {

        if (userData != null && !userData.equals("")) {

            DecryptResponse decryptResponse = EncryptionService.decrypt(userData);

            if (decryptResponse.isError()) {
                throw new CustomRuntimeException("errorInDecryptData");
            } else {

                Map<String, String> clientRequestData = CommonUtil.jsonToMap(decryptResponse.getDecryptedData());

                String userId = clientRequestData.get("initiator");

                channelUsersData.put(userId, clientRequestData);
            }
        }
    }

    public static void deleteChannelUserData(String userId) {

        String query = "BEGIN DELETE FROM XTI22EBCHANNELDATA channel_data WHERE channel_data.USERID =?;commit;end;";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {

            preparedStatement.setString(1, userId);
            preparedStatement.executeQuery();

        } catch (SQLException e) {
            CommonUtil.logError(AuthenticationService.class.getSimpleName(), "deleteChannelUserData", e.toString());
        }

    }

    public ResponseDto<ChannelAuthenticationResponse> channelUserAuthentication(ChannelAuthenticationRequest channelAuthenticationRequest) {

        ResponseDto<ChannelAuthenticationResponse> response = new ResponseDto<>();
        ChannelAuthenticationResponse channelAuthenticationResponse = new ChannelAuthenticationResponse();
        YaghutUserProxy yaghutUserProxy = new YaghutUserProxy();
        UserInfoRequestBean userInfoRequestBean = new UserInfoRequestBean();

        DecryptResponse userNameDecryptResponse = EncryptionService.decrypt(channelAuthenticationRequest.getUserName());
        DecryptResponse passDecryptResponse = EncryptionService.decrypt(channelAuthenticationRequest.getPassword());

        String userName;
        String pass;

        if (!userNameDecryptResponse.isError() && !passDecryptResponse.isError()) {
            userName = userNameDecryptResponse.getDecryptedData();
            pass = passDecryptResponse.getDecryptedData();
        } else {
            throw new CustomRuntimeException("errorInDecryptData");
        }

        userInfoRequestBean.setUsername(userName);
        userInfoRequestBean.setPassword(pass);

        LoginResponseBean loginResponseBean;

        try {
            loginResponseBean = yaghutUserProxy.loginByUserInfo(userInfoRequestBean);
            if (loginResponseBean.getCode().equals(channelAuthenticationRequest.getNationalCode())) {
                channelAuthenticationResponse.setChannelUser(true);
                response.setResponseData(channelAuthenticationResponse);
            } else {
                channelAuthenticationResponse.setChannelUser(false);
                channelAuthenticationResponse.setErrorMessage("اطلاعات وارد شده نامتعبر است");
                response.setMessage(channelAuthenticationResponse.getErrorMessage());
                response.setResponseData(channelAuthenticationResponse);
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthentication", "AccessDeniedEcxeption", ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output("AccessDeniedEcxeption")
                        .build());
            }

        } catch (RemoteException e) {

            if (YaghutCommonException.checkException(e, "InvalidCredentialsWSException")) {
                channelAuthenticationResponse.setChannelUser(false);
                channelAuthenticationResponse.setErrorMessage("اطلاعات وارد شده نامعتبر است");
                response.setMessage(channelAuthenticationResponse.getErrorMessage());
                response.setResponseData(channelAuthenticationResponse);
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthentication", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                response.setError(yaghutExceptionResponse.isError());
                response.setMessage(yaghutExceptionResponse.getErrorMessage());
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthentication", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            }

        }

        return response;

    }

    public ResponseDto<ChannelAuthenticationResponse> channelUserAuthenticationByAgent(ChannelAuthenticationRequest channelAuthenticationRequest) {

        ResponseDto<ChannelAuthenticationResponse> response = new ResponseDto<>();
        ChannelAuthenticationResponse channelAuthenticationResponse = new ChannelAuthenticationResponse();
        YaghutUserProxy yaghutUserProxy = new YaghutUserProxy();
        UserInfoRequestBean userInfoRequestBean = new UserInfoRequestBean();
        userInfoRequestBean.setUsername(channelAuthenticationRequest.getUserName());
        userInfoRequestBean.setPassword(channelAuthenticationRequest.getPassword());

        LoginResponseBean loginResponseBean;

        try {
            loginResponseBean = yaghutUserProxy.loginByUserInfo(userInfoRequestBean);

            if (loginResponseBean.getCode().equals(channelAuthenticationRequest.getNationalCode())) {
                channelAuthenticationResponse.setChannelUser(true);
                response.setResponseData(channelAuthenticationResponse);
            } else {
                channelAuthenticationResponse.setChannelUser(false);
                channelAuthenticationResponse.setErrorMessage("اطلاعات وارد شده نامتعبر است");
                response.setMessage(channelAuthenticationResponse.getErrorMessage());
                response.setResponseData(channelAuthenticationResponse);
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthenticationByAgent", "UserCredentialsInvalid(NationalCode)", ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output("UserCredentialsInvalid(NationalCode)")
                        .build());
            }


        } catch (RemoteException e) {
            if (YaghutCommonException.checkException(e, "InvalidCredentialsWSException")) {
                channelAuthenticationResponse.setChannelUser(false);
                channelAuthenticationResponse.setErrorMessage("اطلاعات وارد شده نامعتبر است");
                response.setMessage(channelAuthenticationResponse.getErrorMessage());
                response.setResponseData(channelAuthenticationResponse);
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthenticationByAgent", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                response.setError(yaghutExceptionResponse.isError());
                response.setMessage(yaghutExceptionResponse.getErrorMessage());
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthenticationByAgent", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            }
        }

        return response;

    }

    public ResponseDto<ChannelAuthenticationResponse> channelLegalUserAuthentication(ChannelAuthenticationRequest channelAuthenticationRequest) {

        ResponseDto<ChannelAuthenticationResponse> response = new ResponseDto<>();
        ChannelAuthenticationResponse channelAuthenticationResponse = new ChannelAuthenticationResponse();
        YaghutUserProxy yaghutUserProxy = new YaghutUserProxy();
        UserInfoRequestBean userInfoRequestBean = new UserInfoRequestBean();

        DecryptResponse userNameDecryptResponse = EncryptionService.decrypt(channelAuthenticationRequest.getUserName());
        DecryptResponse passDecryptResponse = EncryptionService.decrypt(channelAuthenticationRequest.getPassword());

        String userName;
        String pass;

        if (!userNameDecryptResponse.isError() && !passDecryptResponse.isError()) {
            userName = userNameDecryptResponse.getDecryptedData();
            pass = passDecryptResponse.getDecryptedData();
        } else {
            throw new CustomRuntimeException("errorInDecryptData");
        }

        userInfoRequestBean.setUsername(userName);
        userInfoRequestBean.setPassword(pass);

        LoginResponseBean loginResponseBean;

        try {
            loginResponseBean = yaghutUserProxy.loginByUserInfo(userInfoRequestBean);

            channelAuthenticationResponse.setChannelUser(true);
            channelAuthenticationResponse.setCode(loginResponseBean.getCode());
            channelAuthenticationResponse.setName(loginResponseBean.getName());
            channelAuthenticationResponse.setCif(loginResponseBean.getCif());
            response.setResponseData(channelAuthenticationResponse);

        } catch (RemoteException e) {

            if (YaghutCommonException.checkException(e, "InvalidCredentialsWSException")) {
                channelAuthenticationResponse.setChannelUser(false);
                channelAuthenticationResponse.setErrorMessage("اطلاعات وارد شده نامعتبر است");
                response.setMessage(channelAuthenticationResponse.getErrorMessage());
                response.setResponseData(channelAuthenticationResponse);
                CommonUtil.logError(getClass().getSimpleName(), "channelLegalUserAuthentication", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                response.setError(yaghutExceptionResponse.isError());
                response.setMessage(yaghutExceptionResponse.getErrorMessage());
                CommonUtil.logError(getClass().getSimpleName(), "channelLegalUserAuthentication", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            }

        }

        return response;

    }

    public ResponseDto<ChannelAuthenticationResponse> channelUserAuthenticationWithResponse(ChannelAuthenticationRequest channelAuthenticationRequest) {

        ResponseDto<ChannelAuthenticationResponse> response = new ResponseDto<>();
        ChannelAuthenticationResponse channelAuthenticationResponse = new ChannelAuthenticationResponse();
        YaghutUserProxy yaghutUserProxy = new YaghutUserProxy();
        UserInfoRequestBean userInfoRequestBean = new UserInfoRequestBean();

        DecryptResponse userNameDecryptResponse = EncryptionService.decrypt(channelAuthenticationRequest.getUserName());
        DecryptResponse passDecryptResponse = EncryptionService.decrypt(channelAuthenticationRequest.getPassword());

        String userName;
        String pass;

        if (!userNameDecryptResponse.isError() && !passDecryptResponse.isError()) {
            userName = userNameDecryptResponse.getDecryptedData();
            pass = passDecryptResponse.getDecryptedData();
        } else {
            throw new CustomRuntimeException("errorInDecryptData");
        }

        userInfoRequestBean.setUsername(userName);
        userInfoRequestBean.setPassword(pass);

        LoginResponseBean loginResponseBean;

        try {
            loginResponseBean = yaghutUserProxy.loginByUserInfo(userInfoRequestBean);
            if (loginResponseBean.getCode().equals(channelAuthenticationRequest.getNationalCode())) {
                channelAuthenticationResponse.setChannelUser(true);
                channelAuthenticationResponse.setLoginResponseBean(loginResponseBean);
                response.setResponseData(channelAuthenticationResponse);
            } else {
                channelAuthenticationResponse.setChannelUser(false);
                channelAuthenticationResponse.setErrorMessage("اطلاعات وارد شده نامتعبر است");
                response.setMessage(channelAuthenticationResponse.getErrorMessage());
                response.setResponseData(channelAuthenticationResponse);
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthenticationWithResponse", "AccessDeniedEcxeption", ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output("AccessDeniedEcxeption")
                        .build());
            }


        } catch (RemoteException e) {

            if (YaghutCommonException.checkException(e, "InvalidCredentialsWSException")) {
                channelAuthenticationResponse.setChannelUser(false);
                channelAuthenticationResponse.setErrorMessage("اطلاعات وارد شده نامعتبر است");
                response.setMessage(channelAuthenticationResponse.getErrorMessage());
                response.setResponseData(channelAuthenticationResponse);
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthenticationWithResponse", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            } else {
                YaghutExceptionResponse yaghutExceptionResponse = YaghutCommonException.handelCommonException(e);
                response.setError(yaghutExceptionResponse.isError());
                response.setMessage(yaghutExceptionResponse.getErrorMessage());
                CommonUtil.logError(getClass().getSimpleName(), "channelUserAuthenticationWithResponse", e.toString(), ServiceLogsDto.builder()
                        .input(CommonUtil.toJson(userInfoRequestBean))
                        .output(e.toString())
                        .build());
            }

        }

        return response;

    }

}
