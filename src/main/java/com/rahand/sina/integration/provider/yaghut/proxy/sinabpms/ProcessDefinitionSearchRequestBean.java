/**
 * ProcessDefinitionSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessDefinitionSearchRequestBean  implements java.io.Serializable {
    private java.util.Calendar fromCreationDate;

    private String id;

    private long length;

    private long offset;

    private boolean onlyLatestVersion;

    private ProcessDefinitionStatusType status;

    private String title;

    private java.util.Calendar toCreationDate;

    private String version;

    public ProcessDefinitionSearchRequestBean() {
    }

    public ProcessDefinitionSearchRequestBean(
           java.util.Calendar fromCreationDate,
           String id,
           long length,
           long offset,
           boolean onlyLatestVersion,
           ProcessDefinitionStatusType status,
           String title,
           java.util.Calendar toCreationDate,
           String version) {
           this.fromCreationDate = fromCreationDate;
           this.id = id;
           this.length = length;
           this.offset = offset;
           this.onlyLatestVersion = onlyLatestVersion;
           this.status = status;
           this.title = title;
           this.toCreationDate = toCreationDate;
           this.version = version;
    }


    /**
     * Gets the fromCreationDate value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return fromCreationDate
     */
    public java.util.Calendar getFromCreationDate() {
        return fromCreationDate;
    }


    /**
     * Sets the fromCreationDate value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param fromCreationDate
     */
    public void setFromCreationDate(java.util.Calendar fromCreationDate) {
        this.fromCreationDate = fromCreationDate;
    }


    /**
     * Gets the id value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the length value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return offset
     */
    public long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(long offset) {
        this.offset = offset;
    }


    /**
     * Gets the onlyLatestVersion value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return onlyLatestVersion
     */
    public boolean isOnlyLatestVersion() {
        return onlyLatestVersion;
    }


    /**
     * Sets the onlyLatestVersion value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param onlyLatestVersion
     */
    public void setOnlyLatestVersion(boolean onlyLatestVersion) {
        this.onlyLatestVersion = onlyLatestVersion;
    }


    /**
     * Gets the status value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return status
     */
    public ProcessDefinitionStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param status
     */
    public void setStatus(ProcessDefinitionStatusType status) {
        this.status = status;
    }


    /**
     * Gets the title value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the toCreationDate value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return toCreationDate
     */
    public java.util.Calendar getToCreationDate() {
        return toCreationDate;
    }


    /**
     * Sets the toCreationDate value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param toCreationDate
     */
    public void setToCreationDate(java.util.Calendar toCreationDate) {
        this.toCreationDate = toCreationDate;
    }


    /**
     * Gets the version value for this ProcessDefinitionSearchRequestBean.
     * 
     * @return version
     */
    public String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProcessDefinitionSearchRequestBean.
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessDefinitionSearchRequestBean)) return false;
        ProcessDefinitionSearchRequestBean other = (ProcessDefinitionSearchRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromCreationDate==null && other.getFromCreationDate()==null) || 
             (this.fromCreationDate!=null &&
              this.fromCreationDate.equals(other.getFromCreationDate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.length == other.getLength() &&
            this.offset == other.getOffset() &&
            this.onlyLatestVersion == other.isOnlyLatestVersion() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.toCreationDate==null && other.getToCreationDate()==null) || 
             (this.toCreationDate!=null &&
              this.toCreationDate.equals(other.getToCreationDate()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getFromCreationDate() != null) {
            _hashCode += getFromCreationDate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += new Long(getLength()).hashCode();
        _hashCode += new Long(getOffset()).hashCode();
        _hashCode += (isOnlyLatestVersion() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getToCreationDate() != null) {
            _hashCode += getToCreationDate().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessDefinitionSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlyLatestVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onlyLatestVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDefinitionStatusType"));
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
        elemField.setFieldName("toCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
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
