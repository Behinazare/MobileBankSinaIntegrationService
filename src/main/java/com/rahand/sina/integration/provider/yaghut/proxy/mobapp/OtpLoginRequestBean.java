/**
 * OtpLoginRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class OtpLoginRequestBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.UserInfoRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AuthenticationTypeWS authenticationType;

    private java.lang.String challengeIdentifier;

    private java.lang.String otpSync;

    public OtpLoginRequestBean() {
    }

    public OtpLoginRequestBean(
           java.lang.Boolean includeSubscribers,
           java.lang.String password,
           java.lang.String username,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AuthenticationTypeWS authenticationType,
           java.lang.String challengeIdentifier,
           java.lang.String otpSync) {
        super(
            includeSubscribers,
            password,
            username);
        this.authenticationType = authenticationType;
        this.challengeIdentifier = challengeIdentifier;
        this.otpSync = otpSync;
    }


    /**
     * Gets the authenticationType value for this OtpLoginRequestBean.
     * 
     * @return authenticationType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AuthenticationTypeWS getAuthenticationType() {
        return authenticationType;
    }


    /**
     * Sets the authenticationType value for this OtpLoginRequestBean.
     * 
     * @param authenticationType
     */
    public void setAuthenticationType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AuthenticationTypeWS authenticationType) {
        this.authenticationType = authenticationType;
    }


    /**
     * Gets the challengeIdentifier value for this OtpLoginRequestBean.
     * 
     * @return challengeIdentifier
     */
    public java.lang.String getChallengeIdentifier() {
        return challengeIdentifier;
    }


    /**
     * Sets the challengeIdentifier value for this OtpLoginRequestBean.
     * 
     * @param challengeIdentifier
     */
    public void setChallengeIdentifier(java.lang.String challengeIdentifier) {
        this.challengeIdentifier = challengeIdentifier;
    }


    /**
     * Gets the otpSync value for this OtpLoginRequestBean.
     * 
     * @return otpSync
     */
    public java.lang.String getOtpSync() {
        return otpSync;
    }


    /**
     * Sets the otpSync value for this OtpLoginRequestBean.
     * 
     * @param otpSync
     */
    public void setOtpSync(java.lang.String otpSync) {
        this.otpSync = otpSync;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtpLoginRequestBean)) return false;
        OtpLoginRequestBean other = (OtpLoginRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authenticationType==null && other.getAuthenticationType()==null) || 
             (this.authenticationType!=null &&
              this.authenticationType.equals(other.getAuthenticationType()))) &&
            ((this.challengeIdentifier==null && other.getChallengeIdentifier()==null) || 
             (this.challengeIdentifier!=null &&
              this.challengeIdentifier.equals(other.getChallengeIdentifier()))) &&
            ((this.otpSync==null && other.getOtpSync()==null) || 
             (this.otpSync!=null &&
              this.otpSync.equals(other.getOtpSync())));
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
        if (getAuthenticationType() != null) {
            _hashCode += getAuthenticationType().hashCode();
        }
        if (getChallengeIdentifier() != null) {
            _hashCode += getChallengeIdentifier().hashCode();
        }
        if (getOtpSync() != null) {
            _hashCode += getOtpSync().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtpLoginRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "otpLoginRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "authenticationTypeWS"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "challengeIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpSync");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otpSync"));
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
