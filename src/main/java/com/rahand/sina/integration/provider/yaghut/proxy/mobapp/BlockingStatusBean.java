/**
 * BlockingStatusBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BlockingStatusBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockingStatusWS blockingStatus;

    private java.lang.String chequeNumber;

    public BlockingStatusBean() {
    }

    public BlockingStatusBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockingStatusWS blockingStatus,
           java.lang.String chequeNumber) {
           this.blockingStatus = blockingStatus;
           this.chequeNumber = chequeNumber;
    }


    /**
     * Gets the blockingStatus value for this BlockingStatusBean.
     * 
     * @return blockingStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockingStatusWS getBlockingStatus() {
        return blockingStatus;
    }


    /**
     * Sets the blockingStatus value for this BlockingStatusBean.
     * 
     * @param blockingStatus
     */
    public void setBlockingStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockingStatusWS blockingStatus) {
        this.blockingStatus = blockingStatus;
    }


    /**
     * Gets the chequeNumber value for this BlockingStatusBean.
     * 
     * @return chequeNumber
     */
    public java.lang.String getChequeNumber() {
        return chequeNumber;
    }


    /**
     * Sets the chequeNumber value for this BlockingStatusBean.
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(java.lang.String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlockingStatusBean)) return false;
        BlockingStatusBean other = (BlockingStatusBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blockingStatus==null && other.getBlockingStatus()==null) || 
             (this.blockingStatus!=null &&
              this.blockingStatus.equals(other.getBlockingStatus()))) &&
            ((this.chequeNumber==null && other.getChequeNumber()==null) || 
             (this.chequeNumber!=null &&
              this.chequeNumber.equals(other.getChequeNumber())));
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
        if (getBlockingStatus() != null) {
            _hashCode += getBlockingStatus().hashCode();
        }
        if (getChequeNumber() != null) {
            _hashCode += getChequeNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BlockingStatusBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "blockingStatusBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "blockingStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeNumber"));
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
