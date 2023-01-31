/**
 * BillPaymentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillPaymentBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean billInfo;

    private java.lang.Boolean requireVerification;

    private java.lang.Long verificationExpirationTimeOut;

    public BillPaymentBean() {
    }

    public BillPaymentBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean billInfo,
           java.lang.Boolean requireVerification,
           java.lang.Long verificationExpirationTimeOut) {
           this.billInfo = billInfo;
           this.requireVerification = requireVerification;
           this.verificationExpirationTimeOut = verificationExpirationTimeOut;
    }


    /**
     * Gets the billInfo value for this BillPaymentBean.
     * 
     * @return billInfo
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean getBillInfo() {
        return billInfo;
    }


    /**
     * Sets the billInfo value for this BillPaymentBean.
     * 
     * @param billInfo
     */
    public void setBillInfo(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean billInfo) {
        this.billInfo = billInfo;
    }


    /**
     * Gets the requireVerification value for this BillPaymentBean.
     * 
     * @return requireVerification
     */
    public java.lang.Boolean getRequireVerification() {
        return requireVerification;
    }


    /**
     * Sets the requireVerification value for this BillPaymentBean.
     * 
     * @param requireVerification
     */
    public void setRequireVerification(java.lang.Boolean requireVerification) {
        this.requireVerification = requireVerification;
    }


    /**
     * Gets the verificationExpirationTimeOut value for this BillPaymentBean.
     * 
     * @return verificationExpirationTimeOut
     */
    public java.lang.Long getVerificationExpirationTimeOut() {
        return verificationExpirationTimeOut;
    }


    /**
     * Sets the verificationExpirationTimeOut value for this BillPaymentBean.
     * 
     * @param verificationExpirationTimeOut
     */
    public void setVerificationExpirationTimeOut(java.lang.Long verificationExpirationTimeOut) {
        this.verificationExpirationTimeOut = verificationExpirationTimeOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentBean)) return false;
        BillPaymentBean other = (BillPaymentBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billInfo==null && other.getBillInfo()==null) || 
             (this.billInfo!=null &&
              this.billInfo.equals(other.getBillInfo()))) &&
            ((this.requireVerification==null && other.getRequireVerification()==null) || 
             (this.requireVerification!=null &&
              this.requireVerification.equals(other.getRequireVerification()))) &&
            ((this.verificationExpirationTimeOut==null && other.getVerificationExpirationTimeOut()==null) || 
             (this.verificationExpirationTimeOut!=null &&
              this.verificationExpirationTimeOut.equals(other.getVerificationExpirationTimeOut())));
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
        if (getBillInfo() != null) {
            _hashCode += getBillInfo().hashCode();
        }
        if (getRequireVerification() != null) {
            _hashCode += getRequireVerification().hashCode();
        }
        if (getVerificationExpirationTimeOut() != null) {
            _hashCode += getVerificationExpirationTimeOut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billPaymentBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billInfoSearchRequestBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireVerification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requireVerification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationExpirationTimeOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verificationExpirationTimeOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
