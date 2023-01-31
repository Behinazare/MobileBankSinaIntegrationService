/**
 * CardSummaryRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardSummaryRequestBean  implements java.io.Serializable {
    private java.lang.String cardPan;

    private boolean showIban;

    public CardSummaryRequestBean() {
    }

    public CardSummaryRequestBean(
           java.lang.String cardPan,
           boolean showIban) {
           this.cardPan = cardPan;
           this.showIban = showIban;
    }


    /**
     * Gets the cardPan value for this CardSummaryRequestBean.
     * 
     * @return cardPan
     */
    public java.lang.String getCardPan() {
        return cardPan;
    }


    /**
     * Sets the cardPan value for this CardSummaryRequestBean.
     * 
     * @param cardPan
     */
    public void setCardPan(java.lang.String cardPan) {
        this.cardPan = cardPan;
    }


    /**
     * Gets the showIban value for this CardSummaryRequestBean.
     * 
     * @return showIban
     */
    public boolean isShowIban() {
        return showIban;
    }


    /**
     * Sets the showIban value for this CardSummaryRequestBean.
     * 
     * @param showIban
     */
    public void setShowIban(boolean showIban) {
        this.showIban = showIban;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardSummaryRequestBean)) return false;
        CardSummaryRequestBean other = (CardSummaryRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardPan==null && other.getCardPan()==null) || 
             (this.cardPan!=null &&
              this.cardPan.equals(other.getCardPan()))) &&
            this.showIban == other.isShowIban();
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
        if (getCardPan() != null) {
            _hashCode += getCardPan().hashCode();
        }
        _hashCode += (isShowIban() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardSummaryRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardSummaryRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showIban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showIban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
