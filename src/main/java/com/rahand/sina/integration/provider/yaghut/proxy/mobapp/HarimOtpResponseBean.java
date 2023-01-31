/**
 * HarimOtpResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class HarimOtpResponseBean  implements java.io.Serializable {
    private java.lang.String correlationId;

    private int referenceNumber;

    public HarimOtpResponseBean() {
    }

    public HarimOtpResponseBean(
           java.lang.String correlationId,
           int referenceNumber) {
           this.correlationId = correlationId;
           this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the correlationId value for this HarimOtpResponseBean.
     * 
     * @return correlationId
     */
    public java.lang.String getCorrelationId() {
        return correlationId;
    }


    /**
     * Sets the correlationId value for this HarimOtpResponseBean.
     * 
     * @param correlationId
     */
    public void setCorrelationId(java.lang.String correlationId) {
        this.correlationId = correlationId;
    }


    /**
     * Gets the referenceNumber value for this HarimOtpResponseBean.
     * 
     * @return referenceNumber
     */
    public int getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this HarimOtpResponseBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HarimOtpResponseBean)) return false;
        HarimOtpResponseBean other = (HarimOtpResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correlationId==null && other.getCorrelationId()==null) || 
             (this.correlationId!=null &&
              this.correlationId.equals(other.getCorrelationId()))) &&
            this.referenceNumber == other.getReferenceNumber();
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
        if (getCorrelationId() != null) {
            _hashCode += getCorrelationId().hashCode();
        }
        _hashCode += getReferenceNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HarimOtpResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "harimOtpResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correlationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
