/**
 * SignUpResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SignUpResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Channel[] affectedChannels;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo;

    private java.lang.String username;

    public SignUpResponseBean() {
    }

    public SignUpResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Channel[] affectedChannels,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo,
           java.lang.String username) {
           this.affectedChannels = affectedChannels;
           this.commissionResultInfo = commissionResultInfo;
           this.username = username;
    }


    /**
     * Gets the affectedChannels value for this SignUpResponseBean.
     * 
     * @return affectedChannels
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Channel[] getAffectedChannels() {
        return affectedChannels;
    }


    /**
     * Sets the affectedChannels value for this SignUpResponseBean.
     * 
     * @param affectedChannels
     */
    public void setAffectedChannels(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Channel[] affectedChannels) {
        this.affectedChannels = affectedChannels;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Channel getAffectedChannels(int i) {
        return this.affectedChannels[i];
    }

    public void setAffectedChannels(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Channel _value) {
        this.affectedChannels[i] = _value;
    }


    /**
     * Gets the commissionResultInfo value for this SignUpResponseBean.
     * 
     * @return commissionResultInfo
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean getCommissionResultInfo() {
        return commissionResultInfo;
    }


    /**
     * Sets the commissionResultInfo value for this SignUpResponseBean.
     * 
     * @param commissionResultInfo
     */
    public void setCommissionResultInfo(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo) {
        this.commissionResultInfo = commissionResultInfo;
    }


    /**
     * Gets the username value for this SignUpResponseBean.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this SignUpResponseBean.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignUpResponseBean)) return false;
        SignUpResponseBean other = (SignUpResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.affectedChannels==null && other.getAffectedChannels()==null) || 
             (this.affectedChannels!=null &&
              java.util.Arrays.equals(this.affectedChannels, other.getAffectedChannels()))) &&
            ((this.commissionResultInfo==null && other.getCommissionResultInfo()==null) || 
             (this.commissionResultInfo!=null &&
              this.commissionResultInfo.equals(other.getCommissionResultInfo()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getAffectedChannels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAffectedChannels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAffectedChannels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommissionResultInfo() != null) {
            _hashCode += getCommissionResultInfo().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignUpResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signUpResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedChannels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affectedChannels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "channel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionResultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionResultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "commissionResultInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
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
