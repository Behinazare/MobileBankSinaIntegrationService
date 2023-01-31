/**
 * SayadChequeRejectTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeRejectTransferRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String description;

    private java.lang.String destinationIban;

    private java.lang.String sayadId;

    private java.lang.String[] signers;

    public SayadChequeRejectTransferRequestBean() {
    }

    public SayadChequeRejectTransferRequestBean(
           java.lang.String cif,
           java.lang.String description,
           java.lang.String destinationIban,
           java.lang.String sayadId,
           java.lang.String[] signers) {
           this.cif = cif;
           this.description = description;
           this.destinationIban = destinationIban;
           this.sayadId = sayadId;
           this.signers = signers;
    }


    /**
     * Gets the cif value for this SayadChequeRejectTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this SayadChequeRejectTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the description value for this SayadChequeRejectTransferRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SayadChequeRejectTransferRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destinationIban value for this SayadChequeRejectTransferRequestBean.
     * 
     * @return destinationIban
     */
    public java.lang.String getDestinationIban() {
        return destinationIban;
    }


    /**
     * Sets the destinationIban value for this SayadChequeRejectTransferRequestBean.
     * 
     * @param destinationIban
     */
    public void setDestinationIban(java.lang.String destinationIban) {
        this.destinationIban = destinationIban;
    }


    /**
     * Gets the sayadId value for this SayadChequeRejectTransferRequestBean.
     * 
     * @return sayadId
     */
    public java.lang.String getSayadId() {
        return sayadId;
    }


    /**
     * Sets the sayadId value for this SayadChequeRejectTransferRequestBean.
     * 
     * @param sayadId
     */
    public void setSayadId(java.lang.String sayadId) {
        this.sayadId = sayadId;
    }


    /**
     * Gets the signers value for this SayadChequeRejectTransferRequestBean.
     * 
     * @return signers
     */
    public java.lang.String[] getSigners() {
        return signers;
    }


    /**
     * Sets the signers value for this SayadChequeRejectTransferRequestBean.
     * 
     * @param signers
     */
    public void setSigners(java.lang.String[] signers) {
        this.signers = signers;
    }

    public java.lang.String getSigners(int i) {
        return this.signers[i];
    }

    public void setSigners(int i, java.lang.String _value) {
        this.signers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SayadChequeRejectTransferRequestBean)) return false;
        SayadChequeRejectTransferRequestBean other = (SayadChequeRejectTransferRequestBean) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.destinationIban==null && other.getDestinationIban()==null) || 
             (this.destinationIban!=null &&
              this.destinationIban.equals(other.getDestinationIban()))) &&
            ((this.sayadId==null && other.getSayadId()==null) || 
             (this.sayadId!=null &&
              this.sayadId.equals(other.getSayadId()))) &&
            ((this.signers==null && other.getSigners()==null) || 
             (this.signers!=null &&
              java.util.Arrays.equals(this.signers, other.getSigners())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDestinationIban() != null) {
            _hashCode += getDestinationIban().hashCode();
        }
        if (getSayadId() != null) {
            _hashCode += getSayadId().hashCode();
        }
        if (getSigners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSigners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSigners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SayadChequeRejectTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeRejectTransferRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationIban"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
