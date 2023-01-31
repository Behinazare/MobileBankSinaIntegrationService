/**
 * InquirySayadChequeTransferResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InquirySayadChequeTransferResponseBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.InquiryChequeBaseResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedTransferActionTypeWS allowedTransferActionType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTransferHolderBean[] holders;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers;

    public InquirySayadChequeTransferResponseBean() {
    }

    public InquirySayadChequeTransferResponseBean(
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
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedTransferActionTypeWS allowedTransferActionType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTransferHolderBean[] holders,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers) {
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
        this.allowedTransferActionType = allowedTransferActionType;
        this.holders = holders;
        this.receivers = receivers;
    }


    /**
     * Gets the allowedTransferActionType value for this InquirySayadChequeTransferResponseBean.
     * 
     * @return allowedTransferActionType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedTransferActionTypeWS getAllowedTransferActionType() {
        return allowedTransferActionType;
    }


    /**
     * Sets the allowedTransferActionType value for this InquirySayadChequeTransferResponseBean.
     * 
     * @param allowedTransferActionType
     */
    public void setAllowedTransferActionType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeAllowedTransferActionTypeWS allowedTransferActionType) {
        this.allowedTransferActionType = allowedTransferActionType;
    }


    /**
     * Gets the holders value for this InquirySayadChequeTransferResponseBean.
     * 
     * @return holders
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTransferHolderBean[] getHolders() {
        return holders;
    }


    /**
     * Sets the holders value for this InquirySayadChequeTransferResponseBean.
     * 
     * @param holders
     */
    public void setHolders(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTransferHolderBean[] holders) {
        this.holders = holders;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTransferHolderBean getHolders(int i) {
        return this.holders[i];
    }

    public void setHolders(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeTransferHolderBean _value) {
        this.holders[i] = _value;
    }


    /**
     * Gets the receivers value for this InquirySayadChequeTransferResponseBean.
     * 
     * @return receivers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] getReceivers() {
        return receivers;
    }


    /**
     * Sets the receivers value for this InquirySayadChequeTransferResponseBean.
     * 
     * @param receivers
     */
    public void setReceivers(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean[] receivers) {
        this.receivers = receivers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean getReceivers(int i) {
        return this.receivers[i];
    }

    public void setReceivers(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SayadChequeReceiverBean _value) {
        this.receivers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquirySayadChequeTransferResponseBean)) return false;
        InquirySayadChequeTransferResponseBean other = (InquirySayadChequeTransferResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowedTransferActionType==null && other.getAllowedTransferActionType()==null) || 
             (this.allowedTransferActionType!=null &&
              this.allowedTransferActionType.equals(other.getAllowedTransferActionType()))) &&
            ((this.holders==null && other.getHolders()==null) || 
             (this.holders!=null &&
              java.util.Arrays.equals(this.holders, other.getHolders()))) &&
            ((this.receivers==null && other.getReceivers()==null) || 
             (this.receivers!=null &&
              java.util.Arrays.equals(this.receivers, other.getReceivers())));
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
        if (getAllowedTransferActionType() != null) {
            _hashCode += getAllowedTransferActionType().hashCode();
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
        if (getReceivers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceivers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceivers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquirySayadChequeTransferResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "inquirySayadChequeTransferResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedTransferActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowedTransferActionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeAllowedTransferActionTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeTransferHolderBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sayadChequeReceiverBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
