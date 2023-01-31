/**
 * CardPurchaseResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardPurchaseResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean availableBalance;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean ledgerBalance;

    private java.lang.String referenceNumber;

    private java.lang.String switchResponseRRN;

    public CardPurchaseResponseBean() {
    }

    public CardPurchaseResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean availableBalance,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean ledgerBalance,
           java.lang.String referenceNumber,
           java.lang.String switchResponseRRN) {
           this.availableBalance = availableBalance;
           this.ledgerBalance = ledgerBalance;
           this.referenceNumber = referenceNumber;
           this.switchResponseRRN = switchResponseRRN;
    }


    /**
     * Gets the availableBalance value for this CardPurchaseResponseBean.
     * 
     * @return availableBalance
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean getAvailableBalance() {
        return availableBalance;
    }


    /**
     * Sets the availableBalance value for this CardPurchaseResponseBean.
     * 
     * @param availableBalance
     */
    public void setAvailableBalance(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean availableBalance) {
        this.availableBalance = availableBalance;
    }


    /**
     * Gets the ledgerBalance value for this CardPurchaseResponseBean.
     * 
     * @return ledgerBalance
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean getLedgerBalance() {
        return ledgerBalance;
    }


    /**
     * Sets the ledgerBalance value for this CardPurchaseResponseBean.
     * 
     * @param ledgerBalance
     */
    public void setLedgerBalance(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AmountBean ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }


    /**
     * Gets the referenceNumber value for this CardPurchaseResponseBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this CardPurchaseResponseBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the switchResponseRRN value for this CardPurchaseResponseBean.
     * 
     * @return switchResponseRRN
     */
    public java.lang.String getSwitchResponseRRN() {
        return switchResponseRRN;
    }


    /**
     * Sets the switchResponseRRN value for this CardPurchaseResponseBean.
     * 
     * @param switchResponseRRN
     */
    public void setSwitchResponseRRN(java.lang.String switchResponseRRN) {
        this.switchResponseRRN = switchResponseRRN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardPurchaseResponseBean)) return false;
        CardPurchaseResponseBean other = (CardPurchaseResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableBalance==null && other.getAvailableBalance()==null) || 
             (this.availableBalance!=null &&
              this.availableBalance.equals(other.getAvailableBalance()))) &&
            ((this.ledgerBalance==null && other.getLedgerBalance()==null) || 
             (this.ledgerBalance!=null &&
              this.ledgerBalance.equals(other.getLedgerBalance()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.switchResponseRRN==null && other.getSwitchResponseRRN()==null) || 
             (this.switchResponseRRN!=null &&
              this.switchResponseRRN.equals(other.getSwitchResponseRRN())));
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
        if (getAvailableBalance() != null) {
            _hashCode += getAvailableBalance().hashCode();
        }
        if (getLedgerBalance() != null) {
            _hashCode += getLedgerBalance().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getSwitchResponseRRN() != null) {
            _hashCode += getSwitchResponseRRN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardPurchaseResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardPurchaseResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "amountBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ledgerBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ledgerBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "amountBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchResponseRRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchResponseRRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
