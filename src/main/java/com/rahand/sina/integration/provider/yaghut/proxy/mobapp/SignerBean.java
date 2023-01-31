/**
 * SignerBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SignerBean  implements java.io.Serializable {
    private java.lang.String foreignName;

    private java.lang.String name;

    private java.util.Calendar signDate;

    public SignerBean() {
    }

    public SignerBean(
           java.lang.String foreignName,
           java.lang.String name,
           java.util.Calendar signDate) {
           this.foreignName = foreignName;
           this.name = name;
           this.signDate = signDate;
    }


    /**
     * Gets the foreignName value for this SignerBean.
     * 
     * @return foreignName
     */
    public java.lang.String getForeignName() {
        return foreignName;
    }


    /**
     * Sets the foreignName value for this SignerBean.
     * 
     * @param foreignName
     */
    public void setForeignName(java.lang.String foreignName) {
        this.foreignName = foreignName;
    }


    /**
     * Gets the name value for this SignerBean.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SignerBean.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the signDate value for this SignerBean.
     * 
     * @return signDate
     */
    public java.util.Calendar getSignDate() {
        return signDate;
    }


    /**
     * Sets the signDate value for this SignerBean.
     * 
     * @param signDate
     */
    public void setSignDate(java.util.Calendar signDate) {
        this.signDate = signDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignerBean)) return false;
        SignerBean other = (SignerBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.foreignName==null && other.getForeignName()==null) || 
             (this.foreignName!=null &&
              this.foreignName.equals(other.getForeignName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.signDate==null && other.getSignDate()==null) || 
             (this.signDate!=null &&
              this.signDate.equals(other.getSignDate())));
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
        if (getForeignName() != null) {
            _hashCode += getForeignName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSignDate() != null) {
            _hashCode += getSignDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignerBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signerBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
