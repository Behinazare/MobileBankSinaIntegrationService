/**
 * SayadChequeTransferHolderBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeTransferHolderBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAcceptanceStatusWS acceptanceStatus;

    private java.util.Calendar lastActionDate;

    public SayadChequeTransferHolderBean() {
    }

    public SayadChequeTransferHolderBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAcceptanceStatusWS acceptanceStatus,
           java.util.Calendar lastActionDate) {
           this.acceptanceStatus = acceptanceStatus;
           this.lastActionDate = lastActionDate;
    }


    /**
     * Gets the acceptanceStatus value for this SayadChequeTransferHolderBean.
     * 
     * @return acceptanceStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAcceptanceStatusWS getAcceptanceStatus() {
        return acceptanceStatus;
    }


    /**
     * Sets the acceptanceStatus value for this SayadChequeTransferHolderBean.
     * 
     * @param acceptanceStatus
     */
    public void setAcceptanceStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAcceptanceStatusWS acceptanceStatus) {
        this.acceptanceStatus = acceptanceStatus;
    }


    /**
     * Gets the lastActionDate value for this SayadChequeTransferHolderBean.
     * 
     * @return lastActionDate
     */
    public java.util.Calendar getLastActionDate() {
        return lastActionDate;
    }


    /**
     * Sets the lastActionDate value for this SayadChequeTransferHolderBean.
     * 
     * @param lastActionDate
     */
    public void setLastActionDate(java.util.Calendar lastActionDate) {
        this.lastActionDate = lastActionDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SayadChequeTransferHolderBean)) return false;
        SayadChequeTransferHolderBean other = (SayadChequeTransferHolderBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acceptanceStatus==null && other.getAcceptanceStatus()==null) || 
             (this.acceptanceStatus!=null &&
              this.acceptanceStatus.equals(other.getAcceptanceStatus()))) &&
            ((this.lastActionDate==null && other.getLastActionDate()==null) || 
             (this.lastActionDate!=null &&
              this.lastActionDate.equals(other.getLastActionDate())));
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
        if (getAcceptanceStatus() != null) {
            _hashCode += getAcceptanceStatus().hashCode();
        }
        if (getLastActionDate() != null) {
            _hashCode += getLastActionDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SayadChequeTransferHolderBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeTransferHolderBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptanceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptanceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeAcceptanceStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastActionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
