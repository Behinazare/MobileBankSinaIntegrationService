/**
 * PaymentBillStatementRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentBillStatementRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.util.Calendar fromDate;

    private java.lang.String institutionId;

    private java.lang.Long length;

    private java.math.BigDecimal maximumAmount;

    private java.math.BigDecimal minimumAmount;

    private java.lang.Long offset;

    private java.lang.String paymentId;

    private java.lang.String referenceNumber;

    private java.util.Calendar toDate;

    public PaymentBillStatementRequestBean() {
    }

    public PaymentBillStatementRequestBean(
           java.lang.String cif,
           java.util.Calendar fromDate,
           java.lang.String institutionId,
           java.lang.Long length,
           java.math.BigDecimal maximumAmount,
           java.math.BigDecimal minimumAmount,
           java.lang.Long offset,
           java.lang.String paymentId,
           java.lang.String referenceNumber,
           java.util.Calendar toDate) {
           this.cif = cif;
           this.fromDate = fromDate;
           this.institutionId = institutionId;
           this.length = length;
           this.maximumAmount = maximumAmount;
           this.minimumAmount = minimumAmount;
           this.offset = offset;
           this.paymentId = paymentId;
           this.referenceNumber = referenceNumber;
           this.toDate = toDate;
    }


    /**
     * Gets the cif value for this PaymentBillStatementRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this PaymentBillStatementRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the fromDate value for this PaymentBillStatementRequestBean.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this PaymentBillStatementRequestBean.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the institutionId value for this PaymentBillStatementRequestBean.
     * 
     * @return institutionId
     */
    public java.lang.String getInstitutionId() {
        return institutionId;
    }


    /**
     * Sets the institutionId value for this PaymentBillStatementRequestBean.
     * 
     * @param institutionId
     */
    public void setInstitutionId(java.lang.String institutionId) {
        this.institutionId = institutionId;
    }


    /**
     * Gets the length value for this PaymentBillStatementRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this PaymentBillStatementRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the maximumAmount value for this PaymentBillStatementRequestBean.
     * 
     * @return maximumAmount
     */
    public java.math.BigDecimal getMaximumAmount() {
        return maximumAmount;
    }


    /**
     * Sets the maximumAmount value for this PaymentBillStatementRequestBean.
     * 
     * @param maximumAmount
     */
    public void setMaximumAmount(java.math.BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }


    /**
     * Gets the minimumAmount value for this PaymentBillStatementRequestBean.
     * 
     * @return minimumAmount
     */
    public java.math.BigDecimal getMinimumAmount() {
        return minimumAmount;
    }


    /**
     * Sets the minimumAmount value for this PaymentBillStatementRequestBean.
     * 
     * @param minimumAmount
     */
    public void setMinimumAmount(java.math.BigDecimal minimumAmount) {
        this.minimumAmount = minimumAmount;
    }


    /**
     * Gets the offset value for this PaymentBillStatementRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this PaymentBillStatementRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the paymentId value for this PaymentBillStatementRequestBean.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this PaymentBillStatementRequestBean.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the referenceNumber value for this PaymentBillStatementRequestBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this PaymentBillStatementRequestBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the toDate value for this PaymentBillStatementRequestBean.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this PaymentBillStatementRequestBean.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentBillStatementRequestBean)) return false;
        PaymentBillStatementRequestBean other = (PaymentBillStatementRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.institutionId==null && other.getInstitutionId()==null) || 
             (this.institutionId!=null &&
              this.institutionId.equals(other.getInstitutionId()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.maximumAmount==null && other.getMaximumAmount()==null) || 
             (this.maximumAmount!=null &&
              this.maximumAmount.equals(other.getMaximumAmount()))) &&
            ((this.minimumAmount==null && other.getMinimumAmount()==null) || 
             (this.minimumAmount!=null &&
              this.minimumAmount.equals(other.getMinimumAmount()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getInstitutionId() != null) {
            _hashCode += getInstitutionId().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getMaximumAmount() != null) {
            _hashCode += getMaximumAmount().hashCode();
        }
        if (getMinimumAmount() != null) {
            _hashCode += getMinimumAmount().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentBillStatementRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentBillStatementRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institutionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "institutionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
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
