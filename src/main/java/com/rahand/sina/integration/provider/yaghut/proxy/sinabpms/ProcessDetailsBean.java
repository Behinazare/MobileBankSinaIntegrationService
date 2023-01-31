/**
 * ProcessDetailsBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessDetailsBean  implements java.io.Serializable {
    private String activityInstanceId;

    private java.util.Calendar creationDate;

    private String executionId;

    private String id;

    private String processInstanceId;

    private String taskId;

    private String title;

    private ProcessFormPropertyTypeBean type;

    private String value;

    public ProcessDetailsBean() {
    }

    public ProcessDetailsBean(
           String activityInstanceId,
           java.util.Calendar creationDate,
           String executionId,
           String id,
           String processInstanceId,
           String taskId,
           String title,
           ProcessFormPropertyTypeBean type,
           String value) {
           this.activityInstanceId = activityInstanceId;
           this.creationDate = creationDate;
           this.executionId = executionId;
           this.id = id;
           this.processInstanceId = processInstanceId;
           this.taskId = taskId;
           this.title = title;
           this.type = type;
           this.value = value;
    }


    /**
     * Gets the activityInstanceId value for this ProcessDetailsBean.
     * 
     * @return activityInstanceId
     */
    public String getActivityInstanceId() {
        return activityInstanceId;
    }


    /**
     * Sets the activityInstanceId value for this ProcessDetailsBean.
     * 
     * @param activityInstanceId
     */
    public void setActivityInstanceId(String activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
    }


    /**
     * Gets the creationDate value for this ProcessDetailsBean.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this ProcessDetailsBean.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the executionId value for this ProcessDetailsBean.
     * 
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }


    /**
     * Sets the executionId value for this ProcessDetailsBean.
     * 
     * @param executionId
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }


    /**
     * Gets the id value for this ProcessDetailsBean.
     * 
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this ProcessDetailsBean.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the processInstanceId value for this ProcessDetailsBean.
     * 
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessDetailsBean.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the taskId value for this ProcessDetailsBean.
     * 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this ProcessDetailsBean.
     * 
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the title value for this ProcessDetailsBean.
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProcessDetailsBean.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this ProcessDetailsBean.
     * 
     * @return type
     */
    public ProcessFormPropertyTypeBean getType() {
        return type;
    }


    /**
     * Sets the type value for this ProcessDetailsBean.
     * 
     * @param type
     */
    public void setType(ProcessFormPropertyTypeBean type) {
        this.type = type;
    }


    /**
     * Gets the value value for this ProcessDetailsBean.
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ProcessDetailsBean.
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessDetailsBean)) return false;
        ProcessDetailsBean other = (ProcessDetailsBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityInstanceId==null && other.getActivityInstanceId()==null) || 
             (this.activityInstanceId!=null &&
              this.activityInstanceId.equals(other.getActivityInstanceId()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.executionId==null && other.getExecutionId()==null) || 
             (this.executionId!=null &&
              this.executionId.equals(other.getExecutionId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.processInstanceId==null && other.getProcessInstanceId()==null) || 
             (this.processInstanceId!=null &&
              this.processInstanceId.equals(other.getProcessInstanceId()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getActivityInstanceId() != null) {
            _hashCode += getActivityInstanceId().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getExecutionId() != null) {
            _hashCode += getExecutionId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProcessInstanceId() != null) {
            _hashCode += getProcessInstanceId().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessDetailsBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailsBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "executionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processFormPropertyTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
