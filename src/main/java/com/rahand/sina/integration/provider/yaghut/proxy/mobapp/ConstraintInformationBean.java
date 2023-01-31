/**
 * ConstraintInformationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ConstraintInformationBean  implements java.io.Serializable {
    private java.lang.Long constraintId;

    private java.lang.String constraintName;

    private java.lang.Boolean userIsOwner;

    public ConstraintInformationBean() {
    }

    public ConstraintInformationBean(
           java.lang.Long constraintId,
           java.lang.String constraintName,
           java.lang.Boolean userIsOwner) {
           this.constraintId = constraintId;
           this.constraintName = constraintName;
           this.userIsOwner = userIsOwner;
    }


    /**
     * Gets the constraintId value for this ConstraintInformationBean.
     * 
     * @return constraintId
     */
    public java.lang.Long getConstraintId() {
        return constraintId;
    }


    /**
     * Sets the constraintId value for this ConstraintInformationBean.
     * 
     * @param constraintId
     */
    public void setConstraintId(java.lang.Long constraintId) {
        this.constraintId = constraintId;
    }


    /**
     * Gets the constraintName value for this ConstraintInformationBean.
     * 
     * @return constraintName
     */
    public java.lang.String getConstraintName() {
        return constraintName;
    }


    /**
     * Sets the constraintName value for this ConstraintInformationBean.
     * 
     * @param constraintName
     */
    public void setConstraintName(java.lang.String constraintName) {
        this.constraintName = constraintName;
    }


    /**
     * Gets the userIsOwner value for this ConstraintInformationBean.
     * 
     * @return userIsOwner
     */
    public java.lang.Boolean getUserIsOwner() {
        return userIsOwner;
    }


    /**
     * Sets the userIsOwner value for this ConstraintInformationBean.
     * 
     * @param userIsOwner
     */
    public void setUserIsOwner(java.lang.Boolean userIsOwner) {
        this.userIsOwner = userIsOwner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConstraintInformationBean)) return false;
        ConstraintInformationBean other = (ConstraintInformationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.constraintId==null && other.getConstraintId()==null) || 
             (this.constraintId!=null &&
              this.constraintId.equals(other.getConstraintId()))) &&
            ((this.constraintName==null && other.getConstraintName()==null) || 
             (this.constraintName!=null &&
              this.constraintName.equals(other.getConstraintName()))) &&
            ((this.userIsOwner==null && other.getUserIsOwner()==null) || 
             (this.userIsOwner!=null &&
              this.userIsOwner.equals(other.getUserIsOwner())));
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
        if (getConstraintId() != null) {
            _hashCode += getConstraintId().hashCode();
        }
        if (getConstraintName() != null) {
            _hashCode += getConstraintName().hashCode();
        }
        if (getUserIsOwner() != null) {
            _hashCode += getUserIsOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConstraintInformationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "constraintInformationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraintId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "constraintId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraintName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "constraintName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIsOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIsOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
