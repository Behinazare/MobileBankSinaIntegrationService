/**
 * ServiceResourceDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ServiceResourceDetailBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ModernServcieParameterResourceType modernServcieParameterResourceType;

    private java.lang.String value;

    public ServiceResourceDetailBean() {
    }

    public ServiceResourceDetailBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ModernServcieParameterResourceType modernServcieParameterResourceType,
           java.lang.String value) {
           this.modernServcieParameterResourceType = modernServcieParameterResourceType;
           this.value = value;
    }


    /**
     * Gets the modernServcieParameterResourceType value for this ServiceResourceDetailBean.
     * 
     * @return modernServcieParameterResourceType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ModernServcieParameterResourceType getModernServcieParameterResourceType() {
        return modernServcieParameterResourceType;
    }


    /**
     * Sets the modernServcieParameterResourceType value for this ServiceResourceDetailBean.
     * 
     * @param modernServcieParameterResourceType
     */
    public void setModernServcieParameterResourceType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ModernServcieParameterResourceType modernServcieParameterResourceType) {
        this.modernServcieParameterResourceType = modernServcieParameterResourceType;
    }


    /**
     * Gets the value value for this ServiceResourceDetailBean.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ServiceResourceDetailBean.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceResourceDetailBean)) return false;
        ServiceResourceDetailBean other = (ServiceResourceDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modernServcieParameterResourceType==null && other.getModernServcieParameterResourceType()==null) || 
             (this.modernServcieParameterResourceType!=null &&
              this.modernServcieParameterResourceType.equals(other.getModernServcieParameterResourceType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getModernServcieParameterResourceType() != null) {
            _hashCode += getModernServcieParameterResourceType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceResourceDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "serviceResourceDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modernServcieParameterResourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modernServcieParameterResourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "modernServcieParameterResourceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
