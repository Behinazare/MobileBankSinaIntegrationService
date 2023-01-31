/**
 * CardSummaryResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardSummaryResponseBean  implements java.io.Serializable {
    private java.lang.String cardPan;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardState cardState;

    private java.lang.String cif;

    private java.lang.String depositNumber;

    private java.lang.String iban;

    public CardSummaryResponseBean() {
    }

    public CardSummaryResponseBean(
           java.lang.String cardPan,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardState cardState,
           java.lang.String cif,
           java.lang.String depositNumber,
           java.lang.String iban) {
           this.cardPan = cardPan;
           this.cardState = cardState;
           this.cif = cif;
           this.depositNumber = depositNumber;
           this.iban = iban;
    }


    /**
     * Gets the cardPan value for this CardSummaryResponseBean.
     * 
     * @return cardPan
     */
    public java.lang.String getCardPan() {
        return cardPan;
    }


    /**
     * Sets the cardPan value for this CardSummaryResponseBean.
     * 
     * @param cardPan
     */
    public void setCardPan(java.lang.String cardPan) {
        this.cardPan = cardPan;
    }


    /**
     * Gets the cardState value for this CardSummaryResponseBean.
     * 
     * @return cardState
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardState getCardState() {
        return cardState;
    }


    /**
     * Sets the cardState value for this CardSummaryResponseBean.
     * 
     * @param cardState
     */
    public void setCardState(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardState cardState) {
        this.cardState = cardState;
    }


    /**
     * Gets the cif value for this CardSummaryResponseBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this CardSummaryResponseBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this CardSummaryResponseBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this CardSummaryResponseBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the iban value for this CardSummaryResponseBean.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this CardSummaryResponseBean.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardSummaryResponseBean)) return false;
        CardSummaryResponseBean other = (CardSummaryResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardPan==null && other.getCardPan()==null) || 
             (this.cardPan!=null &&
              this.cardPan.equals(other.getCardPan()))) &&
            ((this.cardState==null && other.getCardState()==null) || 
             (this.cardState!=null &&
              this.cardState.equals(other.getCardState()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban())));
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
        if (getCardPan() != null) {
            _hashCode += getCardPan().hashCode();
        }
        if (getCardState() != null) {
            _hashCode += getCardState().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardSummaryResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardSummaryResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardState"));
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
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
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
