/**
 * CardTransactionResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardTransactionResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS activityType;

    private java.math.BigDecimal amount;

    private java.lang.String description;

    private java.lang.String issuerName;

    private java.lang.String issuerNumber;

    private java.lang.String opponentDepositNumber;

    private java.lang.String opponentIssuerName;

    private java.lang.String opponentIssuerNumber;

    private java.lang.String opponentPan;

    private java.lang.String pan;

    private java.lang.String referenceNumber;

    private boolean showSystemReturnTransactions;

    private java.lang.String traceNumber;

    private java.util.Calendar transactionDate;

    private java.util.Calendar transactionSentDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS transactionType;

    public CardTransactionResponseBean() {
    }

    public CardTransactionResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS activityType,
           java.math.BigDecimal amount,
           java.lang.String description,
           java.lang.String issuerName,
           java.lang.String issuerNumber,
           java.lang.String opponentDepositNumber,
           java.lang.String opponentIssuerName,
           java.lang.String opponentIssuerNumber,
           java.lang.String opponentPan,
           java.lang.String pan,
           java.lang.String referenceNumber,
           boolean showSystemReturnTransactions,
           java.lang.String traceNumber,
           java.util.Calendar transactionDate,
           java.util.Calendar transactionSentDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS transactionType) {
           this.activityType = activityType;
           this.amount = amount;
           this.description = description;
           this.issuerName = issuerName;
           this.issuerNumber = issuerNumber;
           this.opponentDepositNumber = opponentDepositNumber;
           this.opponentIssuerName = opponentIssuerName;
           this.opponentIssuerNumber = opponentIssuerNumber;
           this.opponentPan = opponentPan;
           this.pan = pan;
           this.referenceNumber = referenceNumber;
           this.showSystemReturnTransactions = showSystemReturnTransactions;
           this.traceNumber = traceNumber;
           this.transactionDate = transactionDate;
           this.transactionSentDate = transactionSentDate;
           this.transactionType = transactionType;
    }


    /**
     * Gets the activityType value for this CardTransactionResponseBean.
     * 
     * @return activityType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this CardTransactionResponseBean.
     * 
     * @param activityType
     */
    public void setActivityType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the amount value for this CardTransactionResponseBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CardTransactionResponseBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the description value for this CardTransactionResponseBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CardTransactionResponseBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the issuerName value for this CardTransactionResponseBean.
     * 
     * @return issuerName
     */
    public java.lang.String getIssuerName() {
        return issuerName;
    }


    /**
     * Sets the issuerName value for this CardTransactionResponseBean.
     * 
     * @param issuerName
     */
    public void setIssuerName(java.lang.String issuerName) {
        this.issuerName = issuerName;
    }


    /**
     * Gets the issuerNumber value for this CardTransactionResponseBean.
     * 
     * @return issuerNumber
     */
    public java.lang.String getIssuerNumber() {
        return issuerNumber;
    }


    /**
     * Sets the issuerNumber value for this CardTransactionResponseBean.
     * 
     * @param issuerNumber
     */
    public void setIssuerNumber(java.lang.String issuerNumber) {
        this.issuerNumber = issuerNumber;
    }


    /**
     * Gets the opponentDepositNumber value for this CardTransactionResponseBean.
     * 
     * @return opponentDepositNumber
     */
    public java.lang.String getOpponentDepositNumber() {
        return opponentDepositNumber;
    }


    /**
     * Sets the opponentDepositNumber value for this CardTransactionResponseBean.
     * 
     * @param opponentDepositNumber
     */
    public void setOpponentDepositNumber(java.lang.String opponentDepositNumber) {
        this.opponentDepositNumber = opponentDepositNumber;
    }


    /**
     * Gets the opponentIssuerName value for this CardTransactionResponseBean.
     * 
     * @return opponentIssuerName
     */
    public java.lang.String getOpponentIssuerName() {
        return opponentIssuerName;
    }


    /**
     * Sets the opponentIssuerName value for this CardTransactionResponseBean.
     * 
     * @param opponentIssuerName
     */
    public void setOpponentIssuerName(java.lang.String opponentIssuerName) {
        this.opponentIssuerName = opponentIssuerName;
    }


    /**
     * Gets the opponentIssuerNumber value for this CardTransactionResponseBean.
     * 
     * @return opponentIssuerNumber
     */
    public java.lang.String getOpponentIssuerNumber() {
        return opponentIssuerNumber;
    }


    /**
     * Sets the opponentIssuerNumber value for this CardTransactionResponseBean.
     * 
     * @param opponentIssuerNumber
     */
    public void setOpponentIssuerNumber(java.lang.String opponentIssuerNumber) {
        this.opponentIssuerNumber = opponentIssuerNumber;
    }


    /**
     * Gets the opponentPan value for this CardTransactionResponseBean.
     * 
     * @return opponentPan
     */
    public java.lang.String getOpponentPan() {
        return opponentPan;
    }


    /**
     * Sets the opponentPan value for this CardTransactionResponseBean.
     * 
     * @param opponentPan
     */
    public void setOpponentPan(java.lang.String opponentPan) {
        this.opponentPan = opponentPan;
    }


    /**
     * Gets the pan value for this CardTransactionResponseBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardTransactionResponseBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the referenceNumber value for this CardTransactionResponseBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this CardTransactionResponseBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the showSystemReturnTransactions value for this CardTransactionResponseBean.
     * 
     * @return showSystemReturnTransactions
     */
    public boolean isShowSystemReturnTransactions() {
        return showSystemReturnTransactions;
    }


    /**
     * Sets the showSystemReturnTransactions value for this CardTransactionResponseBean.
     * 
     * @param showSystemReturnTransactions
     */
    public void setShowSystemReturnTransactions(boolean showSystemReturnTransactions) {
        this.showSystemReturnTransactions = showSystemReturnTransactions;
    }


    /**
     * Gets the traceNumber value for this CardTransactionResponseBean.
     * 
     * @return traceNumber
     */
    public java.lang.String getTraceNumber() {
        return traceNumber;
    }


    /**
     * Sets the traceNumber value for this CardTransactionResponseBean.
     * 
     * @param traceNumber
     */
    public void setTraceNumber(java.lang.String traceNumber) {
        this.traceNumber = traceNumber;
    }


    /**
     * Gets the transactionDate value for this CardTransactionResponseBean.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this CardTransactionResponseBean.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionSentDate value for this CardTransactionResponseBean.
     * 
     * @return transactionSentDate
     */
    public java.util.Calendar getTransactionSentDate() {
        return transactionSentDate;
    }


    /**
     * Sets the transactionSentDate value for this CardTransactionResponseBean.
     * 
     * @param transactionSentDate
     */
    public void setTransactionSentDate(java.util.Calendar transactionSentDate) {
        this.transactionSentDate = transactionSentDate;
    }


    /**
     * Gets the transactionType value for this CardTransactionResponseBean.
     * 
     * @return transactionType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this CardTransactionResponseBean.
     * 
     * @param transactionType
     */
    public void setTransactionType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS transactionType) {
        this.transactionType = transactionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardTransactionResponseBean)) return false;
        CardTransactionResponseBean other = (CardTransactionResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.issuerName==null && other.getIssuerName()==null) || 
             (this.issuerName!=null &&
              this.issuerName.equals(other.getIssuerName()))) &&
            ((this.issuerNumber==null && other.getIssuerNumber()==null) || 
             (this.issuerNumber!=null &&
              this.issuerNumber.equals(other.getIssuerNumber()))) &&
            ((this.opponentDepositNumber==null && other.getOpponentDepositNumber()==null) || 
             (this.opponentDepositNumber!=null &&
              this.opponentDepositNumber.equals(other.getOpponentDepositNumber()))) &&
            ((this.opponentIssuerName==null && other.getOpponentIssuerName()==null) || 
             (this.opponentIssuerName!=null &&
              this.opponentIssuerName.equals(other.getOpponentIssuerName()))) &&
            ((this.opponentIssuerNumber==null && other.getOpponentIssuerNumber()==null) || 
             (this.opponentIssuerNumber!=null &&
              this.opponentIssuerNumber.equals(other.getOpponentIssuerNumber()))) &&
            ((this.opponentPan==null && other.getOpponentPan()==null) || 
             (this.opponentPan!=null &&
              this.opponentPan.equals(other.getOpponentPan()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            this.showSystemReturnTransactions == other.isShowSystemReturnTransactions() &&
            ((this.traceNumber==null && other.getTraceNumber()==null) || 
             (this.traceNumber!=null &&
              this.traceNumber.equals(other.getTraceNumber()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transactionSentDate==null && other.getTransactionSentDate()==null) || 
             (this.transactionSentDate!=null &&
              this.transactionSentDate.equals(other.getTransactionSentDate()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType())));
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
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIssuerName() != null) {
            _hashCode += getIssuerName().hashCode();
        }
        if (getIssuerNumber() != null) {
            _hashCode += getIssuerNumber().hashCode();
        }
        if (getOpponentDepositNumber() != null) {
            _hashCode += getOpponentDepositNumber().hashCode();
        }
        if (getOpponentIssuerName() != null) {
            _hashCode += getOpponentIssuerName().hashCode();
        }
        if (getOpponentIssuerNumber() != null) {
            _hashCode += getOpponentIssuerNumber().hashCode();
        }
        if (getOpponentPan() != null) {
            _hashCode += getOpponentPan().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        _hashCode += (isShowSystemReturnTransactions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTraceNumber() != null) {
            _hashCode += getTraceNumber().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransactionSentDate() != null) {
            _hashCode += getTransactionSentDate().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardTransactionResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTransactionResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardActivityTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opponentDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opponentDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opponentIssuerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opponentIssuerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opponentIssuerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opponentIssuerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opponentPan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opponentPan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSystemReturnTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSystemReturnTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionSentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTransactionTypeWS"));
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
