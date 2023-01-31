/**
 * SellReportResponseResultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SellReportResponseResultBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String billId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType;

    private java.lang.String customerRefNum;

    private long id;

    private java.lang.Long mainTransactionId;

    private java.lang.String paymentId;

    private java.lang.String refNum;

    private java.lang.String resNum;

    private java.util.Calendar time;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState txState;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType txType;

    public SellReportResponseResultBean() {
    }

    public SellReportResponseResultBean(
           java.math.BigDecimal amount,
           java.lang.String billId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType,
           java.lang.String customerRefNum,
           long id,
           java.lang.Long mainTransactionId,
           java.lang.String paymentId,
           java.lang.String refNum,
           java.lang.String resNum,
           java.util.Calendar time,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState txState,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType txType) {
           this.amount = amount;
           this.billId = billId;
           this.billType = billType;
           this.customerRefNum = customerRefNum;
           this.id = id;
           this.mainTransactionId = mainTransactionId;
           this.paymentId = paymentId;
           this.refNum = refNum;
           this.resNum = resNum;
           this.time = time;
           this.txState = txState;
           this.txType = txType;
    }


    /**
     * Gets the amount value for this SellReportResponseResultBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SellReportResponseResultBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the billId value for this SellReportResponseResultBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this SellReportResponseResultBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the billType value for this SellReportResponseResultBean.
     * 
     * @return billType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this SellReportResponseResultBean.
     * 
     * @param billType
     */
    public void setBillType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType) {
        this.billType = billType;
    }


    /**
     * Gets the customerRefNum value for this SellReportResponseResultBean.
     * 
     * @return customerRefNum
     */
    public java.lang.String getCustomerRefNum() {
        return customerRefNum;
    }


    /**
     * Sets the customerRefNum value for this SellReportResponseResultBean.
     * 
     * @param customerRefNum
     */
    public void setCustomerRefNum(java.lang.String customerRefNum) {
        this.customerRefNum = customerRefNum;
    }


    /**
     * Gets the id value for this SellReportResponseResultBean.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this SellReportResponseResultBean.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the mainTransactionId value for this SellReportResponseResultBean.
     * 
     * @return mainTransactionId
     */
    public java.lang.Long getMainTransactionId() {
        return mainTransactionId;
    }


    /**
     * Sets the mainTransactionId value for this SellReportResponseResultBean.
     * 
     * @param mainTransactionId
     */
    public void setMainTransactionId(java.lang.Long mainTransactionId) {
        this.mainTransactionId = mainTransactionId;
    }


    /**
     * Gets the paymentId value for this SellReportResponseResultBean.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this SellReportResponseResultBean.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the refNum value for this SellReportResponseResultBean.
     * 
     * @return refNum
     */
    public java.lang.String getRefNum() {
        return refNum;
    }


    /**
     * Sets the refNum value for this SellReportResponseResultBean.
     * 
     * @param refNum
     */
    public void setRefNum(java.lang.String refNum) {
        this.refNum = refNum;
    }


    /**
     * Gets the resNum value for this SellReportResponseResultBean.
     * 
     * @return resNum
     */
    public java.lang.String getResNum() {
        return resNum;
    }


    /**
     * Sets the resNum value for this SellReportResponseResultBean.
     * 
     * @param resNum
     */
    public void setResNum(java.lang.String resNum) {
        this.resNum = resNum;
    }


    /**
     * Gets the time value for this SellReportResponseResultBean.
     * 
     * @return time
     */
    public java.util.Calendar getTime() {
        return time;
    }


    /**
     * Sets the time value for this SellReportResponseResultBean.
     * 
     * @param time
     */
    public void setTime(java.util.Calendar time) {
        this.time = time;
    }


    /**
     * Gets the txState value for this SellReportResponseResultBean.
     * 
     * @return txState
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState getTxState() {
        return txState;
    }


    /**
     * Sets the txState value for this SellReportResponseResultBean.
     * 
     * @param txState
     */
    public void setTxState(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionState txState) {
        this.txState = txState;
    }


    /**
     * Gets the txType value for this SellReportResponseResultBean.
     * 
     * @return txType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType getTxType() {
        return txType;
    }


    /**
     * Sets the txType value for this SellReportResponseResultBean.
     * 
     * @param txType
     */
    public void setTxType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SellTransactionType txType) {
        this.txType = txType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellReportResponseResultBean)) return false;
        SellReportResponseResultBean other = (SellReportResponseResultBean) obj;
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
            ((this.billId==null && other.getBillId()==null) || 
             (this.billId!=null &&
              this.billId.equals(other.getBillId()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.customerRefNum==null && other.getCustomerRefNum()==null) || 
             (this.customerRefNum!=null &&
              this.customerRefNum.equals(other.getCustomerRefNum()))) &&
            this.id == other.getId() &&
            ((this.mainTransactionId==null && other.getMainTransactionId()==null) || 
             (this.mainTransactionId!=null &&
              this.mainTransactionId.equals(other.getMainTransactionId()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.refNum==null && other.getRefNum()==null) || 
             (this.refNum!=null &&
              this.refNum.equals(other.getRefNum()))) &&
            ((this.resNum==null && other.getResNum()==null) || 
             (this.resNum!=null &&
              this.resNum.equals(other.getResNum()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.txState==null && other.getTxState()==null) || 
             (this.txState!=null &&
              this.txState.equals(other.getTxState()))) &&
            ((this.txType==null && other.getTxType()==null) || 
             (this.txType!=null &&
              this.txType.equals(other.getTxType())));
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
        if (getBillId() != null) {
            _hashCode += getBillId().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getCustomerRefNum() != null) {
            _hashCode += getCustomerRefNum().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getMainTransactionId() != null) {
            _hashCode += getMainTransactionId().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getRefNum() != null) {
            _hashCode += getRefNum().hashCode();
        }
        if (getResNum() != null) {
            _hashCode += getResNum().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getTxState() != null) {
            _hashCode += getTxState().hashCode();
        }
        if (getTxType() != null) {
            _hashCode += getTxType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellReportResponseResultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellReportResponseResultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellTransactionState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sellTransactionType"));
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
