/**
 * CustomerAddressResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CustomerAddressResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerAddressBean[] addressList;

    private long totalRecord;

    public CustomerAddressResponseBean() {
    }

    public CustomerAddressResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerAddressBean[] addressList,
           long totalRecord) {
           this.addressList = addressList;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the addressList value for this CustomerAddressResponseBean.
     * 
     * @return addressList
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerAddressBean[] getAddressList() {
        return addressList;
    }


    /**
     * Sets the addressList value for this CustomerAddressResponseBean.
     * 
     * @param addressList
     */
    public void setAddressList(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerAddressBean[] addressList) {
        this.addressList = addressList;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerAddressBean getAddressList(int i) {
        return this.addressList[i];
    }

    public void setAddressList(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerAddressBean _value) {
        this.addressList[i] = _value;
    }


    /**
     * Gets the totalRecord value for this CustomerAddressResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this CustomerAddressResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerAddressResponseBean)) return false;
        CustomerAddressResponseBean other = (CustomerAddressResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressList==null && other.getAddressList()==null) || 
             (this.addressList!=null &&
              java.util.Arrays.equals(this.addressList, other.getAddressList()))) &&
            this.totalRecord == other.getTotalRecord();
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
        if (getAddressList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecord()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerAddressResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerAddressResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerAddressBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
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
