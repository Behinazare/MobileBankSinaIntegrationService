/**
 * StartProcessInstanceResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class StartProcessInstanceResponseBean  implements java.io.Serializable {
    private ProcessTaskGroupParameterBean[] nextTaskGroupParameters;

    private String nextTaskId;

    private ProcessTaskParameterBean[] nextTaskParameters;

    private String nextTaskTitle;

    private String nextTaskType;

    private ProcessBean process;

    public StartProcessInstanceResponseBean() {
    }

    public StartProcessInstanceResponseBean(
           ProcessTaskGroupParameterBean[] nextTaskGroupParameters,
           String nextTaskId,
           ProcessTaskParameterBean[] nextTaskParameters,
           String nextTaskTitle,
           String nextTaskType,
           ProcessBean process) {
           this.nextTaskGroupParameters = nextTaskGroupParameters;
           this.nextTaskId = nextTaskId;
           this.nextTaskParameters = nextTaskParameters;
           this.nextTaskTitle = nextTaskTitle;
           this.nextTaskType = nextTaskType;
           this.process = process;
    }


    /**
     * Gets the nextTaskGroupParameters value for this StartProcessInstanceResponseBean.
     * 
     * @return nextTaskGroupParameters
     */
    public ProcessTaskGroupParameterBean[] getNextTaskGroupParameters() {
        return nextTaskGroupParameters;
    }


    /**
     * Sets the nextTaskGroupParameters value for this StartProcessInstanceResponseBean.
     * 
     * @param nextTaskGroupParameters
     */
    public void setNextTaskGroupParameters(ProcessTaskGroupParameterBean[] nextTaskGroupParameters) {
        this.nextTaskGroupParameters = nextTaskGroupParameters;
    }

    public ProcessTaskGroupParameterBean getNextTaskGroupParameters(int i) {
        return this.nextTaskGroupParameters[i];
    }

    public void setNextTaskGroupParameters(int i, ProcessTaskGroupParameterBean _value) {
        this.nextTaskGroupParameters[i] = _value;
    }


    /**
     * Gets the nextTaskId value for this StartProcessInstanceResponseBean.
     * 
     * @return nextTaskId
     */
    public String getNextTaskId() {
        return nextTaskId;
    }


    /**
     * Sets the nextTaskId value for this StartProcessInstanceResponseBean.
     * 
     * @param nextTaskId
     */
    public void setNextTaskId(String nextTaskId) {
        this.nextTaskId = nextTaskId;
    }


    /**
     * Gets the nextTaskParameters value for this StartProcessInstanceResponseBean.
     * 
     * @return nextTaskParameters
     */
    public ProcessTaskParameterBean[] getNextTaskParameters() {
        return nextTaskParameters;
    }


    /**
     * Sets the nextTaskParameters value for this StartProcessInstanceResponseBean.
     * 
     * @param nextTaskParameters
     */
    public void setNextTaskParameters(ProcessTaskParameterBean[] nextTaskParameters) {
        this.nextTaskParameters = nextTaskParameters;
    }

    public ProcessTaskParameterBean getNextTaskParameters(int i) {
        return this.nextTaskParameters[i];
    }

    public void setNextTaskParameters(int i, ProcessTaskParameterBean _value) {
        this.nextTaskParameters[i] = _value;
    }


    /**
     * Gets the nextTaskTitle value for this StartProcessInstanceResponseBean.
     * 
     * @return nextTaskTitle
     */
    public String getNextTaskTitle() {
        return nextTaskTitle;
    }


    /**
     * Sets the nextTaskTitle value for this StartProcessInstanceResponseBean.
     * 
     * @param nextTaskTitle
     */
    public void setNextTaskTitle(String nextTaskTitle) {
        this.nextTaskTitle = nextTaskTitle;
    }


    /**
     * Gets the nextTaskType value for this StartProcessInstanceResponseBean.
     * 
     * @return nextTaskType
     */
    public String getNextTaskType() {
        return nextTaskType;
    }


    /**
     * Sets the nextTaskType value for this StartProcessInstanceResponseBean.
     * 
     * @param nextTaskType
     */
    public void setNextTaskType(String nextTaskType) {
        this.nextTaskType = nextTaskType;
    }


    /**
     * Gets the process value for this StartProcessInstanceResponseBean.
     * 
     * @return process
     */
    public ProcessBean getProcess() {
        return process;
    }


    /**
     * Sets the process value for this StartProcessInstanceResponseBean.
     * 
     * @param process
     */
    public void setProcess(ProcessBean process) {
        this.process = process;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StartProcessInstanceResponseBean)) return false;
        StartProcessInstanceResponseBean other = (StartProcessInstanceResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextTaskGroupParameters==null && other.getNextTaskGroupParameters()==null) || 
             (this.nextTaskGroupParameters!=null &&
              java.util.Arrays.equals(this.nextTaskGroupParameters, other.getNextTaskGroupParameters()))) &&
            ((this.nextTaskId==null && other.getNextTaskId()==null) || 
             (this.nextTaskId!=null &&
              this.nextTaskId.equals(other.getNextTaskId()))) &&
            ((this.nextTaskParameters==null && other.getNextTaskParameters()==null) || 
             (this.nextTaskParameters!=null &&
              java.util.Arrays.equals(this.nextTaskParameters, other.getNextTaskParameters()))) &&
            ((this.nextTaskTitle==null && other.getNextTaskTitle()==null) || 
             (this.nextTaskTitle!=null &&
              this.nextTaskTitle.equals(other.getNextTaskTitle()))) &&
            ((this.nextTaskType==null && other.getNextTaskType()==null) || 
             (this.nextTaskType!=null &&
              this.nextTaskType.equals(other.getNextTaskType()))) &&
            ((this.process==null && other.getProcess()==null) || 
             (this.process!=null &&
              this.process.equals(other.getProcess())));
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
        if (getNextTaskGroupParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextTaskGroupParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNextTaskGroupParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextTaskId() != null) {
            _hashCode += getNextTaskId().hashCode();
        }
        if (getNextTaskParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextTaskParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNextTaskParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextTaskTitle() != null) {
            _hashCode += getNextTaskTitle().hashCode();
        }
        if (getNextTaskType() != null) {
            _hashCode += getNextTaskType().hashCode();
        }
        if (getProcess() != null) {
            _hashCode += getProcess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StartProcessInstanceResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "startProcessInstanceResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTaskGroupParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTaskGroupParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskGroupParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTaskId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTaskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTaskParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTaskParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTaskTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTaskTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTaskType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTaskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("process");
        elemField.setXmlName(new javax.xml.namespace.QName("", "process"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processBean"));
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
