/**
 * CardLoanPaymentRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardLoanPaymentRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal applyAmount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams;

    private java.lang.String loanNumber;

    private java.lang.String merchantIdentity;

    private java.lang.String pan;

    private java.lang.String twoPhaseReferenceCode;

    public CardLoanPaymentRequestBean() {
    }

    public CardLoanPaymentRequestBean(
           java.math.BigDecimal applyAmount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams,
           java.lang.String loanNumber,
           java.lang.String merchantIdentity,
           java.lang.String pan,
           java.lang.String twoPhaseReferenceCode) {
           this.applyAmount = applyAmount;
           this.cardAuthorizeParams = cardAuthorizeParams;
           this.loanNumber = loanNumber;
           this.merchantIdentity = merchantIdentity;
           this.pan = pan;
           this.twoPhaseReferenceCode = twoPhaseReferenceCode;
    }


    /**
     * Gets the applyAmount value for this CardLoanPaymentRequestBean.
     * 
     * @return applyAmount
     */
    public java.math.BigDecimal getApplyAmount() {
        return applyAmount;
    }


    /**
     * Sets the applyAmount value for this CardLoanPaymentRequestBean.
     * 
     * @param applyAmount
     */
    public void setApplyAmount(java.math.BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }


    /**
     * Gets the cardAuthorizeParams value for this CardLoanPaymentRequestBean.
     * 
     * @return cardAuthorizeParams
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean getCardAuthorizeParams() {
        return cardAuthorizeParams;
    }


    /**
     * Sets the cardAuthorizeParams value for this CardLoanPaymentRequestBean.
     * 
     * @param cardAuthorizeParams
     */
    public void setCardAuthorizeParams(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardAuthorizeParamsBean cardAuthorizeParams) {
        this.cardAuthorizeParams = cardAuthorizeParams;
    }


    /**
     * Gets the loanNumber value for this CardLoanPaymentRequestBean.
     * 
     * @return loanNumber
     */
    public java.lang.String getLoanNumber() {
        return loanNumber;
    }


    /**
     * Sets the loanNumber value for this CardLoanPaymentRequestBean.
     * 
     * @param loanNumber
     */
    public void setLoanNumber(java.lang.String loanNumber) {
        this.loanNumber = loanNumber;
    }


    /**
     * Gets the merchantIdentity value for this CardLoanPaymentRequestBean.
     * 
     * @return merchantIdentity
     */
    public java.lang.String getMerchantIdentity() {
        return merchantIdentity;
    }


    /**
     * Sets the merchantIdentity value for this CardLoanPaymentRequestBean.
     * 
     * @param merchantIdentity
     */
    public void setMerchantIdentity(java.lang.String merchantIdentity) {
        this.merchantIdentity = merchantIdentity;
    }


    /**
     * Gets the pan value for this CardLoanPaymentRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardLoanPaymentRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the twoPhaseReferenceCode value for this CardLoanPaymentRequestBean.
     * 
     * @return twoPhaseReferenceCode
     */
    public java.lang.String getTwoPhaseReferenceCode() {
        return twoPhaseReferenceCode;
    }


    /**
     * Sets the twoPhaseReferenceCode value for this CardLoanPaymentRequestBean.
     * 
     * @param twoPhaseReferenceCode
     */
    public void setTwoPhaseReferenceCode(java.lang.String twoPhaseReferenceCode) {
        this.twoPhaseReferenceCode = twoPhaseReferenceCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardLoanPaymentRequestBean)) return false;
        CardLoanPaymentRequestBean other = (CardLoanPaymentRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applyAmount==null && other.getApplyAmount()==null) || 
             (this.applyAmount!=null &&
              this.applyAmount.equals(other.getApplyAmount()))) &&
            ((this.cardAuthorizeParams==null && other.getCardAuthorizeParams()==null) || 
             (this.cardAuthorizeParams!=null &&
              this.cardAuthorizeParams.equals(other.getCardAuthorizeParams()))) &&
            ((this.loanNumber==null && other.getLoanNumber()==null) || 
             (this.loanNumber!=null &&
              this.loanNumber.equals(other.getLoanNumber()))) &&
            ((this.merchantIdentity==null && other.getMerchantIdentity()==null) || 
             (this.merchantIdentity!=null &&
              this.merchantIdentity.equals(other.getMerchantIdentity()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.twoPhaseReferenceCode==null && other.getTwoPhaseReferenceCode()==null) || 
             (this.twoPhaseReferenceCode!=null &&
              this.twoPhaseReferenceCode.equals(other.getTwoPhaseReferenceCode())));
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
        if (getApplyAmount() != null) {
            _hashCode += getApplyAmount().hashCode();
        }
        if (getCardAuthorizeParams() != null) {
            _hashCode += getCardAuthorizeParams().hashCode();
        }
        if (getLoanNumber() != null) {
            _hashCode += getLoanNumber().hashCode();
        }
        if (getMerchantIdentity() != null) {
            _hashCode += getMerchantIdentity().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getTwoPhaseReferenceCode() != null) {
            _hashCode += getTwoPhaseReferenceCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardLoanPaymentRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardLoanPaymentRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAuthorizeParams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardAuthorizeParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardAuthorizeParamsBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merchantIdentity"));
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
        elemField.setFieldName("twoPhaseReferenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "twoPhaseReferenceCode"));
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
