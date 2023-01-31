/**
 * SayadChequeTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SayadChequeTransferRequestBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String description;

    private java.lang.String destinationIban;

    private java.lang.String reasonCode;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers;

    private java.lang.String sayadId;

    private java.lang.String[] signers;

    public SayadChequeTransferRequestBean() {
    }

    public SayadChequeTransferRequestBean(
           java.lang.String cif,
           java.lang.String description,
           java.lang.String destinationIban,
           java.lang.String reasonCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers,
           java.lang.String sayadId,
           java.lang.String[] signers) {
           this.cif = cif;
           this.description = description;
           this.destinationIban = destinationIban;
           this.reasonCode = reasonCode;
           this.receivers = receivers;
           this.sayadId = sayadId;
           this.signers = signers;
    }


    /**
     * Gets the cif value for this SayadChequeTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this SayadChequeTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the description value for this SayadChequeTransferRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SayadChequeTransferRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the destinationIban value for this SayadChequeTransferRequestBean.
     * 
     * @return destinationIban
     */
    public java.lang.String getDestinationIban() {
        return destinationIban;
    }


    /**
     * Sets the destinationIban value for this SayadChequeTransferRequestBean.
     * 
     * @param destinationIban
     */
    public void setDestinationIban(java.lang.String destinationIban) {
        this.destinationIban = destinationIban;
    }


    /**
     * Gets the reasonCode value for this SayadChequeTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this SayadChequeTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the receivers value for this SayadChequeTransferRequestBean.
     * 
     * @return receivers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] getReceivers() {
        return receivers;
    }


    /**
     * Sets the receivers value for this SayadChequeTransferRequestBean.
     * 
     * @param receivers
     */
    public void setReceivers(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers) {
        this.receivers = receivers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean getReceivers(int i) {
        return this.receivers[i];
    }

    public void setReceivers(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean _value) {
        this.receivers[i] = _value;
    }


    /**
     * Gets the sayadId value for this SayadChequeTransferRequestBean.
     * 
     * @return sayadId
     */
    public java.lang.String getSayadId() {
        return sayadId;
    }


    /**
     * Sets the sayadId value for this SayadChequeTransferRequestBean.
     * 
     * @param sayadId
     */
    public void setSayadId(java.lang.String sayadId) {
        this.sayadId = sayadId;
    }


    /**
     * Gets the signers value for this SayadChequeTransferRequestBean.
     * 
     * @return signers
     */
    public java.lang.String[] getSigners() {
        return signers;
    }


    /**
     * Sets the signers value for this SayadChequeTransferRequestBean.
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
        if (!(obj instanceof SayadChequeTransferRequestBean)) return false;
        SayadChequeTransferRequestBean other = (SayadChequeTransferRequestBean) obj;
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
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.receivers==null && other.getReceivers()==null) || 
             (this.receivers!=null &&
              java.util.Arrays.equals(this.receivers, other.getReceivers()))) &&
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
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReceivers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(SayadChequeTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeTransferRequestBean"));
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
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeReceiverBean"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
