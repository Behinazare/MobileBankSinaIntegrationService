/**
 * AchTransactionKeysRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchTransactionKeysRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransactionKeyRequestBean[] keys;

    private java.lang.String referenceId;

    public AchTransactionKeysRequestBean() {
    }

    public AchTransactionKeysRequestBean(
           java.lang.String cif,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransactionKeyRequestBean[] keys,
           java.lang.String referenceId) {
           this.cif = cif;
           this.keys = keys;
           this.referenceId = referenceId;
    }


    /**
     * Gets the cif value for this AchTransactionKeysRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this AchTransactionKeysRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the keys value for this AchTransactionKeysRequestBean.
     * 
     * @return keys
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransactionKeyRequestBean[] getKeys() {
        return keys;
    }


    /**
     * Sets the keys value for this AchTransactionKeysRequestBean.
     * 
     * @param keys
     */
    public void setKeys(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransactionKeyRequestBean[] keys) {
        this.keys = keys;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransactionKeyRequestBean getKeys(int i) {
        return this.keys[i];
    }

    public void setKeys(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchTransactionKeyRequestBean _value) {
        this.keys[i] = _value;
    }


    /**
     * Gets the referenceId value for this AchTransactionKeysRequestBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this AchTransactionKeysRequestBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchTransactionKeysRequestBean)) return false;
        AchTransactionKeysRequestBean other = (AchTransactionKeysRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.keys==null && other.getKeys()==null) || 
             (this.keys!=null &&
              java.util.Arrays.equals(this.keys, other.getKeys()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AchTransactionKeysRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransactionKeysRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achTransactionKeyRequestBean"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceId"));
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
