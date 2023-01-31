/**
 * AutoTransferDetailsResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AutoTransferDetailsResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferDetailBean[] autoTransferDetailDtos;

    private java.lang.Integer totalRecord;

    public AutoTransferDetailsResponseBean() {
    }

    public AutoTransferDetailsResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferDetailBean[] autoTransferDetailDtos,
           java.lang.Integer totalRecord) {
           this.autoTransferDetailDtos = autoTransferDetailDtos;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the autoTransferDetailDtos value for this AutoTransferDetailsResponseBean.
     * 
     * @return autoTransferDetailDtos
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferDetailBean[] getAutoTransferDetailDtos() {
        return autoTransferDetailDtos;
    }


    /**
     * Sets the autoTransferDetailDtos value for this AutoTransferDetailsResponseBean.
     * 
     * @param autoTransferDetailDtos
     */
    public void setAutoTransferDetailDtos(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferDetailBean[] autoTransferDetailDtos) {
        this.autoTransferDetailDtos = autoTransferDetailDtos;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferDetailBean getAutoTransferDetailDtos(int i) {
        return this.autoTransferDetailDtos[i];
    }

    public void setAutoTransferDetailDtos(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferDetailBean _value) {
        this.autoTransferDetailDtos[i] = _value;
    }


    /**
     * Gets the totalRecord value for this AutoTransferDetailsResponseBean.
     * 
     * @return totalRecord
     */
    public java.lang.Integer getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this AutoTransferDetailsResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTransferDetailsResponseBean)) return false;
        AutoTransferDetailsResponseBean other = (AutoTransferDetailsResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoTransferDetailDtos==null && other.getAutoTransferDetailDtos()==null) || 
             (this.autoTransferDetailDtos!=null &&
              java.util.Arrays.equals(this.autoTransferDetailDtos, other.getAutoTransferDetailDtos()))) &&
            ((this.totalRecord==null && other.getTotalRecord()==null) || 
             (this.totalRecord!=null &&
              this.totalRecord.equals(other.getTotalRecord())));
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
        if (getAutoTransferDetailDtos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoTransferDetailDtos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoTransferDetailDtos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalRecord() != null) {
            _hashCode += getTotalRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoTransferDetailsResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferDetailsResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTransferDetailDtos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTransferDetailDtos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
