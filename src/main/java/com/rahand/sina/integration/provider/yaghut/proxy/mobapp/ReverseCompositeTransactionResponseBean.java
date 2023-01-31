/**
 * ReverseCompositeTransactionResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ReverseCompositeTransactionResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal reverseAmount;

    private java.lang.String trackingNumber;

    public ReverseCompositeTransactionResponseBean() {
    }

    public ReverseCompositeTransactionResponseBean(
           java.math.BigDecimal reverseAmount,
           java.lang.String trackingNumber) {
           this.reverseAmount = reverseAmount;
           this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the reverseAmount value for this ReverseCompositeTransactionResponseBean.
     * 
     * @return reverseAmount
     */
    public java.math.BigDecimal getReverseAmount() {
        return reverseAmount;
    }


    /**
     * Sets the reverseAmount value for this ReverseCompositeTransactionResponseBean.
     * 
     * @param reverseAmount
     */
    public void setReverseAmount(java.math.BigDecimal reverseAmount) {
        this.reverseAmount = reverseAmount;
    }


    /**
     * Gets the trackingNumber value for this ReverseCompositeTransactionResponseBean.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this ReverseCompositeTransactionResponseBean.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReverseCompositeTransactionResponseBean)) return false;
        ReverseCompositeTransactionResponseBean other = (ReverseCompositeTransactionResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reverseAmount==null && other.getReverseAmount()==null) || 
             (this.reverseAmount!=null &&
              this.reverseAmount.equals(other.getReverseAmount()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber())));
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
        if (getReverseAmount() != null) {
            _hashCode += getReverseAmount().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseCompositeTransactionResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "reverseCompositeTransactionResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverseAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingNumber"));
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
