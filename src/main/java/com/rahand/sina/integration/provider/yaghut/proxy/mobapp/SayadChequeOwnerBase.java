/**
 * SayadChequeOwnerBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeOwnerBase  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String nationalId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personalityType;

    private java.lang.String pervasiveId;

    public SayadChequeOwnerBase() {
    }

    public SayadChequeOwnerBase(
           java.lang.String name,
           java.lang.String nationalId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personalityType,
           java.lang.String pervasiveId) {
           this.name = name;
           this.nationalId = nationalId;
           this.personalityType = personalityType;
           this.pervasiveId = pervasiveId;
    }


    /**
     * Gets the name value for this SayadChequeOwnerBase.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SayadChequeOwnerBase.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nationalId value for this SayadChequeOwnerBase.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this SayadChequeOwnerBase.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the personalityType value for this SayadChequeOwnerBase.
     * 
     * @return personalityType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType getPersonalityType() {
        return personalityType;
    }


    /**
     * Sets the personalityType value for this SayadChequeOwnerBase.
     * 
     * @param personalityType
     */
    public void setPersonalityType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personalityType) {
        this.personalityType = personalityType;
    }


    /**
     * Gets the pervasiveId value for this SayadChequeOwnerBase.
     * 
     * @return pervasiveId
     */
    public java.lang.String getPervasiveId() {
        return pervasiveId;
    }


    /**
     * Sets the pervasiveId value for this SayadChequeOwnerBase.
     * 
     * @param pervasiveId
     */
    public void setPervasiveId(java.lang.String pervasiveId) {
        this.pervasiveId = pervasiveId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SayadChequeOwnerBase)) return false;
        SayadChequeOwnerBase other = (SayadChequeOwnerBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.personalityType==null && other.getPersonalityType()==null) || 
             (this.personalityType!=null &&
              this.personalityType.equals(other.getPersonalityType()))) &&
            ((this.pervasiveId==null && other.getPervasiveId()==null) || 
             (this.pervasiveId!=null &&
              this.pervasiveId.equals(other.getPervasiveId())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getPersonalityType() != null) {
            _hashCode += getPersonalityType().hashCode();
        }
        if (getPervasiveId() != null) {
            _hashCode += getPervasiveId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SayadChequeOwnerBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeOwnerBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "personalityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pervasiveId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pervasiveId"));
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
