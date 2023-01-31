/**
 * ReqStatusResponseBeans.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ReqStatusResponseBeans  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ReqStatusBean[] statuses;

    private long totalRecordCount;

    public ReqStatusResponseBeans() {
    }

    public ReqStatusResponseBeans(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ReqStatusBean[] statuses,
           long totalRecordCount) {
           this.statuses = statuses;
           this.totalRecordCount = totalRecordCount;
    }


    /**
     * Gets the statuses value for this ReqStatusResponseBeans.
     * 
     * @return statuses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ReqStatusBean[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this ReqStatusResponseBeans.
     * 
     * @param statuses
     */
    public void setStatuses(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ReqStatusBean[] statuses) {
        this.statuses = statuses;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ReqStatusBean getStatuses(int i) {
        return this.statuses[i];
    }

    public void setStatuses(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ReqStatusBean _value) {
        this.statuses[i] = _value;
    }


    /**
     * Gets the totalRecordCount value for this ReqStatusResponseBeans.
     * 
     * @return totalRecordCount
     */
    public long getTotalRecordCount() {
        return totalRecordCount;
    }


    /**
     * Sets the totalRecordCount value for this ReqStatusResponseBeans.
     * 
     * @param totalRecordCount
     */
    public void setTotalRecordCount(long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReqStatusResponseBeans)) return false;
        ReqStatusResponseBeans other = (ReqStatusResponseBeans) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses()))) &&
            this.totalRecordCount == other.getTotalRecordCount();
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
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecordCount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReqStatusResponseBeans.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "reqStatusResponseBeans"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "reqStatusBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecordCount"));
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
