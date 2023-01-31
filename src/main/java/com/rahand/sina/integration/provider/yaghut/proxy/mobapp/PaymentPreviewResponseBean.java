/**
 * PaymentPreviewResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentPreviewResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String foreignTitle;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] inputParameters;

    private java.lang.String referenceNumber;

    private java.lang.String title;

    public PaymentPreviewResponseBean() {
    }

    public PaymentPreviewResponseBean(
           java.math.BigDecimal amount,
           java.lang.String foreignTitle,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] inputParameters,
           java.lang.String referenceNumber,
           java.lang.String title) {
           this.amount = amount;
           this.foreignTitle = foreignTitle;
           this.inputParameters = inputParameters;
           this.referenceNumber = referenceNumber;
           this.title = title;
    }


    /**
     * Gets the amount value for this PaymentPreviewResponseBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentPreviewResponseBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the foreignTitle value for this PaymentPreviewResponseBean.
     * 
     * @return foreignTitle
     */
    public java.lang.String getForeignTitle() {
        return foreignTitle;
    }


    /**
     * Sets the foreignTitle value for this PaymentPreviewResponseBean.
     * 
     * @param foreignTitle
     */
    public void setForeignTitle(java.lang.String foreignTitle) {
        this.foreignTitle = foreignTitle;
    }


    /**
     * Gets the inputParameters value for this PaymentPreviewResponseBean.
     * 
     * @return inputParameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this PaymentPreviewResponseBean.
     * 
     * @param inputParameters
     */
    public void setInputParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] inputParameters) {
        this.inputParameters = inputParameters;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean getInputParameters(int i) {
        return this.inputParameters[i];
    }

    public void setInputParameters(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean _value) {
        this.inputParameters[i] = _value;
    }


    /**
     * Gets the referenceNumber value for this PaymentPreviewResponseBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this PaymentPreviewResponseBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the title value for this PaymentPreviewResponseBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PaymentPreviewResponseBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentPreviewResponseBean)) return false;
        PaymentPreviewResponseBean other = (PaymentPreviewResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.foreignTitle==null && other.getForeignTitle()==null) || 
             (this.foreignTitle!=null &&
              this.foreignTitle.equals(other.getForeignTitle()))) &&
            ((this.inputParameters==null && other.getInputParameters()==null) || 
             (this.inputParameters!=null &&
              java.util.Arrays.equals(this.inputParameters, other.getInputParameters()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getForeignTitle() != null) {
            _hashCode += getForeignTitle().hashCode();
        }
        if (getInputParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentPreviewResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentPreviewResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
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
