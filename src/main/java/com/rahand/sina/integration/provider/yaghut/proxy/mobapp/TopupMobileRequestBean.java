/**
 * TopupMobileRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TopupMobileRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams;

    private java.lang.String merchantId;

    private java.lang.String mobileNumber;

    private java.lang.String pan;

    public TopupMobileRequestBean() {
    }

    public TopupMobileRequestBean(
           java.math.BigDecimal amount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams,
           java.lang.String merchantId,
           java.lang.String mobileNumber,
           java.lang.String pan) {
           this.amount = amount;
           this.cardAuthorizeParams = cardAuthorizeParams;
           this.merchantId = merchantId;
           this.mobileNumber = mobileNumber;
           this.pan = pan;
    }


    /**
     * Gets the amount value for this TopupMobileRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TopupMobileRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardAuthorizeParams value for this TopupMobileRequestBean.
     * 
     * @return cardAuthorizeParams
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean getCardAuthorizeParams() {
        return cardAuthorizeParams;
    }


    /**
     * Sets the cardAuthorizeParams value for this TopupMobileRequestBean.
     * 
     * @param cardAuthorizeParams
     */
    public void setCardAuthorizeParams(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams) {
        this.cardAuthorizeParams = cardAuthorizeParams;
    }


    /**
     * Gets the merchantId value for this TopupMobileRequestBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this TopupMobileRequestBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the mobileNumber value for this TopupMobileRequestBean.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this TopupMobileRequestBean.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the pan value for this TopupMobileRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this TopupMobileRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopupMobileRequestBean)) return false;
        TopupMobileRequestBean other = (TopupMobileRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cardAuthorizeParams==null && other.getCardAuthorizeParams()==null) || 
             (this.cardAuthorizeParams!=null &&
              this.cardAuthorizeParams.equals(other.getCardAuthorizeParams()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCardAuthorizeParams() != null) {
            _hashCode += getCardAuthorizeParams().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TopupMobileRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "topupMobileRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAuthorizeParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardAuthorizeParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardAuthorizeParamsBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileNumber"));
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
