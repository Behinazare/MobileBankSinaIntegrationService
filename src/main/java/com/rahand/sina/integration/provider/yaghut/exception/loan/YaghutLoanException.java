package com.rahand.sina.integration.provider.yaghut.exception.loan;


import com.rahand.common.constant.CommonErrorMessage;

public enum YaghutLoanException {

    UNKNOWN_EXCEPTION(CommonErrorMessage.EXTERNAL_SERVICE_EXCEPTION_MESSAGE, "UNKNOWN_EXCEPTION", "-");

    private String clientErrorMessage;
    private String fault;
    private String yaghutErrorDescription;

    YaghutLoanException(String clientErrorMessage, String fault, String yaghutErrorDescription) {
        this.fault = fault;
        this.yaghutErrorDescription = yaghutErrorDescription;
        this.clientErrorMessage = clientErrorMessage;
    }


    public String getClientErrorMessage() {
        return clientErrorMessage;
    }

    public void setClientErrorMessage(String clientErrorMessage) {
        this.clientErrorMessage = clientErrorMessage;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public String getYaghutErrorDescription() {
        return yaghutErrorDescription;
    }

    public void setYaghutErrorDescription(String yaghutErrorDescription) {
        this.yaghutErrorDescription = yaghutErrorDescription;
    }
}
