/**
 * PaymentServiceDetailBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentServiceDetailBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBeanInputParametersEntry[] inputParameters;

    private java.lang.String paymentServiceId;

    private java.lang.String paymentServiceName;

    public PaymentServiceDetailBean() {
    }

    public PaymentServiceDetailBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBeanInputParametersEntry[] inputParameters,
           java.lang.String paymentServiceId,
           java.lang.String paymentServiceName) {
           this.inputParameters = inputParameters;
           this.paymentServiceId = paymentServiceId;
           this.paymentServiceName = paymentServiceName;
    }


    /**
     * Gets the inputParameters value for this PaymentServiceDetailBean.
     * 
     * @return inputParameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBeanInputParametersEntry[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this PaymentServiceDetailBean.
     * 
     * @param inputParameters
     */
    public void setInputParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBeanInputParametersEntry[] inputParameters) {
        this.inputParameters = inputParameters;
    }


    /**
     * Gets the paymentServiceId value for this PaymentServiceDetailBean.
     * 
     * @return paymentServiceId
     */
    public java.lang.String getPaymentServiceId() {
        return paymentServiceId;
    }


    /**
     * Sets the paymentServiceId value for this PaymentServiceDetailBean.
     * 
     * @param paymentServiceId
     */
    public void setPaymentServiceId(java.lang.String paymentServiceId) {
        this.paymentServiceId = paymentServiceId;
    }


    /**
     * Gets the paymentServiceName value for this PaymentServiceDetailBean.
     * 
     * @return paymentServiceName
     */
    public java.lang.String getPaymentServiceName() {
        return paymentServiceName;
    }


    /**
     * Sets the paymentServiceName value for this PaymentServiceDetailBean.
     * 
     * @param paymentServiceName
     */
    public void setPaymentServiceName(java.lang.String paymentServiceName) {
        this.paymentServiceName = paymentServiceName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentServiceDetailBean)) return false;
        PaymentServiceDetailBean other = (PaymentServiceDetailBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputParameters==null && other.getInputParameters()==null) || 
             (this.inputParameters!=null &&
              java.util.Arrays.equals(this.inputParameters, other.getInputParameters()))) &&
            ((this.paymentServiceId==null && other.getPaymentServiceId()==null) || 
             (this.paymentServiceId!=null &&
              this.paymentServiceId.equals(other.getPaymentServiceId()))) &&
            ((this.paymentServiceName==null && other.getPaymentServiceName()==null) || 
             (this.paymentServiceName!=null &&
              this.paymentServiceName.equals(other.getPaymentServiceName())));
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
        if (getPaymentServiceId() != null) {
            _hashCode += getPaymentServiceId().hashCode();
        }
        if (getPaymentServiceName() != null) {
            _hashCode += getPaymentServiceName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentServiceDetailBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceDetailBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", ">>paymentServiceDetailBean>inputParameters>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
