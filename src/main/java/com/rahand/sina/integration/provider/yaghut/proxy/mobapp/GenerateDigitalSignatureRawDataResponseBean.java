/**
 * GenerateDigitalSignatureRawDataResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class GenerateDigitalSignatureRawDataResponseBean  implements java.io.Serializable {
    private java.lang.String dataForSigning;

    public GenerateDigitalSignatureRawDataResponseBean() {
    }

    public GenerateDigitalSignatureRawDataResponseBean(
           java.lang.String dataForSigning) {
           this.dataForSigning = dataForSigning;
    }


    /**
     * Gets the dataForSigning value for this GenerateDigitalSignatureRawDataResponseBean.
     * 
     * @return dataForSigning
     */
    public java.lang.String getDataForSigning() {
        return dataForSigning;
    }


    /**
     * Sets the dataForSigning value for this GenerateDigitalSignatureRawDataResponseBean.
     * 
     * @param dataForSigning
     */
    public void setDataForSigning(java.lang.String dataForSigning) {
        this.dataForSigning = dataForSigning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateDigitalSignatureRawDataResponseBean)) return false;
        GenerateDigitalSignatureRawDataResponseBean other = (GenerateDigitalSignatureRawDataResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataForSigning==null && other.getDataForSigning()==null) || 
             (this.dataForSigning!=null &&
              this.dataForSigning.equals(other.getDataForSigning())));
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
        if (getDataForSigning() != null) {
            _hashCode += getDataForSigning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateDigitalSignatureRawDataResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "generateDigitalSignatureRawDataResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataForSigning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataForSigning"));
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
