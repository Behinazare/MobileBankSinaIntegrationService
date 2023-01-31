/**
 * DepositStatementSummaryBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositStatementSummaryBean  implements java.io.Serializable {
    private java.math.BigDecimal balance;

    private int creditCount;

    private int debitCount;

    private java.util.Calendar issueDate;

    private int totalCount;

    private java.math.BigDecimal totalCreditAmount;

    private java.math.BigDecimal totalDebitAmount;

    public DepositStatementSummaryBean() {
    }

    public DepositStatementSummaryBean(
           java.math.BigDecimal balance,
           int creditCount,
           int debitCount,
           java.util.Calendar issueDate,
           int totalCount,
           java.math.BigDecimal totalCreditAmount,
           java.math.BigDecimal totalDebitAmount) {
           this.balance = balance;
           this.creditCount = creditCount;
           this.debitCount = debitCount;
           this.issueDate = issueDate;
           this.totalCount = totalCount;
           this.totalCreditAmount = totalCreditAmount;
           this.totalDebitAmount = totalDebitAmount;
    }


    /**
     * Gets the balance value for this DepositStatementSummaryBean.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this DepositStatementSummaryBean.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the creditCount value for this DepositStatementSummaryBean.
     * 
     * @return creditCount
     */
    public int getCreditCount() {
        return creditCount;
    }


    /**
     * Sets the creditCount value for this DepositStatementSummaryBean.
     * 
     * @param creditCount
     */
    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }


    /**
     * Gets the debitCount value for this DepositStatementSummaryBean.
     * 
     * @return debitCount
     */
    public int getDebitCount() {
        return debitCount;
    }


    /**
     * Sets the debitCount value for this DepositStatementSummaryBean.
     * 
     * @param debitCount
     */
    public void setDebitCount(int debitCount) {
        this.debitCount = debitCount;
    }


    /**
     * Gets the issueDate value for this DepositStatementSummaryBean.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this DepositStatementSummaryBean.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the totalCount value for this DepositStatementSummaryBean.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this DepositStatementSummaryBean.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * Gets the totalCreditAmount value for this DepositStatementSummaryBean.
     * 
     * @return totalCreditAmount
     */
    public java.math.BigDecimal getTotalCreditAmount() {
        return totalCreditAmount;
    }


    /**
     * Sets the totalCreditAmount value for this DepositStatementSummaryBean.
     * 
     * @param totalCreditAmount
     */
    public void setTotalCreditAmount(java.math.BigDecimal totalCreditAmount) {
        this.totalCreditAmount = totalCreditAmount;
    }


    /**
     * Gets the totalDebitAmount value for this DepositStatementSummaryBean.
     * 
     * @return totalDebitAmount
     */
    public java.math.BigDecimal getTotalDebitAmount() {
        return totalDebitAmount;
    }


    /**
     * Sets the totalDebitAmount value for this DepositStatementSummaryBean.
     * 
     * @param totalDebitAmount
     */
    public void setTotalDebitAmount(java.math.BigDecimal totalDebitAmount) {
        this.totalDebitAmount = totalDebitAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositStatementSummaryBean)) return false;
        DepositStatementSummaryBean other = (DepositStatementSummaryBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            this.creditCount == other.getCreditCount() &&
            this.debitCount == other.getDebitCount() &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            this.totalCount == other.getTotalCount() &&
            ((this.totalCreditAmount==null && other.getTotalCreditAmount()==null) || 
             (this.totalCreditAmount!=null &&
              this.totalCreditAmount.equals(other.getTotalCreditAmount()))) &&
            ((this.totalDebitAmount==null && other.getTotalDebitAmount()==null) || 
             (this.totalDebitAmount!=null &&
              this.totalDebitAmount.equals(other.getTotalDebitAmount())));
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        _hashCode += getCreditCount();
        _hashCode += getDebitCount();
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        _hashCode += getTotalCount();
        if (getTotalCreditAmount() != null) {
            _hashCode += getTotalCreditAmount().hashCode();
        }
        if (getTotalDebitAmount() != null) {
            _hashCode += getTotalDebitAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepositStatementSummaryBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositStatementSummaryBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCreditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCreditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDebitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalDebitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
