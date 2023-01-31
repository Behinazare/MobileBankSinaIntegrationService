/**
 * ProcessDetailsByInstanceIdResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessDetailsByInstanceIdResponseBean  implements java.io.Serializable {
    private ProcessDetailsBean[] processDetails;

    private long totalRecords;

    public ProcessDetailsByInstanceIdResponseBean() {
    }

    public ProcessDetailsByInstanceIdResponseBean(
           ProcessDetailsBean[] processDetails,
           long totalRecords) {
           this.processDetails = processDetails;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the processDetails value for this ProcessDetailsByInstanceIdResponseBean.
     * 
     * @return processDetails
     */
    public ProcessDetailsBean[] getProcessDetails() {
        return processDetails;
    }


    /**
     * Sets the processDetails value for this ProcessDetailsByInstanceIdResponseBean.
     * 
     * @param processDetails
     */
    public void setProcessDetails(ProcessDetailsBean[] processDetails) {
        this.processDetails = processDetails;
    }

    public ProcessDetailsBean getProcessDetails(int i) {
        return this.processDetails[i];
    }

    public void setProcessDetails(int i, ProcessDetailsBean _value) {
        this.processDetails[i] = _value;
    }


    /**
     * Gets the totalRecords value for this ProcessDetailsByInstanceIdResponseBean.
     * 
     * @return totalRecords
     */
    public long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this ProcessDetailsByInstanceIdResponseBean.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessDetailsByInstanceIdResponseBean)) return false;
        ProcessDetailsByInstanceIdResponseBean other = (ProcessDetailsByInstanceIdResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processDetails==null && other.getProcessDetails()==null) || 
             (this.processDetails!=null &&
              java.util.Arrays.equals(this.processDetails, other.getProcessDetails()))) &&
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
        if (getProcessDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProcessDetails(), i);
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
        new org.apache.axis.description.TypeDesc(ProcessDetailsByInstanceIdResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsByInstanceIdResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsBean"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
