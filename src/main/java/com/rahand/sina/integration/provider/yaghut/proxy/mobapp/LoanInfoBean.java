/**
 * LoanInfoBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanInfoBean  implements java.io.Serializable {
    private java.math.BigDecimal debitAmountToLoan;

    private java.math.BigDecimal feeAmount;

    private java.util.Calendar firstLoanDate;

    private java.math.BigDecimal payAmount;

    private java.lang.Integer payCount;

    private java.lang.Integer payDistance;

    private java.math.BigDecimal totalPayAmount;

    private java.lang.String typeDescription;

    public LoanInfoBean() {
    }

    public LoanInfoBean(
           java.math.BigDecimal debitAmountToLoan,
           java.math.BigDecimal feeAmount,
           java.util.Calendar firstLoanDate,
           java.math.BigDecimal payAmount,
           java.lang.Integer payCount,
           java.lang.Integer payDistance,
           java.math.BigDecimal totalPayAmount,
           java.lang.String typeDescription) {
           this.debitAmountToLoan = debitAmountToLoan;
           this.feeAmount = feeAmount;
           this.firstLoanDate = firstLoanDate;
           this.payAmount = payAmount;
           this.payCount = payCount;
           this.payDistance = payDistance;
           this.totalPayAmount = totalPayAmount;
           this.typeDescription = typeDescription;
    }


    /**
     * Gets the debitAmountToLoan value for this LoanInfoBean.
     * 
     * @return debitAmountToLoan
     */
    public java.math.BigDecimal getDebitAmountToLoan() {
        return debitAmountToLoan;
    }


    /**
     * Sets the debitAmountToLoan value for this LoanInfoBean.
     * 
     * @param debitAmountToLoan
     */
    public void setDebitAmountToLoan(java.math.BigDecimal debitAmountToLoan) {
        this.debitAmountToLoan = debitAmountToLoan;
    }


    /**
     * Gets the feeAmount value for this LoanInfoBean.
     * 
     * @return feeAmount
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this LoanInfoBean.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the firstLoanDate value for this LoanInfoBean.
     * 
     * @return firstLoanDate
     */
    public java.util.Calendar getFirstLoanDate() {
        return firstLoanDate;
    }


    /**
     * Sets the firstLoanDate value for this LoanInfoBean.
     * 
     * @param firstLoanDate
     */
    public void setFirstLoanDate(java.util.Calendar firstLoanDate) {
        this.firstLoanDate = firstLoanDate;
    }


    /**
     * Gets the payAmount value for this LoanInfoBean.
     * 
     * @return payAmount
     */
    public java.math.BigDecimal getPayAmount() {
        return payAmount;
    }


    /**
     * Sets the payAmount value for this LoanInfoBean.
     * 
     * @param payAmount
     */
    public void setPayAmount(java.math.BigDecimal payAmount) {
        this.payAmount = payAmount;
    }


    /**
     * Gets the payCount value for this LoanInfoBean.
     * 
     * @return payCount
     */
    public java.lang.Integer getPayCount() {
        return payCount;
    }


    /**
     * Sets the payCount value for this LoanInfoBean.
     * 
     * @param payCount
     */
    public void setPayCount(java.lang.Integer payCount) {
        this.payCount = payCount;
    }


    /**
     * Gets the payDistance value for this LoanInfoBean.
     * 
     * @return payDistance
     */
    public java.lang.Integer getPayDistance() {
        return payDistance;
    }


    /**
     * Sets the payDistance value for this LoanInfoBean.
     * 
     * @param payDistance
     */
    public void setPayDistance(java.lang.Integer payDistance) {
        this.payDistance = payDistance;
    }


    /**
     * Gets the totalPayAmount value for this LoanInfoBean.
     * 
     * @return totalPayAmount
     */
    public java.math.BigDecimal getTotalPayAmount() {
        return totalPayAmount;
    }


    /**
     * Sets the totalPayAmount value for this LoanInfoBean.
     * 
     * @param totalPayAmount
     */
    public void setTotalPayAmount(java.math.BigDecimal totalPayAmount) {
        this.totalPayAmount = totalPayAmount;
    }


    /**
     * Gets the typeDescription value for this LoanInfoBean.
     * 
     * @return typeDescription
     */
    public java.lang.String getTypeDescription() {
        return typeDescription;
    }


    /**
     * Sets the typeDescription value for this LoanInfoBean.
     * 
     * @param typeDescription
     */
    public void setTypeDescription(java.lang.String typeDescription) {
        this.typeDescription = typeDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanInfoBean)) return false;
        LoanInfoBean other = (LoanInfoBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.debitAmountToLoan==null && other.getDebitAmountToLoan()==null) || 
             (this.debitAmountToLoan!=null &&
              this.debitAmountToLoan.equals(other.getDebitAmountToLoan()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.firstLoanDate==null && other.getFirstLoanDate()==null) || 
             (this.firstLoanDate!=null &&
              this.firstLoanDate.equals(other.getFirstLoanDate()))) &&
            ((this.payAmount==null && other.getPayAmount()==null) || 
             (this.payAmount!=null &&
              this.payAmount.equals(other.getPayAmount()))) &&
            ((this.payCount==null && other.getPayCount()==null) || 
             (this.payCount!=null &&
              this.payCount.equals(other.getPayCount()))) &&
            ((this.payDistance==null && other.getPayDistance()==null) || 
             (this.payDistance!=null &&
              this.payDistance.equals(other.getPayDistance()))) &&
            ((this.totalPayAmount==null && other.getTotalPayAmount()==null) || 
             (this.totalPayAmount!=null &&
              this.totalPayAmount.equals(other.getTotalPayAmount()))) &&
            ((this.typeDescription==null && other.getTypeDescription()==null) || 
             (this.typeDescription!=null &&
              this.typeDescription.equals(other.getTypeDescription())));
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
        if (getDebitAmountToLoan() != null) {
            _hashCode += getDebitAmountToLoan().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getFirstLoanDate() != null) {
            _hashCode += getFirstLoanDate().hashCode();
        }
        if (getPayAmount() != null) {
            _hashCode += getPayAmount().hashCode();
        }
        if (getPayCount() != null) {
            _hashCode += getPayCount().hashCode();
        }
        if (getPayDistance() != null) {
            _hashCode += getPayDistance().hashCode();
        }
        if (getTotalPayAmount() != null) {
            _hashCode += getTotalPayAmount().hashCode();
        }
        if (getTypeDescription() != null) {
            _hashCode += getTypeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanInfoBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanInfoBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmountToLoan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitAmountToLoan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstLoanDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstLoanDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPayAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPayAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeDescription"));
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
