/**
 * ReplicateCardRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ReplicateCardRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String previousPan;

    public ReplicateCardRequestBean() {
    }

    public ReplicateCardRequestBean(
           java.lang.String cif,
           java.lang.String previousPan) {
           this.cif = cif;
           this.previousPan = previousPan;
    }


    /**
     * Gets the cif value for this ReplicateCardRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this ReplicateCardRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the previousPan value for this ReplicateCardRequestBean.
     * 
     * @return previousPan
     */
    public java.lang.String getPreviousPan() {
        return previousPan;
    }


    /**
     * Sets the previousPan value for this ReplicateCardRequestBean.
     * 
     * @param previousPan
     */
    public void setPreviousPan(java.lang.String previousPan) {
        this.previousPan = previousPan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplicateCardRequestBean)) return false;
        ReplicateCardRequestBean other = (ReplicateCardRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.previousPan==null && other.getPreviousPan()==null) || 
             (this.previousPan!=null &&
              this.previousPan.equals(other.getPreviousPan())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getPreviousPan() != null) {
            _hashCode += getPreviousPan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReplicateCardRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "replicateCardRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousPan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "previousPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
