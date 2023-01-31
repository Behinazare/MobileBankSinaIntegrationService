/**
 * ChequeBooksResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChequeBooksResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeBookBean[] chequeBookDtos;

    private long totalRecord;

    public ChequeBooksResponseBean() {
    }

    public ChequeBooksResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeBookBean[] chequeBookDtos,
           long totalRecord) {
           this.chequeBookDtos = chequeBookDtos;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the chequeBookDtos value for this ChequeBooksResponseBean.
     * 
     * @return chequeBookDtos
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeBookBean[] getChequeBookDtos() {
        return chequeBookDtos;
    }


    /**
     * Sets the chequeBookDtos value for this ChequeBooksResponseBean.
     * 
     * @param chequeBookDtos
     */
    public void setChequeBookDtos(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeBookBean[] chequeBookDtos) {
        this.chequeBookDtos = chequeBookDtos;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeBookBean getChequeBookDtos(int i) {
        return this.chequeBookDtos[i];
    }

    public void setChequeBookDtos(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeBookBean _value) {
        this.chequeBookDtos[i] = _value;
    }


    /**
     * Gets the totalRecord value for this ChequeBooksResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this ChequeBooksResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChequeBooksResponseBean)) return false;
        ChequeBooksResponseBean other = (ChequeBooksResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chequeBookDtos==null && other.getChequeBookDtos()==null) || 
             (this.chequeBookDtos!=null &&
              java.util.Arrays.equals(this.chequeBookDtos, other.getChequeBookDtos()))) &&
            this.totalRecord == other.getTotalRecord();
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
        if (getChequeBookDtos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChequeBookDtos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChequeBookDtos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecord()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChequeBooksResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeBooksResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeBookDtos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeBookDtos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeBookBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
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
