/**
 * BoltonV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class BoltonV7  extends com.rahand.sina.integration.provider.rayanmehr.proxy.BaseProductV7  implements java.io.Serializable {
    private java.lang.Integer operatorId;

    private java.lang.Integer symTypeId;

    public BoltonV7() {
    }

    public BoltonV7(
           java.lang.Integer durationInHours,
           java.lang.Integer id,
           java.lang.Boolean isActive,
           java.lang.Boolean isObsolete,
           java.lang.String name,
           java.lang.Integer price,
           java.lang.Integer operatorId,
           java.lang.Integer symTypeId) {
        super(
            durationInHours,
            id,
            isActive,
            isObsolete,
            name,
            price);
        this.operatorId = operatorId;
        this.symTypeId = symTypeId;
    }


    /**
     * Gets the operatorId value for this BoltonV7.
     * 
     * @return operatorId
     */
    public java.lang.Integer getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this BoltonV7.
     * 
     * @param operatorId
     */
    public void setOperatorId(java.lang.Integer operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the symTypeId value for this BoltonV7.
     * 
     * @return symTypeId
     */
    public java.lang.Integer getSymTypeId() {
        return symTypeId;
    }


    /**
     * Sets the symTypeId value for this BoltonV7.
     * 
     * @param symTypeId
     */
    public void setSymTypeId(java.lang.Integer symTypeId) {
        this.symTypeId = symTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BoltonV7)) return false;
        BoltonV7 other = (BoltonV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.symTypeId==null && other.getSymTypeId()==null) || 
             (this.symTypeId!=null &&
              this.symTypeId.equals(other.getSymTypeId())));
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
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getSymTypeId() != null) {
            _hashCode += getSymTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BoltonV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BoltonV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "OperatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "SymTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
