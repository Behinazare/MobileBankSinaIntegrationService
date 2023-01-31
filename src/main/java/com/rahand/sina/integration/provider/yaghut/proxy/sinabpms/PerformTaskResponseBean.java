/**
 * PerformTaskResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class PerformTaskResponseBean  implements java.io.Serializable {
    private ProcessTaskGroupParameterBean[] nextTaskGroupedParameters;

    private String nextTaskId;

    private ProcessTaskParameterBean[] nextTaskParameters;

    private String nextTaskTitle;

    private String nextTaskType;

    private ProcessBean processBean;

    public PerformTaskResponseBean() {
    }

    public PerformTaskResponseBean(
           ProcessTaskGroupParameterBean[] nextTaskGroupedParameters,
           String nextTaskId,
           ProcessTaskParameterBean[] nextTaskParameters,
           String nextTaskTitle,
           String nextTaskType,
           ProcessBean processBean) {
           this.nextTaskGroupedParameters = nextTaskGroupedParameters;
           this.nextTaskId = nextTaskId;
           this.nextTaskParameters = nextTaskParameters;
           this.nextTaskTitle = nextTaskTitle;
           this.nextTaskType = nextTaskType;
           this.processBean = processBean;
    }


    /**
     * Gets the nextTaskGroupedParameters value for this PerformTaskResponseBean.
     * 
     * @return nextTaskGroupedParameters
     */
    public ProcessTaskGroupParameterBean[] getNextTaskGroupedParameters() {
        return nextTaskGroupedParameters;
    }


    /**
     * Sets the nextTaskGroupedParameters value for this PerformTaskResponseBean.
     * 
     * @param nextTaskGroupedParameters
     */
    public void setNextTaskGroupedParameters(ProcessTaskGroupParameterBean[] nextTaskGroupedParameters) {
        this.nextTaskGroupedParameters = nextTaskGroupedParameters;
    }

    public ProcessTaskGroupParameterBean getNextTaskGroupedParameters(int i) {
        return this.nextTaskGroupedParameters[i];
    }

    public void setNextTaskGroupedParameters(int i, ProcessTaskGroupParameterBean _value) {
        this.nextTaskGroupedParameters[i] = _value;
    }


    /**
     * Gets the nextTaskId value for this PerformTaskResponseBean.
     * 
     * @return nextTaskId
     */
    public String getNextTaskId() {
        return nextTaskId;
    }


    /**
     * Sets the nextTaskId value for this PerformTaskResponseBean.
     * 
     * @param nextTaskId
     */
    public void setNextTaskId(String nextTaskId) {
        this.nextTaskId = nextTaskId;
    }


    /**
     * Gets the nextTaskParameters value for this PerformTaskResponseBean.
     * 
     * @return nextTaskParameters
     */
    public ProcessTaskParameterBean[] getNextTaskParameters() {
        return nextTaskParameters;
    }


    /**
     * Sets the nextTaskParameters value for this PerformTaskResponseBean.
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
     * Gets the nextTaskTitle value for this PerformTaskResponseBean.
     * 
     * @return nextTaskTitle
     */
    public String getNextTaskTitle() {
        return nextTaskTitle;
    }


    /**
     * Sets the nextTaskTitle value for this PerformTaskResponseBean.
     * 
     * @param nextTaskTitle
     */
    public void setNextTaskTitle(String nextTaskTitle) {
        this.nextTaskTitle = nextTaskTitle;
    }


    /**
     * Gets the nextTaskType value for this PerformTaskResponseBean.
     * 
     * @return nextTaskType
     */
    public String getNextTaskType() {
        return nextTaskType;
    }


    /**
     * Sets the nextTaskType value for this PerformTaskResponseBean.
     * 
     * @param nextTaskType
     */
    public void setNextTaskType(String nextTaskType) {
        this.nextTaskType = nextTaskType;
    }


    /**
     * Gets the processBean value for this PerformTaskResponseBean.
     * 
     * @return processBean
     */
    public ProcessBean getProcessBean() {
        return processBean;
    }


    /**
     * Sets the processBean value for this PerformTaskResponseBean.
     * 
     * @param processBean
     */
    public void setProcessBean(ProcessBean processBean) {
        this.processBean = processBean;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PerformTaskResponseBean)) return false;
        PerformTaskResponseBean other = (PerformTaskResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextTaskGroupedParameters==null && other.getNextTaskGroupedParameters()==null) || 
             (this.nextTaskGroupedParameters!=null &&
              java.util.Arrays.equals(this.nextTaskGroupedParameters, other.getNextTaskGroupedParameters()))) &&
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
            ((this.processBean==null && other.getProcessBean()==null) || 
             (this.processBean!=null &&
              this.processBean.equals(other.getProcessBean())));
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
        if (getNextTaskGroupedParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextTaskGroupedParameters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNextTaskGroupedParameters(), i);
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
        if (getProcessBean() != null) {
            _hashCode += getProcessBean().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformTaskResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "performTaskResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTaskGroupedParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTaskGroupedParameters"));
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
        elemField.setFieldName("processBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processBean"));
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
