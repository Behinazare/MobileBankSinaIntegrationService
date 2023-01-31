/**
 * PaymentServiceInputParameterBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentServiceInputParameterBean  implements java.io.Serializable {
    private java.lang.String foreignTitle;

    private java.lang.String id;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputStyleType[] inputStyle;

    private java.lang.Boolean isAmount;

    private java.lang.Boolean isProtected;

    private java.lang.Short maxValueLength;

    private java.lang.Short minValueLength;

    private java.lang.String title;

    public PaymentServiceInputParameterBean() {
    }

    public PaymentServiceInputParameterBean(
           java.lang.String foreignTitle,
           java.lang.String id,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputStyleType[] inputStyle,
           java.lang.Boolean isAmount,
           java.lang.Boolean isProtected,
           java.lang.Short maxValueLength,
           java.lang.Short minValueLength,
           java.lang.String title) {
           this.foreignTitle = foreignTitle;
           this.id = id;
           this.inputStyle = inputStyle;
           this.isAmount = isAmount;
           this.isProtected = isProtected;
           this.maxValueLength = maxValueLength;
           this.minValueLength = minValueLength;
           this.title = title;
    }


    /**
     * Gets the foreignTitle value for this PaymentServiceInputParameterBean.
     * 
     * @return foreignTitle
     */
    public java.lang.String getForeignTitle() {
        return foreignTitle;
    }


    /**
     * Sets the foreignTitle value for this PaymentServiceInputParameterBean.
     * 
     * @param foreignTitle
     */
    public void setForeignTitle(java.lang.String foreignTitle) {
        this.foreignTitle = foreignTitle;
    }


    /**
     * Gets the id value for this PaymentServiceInputParameterBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PaymentServiceInputParameterBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the inputStyle value for this PaymentServiceInputParameterBean.
     * 
     * @return inputStyle
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputStyleType[] getInputStyle() {
        return inputStyle;
    }


    /**
     * Sets the inputStyle value for this PaymentServiceInputParameterBean.
     * 
     * @param inputStyle
     */
    public void setInputStyle(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputStyleType[] inputStyle) {
        this.inputStyle = inputStyle;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputStyleType getInputStyle(int i) {
        return this.inputStyle[i];
    }

    public void setInputStyle(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputStyleType _value) {
        this.inputStyle[i] = _value;
    }


    /**
     * Gets the isAmount value for this PaymentServiceInputParameterBean.
     * 
     * @return isAmount
     */
    public java.lang.Boolean getIsAmount() {
        return isAmount;
    }


    /**
     * Sets the isAmount value for this PaymentServiceInputParameterBean.
     * 
     * @param isAmount
     */
    public void setIsAmount(java.lang.Boolean isAmount) {
        this.isAmount = isAmount;
    }


    /**
     * Gets the isProtected value for this PaymentServiceInputParameterBean.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this PaymentServiceInputParameterBean.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the maxValueLength value for this PaymentServiceInputParameterBean.
     * 
     * @return maxValueLength
     */
    public java.lang.Short getMaxValueLength() {
        return maxValueLength;
    }


    /**
     * Sets the maxValueLength value for this PaymentServiceInputParameterBean.
     * 
     * @param maxValueLength
     */
    public void setMaxValueLength(java.lang.Short maxValueLength) {
        this.maxValueLength = maxValueLength;
    }


    /**
     * Gets the minValueLength value for this PaymentServiceInputParameterBean.
     * 
     * @return minValueLength
     */
    public java.lang.Short getMinValueLength() {
        return minValueLength;
    }


    /**
     * Sets the minValueLength value for this PaymentServiceInputParameterBean.
     * 
     * @param minValueLength
     */
    public void setMinValueLength(java.lang.Short minValueLength) {
        this.minValueLength = minValueLength;
    }


    /**
     * Gets the title value for this PaymentServiceInputParameterBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PaymentServiceInputParameterBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentServiceInputParameterBean)) return false;
        PaymentServiceInputParameterBean other = (PaymentServiceInputParameterBean) obj;
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
            ((this.inputStyle==null && other.getInputStyle()==null) || 
             (this.inputStyle!=null &&
              java.util.Arrays.equals(this.inputStyle, other.getInputStyle()))) &&
            ((this.isAmount==null && other.getIsAmount()==null) || 
             (this.isAmount!=null &&
              this.isAmount.equals(other.getIsAmount()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected()))) &&
            ((this.maxValueLength==null && other.getMaxValueLength()==null) || 
             (this.maxValueLength!=null &&
              this.maxValueLength.equals(other.getMaxValueLength()))) &&
            ((this.minValueLength==null && other.getMinValueLength()==null) || 
             (this.minValueLength!=null &&
              this.minValueLength.equals(other.getMinValueLength()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getInputStyle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputStyle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputStyle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsAmount() != null) {
            _hashCode += getIsAmount().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        if (getMaxValueLength() != null) {
            _hashCode += getMaxValueLength().hashCode();
        }
        if (getMinValueLength() != null) {
            _hashCode += getMinValueLength().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentServiceInputParameterBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceInputParameterBean"));
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
        elemField.setFieldName("inputStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceInputStyleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isProtected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxValueLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxValueLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minValueLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minValueLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
