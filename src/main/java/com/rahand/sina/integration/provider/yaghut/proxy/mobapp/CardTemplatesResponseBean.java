/**
 * CardTemplatesResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardTemplatesResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplate[] cardTemplates;

    private long totalRecord;

    public CardTemplatesResponseBean() {
    }

    public CardTemplatesResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplate[] cardTemplates,
           long totalRecord) {
           this.cardTemplates = cardTemplates;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the cardTemplates value for this CardTemplatesResponseBean.
     * 
     * @return cardTemplates
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplate[] getCardTemplates() {
        return cardTemplates;
    }


    /**
     * Sets the cardTemplates value for this CardTemplatesResponseBean.
     * 
     * @param cardTemplates
     */
    public void setCardTemplates(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplate[] cardTemplates) {
        this.cardTemplates = cardTemplates;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplate getCardTemplates(int i) {
        return this.cardTemplates[i];
    }

    public void setCardTemplates(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplate _value) {
        this.cardTemplates[i] = _value;
    }


    /**
     * Gets the totalRecord value for this CardTemplatesResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this CardTemplatesResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardTemplatesResponseBean)) return false;
        CardTemplatesResponseBean other = (CardTemplatesResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardTemplates==null && other.getCardTemplates()==null) || 
             (this.cardTemplates!=null &&
              java.util.Arrays.equals(this.cardTemplates, other.getCardTemplates()))) &&
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
        if (getCardTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardTemplates(), i);
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
        new org.apache.axis.description.TypeDesc(CardTemplatesResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTemplatesResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTemplate"));
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
