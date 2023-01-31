/**
 * InvestmentDepositBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InvestmentDepositBean  implements java.io.Serializable {
    private java.lang.Short interestSettlementDay;

    private java.lang.String interestToDepositNumber;

    public InvestmentDepositBean() {
    }

    public InvestmentDepositBean(
           java.lang.Short interestSettlementDay,
           java.lang.String interestToDepositNumber) {
           this.interestSettlementDay = interestSettlementDay;
           this.interestToDepositNumber = interestToDepositNumber;
    }


    /**
     * Gets the interestSettlementDay value for this InvestmentDepositBean.
     * 
     * @return interestSettlementDay
     */
    public java.lang.Short getInterestSettlementDay() {
        return interestSettlementDay;
    }


    /**
     * Sets the interestSettlementDay value for this InvestmentDepositBean.
     * 
     * @param interestSettlementDay
     */
    public void setInterestSettlementDay(java.lang.Short interestSettlementDay) {
        this.interestSettlementDay = interestSettlementDay;
    }


    /**
     * Gets the interestToDepositNumber value for this InvestmentDepositBean.
     * 
     * @return interestToDepositNumber
     */
    public java.lang.String getInterestToDepositNumber() {
        return interestToDepositNumber;
    }


    /**
     * Sets the interestToDepositNumber value for this InvestmentDepositBean.
     * 
     * @param interestToDepositNumber
     */
    public void setInterestToDepositNumber(java.lang.String interestToDepositNumber) {
        this.interestToDepositNumber = interestToDepositNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvestmentDepositBean)) return false;
        InvestmentDepositBean other = (InvestmentDepositBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interestSettlementDay==null && other.getInterestSettlementDay()==null) || 
             (this.interestSettlementDay!=null &&
              this.interestSettlementDay.equals(other.getInterestSettlementDay()))) &&
            ((this.interestToDepositNumber==null && other.getInterestToDepositNumber()==null) || 
             (this.interestToDepositNumber!=null &&
              this.interestToDepositNumber.equals(other.getInterestToDepositNumber())));
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
        if (getInterestSettlementDay() != null) {
            _hashCode += getInterestSettlementDay().hashCode();
        }
        if (getInterestToDepositNumber() != null) {
            _hashCode += getInterestToDepositNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvestmentDepositBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "investmentDepositBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestSettlementDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interestSettlementDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestToDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interestToDepositNumber"));
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
