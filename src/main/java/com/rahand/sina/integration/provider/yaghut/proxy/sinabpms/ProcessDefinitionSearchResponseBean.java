/**
 * ProcessDefinitionSearchResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessDefinitionSearchResponseBean  implements java.io.Serializable {
    private ProcessDefinitionBean[] processDefinitions;

    private long totalRecords;

    public ProcessDefinitionSearchResponseBean() {
    }

    public ProcessDefinitionSearchResponseBean(
           ProcessDefinitionBean[] processDefinitions,
           long totalRecords) {
           this.processDefinitions = processDefinitions;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the processDefinitions value for this ProcessDefinitionSearchResponseBean.
     * 
     * @return processDefinitions
     */
    public ProcessDefinitionBean[] getProcessDefinitions() {
        return processDefinitions;
    }


    /**
     * Sets the processDefinitions value for this ProcessDefinitionSearchResponseBean.
     * 
     * @param processDefinitions
     */
    public void setProcessDefinitions(ProcessDefinitionBean[] processDefinitions) {
        this.processDefinitions = processDefinitions;
    }

    public ProcessDefinitionBean getProcessDefinitions(int i) {
        return this.processDefinitions[i];
    }

    public void setProcessDefinitions(int i, ProcessDefinitionBean _value) {
        this.processDefinitions[i] = _value;
    }


    /**
     * Gets the totalRecords value for this ProcessDefinitionSearchResponseBean.
     * 
     * @return totalRecords
     */
    public long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this ProcessDefinitionSearchResponseBean.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessDefinitionSearchResponseBean)) return false;
        ProcessDefinitionSearchResponseBean other = (ProcessDefinitionSearchResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processDefinitions==null && other.getProcessDefinitions()==null) || 
             (this.processDefinitions!=null &&
              java.util.Arrays.equals(this.processDefinitions, other.getProcessDefinitions()))) &&
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
        if (getProcessDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessDefinitions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProcessDefinitions(), i);
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
        new org.apache.axis.description.TypeDesc(ProcessDefinitionSearchResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionSearchResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionBean"));
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
