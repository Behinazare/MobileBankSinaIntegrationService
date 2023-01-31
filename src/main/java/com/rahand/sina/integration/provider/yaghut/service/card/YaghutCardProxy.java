package com.rahand.sina.integration.provider.yaghut.service.card;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutCardProxy {
    private SoapServices soapServices;

    public YaghutCardProxy() {
        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public LoginResponseBean loginByCardInfo(LoginSwitchCardRequestBean loginSwitchCardRequest) throws RemoteException {

        return soapServices.loginSwitchCard(null, loginSwitchCardRequest);

    }

    public IssueDebitCardResponseBean issueCard(ContextEntry[] context, IssueDebitCardRequestBean issueDebitCardRequestBean) throws RemoteException {
        return soapServices.issueDebitCard(context, issueDebitCardRequestBean);
    }

    public CardPinResponseBean generateCardPin(ContextEntry[] context, CardPinRequestBean cardPinRequestBean) throws RemoteException {
        return soapServices.generateCardPin(context, cardPinRequestBean);
    }

    public CardBean[] getCards(ContextEntry[] context, CardsSearchRequestBean cardsSearchRequest) throws RemoteException {

        return soapServices.getCards(context, cardsSearchRequest);
    }

    public CardOwnerResponseBean inquiryOwner(ContextEntry[] context, CardOwnerRequestBean cardOwnerRequestBean) throws RemoteException {
        return soapServices.getCardOwner(context, cardOwnerRequestBean);
    }

    public FinancialServiceResponseBean cardTransfer(ContextEntry[] context, FundTransferRequestBean fundTransferRequestBean) throws RemoteException {
        return soapServices.cardTransfer(context, fundTransferRequestBean);
    }

    public CardBalanceResponseBean getCardBalance(ContextEntry[] context, CardBalanceRequestBean cardBalanceRequest) throws RemoteException {
        return soapServices.cardBalanceInquery(context, cardBalanceRequest);
    }

    public CardStatementBean[] getCardStatementInquiry(ContextEntry[] context, CardStatementRequestBean cardStatementRequestBean) throws RemoteException {
        return soapServices.getCardStatementInquiry(context, cardStatementRequestBean);
    }

    public CardTransactionsResponseBean getCardTransactions(ContextEntry[] context,CardTransactionsRequestBean cardTransactionsRequestBean) throws RemoteException {
        return soapServices.getCardTransactions(context,cardTransactionsRequestBean);
    }

    public HarimOtpResponseBean requestHarimOtp(ContextEntry[] context, HarimOtpRequestBean harimOtpRequestBean) throws RemoteException {
        return soapServices.requestHarimOtp(context, harimOtpRequestBean);
    }

    public void hotCard(ContextEntry[] context, PanRequestBean panRequestBean) throws RemoteException {
        soapServices.hotCard(context, panRequestBean);
    }

    public IssueSpecialCardResponseBean issueSpecialCard(ContextEntry[] context,IssueSpecialCardRequestBean issueSpecialCardRequestBean) throws RemoteException {

        return soapServices.issueSpecialCard(context,issueSpecialCardRequestBean);
    }

    public ChargeCardResponseBean[] chargeCard(ContextEntry[] context, ChargeCardRequestBean chargeCardRequestBean) throws RemoteException {

        return soapServices.chargeCard(context,chargeCardRequestBean);
    }
}
