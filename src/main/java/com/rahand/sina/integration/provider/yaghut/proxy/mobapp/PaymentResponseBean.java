/**
 * PaymentResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentResponseBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FinancialServiceResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] paymentParameters;

    private java.lang.String trackingNumber;

    public PaymentResponseBean() {
    }

    public PaymentResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean deposit,
           java.lang.String switchResponseRRN,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] paymentParameters,
           java.lang.String trackingNumber) {
        super(
            deposit,
            switchResponseRRN);
        this.paymentParameters = paymentParameters;
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the paymentParameters value for this PaymentResponseBean.
     * 
     * @return paymentParameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] getPaymentParameters() {
        return paymentParameters;
    }


    /**
     * Sets the paymentParameters value for this PaymentResponseBean.
     * 
     * @param paymentParameters
     */
    public void setPaymentParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean[] paymentParameters) {
        this.paymentParameters = paymentParameters;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean getPaymentParameters(int i) {
        return this.paymentParameters[i];
    }

    public void setPaymentParameters(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentParameterBean _value) {
        this.paymentParameters[i] = _value;
    }


    /**
     * Gets the trackingNumber value for this PaymentResponseBean.
     * 
     * @return trackingNumber
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this PaymentResponseBean.
     * 
     * @param trackingNumber
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentResponseBean)) return false;
        PaymentResponseBean other = (PaymentResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentParameters==null && other.getPaymentParameters()==null) || 
             (this.paymentParameters!=null &&
              java.util.Arrays.equals(this.paymentParameters, other.getPaymentParameters()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) || 
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber())));
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
        if (getPaymentParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingNumber"));
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
