/**
 * GuarantiesResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class GuarantiesResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyBean[] guaranties;

    private java.lang.Integer totalRecord;

    public GuarantiesResponseBean() {
    }

    public GuarantiesResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyBean[] guaranties,
           java.lang.Integer totalRecord) {
           this.guaranties = guaranties;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the guaranties value for this GuarantiesResponseBean.
     * 
     * @return guaranties
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyBean[] getGuaranties() {
        return guaranties;
    }


    /**
     * Sets the guaranties value for this GuarantiesResponseBean.
     * 
     * @param guaranties
     */
    public void setGuaranties(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyBean[] guaranties) {
        this.guaranties = guaranties;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyBean getGuaranties(int i) {
        return this.guaranties[i];
    }

    public void setGuaranties(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GuarantyBean _value) {
        this.guaranties[i] = _value;
    }


    /**
     * Gets the totalRecord value for this GuarantiesResponseBean.
     * 
     * @return totalRecord
     */
    public java.lang.Integer getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this GuarantiesResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuarantiesResponseBean)) return false;
        GuarantiesResponseBean other = (GuarantiesResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.guaranties==null && other.getGuaranties()==null) || 
             (this.guaranties!=null &&
              java.util.Arrays.equals(this.guaranties, other.getGuaranties()))) &&
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
        if (getGuaranties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuaranties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuaranties(), i);
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
        new org.apache.axis.description.TypeDesc(GuarantiesResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "guarantiesResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guaranties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "guarantyBean"));
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
