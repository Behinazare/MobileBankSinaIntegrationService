/**
 * ProcessTaskParameterValueBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessTaskParameterValueBean  implements java.io.Serializable {
    private ComplexDefinitionValueBean[] complexDefinitionValues;

    private String definitionValue;

    private EnumDefinitionValueBean[] enumDefinitionValue;

    private String fileContent;

    private String fileName;

    private String fileType;

    private String parameterType;

    private ProcessParameterTableValueBean processParameterTableValueBean;

    private String valueType;

    private String[] values;

    public ProcessTaskParameterValueBean() {
    }

    public ProcessTaskParameterValueBean(
           ComplexDefinitionValueBean[] complexDefinitionValues,
           String definitionValue,
           EnumDefinitionValueBean[] enumDefinitionValue,
           String fileContent,
           String fileName,
           String fileType,
           String parameterType,
           ProcessParameterTableValueBean processParameterTableValueBean,
           String valueType,
           String[] values) {
           this.complexDefinitionValues = complexDefinitionValues;
           this.definitionValue = definitionValue;
           this.enumDefinitionValue = enumDefinitionValue;
           this.fileContent = fileContent;
           this.fileName = fileName;
           this.fileType = fileType;
           this.parameterType = parameterType;
           this.processParameterTableValueBean = processParameterTableValueBean;
           this.valueType = valueType;
           this.values = values;
    }


    /**
     * Gets the complexDefinitionValues value for this ProcessTaskParameterValueBean.
     * 
     * @return complexDefinitionValues
     */
    public ComplexDefinitionValueBean[] getComplexDefinitionValues() {
        return complexDefinitionValues;
    }


    /**
     * Sets the complexDefinitionValues value for this ProcessTaskParameterValueBean.
     * 
     * @param complexDefinitionValues
     */
    public void setComplexDefinitionValues(ComplexDefinitionValueBean[] complexDefinitionValues) {
        this.complexDefinitionValues = complexDefinitionValues;
    }

    public ComplexDefinitionValueBean getComplexDefinitionValues(int i) {
        return this.complexDefinitionValues[i];
    }

    public void setComplexDefinitionValues(int i, ComplexDefinitionValueBean _value) {
        this.complexDefinitionValues[i] = _value;
    }


    /**
     * Gets the definitionValue value for this ProcessTaskParameterValueBean.
     * 
     * @return definitionValue
     */
    public String getDefinitionValue() {
        return definitionValue;
    }


    /**
     * Sets the definitionValue value for this ProcessTaskParameterValueBean.
     * 
     * @param definitionValue
     */
    public void setDefinitionValue(String definitionValue) {
        this.definitionValue = definitionValue;
    }


    /**
     * Gets the enumDefinitionValue value for this ProcessTaskParameterValueBean.
     * 
     * @return enumDefinitionValue
     */
    public EnumDefinitionValueBean[] getEnumDefinitionValue() {
        return enumDefinitionValue;
    }


    /**
     * Sets the enumDefinitionValue value for this ProcessTaskParameterValueBean.
     * 
     * @param enumDefinitionValue
     */
    public void setEnumDefinitionValue(EnumDefinitionValueBean[] enumDefinitionValue) {
        this.enumDefinitionValue = enumDefinitionValue;
    }

    public EnumDefinitionValueBean getEnumDefinitionValue(int i) {
        return this.enumDefinitionValue[i];
    }

    public void setEnumDefinitionValue(int i, EnumDefinitionValueBean _value) {
        this.enumDefinitionValue[i] = _value;
    }


    /**
     * Gets the fileContent value for this ProcessTaskParameterValueBean.
     * 
     * @return fileContent
     */
    public String getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this ProcessTaskParameterValueBean.
     * 
     * @param fileContent
     */
    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }


    /**
     * Gets the fileName value for this ProcessTaskParameterValueBean.
     * 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this ProcessTaskParameterValueBean.
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileType value for this ProcessTaskParameterValueBean.
     * 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this ProcessTaskParameterValueBean.
     * 
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the parameterType value for this ProcessTaskParameterValueBean.
     * 
     * @return parameterType
     */
    public String getParameterType() {
        return parameterType;
    }


    /**
     * Sets the parameterType value for this ProcessTaskParameterValueBean.
     * 
     * @param parameterType
     */
    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }


    /**
     * Gets the processParameterTableValueBean value for this ProcessTaskParameterValueBean.
     * 
     * @return processParameterTableValueBean
     */
    public ProcessParameterTableValueBean getProcessParameterTableValueBean() {
        return processParameterTableValueBean;
    }


    /**
     * Sets the processParameterTableValueBean value for this ProcessTaskParameterValueBean.
     * 
     * @param processParameterTableValueBean
     */
    public void setProcessParameterTableValueBean(ProcessParameterTableValueBean processParameterTableValueBean) {
        this.processParameterTableValueBean = processParameterTableValueBean;
    }


    /**
     * Gets the valueType value for this ProcessTaskParameterValueBean.
     * 
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }


    /**
     * Sets the valueType value for this ProcessTaskParameterValueBean.
     * 
     * @param valueType
     */
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }


    /**
     * Gets the values value for this ProcessTaskParameterValueBean.
     * 
     * @return values
     */
    public String[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this ProcessTaskParameterValueBean.
     * 
     * @param values
     */
    public void setValues(String[] values) {
        this.values = values;
    }

    public String getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, String _value) {
        this.values[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProcessTaskParameterValueBean)) return false;
        ProcessTaskParameterValueBean other = (ProcessTaskParameterValueBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complexDefinitionValues==null && other.getComplexDefinitionValues()==null) || 
             (this.complexDefinitionValues!=null &&
              java.util.Arrays.equals(this.complexDefinitionValues, other.getComplexDefinitionValues()))) &&
            ((this.definitionValue==null && other.getDefinitionValue()==null) || 
             (this.definitionValue!=null &&
              this.definitionValue.equals(other.getDefinitionValue()))) &&
            ((this.enumDefinitionValue==null && other.getEnumDefinitionValue()==null) || 
             (this.enumDefinitionValue!=null &&
              java.util.Arrays.equals(this.enumDefinitionValue, other.getEnumDefinitionValue()))) &&
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              this.fileContent.equals(other.getFileContent()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.parameterType==null && other.getParameterType()==null) || 
             (this.parameterType!=null &&
              this.parameterType.equals(other.getParameterType()))) &&
            ((this.processParameterTableValueBean==null && other.getProcessParameterTableValueBean()==null) || 
             (this.processParameterTableValueBean!=null &&
              this.processParameterTableValueBean.equals(other.getProcessParameterTableValueBean()))) &&
            ((this.valueType==null && other.getValueType()==null) || 
             (this.valueType!=null &&
              this.valueType.equals(other.getValueType()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getComplexDefinitionValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComplexDefinitionValues());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getComplexDefinitionValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefinitionValue() != null) {
            _hashCode += getDefinitionValue().hashCode();
        }
        if (getEnumDefinitionValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumDefinitionValue());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEnumDefinitionValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileContent() != null) {
            _hashCode += getFileContent().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getParameterType() != null) {
            _hashCode += getParameterType().hashCode();
        }
        if (getProcessParameterTableValueBean() != null) {
            _hashCode += getProcessParameterTableValueBean().hashCode();
        }
        if (getValueType() != null) {
            _hashCode += getValueType().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(ProcessTaskParameterValueBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTaskParameterValueBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complexDefinitionValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complexDefinitionValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "complexDefinitionValueBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definitionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumDefinitionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enumDefinitionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "enumDefinitionValueBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processParameterTableValueBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processParameterTableValueBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterTableValueBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
