/**
 * BlockChequeRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BlockChequeRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockedChequeReasonTypeWS blockedReason;

    private java.lang.String[] chequeNumbers;

    private java.lang.String cif;

    private java.lang.String depositNumber;

    public BlockChequeRequestBean() {
    }

    public BlockChequeRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockedChequeReasonTypeWS blockedReason,
           java.lang.String[] chequeNumbers,
           java.lang.String cif,
           java.lang.String depositNumber) {
           this.blockedReason = blockedReason;
           this.chequeNumbers = chequeNumbers;
           this.cif = cif;
           this.depositNumber = depositNumber;
    }


    /**
     * Gets the blockedReason value for this BlockChequeRequestBean.
     * 
     * @return blockedReason
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockedChequeReasonTypeWS getBlockedReason() {
        return blockedReason;
    }


    /**
     * Sets the blockedReason value for this BlockChequeRequestBean.
     * 
     * @param blockedReason
     */
    public void setBlockedReason(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BlockedChequeReasonTypeWS blockedReason) {
        this.blockedReason = blockedReason;
    }


    /**
     * Gets the chequeNumbers value for this BlockChequeRequestBean.
     * 
     * @return chequeNumbers
     */
    public java.lang.String[] getChequeNumbers() {
        return chequeNumbers;
    }


    /**
     * Sets the chequeNumbers value for this BlockChequeRequestBean.
     * 
     * @param chequeNumbers
     */
    public void setChequeNumbers(java.lang.String[] chequeNumbers) {
        this.chequeNumbers = chequeNumbers;
    }

    public java.lang.String getChequeNumbers(int i) {
        return this.chequeNumbers[i];
    }

    public void setChequeNumbers(int i, java.lang.String _value) {
        this.chequeNumbers[i] = _value;
    }


    /**
     * Gets the cif value for this BlockChequeRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this BlockChequeRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this BlockChequeRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this BlockChequeRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlockChequeRequestBean)) return false;
        BlockChequeRequestBean other = (BlockChequeRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blockedReason==null && other.getBlockedReason()==null) || 
             (this.blockedReason!=null &&
              this.blockedReason.equals(other.getBlockedReason()))) &&
            ((this.chequeNumbers==null && other.getChequeNumbers()==null) || 
             (this.chequeNumbers!=null &&
              java.util.Arrays.equals(this.chequeNumbers, other.getChequeNumbers()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber())));
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
        if (getBlockedReason() != null) {
            _hashCode += getBlockedReason().hashCode();
        }
        if (getChequeNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChequeNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChequeNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BlockChequeRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "blockChequeRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "blockedChequeReasonTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
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
