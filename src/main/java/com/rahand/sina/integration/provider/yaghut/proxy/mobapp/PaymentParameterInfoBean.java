/**
 * PaymentParameterInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentParameterInfoBean  implements java.io.Serializable {
    private java.lang.String foreignTitle;

    private java.lang.String id;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OutputParameterType outputParameterType;

    private java.lang.String title;

    private java.lang.String value;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ValueContentType[] valueContent;

    public PaymentParameterInfoBean() {
    }

    public PaymentParameterInfoBean(
           java.lang.String foreignTitle,
           java.lang.String id,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OutputParameterType outputParameterType,
           java.lang.String title,
           java.lang.String value,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ValueContentType[] valueContent) {
           this.foreignTitle = foreignTitle;
           this.id = id;
           this.outputParameterType = outputParameterType;
           this.title = title;
           this.value = value;
           this.valueContent = valueContent;
    }


    /**
     * Gets the foreignTitle value for this PaymentParameterInfoBean.
     * 
     * @return foreignTitle
     */
    public java.lang.String getForeignTitle() {
        return foreignTitle;
    }


    /**
     * Sets the foreignTitle value for this PaymentParameterInfoBean.
     * 
     * @param foreignTitle
     */
    public void setForeignTitle(java.lang.String foreignTitle) {
        this.foreignTitle = foreignTitle;
    }


    /**
     * Gets the id value for this PaymentParameterInfoBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PaymentParameterInfoBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the outputParameterType value for this PaymentParameterInfoBean.
     * 
     * @return outputParameterType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OutputParameterType getOutputParameterType() {
        return outputParameterType;
    }


    /**
     * Sets the outputParameterType value for this PaymentParameterInfoBean.
     * 
     * @param outputParameterType
     */
    public void setOutputParameterType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OutputParameterType outputParameterType) {
        this.outputParameterType = outputParameterType;
    }


    /**
     * Gets the title value for this PaymentParameterInfoBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PaymentParameterInfoBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the value value for this PaymentParameterInfoBean.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this PaymentParameterInfoBean.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the valueContent value for this PaymentParameterInfoBean.
     * 
     * @return valueContent
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ValueContentType[] getValueContent() {
        return valueContent;
    }


    /**
     * Sets the valueContent value for this PaymentParameterInfoBean.
     * 
     * @param valueContent
     */
    public void setValueContent(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ValueContentType[] valueContent) {
        this.valueContent = valueContent;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ValueContentType getValueContent(int i) {
        return this.valueContent[i];
    }

    public void setValueContent(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ValueContentType _value) {
        this.valueContent[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentParameterInfoBean)) return false;
        PaymentParameterInfoBean other = (PaymentParameterInfoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.foreignTitle==null && other.getForeignTitle()==null) || 
             (this.foreignTitle!=null &&
              this.foreignTitle.equals(other.getForeignTitle()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.outputParameterType==null && other.getOutputParameterType()==null) || 
             (this.outputParameterType!=null &&
              this.outputParameterType.equals(other.getOutputParameterType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueContent==null && other.getValueContent()==null) || 
             (this.valueContent!=null &&
              java.util.Arrays.equals(this.valueContent, other.getValueContent())));
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
        if (getForeignTitle() != null) {
            _hashCode += getForeignTitle().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOutputParameterType() != null) {
            _hashCode += getOutputParameterType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueContent(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentParameterInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentParameterInfoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignTitle"));
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
        elemField.setFieldName("outputParameterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputParameterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "outputParameterType"));
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
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "valueContentType"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
