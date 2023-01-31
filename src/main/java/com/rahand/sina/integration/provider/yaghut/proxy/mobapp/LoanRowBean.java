/**
 * LoanRowBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanRowBean  implements java.io.Serializable {
    private java.lang.Integer delayDay;

    private java.util.Calendar payDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS payStatus;

    private java.math.BigDecimal payedAmount;

    private java.math.BigDecimal penaltyAmount;

    private java.math.BigDecimal unpaidAmount;

    public LoanRowBean() {
    }

    public LoanRowBean(
           java.lang.Integer delayDay,
           java.util.Calendar payDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS payStatus,
           java.math.BigDecimal payedAmount,
           java.math.BigDecimal penaltyAmount,
           java.math.BigDecimal unpaidAmount) {
           this.delayDay = delayDay;
           this.payDate = payDate;
           this.payStatus = payStatus;
           this.payedAmount = payedAmount;
           this.penaltyAmount = penaltyAmount;
           this.unpaidAmount = unpaidAmount;
    }


    /**
     * Gets the delayDay value for this LoanRowBean.
     * 
     * @return delayDay
     */
    public java.lang.Integer getDelayDay() {
        return delayDay;
    }


    /**
     * Sets the delayDay value for this LoanRowBean.
     * 
     * @param delayDay
     */
    public void setDelayDay(java.lang.Integer delayDay) {
        this.delayDay = delayDay;
    }


    /**
     * Gets the payDate value for this LoanRowBean.
     * 
     * @return payDate
     */
    public java.util.Calendar getPayDate() {
        return payDate;
    }


    /**
     * Sets the payDate value for this LoanRowBean.
     * 
     * @param payDate
     */
    public void setPayDate(java.util.Calendar payDate) {
        this.payDate = payDate;
    }


    /**
     * Gets the payStatus value for this LoanRowBean.
     * 
     * @return payStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS getPayStatus() {
        return payStatus;
    }


    /**
     * Sets the payStatus value for this LoanRowBean.
     * 
     * @param payStatus
     */
    public void setPayStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS payStatus) {
        this.payStatus = payStatus;
    }


    /**
     * Gets the payedAmount value for this LoanRowBean.
     * 
     * @return payedAmount
     */
    public java.math.BigDecimal getPayedAmount() {
        return payedAmount;
    }


    /**
     * Sets the payedAmount value for this LoanRowBean.
     * 
     * @param payedAmount
     */
    public void setPayedAmount(java.math.BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
    }


    /**
     * Gets the penaltyAmount value for this LoanRowBean.
     * 
     * @return penaltyAmount
     */
    public java.math.BigDecimal getPenaltyAmount() {
        return penaltyAmount;
    }


    /**
     * Sets the penaltyAmount value for this LoanRowBean.
     * 
     * @param penaltyAmount
     */
    public void setPenaltyAmount(java.math.BigDecimal penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }


    /**
     * Gets the unpaidAmount value for this LoanRowBean.
     * 
     * @return unpaidAmount
     */
    public java.math.BigDecimal getUnpaidAmount() {
        return unpaidAmount;
    }


    /**
     * Sets the unpaidAmount value for this LoanRowBean.
     * 
     * @param unpaidAmount
     */
    public void setUnpaidAmount(java.math.BigDecimal unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanRowBean)) return false;
        LoanRowBean other = (LoanRowBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delayDay==null && other.getDelayDay()==null) || 
             (this.delayDay!=null &&
              this.delayDay.equals(other.getDelayDay()))) &&
            ((this.payDate==null && other.getPayDate()==null) || 
             (this.payDate!=null &&
              this.payDate.equals(other.getPayDate()))) &&
            ((this.payStatus==null && other.getPayStatus()==null) || 
             (this.payStatus!=null &&
              this.payStatus.equals(other.getPayStatus()))) &&
            ((this.payedAmount==null && other.getPayedAmount()==null) || 
             (this.payedAmount!=null &&
              this.payedAmount.equals(other.getPayedAmount()))) &&
            ((this.penaltyAmount==null && other.getPenaltyAmount()==null) || 
             (this.penaltyAmount!=null &&
              this.penaltyAmount.equals(other.getPenaltyAmount()))) &&
            ((this.unpaidAmount==null && other.getUnpaidAmount()==null) || 
             (this.unpaidAmount!=null &&
              this.unpaidAmount.equals(other.getUnpaidAmount())));
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
        if (getDelayDay() != null) {
            _hashCode += getDelayDay().hashCode();
        }
        if (getPayDate() != null) {
            _hashCode += getPayDate().hashCode();
        }
        if (getPayStatus() != null) {
            _hashCode += getPayStatus().hashCode();
        }
        if (getPayedAmount() != null) {
            _hashCode += getPayedAmount().hashCode();
        }
        if (getPenaltyAmount() != null) {
            _hashCode += getPenaltyAmount().hashCode();
        }
        if (getUnpaidAmount() != null) {
            _hashCode += getUnpaidAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanRowBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanRowBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delayDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delayDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "payStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penaltyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "penaltyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
