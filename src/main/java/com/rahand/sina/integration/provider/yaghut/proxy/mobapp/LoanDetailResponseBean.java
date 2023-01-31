/**
 * LoanDetailResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanDetailResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String automaticPaymentAccountNumber;

    private java.lang.String cbLoanNumber;

    private java.lang.Integer countOfMaturedUnpaid;

    private java.lang.Integer countOfPaid;

    private java.lang.Integer countOfUnpaid;

    private java.lang.String currency;

    private java.math.BigDecimal discount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanRowBean[] loanRows;

    private java.math.BigDecimal penalty;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState state;

    private java.math.BigDecimal totalMaturedUnpaidAmount;

    private java.math.BigDecimal totalPaidAmount;

    private java.lang.Integer totalRecord;

    private java.math.BigDecimal totalUnpaidAmount;

    public LoanDetailResponseBean() {
    }

    public LoanDetailResponseBean(
           java.math.BigDecimal amount,
           java.lang.String automaticPaymentAccountNumber,
           java.lang.String cbLoanNumber,
           java.lang.Integer countOfMaturedUnpaid,
           java.lang.Integer countOfPaid,
           java.lang.Integer countOfUnpaid,
           java.lang.String currency,
           java.math.BigDecimal discount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanRowBean[] loanRows,
           java.math.BigDecimal penalty,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState state,
           java.math.BigDecimal totalMaturedUnpaidAmount,
           java.math.BigDecimal totalPaidAmount,
           java.lang.Integer totalRecord,
           java.math.BigDecimal totalUnpaidAmount) {
           this.amount = amount;
           this.automaticPaymentAccountNumber = automaticPaymentAccountNumber;
           this.cbLoanNumber = cbLoanNumber;
           this.countOfMaturedUnpaid = countOfMaturedUnpaid;
           this.countOfPaid = countOfPaid;
           this.countOfUnpaid = countOfUnpaid;
           this.currency = currency;
           this.discount = discount;
           this.loanRows = loanRows;
           this.penalty = penalty;
           this.state = state;
           this.totalMaturedUnpaidAmount = totalMaturedUnpaidAmount;
           this.totalPaidAmount = totalPaidAmount;
           this.totalRecord = totalRecord;
           this.totalUnpaidAmount = totalUnpaidAmount;
    }


    /**
     * Gets the amount value for this LoanDetailResponseBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this LoanDetailResponseBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the automaticPaymentAccountNumber value for this LoanDetailResponseBean.
     * 
     * @return automaticPaymentAccountNumber
     */
    public java.lang.String getAutomaticPaymentAccountNumber() {
        return automaticPaymentAccountNumber;
    }


    /**
     * Sets the automaticPaymentAccountNumber value for this LoanDetailResponseBean.
     * 
     * @param automaticPaymentAccountNumber
     */
    public void setAutomaticPaymentAccountNumber(java.lang.String automaticPaymentAccountNumber) {
        this.automaticPaymentAccountNumber = automaticPaymentAccountNumber;
    }


    /**
     * Gets the cbLoanNumber value for this LoanDetailResponseBean.
     * 
     * @return cbLoanNumber
     */
    public java.lang.String getCbLoanNumber() {
        return cbLoanNumber;
    }


    /**
     * Sets the cbLoanNumber value for this LoanDetailResponseBean.
     * 
     * @param cbLoanNumber
     */
    public void setCbLoanNumber(java.lang.String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }


    /**
     * Gets the countOfMaturedUnpaid value for this LoanDetailResponseBean.
     * 
     * @return countOfMaturedUnpaid
     */
    public java.lang.Integer getCountOfMaturedUnpaid() {
        return countOfMaturedUnpaid;
    }


    /**
     * Sets the countOfMaturedUnpaid value for this LoanDetailResponseBean.
     * 
     * @param countOfMaturedUnpaid
     */
    public void setCountOfMaturedUnpaid(java.lang.Integer countOfMaturedUnpaid) {
        this.countOfMaturedUnpaid = countOfMaturedUnpaid;
    }


    /**
     * Gets the countOfPaid value for this LoanDetailResponseBean.
     * 
     * @return countOfPaid
     */
    public java.lang.Integer getCountOfPaid() {
        return countOfPaid;
    }


    /**
     * Sets the countOfPaid value for this LoanDetailResponseBean.
     * 
     * @param countOfPaid
     */
    public void setCountOfPaid(java.lang.Integer countOfPaid) {
        this.countOfPaid = countOfPaid;
    }


    /**
     * Gets the countOfUnpaid value for this LoanDetailResponseBean.
     * 
     * @return countOfUnpaid
     */
    public java.lang.Integer getCountOfUnpaid() {
        return countOfUnpaid;
    }


    /**
     * Sets the countOfUnpaid value for this LoanDetailResponseBean.
     * 
     * @param countOfUnpaid
     */
    public void setCountOfUnpaid(java.lang.Integer countOfUnpaid) {
        this.countOfUnpaid = countOfUnpaid;
    }


    /**
     * Gets the currency value for this LoanDetailResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this LoanDetailResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the discount value for this LoanDetailResponseBean.
     * 
     * @return discount
     */
    public java.math.BigDecimal getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this LoanDetailResponseBean.
     * 
     * @param discount
     */
    public void setDiscount(java.math.BigDecimal discount) {
        this.discount = discount;
    }


    /**
     * Gets the loanRows value for this LoanDetailResponseBean.
     * 
     * @return loanRows
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanRowBean[] getLoanRows() {
        return loanRows;
    }


    /**
     * Sets the loanRows value for this LoanDetailResponseBean.
     * 
     * @param loanRows
     */
    public void setLoanRows(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanRowBean[] loanRows) {
        this.loanRows = loanRows;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanRowBean getLoanRows(int i) {
        return this.loanRows[i];
    }

    public void setLoanRows(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanRowBean _value) {
        this.loanRows[i] = _value;
    }


    /**
     * Gets the penalty value for this LoanDetailResponseBean.
     * 
     * @return penalty
     */
    public java.math.BigDecimal getPenalty() {
        return penalty;
    }


    /**
     * Sets the penalty value for this LoanDetailResponseBean.
     * 
     * @param penalty
     */
    public void setPenalty(java.math.BigDecimal penalty) {
        this.penalty = penalty;
    }


    /**
     * Gets the state value for this LoanDetailResponseBean.
     * 
     * @return state
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState getState() {
        return state;
    }


    /**
     * Sets the state value for this LoanDetailResponseBean.
     * 
     * @param state
     */
    public void setState(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState state) {
        this.state = state;
    }


    /**
     * Gets the totalMaturedUnpaidAmount value for this LoanDetailResponseBean.
     * 
     * @return totalMaturedUnpaidAmount
     */
    public java.math.BigDecimal getTotalMaturedUnpaidAmount() {
        return totalMaturedUnpaidAmount;
    }


    /**
     * Sets the totalMaturedUnpaidAmount value for this LoanDetailResponseBean.
     * 
     * @param totalMaturedUnpaidAmount
     */
    public void setTotalMaturedUnpaidAmount(java.math.BigDecimal totalMaturedUnpaidAmount) {
        this.totalMaturedUnpaidAmount = totalMaturedUnpaidAmount;
    }


    /**
     * Gets the totalPaidAmount value for this LoanDetailResponseBean.
     * 
     * @return totalPaidAmount
     */
    public java.math.BigDecimal getTotalPaidAmount() {
        return totalPaidAmount;
    }


    /**
     * Sets the totalPaidAmount value for this LoanDetailResponseBean.
     * 
     * @param totalPaidAmount
     */
    public void setTotalPaidAmount(java.math.BigDecimal totalPaidAmount) {
        this.totalPaidAmount = totalPaidAmount;
    }


    /**
     * Gets the totalRecord value for this LoanDetailResponseBean.
     * 
     * @return totalRecord
     */
    public java.lang.Integer getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this LoanDetailResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(java.lang.Integer totalRecord) {
        this.totalRecord = totalRecord;
    }


    /**
     * Gets the totalUnpaidAmount value for this LoanDetailResponseBean.
     * 
     * @return totalUnpaidAmount
     */
    public java.math.BigDecimal getTotalUnpaidAmount() {
        return totalUnpaidAmount;
    }


    /**
     * Sets the totalUnpaidAmount value for this LoanDetailResponseBean.
     * 
     * @param totalUnpaidAmount
     */
    public void setTotalUnpaidAmount(java.math.BigDecimal totalUnpaidAmount) {
        this.totalUnpaidAmount = totalUnpaidAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanDetailResponseBean)) return false;
        LoanDetailResponseBean other = (LoanDetailResponseBean) obj;
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
            ((this.automaticPaymentAccountNumber==null && other.getAutomaticPaymentAccountNumber()==null) || 
             (this.automaticPaymentAccountNumber!=null &&
              this.automaticPaymentAccountNumber.equals(other.getAutomaticPaymentAccountNumber()))) &&
            ((this.cbLoanNumber==null && other.getCbLoanNumber()==null) || 
             (this.cbLoanNumber!=null &&
              this.cbLoanNumber.equals(other.getCbLoanNumber()))) &&
            ((this.countOfMaturedUnpaid==null && other.getCountOfMaturedUnpaid()==null) || 
             (this.countOfMaturedUnpaid!=null &&
              this.countOfMaturedUnpaid.equals(other.getCountOfMaturedUnpaid()))) &&
            ((this.countOfPaid==null && other.getCountOfPaid()==null) || 
             (this.countOfPaid!=null &&
              this.countOfPaid.equals(other.getCountOfPaid()))) &&
            ((this.countOfUnpaid==null && other.getCountOfUnpaid()==null) || 
             (this.countOfUnpaid!=null &&
              this.countOfUnpaid.equals(other.getCountOfUnpaid()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.loanRows==null && other.getLoanRows()==null) || 
             (this.loanRows!=null &&
              java.util.Arrays.equals(this.loanRows, other.getLoanRows()))) &&
            ((this.penalty==null && other.getPenalty()==null) || 
             (this.penalty!=null &&
              this.penalty.equals(other.getPenalty()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.totalMaturedUnpaidAmount==null && other.getTotalMaturedUnpaidAmount()==null) || 
             (this.totalMaturedUnpaidAmount!=null &&
              this.totalMaturedUnpaidAmount.equals(other.getTotalMaturedUnpaidAmount()))) &&
            ((this.totalPaidAmount==null && other.getTotalPaidAmount()==null) || 
             (this.totalPaidAmount!=null &&
              this.totalPaidAmount.equals(other.getTotalPaidAmount()))) &&
            ((this.totalRecord==null && other.getTotalRecord()==null) || 
             (this.totalRecord!=null &&
              this.totalRecord.equals(other.getTotalRecord()))) &&
            ((this.totalUnpaidAmount==null && other.getTotalUnpaidAmount()==null) || 
             (this.totalUnpaidAmount!=null &&
              this.totalUnpaidAmount.equals(other.getTotalUnpaidAmount())));
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
        if (getAutomaticPaymentAccountNumber() != null) {
            _hashCode += getAutomaticPaymentAccountNumber().hashCode();
        }
        if (getCbLoanNumber() != null) {
            _hashCode += getCbLoanNumber().hashCode();
        }
        if (getCountOfMaturedUnpaid() != null) {
            _hashCode += getCountOfMaturedUnpaid().hashCode();
        }
        if (getCountOfPaid() != null) {
            _hashCode += getCountOfPaid().hashCode();
        }
        if (getCountOfUnpaid() != null) {
            _hashCode += getCountOfUnpaid().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getLoanRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoanRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoanRows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPenalty() != null) {
            _hashCode += getPenalty().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTotalMaturedUnpaidAmount() != null) {
            _hashCode += getTotalMaturedUnpaidAmount().hashCode();
        }
        if (getTotalPaidAmount() != null) {
            _hashCode += getTotalPaidAmount().hashCode();
        }
        if (getTotalRecord() != null) {
            _hashCode += getTotalRecord().hashCode();
        }
        if (getTotalUnpaidAmount() != null) {
            _hashCode += getTotalUnpaidAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanDetailResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanDetailResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automaticPaymentAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "automaticPaymentAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbLoanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbLoanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countOfMaturedUnpaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countOfMaturedUnpaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countOfPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countOfPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countOfUnpaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countOfUnpaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanRowBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penalty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "penalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMaturedUnpaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMaturedUnpaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPaidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUnpaidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalUnpaidAmount"));
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
