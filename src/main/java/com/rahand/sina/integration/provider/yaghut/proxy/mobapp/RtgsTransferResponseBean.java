/**
 * RtgsTransferResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class RtgsTransferResponseBean  implements java.io.Serializable {
    private java.lang.Long totalRecord;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferDetailBean[] transferDetailsDtos;

    public RtgsTransferResponseBean() {
    }

    public RtgsTransferResponseBean(
           java.lang.Long totalRecord,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferDetailBean[] transferDetailsDtos) {
           this.totalRecord = totalRecord;
           this.transferDetailsDtos = transferDetailsDtos;
    }


    /**
     * Gets the totalRecord value for this RtgsTransferResponseBean.
     * 
     * @return totalRecord
     */
    public java.lang.Long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this RtgsTransferResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Long totalRecord) {
        this.totalRecord = totalRecord;
    }


    /**
     * Gets the transferDetailsDtos value for this RtgsTransferResponseBean.
     * 
     * @return transferDetailsDtos
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferDetailBean[] getTransferDetailsDtos() {
        return transferDetailsDtos;
    }


    /**
     * Sets the transferDetailsDtos value for this RtgsTransferResponseBean.
     * 
     * @param transferDetailsDtos
     */
    public void setTransferDetailsDtos(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferDetailBean[] transferDetailsDtos) {
        this.transferDetailsDtos = transferDetailsDtos;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferDetailBean getTransferDetailsDtos(int i) {
        return this.transferDetailsDtos[i];
    }

    public void setTransferDetailsDtos(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferDetailBean _value) {
        this.transferDetailsDtos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtgsTransferResponseBean)) return false;
        RtgsTransferResponseBean other = (RtgsTransferResponseBean) obj;
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
            ((this.transferDetailsDtos==null && other.getTransferDetailsDtos()==null) || 
             (this.transferDetailsDtos!=null &&
              java.util.Arrays.equals(this.transferDetailsDtos, other.getTransferDetailsDtos())));
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
        if (getTransferDetailsDtos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferDetailsDtos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferDetailsDtos(), i);
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
        new org.apache.axis.description.TypeDesc(RtgsTransferResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rtgsTransferResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDetailsDtos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferDetailsDtos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferDetailBean"));
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
