/**
 * SavingDepositBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SavingDepositBean  implements java.io.Serializable {
    private long duration;

    private long lifeCycleMonth;

    private java.math.BigDecimal paymentAmount;

    private java.lang.String paymentDepositNumber;

    public SavingDepositBean() {
    }

    public SavingDepositBean(
           long duration,
           long lifeCycleMonth,
           java.math.BigDecimal paymentAmount,
           java.lang.String paymentDepositNumber) {
           this.duration = duration;
           this.lifeCycleMonth = lifeCycleMonth;
           this.paymentAmount = paymentAmount;
           this.paymentDepositNumber = paymentDepositNumber;
    }


    /**
     * Gets the duration value for this SavingDepositBean.
     * 
     * @return duration
     */
    public long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this SavingDepositBean.
     * 
     * @param duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }


    /**
     * Gets the lifeCycleMonth value for this SavingDepositBean.
     * 
     * @return lifeCycleMonth
     */
    public long getLifeCycleMonth() {
        return lifeCycleMonth;
    }


    /**
     * Sets the lifeCycleMonth value for this SavingDepositBean.
     * 
     * @param lifeCycleMonth
     */
    public void setLifeCycleMonth(long lifeCycleMonth) {
        this.lifeCycleMonth = lifeCycleMonth;
    }


    /**
     * Gets the paymentAmount value for this SavingDepositBean.
     * 
     * @return paymentAmount
     */
    public java.math.BigDecimal getPaymentAmount() {
        return paymentAmount;
    }


    /**
     * Sets the paymentAmount value for this SavingDepositBean.
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /**
     * Gets the paymentDepositNumber value for this SavingDepositBean.
     * 
     * @return paymentDepositNumber
     */
    public java.lang.String getPaymentDepositNumber() {
        return paymentDepositNumber;
    }


    /**
     * Sets the paymentDepositNumber value for this SavingDepositBean.
     * 
     * @param paymentDepositNumber
     */
    public void setPaymentDepositNumber(java.lang.String paymentDepositNumber) {
        this.paymentDepositNumber = paymentDepositNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SavingDepositBean)) return false;
        SavingDepositBean other = (SavingDepositBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.duration == other.getDuration() &&
            this.lifeCycleMonth == other.getLifeCycleMonth() &&
            ((this.paymentAmount==null && other.getPaymentAmount()==null) || 
             (this.paymentAmount!=null &&
              this.paymentAmount.equals(other.getPaymentAmount()))) &&
            ((this.paymentDepositNumber==null && other.getPaymentDepositNumber()==null) || 
             (this.paymentDepositNumber!=null &&
              this.paymentDepositNumber.equals(other.getPaymentDepositNumber())));
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
        _hashCode += new Long(getDuration()).hashCode();
        _hashCode += new Long(getLifeCycleMonth()).hashCode();
        if (getPaymentAmount() != null) {
            _hashCode += getPaymentAmount().hashCode();
        }
        if (getPaymentDepositNumber() != null) {
            _hashCode += getPaymentDepositNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SavingDepositBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "savingDepositBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeCycleMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifeCycleMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
