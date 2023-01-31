/**
 * KartablSearchResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablSearchResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablBaseBean[] kartablBeans;

    private long totalRecords;

    public KartablSearchResponseBean() {
    }

    public KartablSearchResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablBaseBean[] kartablBeans,
           long totalRecords) {
           this.kartablBeans = kartablBeans;
           this.totalRecords = totalRecords;
    }


    /**
     * Gets the kartablBeans value for this KartablSearchResponseBean.
     * 
     * @return kartablBeans
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablBaseBean[] getKartablBeans() {
        return kartablBeans;
    }


    /**
     * Sets the kartablBeans value for this KartablSearchResponseBean.
     * 
     * @param kartablBeans
     */
    public void setKartablBeans(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablBaseBean[] kartablBeans) {
        this.kartablBeans = kartablBeans;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablBaseBean getKartablBeans(int i) {
        return this.kartablBeans[i];
    }

    public void setKartablBeans(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablBaseBean _value) {
        this.kartablBeans[i] = _value;
    }


    /**
     * Gets the totalRecords value for this KartablSearchResponseBean.
     * 
     * @return totalRecords
     */
    public long getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this KartablSearchResponseBean.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablSearchResponseBean)) return false;
        KartablSearchResponseBean other = (KartablSearchResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kartablBeans==null && other.getKartablBeans()==null) || 
             (this.kartablBeans!=null &&
              java.util.Arrays.equals(this.kartablBeans, other.getKartablBeans()))) &&
            this.totalRecords == other.getTotalRecords();
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
        if (getKartablBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKartablBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKartablBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecords()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablSearchResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablSearchResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartablBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kartablBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablBaseBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecords"));
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
