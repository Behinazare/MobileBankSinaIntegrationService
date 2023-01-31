/**
 * StatusByOptionalMerchantDataRequestV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class StatusByOptionalMerchantDataRequestV7  implements java.io.Serializable {
    private int merchantId;

    private java.lang.String optionalMerchantData;

    public StatusByOptionalMerchantDataRequestV7() {
    }

    public StatusByOptionalMerchantDataRequestV7(
           int merchantId,
           java.lang.String optionalMerchantData) {
           this.merchantId = merchantId;
           this.optionalMerchantData = optionalMerchantData;
    }


    /**
     * Gets the merchantId value for this StatusByOptionalMerchantDataRequestV7.
     * 
     * @return merchantId
     */
    public int getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this StatusByOptionalMerchantDataRequestV7.
     * 
     * @param merchantId
     */
    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the optionalMerchantData value for this StatusByOptionalMerchantDataRequestV7.
     * 
     * @return optionalMerchantData
     */
    public java.lang.String getOptionalMerchantData() {
        return optionalMerchantData;
    }


    /**
     * Sets the optionalMerchantData value for this StatusByOptionalMerchantDataRequestV7.
     * 
     * @param optionalMerchantData
     */
    public void setOptionalMerchantData(java.lang.String optionalMerchantData) {
        this.optionalMerchantData = optionalMerchantData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusByOptionalMerchantDataRequestV7)) return false;
        StatusByOptionalMerchantDataRequestV7 other = (StatusByOptionalMerchantDataRequestV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.merchantId == other.getMerchantId() &&
            ((this.optionalMerchantData==null && other.getOptionalMerchantData()==null) || 
             (this.optionalMerchantData!=null &&
              this.optionalMerchantData.equals(other.getOptionalMerchantData())));
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
        _hashCode += getMerchantId();
        if (getOptionalMerchantData() != null) {
            _hashCode += getOptionalMerchantData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusByOptionalMerchantDataRequestV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusByOptionalMerchantDataRequestV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "OptionalMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
