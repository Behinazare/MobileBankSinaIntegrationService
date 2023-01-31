/**
 * ProcessTaskGroupParameterBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessTaskGroupParameterBean  implements java.io.Serializable {
    private ParameterGroupType groupType;

    private String name;

    private ProcessTaskParameterBean[] parameters;

    public ProcessTaskGroupParameterBean() {
    }

    public ProcessTaskGroupParameterBean(
           ParameterGroupType groupType,
           String name,
           ProcessTaskParameterBean[] parameters) {
           this.groupType = groupType;
           this.name = name;
           this.parameters = parameters;
    }


    /**
     * Gets the groupType value for this ProcessTaskGroupParameterBean.
     * 
     * @return groupType
     */
    public ParameterGroupType getGroupType() {
        return groupType;
    }


    /**
     * Sets the groupType value for this ProcessTaskGroupParameterBean.
     * 
     * @param groupType
     */
    public void setGroupType(ParameterGroupType groupType) {
        this.groupType = groupType;
    }


    /**
     * Gets the name value for this ProcessTaskGroupParameterBean.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProcessTaskGroupParameterBean.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the parameters value for this ProcessTaskGroupParameterBean.
     * 
     * @return parameters
     */
    public ProcessTaskParameterBean[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ProcessTaskGroupParameterBean.
     * 
     * @param parameters
     */
    public void setParameters(ProcessTaskParameterBean[] parameters) {
        this.parameters = parameters;
    }

    public ProcessTaskParameterBean getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, ProcessTaskParameterBean _value) {
        this.parameters[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessTaskGroupParameterBean)) return false;
        ProcessTaskGroupParameterBean other = (ProcessTaskGroupParameterBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupType==null && other.getGroupType()==null) || 
             (this.groupType!=null &&
              this.groupType.equals(other.getGroupType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters())));
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
        if (getGroupType() != null) {
            _hashCode += getGroupType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessTaskGroupParameterBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskGroupParameterBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "parameterGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
