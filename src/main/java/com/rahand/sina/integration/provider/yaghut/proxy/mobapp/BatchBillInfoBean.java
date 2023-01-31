/**
 * BatchBillInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BatchBillInfoBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String billId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType;

    private boolean doneCompletely;

    private java.lang.String foreignTitle;

    private java.lang.String payId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS problemType;

    private java.lang.String title;

    public BatchBillInfoBean() {
    }

    public BatchBillInfoBean(
           java.math.BigDecimal amount,
           java.lang.String billId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType,
           boolean doneCompletely,
           java.lang.String foreignTitle,
           java.lang.String payId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS problemType,
           java.lang.String title) {
           this.amount = amount;
           this.billId = billId;
           this.billType = billType;
           this.doneCompletely = doneCompletely;
           this.foreignTitle = foreignTitle;
           this.payId = payId;
           this.problemType = problemType;
           this.title = title;
    }


    /**
     * Gets the amount value for this BatchBillInfoBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BatchBillInfoBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the billId value for this BatchBillInfoBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this BatchBillInfoBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the billType value for this BatchBillInfoBean.
     * 
     * @return billType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this BatchBillInfoBean.
     * 
     * @param billType
     */
    public void setBillType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillType billType) {
        this.billType = billType;
    }


    /**
     * Gets the doneCompletely value for this BatchBillInfoBean.
     * 
     * @return doneCompletely
     */
    public boolean isDoneCompletely() {
        return doneCompletely;
    }


    /**
     * Sets the doneCompletely value for this BatchBillInfoBean.
     * 
     * @param doneCompletely
     */
    public void setDoneCompletely(boolean doneCompletely) {
        this.doneCompletely = doneCompletely;
    }


    /**
     * Gets the foreignTitle value for this BatchBillInfoBean.
     * 
     * @return foreignTitle
     */
    public java.lang.String getForeignTitle() {
        return foreignTitle;
    }


    /**
     * Sets the foreignTitle value for this BatchBillInfoBean.
     * 
     * @param foreignTitle
     */
    public void setForeignTitle(java.lang.String foreignTitle) {
        this.foreignTitle = foreignTitle;
    }


    /**
     * Gets the payId value for this BatchBillInfoBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this BatchBillInfoBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the problemType value for this BatchBillInfoBean.
     * 
     * @return problemType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this BatchBillInfoBean.
     * 
     * @param problemType
     */
    public void setProblemType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS problemType) {
        this.problemType = problemType;
    }


    /**
     * Gets the title value for this BatchBillInfoBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this BatchBillInfoBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchBillInfoBean)) return false;
        BatchBillInfoBean other = (BatchBillInfoBean) obj;
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
            this.doneCompletely == other.isDoneCompletely() &&
            ((this.foreignTitle==null && other.getForeignTitle()==null) || 
             (this.foreignTitle!=null &&
              this.foreignTitle.equals(other.getForeignTitle()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.problemType==null && other.getProblemType()==null) || 
             (this.problemType!=null &&
              this.problemType.equals(other.getProblemType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        _hashCode += (isDoneCompletely() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getForeignTitle() != null) {
            _hashCode += getForeignTitle().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getProblemType() != null) {
            _hashCode += getProblemType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchBillInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchBillInfoBean"));
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
        elemField.setFieldName("doneCompletely");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doneCompletely"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "problemTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
