/**
 * CardTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardTemplate  implements java.io.Serializable {
    private java.lang.Boolean allowChargeLessThanMaxChargeAmount;

    private boolean availableForIssuePrimaryCard;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage cardTemplateUsage;

    private java.lang.Integer expirationLength;

    private java.math.BigDecimal maxCardAmount;

    private java.math.BigDecimal minCardAmount;

    private java.lang.String templateDescription;

    private java.lang.String templateId;

    public CardTemplate() {
    }

    public CardTemplate(
           java.lang.Boolean allowChargeLessThanMaxChargeAmount,
           boolean availableForIssuePrimaryCard,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage cardTemplateUsage,
           java.lang.Integer expirationLength,
           java.math.BigDecimal maxCardAmount,
           java.math.BigDecimal minCardAmount,
           java.lang.String templateDescription,
           java.lang.String templateId) {
           this.allowChargeLessThanMaxChargeAmount = allowChargeLessThanMaxChargeAmount;
           this.availableForIssuePrimaryCard = availableForIssuePrimaryCard;
           this.cardTemplateUsage = cardTemplateUsage;
           this.expirationLength = expirationLength;
           this.maxCardAmount = maxCardAmount;
           this.minCardAmount = minCardAmount;
           this.templateDescription = templateDescription;
           this.templateId = templateId;
    }


    /**
     * Gets the allowChargeLessThanMaxChargeAmount value for this CardTemplate.
     * 
     * @return allowChargeLessThanMaxChargeAmount
     */
    public java.lang.Boolean getAllowChargeLessThanMaxChargeAmount() {
        return allowChargeLessThanMaxChargeAmount;
    }


    /**
     * Sets the allowChargeLessThanMaxChargeAmount value for this CardTemplate.
     * 
     * @param allowChargeLessThanMaxChargeAmount
     */
    public void setAllowChargeLessThanMaxChargeAmount(java.lang.Boolean allowChargeLessThanMaxChargeAmount) {
        this.allowChargeLessThanMaxChargeAmount = allowChargeLessThanMaxChargeAmount;
    }


    /**
     * Gets the availableForIssuePrimaryCard value for this CardTemplate.
     * 
     * @return availableForIssuePrimaryCard
     */
    public boolean isAvailableForIssuePrimaryCard() {
        return availableForIssuePrimaryCard;
    }


    /**
     * Sets the availableForIssuePrimaryCard value for this CardTemplate.
     * 
     * @param availableForIssuePrimaryCard
     */
    public void setAvailableForIssuePrimaryCard(boolean availableForIssuePrimaryCard) {
        this.availableForIssuePrimaryCard = availableForIssuePrimaryCard;
    }


    /**
     * Gets the cardTemplateUsage value for this CardTemplate.
     * 
     * @return cardTemplateUsage
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage getCardTemplateUsage() {
        return cardTemplateUsage;
    }


    /**
     * Sets the cardTemplateUsage value for this CardTemplate.
     * 
     * @param cardTemplateUsage
     */
    public void setCardTemplateUsage(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage cardTemplateUsage) {
        this.cardTemplateUsage = cardTemplateUsage;
    }


    /**
     * Gets the expirationLength value for this CardTemplate.
     * 
     * @return expirationLength
     */
    public java.lang.Integer getExpirationLength() {
        return expirationLength;
    }


    /**
     * Sets the expirationLength value for this CardTemplate.
     * 
     * @param expirationLength
     */
    public void setExpirationLength(java.lang.Integer expirationLength) {
        this.expirationLength = expirationLength;
    }


    /**
     * Gets the maxCardAmount value for this CardTemplate.
     * 
     * @return maxCardAmount
     */
    public java.math.BigDecimal getMaxCardAmount() {
        return maxCardAmount;
    }


    /**
     * Sets the maxCardAmount value for this CardTemplate.
     * 
     * @param maxCardAmount
     */
    public void setMaxCardAmount(java.math.BigDecimal maxCardAmount) {
        this.maxCardAmount = maxCardAmount;
    }


    /**
     * Gets the minCardAmount value for this CardTemplate.
     * 
     * @return minCardAmount
     */
    public java.math.BigDecimal getMinCardAmount() {
        return minCardAmount;
    }


    /**
     * Sets the minCardAmount value for this CardTemplate.
     * 
     * @param minCardAmount
     */
    public void setMinCardAmount(java.math.BigDecimal minCardAmount) {
        this.minCardAmount = minCardAmount;
    }


    /**
     * Gets the templateDescription value for this CardTemplate.
     * 
     * @return templateDescription
     */
    public java.lang.String getTemplateDescription() {
        return templateDescription;
    }


    /**
     * Sets the templateDescription value for this CardTemplate.
     * 
     * @param templateDescription
     */
    public void setTemplateDescription(java.lang.String templateDescription) {
        this.templateDescription = templateDescription;
    }


    /**
     * Gets the templateId value for this CardTemplate.
     * 
     * @return templateId
     */
    public java.lang.String getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this CardTemplate.
     * 
     * @param templateId
     */
    public void setTemplateId(java.lang.String templateId) {
        this.templateId = templateId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardTemplate)) return false;
        CardTemplate other = (CardTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowChargeLessThanMaxChargeAmount==null && other.getAllowChargeLessThanMaxChargeAmount()==null) || 
             (this.allowChargeLessThanMaxChargeAmount!=null &&
              this.allowChargeLessThanMaxChargeAmount.equals(other.getAllowChargeLessThanMaxChargeAmount()))) &&
            this.availableForIssuePrimaryCard == other.isAvailableForIssuePrimaryCard() &&
            ((this.cardTemplateUsage==null && other.getCardTemplateUsage()==null) || 
             (this.cardTemplateUsage!=null &&
              this.cardTemplateUsage.equals(other.getCardTemplateUsage()))) &&
            ((this.expirationLength==null && other.getExpirationLength()==null) || 
             (this.expirationLength!=null &&
              this.expirationLength.equals(other.getExpirationLength()))) &&
            ((this.maxCardAmount==null && other.getMaxCardAmount()==null) || 
             (this.maxCardAmount!=null &&
              this.maxCardAmount.equals(other.getMaxCardAmount()))) &&
            ((this.minCardAmount==null && other.getMinCardAmount()==null) || 
             (this.minCardAmount!=null &&
              this.minCardAmount.equals(other.getMinCardAmount()))) &&
            ((this.templateDescription==null && other.getTemplateDescription()==null) || 
             (this.templateDescription!=null &&
              this.templateDescription.equals(other.getTemplateDescription()))) &&
            ((this.templateId==null && other.getTemplateId()==null) || 
             (this.templateId!=null &&
              this.templateId.equals(other.getTemplateId())));
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
        if (getAllowChargeLessThanMaxChargeAmount() != null) {
            _hashCode += getAllowChargeLessThanMaxChargeAmount().hashCode();
        }
        _hashCode += (isAvailableForIssuePrimaryCard() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCardTemplateUsage() != null) {
            _hashCode += getCardTemplateUsage().hashCode();
        }
        if (getExpirationLength() != null) {
            _hashCode += getExpirationLength().hashCode();
        }
        if (getMaxCardAmount() != null) {
            _hashCode += getMaxCardAmount().hashCode();
        }
        if (getMinCardAmount() != null) {
            _hashCode += getMinCardAmount().hashCode();
        }
        if (getTemplateDescription() != null) {
            _hashCode += getTemplateDescription().hashCode();
        }
        if (getTemplateId() != null) {
            _hashCode += getTemplateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowChargeLessThanMaxChargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowChargeLessThanMaxChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForIssuePrimaryCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableForIssuePrimaryCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTemplateUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardTemplateUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTemplateUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCardAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCardAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCardAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minCardAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateId"));
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
