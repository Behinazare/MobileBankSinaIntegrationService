/**
 * AutoTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AutoTransferRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionDateDetailBean[] autoTransactionDateDetails;

    private java.lang.String cif;

    private java.lang.String destinationDepositNumber;

    private java.lang.String payId;

    private java.lang.String reasonCode;

    private java.lang.String sourceDepositNumber;

    private java.util.Calendar startDate;

    private java.lang.Short termLength;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TermType termType;

    private java.lang.Short transactionCount;

    private java.lang.Long tryCountDay;

    public AutoTransferRequestBean() {
    }

    public AutoTransferRequestBean(
           java.math.BigDecimal amount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionDateDetailBean[] autoTransactionDateDetails,
           java.lang.String cif,
           java.lang.String destinationDepositNumber,
           java.lang.String payId,
           java.lang.String reasonCode,
           java.lang.String sourceDepositNumber,
           java.util.Calendar startDate,
           java.lang.Short termLength,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TermType termType,
           java.lang.Short transactionCount,
           java.lang.Long tryCountDay) {
           this.amount = amount;
           this.autoTransactionDateDetails = autoTransactionDateDetails;
           this.cif = cif;
           this.destinationDepositNumber = destinationDepositNumber;
           this.payId = payId;
           this.reasonCode = reasonCode;
           this.sourceDepositNumber = sourceDepositNumber;
           this.startDate = startDate;
           this.termLength = termLength;
           this.termType = termType;
           this.transactionCount = transactionCount;
           this.tryCountDay = tryCountDay;
    }


    /**
     * Gets the amount value for this AutoTransferRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AutoTransferRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the autoTransactionDateDetails value for this AutoTransferRequestBean.
     * 
     * @return autoTransactionDateDetails
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionDateDetailBean[] getAutoTransactionDateDetails() {
        return autoTransactionDateDetails;
    }


    /**
     * Sets the autoTransactionDateDetails value for this AutoTransferRequestBean.
     * 
     * @param autoTransactionDateDetails
     */
    public void setAutoTransactionDateDetails(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionDateDetailBean[] autoTransactionDateDetails) {
        this.autoTransactionDateDetails = autoTransactionDateDetails;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionDateDetailBean getAutoTransactionDateDetails(int i) {
        return this.autoTransactionDateDetails[i];
    }

    public void setAutoTransactionDateDetails(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AutoTransactionDateDetailBean _value) {
        this.autoTransactionDateDetails[i] = _value;
    }


    /**
     * Gets the cif value for this AutoTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this AutoTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the destinationDepositNumber value for this AutoTransferRequestBean.
     * 
     * @return destinationDepositNumber
     */
    public java.lang.String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }


    /**
     * Sets the destinationDepositNumber value for this AutoTransferRequestBean.
     * 
     * @param destinationDepositNumber
     */
    public void setDestinationDepositNumber(java.lang.String destinationDepositNumber) {
        this.destinationDepositNumber = destinationDepositNumber;
    }


    /**
     * Gets the payId value for this AutoTransferRequestBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this AutoTransferRequestBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the reasonCode value for this AutoTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this AutoTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the sourceDepositNumber value for this AutoTransferRequestBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AutoTransferRequestBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the startDate value for this AutoTransferRequestBean.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AutoTransferRequestBean.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the termLength value for this AutoTransferRequestBean.
     * 
     * @return termLength
     */
    public java.lang.Short getTermLength() {
        return termLength;
    }


    /**
     * Sets the termLength value for this AutoTransferRequestBean.
     * 
     * @param termLength
     */
    public void setTermLength(java.lang.Short termLength) {
        this.termLength = termLength;
    }


    /**
     * Gets the termType value for this AutoTransferRequestBean.
     * 
     * @return termType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TermType getTermType() {
        return termType;
    }


    /**
     * Sets the termType value for this AutoTransferRequestBean.
     * 
     * @param termType
     */
    public void setTermType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TermType termType) {
        this.termType = termType;
    }


    /**
     * Gets the transactionCount value for this AutoTransferRequestBean.
     * 
     * @return transactionCount
     */
    public java.lang.Short getTransactionCount() {
        return transactionCount;
    }


    /**
     * Sets the transactionCount value for this AutoTransferRequestBean.
     * 
     * @param transactionCount
     */
    public void setTransactionCount(java.lang.Short transactionCount) {
        this.transactionCount = transactionCount;
    }


    /**
     * Gets the tryCountDay value for this AutoTransferRequestBean.
     * 
     * @return tryCountDay
     */
    public java.lang.Long getTryCountDay() {
        return tryCountDay;
    }


    /**
     * Sets the tryCountDay value for this AutoTransferRequestBean.
     * 
     * @param tryCountDay
     */
    public void setTryCountDay(java.lang.Long tryCountDay) {
        this.tryCountDay = tryCountDay;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTransferRequestBean)) return false;
        AutoTransferRequestBean other = (AutoTransferRequestBean) obj;
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
            ((this.autoTransactionDateDetails==null && other.getAutoTransactionDateDetails()==null) || 
             (this.autoTransactionDateDetails!=null &&
              java.util.Arrays.equals(this.autoTransactionDateDetails, other.getAutoTransactionDateDetails()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.destinationDepositNumber==null && other.getDestinationDepositNumber()==null) || 
             (this.destinationDepositNumber!=null &&
              this.destinationDepositNumber.equals(other.getDestinationDepositNumber()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.termLength==null && other.getTermLength()==null) || 
             (this.termLength!=null &&
              this.termLength.equals(other.getTermLength()))) &&
            ((this.termType==null && other.getTermType()==null) || 
             (this.termType!=null &&
              this.termType.equals(other.getTermType()))) &&
            ((this.transactionCount==null && other.getTransactionCount()==null) || 
             (this.transactionCount!=null &&
              this.transactionCount.equals(other.getTransactionCount()))) &&
            ((this.tryCountDay==null && other.getTryCountDay()==null) || 
             (this.tryCountDay!=null &&
              this.tryCountDay.equals(other.getTryCountDay())));
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
        if (getAutoTransactionDateDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoTransactionDateDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoTransactionDateDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDestinationDepositNumber() != null) {
            _hashCode += getDestinationDepositNumber().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTermLength() != null) {
            _hashCode += getTermLength().hashCode();
        }
        if (getTermType() != null) {
            _hashCode += getTermType().hashCode();
        }
        if (getTransactionCount() != null) {
            _hashCode += getTransactionCount().hashCode();
        }
        if (getTryCountDay() != null) {
            _hashCode += getTryCountDay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransferRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTransactionDateDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTransactionDateDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "autoTransactionDateDetailBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "termType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "termType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tryCountDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tryCountDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
