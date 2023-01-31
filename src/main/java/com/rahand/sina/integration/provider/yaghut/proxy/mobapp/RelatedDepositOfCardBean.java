/**
 * RelatedDepositOfCardBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class RelatedDepositOfCardBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositTypeWS cardDepositType;

    private java.lang.String depositNumber;

    public RelatedDepositOfCardBean() {
    }

    public RelatedDepositOfCardBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositTypeWS cardDepositType,
           java.lang.String depositNumber) {
           this.cardDepositType = cardDepositType;
           this.depositNumber = depositNumber;
    }


    /**
     * Gets the cardDepositType value for this RelatedDepositOfCardBean.
     * 
     * @return cardDepositType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositTypeWS getCardDepositType() {
        return cardDepositType;
    }


    /**
     * Sets the cardDepositType value for this RelatedDepositOfCardBean.
     * 
     * @param cardDepositType
     */
    public void setCardDepositType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositTypeWS cardDepositType) {
        this.cardDepositType = cardDepositType;
    }


    /**
     * Gets the depositNumber value for this RelatedDepositOfCardBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this RelatedDepositOfCardBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedDepositOfCardBean)) return false;
        RelatedDepositOfCardBean other = (RelatedDepositOfCardBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardDepositType==null && other.getCardDepositType()==null) || 
             (this.cardDepositType!=null &&
              this.cardDepositType.equals(other.getCardDepositType()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber())));
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
        if (getCardDepositType() != null) {
            _hashCode += getCardDepositType().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedDepositOfCardBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "relatedDepositOfCardBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardDepositType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardDepositType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardDepositTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
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
