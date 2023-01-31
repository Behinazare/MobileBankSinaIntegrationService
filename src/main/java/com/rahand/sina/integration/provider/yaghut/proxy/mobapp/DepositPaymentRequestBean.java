/**
 * DepositPaymentRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositPaymentRequestBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentRequestInfoBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String depositNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositPaymentRequestInputParametersBean[] inputParameters;

    public DepositPaymentRequestBean() {
    }

    public DepositPaymentRequestBean(
           java.lang.String merchantId,
           java.lang.String paymentServiceId,
           java.lang.Boolean requireVerification,
           java.lang.Long verificationExpirationTimeOut,
           java.lang.String cif,
           java.lang.String depositNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositPaymentRequestInputParametersBean[] inputParameters) {
        super(
            merchantId,
            paymentServiceId,
            requireVerification,
            verificationExpirationTimeOut);
        this.cif = cif;
        this.depositNumber = depositNumber;
        this.inputParameters = inputParameters;
    }


    /**
     * Gets the cif value for this DepositPaymentRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this DepositPaymentRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this DepositPaymentRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this DepositPaymentRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the inputParameters value for this DepositPaymentRequestBean.
     * 
     * @return inputParameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositPaymentRequestInputParametersBean[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this DepositPaymentRequestBean.
     * 
     * @param inputParameters
     */
    public void setInputParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositPaymentRequestInputParametersBean[] inputParameters) {
        this.inputParameters = inputParameters;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositPaymentRequestInputParametersBean getInputParameters(int i) {
        return this.inputParameters[i];
    }

    public void setInputParameters(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositPaymentRequestInputParametersBean _value) {
        this.inputParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositPaymentRequestBean)) return false;
        DepositPaymentRequestBean other = (DepositPaymentRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.inputParameters==null && other.getInputParameters()==null) || 
             (this.inputParameters!=null &&
              java.util.Arrays.equals(this.inputParameters, other.getInputParameters())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositPaymentRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositPaymentRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositPaymentRequestInputParametersBean"));
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
