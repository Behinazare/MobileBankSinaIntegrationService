/**
 * BillInfoRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillInfoRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean billInfoSearchRequestBean;

    private java.lang.String merchantId;

    public BillInfoRequestBean() {
    }

    public BillInfoRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean billInfoSearchRequestBean,
           java.lang.String merchantId) {
           this.billInfoSearchRequestBean = billInfoSearchRequestBean;
           this.merchantId = merchantId;
    }


    /**
     * Gets the billInfoSearchRequestBean value for this BillInfoRequestBean.
     * 
     * @return billInfoSearchRequestBean
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean getBillInfoSearchRequestBean() {
        return billInfoSearchRequestBean;
    }


    /**
     * Sets the billInfoSearchRequestBean value for this BillInfoRequestBean.
     * 
     * @param billInfoSearchRequestBean
     */
    public void setBillInfoSearchRequestBean(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean billInfoSearchRequestBean) {
        this.billInfoSearchRequestBean = billInfoSearchRequestBean;
    }


    /**
     * Gets the merchantId value for this BillInfoRequestBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this BillInfoRequestBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillInfoRequestBean)) return false;
        BillInfoRequestBean other = (BillInfoRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billInfoSearchRequestBean==null && other.getBillInfoSearchRequestBean()==null) || 
             (this.billInfoSearchRequestBean!=null &&
              this.billInfoSearchRequestBean.equals(other.getBillInfoSearchRequestBean()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId())));
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
        if (getBillInfoSearchRequestBean() != null) {
            _hashCode += getBillInfoSearchRequestBean().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillInfoRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billInfoRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billInfoSearchRequestBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billInfoSearchRequestBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billInfoSearchRequestBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantId"));
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
