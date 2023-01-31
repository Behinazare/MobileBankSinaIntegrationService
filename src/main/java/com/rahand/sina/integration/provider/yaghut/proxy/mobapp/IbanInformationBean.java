/**
 * IbanInformationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class IbanInformationBean  implements java.io.Serializable {
    private java.lang.String bankCode;

    private java.lang.String bankName;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.IbanWSType ibanType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OwnerInfo[] ownersInfo;

    private boolean payIdRequired;

    private java.lang.String traditionalNumber;

    public IbanInformationBean() {
    }

    public IbanInformationBean(
           java.lang.String bankCode,
           java.lang.String bankName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.IbanWSType ibanType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OwnerInfo[] ownersInfo,
           boolean payIdRequired,
           java.lang.String traditionalNumber) {
           this.bankCode = bankCode;
           this.bankName = bankName;
           this.ibanType = ibanType;
           this.ownersInfo = ownersInfo;
           this.payIdRequired = payIdRequired;
           this.traditionalNumber = traditionalNumber;
    }


    /**
     * Gets the bankCode value for this IbanInformationBean.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this IbanInformationBean.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankName value for this IbanInformationBean.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this IbanInformationBean.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the ibanType value for this IbanInformationBean.
     * 
     * @return ibanType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.IbanWSType getIbanType() {
        return ibanType;
    }


    /**
     * Sets the ibanType value for this IbanInformationBean.
     * 
     * @param ibanType
     */
    public void setIbanType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.IbanWSType ibanType) {
        this.ibanType = ibanType;
    }


    /**
     * Gets the ownersInfo value for this IbanInformationBean.
     * 
     * @return ownersInfo
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OwnerInfo[] getOwnersInfo() {
        return ownersInfo;
    }


    /**
     * Sets the ownersInfo value for this IbanInformationBean.
     * 
     * @param ownersInfo
     */
    public void setOwnersInfo(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OwnerInfo[] ownersInfo) {
        this.ownersInfo = ownersInfo;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OwnerInfo getOwnersInfo(int i) {
        return this.ownersInfo[i];
    }

    public void setOwnersInfo(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OwnerInfo _value) {
        this.ownersInfo[i] = _value;
    }


    /**
     * Gets the payIdRequired value for this IbanInformationBean.
     * 
     * @return payIdRequired
     */
    public boolean isPayIdRequired() {
        return payIdRequired;
    }


    /**
     * Sets the payIdRequired value for this IbanInformationBean.
     * 
     * @param payIdRequired
     */
    public void setPayIdRequired(boolean payIdRequired) {
        this.payIdRequired = payIdRequired;
    }


    /**
     * Gets the traditionalNumber value for this IbanInformationBean.
     * 
     * @return traditionalNumber
     */
    public java.lang.String getTraditionalNumber() {
        return traditionalNumber;
    }


    /**
     * Sets the traditionalNumber value for this IbanInformationBean.
     * 
     * @param traditionalNumber
     */
    public void setTraditionalNumber(java.lang.String traditionalNumber) {
        this.traditionalNumber = traditionalNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IbanInformationBean)) return false;
        IbanInformationBean other = (IbanInformationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.ibanType==null && other.getIbanType()==null) || 
             (this.ibanType!=null &&
              this.ibanType.equals(other.getIbanType()))) &&
            ((this.ownersInfo==null && other.getOwnersInfo()==null) || 
             (this.ownersInfo!=null &&
              java.util.Arrays.equals(this.ownersInfo, other.getOwnersInfo()))) &&
            this.payIdRequired == other.isPayIdRequired() &&
            ((this.traditionalNumber==null && other.getTraditionalNumber()==null) || 
             (this.traditionalNumber!=null &&
              this.traditionalNumber.equals(other.getTraditionalNumber())));
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
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getIbanType() != null) {
            _hashCode += getIbanType().hashCode();
        }
        if (getOwnersInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwnersInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwnersInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isPayIdRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTraditionalNumber() != null) {
            _hashCode += getTraditionalNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IbanInformationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ibanInformationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ibanWSType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownersInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownersInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "ownerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payIdRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payIdRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traditionalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traditionalNumber"));
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
