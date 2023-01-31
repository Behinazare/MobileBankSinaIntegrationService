/**
 * GuarantyBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class GuarantyBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.util.Calendar beginDate;

    private java.lang.String branchCode;

    private java.lang.String branchName;

    private java.lang.String centerBankCode;

    private java.lang.String centralBankId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanStatus creditStatus;

    private java.lang.String currency;

    private java.lang.String customerName;

    private int duration;

    private java.util.Calendar endDate;

    private java.lang.String id;

    private java.lang.String stakeHolderAddress;

    private java.lang.String stakeHolderIban;

    private java.lang.String stakeHolderIdentity;

    private java.lang.String stakeHolderName;

    private java.lang.String stakeHolderPostalCode;

    private java.lang.String stakeHolderTelephoneNo;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyStateWS status;

    private java.lang.String typeDescription;

    public GuarantyBean() {
    }

    public GuarantyBean(
           java.math.BigDecimal amount,
           java.util.Calendar beginDate,
           java.lang.String branchCode,
           java.lang.String branchName,
           java.lang.String centerBankCode,
           java.lang.String centralBankId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanStatus creditStatus,
           java.lang.String currency,
           java.lang.String customerName,
           int duration,
           java.util.Calendar endDate,
           java.lang.String id,
           java.lang.String stakeHolderAddress,
           java.lang.String stakeHolderIban,
           java.lang.String stakeHolderIdentity,
           java.lang.String stakeHolderName,
           java.lang.String stakeHolderPostalCode,
           java.lang.String stakeHolderTelephoneNo,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyStateWS status,
           java.lang.String typeDescription) {
           this.amount = amount;
           this.beginDate = beginDate;
           this.branchCode = branchCode;
           this.branchName = branchName;
           this.centerBankCode = centerBankCode;
           this.centralBankId = centralBankId;
           this.creditStatus = creditStatus;
           this.currency = currency;
           this.customerName = customerName;
           this.duration = duration;
           this.endDate = endDate;
           this.id = id;
           this.stakeHolderAddress = stakeHolderAddress;
           this.stakeHolderIban = stakeHolderIban;
           this.stakeHolderIdentity = stakeHolderIdentity;
           this.stakeHolderName = stakeHolderName;
           this.stakeHolderPostalCode = stakeHolderPostalCode;
           this.stakeHolderTelephoneNo = stakeHolderTelephoneNo;
           this.status = status;
           this.typeDescription = typeDescription;
    }


    /**
     * Gets the amount value for this GuarantyBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this GuarantyBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the beginDate value for this GuarantyBean.
     * 
     * @return beginDate
     */
    public java.util.Calendar getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this GuarantyBean.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.util.Calendar beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the branchCode value for this GuarantyBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this GuarantyBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the branchName value for this GuarantyBean.
     * 
     * @return branchName
     */
    public java.lang.String getBranchName() {
        return branchName;
    }


    /**
     * Sets the branchName value for this GuarantyBean.
     * 
     * @param branchName
     */
    public void setBranchName(java.lang.String branchName) {
        this.branchName = branchName;
    }


    /**
     * Gets the centerBankCode value for this GuarantyBean.
     * 
     * @return centerBankCode
     */
    public java.lang.String getCenterBankCode() {
        return centerBankCode;
    }


    /**
     * Sets the centerBankCode value for this GuarantyBean.
     * 
     * @param centerBankCode
     */
    public void setCenterBankCode(java.lang.String centerBankCode) {
        this.centerBankCode = centerBankCode;
    }


    /**
     * Gets the centralBankId value for this GuarantyBean.
     * 
     * @return centralBankId
     */
    public java.lang.String getCentralBankId() {
        return centralBankId;
    }


    /**
     * Sets the centralBankId value for this GuarantyBean.
     * 
     * @param centralBankId
     */
    public void setCentralBankId(java.lang.String centralBankId) {
        this.centralBankId = centralBankId;
    }


    /**
     * Gets the creditStatus value for this GuarantyBean.
     * 
     * @return creditStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanStatus getCreditStatus() {
        return creditStatus;
    }


    /**
     * Sets the creditStatus value for this GuarantyBean.
     * 
     * @param creditStatus
     */
    public void setCreditStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanStatus creditStatus) {
        this.creditStatus = creditStatus;
    }


    /**
     * Gets the currency value for this GuarantyBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this GuarantyBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the customerName value for this GuarantyBean.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this GuarantyBean.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the duration value for this GuarantyBean.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this GuarantyBean.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the endDate value for this GuarantyBean.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GuarantyBean.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the id value for this GuarantyBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this GuarantyBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the stakeHolderAddress value for this GuarantyBean.
     * 
     * @return stakeHolderAddress
     */
    public java.lang.String getStakeHolderAddress() {
        return stakeHolderAddress;
    }


    /**
     * Sets the stakeHolderAddress value for this GuarantyBean.
     * 
     * @param stakeHolderAddress
     */
    public void setStakeHolderAddress(java.lang.String stakeHolderAddress) {
        this.stakeHolderAddress = stakeHolderAddress;
    }


    /**
     * Gets the stakeHolderIban value for this GuarantyBean.
     * 
     * @return stakeHolderIban
     */
    public java.lang.String getStakeHolderIban() {
        return stakeHolderIban;
    }


    /**
     * Sets the stakeHolderIban value for this GuarantyBean.
     * 
     * @param stakeHolderIban
     */
    public void setStakeHolderIban(java.lang.String stakeHolderIban) {
        this.stakeHolderIban = stakeHolderIban;
    }


    /**
     * Gets the stakeHolderIdentity value for this GuarantyBean.
     * 
     * @return stakeHolderIdentity
     */
    public java.lang.String getStakeHolderIdentity() {
        return stakeHolderIdentity;
    }


    /**
     * Sets the stakeHolderIdentity value for this GuarantyBean.
     * 
     * @param stakeHolderIdentity
     */
    public void setStakeHolderIdentity(java.lang.String stakeHolderIdentity) {
        this.stakeHolderIdentity = stakeHolderIdentity;
    }


    /**
     * Gets the stakeHolderName value for this GuarantyBean.
     * 
     * @return stakeHolderName
     */
    public java.lang.String getStakeHolderName() {
        return stakeHolderName;
    }


    /**
     * Sets the stakeHolderName value for this GuarantyBean.
     * 
     * @param stakeHolderName
     */
    public void setStakeHolderName(java.lang.String stakeHolderName) {
        this.stakeHolderName = stakeHolderName;
    }


    /**
     * Gets the stakeHolderPostalCode value for this GuarantyBean.
     * 
     * @return stakeHolderPostalCode
     */
    public java.lang.String getStakeHolderPostalCode() {
        return stakeHolderPostalCode;
    }


    /**
     * Sets the stakeHolderPostalCode value for this GuarantyBean.
     * 
     * @param stakeHolderPostalCode
     */
    public void setStakeHolderPostalCode(java.lang.String stakeHolderPostalCode) {
        this.stakeHolderPostalCode = stakeHolderPostalCode;
    }


    /**
     * Gets the stakeHolderTelephoneNo value for this GuarantyBean.
     * 
     * @return stakeHolderTelephoneNo
     */
    public java.lang.String getStakeHolderTelephoneNo() {
        return stakeHolderTelephoneNo;
    }


    /**
     * Sets the stakeHolderTelephoneNo value for this GuarantyBean.
     * 
     * @param stakeHolderTelephoneNo
     */
    public void setStakeHolderTelephoneNo(java.lang.String stakeHolderTelephoneNo) {
        this.stakeHolderTelephoneNo = stakeHolderTelephoneNo;
    }


    /**
     * Gets the status value for this GuarantyBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyStateWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GuarantyBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyStateWS status) {
        this.status = status;
    }


    /**
     * Gets the typeDescription value for this GuarantyBean.
     * 
     * @return typeDescription
     */
    public java.lang.String getTypeDescription() {
        return typeDescription;
    }


    /**
     * Sets the typeDescription value for this GuarantyBean.
     * 
     * @param typeDescription
     */
    public void setTypeDescription(java.lang.String typeDescription) {
        this.typeDescription = typeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuarantyBean)) return false;
        GuarantyBean other = (GuarantyBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.branchName==null && other.getBranchName()==null) || 
             (this.branchName!=null &&
              this.branchName.equals(other.getBranchName()))) &&
            ((this.centerBankCode==null && other.getCenterBankCode()==null) || 
             (this.centerBankCode!=null &&
              this.centerBankCode.equals(other.getCenterBankCode()))) &&
            ((this.centralBankId==null && other.getCentralBankId()==null) || 
             (this.centralBankId!=null &&
              this.centralBankId.equals(other.getCentralBankId()))) &&
            ((this.creditStatus==null && other.getCreditStatus()==null) || 
             (this.creditStatus!=null &&
              this.creditStatus.equals(other.getCreditStatus()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            this.duration == other.getDuration() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.stakeHolderAddress==null && other.getStakeHolderAddress()==null) || 
             (this.stakeHolderAddress!=null &&
              this.stakeHolderAddress.equals(other.getStakeHolderAddress()))) &&
            ((this.stakeHolderIban==null && other.getStakeHolderIban()==null) || 
             (this.stakeHolderIban!=null &&
              this.stakeHolderIban.equals(other.getStakeHolderIban()))) &&
            ((this.stakeHolderIdentity==null && other.getStakeHolderIdentity()==null) || 
             (this.stakeHolderIdentity!=null &&
              this.stakeHolderIdentity.equals(other.getStakeHolderIdentity()))) &&
            ((this.stakeHolderName==null && other.getStakeHolderName()==null) || 
             (this.stakeHolderName!=null &&
              this.stakeHolderName.equals(other.getStakeHolderName()))) &&
            ((this.stakeHolderPostalCode==null && other.getStakeHolderPostalCode()==null) || 
             (this.stakeHolderPostalCode!=null &&
              this.stakeHolderPostalCode.equals(other.getStakeHolderPostalCode()))) &&
            ((this.stakeHolderTelephoneNo==null && other.getStakeHolderTelephoneNo()==null) || 
             (this.stakeHolderTelephoneNo!=null &&
              this.stakeHolderTelephoneNo.equals(other.getStakeHolderTelephoneNo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.typeDescription==null && other.getTypeDescription()==null) || 
             (this.typeDescription!=null &&
              this.typeDescription.equals(other.getTypeDescription())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getBranchName() != null) {
            _hashCode += getBranchName().hashCode();
        }
        if (getCenterBankCode() != null) {
            _hashCode += getCenterBankCode().hashCode();
        }
        if (getCentralBankId() != null) {
            _hashCode += getCentralBankId().hashCode();
        }
        if (getCreditStatus() != null) {
            _hashCode += getCreditStatus().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        _hashCode += getDuration();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStakeHolderAddress() != null) {
            _hashCode += getStakeHolderAddress().hashCode();
        }
        if (getStakeHolderIban() != null) {
            _hashCode += getStakeHolderIban().hashCode();
        }
        if (getStakeHolderIdentity() != null) {
            _hashCode += getStakeHolderIdentity().hashCode();
        }
        if (getStakeHolderName() != null) {
            _hashCode += getStakeHolderName().hashCode();
        }
        if (getStakeHolderPostalCode() != null) {
            _hashCode += getStakeHolderPostalCode().hashCode();
        }
        if (getStakeHolderTelephoneNo() != null) {
            _hashCode += getStakeHolderTelephoneNo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTypeDescription() != null) {
            _hashCode += getTypeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuarantyBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "guarantyBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("branchName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centerBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centerBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralBankId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "centralBankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanStatus"));
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
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stakeHolderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stakeHolderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stakeHolderIban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stakeHolderIban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stakeHolderIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stakeHolderIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stakeHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stakeHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stakeHolderPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stakeHolderPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stakeHolderTelephoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stakeHolderTelephoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "guarantyStateWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
