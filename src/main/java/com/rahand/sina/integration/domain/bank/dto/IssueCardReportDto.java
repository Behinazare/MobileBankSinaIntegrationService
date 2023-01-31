package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueCardReportDto {

    @JsonProperty("ID")
    public int id;
    @JsonProperty("PIN")
    public String pin;
    @JsonProperty("PAN_PART1")
    public String panPart1;
    @JsonProperty("PAN_PART2")
    public String panPart2;
    @JsonProperty("PAN_PART3")
    public String panPart3;
    @JsonProperty("PAN_PART4")
    public String panPart4;
    @JsonProperty("PAN_PART5")
    public String panPart5;
    @JsonProperty("TRACK1")
    public String track1;
    @JsonProperty("TRACK2")
    public String track2;
    @JsonProperty("TRACK3")
    public String track3;
    @JsonProperty("NAME_FR")
    public String nameFr;
    @JsonProperty("NAME_EN")
    public String nameEn;
    @JsonProperty("ISUDATE")
    public String issueDate;
    @JsonProperty("EXPDATE")
    public String expDate;
    @JsonProperty("CIFNO")
    public int cifNo;
    @JsonProperty("ISUDATE_ANSAR")
    public String issueDateAnsar;
    @JsonProperty("BRANCHCODE")
    public int branchCode;
    @JsonProperty("RESULT")
    public int result;
    @JsonProperty("REQTYPE")
    public String reqType;
    @JsonProperty("NATIONALID")
    public String nationalId;
    @JsonProperty("PAN")
    public String pan;
    @JsonProperty("CRN")
    public String crn;
    @JsonProperty("MILADIEXPDATE")
    public String miladiExpireDate;
    @JsonProperty("CREDIT_AMOUNT")
    public String creditAmount;
    @JsonProperty("MAIN_ACOUNT")
    public String mainAccount;
    @JsonProperty("PREPAID_AMOUNT")
    public String prepaidAmount;
    @JsonProperty("HOLDERID")
    public String holderId;
    @JsonProperty("IssuerBranchCode")
    public String issuerBranchCode;
    @JsonProperty("PREPAID_AMOUNT_EN")
    public String prepaidAmountEn;
    @JsonProperty("EXPDATE_FourDigit")
    public String expireDateFourDigit;
    @JsonProperty("GregorianExpiryDate_FullFormat")
    public String gregorianExpiryDateFullFormat;
    @JsonProperty("GregorianExpiryDate_SixDigit")
    public String gregorianExpiryDateSixDigit;
    @JsonProperty("GregorianIssueDate_FullFormat")
    public String gregorianIssueDateFullFormat;
    @JsonProperty("GregorianIssueDate_SixDigit")
    public String gregorianIssueDateSixDigit;
    @JsonProperty("GregorianIssueDate_FourDigit")
    public String gregorianIssueDateFourDigit;

    @Builder
    public IssueCardReportDto(int id, String pin, String panPart1, String panPart2, String panPart3, String panPart4, String panPart5, String track1, String track2, String track3, String nameFr, String nameEn, String issueDate, String expDate, int cifNo, String issueDateAnsar, int branchCode, int result, String reqType, String nationalId, String pan, String crn, String miladiExpireDate, String creditAmount, String mainAccount, String prepaidAmount, String holderId, String issuerBranchCode, String prepaidAmountEn, String expireDateFourDigit, String gregorianExpiryDateFullFormat, String gregorianExpiryDateSixDigit, String gregorianIssueDateFullFormat, String gregorianIssueDateSixDigit, String gregorianIssueDateFourDigit) {
        this.id = id;
        this.pin = pin;
        this.panPart1 = panPart1;
        this.panPart2 = panPart2;
        this.panPart3 = panPart3;
        this.panPart4 = panPart4;
        this.panPart5 = panPart5;
        this.track1 = track1;
        this.track2 = track2;
        this.track3 = track3;
        this.nameFr = nameFr;
        this.nameEn = nameEn;
        this.issueDate = issueDate;
        this.expDate = expDate;
        this.cifNo = cifNo;
        this.issueDateAnsar = issueDateAnsar;
        this.branchCode = branchCode;
        this.result = result;
        this.reqType = reqType;
        this.nationalId = nationalId;
        this.pan = pan;
        this.crn = crn;
        this.miladiExpireDate = miladiExpireDate;
        this.creditAmount = creditAmount;
        this.mainAccount = mainAccount;
        this.prepaidAmount = prepaidAmount;
        this.holderId = holderId;
        this.issuerBranchCode = issuerBranchCode;
        this.prepaidAmountEn = prepaidAmountEn;
        this.expireDateFourDigit = expireDateFourDigit;
        this.gregorianExpiryDateFullFormat = gregorianExpiryDateFullFormat;
        this.gregorianExpiryDateSixDigit = gregorianExpiryDateSixDigit;
        this.gregorianIssueDateFullFormat = gregorianIssueDateFullFormat;
        this.gregorianIssueDateSixDigit = gregorianIssueDateSixDigit;
        this.gregorianIssueDateFourDigit = gregorianIssueDateFourDigit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPanPart1() {
        return panPart1;
    }

    public void setPanPart1(String panPart1) {
        this.panPart1 = panPart1;
    }

    public String getPanPart2() {
        return panPart2;
    }

    public void setPanPart2(String panPart2) {
        this.panPart2 = panPart2;
    }

    public String getPanPart3() {
        return panPart3;
    }

    public void setPanPart3(String panPart3) {
        this.panPart3 = panPart3;
    }

    public String getPanPart4() {
        return panPart4;
    }

    public void setPanPart4(String panPart4) {
        this.panPart4 = panPart4;
    }

    public String getPanPart5() {
        return panPart5;
    }

    public void setPanPart5(String panPart5) {
        this.panPart5 = panPart5;
    }

    public String getTrack1() {
        return track1;
    }

    public void setTrack1(String track1) {
        this.track1 = track1;
    }

    public String getTrack2() {
        return track2;
    }

    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    public String getTrack3() {
        return track3;
    }

    public void setTrack3(String track3) {
        this.track3 = track3;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public int getCifNo() {
        return cifNo;
    }

    public void setCifNo(int cifNo) {
        this.cifNo = cifNo;
    }

    public String getIssueDateAnsar() {
        return issueDateAnsar;
    }

    public void setIssueDateAnsar(String issueDateAnsar) {
        this.issueDateAnsar = issueDateAnsar;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getMiladiExpireDate() {
        return miladiExpireDate;
    }

    public void setMiladiExpireDate(String miladiExpireDate) {
        this.miladiExpireDate = miladiExpireDate;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getMainAccount() {
        return mainAccount;
    }

    public void setMainAccount(String mainAccount) {
        this.mainAccount = mainAccount;
    }

    public String getPrepaidAmount() {
        return prepaidAmount;
    }

    public void setPrepaidAmount(String prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

    public String getIssuerBranchCode() {
        return issuerBranchCode;
    }

    public void setIssuerBranchCode(String issuerBranchCode) {
        this.issuerBranchCode = issuerBranchCode;
    }

    public String getPrepaidAmountEn() {
        return prepaidAmountEn;
    }

    public void setPrepaidAmountEn(String prepaidAmountEn) {
        this.prepaidAmountEn = prepaidAmountEn;
    }

    public String getExpireDateFourDigit() {
        return expireDateFourDigit;
    }

    public void setExpireDateFourDigit(String expireDateFourDigit) {
        this.expireDateFourDigit = expireDateFourDigit;
    }

    public String getGregorianExpiryDateFullFormat() {
        return gregorianExpiryDateFullFormat;
    }

    public void setGregorianExpiryDateFullFormat(String gregorianExpiryDateFullFormat) {
        this.gregorianExpiryDateFullFormat = gregorianExpiryDateFullFormat;
    }

    public String getGregorianExpiryDateSixDigit() {
        return gregorianExpiryDateSixDigit;
    }

    public void setGregorianExpiryDateSixDigit(String gregorianExpiryDateSixDigit) {
        this.gregorianExpiryDateSixDigit = gregorianExpiryDateSixDigit;
    }

    public String getGregorianIssueDateFullFormat() {
        return gregorianIssueDateFullFormat;
    }

    public void setGregorianIssueDateFullFormat(String gregorianIssueDateFullFormat) {
        this.gregorianIssueDateFullFormat = gregorianIssueDateFullFormat;
    }

    public String getGregorianIssueDateSixDigit() {
        return gregorianIssueDateSixDigit;
    }

    public void setGregorianIssueDateSixDigit(String gregorianIssueDateSixDigit) {
        this.gregorianIssueDateSixDigit = gregorianIssueDateSixDigit;
    }

    public String getGregorianIssueDateFourDigit() {
        return gregorianIssueDateFourDigit;
    }

    public void setGregorianIssueDateFourDigit(String gregorianIssueDateFourDigit) {
        this.gregorianIssueDateFourDigit = gregorianIssueDateFourDigit;
    }
}
