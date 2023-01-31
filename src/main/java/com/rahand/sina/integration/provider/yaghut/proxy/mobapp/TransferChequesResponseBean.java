/**
 * TransferChequesResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransferChequesResponseBean  implements java.io.Serializable {
    private java.lang.Integer totalRecord;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeBean[] transferChequesDtos;

    public TransferChequesResponseBean() {
    }

    public TransferChequesResponseBean(
           java.lang.Integer totalRecord,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeBean[] transferChequesDtos) {
           this.totalRecord = totalRecord;
           this.transferChequesDtos = transferChequesDtos;
    }


    /**
     * Gets the totalRecord value for this TransferChequesResponseBean.
     * 
     * @return totalRecord
     */
    public java.lang.Integer getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this TransferChequesResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Integer totalRecord) {
        this.totalRecord = totalRecord;
    }


    /**
     * Gets the transferChequesDtos value for this TransferChequesResponseBean.
     * 
     * @return transferChequesDtos
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeBean[] getTransferChequesDtos() {
        return transferChequesDtos;
    }


    /**
     * Sets the transferChequesDtos value for this TransferChequesResponseBean.
     * 
     * @param transferChequesDtos
     */
    public void setTransferChequesDtos(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeBean[] transferChequesDtos) {
        this.transferChequesDtos = transferChequesDtos;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeBean getTransferChequesDtos(int i) {
        return this.transferChequesDtos[i];
    }

    public void setTransferChequesDtos(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeBean _value) {
        this.transferChequesDtos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferChequesResponseBean)) return false;
        TransferChequesResponseBean other = (TransferChequesResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalRecord==null && other.getTotalRecord()==null) || 
             (this.totalRecord!=null &&
              this.totalRecord.equals(other.getTotalRecord()))) &&
            ((this.transferChequesDtos==null && other.getTransferChequesDtos()==null) || 
             (this.transferChequesDtos!=null &&
              java.util.Arrays.equals(this.transferChequesDtos, other.getTransferChequesDtos())));
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
        if (getTotalRecord() != null) {
            _hashCode += getTotalRecord().hashCode();
        }
        if (getTransferChequesDtos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferChequesDtos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferChequesDtos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferChequesResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferChequesResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferChequesDtos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferChequesDtos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferChequeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
