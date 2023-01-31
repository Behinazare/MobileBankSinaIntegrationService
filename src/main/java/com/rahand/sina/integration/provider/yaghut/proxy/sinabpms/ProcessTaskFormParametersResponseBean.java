/**
 * ProcessTaskFormParametersResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessTaskFormParametersResponseBean  implements java.io.Serializable {
    private ProcessTaskGroupParameterBean[] groupedParameters;

    private ProcessTaskParameterBean[] parameters;

    private ProcessBean processBean;

    private String taskTitle;

    private String taskType;

    public ProcessTaskFormParametersResponseBean() {
    }

    public ProcessTaskFormParametersResponseBean(
           ProcessTaskGroupParameterBean[] groupedParameters,
           ProcessTaskParameterBean[] parameters,
           ProcessBean processBean,
           String taskTitle,
           String taskType) {
           this.groupedParameters = groupedParameters;
           this.parameters = parameters;
           this.processBean = processBean;
           this.taskTitle = taskTitle;
           this.taskType = taskType;
    }


    /**
     * Gets the groupedParameters value for this ProcessTaskFormParametersResponseBean.
     * 
     * @return groupedParameters
     */
    public ProcessTaskGroupParameterBean[] getGroupedParameters() {
        return groupedParameters;
    }


    /**
     * Sets the groupedParameters value for this ProcessTaskFormParametersResponseBean.
     * 
     * @param groupedParameters
     */
    public void setGroupedParameters(ProcessTaskGroupParameterBean[] groupedParameters) {
        this.groupedParameters = groupedParameters;
    }

    public ProcessTaskGroupParameterBean getGroupedParameters(int i) {
        return this.groupedParameters[i];
    }

    public void setGroupedParameters(int i, ProcessTaskGroupParameterBean _value) {
        this.groupedParameters[i] = _value;
    }


    /**
     * Gets the parameters value for this ProcessTaskFormParametersResponseBean.
     * 
     * @return parameters
     */
    public ProcessTaskParameterBean[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ProcessTaskFormParametersResponseBean.
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


    /**
     * Gets the processBean value for this ProcessTaskFormParametersResponseBean.
     * 
     * @return processBean
     */
    public ProcessBean getProcessBean() {
        return processBean;
    }


    /**
     * Sets the processBean value for this ProcessTaskFormParametersResponseBean.
     * 
     * @param processBean
     */
    public void setProcessBean(ProcessBean processBean) {
        this.processBean = processBean;
    }


    /**
     * Gets the taskTitle value for this ProcessTaskFormParametersResponseBean.
     * 
     * @return taskTitle
     */
    public String getTaskTitle() {
        return taskTitle;
    }


    /**
     * Sets the taskTitle value for this ProcessTaskFormParametersResponseBean.
     * 
     * @param taskTitle
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }


    /**
     * Gets the taskType value for this ProcessTaskFormParametersResponseBean.
     * 
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this ProcessTaskFormParametersResponseBean.
     * 
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessTaskFormParametersResponseBean)) return false;
        ProcessTaskFormParametersResponseBean other = (ProcessTaskFormParametersResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupedParameters==null && other.getGroupedParameters()==null) || 
             (this.groupedParameters!=null &&
              java.util.Arrays.equals(this.groupedParameters, other.getGroupedParameters()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.processBean==null && other.getProcessBean()==null) || 
             (this.processBean!=null &&
              this.processBean.equals(other.getProcessBean()))) &&
            ((this.taskTitle==null && other.getTaskTitle()==null) || 
             (this.taskTitle!=null &&
              this.taskTitle.equals(other.getTaskTitle()))) &&
            ((this.taskType==null && other.getTaskType()==null) || 
             (this.taskType!=null &&
              this.taskType.equals(other.getTaskType())));
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
        if (getGroupedParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupedParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGroupedParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getProcessBean() != null) {
            _hashCode += getProcessBean().hashCode();
        }
        if (getTaskTitle() != null) {
            _hashCode += getTaskTitle().hashCode();
        }
        if (getTaskType() != null) {
            _hashCode += getTaskType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessTaskFormParametersResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskFormParametersResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupedParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupedParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskGroupParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskType"));
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
