/**
 * CurrencyRateResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CurrencyRateResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CurrencyDetailBean[] currencyDetails;

    private long totalRecord;

    public CurrencyRateResponseBean() {
    }

    public CurrencyRateResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CurrencyDetailBean[] currencyDetails,
           long totalRecord) {
           this.currencyDetails = currencyDetails;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the currencyDetails value for this CurrencyRateResponseBean.
     * 
     * @return currencyDetails
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CurrencyDetailBean[] getCurrencyDetails() {
        return currencyDetails;
    }


    /**
     * Sets the currencyDetails value for this CurrencyRateResponseBean.
     * 
     * @param currencyDetails
     */
    public void setCurrencyDetails(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CurrencyDetailBean[] currencyDetails) {
        this.currencyDetails = currencyDetails;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CurrencyDetailBean getCurrencyDetails(int i) {
        return this.currencyDetails[i];
    }

    public void setCurrencyDetails(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CurrencyDetailBean _value) {
        this.currencyDetails[i] = _value;
    }


    /**
     * Gets the totalRecord value for this CurrencyRateResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this CurrencyRateResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyRateResponseBean)) return false;
        CurrencyRateResponseBean other = (CurrencyRateResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyDetails==null && other.getCurrencyDetails()==null) || 
             (this.currencyDetails!=null &&
              java.util.Arrays.equals(this.currencyDetails, other.getCurrencyDetails()))) &&
            this.totalRecord == other.getTotalRecord();
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
        if (getCurrencyDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecord()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyRateResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "currencyRateResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "currencyDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
