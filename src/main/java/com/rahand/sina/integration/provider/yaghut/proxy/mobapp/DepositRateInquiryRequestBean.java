/**
 * DepositRateInquiryRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositRateInquiryRequestBean  implements java.io.Serializable {
    private java.lang.Integer[] depositType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupType[] groups;

    private long length;

    private long offset;

    public DepositRateInquiryRequestBean() {
    }

    public DepositRateInquiryRequestBean(
           java.lang.Integer[] depositType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupType[] groups,
           long length,
           long offset) {
           this.depositType = depositType;
           this.groups = groups;
           this.length = length;
           this.offset = offset;
    }


    /**
     * Gets the depositType value for this DepositRateInquiryRequestBean.
     * 
     * @return depositType
     */
    public java.lang.Integer[] getDepositType() {
        return depositType;
    }


    /**
     * Sets the depositType value for this DepositRateInquiryRequestBean.
     * 
     * @param depositType
     */
    public void setDepositType(java.lang.Integer[] depositType) {
        this.depositType = depositType;
    }

    public java.lang.Integer getDepositType(int i) {
        return this.depositType[i];
    }

    public void setDepositType(int i, java.lang.Integer _value) {
        this.depositType[i] = _value;
    }


    /**
     * Gets the groups value for this DepositRateInquiryRequestBean.
     * 
     * @return groups
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupType[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this DepositRateInquiryRequestBean.
     * 
     * @param groups
     */
    public void setGroups(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupType[] groups) {
        this.groups = groups;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupType getGroups(int i) {
        return this.groups[i];
    }

    public void setGroups(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupType _value) {
        this.groups[i] = _value;
    }


    /**
     * Gets the length value for this DepositRateInquiryRequestBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this DepositRateInquiryRequestBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this DepositRateInquiryRequestBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DepositRateInquiryRequestBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositRateInquiryRequestBean)) return false;
        DepositRateInquiryRequestBean other = (DepositRateInquiryRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositType==null && other.getDepositType()==null) || 
             (this.depositType!=null &&
              java.util.Arrays.equals(this.depositType, other.getDepositType()))) &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              java.util.Arrays.equals(this.groups, other.getGroups()))) &&
            this.length == other.getLength() &&
            this.offset == other.getOffset();
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
        if (getDepositType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getLength()).hashCode();
        _hashCode += new Long(getOffset()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositRateInquiryRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositRateInquiryRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
