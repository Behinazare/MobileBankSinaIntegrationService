/**
 * InstitutionsResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InstitutionsResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstitutionBean[] institutions;

    private long totalRecord;

    public InstitutionsResponseBean() {
    }

    public InstitutionsResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstitutionBean[] institutions,
           long totalRecord) {
           this.institutions = institutions;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the institutions value for this InstitutionsResponseBean.
     * 
     * @return institutions
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstitutionBean[] getInstitutions() {
        return institutions;
    }


    /**
     * Sets the institutions value for this InstitutionsResponseBean.
     * 
     * @param institutions
     */
    public void setInstitutions(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstitutionBean[] institutions) {
        this.institutions = institutions;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstitutionBean getInstitutions(int i) {
        return this.institutions[i];
    }

    public void setInstitutions(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InstitutionBean _value) {
        this.institutions[i] = _value;
    }


    /**
     * Gets the totalRecord value for this InstitutionsResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this InstitutionsResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstitutionsResponseBean)) return false;
        InstitutionsResponseBean other = (InstitutionsResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.institutions==null && other.getInstitutions()==null) || 
             (this.institutions!=null &&
              java.util.Arrays.equals(this.institutions, other.getInstitutions()))) &&
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
        if (getInstitutions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstitutions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstitutions(), i);
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
        new org.apache.axis.description.TypeDesc(InstitutionsResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "institutionsResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institutions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "institutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "institutionBean"));
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
