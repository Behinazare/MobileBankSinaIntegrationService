package com.rahand.sina.integration.provider.yaghut.service.cheque;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutChequeProxy {

    private final SoapServices soapServices;

    public YaghutChequeProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public InquirySayadChequeByIssuerResponseBean inquirySayadChequeByIssuer(ContextEntry[] context,InquirySayadChequeByIssuerRequestBean inquirySayadChequeByIssuerRequestBean) throws RemoteException {
        return soapServices.inquirySayadChequeByIssuer(context,inquirySayadChequeByIssuerRequestBean);
    }

    public InquirySayadChequeByHolderResponseBean inquirySayadChequeByHolder(ContextEntry[] context,InquirySayadChequeByHolderRequestBean inquirySayadChequeByHolderRequestBean) throws RemoteException {
        return soapServices.inquirySayadChequeByHolder(context,inquirySayadChequeByHolderRequestBean);
    }

    public IssueSayadChequeResponseBean issueSayadCheque(ContextEntry[] context,IssueSayadChequeRequestBean issueSayadChequeRequestBean) throws RemoteException {
        return soapServices.issueSayadCheque(context,issueSayadChequeRequestBean);
    }

    public SayadChequeAcceptanceResponseBean acceptOrRejectSayadCheque(ContextEntry[] context,SayadChequeAcceptanceRequestBean sayadChequeAcceptanceRequestBean) throws RemoteException {
        return soapServices.acceptOrRejectSayadCheque(context,sayadChequeAcceptanceRequestBean);
    }

    public InquirySayadChequeTransferResponseBean inquirySayadChequeTransfer(ContextEntry[] context,InquirySayadChequeTransferRequestBean inquirySayadChequeTransferRequestBean) throws RemoteException {
        return soapServices.inquirySayadChequeTransfer(context,inquirySayadChequeTransferRequestBean);
    }

    public SayadChequeTransferResponseBean transferSayadCheque(ContextEntry[] context,SayadChequeTransferRequestBean sayadChequeTransferRequestBean) throws RemoteException {
        return soapServices.transferSayadCheque(context,sayadChequeTransferRequestBean);
    }

    public SayadChequeRejectTransferResponseBean rejectSayadChequeTransfer(ContextEntry[] context,SayadChequeRejectTransferRequestBean sayadChequeRejectTransferRequestBean) throws RemoteException {
        return soapServices.rejectSayadChequeTransfer(context,sayadChequeRejectTransferRequestBean);
    }

}
