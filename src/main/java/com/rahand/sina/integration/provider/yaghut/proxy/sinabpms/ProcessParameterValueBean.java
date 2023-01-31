/**
 * ProcessParameterValueBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessParameterValueBean  implements java.io.Serializable {
    private String parameterId;

    private ProcessParameterInputValueBean parameterValue;

    public ProcessParameterValueBean() {
    }

    public ProcessParameterValueBean(
           String parameterId,
           ProcessParameterInputValueBean parameterValue) {
           this.parameterId = parameterId;
           this.parameterValue = parameterValue;
    }


    /**
     * Gets the parameterId value for this ProcessParameterValueBean.
     * 
     * @return parameterId
     */
    public String getParameterId() {
        return parameterId;
    }


    /**
     * Sets the parameterId value for this ProcessParameterValueBean.
     * 
     * @param parameterId
     */
    public void setParameterId(String parameterId) {
        this.parameterId = parameterId;
    }


    /**
     * Gets the parameterValue value for this ProcessParameterValueBean.
     * 
     * @return parameterValue
     */
    public ProcessParameterInputValueBean getParameterValue() {
        return parameterValue;
    }


    /**
     * Sets the parameterValue value for this ProcessParameterValueBean.
     * 
     * @param parameterValue
     */
    public void setParameterValue(ProcessParameterInputValueBean parameterValue) {
        this.parameterValue = parameterValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessParameterValueBean)) return false;
        ProcessParameterValueBean other = (ProcessParameterValueBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parameterId==null && other.getParameterId()==null) || 
             (this.parameterId!=null &&
              this.parameterId.equals(other.getParameterId()))) &&
            ((this.parameterValue==null && other.getParameterValue()==null) || 
             (this.parameterValue!=null &&
              this.parameterValue.equals(other.getParameterValue())));
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
        if (getParameterId() != null) {
            _hashCode += getParameterId().hashCode();
        }
        if (getParameterValue() != null) {
            _hashCode += getParameterValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessParameterValueBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterValueBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterInputValueBean"));
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
