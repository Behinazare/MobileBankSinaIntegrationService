/**
 * BillBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String billId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS clearingStatus;

    private java.lang.String currency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS cycleStatus;

    private java.util.Calendar endCycleDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FeeBean[] fees;

    private java.lang.String loanNumber;

    private java.math.BigDecimal payedAmount;

    private java.math.BigDecimal preDebitAmount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInfoBean proposalLoan;

    private java.util.Calendar respiteDate;

    private java.util.Calendar startCycleDate;

    private java.math.BigDecimal withdrawableAmount;

    public BillBean() {
    }

    public BillBean(
           java.math.BigDecimal amount,
           java.lang.String billId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS clearingStatus,
           java.lang.String currency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS cycleStatus,
           java.util.Calendar endCycleDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FeeBean[] fees,
           java.lang.String loanNumber,
           java.math.BigDecimal payedAmount,
           java.math.BigDecimal preDebitAmount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInfoBean proposalLoan,
           java.util.Calendar respiteDate,
           java.util.Calendar startCycleDate,
           java.math.BigDecimal withdrawableAmount) {
           this.amount = amount;
           this.billId = billId;
           this.clearingStatus = clearingStatus;
           this.currency = currency;
           this.cycleStatus = cycleStatus;
           this.endCycleDate = endCycleDate;
           this.fees = fees;
           this.loanNumber = loanNumber;
           this.payedAmount = payedAmount;
           this.preDebitAmount = preDebitAmount;
           this.proposalLoan = proposalLoan;
           this.respiteDate = respiteDate;
           this.startCycleDate = startCycleDate;
           this.withdrawableAmount = withdrawableAmount;
    }


    /**
     * Gets the amount value for this BillBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the billId value for this BillBean.
     * 
     * @return billId
     */
    public java.lang.String getBillId() {
        return billId;
    }


    /**
     * Sets the billId value for this BillBean.
     * 
     * @param billId
     */
    public void setBillId(java.lang.String billId) {
        this.billId = billId;
    }


    /**
     * Gets the clearingStatus value for this BillBean.
     * 
     * @return clearingStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS getClearingStatus() {
        return clearingStatus;
    }


    /**
     * Sets the clearingStatus value for this BillBean.
     * 
     * @param clearingStatus
     */
    public void setClearingStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillClearingStatusWS clearingStatus) {
        this.clearingStatus = clearingStatus;
    }


    /**
     * Gets the currency value for this BillBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BillBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the cycleStatus value for this BillBean.
     * 
     * @return cycleStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS getCycleStatus() {
        return cycleStatus;
    }


    /**
     * Sets the cycleStatus value for this BillBean.
     * 
     * @param cycleStatus
     */
    public void setCycleStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillCycleStatusWS cycleStatus) {
        this.cycleStatus = cycleStatus;
    }


    /**
     * Gets the endCycleDate value for this BillBean.
     * 
     * @return endCycleDate
     */
    public java.util.Calendar getEndCycleDate() {
        return endCycleDate;
    }


    /**
     * Sets the endCycleDate value for this BillBean.
     * 
     * @param endCycleDate
     */
    public void setEndCycleDate(java.util.Calendar endCycleDate) {
        this.endCycleDate = endCycleDate;
    }


    /**
     * Gets the fees value for this BillBean.
     * 
     * @return fees
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FeeBean[] getFees() {
        return fees;
    }


    /**
     * Sets the fees value for this BillBean.
     * 
     * @param fees
     */
    public void setFees(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FeeBean[] fees) {
        this.fees = fees;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FeeBean getFees(int i) {
        return this.fees[i];
    }

    public void setFees(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.FeeBean _value) {
        this.fees[i] = _value;
    }


    /**
     * Gets the loanNumber value for this BillBean.
     * 
     * @return loanNumber
     */
    public java.lang.String getLoanNumber() {
        return loanNumber;
    }


    /**
     * Sets the loanNumber value for this BillBean.
     * 
     * @param loanNumber
     */
    public void setLoanNumber(java.lang.String loanNumber) {
        this.loanNumber = loanNumber;
    }


    /**
     * Gets the payedAmount value for this BillBean.
     * 
     * @return payedAmount
     */
    public java.math.BigDecimal getPayedAmount() {
        return payedAmount;
    }


    /**
     * Sets the payedAmount value for this BillBean.
     * 
     * @param payedAmount
     */
    public void setPayedAmount(java.math.BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
    }


    /**
     * Gets the preDebitAmount value for this BillBean.
     * 
     * @return preDebitAmount
     */
    public java.math.BigDecimal getPreDebitAmount() {
        return preDebitAmount;
    }


    /**
     * Sets the preDebitAmount value for this BillBean.
     * 
     * @param preDebitAmount
     */
    public void setPreDebitAmount(java.math.BigDecimal preDebitAmount) {
        this.preDebitAmount = preDebitAmount;
    }


    /**
     * Gets the proposalLoan value for this BillBean.
     * 
     * @return proposalLoan
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInfoBean getProposalLoan() {
        return proposalLoan;
    }


    /**
     * Sets the proposalLoan value for this BillBean.
     * 
     * @param proposalLoan
     */
    public void setProposalLoan(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInfoBean proposalLoan) {
        this.proposalLoan = proposalLoan;
    }


    /**
     * Gets the respiteDate value for this BillBean.
     * 
     * @return respiteDate
     */
    public java.util.Calendar getRespiteDate() {
        return respiteDate;
    }


    /**
     * Sets the respiteDate value for this BillBean.
     * 
     * @param respiteDate
     */
    public void setRespiteDate(java.util.Calendar respiteDate) {
        this.respiteDate = respiteDate;
    }


    /**
     * Gets the startCycleDate value for this BillBean.
     * 
     * @return startCycleDate
     */
    public java.util.Calendar getStartCycleDate() {
        return startCycleDate;
    }


    /**
     * Sets the startCycleDate value for this BillBean.
     * 
     * @param startCycleDate
     */
    public void setStartCycleDate(java.util.Calendar startCycleDate) {
        this.startCycleDate = startCycleDate;
    }


    /**
     * Gets the withdrawableAmount value for this BillBean.
     * 
     * @return withdrawableAmount
     */
    public java.math.BigDecimal getWithdrawableAmount() {
        return withdrawableAmount;
    }


    /**
     * Sets the withdrawableAmount value for this BillBean.
     * 
     * @param withdrawableAmount
     */
    public void setWithdrawableAmount(java.math.BigDecimal withdrawableAmount) {
        this.withdrawableAmount = withdrawableAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillBean)) return false;
        BillBean other = (BillBean) obj;
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
            ((this.clearingStatus==null && other.getClearingStatus()==null) || 
             (this.clearingStatus!=null &&
              this.clearingStatus.equals(other.getClearingStatus()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.cycleStatus==null && other.getCycleStatus()==null) || 
             (this.cycleStatus!=null &&
              this.cycleStatus.equals(other.getCycleStatus()))) &&
            ((this.endCycleDate==null && other.getEndCycleDate()==null) || 
             (this.endCycleDate!=null &&
              this.endCycleDate.equals(other.getEndCycleDate()))) &&
            ((this.fees==null && other.getFees()==null) || 
             (this.fees!=null &&
              java.util.Arrays.equals(this.fees, other.getFees()))) &&
            ((this.loanNumber==null && other.getLoanNumber()==null) || 
             (this.loanNumber!=null &&
              this.loanNumber.equals(other.getLoanNumber()))) &&
            ((this.payedAmount==null && other.getPayedAmount()==null) || 
             (this.payedAmount!=null &&
              this.payedAmount.equals(other.getPayedAmount()))) &&
            ((this.preDebitAmount==null && other.getPreDebitAmount()==null) || 
             (this.preDebitAmount!=null &&
              this.preDebitAmount.equals(other.getPreDebitAmount()))) &&
            ((this.proposalLoan==null && other.getProposalLoan()==null) || 
             (this.proposalLoan!=null &&
              this.proposalLoan.equals(other.getProposalLoan()))) &&
            ((this.respiteDate==null && other.getRespiteDate()==null) || 
             (this.respiteDate!=null &&
              this.respiteDate.equals(other.getRespiteDate()))) &&
            ((this.startCycleDate==null && other.getStartCycleDate()==null) || 
             (this.startCycleDate!=null &&
              this.startCycleDate.equals(other.getStartCycleDate()))) &&
            ((this.withdrawableAmount==null && other.getWithdrawableAmount()==null) || 
             (this.withdrawableAmount!=null &&
              this.withdrawableAmount.equals(other.getWithdrawableAmount())));
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
        if (getClearingStatus() != null) {
            _hashCode += getClearingStatus().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCycleStatus() != null) {
            _hashCode += getCycleStatus().hashCode();
        }
        if (getEndCycleDate() != null) {
            _hashCode += getEndCycleDate().hashCode();
        }
        if (getFees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoanNumber() != null) {
            _hashCode += getLoanNumber().hashCode();
        }
        if (getPayedAmount() != null) {
            _hashCode += getPayedAmount().hashCode();
        }
        if (getPreDebitAmount() != null) {
            _hashCode += getPreDebitAmount().hashCode();
        }
        if (getProposalLoan() != null) {
            _hashCode += getProposalLoan().hashCode();
        }
        if (getRespiteDate() != null) {
            _hashCode += getRespiteDate().hashCode();
        }
        if (getStartCycleDate() != null) {
            _hashCode += getStartCycleDate().hashCode();
        }
        if (getWithdrawableAmount() != null) {
            _hashCode += getWithdrawableAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billBean"));
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
        elemField.setFieldName("clearingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clearingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billClearingStatusWS"));
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
        elemField.setFieldName("cycleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billCycleStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "feeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDebitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preDebitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalLoan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proposalLoan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respiteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respiteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "withdrawableAmount"));
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
