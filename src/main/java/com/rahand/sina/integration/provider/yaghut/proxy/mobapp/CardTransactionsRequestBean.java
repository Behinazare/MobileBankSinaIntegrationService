/**
 * CardTransactionsRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CardTransactionsRequestBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS[] activityTypes;

    private java.lang.String description;

    private java.math.BigDecimal fromAmount;

    private java.util.Calendar fromDate;

    private java.lang.String issuerNumber;

    private java.lang.Long length;

    private java.lang.Long offset;

    private java.lang.String opponentIssuerNumber;

    private java.lang.String opponentPan;

    private java.lang.String pan;

    private java.lang.String referralNumber;

    private java.lang.Boolean showSystemReturnTransactions;

    private boolean showTotalRecord;

    private java.math.BigDecimal toAmount;

    private java.util.Calendar toDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS[] types;

    public CardTransactionsRequestBean() {
    }

    public CardTransactionsRequestBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS[] activityTypes,
           java.lang.String description,
           java.math.BigDecimal fromAmount,
           java.util.Calendar fromDate,
           java.lang.String issuerNumber,
           java.lang.Long length,
           java.lang.Long offset,
           java.lang.String opponentIssuerNumber,
           java.lang.String opponentPan,
           java.lang.String pan,
           java.lang.String referralNumber,
           java.lang.Boolean showSystemReturnTransactions,
           boolean showTotalRecord,
           java.math.BigDecimal toAmount,
           java.util.Calendar toDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS[] types) {
           this.activityTypes = activityTypes;
           this.description = description;
           this.fromAmount = fromAmount;
           this.fromDate = fromDate;
           this.issuerNumber = issuerNumber;
           this.length = length;
           this.offset = offset;
           this.opponentIssuerNumber = opponentIssuerNumber;
           this.opponentPan = opponentPan;
           this.pan = pan;
           this.referralNumber = referralNumber;
           this.showSystemReturnTransactions = showSystemReturnTransactions;
           this.showTotalRecord = showTotalRecord;
           this.toAmount = toAmount;
           this.toDate = toDate;
           this.types = types;
    }


    /**
     * Gets the activityTypes value for this CardTransactionsRequestBean.
     * 
     * @return activityTypes
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS[] getActivityTypes() {
        return activityTypes;
    }


    /**
     * Sets the activityTypes value for this CardTransactionsRequestBean.
     * 
     * @param activityTypes
     */
    public void setActivityTypes(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS[] activityTypes) {
        this.activityTypes = activityTypes;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS getActivityTypes(int i) {
        return this.activityTypes[i];
    }

    public void setActivityTypes(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardActivityTypeWS _value) {
        this.activityTypes[i] = _value;
    }


    /**
     * Gets the description value for this CardTransactionsRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CardTransactionsRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fromAmount value for this CardTransactionsRequestBean.
     * 
     * @return fromAmount
     */
    public java.math.BigDecimal getFromAmount() {
        return fromAmount;
    }


    /**
     * Sets the fromAmount value for this CardTransactionsRequestBean.
     * 
     * @param fromAmount
     */
    public void setFromAmount(java.math.BigDecimal fromAmount) {
        this.fromAmount = fromAmount;
    }


    /**
     * Gets the fromDate value for this CardTransactionsRequestBean.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this CardTransactionsRequestBean.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the issuerNumber value for this CardTransactionsRequestBean.
     * 
     * @return issuerNumber
     */
    public java.lang.String getIssuerNumber() {
        return issuerNumber;
    }


    /**
     * Sets the issuerNumber value for this CardTransactionsRequestBean.
     * 
     * @param issuerNumber
     */
    public void setIssuerNumber(java.lang.String issuerNumber) {
        this.issuerNumber = issuerNumber;
    }


    /**
     * Gets the length value for this CardTransactionsRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this CardTransactionsRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this CardTransactionsRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this CardTransactionsRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the opponentIssuerNumber value for this CardTransactionsRequestBean.
     * 
     * @return opponentIssuerNumber
     */
    public java.lang.String getOpponentIssuerNumber() {
        return opponentIssuerNumber;
    }


    /**
     * Sets the opponentIssuerNumber value for this CardTransactionsRequestBean.
     * 
     * @param opponentIssuerNumber
     */
    public void setOpponentIssuerNumber(java.lang.String opponentIssuerNumber) {
        this.opponentIssuerNumber = opponentIssuerNumber;
    }


    /**
     * Gets the opponentPan value for this CardTransactionsRequestBean.
     * 
     * @return opponentPan
     */
    public java.lang.String getOpponentPan() {
        return opponentPan;
    }


    /**
     * Sets the opponentPan value for this CardTransactionsRequestBean.
     * 
     * @param opponentPan
     */
    public void setOpponentPan(java.lang.String opponentPan) {
        this.opponentPan = opponentPan;
    }


    /**
     * Gets the pan value for this CardTransactionsRequestBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this CardTransactionsRequestBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the referralNumber value for this CardTransactionsRequestBean.
     * 
     * @return referralNumber
     */
    public java.lang.String getReferralNumber() {
        return referralNumber;
    }


    /**
     * Sets the referralNumber value for this CardTransactionsRequestBean.
     * 
     * @param referralNumber
     */
    public void setReferralNumber(java.lang.String referralNumber) {
        this.referralNumber = referralNumber;
    }


    /**
     * Gets the showSystemReturnTransactions value for this CardTransactionsRequestBean.
     * 
     * @return showSystemReturnTransactions
     */
    public java.lang.Boolean getShowSystemReturnTransactions() {
        return showSystemReturnTransactions;
    }


    /**
     * Sets the showSystemReturnTransactions value for this CardTransactionsRequestBean.
     * 
     * @param showSystemReturnTransactions
     */
    public void setShowSystemReturnTransactions(java.lang.Boolean showSystemReturnTransactions) {
        this.showSystemReturnTransactions = showSystemReturnTransactions;
    }


    /**
     * Gets the showTotalRecord value for this CardTransactionsRequestBean.
     * 
     * @return showTotalRecord
     */
    public boolean isShowTotalRecord() {
        return showTotalRecord;
    }


    /**
     * Sets the showTotalRecord value for this CardTransactionsRequestBean.
     * 
     * @param showTotalRecord
     */
    public void setShowTotalRecord(boolean showTotalRecord) {
        this.showTotalRecord = showTotalRecord;
    }


    /**
     * Gets the toAmount value for this CardTransactionsRequestBean.
     * 
     * @return toAmount
     */
    public java.math.BigDecimal getToAmount() {
        return toAmount;
    }


    /**
     * Sets the toAmount value for this CardTransactionsRequestBean.
     * 
     * @param toAmount
     */
    public void setToAmount(java.math.BigDecimal toAmount) {
        this.toAmount = toAmount;
    }


    /**
     * Gets the toDate value for this CardTransactionsRequestBean.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this CardTransactionsRequestBean.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the types value for this CardTransactionsRequestBean.
     * 
     * @return types
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this CardTransactionsRequestBean.
     * 
     * @param types
     */
    public void setTypes(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS[] types) {
        this.types = types;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS getTypes(int i) {
        return this.types[i];
    }

    public void setTypes(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardTransactionTypeWS _value) {
        this.types[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardTransactionsRequestBean)) return false;
        CardTransactionsRequestBean other = (CardTransactionsRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityTypes==null && other.getActivityTypes()==null) || 
             (this.activityTypes!=null &&
              java.util.Arrays.equals(this.activityTypes, other.getActivityTypes()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fromAmount==null && other.getFromAmount()==null) || 
             (this.fromAmount!=null &&
              this.fromAmount.equals(other.getFromAmount()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.issuerNumber==null && other.getIssuerNumber()==null) || 
             (this.issuerNumber!=null &&
              this.issuerNumber.equals(other.getIssuerNumber()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.opponentIssuerNumber==null && other.getOpponentIssuerNumber()==null) || 
             (this.opponentIssuerNumber!=null &&
              this.opponentIssuerNumber.equals(other.getOpponentIssuerNumber()))) &&
            ((this.opponentPan==null && other.getOpponentPan()==null) || 
             (this.opponentPan!=null &&
              this.opponentPan.equals(other.getOpponentPan()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.referralNumber==null && other.getReferralNumber()==null) || 
             (this.referralNumber!=null &&
              this.referralNumber.equals(other.getReferralNumber()))) &&
            ((this.showSystemReturnTransactions==null && other.getShowSystemReturnTransactions()==null) || 
             (this.showSystemReturnTransactions!=null &&
              this.showSystemReturnTransactions.equals(other.getShowSystemReturnTransactions()))) &&
            this.showTotalRecord == other.isShowTotalRecord() &&
            ((this.toAmount==null && other.getToAmount()==null) || 
             (this.toAmount!=null &&
              this.toAmount.equals(other.getToAmount()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes())));
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
        if (getActivityTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivityTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivityTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFromAmount() != null) {
            _hashCode += getFromAmount().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getIssuerNumber() != null) {
            _hashCode += getIssuerNumber().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
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
        if (getReferralNumber() != null) {
            _hashCode += getReferralNumber().hashCode();
        }
        if (getShowSystemReturnTransactions() != null) {
            _hashCode += getShowSystemReturnTransactions().hashCode();
        }
        _hashCode += (isShowTotalRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getToAmount() != null) {
            _hashCode += getToAmount().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
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
        new org.apache.axis.description.TypeDesc(CardTransactionsRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTransactionsRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardActivityTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("referralNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referralNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSystemReturnTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showSystemReturnTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showTotalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showTotalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("", "types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardTransactionTypeWS"));
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
