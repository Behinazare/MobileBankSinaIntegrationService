/**
 * BillPaymentResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillPaymentResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String billForeignTitle;

    private java.lang.String billId;

    private java.lang.String billTitle;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType;

    private java.lang.String cycle;

    private java.util.Calendar date;

    private java.lang.String fileCode;

    private java.lang.String payId;

    private java.lang.String referralNumber;

    public BillPaymentResponseBean() {
    }

    public BillPaymentResponseBean(
           java.math.BigDecimal amount,
           java.lang.String billForeignTitle,
           java.lang.String billId,
           java.lang.String billTitle,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType,
           java.lang.String cycle,
           java.util.Calendar date,
           java.lang.String fileCode,
           java.lang.String payId,
           java.lang.String referralNumber) {
           this.amount = amount;
           this.billForeignTitle = billForeignTitle;
           this.billId = billId;
           this.billTitle = billTitle;
           this.billType = billType;
           this.cycle = cycle;
           this.date = date;
           this.fileCode = fileCode;
           this.payId = payId;
           this.referralNumber = referralNumber;
    }


    /**
     * Gets the amount value for this BillPaymentResponseBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillPaymentResponseBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the billForeignTitle value for this BillPaymentResponseBean.
     * 
     * @return billForeignTitle
     */
    public java.lang.String getBillForeignTitle() {
        return billForeignTitle;
    }


    /**
     * Sets the billForeignTitle value for this BillPaymentResponseBean.
     * 
     * @param billForeignTitle
     */
    public void setBillForeignTitle(java.lang.String billForeignTitle) {
        this.billForeignTitle = billForeignTitle;
    }


    /**
     * Gets the billId value for this BillPaymentResponseBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this BillPaymentResponseBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the billTitle value for this BillPaymentResponseBean.
     * 
     * @return billTitle
     */
    public java.lang.String getBillTitle() {
        return billTitle;
    }


    /**
     * Sets the billTitle value for this BillPaymentResponseBean.
     * 
     * @param billTitle
     */
    public void setBillTitle(java.lang.String billTitle) {
        this.billTitle = billTitle;
    }


    /**
     * Gets the billType value for this BillPaymentResponseBean.
     * 
     * @return billType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this BillPaymentResponseBean.
     * 
     * @param billType
     */
    public void setBillType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType) {
        this.billType = billType;
    }


    /**
     * Gets the cycle value for this BillPaymentResponseBean.
     * 
     * @return cycle
     */
    public java.lang.String getCycle() {
        return cycle;
    }


    /**
     * Sets the cycle value for this BillPaymentResponseBean.
     * 
     * @param cycle
     */
    public void setCycle(java.lang.String cycle) {
        this.cycle = cycle;
    }


    /**
     * Gets the date value for this BillPaymentResponseBean.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this BillPaymentResponseBean.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the fileCode value for this BillPaymentResponseBean.
     * 
     * @return fileCode
     */
    public java.lang.String getFileCode() {
        return fileCode;
    }


    /**
     * Sets the fileCode value for this BillPaymentResponseBean.
     * 
     * @param fileCode
     */
    public void setFileCode(java.lang.String fileCode) {
        this.fileCode = fileCode;
    }


    /**
     * Gets the payId value for this BillPaymentResponseBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this BillPaymentResponseBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the referralNumber value for this BillPaymentResponseBean.
     * 
     * @return referralNumber
     */
    public java.lang.String getReferralNumber() {
        return referralNumber;
    }


    /**
     * Sets the referralNumber value for this BillPaymentResponseBean.
     * 
     * @param referralNumber
     */
    public void setReferralNumber(java.lang.String referralNumber) {
        this.referralNumber = referralNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentResponseBean)) return false;
        BillPaymentResponseBean other = (BillPaymentResponseBean) obj;
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
            ((this.billForeignTitle==null && other.getBillForeignTitle()==null) || 
             (this.billForeignTitle!=null &&
              this.billForeignTitle.equals(other.getBillForeignTitle()))) &&
            ((this.billId==null && other.getBillId()==null) || 
             (this.billId!=null &&
              this.billId.equals(other.getBillId()))) &&
            ((this.billTitle==null && other.getBillTitle()==null) || 
             (this.billTitle!=null &&
              this.billTitle.equals(other.getBillTitle()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.cycle==null && other.getCycle()==null) || 
             (this.cycle!=null &&
              this.cycle.equals(other.getCycle()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.fileCode==null && other.getFileCode()==null) || 
             (this.fileCode!=null &&
              this.fileCode.equals(other.getFileCode()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.referralNumber==null && other.getReferralNumber()==null) || 
             (this.referralNumber!=null &&
              this.referralNumber.equals(other.getReferralNumber())));
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
        if (getBillForeignTitle() != null) {
            _hashCode += getBillForeignTitle().hashCode();
        }
        if (getBillId() != null) {
            _hashCode += getBillId().hashCode();
        }
        if (getBillTitle() != null) {
            _hashCode += getBillTitle().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getCycle() != null) {
            _hashCode += getCycle().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getFileCode() != null) {
            _hashCode += getFileCode().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getReferralNumber() != null) {
            _hashCode += getReferralNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billPaymentResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billForeignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billForeignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referralNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referralNumber"));
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
