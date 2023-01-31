/**
 * IssueSpecialCardRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class IssueSpecialCardRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String cardTemplateId;

    private java.lang.String cif;

    private java.lang.String holderCif;

    private java.lang.String holderName;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SpecialCardType specialCardType;

    public IssueSpecialCardRequestBean() {
    }

    public IssueSpecialCardRequestBean(
           java.math.BigDecimal amount,
           java.lang.String cardTemplateId,
           java.lang.String cif,
           java.lang.String holderCif,
           java.lang.String holderName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SpecialCardType specialCardType) {
           this.amount = amount;
           this.cardTemplateId = cardTemplateId;
           this.cif = cif;
           this.holderCif = holderCif;
           this.holderName = holderName;
           this.specialCardType = specialCardType;
    }


    /**
     * Gets the amount value for this IssueSpecialCardRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this IssueSpecialCardRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardTemplateId value for this IssueSpecialCardRequestBean.
     * 
     * @return cardTemplateId
     */
    public java.lang.String getCardTemplateId() {
        return cardTemplateId;
    }


    /**
     * Sets the cardTemplateId value for this IssueSpecialCardRequestBean.
     * 
     * @param cardTemplateId
     */
    public void setCardTemplateId(java.lang.String cardTemplateId) {
        this.cardTemplateId = cardTemplateId;
    }


    /**
     * Gets the cif value for this IssueSpecialCardRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this IssueSpecialCardRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the holderCif value for this IssueSpecialCardRequestBean.
     * 
     * @return holderCif
     */
    public java.lang.String getHolderCif() {
        return holderCif;
    }


    /**
     * Sets the holderCif value for this IssueSpecialCardRequestBean.
     * 
     * @param holderCif
     */
    public void setHolderCif(java.lang.String holderCif) {
        this.holderCif = holderCif;
    }


    /**
     * Gets the holderName value for this IssueSpecialCardRequestBean.
     * 
     * @return holderName
     */
    public java.lang.String getHolderName() {
        return holderName;
    }


    /**
     * Sets the holderName value for this IssueSpecialCardRequestBean.
     * 
     * @param holderName
     */
    public void setHolderName(java.lang.String holderName) {
        this.holderName = holderName;
    }


    /**
     * Gets the specialCardType value for this IssueSpecialCardRequestBean.
     * 
     * @return specialCardType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SpecialCardType getSpecialCardType() {
        return specialCardType;
    }


    /**
     * Sets the specialCardType value for this IssueSpecialCardRequestBean.
     * 
     * @param specialCardType
     */
    public void setSpecialCardType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SpecialCardType specialCardType) {
        this.specialCardType = specialCardType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IssueSpecialCardRequestBean)) return false;
        IssueSpecialCardRequestBean other = (IssueSpecialCardRequestBean) obj;
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
            ((this.cardTemplateId==null && other.getCardTemplateId()==null) || 
             (this.cardTemplateId!=null &&
              this.cardTemplateId.equals(other.getCardTemplateId()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.holderCif==null && other.getHolderCif()==null) || 
             (this.holderCif!=null &&
              this.holderCif.equals(other.getHolderCif()))) &&
            ((this.holderName==null && other.getHolderName()==null) || 
             (this.holderName!=null &&
              this.holderName.equals(other.getHolderName()))) &&
            ((this.specialCardType==null && other.getSpecialCardType()==null) || 
             (this.specialCardType!=null &&
              this.specialCardType.equals(other.getSpecialCardType())));
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
        if (getCardTemplateId() != null) {
            _hashCode += getCardTemplateId().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getHolderCif() != null) {
            _hashCode += getHolderCif().hashCode();
        }
        if (getHolderName() != null) {
            _hashCode += getHolderName().hashCode();
        }
        if (getSpecialCardType() != null) {
            _hashCode += getSpecialCardType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IssueSpecialCardRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "issueSpecialCardRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holderCif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holderCif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specialCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "specialCardType"));
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
