/**
 * NormalTransferServiceResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class NormalTransferServiceResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo;

    private java.lang.String serialNumber;

    public NormalTransferServiceResponseBean() {
    }

    public NormalTransferServiceResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo,
           java.lang.String serialNumber) {
           this.commissionResultInfo = commissionResultInfo;
           this.serialNumber = serialNumber;
    }


    /**
     * Gets the commissionResultInfo value for this NormalTransferServiceResponseBean.
     * 
     * @return commissionResultInfo
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean getCommissionResultInfo() {
        return commissionResultInfo;
    }


    /**
     * Sets the commissionResultInfo value for this NormalTransferServiceResponseBean.
     * 
     * @param commissionResultInfo
     */
    public void setCommissionResultInfo(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo) {
        this.commissionResultInfo = commissionResultInfo;
    }


    /**
     * Gets the serialNumber value for this NormalTransferServiceResponseBean.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this NormalTransferServiceResponseBean.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NormalTransferServiceResponseBean)) return false;
        NormalTransferServiceResponseBean other = (NormalTransferServiceResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commissionResultInfo==null && other.getCommissionResultInfo()==null) || 
             (this.commissionResultInfo!=null &&
              this.commissionResultInfo.equals(other.getCommissionResultInfo()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber())));
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
        if (getCommissionResultInfo() != null) {
            _hashCode += getCommissionResultInfo().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NormalTransferServiceResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "normalTransferServiceResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionResultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionResultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "commissionResultInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNumber"));
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
