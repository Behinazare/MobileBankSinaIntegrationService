/**
 * CompleteDepositBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CompleteDepositBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBean branch;

    private java.lang.String creditDeposit;

    private java.math.BigDecimal creditDepositRemainAmount;

    private java.math.BigDecimal creditLoanRemainAmount;

    private java.math.BigDecimal creditProfitRemainAmount;

    private java.lang.Double creditRateAmount;

    private java.math.BigDecimal creditRemainAmount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean deposit;

    private java.lang.String depositTitle;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS group;

    private java.lang.Long interestPayDay;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS owner;

    private java.lang.Long paymentPeriod;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personality;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signature;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean support;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS supportGroupType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus supportStatus;

    private java.lang.Boolean supportVisibility;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS withdrawalOption;

    public CompleteDepositBean() {
    }

    public CompleteDepositBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBean branch,
           java.lang.String creditDeposit,
           java.math.BigDecimal creditDepositRemainAmount,
           java.math.BigDecimal creditLoanRemainAmount,
           java.math.BigDecimal creditProfitRemainAmount,
           java.lang.Double creditRateAmount,
           java.math.BigDecimal creditRemainAmount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean deposit,
           java.lang.String depositTitle,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS group,
           java.lang.Long interestPayDay,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS owner,
           java.lang.Long paymentPeriod,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personality,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signature,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean support,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS supportGroupType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus supportStatus,
           java.lang.Boolean supportVisibility,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS withdrawalOption) {
           this.branch = branch;
           this.creditDeposit = creditDeposit;
           this.creditDepositRemainAmount = creditDepositRemainAmount;
           this.creditLoanRemainAmount = creditLoanRemainAmount;
           this.creditProfitRemainAmount = creditProfitRemainAmount;
           this.creditRateAmount = creditRateAmount;
           this.creditRemainAmount = creditRemainAmount;
           this.deposit = deposit;
           this.depositTitle = depositTitle;
           this.group = group;
           this.interestPayDay = interestPayDay;
           this.owner = owner;
           this.paymentPeriod = paymentPeriod;
           this.personality = personality;
           this.signature = signature;
           this.support = support;
           this.supportGroupType = supportGroupType;
           this.supportStatus = supportStatus;
           this.supportVisibility = supportVisibility;
           this.withdrawalOption = withdrawalOption;
    }


    /**
     * Gets the branch value for this CompleteDepositBean.
     * 
     * @return branch
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBean getBranch() {
        return branch;
    }


    /**
     * Sets the branch value for this CompleteDepositBean.
     * 
     * @param branch
     */
    public void setBranch(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBean branch) {
        this.branch = branch;
    }


    /**
     * Gets the creditDeposit value for this CompleteDepositBean.
     * 
     * @return creditDeposit
     */
    public java.lang.String getCreditDeposit() {
        return creditDeposit;
    }


    /**
     * Sets the creditDeposit value for this CompleteDepositBean.
     * 
     * @param creditDeposit
     */
    public void setCreditDeposit(java.lang.String creditDeposit) {
        this.creditDeposit = creditDeposit;
    }


    /**
     * Gets the creditDepositRemainAmount value for this CompleteDepositBean.
     * 
     * @return creditDepositRemainAmount
     */
    public java.math.BigDecimal getCreditDepositRemainAmount() {
        return creditDepositRemainAmount;
    }


    /**
     * Sets the creditDepositRemainAmount value for this CompleteDepositBean.
     * 
     * @param creditDepositRemainAmount
     */
    public void setCreditDepositRemainAmount(java.math.BigDecimal creditDepositRemainAmount) {
        this.creditDepositRemainAmount = creditDepositRemainAmount;
    }


    /**
     * Gets the creditLoanRemainAmount value for this CompleteDepositBean.
     * 
     * @return creditLoanRemainAmount
     */
    public java.math.BigDecimal getCreditLoanRemainAmount() {
        return creditLoanRemainAmount;
    }


    /**
     * Sets the creditLoanRemainAmount value for this CompleteDepositBean.
     * 
     * @param creditLoanRemainAmount
     */
    public void setCreditLoanRemainAmount(java.math.BigDecimal creditLoanRemainAmount) {
        this.creditLoanRemainAmount = creditLoanRemainAmount;
    }


    /**
     * Gets the creditProfitRemainAmount value for this CompleteDepositBean.
     * 
     * @return creditProfitRemainAmount
     */
    public java.math.BigDecimal getCreditProfitRemainAmount() {
        return creditProfitRemainAmount;
    }


    /**
     * Sets the creditProfitRemainAmount value for this CompleteDepositBean.
     * 
     * @param creditProfitRemainAmount
     */
    public void setCreditProfitRemainAmount(java.math.BigDecimal creditProfitRemainAmount) {
        this.creditProfitRemainAmount = creditProfitRemainAmount;
    }


    /**
     * Gets the creditRateAmount value for this CompleteDepositBean.
     * 
     * @return creditRateAmount
     */
    public java.lang.Double getCreditRateAmount() {
        return creditRateAmount;
    }


    /**
     * Sets the creditRateAmount value for this CompleteDepositBean.
     * 
     * @param creditRateAmount
     */
    public void setCreditRateAmount(java.lang.Double creditRateAmount) {
        this.creditRateAmount = creditRateAmount;
    }


    /**
     * Gets the creditRemainAmount value for this CompleteDepositBean.
     * 
     * @return creditRemainAmount
     */
    public java.math.BigDecimal getCreditRemainAmount() {
        return creditRemainAmount;
    }


    /**
     * Sets the creditRemainAmount value for this CompleteDepositBean.
     * 
     * @param creditRemainAmount
     */
    public void setCreditRemainAmount(java.math.BigDecimal creditRemainAmount) {
        this.creditRemainAmount = creditRemainAmount;
    }


    /**
     * Gets the deposit value for this CompleteDepositBean.
     * 
     * @return deposit
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this CompleteDepositBean.
     * 
     * @param deposit
     */
    public void setDeposit(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the depositTitle value for this CompleteDepositBean.
     * 
     * @return depositTitle
     */
    public java.lang.String getDepositTitle() {
        return depositTitle;
    }


    /**
     * Sets the depositTitle value for this CompleteDepositBean.
     * 
     * @param depositTitle
     */
    public void setDepositTitle(java.lang.String depositTitle) {
        this.depositTitle = depositTitle;
    }


    /**
     * Gets the group value for this CompleteDepositBean.
     * 
     * @return group
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CompleteDepositBean.
     * 
     * @param group
     */
    public void setGroup(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS group) {
        this.group = group;
    }


    /**
     * Gets the interestPayDay value for this CompleteDepositBean.
     * 
     * @return interestPayDay
     */
    public java.lang.Long getInterestPayDay() {
        return interestPayDay;
    }


    /**
     * Sets the interestPayDay value for this CompleteDepositBean.
     * 
     * @param interestPayDay
     */
    public void setInterestPayDay(java.lang.Long interestPayDay) {
        this.interestPayDay = interestPayDay;
    }


    /**
     * Gets the owner value for this CompleteDepositBean.
     * 
     * @return owner
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CompleteDepositBean.
     * 
     * @param owner
     */
    public void setOwner(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositOwnerTypeWS owner) {
        this.owner = owner;
    }


    /**
     * Gets the paymentPeriod value for this CompleteDepositBean.
     * 
     * @return paymentPeriod
     */
    public java.lang.Long getPaymentPeriod() {
        return paymentPeriod;
    }


    /**
     * Sets the paymentPeriod value for this CompleteDepositBean.
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(java.lang.Long paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }


    /**
     * Gets the personality value for this CompleteDepositBean.
     * 
     * @return personality
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType getPersonality() {
        return personality;
    }


    /**
     * Sets the personality value for this CompleteDepositBean.
     * 
     * @param personality
     */
    public void setPersonality(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personality) {
        this.personality = personality;
    }


    /**
     * Gets the signature value for this CompleteDepositBean.
     * 
     * @return signature
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this CompleteDepositBean.
     * 
     * @param signature
     */
    public void setSignature(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signature) {
        this.signature = signature;
    }


    /**
     * Gets the support value for this CompleteDepositBean.
     * 
     * @return support
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean getSupport() {
        return support;
    }


    /**
     * Sets the support value for this CompleteDepositBean.
     * 
     * @param support
     */
    public void setSupport(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositDetailBean support) {
        this.support = support;
    }


    /**
     * Gets the supportGroupType value for this CompleteDepositBean.
     * 
     * @return supportGroupType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getSupportGroupType() {
        return supportGroupType;
    }


    /**
     * Sets the supportGroupType value for this CompleteDepositBean.
     * 
     * @param supportGroupType
     */
    public void setSupportGroupType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS supportGroupType) {
        this.supportGroupType = supportGroupType;
    }


    /**
     * Gets the supportStatus value for this CompleteDepositBean.
     * 
     * @return supportStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus getSupportStatus() {
        return supportStatus;
    }


    /**
     * Sets the supportStatus value for this CompleteDepositBean.
     * 
     * @param supportStatus
     */
    public void setSupportStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SupportStatus supportStatus) {
        this.supportStatus = supportStatus;
    }


    /**
     * Gets the supportVisibility value for this CompleteDepositBean.
     * 
     * @return supportVisibility
     */
    public java.lang.Boolean getSupportVisibility() {
        return supportVisibility;
    }


    /**
     * Sets the supportVisibility value for this CompleteDepositBean.
     * 
     * @param supportVisibility
     */
    public void setSupportVisibility(java.lang.Boolean supportVisibility) {
        this.supportVisibility = supportVisibility;
    }


    /**
     * Gets the withdrawalOption value for this CompleteDepositBean.
     * 
     * @return withdrawalOption
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS getWithdrawalOption() {
        return withdrawalOption;
    }


    /**
     * Sets the withdrawalOption value for this CompleteDepositBean.
     * 
     * @param withdrawalOption
     */
    public void setWithdrawalOption(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.WithdrawalOptionWS withdrawalOption) {
        this.withdrawalOption = withdrawalOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompleteDepositBean)) return false;
        CompleteDepositBean other = (CompleteDepositBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branch==null && other.getBranch()==null) || 
             (this.branch!=null &&
              this.branch.equals(other.getBranch()))) &&
            ((this.creditDeposit==null && other.getCreditDeposit()==null) || 
             (this.creditDeposit!=null &&
              this.creditDeposit.equals(other.getCreditDeposit()))) &&
            ((this.creditDepositRemainAmount==null && other.getCreditDepositRemainAmount()==null) || 
             (this.creditDepositRemainAmount!=null &&
              this.creditDepositRemainAmount.equals(other.getCreditDepositRemainAmount()))) &&
            ((this.creditLoanRemainAmount==null && other.getCreditLoanRemainAmount()==null) || 
             (this.creditLoanRemainAmount!=null &&
              this.creditLoanRemainAmount.equals(other.getCreditLoanRemainAmount()))) &&
            ((this.creditProfitRemainAmount==null && other.getCreditProfitRemainAmount()==null) || 
             (this.creditProfitRemainAmount!=null &&
              this.creditProfitRemainAmount.equals(other.getCreditProfitRemainAmount()))) &&
            ((this.creditRateAmount==null && other.getCreditRateAmount()==null) || 
             (this.creditRateAmount!=null &&
              this.creditRateAmount.equals(other.getCreditRateAmount()))) &&
            ((this.creditRemainAmount==null && other.getCreditRemainAmount()==null) || 
             (this.creditRemainAmount!=null &&
              this.creditRemainAmount.equals(other.getCreditRemainAmount()))) &&
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.depositTitle==null && other.getDepositTitle()==null) || 
             (this.depositTitle!=null &&
              this.depositTitle.equals(other.getDepositTitle()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.interestPayDay==null && other.getInterestPayDay()==null) || 
             (this.interestPayDay!=null &&
              this.interestPayDay.equals(other.getInterestPayDay()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.paymentPeriod==null && other.getPaymentPeriod()==null) || 
             (this.paymentPeriod!=null &&
              this.paymentPeriod.equals(other.getPaymentPeriod()))) &&
            ((this.personality==null && other.getPersonality()==null) || 
             (this.personality!=null &&
              this.personality.equals(other.getPersonality()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.support==null && other.getSupport()==null) || 
             (this.support!=null &&
              this.support.equals(other.getSupport()))) &&
            ((this.supportGroupType==null && other.getSupportGroupType()==null) || 
             (this.supportGroupType!=null &&
              this.supportGroupType.equals(other.getSupportGroupType()))) &&
            ((this.supportStatus==null && other.getSupportStatus()==null) || 
             (this.supportStatus!=null &&
              this.supportStatus.equals(other.getSupportStatus()))) &&
            ((this.supportVisibility==null && other.getSupportVisibility()==null) || 
             (this.supportVisibility!=null &&
              this.supportVisibility.equals(other.getSupportVisibility()))) &&
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
        if (getBranch() != null) {
            _hashCode += getBranch().hashCode();
        }
        if (getCreditDeposit() != null) {
            _hashCode += getCreditDeposit().hashCode();
        }
        if (getCreditDepositRemainAmount() != null) {
            _hashCode += getCreditDepositRemainAmount().hashCode();
        }
        if (getCreditLoanRemainAmount() != null) {
            _hashCode += getCreditLoanRemainAmount().hashCode();
        }
        if (getCreditProfitRemainAmount() != null) {
            _hashCode += getCreditProfitRemainAmount().hashCode();
        }
        if (getCreditRateAmount() != null) {
            _hashCode += getCreditRateAmount().hashCode();
        }
        if (getCreditRemainAmount() != null) {
            _hashCode += getCreditRemainAmount().hashCode();
        }
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getDepositTitle() != null) {
            _hashCode += getDepositTitle().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getInterestPayDay() != null) {
            _hashCode += getInterestPayDay().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getPaymentPeriod() != null) {
            _hashCode += getPaymentPeriod().hashCode();
        }
        if (getPersonality() != null) {
            _hashCode += getPersonality().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSupport() != null) {
            _hashCode += getSupport().hashCode();
        }
        if (getSupportGroupType() != null) {
            _hashCode += getSupportGroupType().hashCode();
        }
        if (getSupportStatus() != null) {
            _hashCode += getSupportStatus().hashCode();
        }
        if (getSupportVisibility() != null) {
            _hashCode += getSupportVisibility().hashCode();
        }
        if (getWithdrawalOption() != null) {
            _hashCode += getWithdrawalOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompleteDepositBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "completeDepositBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "branchBean"));
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
        elemField.setFieldName("creditDepositRemainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditDepositRemainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("creditProfitRemainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditProfitRemainAmount"));
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
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositDetailBean"));
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
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestPayDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interestPayDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("paymentPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("support");
        elemField.setXmlName(new javax.xml.namespace.QName("", "support"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
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
        elemField.setFieldName("supportVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
