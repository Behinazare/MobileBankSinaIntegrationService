/**
 * CardsSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardsSearchRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS[] cardEPaymentDescriptiveStatuses;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus cardStatus;

    private java.lang.String cif;

    private java.lang.String depositNumber;

    private java.lang.Boolean formattedDepositNumber;

    private java.lang.Long length;

    private java.lang.Long offset;

    private java.lang.String pan;

    public CardsSearchRequestBean() {
    }

    public CardsSearchRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS[] cardEPaymentDescriptiveStatuses,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus cardStatus,
           java.lang.String cif,
           java.lang.String depositNumber,
           java.lang.Boolean formattedDepositNumber,
           java.lang.Long length,
           java.lang.Long offset,
           java.lang.String pan) {
           this.cardEPaymentDescriptiveStatuses = cardEPaymentDescriptiveStatuses;
           this.cardStatus = cardStatus;
           this.cif = cif;
           this.depositNumber = depositNumber;
           this.formattedDepositNumber = formattedDepositNumber;
           this.length = length;
           this.offset = offset;
           this.pan = pan;
    }


    /**
     * Gets the cardEPaymentDescriptiveStatuses value for this CardsSearchRequestBean.
     * 
     * @return cardEPaymentDescriptiveStatuses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS[] getCardEPaymentDescriptiveStatuses() {
        return cardEPaymentDescriptiveStatuses;
    }


    /**
     * Sets the cardEPaymentDescriptiveStatuses value for this CardsSearchRequestBean.
     * 
     * @param cardEPaymentDescriptiveStatuses
     */
    public void setCardEPaymentDescriptiveStatuses(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS[] cardEPaymentDescriptiveStatuses) {
        this.cardEPaymentDescriptiveStatuses = cardEPaymentDescriptiveStatuses;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS getCardEPaymentDescriptiveStatuses(int i) {
        return this.cardEPaymentDescriptiveStatuses[i];
    }

    public void setCardEPaymentDescriptiveStatuses(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveStatusWS _value) {
        this.cardEPaymentDescriptiveStatuses[i] = _value;
    }


    /**
     * Gets the cardStatus value for this CardsSearchRequestBean.
     * 
     * @return cardStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this CardsSearchRequestBean.
     * 
     * @param cardStatus
     */
    public void setCardStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the cif value for this CardsSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this CardsSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this CardsSearchRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this CardsSearchRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the formattedDepositNumber value for this CardsSearchRequestBean.
     * 
     * @return formattedDepositNumber
     */
    public java.lang.Boolean getFormattedDepositNumber() {
        return formattedDepositNumber;
    }


    /**
     * Sets the formattedDepositNumber value for this CardsSearchRequestBean.
     * 
     * @param formattedDepositNumber
     */
    public void setFormattedDepositNumber(java.lang.Boolean formattedDepositNumber) {
        this.formattedDepositNumber = formattedDepositNumber;
    }


    /**
     * Gets the length value for this CardsSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this CardsSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this CardsSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this CardsSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the pan value for this CardsSearchRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardsSearchRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardsSearchRequestBean)) return false;
        CardsSearchRequestBean other = (CardsSearchRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardEPaymentDescriptiveStatuses==null && other.getCardEPaymentDescriptiveStatuses()==null) || 
             (this.cardEPaymentDescriptiveStatuses!=null &&
              java.util.Arrays.equals(this.cardEPaymentDescriptiveStatuses, other.getCardEPaymentDescriptiveStatuses()))) &&
            ((this.cardStatus==null && other.getCardStatus()==null) || 
             (this.cardStatus!=null &&
              this.cardStatus.equals(other.getCardStatus()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.formattedDepositNumber==null && other.getFormattedDepositNumber()==null) || 
             (this.formattedDepositNumber!=null &&
              this.formattedDepositNumber.equals(other.getFormattedDepositNumber()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan())));
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
        if (getCardEPaymentDescriptiveStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardEPaymentDescriptiveStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardEPaymentDescriptiveStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCardStatus() != null) {
            _hashCode += getCardStatus().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getFormattedDepositNumber() != null) {
            _hashCode += getFormattedDepositNumber().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardsSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardsSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardEPaymentDescriptiveStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardEPaymentDescriptiveStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardEPaymentDescriptiveStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardStatus"));
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
        elemField.setFieldName("formattedDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formattedDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
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
