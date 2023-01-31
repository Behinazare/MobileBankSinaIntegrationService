package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseRequest;
import com.rahand.sina.integration.domain.bank.enums.DepositPersonalityType;
import com.rahand.sina.integration.domain.bank.enums.DepositStatus;
import com.rahand.sina.integration.domain.bank.enums.SignatureStatus;
import lombok.Builder;

import java.util.List;


public class LegalDepositsRequest extends BaseRequest {

    private String userName;

    private String password;
    private String cif;
    private List<String> depositNumbers;
    private Long offset;
    private Long length;
    private boolean includeCreditAccount;
    private boolean includeSupportAccount;
    private boolean needBlockedAmount;
    private boolean needWithDrawableBalance;
    private List<String> includeCurrency;
    private List<String> excludeCurrency;
    private DepositStatus depositStatus;
    private DepositPersonalityType depositPersonalityType;
    private SignatureStatus signatureStatus;

    public LegalDepositsRequest() {
    }

    @Builder
    public LegalDepositsRequest(String userId, String userName, String password, String cif, List<String> depositNumbers, Long offset, Long length, boolean includeCreditAccount, boolean includeSupportAccount, boolean needBlockedAmount, boolean needWithDrawableBalance, List<String> includeCurrency, List<String> excludeCurrency, DepositStatus depositStatus, DepositPersonalityType depositPersonalityType, SignatureStatus signatureStatus) {
        super(userId);
        this.userName = userName;
        this.password = password;
        this.cif = cif;
        this.depositNumbers = depositNumbers;
        this.offset = offset;
        this.length = length;
        this.includeCreditAccount = includeCreditAccount;
        this.includeSupportAccount = includeSupportAccount;
        this.needBlockedAmount = needBlockedAmount;
        this.needWithDrawableBalance = needWithDrawableBalance;
        this.includeCurrency = includeCurrency;
        this.excludeCurrency = excludeCurrency;
        this.depositStatus = depositStatus;
        this.depositPersonalityType = depositPersonalityType;
        this.signatureStatus = signatureStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<String> getDepositNumbers() {
        return depositNumbers;
    }

    public void setDepositNumbers(List<String> depositNumbers) {
        this.depositNumbers = depositNumbers;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public boolean isIncludeCreditAccount() {
        return includeCreditAccount;
    }

    public void setIncludeCreditAccount(boolean includeCreditAccount) {
        this.includeCreditAccount = includeCreditAccount;
    }

    public boolean isIncludeSupportAccount() {
        return includeSupportAccount;
    }

    public void setIncludeSupportAccount(boolean includeSupportAccount) {
        this.includeSupportAccount = includeSupportAccount;
    }

    public boolean isNeedBlockedAmount() {
        return needBlockedAmount;
    }

    public void setNeedBlockedAmount(boolean needBlockedAmount) {
        this.needBlockedAmount = needBlockedAmount;
    }

    public boolean isNeedWithDrawableBalance() {
        return needWithDrawableBalance;
    }

    public void setNeedWithDrawableBalance(boolean needWithDrawableBalance) {
        this.needWithDrawableBalance = needWithDrawableBalance;
    }

    public List<String> getIncludeCurrency() {
        return includeCurrency;
    }

    public void setIncludeCurrency(List<String> includeCurrency) {
        this.includeCurrency = includeCurrency;
    }

    public List<String> getExcludeCurrency() {
        return excludeCurrency;
    }

    public void setExcludeCurrency(List<String> excludeCurrency) {
        this.excludeCurrency = excludeCurrency;
    }

    public DepositStatus getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(DepositStatus depositStatus) {
        this.depositStatus = depositStatus;
    }

    public DepositPersonalityType getDepositPersonalityType() {
        return depositPersonalityType;
    }

    public void setDepositPersonalityType(DepositPersonalityType depositPersonalityType) {
        this.depositPersonalityType = depositPersonalityType;
    }

    public SignatureStatus getSignatureStatus() {
        return signatureStatus;
    }

    public void setSignatureStatus(SignatureStatus signatureStatus) {
        this.signatureStatus = signatureStatus;
    }
}
