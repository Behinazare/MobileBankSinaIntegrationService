/**
 * BatchBillPaymentBillInfos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BatchBillPaymentBillInfos  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean[] billPaymentIds;

    private java.lang.Boolean requireVerification;

    private java.lang.Long verificationExpirationTimeOut;

    public BatchBillPaymentBillInfos() {
    }

    public BatchBillPaymentBillInfos(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean[] billPaymentIds,
           java.lang.Boolean requireVerification,
           java.lang.Long verificationExpirationTimeOut) {
           this.billPaymentIds = billPaymentIds;
           this.requireVerification = requireVerification;
           this.verificationExpirationTimeOut = verificationExpirationTimeOut;
    }


    /**
     * Gets the billPaymentIds value for this BatchBillPaymentBillInfos.
     * 
     * @return billPaymentIds
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean[] getBillPaymentIds() {
        return billPaymentIds;
    }


    /**
     * Sets the billPaymentIds value for this BatchBillPaymentBillInfos.
     * 
     * @param billPaymentIds
     */
    public void setBillPaymentIds(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean[] billPaymentIds) {
        this.billPaymentIds = billPaymentIds;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean getBillPaymentIds(int i) {
        return this.billPaymentIds[i];
    }

    public void setBillPaymentIds(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean _value) {
        this.billPaymentIds[i] = _value;
    }


    /**
     * Gets the requireVerification value for this BatchBillPaymentBillInfos.
     * 
     * @return requireVerification
     */
    public java.lang.Boolean getRequireVerification() {
        return requireVerification;
    }


    /**
     * Sets the requireVerification value for this BatchBillPaymentBillInfos.
     * 
     * @param requireVerification
     */
    public void setRequireVerification(java.lang.Boolean requireVerification) {
        this.requireVerification = requireVerification;
    }


    /**
     * Gets the verificationExpirationTimeOut value for this BatchBillPaymentBillInfos.
     * 
     * @return verificationExpirationTimeOut
     */
    public java.lang.Long getVerificationExpirationTimeOut() {
        return verificationExpirationTimeOut;
    }


    /**
     * Sets the verificationExpirationTimeOut value for this BatchBillPaymentBillInfos.
     * 
     * @param verificationExpirationTimeOut
     */
    public void setVerificationExpirationTimeOut(java.lang.Long verificationExpirationTimeOut) {
        this.verificationExpirationTimeOut = verificationExpirationTimeOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchBillPaymentBillInfos)) return false;
        BatchBillPaymentBillInfos other = (BatchBillPaymentBillInfos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billPaymentIds==null && other.getBillPaymentIds()==null) || 
             (this.billPaymentIds!=null &&
              java.util.Arrays.equals(this.billPaymentIds, other.getBillPaymentIds()))) &&
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
        if (getBillPaymentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillPaymentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPaymentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(BatchBillPaymentBillInfos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchBillPaymentBillInfos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPaymentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billPaymentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billInfoSearchRequestBean"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
