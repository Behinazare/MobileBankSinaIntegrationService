/**
 * RtgsTransferDetailResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class RtgsTransferDetailResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatusBean[] statusDtos;

    private java.lang.Long totalRecord;

    public RtgsTransferDetailResponseBean() {
    }

    public RtgsTransferDetailResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatusBean[] statusDtos,
           java.lang.Long totalRecord) {
           this.statusDtos = statusDtos;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the statusDtos value for this RtgsTransferDetailResponseBean.
     * 
     * @return statusDtos
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatusBean[] getStatusDtos() {
        return statusDtos;
    }


    /**
     * Sets the statusDtos value for this RtgsTransferDetailResponseBean.
     * 
     * @param statusDtos
     */
    public void setStatusDtos(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatusBean[] statusDtos) {
        this.statusDtos = statusDtos;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatusBean getStatusDtos(int i) {
        return this.statusDtos[i];
    }

    public void setStatusDtos(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatusBean _value) {
        this.statusDtos[i] = _value;
    }


    /**
     * Gets the totalRecord value for this RtgsTransferDetailResponseBean.
     * 
     * @return totalRecord
     */
    public java.lang.Long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this RtgsTransferDetailResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtgsTransferDetailResponseBean)) return false;
        RtgsTransferDetailResponseBean other = (RtgsTransferDetailResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusDtos==null && other.getStatusDtos()==null) || 
             (this.statusDtos!=null &&
              java.util.Arrays.equals(this.statusDtos, other.getStatusDtos()))) &&
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
        if (getStatusDtos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusDtos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusDtos(), i);
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
        new org.apache.axis.description.TypeDesc(RtgsTransferDetailResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "rtgsTransferDetailResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDtos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusDtos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "statusBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
