/**
 * DepositCustomerBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositCustomerBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String name;

    private java.util.Calendar relationExpireDate;

    private java.lang.Integer sharePercent;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerSignatureBean signature;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signatureStatus;

    public DepositCustomerBean() {
    }

    public DepositCustomerBean(
           java.lang.String cif,
           java.lang.String name,
           java.util.Calendar relationExpireDate,
           java.lang.Integer sharePercent,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerSignatureBean signature,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signatureStatus) {
           this.cif = cif;
           this.name = name;
           this.relationExpireDate = relationExpireDate;
           this.sharePercent = sharePercent;
           this.signature = signature;
           this.signatureStatus = signatureStatus;
    }


    /**
     * Gets the cif value for this DepositCustomerBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this DepositCustomerBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the name value for this DepositCustomerBean.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DepositCustomerBean.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the relationExpireDate value for this DepositCustomerBean.
     * 
     * @return relationExpireDate
     */
    public java.util.Calendar getRelationExpireDate() {
        return relationExpireDate;
    }


    /**
     * Sets the relationExpireDate value for this DepositCustomerBean.
     * 
     * @param relationExpireDate
     */
    public void setRelationExpireDate(java.util.Calendar relationExpireDate) {
        this.relationExpireDate = relationExpireDate;
    }


    /**
     * Gets the sharePercent value for this DepositCustomerBean.
     * 
     * @return sharePercent
     */
    public java.lang.Integer getSharePercent() {
        return sharePercent;
    }


    /**
     * Sets the sharePercent value for this DepositCustomerBean.
     * 
     * @param sharePercent
     */
    public void setSharePercent(java.lang.Integer sharePercent) {
        this.sharePercent = sharePercent;
    }


    /**
     * Gets the signature value for this DepositCustomerBean.
     * 
     * @return signature
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerSignatureBean getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this DepositCustomerBean.
     * 
     * @param signature
     */
    public void setSignature(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerSignatureBean signature) {
        this.signature = signature;
    }


    /**
     * Gets the signatureStatus value for this DepositCustomerBean.
     * 
     * @return signatureStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus getSignatureStatus() {
        return signatureStatus;
    }


    /**
     * Sets the signatureStatus value for this DepositCustomerBean.
     * 
     * @param signatureStatus
     */
    public void setSignatureStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SignatureOwnerStatus signatureStatus) {
        this.signatureStatus = signatureStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositCustomerBean)) return false;
        DepositCustomerBean other = (DepositCustomerBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.relationExpireDate==null && other.getRelationExpireDate()==null) || 
             (this.relationExpireDate!=null &&
              this.relationExpireDate.equals(other.getRelationExpireDate()))) &&
            ((this.sharePercent==null && other.getSharePercent()==null) || 
             (this.sharePercent!=null &&
              this.sharePercent.equals(other.getSharePercent()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.signatureStatus==null && other.getSignatureStatus()==null) || 
             (this.signatureStatus!=null &&
              this.signatureStatus.equals(other.getSignatureStatus())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRelationExpireDate() != null) {
            _hashCode += getRelationExpireDate().hashCode();
        }
        if (getSharePercent() != null) {
            _hashCode += getSharePercent().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSignatureStatus() != null) {
            _hashCode += getSignatureStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositCustomerBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositCustomerBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sharePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerSignatureBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signatureStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "signatureOwnerStatus"));
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
