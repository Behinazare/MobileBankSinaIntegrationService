/**
 * SignRequestDetailResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SignRequestDetailResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestDetailBean[] signRequestDetails;

    private java.lang.Integer totalRecord;

    public SignRequestDetailResponseBean() {
    }

    public SignRequestDetailResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestDetailBean[] signRequestDetails,
           java.lang.Integer totalRecord) {
           this.signRequestDetails = signRequestDetails;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the signRequestDetails value for this SignRequestDetailResponseBean.
     * 
     * @return signRequestDetails
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestDetailBean[] getSignRequestDetails() {
        return signRequestDetails;
    }


    /**
     * Sets the signRequestDetails value for this SignRequestDetailResponseBean.
     * 
     * @param signRequestDetails
     */
    public void setSignRequestDetails(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestDetailBean[] signRequestDetails) {
        this.signRequestDetails = signRequestDetails;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestDetailBean getSignRequestDetails(int i) {
        return this.signRequestDetails[i];
    }

    public void setSignRequestDetails(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignRequestDetailBean _value) {
        this.signRequestDetails[i] = _value;
    }


    /**
     * Gets the totalRecord value for this SignRequestDetailResponseBean.
     * 
     * @return totalRecord
     */
    public java.lang.Integer getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this SignRequestDetailResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignRequestDetailResponseBean)) return false;
        SignRequestDetailResponseBean other = (SignRequestDetailResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signRequestDetails==null && other.getSignRequestDetails()==null) || 
             (this.signRequestDetails!=null &&
              java.util.Arrays.equals(this.signRequestDetails, other.getSignRequestDetails()))) &&
            ((this.totalRecord==null && other.getTotalRecord()==null) || 
             (this.totalRecord!=null &&
              this.totalRecord.equals(other.getTotalRecord())));
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
        if (getSignRequestDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignRequestDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignRequestDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalRecord() != null) {
            _hashCode += getTotalRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignRequestDetailResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signRequestDetailResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signRequestDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
