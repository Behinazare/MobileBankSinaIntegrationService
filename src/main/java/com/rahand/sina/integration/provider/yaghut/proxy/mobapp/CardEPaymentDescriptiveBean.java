/**
 * CardEPaymentDescriptiveBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardEPaymentDescriptiveBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS EPaymentDescriptiveStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean secondPinType;

    public CardEPaymentDescriptiveBean() {
    }

    public CardEPaymentDescriptiveBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS EPaymentDescriptiveStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean secondPinType) {
           this.EPaymentDescriptiveStatus = EPaymentDescriptiveStatus;
           this.secondPinType = secondPinType;
    }


    /**
     * Gets the EPaymentDescriptiveStatus value for this CardEPaymentDescriptiveBean.
     * 
     * @return EPaymentDescriptiveStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS getEPaymentDescriptiveStatus() {
        return EPaymentDescriptiveStatus;
    }


    /**
     * Sets the EPaymentDescriptiveStatus value for this CardEPaymentDescriptiveBean.
     * 
     * @param EPaymentDescriptiveStatus
     */
    public void setEPaymentDescriptiveStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS EPaymentDescriptiveStatus) {
        this.EPaymentDescriptiveStatus = EPaymentDescriptiveStatus;
    }


    /**
     * Gets the secondPinType value for this CardEPaymentDescriptiveBean.
     * 
     * @return secondPinType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean getSecondPinType() {
        return secondPinType;
    }


    /**
     * Sets the secondPinType value for this CardEPaymentDescriptiveBean.
     * 
     * @param secondPinType
     */
    public void setSecondPinType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean secondPinType) {
        this.secondPinType = secondPinType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardEPaymentDescriptiveBean)) return false;
        CardEPaymentDescriptiveBean other = (CardEPaymentDescriptiveBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EPaymentDescriptiveStatus==null && other.getEPaymentDescriptiveStatus()==null) || 
             (this.EPaymentDescriptiveStatus!=null &&
              this.EPaymentDescriptiveStatus.equals(other.getEPaymentDescriptiveStatus()))) &&
            ((this.secondPinType==null && other.getSecondPinType()==null) || 
             (this.secondPinType!=null &&
              this.secondPinType.equals(other.getSecondPinType())));
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
        if (getEPaymentDescriptiveStatus() != null) {
            _hashCode += getEPaymentDescriptiveStatus().hashCode();
        }
        if (getSecondPinType() != null) {
            _hashCode += getSecondPinType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardEPaymentDescriptiveBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardEPaymentDescriptiveBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EPaymentDescriptiveStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EPaymentDescriptiveStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardEPaymentDescriptiveStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondPinType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondPinType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardSecondPinTypeBean"));
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
