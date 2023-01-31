/**
 * OtpChallengeCredentialResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class OtpChallengeCredentialResponseBean  implements java.io.Serializable {
    private java.lang.Long challengeV1;

    private java.lang.Long challengeV2;

    private java.lang.String identifier;

    public OtpChallengeCredentialResponseBean() {
    }

    public OtpChallengeCredentialResponseBean(
           java.lang.Long challengeV1,
           java.lang.Long challengeV2,
           java.lang.String identifier) {
           this.challengeV1 = challengeV1;
           this.challengeV2 = challengeV2;
           this.identifier = identifier;
    }


    /**
     * Gets the challengeV1 value for this OtpChallengeCredentialResponseBean.
     * 
     * @return challengeV1
     */
    public java.lang.Long getChallengeV1() {
        return challengeV1;
    }


    /**
     * Sets the challengeV1 value for this OtpChallengeCredentialResponseBean.
     * 
     * @param challengeV1
     */
    public void setChallengeV1(java.lang.Long challengeV1) {
        this.challengeV1 = challengeV1;
    }


    /**
     * Gets the challengeV2 value for this OtpChallengeCredentialResponseBean.
     * 
     * @return challengeV2
     */
    public java.lang.Long getChallengeV2() {
        return challengeV2;
    }


    /**
     * Sets the challengeV2 value for this OtpChallengeCredentialResponseBean.
     * 
     * @param challengeV2
     */
    public void setChallengeV2(java.lang.Long challengeV2) {
        this.challengeV2 = challengeV2;
    }


    /**
     * Gets the identifier value for this OtpChallengeCredentialResponseBean.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this OtpChallengeCredentialResponseBean.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OtpChallengeCredentialResponseBean)) return false;
        OtpChallengeCredentialResponseBean other = (OtpChallengeCredentialResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.challengeV1==null && other.getChallengeV1()==null) || 
             (this.challengeV1!=null &&
              this.challengeV1.equals(other.getChallengeV1()))) &&
            ((this.challengeV2==null && other.getChallengeV2()==null) || 
             (this.challengeV2!=null &&
              this.challengeV2.equals(other.getChallengeV2()))) &&
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier())));
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
        if (getChallengeV1() != null) {
            _hashCode += getChallengeV1().hashCode();
        }
        if (getChallengeV2() != null) {
            _hashCode += getChallengeV2().hashCode();
        }
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OtpChallengeCredentialResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "otpChallengeCredentialResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeV1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "challengeV1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeV2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "challengeV2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifier"));
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
