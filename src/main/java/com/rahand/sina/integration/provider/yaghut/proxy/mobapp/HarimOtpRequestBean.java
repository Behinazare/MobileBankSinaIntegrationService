/**
 * HarimOtpRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class HarimOtpRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardInfoBean cardInfoBean;

    private java.lang.String merchantId;

    private java.lang.String otpRequesterId;

    private java.lang.Boolean paymentService;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBean paymentServiceDetail;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessDetailBean processDetail;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessTypeBean processType;

    private java.lang.String terminalId;

    public HarimOtpRequestBean() {
    }

    public HarimOtpRequestBean(
           java.math.BigDecimal amount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardInfoBean cardInfoBean,
           java.lang.String merchantId,
           java.lang.String otpRequesterId,
           java.lang.Boolean paymentService,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBean paymentServiceDetail,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessDetailBean processDetail,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessTypeBean processType,
           java.lang.String terminalId) {
           this.amount = amount;
           this.cardInfoBean = cardInfoBean;
           this.merchantId = merchantId;
           this.otpRequesterId = otpRequesterId;
           this.paymentService = paymentService;
           this.paymentServiceDetail = paymentServiceDetail;
           this.processDetail = processDetail;
           this.processType = processType;
           this.terminalId = terminalId;
    }


    /**
     * Gets the amount value for this HarimOtpRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this HarimOtpRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardInfoBean value for this HarimOtpRequestBean.
     * 
     * @return cardInfoBean
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardInfoBean getCardInfoBean() {
        return cardInfoBean;
    }


    /**
     * Sets the cardInfoBean value for this HarimOtpRequestBean.
     * 
     * @param cardInfoBean
     */
    public void setCardInfoBean(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardInfoBean cardInfoBean) {
        this.cardInfoBean = cardInfoBean;
    }


    /**
     * Gets the merchantId value for this HarimOtpRequestBean.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this HarimOtpRequestBean.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the otpRequesterId value for this HarimOtpRequestBean.
     * 
     * @return otpRequesterId
     */
    public java.lang.String getOtpRequesterId() {
        return otpRequesterId;
    }


    /**
     * Sets the otpRequesterId value for this HarimOtpRequestBean.
     * 
     * @param otpRequesterId
     */
    public void setOtpRequesterId(java.lang.String otpRequesterId) {
        this.otpRequesterId = otpRequesterId;
    }


    /**
     * Gets the paymentService value for this HarimOtpRequestBean.
     * 
     * @return paymentService
     */
    public java.lang.Boolean getPaymentService() {
        return paymentService;
    }


    /**
     * Sets the paymentService value for this HarimOtpRequestBean.
     * 
     * @param paymentService
     */
    public void setPaymentService(java.lang.Boolean paymentService) {
        this.paymentService = paymentService;
    }


    /**
     * Gets the paymentServiceDetail value for this HarimOtpRequestBean.
     * 
     * @return paymentServiceDetail
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBean getPaymentServiceDetail() {
        return paymentServiceDetail;
    }


    /**
     * Sets the paymentServiceDetail value for this HarimOtpRequestBean.
     * 
     * @param paymentServiceDetail
     */
    public void setPaymentServiceDetail(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceDetailBean paymentServiceDetail) {
        this.paymentServiceDetail = paymentServiceDetail;
    }


    /**
     * Gets the processDetail value for this HarimOtpRequestBean.
     * 
     * @return processDetail
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessDetailBean getProcessDetail() {
        return processDetail;
    }


    /**
     * Sets the processDetail value for this HarimOtpRequestBean.
     * 
     * @param processDetail
     */
    public void setProcessDetail(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessDetailBean processDetail) {
        this.processDetail = processDetail;
    }


    /**
     * Gets the processType value for this HarimOtpRequestBean.
     * 
     * @return processType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessTypeBean getProcessType() {
        return processType;
    }


    /**
     * Sets the processType value for this HarimOtpRequestBean.
     * 
     * @param processType
     */
    public void setProcessType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProcessTypeBean processType) {
        this.processType = processType;
    }


    /**
     * Gets the terminalId value for this HarimOtpRequestBean.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this HarimOtpRequestBean.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HarimOtpRequestBean)) return false;
        HarimOtpRequestBean other = (HarimOtpRequestBean) obj;
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
            ((this.cardInfoBean==null && other.getCardInfoBean()==null) || 
             (this.cardInfoBean!=null &&
              this.cardInfoBean.equals(other.getCardInfoBean()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.otpRequesterId==null && other.getOtpRequesterId()==null) || 
             (this.otpRequesterId!=null &&
              this.otpRequesterId.equals(other.getOtpRequesterId()))) &&
            ((this.paymentService==null && other.getPaymentService()==null) || 
             (this.paymentService!=null &&
              this.paymentService.equals(other.getPaymentService()))) &&
            ((this.paymentServiceDetail==null && other.getPaymentServiceDetail()==null) || 
             (this.paymentServiceDetail!=null &&
              this.paymentServiceDetail.equals(other.getPaymentServiceDetail()))) &&
            ((this.processDetail==null && other.getProcessDetail()==null) || 
             (this.processDetail!=null &&
              this.processDetail.equals(other.getProcessDetail()))) &&
            ((this.processType==null && other.getProcessType()==null) || 
             (this.processType!=null &&
              this.processType.equals(other.getProcessType()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId())));
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
        if (getCardInfoBean() != null) {
            _hashCode += getCardInfoBean().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getOtpRequesterId() != null) {
            _hashCode += getOtpRequesterId().hashCode();
        }
        if (getPaymentService() != null) {
            _hashCode += getPaymentService().hashCode();
        }
        if (getPaymentServiceDetail() != null) {
            _hashCode += getPaymentServiceDetail().hashCode();
        }
        if (getProcessDetail() != null) {
            _hashCode += getProcessDetail().hashCode();
        }
        if (getProcessType() != null) {
            _hashCode += getProcessType().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HarimOtpRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "harimOtpRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardInfoBean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardInfoBean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardInfoBean"));
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
        elemField.setFieldName("otpRequesterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otpRequesterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentServiceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentServiceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "processTypeBean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalId"));
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
