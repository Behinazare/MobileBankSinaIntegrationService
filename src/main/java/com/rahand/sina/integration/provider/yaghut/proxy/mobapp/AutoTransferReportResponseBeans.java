/**
 * AutoTransferReportResponseBeans.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AutoTransferReportResponseBeans  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferBean[] autoTransferBeansList;

    private java.lang.Long totalRecord;

    public AutoTransferReportResponseBeans() {
    }

    public AutoTransferReportResponseBeans(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferBean[] autoTransferBeansList,
           java.lang.Long totalRecord) {
           this.autoTransferBeansList = autoTransferBeansList;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the autoTransferBeansList value for this AutoTransferReportResponseBeans.
     * 
     * @return autoTransferBeansList
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferBean[] getAutoTransferBeansList() {
        return autoTransferBeansList;
    }


    /**
     * Sets the autoTransferBeansList value for this AutoTransferReportResponseBeans.
     * 
     * @param autoTransferBeansList
     */
    public void setAutoTransferBeansList(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferBean[] autoTransferBeansList) {
        this.autoTransferBeansList = autoTransferBeansList;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferBean getAutoTransferBeansList(int i) {
        return this.autoTransferBeansList[i];
    }

    public void setAutoTransferBeansList(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransferBean _value) {
        this.autoTransferBeansList[i] = _value;
    }


    /**
     * Gets the totalRecord value for this AutoTransferReportResponseBeans.
     * 
     * @return totalRecord
     */
    public java.lang.Long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this AutoTransferReportResponseBeans.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTransferReportResponseBeans)) return false;
        AutoTransferReportResponseBeans other = (AutoTransferReportResponseBeans) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoTransferBeansList==null && other.getAutoTransferBeansList()==null) || 
             (this.autoTransferBeansList!=null &&
              java.util.Arrays.equals(this.autoTransferBeansList, other.getAutoTransferBeansList()))) &&
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
        if (getAutoTransferBeansList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoTransferBeansList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoTransferBeansList(), i);
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
        new org.apache.axis.description.TypeDesc(AutoTransferReportResponseBeans.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferReportResponseBeans"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTransferBeansList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTransferBeansList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferBean"));
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
