/**
 * SellDetailReportResponseList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SellDetailReportResponseList  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellDetailReportResponseResult[] sellDetailReportResponseResults;

    private java.lang.Long totalRecord;

    public SellDetailReportResponseList() {
    }

    public SellDetailReportResponseList(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellDetailReportResponseResult[] sellDetailReportResponseResults,
           java.lang.Long totalRecord) {
           this.sellDetailReportResponseResults = sellDetailReportResponseResults;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the sellDetailReportResponseResults value for this SellDetailReportResponseList.
     * 
     * @return sellDetailReportResponseResults
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellDetailReportResponseResult[] getSellDetailReportResponseResults() {
        return sellDetailReportResponseResults;
    }


    /**
     * Sets the sellDetailReportResponseResults value for this SellDetailReportResponseList.
     * 
     * @param sellDetailReportResponseResults
     */
    public void setSellDetailReportResponseResults(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellDetailReportResponseResult[] sellDetailReportResponseResults) {
        this.sellDetailReportResponseResults = sellDetailReportResponseResults;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellDetailReportResponseResult getSellDetailReportResponseResults(int i) {
        return this.sellDetailReportResponseResults[i];
    }

    public void setSellDetailReportResponseResults(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellDetailReportResponseResult _value) {
        this.sellDetailReportResponseResults[i] = _value;
    }


    /**
     * Gets the totalRecord value for this SellDetailReportResponseList.
     * 
     * @return totalRecord
     */
    public java.lang.Long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this SellDetailReportResponseList.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellDetailReportResponseList)) return false;
        SellDetailReportResponseList other = (SellDetailReportResponseList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellDetailReportResponseResults==null && other.getSellDetailReportResponseResults()==null) || 
             (this.sellDetailReportResponseResults!=null &&
              java.util.Arrays.equals(this.sellDetailReportResponseResults, other.getSellDetailReportResponseResults()))) &&
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
        if (getSellDetailReportResponseResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellDetailReportResponseResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellDetailReportResponseResults(), i);
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
        new org.apache.axis.description.TypeDesc(SellDetailReportResponseList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellDetailReportResponseList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellDetailReportResponseResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sellDetailReportResponseResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellDetailReportResponseResult"));
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
