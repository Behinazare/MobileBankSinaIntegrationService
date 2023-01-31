/**
 * SayadChequeAcceptanceRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeAcceptanceRequestBean  implements java.io.Serializable {
    private boolean accept;

    private java.lang.String acceptorAgentNationalCode;

    private java.lang.String cif;

    private java.lang.String description;

    private java.lang.String sayadId;

    public SayadChequeAcceptanceRequestBean() {
    }

    public SayadChequeAcceptanceRequestBean(
           boolean accept,
           java.lang.String acceptorAgentNationalCode,
           java.lang.String cif,
           java.lang.String description,
           java.lang.String sayadId) {
           this.accept = accept;
           this.acceptorAgentNationalCode = acceptorAgentNationalCode;
           this.cif = cif;
           this.description = description;
           this.sayadId = sayadId;
    }


    /**
     * Gets the accept value for this SayadChequeAcceptanceRequestBean.
     * 
     * @return accept
     */
    public boolean isAccept() {
        return accept;
    }


    /**
     * Sets the accept value for this SayadChequeAcceptanceRequestBean.
     * 
     * @param accept
     */
    public void setAccept(boolean accept) {
        this.accept = accept;
    }


    /**
     * Gets the acceptorAgentNationalCode value for this SayadChequeAcceptanceRequestBean.
     * 
     * @return acceptorAgentNationalCode
     */
    public java.lang.String getAcceptorAgentNationalCode() {
        return acceptorAgentNationalCode;
    }


    /**
     * Sets the acceptorAgentNationalCode value for this SayadChequeAcceptanceRequestBean.
     * 
     * @param acceptorAgentNationalCode
     */
    public void setAcceptorAgentNationalCode(java.lang.String acceptorAgentNationalCode) {
        this.acceptorAgentNationalCode = acceptorAgentNationalCode;
    }


    /**
     * Gets the cif value for this SayadChequeAcceptanceRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this SayadChequeAcceptanceRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the description value for this SayadChequeAcceptanceRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SayadChequeAcceptanceRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the sayadId value for this SayadChequeAcceptanceRequestBean.
     * 
     * @return sayadId
     */
    public java.lang.String getSayadId() {
        return sayadId;
    }


    /**
     * Sets the sayadId value for this SayadChequeAcceptanceRequestBean.
     * 
     * @param sayadId
     */
    public void setSayadId(java.lang.String sayadId) {
        this.sayadId = sayadId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SayadChequeAcceptanceRequestBean)) return false;
        SayadChequeAcceptanceRequestBean other = (SayadChequeAcceptanceRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accept == other.isAccept() &&
            ((this.acceptorAgentNationalCode==null && other.getAcceptorAgentNationalCode()==null) || 
             (this.acceptorAgentNationalCode!=null &&
              this.acceptorAgentNationalCode.equals(other.getAcceptorAgentNationalCode()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.sayadId==null && other.getSayadId()==null) || 
             (this.sayadId!=null &&
              this.sayadId.equals(other.getSayadId())));
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
        _hashCode += (isAccept() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAcceptorAgentNationalCode() != null) {
            _hashCode += getAcceptorAgentNationalCode().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSayadId() != null) {
            _hashCode += getSayadId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SayadChequeAcceptanceRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeAcceptanceRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptorAgentNationalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acceptorAgentNationalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sayadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sayadId"));
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
