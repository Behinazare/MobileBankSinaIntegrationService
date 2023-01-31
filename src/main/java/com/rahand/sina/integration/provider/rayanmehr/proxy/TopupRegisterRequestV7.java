/**
 * TopupRegisterRequestV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class TopupRegisterRequestV7  implements java.io.Serializable {
    private int amount;

    private int merchantId;

    private java.lang.String mobileNumber;

    private java.lang.String nationalCode;

    private java.lang.String optionalMerchantData;

    private int productId;

    private long referenceId;

    public TopupRegisterRequestV7() {
    }

    public TopupRegisterRequestV7(
           int amount,
           int merchantId,
           java.lang.String mobileNumber,
           java.lang.String nationalCode,
           java.lang.String optionalMerchantData,
           int productId,
           long referenceId) {
           this.amount = amount;
           this.merchantId = merchantId;
           this.mobileNumber = mobileNumber;
           this.nationalCode = nationalCode;
           this.optionalMerchantData = optionalMerchantData;
           this.productId = productId;
           this.referenceId = referenceId;
    }


    /**
     * Gets the amount value for this TopupRegisterRequestV7.
     * 
     * @return amount
     */
    public int getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TopupRegisterRequestV7.
     * 
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


    /**
     * Gets the merchantId value for this TopupRegisterRequestV7.
     * 
     * @return merchantId
     */
    public int getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this TopupRegisterRequestV7.
     * 
     * @param merchantId
     */
    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the mobileNumber value for this TopupRegisterRequestV7.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this TopupRegisterRequestV7.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the nationalCode value for this TopupRegisterRequestV7.
     * 
     * @return nationalCode
     */
    public java.lang.String getNationalCode() {
        return nationalCode;
    }


    /**
     * Sets the nationalCode value for this TopupRegisterRequestV7.
     * 
     * @param nationalCode
     */
    public void setNationalCode(java.lang.String nationalCode) {
        this.nationalCode = nationalCode;
    }


    /**
     * Gets the optionalMerchantData value for this TopupRegisterRequestV7.
     * 
     * @return optionalMerchantData
     */
    public java.lang.String getOptionalMerchantData() {
        return optionalMerchantData;
    }


    /**
     * Sets the optionalMerchantData value for this TopupRegisterRequestV7.
     * 
     * @param optionalMerchantData
     */
    public void setOptionalMerchantData(java.lang.String optionalMerchantData) {
        this.optionalMerchantData = optionalMerchantData;
    }


    /**
     * Gets the productId value for this TopupRegisterRequestV7.
     * 
     * @return productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this TopupRegisterRequestV7.
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * Gets the referenceId value for this TopupRegisterRequestV7.
     * 
     * @return referenceId
     */
    public long getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this TopupRegisterRequestV7.
     * 
     * @param referenceId
     */
    public void setReferenceId(long referenceId) {
        this.referenceId = referenceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopupRegisterRequestV7)) return false;
        TopupRegisterRequestV7 other = (TopupRegisterRequestV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            this.merchantId == other.getMerchantId() &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.nationalCode==null && other.getNationalCode()==null) || 
             (this.nationalCode!=null &&
              this.nationalCode.equals(other.getNationalCode()))) &&
            ((this.optionalMerchantData==null && other.getOptionalMerchantData()==null) || 
             (this.optionalMerchantData!=null &&
              this.optionalMerchantData.equals(other.getOptionalMerchantData()))) &&
            this.productId == other.getProductId() &&
            this.referenceId == other.getReferenceId();
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
        _hashCode += getAmount();
        _hashCode += getMerchantId();
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getNationalCode() != null) {
            _hashCode += getNationalCode().hashCode();
        }
        if (getOptionalMerchantData() != null) {
            _hashCode += getOptionalMerchantData().hashCode();
        }
        _hashCode += getProductId();
        _hashCode += new Long(getReferenceId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopupRegisterRequestV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupRegisterRequestV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "MobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "NationalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalMerchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "OptionalMerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
