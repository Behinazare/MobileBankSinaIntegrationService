/**
 * ERequestResultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ERequestResultBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestInfoBean[] ERequests;

    private long totalRecords;

    public ERequestResultBean() {
    }

    public ERequestResultBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestInfoBean[] ERequests,
           long totalRecords) {
           this.ERequests = ERequests;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the ERequests value for this ERequestResultBean.
     * 
     * @return ERequests
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestInfoBean[] getERequests() {
        return ERequests;
    }


    /**
     * Sets the ERequests value for this ERequestResultBean.
     * 
     * @param ERequests
     */
    public void setERequests(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestInfoBean[] ERequests) {
        this.ERequests = ERequests;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestInfoBean getERequests(int i) {
        return this.ERequests[i];
    }

    public void setERequests(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ERequestInfoBean _value) {
        this.ERequests[i] = _value;
    }


    /**
     * Gets the totalRecords value for this ERequestResultBean.
     * 
     * @return totalRecords
     */
    public long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this ERequestResultBean.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ERequestResultBean)) return false;
        ERequestResultBean other = (ERequestResultBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERequests==null && other.getERequests()==null) || 
             (this.ERequests!=null &&
              java.util.Arrays.equals(this.ERequests, other.getERequests()))) &&
            this.totalRecords == other.getTotalRecords();
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
        if (getERequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getERequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getERequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecords()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ERequestResultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestResultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERequests");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "eRequestInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecords"));
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
