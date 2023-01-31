/**
 * SearchCardTemplateRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SearchCardTemplateRequestBean  implements java.io.Serializable {
    private java.lang.Boolean availableForIssuePrimaryCard;

    private java.lang.Boolean availableForIssueReplicateCard;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage[] cardTemplateUsages;

    private java.lang.Integer expirationLength;

    private java.lang.Long length;

    private java.math.BigDecimal maxCardAmount;

    private java.math.BigDecimal minCardAmount;

    private java.lang.Long offset;

    private java.lang.String templateDescription;

    private java.lang.String[] templateIds;

    public SearchCardTemplateRequestBean() {
    }

    public SearchCardTemplateRequestBean(
           java.lang.Boolean availableForIssuePrimaryCard,
           java.lang.Boolean availableForIssueReplicateCard,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage[] cardTemplateUsages,
           java.lang.Integer expirationLength,
           java.lang.Long length,
           java.math.BigDecimal maxCardAmount,
           java.math.BigDecimal minCardAmount,
           java.lang.Long offset,
           java.lang.String templateDescription,
           java.lang.String[] templateIds) {
           this.availableForIssuePrimaryCard = availableForIssuePrimaryCard;
           this.availableForIssueReplicateCard = availableForIssueReplicateCard;
           this.cardTemplateUsages = cardTemplateUsages;
           this.expirationLength = expirationLength;
           this.length = length;
           this.maxCardAmount = maxCardAmount;
           this.minCardAmount = minCardAmount;
           this.offset = offset;
           this.templateDescription = templateDescription;
           this.templateIds = templateIds;
    }


    /**
     * Gets the availableForIssuePrimaryCard value for this SearchCardTemplateRequestBean.
     * 
     * @return availableForIssuePrimaryCard
     */
    public java.lang.Boolean getAvailableForIssuePrimaryCard() {
        return availableForIssuePrimaryCard;
    }


    /**
     * Sets the availableForIssuePrimaryCard value for this SearchCardTemplateRequestBean.
     * 
     * @param availableForIssuePrimaryCard
     */
    public void setAvailableForIssuePrimaryCard(java.lang.Boolean availableForIssuePrimaryCard) {
        this.availableForIssuePrimaryCard = availableForIssuePrimaryCard;
    }


    /**
     * Gets the availableForIssueReplicateCard value for this SearchCardTemplateRequestBean.
     * 
     * @return availableForIssueReplicateCard
     */
    public java.lang.Boolean getAvailableForIssueReplicateCard() {
        return availableForIssueReplicateCard;
    }


    /**
     * Sets the availableForIssueReplicateCard value for this SearchCardTemplateRequestBean.
     * 
     * @param availableForIssueReplicateCard
     */
    public void setAvailableForIssueReplicateCard(java.lang.Boolean availableForIssueReplicateCard) {
        this.availableForIssueReplicateCard = availableForIssueReplicateCard;
    }


    /**
     * Gets the cardTemplateUsages value for this SearchCardTemplateRequestBean.
     * 
     * @return cardTemplateUsages
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage[] getCardTemplateUsages() {
        return cardTemplateUsages;
    }


    /**
     * Sets the cardTemplateUsages value for this SearchCardTemplateRequestBean.
     * 
     * @param cardTemplateUsages
     */
    public void setCardTemplateUsages(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage[] cardTemplateUsages) {
        this.cardTemplateUsages = cardTemplateUsages;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage getCardTemplateUsages(int i) {
        return this.cardTemplateUsages[i];
    }

    public void setCardTemplateUsages(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTemplateUsage _value) {
        this.cardTemplateUsages[i] = _value;
    }


    /**
     * Gets the expirationLength value for this SearchCardTemplateRequestBean.
     * 
     * @return expirationLength
     */
    public java.lang.Integer getExpirationLength() {
        return expirationLength;
    }


    /**
     * Sets the expirationLength value for this SearchCardTemplateRequestBean.
     * 
     * @param expirationLength
     */
    public void setExpirationLength(java.lang.Integer expirationLength) {
        this.expirationLength = expirationLength;
    }


    /**
     * Gets the length value for this SearchCardTemplateRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this SearchCardTemplateRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the maxCardAmount value for this SearchCardTemplateRequestBean.
     * 
     * @return maxCardAmount
     */
    public java.math.BigDecimal getMaxCardAmount() {
        return maxCardAmount;
    }


    /**
     * Sets the maxCardAmount value for this SearchCardTemplateRequestBean.
     * 
     * @param maxCardAmount
     */
    public void setMaxCardAmount(java.math.BigDecimal maxCardAmount) {
        this.maxCardAmount = maxCardAmount;
    }


    /**
     * Gets the minCardAmount value for this SearchCardTemplateRequestBean.
     * 
     * @return minCardAmount
     */
    public java.math.BigDecimal getMinCardAmount() {
        return minCardAmount;
    }


    /**
     * Sets the minCardAmount value for this SearchCardTemplateRequestBean.
     * 
     * @param minCardAmount
     */
    public void setMinCardAmount(java.math.BigDecimal minCardAmount) {
        this.minCardAmount = minCardAmount;
    }


    /**
     * Gets the offset value for this SearchCardTemplateRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this SearchCardTemplateRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the templateDescription value for this SearchCardTemplateRequestBean.
     * 
     * @return templateDescription
     */
    public java.lang.String getTemplateDescription() {
        return templateDescription;
    }


    /**
     * Sets the templateDescription value for this SearchCardTemplateRequestBean.
     * 
     * @param templateDescription
     */
    public void setTemplateDescription(java.lang.String templateDescription) {
        this.templateDescription = templateDescription;
    }


    /**
     * Gets the templateIds value for this SearchCardTemplateRequestBean.
     * 
     * @return templateIds
     */
    public java.lang.String[] getTemplateIds() {
        return templateIds;
    }


    /**
     * Sets the templateIds value for this SearchCardTemplateRequestBean.
     * 
     * @param templateIds
     */
    public void setTemplateIds(java.lang.String[] templateIds) {
        this.templateIds = templateIds;
    }

    public java.lang.String getTemplateIds(int i) {
        return this.templateIds[i];
    }

    public void setTemplateIds(int i, java.lang.String _value) {
        this.templateIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCardTemplateRequestBean)) return false;
        SearchCardTemplateRequestBean other = (SearchCardTemplateRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableForIssuePrimaryCard==null && other.getAvailableForIssuePrimaryCard()==null) || 
             (this.availableForIssuePrimaryCard!=null &&
              this.availableForIssuePrimaryCard.equals(other.getAvailableForIssuePrimaryCard()))) &&
            ((this.availableForIssueReplicateCard==null && other.getAvailableForIssueReplicateCard()==null) || 
             (this.availableForIssueReplicateCard!=null &&
              this.availableForIssueReplicateCard.equals(other.getAvailableForIssueReplicateCard()))) &&
            ((this.cardTemplateUsages==null && other.getCardTemplateUsages()==null) || 
             (this.cardTemplateUsages!=null &&
              java.util.Arrays.equals(this.cardTemplateUsages, other.getCardTemplateUsages()))) &&
            ((this.expirationLength==null && other.getExpirationLength()==null) || 
             (this.expirationLength!=null &&
              this.expirationLength.equals(other.getExpirationLength()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.maxCardAmount==null && other.getMaxCardAmount()==null) || 
             (this.maxCardAmount!=null &&
              this.maxCardAmount.equals(other.getMaxCardAmount()))) &&
            ((this.minCardAmount==null && other.getMinCardAmount()==null) || 
             (this.minCardAmount!=null &&
              this.minCardAmount.equals(other.getMinCardAmount()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.templateDescription==null && other.getTemplateDescription()==null) || 
             (this.templateDescription!=null &&
              this.templateDescription.equals(other.getTemplateDescription()))) &&
            ((this.templateIds==null && other.getTemplateIds()==null) || 
             (this.templateIds!=null &&
              java.util.Arrays.equals(this.templateIds, other.getTemplateIds())));
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
        if (getAvailableForIssuePrimaryCard() != null) {
            _hashCode += getAvailableForIssuePrimaryCard().hashCode();
        }
        if (getAvailableForIssueReplicateCard() != null) {
            _hashCode += getAvailableForIssueReplicateCard().hashCode();
        }
        if (getCardTemplateUsages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardTemplateUsages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardTemplateUsages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpirationLength() != null) {
            _hashCode += getExpirationLength().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getMaxCardAmount() != null) {
            _hashCode += getMaxCardAmount().hashCode();
        }
        if (getMinCardAmount() != null) {
            _hashCode += getMinCardAmount().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getTemplateDescription() != null) {
            _hashCode += getTemplateDescription().hashCode();
        }
        if (getTemplateIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplateIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateIds(), i);
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
        new org.apache.axis.description.TypeDesc(SearchCardTemplateRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchCardTemplateRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForIssuePrimaryCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableForIssuePrimaryCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableForIssueReplicateCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableForIssueReplicateCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTemplateUsages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardTemplateUsages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTemplateUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("templateIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templateIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
