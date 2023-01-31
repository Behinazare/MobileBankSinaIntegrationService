/**
 * CreditDossierResponseBeans.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CreditDossierResponseBeans  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierBean[] dossiers;

    private long totalRecordCount;

    public CreditDossierResponseBeans() {
    }

    public CreditDossierResponseBeans(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierBean[] dossiers,
           long totalRecordCount) {
           this.dossiers = dossiers;
           this.totalRecordCount = totalRecordCount;
    }


    /**
     * Gets the dossiers value for this CreditDossierResponseBeans.
     * 
     * @return dossiers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierBean[] getDossiers() {
        return dossiers;
    }


    /**
     * Sets the dossiers value for this CreditDossierResponseBeans.
     * 
     * @param dossiers
     */
    public void setDossiers(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierBean[] dossiers) {
        this.dossiers = dossiers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierBean getDossiers(int i) {
        return this.dossiers[i];
    }

    public void setDossiers(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierBean _value) {
        this.dossiers[i] = _value;
    }


    /**
     * Gets the totalRecordCount value for this CreditDossierResponseBeans.
     * 
     * @return totalRecordCount
     */
    public long getTotalRecordCount() {
        return totalRecordCount;
    }


    /**
     * Sets the totalRecordCount value for this CreditDossierResponseBeans.
     * 
     * @param totalRecordCount
     */
    public void setTotalRecordCount(long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditDossierResponseBeans)) return false;
        CreditDossierResponseBeans other = (CreditDossierResponseBeans) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dossiers==null && other.getDossiers()==null) || 
             (this.dossiers!=null &&
              java.util.Arrays.equals(this.dossiers, other.getDossiers()))) &&
            this.totalRecordCount == other.getTotalRecordCount();
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
        if (getDossiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDossiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDossiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecordCount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditDossierResponseBeans.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierResponseBeans"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dossiers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dossiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecordCount"));
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
