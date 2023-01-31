/**
 * ChangeUsernameRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChangeUsernameRequestBean  implements java.io.Serializable {
    private java.lang.String currentUsername;

    private java.lang.String newUsername;

    public ChangeUsernameRequestBean() {
    }

    public ChangeUsernameRequestBean(
           java.lang.String currentUsername,
           java.lang.String newUsername) {
           this.currentUsername = currentUsername;
           this.newUsername = newUsername;
    }


    /**
     * Gets the currentUsername value for this ChangeUsernameRequestBean.
     * 
     * @return currentUsername
     */
    public java.lang.String getCurrentUsername() {
        return currentUsername;
    }


    /**
     * Sets the currentUsername value for this ChangeUsernameRequestBean.
     * 
     * @param currentUsername
     */
    public void setCurrentUsername(java.lang.String currentUsername) {
        this.currentUsername = currentUsername;
    }


    /**
     * Gets the newUsername value for this ChangeUsernameRequestBean.
     * 
     * @return newUsername
     */
    public java.lang.String getNewUsername() {
        return newUsername;
    }


    /**
     * Sets the newUsername value for this ChangeUsernameRequestBean.
     * 
     * @param newUsername
     */
    public void setNewUsername(java.lang.String newUsername) {
        this.newUsername = newUsername;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeUsernameRequestBean)) return false;
        ChangeUsernameRequestBean other = (ChangeUsernameRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentUsername==null && other.getCurrentUsername()==null) || 
             (this.currentUsername!=null &&
              this.currentUsername.equals(other.getCurrentUsername()))) &&
            ((this.newUsername==null && other.getNewUsername()==null) || 
             (this.newUsername!=null &&
              this.newUsername.equals(other.getNewUsername())));
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
        if (getCurrentUsername() != null) {
            _hashCode += getCurrentUsername().hashCode();
        }
        if (getNewUsername() != null) {
            _hashCode += getNewUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeUsernameRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "changeUsernameRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newUsername"));
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
