/**
 * LoanListBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanListBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.util.Calendar beginDate;

    private java.lang.String branchCode;

    private java.lang.String branchName;

    private java.lang.String cbLoanNumber;

    private java.lang.String currency;

    private java.util.Calendar endDate;

    private java.lang.String loanNumber;

    private java.math.BigDecimal loanRemainder;

    private java.lang.Short payNumber;

    private java.math.BigDecimal preAmount;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState states;

    private java.lang.String type;

    public LoanListBean() {
    }

    public LoanListBean(
           java.math.BigDecimal amount,
           java.util.Calendar beginDate,
           java.lang.String branchCode,
           java.lang.String branchName,
           java.lang.String cbLoanNumber,
           java.lang.String currency,
           java.util.Calendar endDate,
           java.lang.String loanNumber,
           java.math.BigDecimal loanRemainder,
           java.lang.Short payNumber,
           java.math.BigDecimal preAmount,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState states,
           java.lang.String type) {
           this.amount = amount;
           this.beginDate = beginDate;
           this.branchCode = branchCode;
           this.branchName = branchName;
           this.cbLoanNumber = cbLoanNumber;
           this.currency = currency;
           this.endDate = endDate;
           this.loanNumber = loanNumber;
           this.loanRemainder = loanRemainder;
           this.payNumber = payNumber;
           this.preAmount = preAmount;
           this.states = states;
           this.type = type;
    }


    /**
     * Gets the amount value for this LoanListBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this LoanListBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the beginDate value for this LoanListBean.
     * 
     * @return beginDate
     */
    public java.util.Calendar getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this LoanListBean.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.util.Calendar beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the branchCode value for this LoanListBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this LoanListBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the branchName value for this LoanListBean.
     * 
     * @return branchName
     */
    public java.lang.String getBranchName() {
        return branchName;
    }


    /**
     * Sets the branchName value for this LoanListBean.
     * 
     * @param branchName
     */
    public void setBranchName(java.lang.String branchName) {
        this.branchName = branchName;
    }


    /**
     * Gets the cbLoanNumber value for this LoanListBean.
     * 
     * @return cbLoanNumber
     */
    public java.lang.String getCbLoanNumber() {
        return cbLoanNumber;
    }


    /**
     * Sets the cbLoanNumber value for this LoanListBean.
     * 
     * @param cbLoanNumber
     */
    public void setCbLoanNumber(java.lang.String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }


    /**
     * Gets the currency value for this LoanListBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this LoanListBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the endDate value for this LoanListBean.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this LoanListBean.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the loanNumber value for this LoanListBean.
     * 
     * @return loanNumber
     */
    public java.lang.String getLoanNumber() {
        return loanNumber;
    }


    /**
     * Sets the loanNumber value for this LoanListBean.
     * 
     * @param loanNumber
     */
    public void setLoanNumber(java.lang.String loanNumber) {
        this.loanNumber = loanNumber;
    }


    /**
     * Gets the loanRemainder value for this LoanListBean.
     * 
     * @return loanRemainder
     */
    public java.math.BigDecimal getLoanRemainder() {
        return loanRemainder;
    }


    /**
     * Sets the loanRemainder value for this LoanListBean.
     * 
     * @param loanRemainder
     */
    public void setLoanRemainder(java.math.BigDecimal loanRemainder) {
        this.loanRemainder = loanRemainder;
    }


    /**
     * Gets the payNumber value for this LoanListBean.
     * 
     * @return payNumber
     */
    public java.lang.Short getPayNumber() {
        return payNumber;
    }


    /**
     * Sets the payNumber value for this LoanListBean.
     * 
     * @param payNumber
     */
    public void setPayNumber(java.lang.Short payNumber) {
        this.payNumber = payNumber;
    }


    /**
     * Gets the preAmount value for this LoanListBean.
     * 
     * @return preAmount
     */
    public java.math.BigDecimal getPreAmount() {
        return preAmount;
    }


    /**
     * Sets the preAmount value for this LoanListBean.
     * 
     * @param preAmount
     */
    public void setPreAmount(java.math.BigDecimal preAmount) {
        this.preAmount = preAmount;
    }


    /**
     * Gets the states value for this LoanListBean.
     * 
     * @return states
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState getStates() {
        return states;
    }


    /**
     * Sets the states value for this LoanListBean.
     * 
     * @param states
     */
    public void setStates(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState states) {
        this.states = states;
    }


    /**
     * Gets the type value for this LoanListBean.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this LoanListBean.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanListBean)) return false;
        LoanListBean other = (LoanListBean) obj;
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
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.branchName==null && other.getBranchName()==null) || 
             (this.branchName!=null &&
              this.branchName.equals(other.getBranchName()))) &&
            ((this.cbLoanNumber==null && other.getCbLoanNumber()==null) || 
             (this.cbLoanNumber!=null &&
              this.cbLoanNumber.equals(other.getCbLoanNumber()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.loanNumber==null && other.getLoanNumber()==null) || 
             (this.loanNumber!=null &&
              this.loanNumber.equals(other.getLoanNumber()))) &&
            ((this.loanRemainder==null && other.getLoanRemainder()==null) || 
             (this.loanRemainder!=null &&
              this.loanRemainder.equals(other.getLoanRemainder()))) &&
            ((this.payNumber==null && other.getPayNumber()==null) || 
             (this.payNumber!=null &&
              this.payNumber.equals(other.getPayNumber()))) &&
            ((this.preAmount==null && other.getPreAmount()==null) || 
             (this.preAmount!=null &&
              this.preAmount.equals(other.getPreAmount()))) &&
            ((this.states==null && other.getStates()==null) || 
             (this.states!=null &&
              this.states.equals(other.getStates()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getBranchName() != null) {
            _hashCode += getBranchName().hashCode();
        }
        if (getCbLoanNumber() != null) {
            _hashCode += getCbLoanNumber().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLoanNumber() != null) {
            _hashCode += getLoanNumber().hashCode();
        }
        if (getLoanRemainder() != null) {
            _hashCode += getLoanRemainder().hashCode();
        }
        if (getPayNumber() != null) {
            _hashCode += getPayNumber().hashCode();
        }
        if (getPreAmount() != null) {
            _hashCode += getPreAmount().hashCode();
        }
        if (getStates() != null) {
            _hashCode += getStates().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanListBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanListBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchName"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanRemainder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanRemainder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("states");
        elemField.setXmlName(new javax.xml.namespace.QName("", "states"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
