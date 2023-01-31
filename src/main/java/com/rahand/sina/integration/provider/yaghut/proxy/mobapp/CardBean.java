/**
 * CardBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveBean cardEPaymentDescriptiveDto;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus cardStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cardStatusCause;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType cardType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTypeResponse cardTypeResponse;

    private java.lang.String customerFirstName;

    private java.lang.String customerLastName;

    private java.lang.String depositNumber;

    private java.util.Calendar expireDate;

    private java.util.Calendar issueDate;

    private java.lang.String pan;

    private java.util.Calendar revivalExpireDate;

    private java.lang.Short revivalExpireDateCount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean[] validTargetUnlimitedCardSecondPinTypes;

    public CardBean() {
    }

    public CardBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveBean cardEPaymentDescriptiveDto,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus cardStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cardStatusCause,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType cardType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTypeResponse cardTypeResponse,
           java.lang.String customerFirstName,
           java.lang.String customerLastName,
           java.lang.String depositNumber,
           java.util.Calendar expireDate,
           java.util.Calendar issueDate,
           java.lang.String pan,
           java.util.Calendar revivalExpireDate,
           java.lang.Short revivalExpireDateCount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean[] validTargetUnlimitedCardSecondPinTypes) {
           this.cardEPaymentDescriptiveDto = cardEPaymentDescriptiveDto;
           this.cardStatus = cardStatus;
           this.cardStatusCause = cardStatusCause;
           this.cardType = cardType;
           this.cardTypeResponse = cardTypeResponse;
           this.customerFirstName = customerFirstName;
           this.customerLastName = customerLastName;
           this.depositNumber = depositNumber;
           this.expireDate = expireDate;
           this.issueDate = issueDate;
           this.pan = pan;
           this.revivalExpireDate = revivalExpireDate;
           this.revivalExpireDateCount = revivalExpireDateCount;
           this.validTargetUnlimitedCardSecondPinTypes = validTargetUnlimitedCardSecondPinTypes;
    }


    /**
     * Gets the cardEPaymentDescriptiveDto value for this CardBean.
     * 
     * @return cardEPaymentDescriptiveDto
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveBean getCardEPaymentDescriptiveDto() {
        return cardEPaymentDescriptiveDto;
    }


    /**
     * Sets the cardEPaymentDescriptiveDto value for this CardBean.
     * 
     * @param cardEPaymentDescriptiveDto
     */
    public void setCardEPaymentDescriptiveDto(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardEPaymentDescriptiveBean cardEPaymentDescriptiveDto) {
        this.cardEPaymentDescriptiveDto = cardEPaymentDescriptiveDto;
    }


    /**
     * Gets the cardStatus value for this CardBean.
     * 
     * @return cardStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this CardBean.
     * 
     * @param cardStatus
     */
    public void setCardStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the cardStatusCause value for this CardBean.
     * 
     * @return cardStatusCause
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause getCardStatusCause() {
        return cardStatusCause;
    }


    /**
     * Sets the cardStatusCause value for this CardBean.
     * 
     * @param cardStatusCause
     */
    public void setCardStatusCause(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cardStatusCause) {
        this.cardStatusCause = cardStatusCause;
    }


    /**
     * Gets the cardType value for this CardBean.
     * 
     * @return cardType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this CardBean.
     * 
     * @param cardType
     */
    public void setCardType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardTypeResponse value for this CardBean.
     * 
     * @return cardTypeResponse
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTypeResponse getCardTypeResponse() {
        return cardTypeResponse;
    }


    /**
     * Sets the cardTypeResponse value for this CardBean.
     * 
     * @param cardTypeResponse
     */
    public void setCardTypeResponse(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTypeResponse cardTypeResponse) {
        this.cardTypeResponse = cardTypeResponse;
    }


    /**
     * Gets the customerFirstName value for this CardBean.
     * 
     * @return customerFirstName
     */
    public java.lang.String getCustomerFirstName() {
        return customerFirstName;
    }


    /**
     * Sets the customerFirstName value for this CardBean.
     * 
     * @param customerFirstName
     */
    public void setCustomerFirstName(java.lang.String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }


    /**
     * Gets the customerLastName value for this CardBean.
     * 
     * @return customerLastName
     */
    public java.lang.String getCustomerLastName() {
        return customerLastName;
    }


    /**
     * Sets the customerLastName value for this CardBean.
     * 
     * @param customerLastName
     */
    public void setCustomerLastName(java.lang.String customerLastName) {
        this.customerLastName = customerLastName;
    }


    /**
     * Gets the depositNumber value for this CardBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this CardBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the expireDate value for this CardBean.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this CardBean.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the issueDate value for this CardBean.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this CardBean.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the pan value for this CardBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the revivalExpireDate value for this CardBean.
     * 
     * @return revivalExpireDate
     */
    public java.util.Calendar getRevivalExpireDate() {
        return revivalExpireDate;
    }


    /**
     * Sets the revivalExpireDate value for this CardBean.
     * 
     * @param revivalExpireDate
     */
    public void setRevivalExpireDate(java.util.Calendar revivalExpireDate) {
        this.revivalExpireDate = revivalExpireDate;
    }


    /**
     * Gets the revivalExpireDateCount value for this CardBean.
     * 
     * @return revivalExpireDateCount
     */
    public java.lang.Short getRevivalExpireDateCount() {
        return revivalExpireDateCount;
    }


    /**
     * Sets the revivalExpireDateCount value for this CardBean.
     * 
     * @param revivalExpireDateCount
     */
    public void setRevivalExpireDateCount(java.lang.Short revivalExpireDateCount) {
        this.revivalExpireDateCount = revivalExpireDateCount;
    }


    /**
     * Gets the validTargetUnlimitedCardSecondPinTypes value for this CardBean.
     * 
     * @return validTargetUnlimitedCardSecondPinTypes
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean[] getValidTargetUnlimitedCardSecondPinTypes() {
        return validTargetUnlimitedCardSecondPinTypes;
    }


    /**
     * Sets the validTargetUnlimitedCardSecondPinTypes value for this CardBean.
     * 
     * @param validTargetUnlimitedCardSecondPinTypes
     */
    public void setValidTargetUnlimitedCardSecondPinTypes(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean[] validTargetUnlimitedCardSecondPinTypes) {
        this.validTargetUnlimitedCardSecondPinTypes = validTargetUnlimitedCardSecondPinTypes;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean getValidTargetUnlimitedCardSecondPinTypes(int i) {
        return this.validTargetUnlimitedCardSecondPinTypes[i];
    }

    public void setValidTargetUnlimitedCardSecondPinTypes(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardSecondPinTypeBean _value) {
        this.validTargetUnlimitedCardSecondPinTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardBean)) return false;
        CardBean other = (CardBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardEPaymentDescriptiveDto==null && other.getCardEPaymentDescriptiveDto()==null) || 
             (this.cardEPaymentDescriptiveDto!=null &&
              this.cardEPaymentDescriptiveDto.equals(other.getCardEPaymentDescriptiveDto()))) &&
            ((this.cardStatus==null && other.getCardStatus()==null) || 
             (this.cardStatus!=null &&
              this.cardStatus.equals(other.getCardStatus()))) &&
            ((this.cardStatusCause==null && other.getCardStatusCause()==null) || 
             (this.cardStatusCause!=null &&
              this.cardStatusCause.equals(other.getCardStatusCause()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardTypeResponse==null && other.getCardTypeResponse()==null) || 
             (this.cardTypeResponse!=null &&
              this.cardTypeResponse.equals(other.getCardTypeResponse()))) &&
            ((this.customerFirstName==null && other.getCustomerFirstName()==null) || 
             (this.customerFirstName!=null &&
              this.customerFirstName.equals(other.getCustomerFirstName()))) &&
            ((this.customerLastName==null && other.getCustomerLastName()==null) || 
             (this.customerLastName!=null &&
              this.customerLastName.equals(other.getCustomerLastName()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.revivalExpireDate==null && other.getRevivalExpireDate()==null) || 
             (this.revivalExpireDate!=null &&
              this.revivalExpireDate.equals(other.getRevivalExpireDate()))) &&
            ((this.revivalExpireDateCount==null && other.getRevivalExpireDateCount()==null) || 
             (this.revivalExpireDateCount!=null &&
              this.revivalExpireDateCount.equals(other.getRevivalExpireDateCount()))) &&
            ((this.validTargetUnlimitedCardSecondPinTypes==null && other.getValidTargetUnlimitedCardSecondPinTypes()==null) || 
             (this.validTargetUnlimitedCardSecondPinTypes!=null &&
              java.util.Arrays.equals(this.validTargetUnlimitedCardSecondPinTypes, other.getValidTargetUnlimitedCardSecondPinTypes())));
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
        if (getCardEPaymentDescriptiveDto() != null) {
            _hashCode += getCardEPaymentDescriptiveDto().hashCode();
        }
        if (getCardStatus() != null) {
            _hashCode += getCardStatus().hashCode();
        }
        if (getCardStatusCause() != null) {
            _hashCode += getCardStatusCause().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardTypeResponse() != null) {
            _hashCode += getCardTypeResponse().hashCode();
        }
        if (getCustomerFirstName() != null) {
            _hashCode += getCustomerFirstName().hashCode();
        }
        if (getCustomerLastName() != null) {
            _hashCode += getCustomerLastName().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getRevivalExpireDate() != null) {
            _hashCode += getRevivalExpireDate().hashCode();
        }
        if (getRevivalExpireDateCount() != null) {
            _hashCode += getRevivalExpireDateCount().hashCode();
        }
        if (getValidTargetUnlimitedCardSecondPinTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidTargetUnlimitedCardSecondPinTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidTargetUnlimitedCardSecondPinTypes(), i);
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
        new org.apache.axis.description.TypeDesc(CardBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardEPaymentDescriptiveDto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardEPaymentDescriptiveDto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardEPaymentDescriptiveBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatusCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardStatusCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardStatusCause"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardTypeResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTypeResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revivalExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revivalExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revivalExpireDateCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revivalExpireDateCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validTargetUnlimitedCardSecondPinTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validTargetUnlimitedCardSecondPinTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardSecondPinTypeBean"));
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
