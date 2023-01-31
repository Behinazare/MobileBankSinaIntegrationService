/**
 * CardPurchaseRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardPurchaseRequestBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.MerchantInfoSearchRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams;

    private java.lang.String invoiceNumber;

    private java.lang.String pan;

    public CardPurchaseRequestBean() {
    }

    public CardPurchaseRequestBean(
           java.math.BigDecimal amount,
           java.lang.String merchantId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams,
           java.lang.String invoiceNumber,
           java.lang.String pan) {
        super(
            amount,
            merchantId);
        this.cardAuthorizeParams = cardAuthorizeParams;
        this.invoiceNumber = invoiceNumber;
        this.pan = pan;
    }


    /**
     * Gets the cardAuthorizeParams value for this CardPurchaseRequestBean.
     * 
     * @return cardAuthorizeParams
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean getCardAuthorizeParams() {
        return cardAuthorizeParams;
    }


    /**
     * Sets the cardAuthorizeParams value for this CardPurchaseRequestBean.
     * 
     * @param cardAuthorizeParams
     */
    public void setCardAuthorizeParams(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams) {
        this.cardAuthorizeParams = cardAuthorizeParams;
    }


    /**
     * Gets the invoiceNumber value for this CardPurchaseRequestBean.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this CardPurchaseRequestBean.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the pan value for this CardPurchaseRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardPurchaseRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardPurchaseRequestBean)) return false;
        CardPurchaseRequestBean other = (CardPurchaseRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardAuthorizeParams==null && other.getCardAuthorizeParams()==null) || 
             (this.cardAuthorizeParams!=null &&
              this.cardAuthorizeParams.equals(other.getCardAuthorizeParams()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
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
        int _hashCode = super.hashCode();
        if (getCardAuthorizeParams() != null) {
            _hashCode += getCardAuthorizeParams().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardPurchaseRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardPurchaseRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAuthorizeParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardAuthorizeParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardAuthorizeParamsBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
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
