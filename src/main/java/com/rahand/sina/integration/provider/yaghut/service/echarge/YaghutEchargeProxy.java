package com.rahand.sina.integration.provider.yaghut.service.echarge;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutEchargeProxy {

    private SoapServices soapServices;

    public YaghutEchargeProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public TopupPreviewResponseBean topUpPreview(ContextEntry[] context, TopupPreviewRequestBean topupPreviewRequestBean) throws RemoteException {

        return soapServices.topupPreview(context,topupPreviewRequestBean);
    }

    public TopupMobileResponseBean topUpMobileByCard(ContextEntry[] context,TopupMobileRequestBean topupMobileRequestBean) throws RemoteException {

        return soapServices.topupMobile(context,topupMobileRequestBean);
    }

    public TopupDepositResponseBean topUpMobileByDeposit(ContextEntry[] context,TopupDepositRequestBean topupDepositRequestBean) throws RemoteException {

        return soapServices.topupMobileByDeposit(context,topupDepositRequestBean);
    }
}
