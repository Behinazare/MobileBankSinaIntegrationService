/**
 * CardPinRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardPinRequestBean  implements java.io.Serializable {
    private java.lang.String pan;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType pinType;

    public CardPinRequestBean() {
    }

    public CardPinRequestBean(
           java.lang.String pan,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType pinType) {
           this.pan = pan;
           this.pinType = pinType;
    }


    /**
     * Gets the pan value for this CardPinRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardPinRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the pinType value for this CardPinRequestBean.
     * 
     * @return pinType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType getPinType() {
        return pinType;
    }


    /**
     * Sets the pinType value for this CardPinRequestBean.
     * 
     * @param pinType
     */
    public void setPinType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PinType pinType) {
        this.pinType = pinType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardPinRequestBean)) return false;
        CardPinRequestBean other = (CardPinRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.pinType==null && other.getPinType()==null) || 
             (this.pinType!=null &&
              this.pinType.equals(other.getPinType())));
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
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getPinType() != null) {
            _hashCode += getPinType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardPinRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardPinRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "pinType"));
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
