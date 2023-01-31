/**
 * ProcessStartTaskParametersRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessStartTaskParametersRequestBean  implements java.io.Serializable {
    private String processDefinitionId;

    public ProcessStartTaskParametersRequestBean() {
    }

    public ProcessStartTaskParametersRequestBean(
           String processDefinitionId) {
           this.processDefinitionId = processDefinitionId;
    }


    /**
     * Gets the processDefinitionId value for this ProcessStartTaskParametersRequestBean.
     * 
     * @return processDefinitionId
     */
    public String getProcessDefinitionId() {
        return processDefinitionId;
    }


    /**
     * Sets the processDefinitionId value for this ProcessStartTaskParametersRequestBean.
     * 
     * @param processDefinitionId
     */
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessStartTaskParametersRequestBean)) return false;
        ProcessStartTaskParametersRequestBean other = (ProcessStartTaskParametersRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processDefinitionId==null && other.getProcessDefinitionId()==null) || 
             (this.processDefinitionId!=null &&
              this.processDefinitionId.equals(other.getProcessDefinitionId())));
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
        if (getProcessDefinitionId() != null) {
            _hashCode += getProcessDefinitionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessStartTaskParametersRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processStartTaskParametersRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
