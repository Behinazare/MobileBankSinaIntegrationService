/**
 * ProcessParameterInputValueBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class ProcessParameterInputValueBean  implements java.io.Serializable {
    private String fileContent;

    private String fileName;

    private String fileType;

    private RowDataBean[] processParameterTableValueBean;

    private String[] values;

    public ProcessParameterInputValueBean() {
    }

    public ProcessParameterInputValueBean(
           String fileContent,
           String fileName,
           String fileType,
           RowDataBean[] processParameterTableValueBean,
           String[] values) {
           this.fileContent = fileContent;
           this.fileName = fileName;
           this.fileType = fileType;
           this.processParameterTableValueBean = processParameterTableValueBean;
           this.values = values;
    }


    /**
     * Gets the fileContent value for this ProcessParameterInputValueBean.
     * 
     * @return fileContent
     */
    public String getFileContent() {
        return fileContent;
    }


    /**
     * Sets the fileContent value for this ProcessParameterInputValueBean.
     * 
     * @param fileContent
     */
    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }


    /**
     * Gets the fileName value for this ProcessParameterInputValueBean.
     * 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this ProcessParameterInputValueBean.
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the fileType value for this ProcessParameterInputValueBean.
     * 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this ProcessParameterInputValueBean.
     * 
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the processParameterTableValueBean value for this ProcessParameterInputValueBean.
     * 
     * @return processParameterTableValueBean
     */
    public RowDataBean[] getProcessParameterTableValueBean() {
        return processParameterTableValueBean;
    }


    /**
     * Sets the processParameterTableValueBean value for this ProcessParameterInputValueBean.
     * 
     * @param processParameterTableValueBean
     */
    public void setProcessParameterTableValueBean(RowDataBean[] processParameterTableValueBean) {
        this.processParameterTableValueBean = processParameterTableValueBean;
    }


    /**
     * Gets the values value for this ProcessParameterInputValueBean.
     * 
     * @return values
     */
    public String[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this ProcessParameterInputValueBean.
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
        if (!(obj instanceof ProcessParameterInputValueBean)) return false;
        ProcessParameterInputValueBean other = (ProcessParameterInputValueBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileContent==null && other.getFileContent()==null) || 
             (this.fileContent!=null &&
              this.fileContent.equals(other.getFileContent()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.processParameterTableValueBean==null && other.getProcessParameterTableValueBean()==null) || 
             (this.processParameterTableValueBean!=null &&
              java.util.Arrays.equals(this.processParameterTableValueBean, other.getProcessParameterTableValueBean()))) &&
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
        if (getFileContent() != null) {
            _hashCode += getFileContent().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getProcessParameterTableValueBean() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessParameterTableValueBean());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProcessParameterTableValueBean(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(ProcessParameterInputValueBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processParameterInputValueBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("processParameterTableValueBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processParameterTableValueBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rowDataBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "rowDataBeansInfo"));
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
