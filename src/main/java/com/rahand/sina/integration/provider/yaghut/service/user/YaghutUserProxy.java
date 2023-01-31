package com.rahand.sina.integration.provider.yaghut.service.user;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutUserProxy {

    private SoapServices soapServices;

    public YaghutUserProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public LoginResponseBean loginByUserInfo(UserInfoRequestBean userInfoRequest) throws RemoteException {

        return soapServices.loginStatic(null, userInfoRequest);

    }

    public LoginResponseBean loginByMobileNumber(MobileLoginRequestBean mobileLoginRequest) throws RemoteException {

        return soapServices.loginWithMobileNumber(null, mobileLoginRequest);

    }

    public LoginResponseBean loginByCif(LoginStaticCifRequestBean loginStaticCifRequest) throws RemoteException {

        return soapServices.loginStaticCif(null, loginStaticCifRequest);

    }

    public LoginResponseBean loginByCardInfo(LoginSwitchCardRequestBean loginSwitchCardRequest) throws RemoteException {

        return soapServices.loginSwitchCard(null, loginSwitchCardRequest);

    }

    public String loginByDeposit(DepositLoginRequestBean depositLoginRequest) throws RemoteException {

        return soapServices.depositLogin(null, depositLoginRequest);

    }

    public LoginResponseBean loginByOtp(OtpLoginRequestBean otpLoginRequest) throws RemoteException {

        return soapServices.loginOtp(null, otpLoginRequest);

    }




}
