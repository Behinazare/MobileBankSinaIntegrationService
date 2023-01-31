/**
 * BillPaymentRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillPaymentRequestBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillInfoSearchRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams;

    private java.lang.String merchantId;

    private java.lang.String pan;

    private java.lang.Boolean requireVerification;

    private java.lang.Long verificationExpirationTimeOut;

    public BillPaymentRequestBean() {
    }

    public BillPaymentRequestBean(
           java.lang.String billId,
           java.lang.String merchantIdentity,
           java.lang.String payId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams,
           java.lang.String merchantId,
           java.lang.String pan,
           java.lang.Boolean requireVerification,
           java.lang.Long verificationExpirationTimeOut) {
        super(
            billId,
            merchantIdentity,
            payId);
        this.cardAuthorizeParams = cardAuthorizeParams;
        this.merchantId = merchantId;
        this.pan = pan;
        this.requireVerification = requireVerification;
        this.verificationExpirationTimeOut = verificationExpirationTimeOut;
    }


    /**
     * Gets the cardAuthorizeParams value for this BillPaymentRequestBean.
     * 
     * @return cardAuthorizeParams
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean getCardAuthorizeParams() {
        return cardAuthorizeParams;
    }


    /**
     * Sets the cardAuthorizeParams value for this BillPaymentRequestBean.
     * 
     * @param cardAuthorizeParams
     */
    public void setCardAuthorizeParams(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams) {
        this.cardAuthorizeParams = cardAuthorizeParams;
    }


    /**
     * Gets the merchantId value for this BillPaymentRequestBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this BillPaymentRequestBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the pan value for this BillPaymentRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this BillPaymentRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the requireVerification value for this BillPaymentRequestBean.
     * 
     * @return requireVerification
     */
    public java.lang.Boolean getRequireVerification() {
        return requireVerification;
    }


    /**
     * Sets the requireVerification value for this BillPaymentRequestBean.
     * 
     * @param requireVerification
     */
    public void setRequireVerification(java.lang.Boolean requireVerification) {
        this.requireVerification = requireVerification;
    }


    /**
     * Gets the verificationExpirationTimeOut value for this BillPaymentRequestBean.
     * 
     * @return verificationExpirationTimeOut
     */
    public java.lang.Long getVerificationExpirationTimeOut() {
        return verificationExpirationTimeOut;
    }


    /**
     * Sets the verificationExpirationTimeOut value for this BillPaymentRequestBean.
     * 
     * @param verificationExpirationTimeOut
     */
    public void setVerificationExpirationTimeOut(java.lang.Long verificationExpirationTimeOut) {
        this.verificationExpirationTimeOut = verificationExpirationTimeOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillPaymentRequestBean)) return false;
        BillPaymentRequestBean other = (BillPaymentRequestBean) obj;
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
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.requireVerification==null && other.getRequireVerification()==null) || 
             (this.requireVerification!=null &&
              this.requireVerification.equals(other.getRequireVerification()))) &&
            ((this.verificationExpirationTimeOut==null && other.getVerificationExpirationTimeOut()==null) || 
             (this.verificationExpirationTimeOut!=null &&
              this.verificationExpirationTimeOut.equals(other.getVerificationExpirationTimeOut())));
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
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getRequireVerification() != null) {
            _hashCode += getRequireVerification().hashCode();
        }
        if (getVerificationExpirationTimeOut() != null) {
            _hashCode += getVerificationExpirationTimeOut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillPaymentRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billPaymentRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAuthorizeParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardAuthorizeParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardAuthorizeParamsBean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireVerification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requireVerification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationExpirationTimeOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verificationExpirationTimeOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
