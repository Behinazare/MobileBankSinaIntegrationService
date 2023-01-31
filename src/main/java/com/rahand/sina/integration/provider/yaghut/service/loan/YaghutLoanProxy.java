package com.rahand.sina.integration.provider.yaghut.service.loan;

import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.service.YaghutServiceLocator;

import java.rmi.RemoteException;

public class YaghutLoanProxy {

    private SoapServices soapServices;

    public YaghutLoanProxy() {

        soapServices = YaghutServiceLocator.getMobAppService();
    }

    public CardOwnerResponseBean inquiryOwner(ContextEntry[] context, CardOwnerRequestBean cardOwnerRequestBean) throws RemoteException {
        return soapServices.getCardOwner(context, cardOwnerRequestBean);
    }

    public LoanOwnerInfoResponseBean getLoanOwnerInfo(ContextEntry[] context, LoanOwnerInfoRequestBean loanOwnerInfoRequestBean) throws RemoteException {
        return soapServices.getLoanOwnerInfo(context, loanOwnerInfoRequestBean);
    }

    public LoansResponseBean getLoans(ContextEntry[] context, LoansSearchRequestBean loansSearchRequestBean) throws RemoteException {
        return soapServices.getLoans(context, loansSearchRequestBean);
    }

    public LoansListResponseBean getLoanList(ContextEntry[] context, LoansSearchListRequestBean loansSearchListRequestBean) throws RemoteException {
        return soapServices.getLoanList(context, loansSearchListRequestBean);
    }

    public LoanDetailResponseBean getLoanDetail(ContextEntry[] context, LoanDetailSearchRequestBean loanDetailSearchRequestBean) throws RemoteException {
        return soapServices.getLoanDetail(context, loanDetailSearchRequestBean);
    }

    public ChangeLoanAutoPaymentDepositResponseBean changeLoanAutoPaymentDeposit(ContextEntry[] context, ChangeLoanAutoPaymentDepositRequestBean changeLoanAutoPaymentDepositRequestBean) throws RemoteException {
        return soapServices.changeLoanAutoPaymentDeposit(context, changeLoanAutoPaymentDepositRequestBean);
    }

    public LoanPaymentResponseBean pay(ContextEntry[] context ,LoanPaymentRequestBean loanPaymentRequestBean) throws RemoteException {
        return soapServices.payLoan(context,loanPaymentRequestBean);
    }

    public CardLoanPaymentResponseBean payLoanByCard(ContextEntry[] context,CardLoanPaymentRequestBean cardLoanPaymentRequestBean) throws RemoteException {
        return soapServices.payLoanByCard(context,cardLoanPaymentRequestBean);
    }

}
