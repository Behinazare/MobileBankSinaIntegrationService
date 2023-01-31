/**
 * DepositBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositBean  implements java.io.Serializable {
    private java.math.BigDecimal availableBalance;

    private java.math.BigDecimal balance;

    private java.math.BigDecimal blockedAmount;

    private java.lang.String branchCode;

    private java.lang.String creditDeposit;

    private java.math.BigDecimal creditLoanRemainAmount;

    private java.lang.Double creditRateAmount;

    private java.math.BigDecimal creditRemainAmount;

    private java.lang.String currency;

    private java.lang.String depositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS depositStatus;

    private java.lang.String depositTitle;

    private java.lang.Long depositType;

    private java.util.Calendar expireDate;

    private java.math.BigDecimal extraAvailableBalance;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS group;

    private java.lang.String ibanNumber;

    private java.util.Calendar inaugurationDate;

    private java.math.BigDecimal maximumBalance;

    private java.math.BigDecimal minAmountForInterestInclusion;

    private java.math.BigDecimal minimumBalance;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS owner;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personality;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signature;

    private java.lang.String supportCurrency;

    private java.lang.String supportDepositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS supportDepositStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus supportStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS withdrawalOption;

    public DepositBean() {
    }

    public DepositBean(
           java.math.BigDecimal availableBalance,
           java.math.BigDecimal balance,
           java.math.BigDecimal blockedAmount,
           java.lang.String branchCode,
           java.lang.String creditDeposit,
           java.math.BigDecimal creditLoanRemainAmount,
           java.lang.Double creditRateAmount,
           java.math.BigDecimal creditRemainAmount,
           java.lang.String currency,
           java.lang.String depositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS depositStatus,
           java.lang.String depositTitle,
           java.lang.Long depositType,
           java.util.Calendar expireDate,
           java.math.BigDecimal extraAvailableBalance,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS group,
           java.lang.String ibanNumber,
           java.util.Calendar inaugurationDate,
           java.math.BigDecimal maximumBalance,
           java.math.BigDecimal minAmountForInterestInclusion,
           java.math.BigDecimal minimumBalance,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS owner,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personality,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signature,
           java.lang.String supportCurrency,
           java.lang.String supportDepositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS supportDepositStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus supportStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS withdrawalOption) {
           this.availableBalance = availableBalance;
           this.balance = balance;
           this.blockedAmount = blockedAmount;
           this.branchCode = branchCode;
           this.creditDeposit = creditDeposit;
           this.creditLoanRemainAmount = creditLoanRemainAmount;
           this.creditRateAmount = creditRateAmount;
           this.creditRemainAmount = creditRemainAmount;
           this.currency = currency;
           this.depositNumber = depositNumber;
           this.depositStatus = depositStatus;
           this.depositTitle = depositTitle;
           this.depositType = depositType;
           this.expireDate = expireDate;
           this.extraAvailableBalance = extraAvailableBalance;
           this.group = group;
           this.ibanNumber = ibanNumber;
           this.inaugurationDate = inaugurationDate;
           this.maximumBalance = maximumBalance;
           this.minAmountForInterestInclusion = minAmountForInterestInclusion;
           this.minimumBalance = minimumBalance;
           this.owner = owner;
           this.personality = personality;
           this.signature = signature;
           this.supportCurrency = supportCurrency;
           this.supportDepositNumber = supportDepositNumber;
           this.supportDepositStatus = supportDepositStatus;
           this.supportStatus = supportStatus;
           this.withdrawalOption = withdrawalOption;
    }


    /**
     * Gets the availableBalance value for this DepositBean.
     * 
     * @return availableBalance
     */
    public java.math.BigDecimal getAvailableBalance() {
        return availableBalance;
    }


    /**
     * Sets the availableBalance value for this DepositBean.
     * 
     * @param availableBalance
     */
    public void setAvailableBalance(java.math.BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }


    /**
     * Gets the balance value for this DepositBean.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this DepositBean.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the blockedAmount value for this DepositBean.
     * 
     * @return blockedAmount
     */
    public java.math.BigDecimal getBlockedAmount() {
        return blockedAmount;
    }


    /**
     * Sets the blockedAmount value for this DepositBean.
     * 
     * @param blockedAmount
     */
    public void setBlockedAmount(java.math.BigDecimal blockedAmount) {
        this.blockedAmount = blockedAmount;
    }


    /**
     * Gets the branchCode value for this DepositBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this DepositBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the creditDeposit value for this DepositBean.
     * 
     * @return creditDeposit
     */
    public java.lang.String getCreditDeposit() {
        return creditDeposit;
    }


    /**
     * Sets the creditDeposit value for this DepositBean.
     * 
     * @param creditDeposit
     */
    public void setCreditDeposit(java.lang.String creditDeposit) {
        this.creditDeposit = creditDeposit;
    }


    /**
     * Gets the creditLoanRemainAmount value for this DepositBean.
     * 
     * @return creditLoanRemainAmount
     */
    public java.math.BigDecimal getCreditLoanRemainAmount() {
        return creditLoanRemainAmount;
    }


    /**
     * Sets the creditLoanRemainAmount value for this DepositBean.
     * 
     * @param creditLoanRemainAmount
     */
    public void setCreditLoanRemainAmount(java.math.BigDecimal creditLoanRemainAmount) {
        this.creditLoanRemainAmount = creditLoanRemainAmount;
    }


    /**
     * Gets the creditRateAmount value for this DepositBean.
     * 
     * @return creditRateAmount
     */
    public java.lang.Double getCreditRateAmount() {
        return creditRateAmount;
    }


    /**
     * Sets the creditRateAmount value for this DepositBean.
     * 
     * @param creditRateAmount
     */
    public void setCreditRateAmount(java.lang.Double creditRateAmount) {
        this.creditRateAmount = creditRateAmount;
    }


    /**
     * Gets the creditRemainAmount value for this DepositBean.
     * 
     * @return creditRemainAmount
     */
    public java.math.BigDecimal getCreditRemainAmount() {
        return creditRemainAmount;
    }


    /**
     * Sets the creditRemainAmount value for this DepositBean.
     * 
     * @param creditRemainAmount
     */
    public void setCreditRemainAmount(java.math.BigDecimal creditRemainAmount) {
        this.creditRemainAmount = creditRemainAmount;
    }


    /**
     * Gets the currency value for this DepositBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DepositBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the depositNumber value for this DepositBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this DepositBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the depositStatus value for this DepositBean.
     * 
     * @return depositStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS getDepositStatus() {
        return depositStatus;
    }


    /**
     * Sets the depositStatus value for this DepositBean.
     * 
     * @param depositStatus
     */
    public void setDepositStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS depositStatus) {
        this.depositStatus = depositStatus;
    }


    /**
     * Gets the depositTitle value for this DepositBean.
     * 
     * @return depositTitle
     */
    public java.lang.String getDepositTitle() {
        return depositTitle;
    }


    /**
     * Sets the depositTitle value for this DepositBean.
     * 
     * @param depositTitle
     */
    public void setDepositTitle(java.lang.String depositTitle) {
        this.depositTitle = depositTitle;
    }


    /**
     * Gets the depositType value for this DepositBean.
     * 
     * @return depositType
     */
    public java.lang.Long getDepositType() {
        return depositType;
    }


    /**
     * Sets the depositType value for this DepositBean.
     * 
     * @param depositType
     */
    public void setDepositType(java.lang.Long depositType) {
        this.depositType = depositType;
    }


    /**
     * Gets the expireDate value for this DepositBean.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this DepositBean.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the extraAvailableBalance value for this DepositBean.
     * 
     * @return extraAvailableBalance
     */
    public java.math.BigDecimal getExtraAvailableBalance() {
        return extraAvailableBalance;
    }


    /**
     * Sets the extraAvailableBalance value for this DepositBean.
     * 
     * @param extraAvailableBalance
     */
    public void setExtraAvailableBalance(java.math.BigDecimal extraAvailableBalance) {
        this.extraAvailableBalance = extraAvailableBalance;
    }


    /**
     * Gets the group value for this DepositBean.
     * 
     * @return group
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getGroup() {
        return group;
    }


    /**
     * Sets the group value for this DepositBean.
     * 
     * @param group
     */
    public void setGroup(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS group) {
        this.group = group;
    }


    /**
     * Gets the ibanNumber value for this DepositBean.
     * 
     * @return ibanNumber
     */
    public java.lang.String getIbanNumber() {
        return ibanNumber;
    }


    /**
     * Sets the ibanNumber value for this DepositBean.
     * 
     * @param ibanNumber
     */
    public void setIbanNumber(java.lang.String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }


    /**
     * Gets the inaugurationDate value for this DepositBean.
     * 
     * @return inaugurationDate
     */
    public java.util.Calendar getInaugurationDate() {
        return inaugurationDate;
    }


    /**
     * Sets the inaugurationDate value for this DepositBean.
     * 
     * @param inaugurationDate
     */
    public void setInaugurationDate(java.util.Calendar inaugurationDate) {
        this.inaugurationDate = inaugurationDate;
    }


    /**
     * Gets the maximumBalance value for this DepositBean.
     * 
     * @return maximumBalance
     */
    public java.math.BigDecimal getMaximumBalance() {
        return maximumBalance;
    }


    /**
     * Sets the maximumBalance value for this DepositBean.
     * 
     * @param maximumBalance
     */
    public void setMaximumBalance(java.math.BigDecimal maximumBalance) {
        this.maximumBalance = maximumBalance;
    }


    /**
     * Gets the minAmountForInterestInclusion value for this DepositBean.
     * 
     * @return minAmountForInterestInclusion
     */
    public java.math.BigDecimal getMinAmountForInterestInclusion() {
        return minAmountForInterestInclusion;
    }


    /**
     * Sets the minAmountForInterestInclusion value for this DepositBean.
     * 
     * @param minAmountForInterestInclusion
     */
    public void setMinAmountForInterestInclusion(java.math.BigDecimal minAmountForInterestInclusion) {
        this.minAmountForInterestInclusion = minAmountForInterestInclusion;
    }


    /**
     * Gets the minimumBalance value for this DepositBean.
     * 
     * @return minimumBalance
     */
    public java.math.BigDecimal getMinimumBalance() {
        return minimumBalance;
    }


    /**
     * Sets the minimumBalance value for this DepositBean.
     * 
     * @param minimumBalance
     */
    public void setMinimumBalance(java.math.BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }


    /**
     * Gets the owner value for this DepositBean.
     * 
     * @return owner
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DepositBean.
     * 
     * @param owner
     */
    public void setOwner(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS owner) {
        this.owner = owner;
    }


    /**
     * Gets the personality value for this DepositBean.
     * 
     * @return personality
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType getPersonality() {
        return personality;
    }


    /**
     * Sets the personality value for this DepositBean.
     * 
     * @param personality
     */
    public void setPersonality(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personality) {
        this.personality = personality;
    }


    /**
     * Gets the signature value for this DepositBean.
     * 
     * @return signature
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this DepositBean.
     * 
     * @param signature
     */
    public void setSignature(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signature) {
        this.signature = signature;
    }


    /**
     * Gets the supportCurrency value for this DepositBean.
     * 
     * @return supportCurrency
     */
    public java.lang.String getSupportCurrency() {
        return supportCurrency;
    }


    /**
     * Sets the supportCurrency value for this DepositBean.
     * 
     * @param supportCurrency
     */
    public void setSupportCurrency(java.lang.String supportCurrency) {
        this.supportCurrency = supportCurrency;
    }


    /**
     * Gets the supportDepositNumber value for this DepositBean.
     * 
     * @return supportDepositNumber
     */
    public java.lang.String getSupportDepositNumber() {
        return supportDepositNumber;
    }


    /**
     * Sets the supportDepositNumber value for this DepositBean.
     * 
     * @param supportDepositNumber
     */
    public void setSupportDepositNumber(java.lang.String supportDepositNumber) {
        this.supportDepositNumber = supportDepositNumber;
    }


    /**
     * Gets the supportDepositStatus value for this DepositBean.
     * 
     * @return supportDepositStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS getSupportDepositStatus() {
        return supportDepositStatus;
    }


    /**
     * Sets the supportDepositStatus value for this DepositBean.
     * 
     * @param supportDepositStatus
     */
    public void setSupportDepositStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatusWS supportDepositStatus) {
        this.supportDepositStatus = supportDepositStatus;
    }


    /**
     * Gets the supportStatus value for this DepositBean.
     * 
     * @return supportStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus getSupportStatus() {
        return supportStatus;
    }


    /**
     * Sets the supportStatus value for this DepositBean.
     * 
     * @param supportStatus
     */
    public void setSupportStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus supportStatus) {
        this.supportStatus = supportStatus;
    }


    /**
     * Gets the withdrawalOption value for this DepositBean.
     * 
     * @return withdrawalOption
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS getWithdrawalOption() {
        return withdrawalOption;
    }


    /**
     * Sets the withdrawalOption value for this DepositBean.
     * 
     * @param withdrawalOption
     */
    public void setWithdrawalOption(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS withdrawalOption) {
        this.withdrawalOption = withdrawalOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositBean)) return false;
        DepositBean other = (DepositBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableBalance==null && other.getAvailableBalance()==null) || 
             (this.availableBalance!=null &&
              this.availableBalance.equals(other.getAvailableBalance()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.blockedAmount==null && other.getBlockedAmount()==null) || 
             (this.blockedAmount!=null &&
              this.blockedAmount.equals(other.getBlockedAmount()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.creditDeposit==null && other.getCreditDeposit()==null) || 
             (this.creditDeposit!=null &&
              this.creditDeposit.equals(other.getCreditDeposit()))) &&
            ((this.creditLoanRemainAmount==null && other.getCreditLoanRemainAmount()==null) || 
             (this.creditLoanRemainAmount!=null &&
              this.creditLoanRemainAmount.equals(other.getCreditLoanRemainAmount()))) &&
            ((this.creditRateAmount==null && other.getCreditRateAmount()==null) || 
             (this.creditRateAmount!=null &&
              this.creditRateAmount.equals(other.getCreditRateAmount()))) &&
            ((this.creditRemainAmount==null && other.getCreditRemainAmount()==null) || 
             (this.creditRemainAmount!=null &&
              this.creditRemainAmount.equals(other.getCreditRemainAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.depositStatus==null && other.getDepositStatus()==null) || 
             (this.depositStatus!=null &&
              this.depositStatus.equals(other.getDepositStatus()))) &&
            ((this.depositTitle==null && other.getDepositTitle()==null) || 
             (this.depositTitle!=null &&
              this.depositTitle.equals(other.getDepositTitle()))) &&
            ((this.depositType==null && other.getDepositType()==null) || 
             (this.depositType!=null &&
              this.depositType.equals(other.getDepositType()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.extraAvailableBalance==null && other.getExtraAvailableBalance()==null) || 
             (this.extraAvailableBalance!=null &&
              this.extraAvailableBalance.equals(other.getExtraAvailableBalance()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.ibanNumber==null && other.getIbanNumber()==null) || 
             (this.ibanNumber!=null &&
              this.ibanNumber.equals(other.getIbanNumber()))) &&
            ((this.inaugurationDate==null && other.getInaugurationDate()==null) || 
             (this.inaugurationDate!=null &&
              this.inaugurationDate.equals(other.getInaugurationDate()))) &&
            ((this.maximumBalance==null && other.getMaximumBalance()==null) || 
             (this.maximumBalance!=null &&
              this.maximumBalance.equals(other.getMaximumBalance()))) &&
            ((this.minAmountForInterestInclusion==null && other.getMinAmountForInterestInclusion()==null) || 
             (this.minAmountForInterestInclusion!=null &&
              this.minAmountForInterestInclusion.equals(other.getMinAmountForInterestInclusion()))) &&
            ((this.minimumBalance==null && other.getMinimumBalance()==null) || 
             (this.minimumBalance!=null &&
              this.minimumBalance.equals(other.getMinimumBalance()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.personality==null && other.getPersonality()==null) || 
             (this.personality!=null &&
              this.personality.equals(other.getPersonality()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.supportCurrency==null && other.getSupportCurrency()==null) || 
             (this.supportCurrency!=null &&
              this.supportCurrency.equals(other.getSupportCurrency()))) &&
            ((this.supportDepositNumber==null && other.getSupportDepositNumber()==null) || 
             (this.supportDepositNumber!=null &&
              this.supportDepositNumber.equals(other.getSupportDepositNumber()))) &&
            ((this.supportDepositStatus==null && other.getSupportDepositStatus()==null) || 
             (this.supportDepositStatus!=null &&
              this.supportDepositStatus.equals(other.getSupportDepositStatus()))) &&
            ((this.supportStatus==null && other.getSupportStatus()==null) || 
             (this.supportStatus!=null &&
              this.supportStatus.equals(other.getSupportStatus()))) &&
            ((this.withdrawalOption==null && other.getWithdrawalOption()==null) || 
             (this.withdrawalOption!=null &&
              this.withdrawalOption.equals(other.getWithdrawalOption())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAvailableBalance() != null) {
            _hashCode += getAvailableBalance().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBlockedAmount() != null) {
            _hashCode += getBlockedAmount().hashCode();
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getCreditDeposit() != null) {
            _hashCode += getCreditDeposit().hashCode();
        }
        if (getCreditLoanRemainAmount() != null) {
            _hashCode += getCreditLoanRemainAmount().hashCode();
        }
        if (getCreditRateAmount() != null) {
            _hashCode += getCreditRateAmount().hashCode();
        }
        if (getCreditRemainAmount() != null) {
            _hashCode += getCreditRemainAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getDepositStatus() != null) {
            _hashCode += getDepositStatus().hashCode();
        }
        if (getDepositTitle() != null) {
            _hashCode += getDepositTitle().hashCode();
        }
        if (getDepositType() != null) {
            _hashCode += getDepositType().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getExtraAvailableBalance() != null) {
            _hashCode += getExtraAvailableBalance().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getIbanNumber() != null) {
            _hashCode += getIbanNumber().hashCode();
        }
        if (getInaugurationDate() != null) {
            _hashCode += getInaugurationDate().hashCode();
        }
        if (getMaximumBalance() != null) {
            _hashCode += getMaximumBalance().hashCode();
        }
        if (getMinAmountForInterestInclusion() != null) {
            _hashCode += getMinAmountForInterestInclusion().hashCode();
        }
        if (getMinimumBalance() != null) {
            _hashCode += getMinimumBalance().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getPersonality() != null) {
            _hashCode += getPersonality().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSupportCurrency() != null) {
            _hashCode += getSupportCurrency().hashCode();
        }
        if (getSupportDepositNumber() != null) {
            _hashCode += getSupportDepositNumber().hashCode();
        }
        if (getSupportDepositStatus() != null) {
            _hashCode += getSupportDepositStatus().hashCode();
        }
        if (getSupportStatus() != null) {
            _hashCode += getSupportStatus().hashCode();
        }
        if (getWithdrawalOption() != null) {
            _hashCode += getWithdrawalOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLoanRemainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditLoanRemainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditRateAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditRateAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditRemainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditRemainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraAvailableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraAvailableBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inaugurationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inaugurationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmountForInterestInclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minAmountForInterestInclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositOwnerTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "personalityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signatureOwnerStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportDepositStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportDepositStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "supportStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawalOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "withdrawalOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "withdrawalOptionWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
