/**
 * ChequeSheetsResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChequeSheetsResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeSheetBean[] chequeSheetBeans;

    private long totalRecord;

    public ChequeSheetsResponseBean() {
    }

    public ChequeSheetsResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeSheetBean[] chequeSheetBeans,
           long totalRecord) {
           this.chequeSheetBeans = chequeSheetBeans;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the chequeSheetBeans value for this ChequeSheetsResponseBean.
     * 
     * @return chequeSheetBeans
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeSheetBean[] getChequeSheetBeans() {
        return chequeSheetBeans;
    }


    /**
     * Sets the chequeSheetBeans value for this ChequeSheetsResponseBean.
     * 
     * @param chequeSheetBeans
     */
    public void setChequeSheetBeans(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeSheetBean[] chequeSheetBeans) {
        this.chequeSheetBeans = chequeSheetBeans;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeSheetBean getChequeSheetBeans(int i) {
        return this.chequeSheetBeans[i];
    }

    public void setChequeSheetBeans(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeSheetBean _value) {
        this.chequeSheetBeans[i] = _value;
    }


    /**
     * Gets the totalRecord value for this ChequeSheetsResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this ChequeSheetsResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChequeSheetsResponseBean)) return false;
        ChequeSheetsResponseBean other = (ChequeSheetsResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chequeSheetBeans==null && other.getChequeSheetBeans()==null) || 
             (this.chequeSheetBeans!=null &&
              java.util.Arrays.equals(this.chequeSheetBeans, other.getChequeSheetBeans()))) &&
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
        if (getChequeSheetBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChequeSheetBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChequeSheetBeans(), i);
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
        new org.apache.axis.description.TypeDesc(ChequeSheetsResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeSheetsResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeSheetBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeSheetBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeSheetBean"));
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
