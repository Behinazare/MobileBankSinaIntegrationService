/**
 * SignUpWithDigitalSignatureRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SignUpWithDigitalSignatureRequestBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DigitalSignableBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChannelBean channel;

    private java.lang.String cif;

    private java.lang.String digitalSignature;

    private java.lang.String password;

    private java.lang.String username;

    public SignUpWithDigitalSignatureRequestBean() {
    }

    public SignUpWithDigitalSignatureRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChannelBean channel,
           java.lang.String cif,
           java.lang.String digitalSignature,
           java.lang.String password,
           java.lang.String username) {
        this.channel = channel;
        this.cif = cif;
        this.digitalSignature = digitalSignature;
        this.password = password;
        this.username = username;
    }


    /**
     * Gets the channel value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @return channel
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChannelBean getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @param channel
     */
    public void setChannel(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChannelBean channel) {
        this.channel = channel;
    }


    /**
     * Gets the cif value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the digitalSignature value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @return digitalSignature
     */
    public java.lang.String getDigitalSignature() {
        return digitalSignature;
    }


    /**
     * Sets the digitalSignature value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @param digitalSignature
     */
    public void setDigitalSignature(java.lang.String digitalSignature) {
        this.digitalSignature = digitalSignature;
    }


    /**
     * Gets the password value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the username value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this SignUpWithDigitalSignatureRequestBean.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignUpWithDigitalSignatureRequestBean)) return false;
        SignUpWithDigitalSignatureRequestBean other = (SignUpWithDigitalSignatureRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.digitalSignature==null && other.getDigitalSignature()==null) || 
             (this.digitalSignature!=null &&
              this.digitalSignature.equals(other.getDigitalSignature()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
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
        int _hashCode = super.hashCode();
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDigitalSignature() != null) {
            _hashCode += getDigitalSignature().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignUpWithDigitalSignatureRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signUpWithDigitalSignatureRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "channelBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitalSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "digitalSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
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
