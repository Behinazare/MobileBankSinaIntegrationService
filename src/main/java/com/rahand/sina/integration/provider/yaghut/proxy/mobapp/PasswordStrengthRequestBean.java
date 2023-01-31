/**
 * PasswordStrengthRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PasswordStrengthRequestBean  implements java.io.Serializable {
    private java.lang.String password;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PasswordType passwordType;

    public PasswordStrengthRequestBean() {
    }

    public PasswordStrengthRequestBean(
           java.lang.String password,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PasswordType passwordType) {
           this.password = password;
           this.passwordType = passwordType;
    }


    /**
     * Gets the password value for this PasswordStrengthRequestBean.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PasswordStrengthRequestBean.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the passwordType value for this PasswordStrengthRequestBean.
     * 
     * @return passwordType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PasswordType getPasswordType() {
        return passwordType;
    }


    /**
     * Sets the passwordType value for this PasswordStrengthRequestBean.
     * 
     * @param passwordType
     */
    public void setPasswordType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PasswordType passwordType) {
        this.passwordType = passwordType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PasswordStrengthRequestBean)) return false;
        PasswordStrengthRequestBean other = (PasswordStrengthRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.passwordType==null && other.getPasswordType()==null) || 
             (this.passwordType!=null &&
              this.passwordType.equals(other.getPasswordType())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPasswordType() != null) {
            _hashCode += getPasswordType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PasswordStrengthRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "passwordStrengthRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "passwordType"));
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
