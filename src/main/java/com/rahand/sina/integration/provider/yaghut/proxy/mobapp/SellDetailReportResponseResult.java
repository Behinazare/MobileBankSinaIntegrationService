/**
 * SellDetailReportResponseResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SellDetailReportResponseResult  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private long id;

    private java.lang.Long mainTransactionId;

    private java.lang.String refNum;

    private java.lang.String resNum;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportReverseType reverseType;

    private java.util.Calendar time;

    public SellDetailReportResponseResult() {
    }

    public SellDetailReportResponseResult(
           java.math.BigDecimal amount,
           long id,
           java.lang.Long mainTransactionId,
           java.lang.String refNum,
           java.lang.String resNum,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportReverseType reverseType,
           java.util.Calendar time) {
           this.amount = amount;
           this.id = id;
           this.mainTransactionId = mainTransactionId;
           this.refNum = refNum;
           this.resNum = resNum;
           this.reverseType = reverseType;
           this.time = time;
    }


    /**
     * Gets the amount value for this SellDetailReportResponseResult.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SellDetailReportResponseResult.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the id value for this SellDetailReportResponseResult.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this SellDetailReportResponseResult.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the mainTransactionId value for this SellDetailReportResponseResult.
     * 
     * @return mainTransactionId
     */
    public java.lang.Long getMainTransactionId() {
        return mainTransactionId;
    }


    /**
     * Sets the mainTransactionId value for this SellDetailReportResponseResult.
     * 
     * @param mainTransactionId
     */
    public void setMainTransactionId(java.lang.Long mainTransactionId) {
        this.mainTransactionId = mainTransactionId;
    }


    /**
     * Gets the refNum value for this SellDetailReportResponseResult.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this SellDetailReportResponseResult.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the resNum value for this SellDetailReportResponseResult.
     * 
     * @return resNum
     */
    public java.lang.String getResNum() {
        return resNum;
    }


    /**
     * Sets the resNum value for this SellDetailReportResponseResult.
     * 
     * @param resNum
     */
    public void setResNum(java.lang.String resNum) {
        this.resNum = resNum;
    }


    /**
     * Gets the reverseType value for this SellDetailReportResponseResult.
     * 
     * @return reverseType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportReverseType getReverseType() {
        return reverseType;
    }


    /**
     * Sets the reverseType value for this SellDetailReportResponseResult.
     * 
     * @param reverseType
     */
    public void setReverseType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellReportReverseType reverseType) {
        this.reverseType = reverseType;
    }


    /**
     * Gets the time value for this SellDetailReportResponseResult.
     * 
     * @return time
     */
    public java.util.Calendar getTime() {
        return time;
    }


    /**
     * Sets the time value for this SellDetailReportResponseResult.
     * 
     * @param time
     */
    public void setTime(java.util.Calendar time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellDetailReportResponseResult)) return false;
        SellDetailReportResponseResult other = (SellDetailReportResponseResult) obj;
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
            this.id == other.getId() &&
            ((this.mainTransactionId==null && other.getMainTransactionId()==null) || 
             (this.mainTransactionId!=null &&
              this.mainTransactionId.equals(other.getMainTransactionId()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.resNum==null && other.getResNum()==null) || 
             (this.resNum!=null &&
              this.resNum.equals(other.getResNum()))) &&
            ((this.reverseType==null && other.getReverseType()==null) || 
             (this.reverseType!=null &&
              this.reverseType.equals(other.getReverseType()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getMainTransactionId() != null) {
            _hashCode += getMainTransactionId().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getResNum() != null) {
            _hashCode += getResNum().hashCode();
        }
        if (getReverseType() != null) {
            _hashCode += getReverseType().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellDetailReportResponseResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellDetailReportResponseResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellReportReverseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
