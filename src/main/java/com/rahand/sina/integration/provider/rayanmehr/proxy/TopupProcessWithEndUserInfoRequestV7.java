/**
 * TopupProcessWithEndUserInfoRequestV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class TopupProcessWithEndUserInfoRequestV7  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.rayanmehr.proxy.EndUser endUser;

    private int merchantId;

    private long transactionId;

    public TopupProcessWithEndUserInfoRequestV7() {
    }

    public TopupProcessWithEndUserInfoRequestV7(
           com.rahand.sina.integration.provider.rayanmehr.proxy.EndUser endUser,
           int merchantId,
           long transactionId) {
           this.endUser = endUser;
           this.merchantId = merchantId;
           this.transactionId = transactionId;
    }


    /**
     * Gets the endUser value for this TopupProcessWithEndUserInfoRequestV7.
     * 
     * @return endUser
     */
    public com.rahand.sina.integration.provider.rayanmehr.proxy.EndUser getEndUser() {
        return endUser;
    }


    /**
     * Sets the endUser value for this TopupProcessWithEndUserInfoRequestV7.
     * 
     * @param endUser
     */
    public void setEndUser(com.rahand.sina.integration.provider.rayanmehr.proxy.EndUser endUser) {
        this.endUser = endUser;
    }


    /**
     * Gets the merchantId value for this TopupProcessWithEndUserInfoRequestV7.
     * 
     * @return merchantId
     */
    public int getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this TopupProcessWithEndUserInfoRequestV7.
     * 
     * @param merchantId
     */
    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the transactionId value for this TopupProcessWithEndUserInfoRequestV7.
     * 
     * @return transactionId
     */
    public long getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TopupProcessWithEndUserInfoRequestV7.
     * 
     * @param transactionId
     */
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopupProcessWithEndUserInfoRequestV7)) return false;
        TopupProcessWithEndUserInfoRequestV7 other = (TopupProcessWithEndUserInfoRequestV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endUser==null && other.getEndUser()==null) || 
             (this.endUser!=null &&
              this.endUser.equals(other.getEndUser()))) &&
            this.merchantId == other.getMerchantId() &&
            this.transactionId == other.getTransactionId();
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
        if (getEndUser() != null) {
            _hashCode += getEndUser().hashCode();
        }
        _hashCode += getMerchantId();
        _hashCode += new Long(getTransactionId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopupProcessWithEndUserInfoRequestV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupProcessWithEndUserInfoRequestV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "EndUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "EndUser"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TransactionId"));
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
