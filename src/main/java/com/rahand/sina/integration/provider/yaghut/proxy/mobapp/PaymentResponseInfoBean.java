/**
 * PaymentResponseInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentResponseInfoBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FinancialServiceInfoResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String foreignTitle;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterInfoBean[] outputParameters;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceType paymentServiceType;

    private java.lang.String title;

    public PaymentResponseInfoBean() {
    }

    public PaymentResponseInfoBean(
           java.lang.String bankName,
           java.lang.String currency,
           java.util.Calendar date,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositInfoBean deposit,
           java.lang.String sourcePan,
           java.lang.String switchResponseRRN,
           java.lang.String systemTraceNumber,
           java.lang.String trackingNumber,
           java.math.BigDecimal amount,
           java.lang.String foreignTitle,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterInfoBean[] outputParameters,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceType paymentServiceType,
           java.lang.String title) {
        super(
            bankName,
            currency,
            date,
            deposit,
            sourcePan,
            switchResponseRRN,
            systemTraceNumber,
            trackingNumber);
        this.amount = amount;
        this.foreignTitle = foreignTitle;
        this.outputParameters = outputParameters;
        this.paymentServiceType = paymentServiceType;
        this.title = title;
    }


    /**
     * Gets the amount value for this PaymentResponseInfoBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentResponseInfoBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the foreignTitle value for this PaymentResponseInfoBean.
     * 
     * @return foreignTitle
     */
    public java.lang.String getForeignTitle() {
        return foreignTitle;
    }


    /**
     * Sets the foreignTitle value for this PaymentResponseInfoBean.
     * 
     * @param foreignTitle
     */
    public void setForeignTitle(java.lang.String foreignTitle) {
        this.foreignTitle = foreignTitle;
    }


    /**
     * Gets the outputParameters value for this PaymentResponseInfoBean.
     * 
     * @return outputParameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterInfoBean[] getOutputParameters() {
        return outputParameters;
    }


    /**
     * Sets the outputParameters value for this PaymentResponseInfoBean.
     * 
     * @param outputParameters
     */
    public void setOutputParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterInfoBean[] outputParameters) {
        this.outputParameters = outputParameters;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterInfoBean getOutputParameters(int i) {
        return this.outputParameters[i];
    }

    public void setOutputParameters(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterInfoBean _value) {
        this.outputParameters[i] = _value;
    }


    /**
     * Gets the paymentServiceType value for this PaymentResponseInfoBean.
     * 
     * @return paymentServiceType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceType getPaymentServiceType() {
        return paymentServiceType;
    }


    /**
     * Sets the paymentServiceType value for this PaymentResponseInfoBean.
     * 
     * @param paymentServiceType
     */
    public void setPaymentServiceType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceType paymentServiceType) {
        this.paymentServiceType = paymentServiceType;
    }


    /**
     * Gets the title value for this PaymentResponseInfoBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PaymentResponseInfoBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentResponseInfoBean)) return false;
        PaymentResponseInfoBean other = (PaymentResponseInfoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.foreignTitle==null && other.getForeignTitle()==null) || 
             (this.foreignTitle!=null &&
              this.foreignTitle.equals(other.getForeignTitle()))) &&
            ((this.outputParameters==null && other.getOutputParameters()==null) || 
             (this.outputParameters!=null &&
              java.util.Arrays.equals(this.outputParameters, other.getOutputParameters()))) &&
            ((this.paymentServiceType==null && other.getPaymentServiceType()==null) || 
             (this.paymentServiceType!=null &&
              this.paymentServiceType.equals(other.getPaymentServiceType()))) &&
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
        int _hashCode = super.hashCode();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getForeignTitle() != null) {
            _hashCode += getForeignTitle().hashCode();
        }
        if (getOutputParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentServiceType() != null) {
            _hashCode += getPaymentServiceType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentResponseInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentResponseInfoBean"));
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
        elemField.setFieldName("outputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentParameterInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceType"));
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
