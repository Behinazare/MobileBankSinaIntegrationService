package com.rahand.sina.integration.provider.yaghut.service.general;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutGeneralProxy {

    private SoapServices soapServices;

    public YaghutGeneralProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public BankResponseBean getBanks(BankSearchRequestBean bankSearchRequestBean) throws RemoteException {

        return soapServices.getBanks(null, bankSearchRequestBean);
    }

    public BranchResponseBean getBranches(ContextEntry[] context, BranchSearchRequestBean branchSearchRequestBean) throws RemoteException {

        return soapServices.getBranches(context, branchSearchRequestBean);
    }

    public BillInfoResponseBean getBillInfo(BillInfoSearchRequestBean billInfoSearchRequestBean) throws RemoteException {
        return soapServices.getBillInfo(null, billInfoSearchRequestBean);
    }
}
