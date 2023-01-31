/**
 * InquiryChequeBaseResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InquiryChequeBaseResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String bankCode;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeBlockStatusWS blockStatus;

    private java.lang.String branchCode;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeMediaWS chequeMedia;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeStatusWS chequeStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTypeWS chequeType;

    private java.lang.String currency;

    private java.lang.String description;

    private java.util.Calendar dueDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeGuaranteeStatusWS guaranteeStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeLockStatusWS locked;

    private java.lang.String reasonCode;

    private java.lang.String sayadId;

    private java.lang.String serialNumber;

    private java.lang.String sourceIban;

    public InquiryChequeBaseResponseBean() {
    }

    public InquiryChequeBaseResponseBean(
           java.math.BigDecimal amount,
           java.lang.String bankCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeBlockStatusWS blockStatus,
           java.lang.String branchCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeMediaWS chequeMedia,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeStatusWS chequeStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTypeWS chequeType,
           java.lang.String currency,
           java.lang.String description,
           java.util.Calendar dueDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeGuaranteeStatusWS guaranteeStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeLockStatusWS locked,
           java.lang.String reasonCode,
           java.lang.String sayadId,
           java.lang.String serialNumber,
           java.lang.String sourceIban) {
           this.amount = amount;
           this.bankCode = bankCode;
           this.blockStatus = blockStatus;
           this.branchCode = branchCode;
           this.chequeMedia = chequeMedia;
           this.chequeStatus = chequeStatus;
           this.chequeType = chequeType;
           this.currency = currency;
           this.description = description;
           this.dueDate = dueDate;
           this.guaranteeStatus = guaranteeStatus;
           this.locked = locked;
           this.reasonCode = reasonCode;
           this.sayadId = sayadId;
           this.serialNumber = serialNumber;
           this.sourceIban = sourceIban;
    }


    /**
     * Gets the amount value for this InquiryChequeBaseResponseBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this InquiryChequeBaseResponseBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the bankCode value for this InquiryChequeBaseResponseBean.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this InquiryChequeBaseResponseBean.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the blockStatus value for this InquiryChequeBaseResponseBean.
     * 
     * @return blockStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeBlockStatusWS getBlockStatus() {
        return blockStatus;
    }


    /**
     * Sets the blockStatus value for this InquiryChequeBaseResponseBean.
     * 
     * @param blockStatus
     */
    public void setBlockStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeBlockStatusWS blockStatus) {
        this.blockStatus = blockStatus;
    }


    /**
     * Gets the branchCode value for this InquiryChequeBaseResponseBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this InquiryChequeBaseResponseBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the chequeMedia value for this InquiryChequeBaseResponseBean.
     * 
     * @return chequeMedia
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeMediaWS getChequeMedia() {
        return chequeMedia;
    }


    /**
     * Sets the chequeMedia value for this InquiryChequeBaseResponseBean.
     * 
     * @param chequeMedia
     */
    public void setChequeMedia(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeMediaWS chequeMedia) {
        this.chequeMedia = chequeMedia;
    }


    /**
     * Gets the chequeStatus value for this InquiryChequeBaseResponseBean.
     * 
     * @return chequeStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeStatusWS getChequeStatus() {
        return chequeStatus;
    }


    /**
     * Sets the chequeStatus value for this InquiryChequeBaseResponseBean.
     * 
     * @param chequeStatus
     */
    public void setChequeStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeStatusWS chequeStatus) {
        this.chequeStatus = chequeStatus;
    }


    /**
     * Gets the chequeType value for this InquiryChequeBaseResponseBean.
     * 
     * @return chequeType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTypeWS getChequeType() {
        return chequeType;
    }


    /**
     * Sets the chequeType value for this InquiryChequeBaseResponseBean.
     * 
     * @param chequeType
     */
    public void setChequeType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTypeWS chequeType) {
        this.chequeType = chequeType;
    }


    /**
     * Gets the currency value for this InquiryChequeBaseResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InquiryChequeBaseResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this InquiryChequeBaseResponseBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InquiryChequeBaseResponseBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dueDate value for this InquiryChequeBaseResponseBean.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InquiryChequeBaseResponseBean.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the guaranteeStatus value for this InquiryChequeBaseResponseBean.
     * 
     * @return guaranteeStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeGuaranteeStatusWS getGuaranteeStatus() {
        return guaranteeStatus;
    }


    /**
     * Sets the guaranteeStatus value for this InquiryChequeBaseResponseBean.
     * 
     * @param guaranteeStatus
     */
    public void setGuaranteeStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeGuaranteeStatusWS guaranteeStatus) {
        this.guaranteeStatus = guaranteeStatus;
    }


    /**
     * Gets the locked value for this InquiryChequeBaseResponseBean.
     * 
     * @return locked
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeLockStatusWS getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this InquiryChequeBaseResponseBean.
     * 
     * @param locked
     */
    public void setLocked(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeLockStatusWS locked) {
        this.locked = locked;
    }


    /**
     * Gets the reasonCode value for this InquiryChequeBaseResponseBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this InquiryChequeBaseResponseBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the sayadId value for this InquiryChequeBaseResponseBean.
     * 
     * @return sayadId
     */
    public java.lang.String getSayadId() {
        return sayadId;
    }


    /**
     * Sets the sayadId value for this InquiryChequeBaseResponseBean.
     * 
     * @param sayadId
     */
    public void setSayadId(java.lang.String sayadId) {
        this.sayadId = sayadId;
    }


    /**
     * Gets the serialNumber value for this InquiryChequeBaseResponseBean.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this InquiryChequeBaseResponseBean.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the sourceIban value for this InquiryChequeBaseResponseBean.
     * 
     * @return sourceIban
     */
    public java.lang.String getSourceIban() {
        return sourceIban;
    }


    /**
     * Sets the sourceIban value for this InquiryChequeBaseResponseBean.
     * 
     * @param sourceIban
     */
    public void setSourceIban(java.lang.String sourceIban) {
        this.sourceIban = sourceIban;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquiryChequeBaseResponseBean)) return false;
        InquiryChequeBaseResponseBean other = (InquiryChequeBaseResponseBean) obj;
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
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.blockStatus==null && other.getBlockStatus()==null) || 
             (this.blockStatus!=null &&
              this.blockStatus.equals(other.getBlockStatus()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.chequeMedia==null && other.getChequeMedia()==null) || 
             (this.chequeMedia!=null &&
              this.chequeMedia.equals(other.getChequeMedia()))) &&
            ((this.chequeStatus==null && other.getChequeStatus()==null) || 
             (this.chequeStatus!=null &&
              this.chequeStatus.equals(other.getChequeStatus()))) &&
            ((this.chequeType==null && other.getChequeType()==null) || 
             (this.chequeType!=null &&
              this.chequeType.equals(other.getChequeType()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.guaranteeStatus==null && other.getGuaranteeStatus()==null) || 
             (this.guaranteeStatus!=null &&
              this.guaranteeStatus.equals(other.getGuaranteeStatus()))) &&
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              this.locked.equals(other.getLocked()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.sayadId==null && other.getSayadId()==null) || 
             (this.sayadId!=null &&
              this.sayadId.equals(other.getSayadId()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.sourceIban==null && other.getSourceIban()==null) || 
             (this.sourceIban!=null &&
              this.sourceIban.equals(other.getSourceIban())));
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
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBlockStatus() != null) {
            _hashCode += getBlockStatus().hashCode();
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getChequeMedia() != null) {
            _hashCode += getChequeMedia().hashCode();
        }
        if (getChequeStatus() != null) {
            _hashCode += getChequeStatus().hashCode();
        }
        if (getChequeType() != null) {
            _hashCode += getChequeType().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getGuaranteeStatus() != null) {
            _hashCode += getGuaranteeStatus().hashCode();
        }
        if (getLocked() != null) {
            _hashCode += getLocked().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getSayadId() != null) {
            _hashCode += getSayadId().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSourceIban() != null) {
            _hashCode += getSourceIban().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquiryChequeBaseResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "inquiryChequeBaseResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeBlockStatusWS"));
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
        elemField.setFieldName("chequeMedia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeMedia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeMediaWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeTypeWS"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranteeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeGuaranteeStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeLockStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sayadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sayadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceIban"));
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
