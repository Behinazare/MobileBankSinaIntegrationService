/**
 * ProcessTaskParameterBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessTaskParameterBean  implements java.io.Serializable {
    private String id;

    private Short maxLength;

    private Short minLength;

    private boolean required;

    private String title;

    private String type;

    private String validationPattern;

    private ProcessTaskParameterValueBean value;

    public ProcessTaskParameterBean() {
    }

    public ProcessTaskParameterBean(
           String id,
           Short maxLength,
           Short minLength,
           boolean required,
           String title,
           String type,
           String validationPattern,
           ProcessTaskParameterValueBean value) {
           this.id = id;
           this.maxLength = maxLength;
           this.minLength = minLength;
           this.required = required;
           this.title = title;
           this.type = type;
           this.validationPattern = validationPattern;
           this.value = value;
    }


    /**
     * Gets the id value for this ProcessTaskParameterBean.
     * 
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this ProcessTaskParameterBean.
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the maxLength value for this ProcessTaskParameterBean.
     * 
     * @return maxLength
     */
    public Short getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this ProcessTaskParameterBean.
     * 
     * @param maxLength
     */
    public void setMaxLength(Short maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the minLength value for this ProcessTaskParameterBean.
     * 
     * @return minLength
     */
    public Short getMinLength() {
        return minLength;
    }


    /**
     * Sets the minLength value for this ProcessTaskParameterBean.
     * 
     * @param minLength
     */
    public void setMinLength(Short minLength) {
        this.minLength = minLength;
    }


    /**
     * Gets the required value for this ProcessTaskParameterBean.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this ProcessTaskParameterBean.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the title value for this ProcessTaskParameterBean.
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProcessTaskParameterBean.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this ProcessTaskParameterBean.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this ProcessTaskParameterBean.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the validationPattern value for this ProcessTaskParameterBean.
     * 
     * @return validationPattern
     */
    public String getValidationPattern() {
        return validationPattern;
    }


    /**
     * Sets the validationPattern value for this ProcessTaskParameterBean.
     * 
     * @param validationPattern
     */
    public void setValidationPattern(String validationPattern) {
        this.validationPattern = validationPattern;
    }


    /**
     * Gets the value value for this ProcessTaskParameterBean.
     * 
     * @return value
     */
    public ProcessTaskParameterValueBean getValue() {
        return value;
    }


    /**
     * Sets the value value for this ProcessTaskParameterBean.
     * 
     * @param value
     */
    public void setValue(ProcessTaskParameterValueBean value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessTaskParameterBean)) return false;
        ProcessTaskParameterBean other = (ProcessTaskParameterBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.minLength==null && other.getMinLength()==null) || 
             (this.minLength!=null &&
              this.minLength.equals(other.getMinLength()))) &&
            this.required == other.isRequired() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.validationPattern==null && other.getValidationPattern()==null) || 
             (this.validationPattern!=null &&
              this.validationPattern.equals(other.getValidationPattern()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getMinLength() != null) {
            _hashCode += getMinLength().hashCode();
        }
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValidationPattern() != null) {
            _hashCode += getValidationPattern().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessTaskParameterBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationPattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationPattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterValueBean"));
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
