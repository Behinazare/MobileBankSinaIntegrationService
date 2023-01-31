/**
 * CompleteCardBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CompleteCardBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardIssueCauseWS cardIssueCause;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cardStatusCause;

    private java.util.Calendar expireDate;

    private java.util.Calendar issueDate;

    private java.lang.String pan;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus status;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType type;

    public CompleteCardBean() {
    }

    public CompleteCardBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardIssueCauseWS cardIssueCause,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cardStatusCause,
           java.util.Calendar expireDate,
           java.util.Calendar issueDate,
           java.lang.String pan,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType type) {
           this.cardIssueCause = cardIssueCause;
           this.cardStatusCause = cardStatusCause;
           this.expireDate = expireDate;
           this.issueDate = issueDate;
           this.pan = pan;
           this.status = status;
           this.type = type;
    }


    /**
     * Gets the cardIssueCause value for this CompleteCardBean.
     * 
     * @return cardIssueCause
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardIssueCauseWS getCardIssueCause() {
        return cardIssueCause;
    }


    /**
     * Sets the cardIssueCause value for this CompleteCardBean.
     * 
     * @param cardIssueCause
     */
    public void setCardIssueCause(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardIssueCauseWS cardIssueCause) {
        this.cardIssueCause = cardIssueCause;
    }


    /**
     * Gets the cardStatusCause value for this CompleteCardBean.
     * 
     * @return cardStatusCause
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause getCardStatusCause() {
        return cardStatusCause;
    }


    /**
     * Sets the cardStatusCause value for this CompleteCardBean.
     * 
     * @param cardStatusCause
     */
    public void setCardStatusCause(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatusCause cardStatusCause) {
        this.cardStatusCause = cardStatusCause;
    }


    /**
     * Gets the expireDate value for this CompleteCardBean.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this CompleteCardBean.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the issueDate value for this CompleteCardBean.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this CompleteCardBean.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the pan value for this CompleteCardBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CompleteCardBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the status value for this CompleteCardBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CompleteCardBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus status) {
        this.status = status;
    }


    /**
     * Gets the type value for this CompleteCardBean.
     * 
     * @return type
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType getType() {
        return type;
    }


    /**
     * Sets the type value for this CompleteCardBean.
     * 
     * @param type
     */
    public void setType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompleteCardBean)) return false;
        CompleteCardBean other = (CompleteCardBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardIssueCause==null && other.getCardIssueCause()==null) || 
             (this.cardIssueCause!=null &&
              this.cardIssueCause.equals(other.getCardIssueCause()))) &&
            ((this.cardStatusCause==null && other.getCardStatusCause()==null) || 
             (this.cardStatusCause!=null &&
              this.cardStatusCause.equals(other.getCardStatusCause()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getCardIssueCause() != null) {
            _hashCode += getCardIssueCause().hashCode();
        }
        if (getCardStatusCause() != null) {
            _hashCode += getCardStatusCause().hashCode();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompleteCardBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "completeCardBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardIssueCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardIssueCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardIssueCauseWS"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardType"));
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
