package com.rahand.sina.integration.provider.yaghut.service.deposit;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutDepositProxy {

    private SoapServices soapServices;

    public YaghutDepositProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public DepositResponseBean getDeposits(ContextEntry[] context, DepositSearchRequestBean depositSearchRequest) throws RemoteException {
        return soapServices.getDeposits(context, depositSearchRequest);

    }

    public DepositBalanceResponseBean getDepositBalance(ContextEntry[] context, DepositBalanceRequestBean depositBalanceRequest) throws RemoteException {
        return soapServices.getDepositBalance(context, depositBalanceRequest);

    }

    public StatementResponseBean getStatement(ContextEntry[] context, StatementSearchRequestBean statementSearchRequest) throws RemoteException {
        return soapServices.getStatement(context, statementSearchRequest);
    }

    public DepositStatementSummaryResponseBean getDepositStatementSummary(ContextEntry[] context, DepositStatementSummaryRequestBean depositStatementSummaryRequest) throws RemoteException {
        return soapServices.getDepositStatementSummary(context, depositStatementSummaryRequest);

    }

    public CardBean[] getCards(ContextEntry[] context, CardsSearchRequestBean cardsSearchRequest) throws RemoteException {
        return soapServices.getCards(context, cardsSearchRequest);
    }

    public IbanInformationBean getIbanInfo(ContextEntry[] context, IbanInformationRequestBean ibanInformationRequestBean) throws RemoteException {
        return soapServices.getIbanInformation(context, ibanInformationRequestBean);

    }

    public String depositNumberToIban(DepositNumberToIbanRequestBean depositNumberToIbanRequestBean) throws RemoteException {
        return soapServices.convertDepositNumberToIban(null, depositNumberToIbanRequestBean);
    }

    public String ibanToDepositNumber(IbanToDepositRequestBean ibanToDepositRequestBean) throws RemoteException {
        return soapServices.convertIbanToDepositNumber(null, ibanToDepositRequestBean);
    }

    public CardOwnerResponseBean inquiryOwner(ContextEntry[] context, CardOwnerRequestBean cardOwnerRequestBean) throws RemoteException {
        return soapServices.getCardOwner(context, cardOwnerRequestBean);
    }

    public SignedDepositResponseBean getSignedDeposits(ContextEntry[] context, SignedDepositRequestBean signedDepositRequestBean) throws RemoteException {
        return soapServices.getSignedDeposits(context, signedDepositRequestBean);
    }

    public DepositCustomerResponseBean getDepositCustomers(ContextEntry[] context, DepositCustomerRequestBean depositCustomerRequestBean) throws RemoteException {
        return soapServices.getDepositCustomer(context, depositCustomerRequestBean);
    }

    public DepositRateInquiryResponseBean getDepositRates(ContextEntry[] context, DepositRateInquiryRequestBean depositRateInquiryRequestBean) throws RemoteException {
        return soapServices.getDepositRates(context, depositRateInquiryRequestBean);
    }

    public CompleteDepositBean[] getFavoritesDeposits(ContextEntry[] context) throws RemoteException {
        return soapServices.getFavoriteDeposits(context);
    }

    public AchTransactionReasonInfoBean[] achTransactionReasonRequestBean(ContextEntry[] context, AchTransactionReasonRequestBean achTransactionReasonRequestBean) throws RemoteException {
        return soapServices.getAllAchTransactionReason(context, achTransactionReasonRequestBean);
    }

    public RtgsTransactionReasonInfoBean[] rtgsTransactionReasonRequestBean(ContextEntry[] context, RtgsTransactionReasonRequestBean rtgsTransactionReasonRequestBean) throws RemoteException {
        return soapServices.getAllRtgsTransactionReason(context, rtgsTransactionReasonRequestBean);
    }

    public NormalTransferServiceResponseBean fundTransfer(ContextEntry[] context, NormalTransferRequestBean normalTransferRequestBean) throws RemoteException {
        return soapServices.fundTransfer(context, normalTransferRequestBean);
    }

    public NormalAchTransferResultBean achNormalTransfer(ContextEntry[] context, AchNormalTransferRequestBean achNormalTransferRequestBean) throws RemoteException {
        return soapServices.achNormalTransfer(context, achNormalTransferRequestBean);
    }

    public NormalRtgsTransferResponseBean rtgsNormalTransfer(ContextEntry[] context, RtgsNormalTransferRequestBean rtgsNormalTransferRequestBean) throws RemoteException {
        return soapServices.rtgsNormalTransfer(context, rtgsNormalTransferRequestBean);
    }

    public KartablTransferBean kartablRtgsNormalTransfer(ContextEntry[] context, RtgsNormalTransferRequestBean rtgsNormalTransferRequestBean) throws RemoteException {
        return soapServices.kartablRtgsNormalTransfer(context, rtgsNormalTransferRequestBean);
    }


    public InstantInterbankTransferResponseBean instantTransfer(ContextEntry[] context,InstantInterbankTransferRequestBean instantInterbankTransferRequestBean) throws RemoteException {
        return soapServices.instantTransfer(context,instantInterbankTransferRequestBean);
    }

    public GenerateTicketResponseBean generateTicket(ContextEntry[] context,GenerateTicketRequestBean generateTicketRequestBean) throws RemoteException {
        return soapServices.doTicketGeneration(context,generateTicketRequestBean);
    }

}
