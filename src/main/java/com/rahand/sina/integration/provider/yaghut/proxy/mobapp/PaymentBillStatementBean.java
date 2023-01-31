/**
 * PaymentBillStatementBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentBillStatementBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String currency;

    private java.lang.String description;

    private java.lang.String instituteId;

    private java.lang.String paymentId;

    private java.lang.String referenceNumber;

    private java.util.Calendar transactionDate;

    public PaymentBillStatementBean() {
    }

    public PaymentBillStatementBean(
           java.math.BigDecimal amount,
           java.lang.String currency,
           java.lang.String description,
           java.lang.String instituteId,
           java.lang.String paymentId,
           java.lang.String referenceNumber,
           java.util.Calendar transactionDate) {
           this.amount = amount;
           this.currency = currency;
           this.description = description;
           this.instituteId = instituteId;
           this.paymentId = paymentId;
           this.referenceNumber = referenceNumber;
           this.transactionDate = transactionDate;
    }


    /**
     * Gets the amount value for this PaymentBillStatementBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentBillStatementBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this PaymentBillStatementBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PaymentBillStatementBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this PaymentBillStatementBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PaymentBillStatementBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the instituteId value for this PaymentBillStatementBean.
     * 
     * @return instituteId
     */
    public java.lang.String getInstituteId() {
        return instituteId;
    }


    /**
     * Sets the instituteId value for this PaymentBillStatementBean.
     * 
     * @param instituteId
     */
    public void setInstituteId(java.lang.String instituteId) {
        this.instituteId = instituteId;
    }


    /**
     * Gets the paymentId value for this PaymentBillStatementBean.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this PaymentBillStatementBean.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the referenceNumber value for this PaymentBillStatementBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this PaymentBillStatementBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the transactionDate value for this PaymentBillStatementBean.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this PaymentBillStatementBean.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentBillStatementBean)) return false;
        PaymentBillStatementBean other = (PaymentBillStatementBean) obj;
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
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.instituteId==null && other.getInstituteId()==null) || 
             (this.instituteId!=null &&
              this.instituteId.equals(other.getInstituteId()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getInstituteId() != null) {
            _hashCode += getInstituteId().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentBillStatementBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentBillStatementBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instituteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instituteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
