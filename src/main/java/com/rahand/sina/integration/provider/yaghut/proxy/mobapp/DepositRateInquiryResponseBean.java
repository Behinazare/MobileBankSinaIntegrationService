/**
 * DepositRateInquiryResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositRateInquiryResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositRateInfoBean[] depositRates;

    private long totalRecord;

    public DepositRateInquiryResponseBean() {
    }

    public DepositRateInquiryResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositRateInfoBean[] depositRates,
           long totalRecord) {
           this.depositRates = depositRates;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the depositRates value for this DepositRateInquiryResponseBean.
     * 
     * @return depositRates
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositRateInfoBean[] getDepositRates() {
        return depositRates;
    }


    /**
     * Sets the depositRates value for this DepositRateInquiryResponseBean.
     * 
     * @param depositRates
     */
    public void setDepositRates(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositRateInfoBean[] depositRates) {
        this.depositRates = depositRates;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositRateInfoBean getDepositRates(int i) {
        return this.depositRates[i];
    }

    public void setDepositRates(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositRateInfoBean _value) {
        this.depositRates[i] = _value;
    }


    /**
     * Gets the totalRecord value for this DepositRateInquiryResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this DepositRateInquiryResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositRateInquiryResponseBean)) return false;
        DepositRateInquiryResponseBean other = (DepositRateInquiryResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositRates==null && other.getDepositRates()==null) || 
             (this.depositRates!=null &&
              java.util.Arrays.equals(this.depositRates, other.getDepositRates()))) &&
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
        if (getDepositRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositRates(), i);
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
        new org.apache.axis.description.TypeDesc(DepositRateInquiryResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositRateInquiryResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositRates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositRateInfoBean"));
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
