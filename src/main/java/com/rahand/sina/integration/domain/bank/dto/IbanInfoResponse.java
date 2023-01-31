package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import lombok.Builder;

import java.util.List;


public class IbanInfoResponse extends BaseResponse {

    private String bankName;
    private String bankCode;
    private String depositNumber;
    private List<OwnerInfo> ownersInfo;
    private String ibanType;

    public IbanInfoResponse() {

    }

    @Builder
    public IbanInfoResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String bankName, String bankCode, String depositNumber, List<OwnerInfo> ownersInfo, String ibanType) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.depositNumber = depositNumber;
        this.ownersInfo = ownersInfo;
        this.ibanType = ibanType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public List<OwnerInfo> getOwnersInfo() {
        return ownersInfo;
    }

    public void setOwnersInfo(List<OwnerInfo> ownersInfo) {
        this.ownersInfo = ownersInfo;
    }

    public String getIbanType() {
        return ibanType;
    }

    public void setIbanType(String ibanType) {
        this.ibanType = ibanType;
    }

    public static class OwnerInfo{

        private String firstName;
        private String lastName;

        public OwnerInfo(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }


}
