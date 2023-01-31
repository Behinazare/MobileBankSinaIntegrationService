/**
 * InquirySayadChequeByHolderResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InquirySayadChequeByHolderResponseBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InquiryChequeBaseResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedAcceptActionTypeWS allowedAcceptActionType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeOwnerBean[] holders;

    private java.lang.String seriesNumber;

    public InquirySayadChequeByHolderResponseBean() {
    }

    public InquirySayadChequeByHolderResponseBean(
           java.math.BigDecimal amount,
           java.lang.String bankCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeBlockStatusWS blockStatus,
           java.lang.String branchCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeMediaWS chequeMedia,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeStatusWS chequeStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTypeWS chequeType,
           java.lang.String currency,
           java.lang.String description,
           java.util.Calendar dueDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeGuaranteeStatusWS guaranteeStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeLockStatusWS locked,
           java.lang.String reasonCode,
           java.lang.String sayadId,
           java.lang.String serialNumber,
           java.lang.String sourceIban,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedAcceptActionTypeWS allowedAcceptActionType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeOwnerBean[] holders,
           java.lang.String seriesNumber) {
        super(
            amount,
            bankCode,
            blockStatus,
            branchCode,
            chequeMedia,
            chequeStatus,
            chequeType,
            currency,
            description,
            dueDate,
            guaranteeStatus,
            locked,
            reasonCode,
            sayadId,
            serialNumber,
            sourceIban);
        this.allowedAcceptActionType = allowedAcceptActionType;
        this.holders = holders;
        this.seriesNumber = seriesNumber;
    }


    /**
     * Gets the allowedAcceptActionType value for this InquirySayadChequeByHolderResponseBean.
     * 
     * @return allowedAcceptActionType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedAcceptActionTypeWS getAllowedAcceptActionType() {
        return allowedAcceptActionType;
    }


    /**
     * Sets the allowedAcceptActionType value for this InquirySayadChequeByHolderResponseBean.
     * 
     * @param allowedAcceptActionType
     */
    public void setAllowedAcceptActionType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedAcceptActionTypeWS allowedAcceptActionType) {
        this.allowedAcceptActionType = allowedAcceptActionType;
    }


    /**
     * Gets the holders value for this InquirySayadChequeByHolderResponseBean.
     * 
     * @return holders
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeOwnerBean[] getHolders() {
        return holders;
    }


    /**
     * Sets the holders value for this InquirySayadChequeByHolderResponseBean.
     * 
     * @param holders
     */
    public void setHolders(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeOwnerBean[] holders) {
        this.holders = holders;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeOwnerBean getHolders(int i) {
        return this.holders[i];
    }

    public void setHolders(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeOwnerBean _value) {
        this.holders[i] = _value;
    }


    /**
     * Gets the seriesNumber value for this InquirySayadChequeByHolderResponseBean.
     * 
     * @return seriesNumber
     */
    public java.lang.String getSeriesNumber() {
        return seriesNumber;
    }


    /**
     * Sets the seriesNumber value for this InquirySayadChequeByHolderResponseBean.
     * 
     * @param seriesNumber
     */
    public void setSeriesNumber(java.lang.String seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquirySayadChequeByHolderResponseBean)) return false;
        InquirySayadChequeByHolderResponseBean other = (InquirySayadChequeByHolderResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowedAcceptActionType==null && other.getAllowedAcceptActionType()==null) || 
             (this.allowedAcceptActionType!=null &&
              this.allowedAcceptActionType.equals(other.getAllowedAcceptActionType()))) &&
            ((this.holders==null && other.getHolders()==null) || 
             (this.holders!=null &&
              java.util.Arrays.equals(this.holders, other.getHolders()))) &&
            ((this.seriesNumber==null && other.getSeriesNumber()==null) || 
             (this.seriesNumber!=null &&
              this.seriesNumber.equals(other.getSeriesNumber())));
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
        if (getAllowedAcceptActionType() != null) {
            _hashCode += getAllowedAcceptActionType().hashCode();
        }
        if (getHolders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHolders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHolders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeriesNumber() != null) {
            _hashCode += getSeriesNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquirySayadChequeByHolderResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "inquirySayadChequeByHolderResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedAcceptActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowedAcceptActionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeAllowedAcceptActionTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeOwnerBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriesNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seriesNumber"));
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
