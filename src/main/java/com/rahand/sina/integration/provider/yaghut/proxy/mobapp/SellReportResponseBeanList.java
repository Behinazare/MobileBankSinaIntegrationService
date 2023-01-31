/**
 * SellReportResponseBeanList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SellReportResponseBeanList  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportResponseResultBean[] sellReportResponseResult;

    private java.lang.Long totalRecord;

    public SellReportResponseBeanList() {
    }

    public SellReportResponseBeanList(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportResponseResultBean[] sellReportResponseResult,
           java.lang.Long totalRecord) {
           this.sellReportResponseResult = sellReportResponseResult;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the sellReportResponseResult value for this SellReportResponseBeanList.
     * 
     * @return sellReportResponseResult
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportResponseResultBean[] getSellReportResponseResult() {
        return sellReportResponseResult;
    }


    /**
     * Sets the sellReportResponseResult value for this SellReportResponseBeanList.
     * 
     * @param sellReportResponseResult
     */
    public void setSellReportResponseResult(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportResponseResultBean[] sellReportResponseResult) {
        this.sellReportResponseResult = sellReportResponseResult;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportResponseResultBean getSellReportResponseResult(int i) {
        return this.sellReportResponseResult[i];
    }

    public void setSellReportResponseResult(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportResponseResultBean _value) {
        this.sellReportResponseResult[i] = _value;
    }


    /**
     * Gets the totalRecord value for this SellReportResponseBeanList.
     * 
     * @return totalRecord
     */
    public java.lang.Long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this SellReportResponseBeanList.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellReportResponseBeanList)) return false;
        SellReportResponseBeanList other = (SellReportResponseBeanList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellReportResponseResult==null && other.getSellReportResponseResult()==null) || 
             (this.sellReportResponseResult!=null &&
              java.util.Arrays.equals(this.sellReportResponseResult, other.getSellReportResponseResult()))) &&
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
        if (getSellReportResponseResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellReportResponseResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellReportResponseResult(), i);
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
        new org.apache.axis.description.TypeDesc(SellReportResponseBeanList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellReportResponseBeanList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellReportResponseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sellReportResponseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellReportResponseResultBean"));
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
