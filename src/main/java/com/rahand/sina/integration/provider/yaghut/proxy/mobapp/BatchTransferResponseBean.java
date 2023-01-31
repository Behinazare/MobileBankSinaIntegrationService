/**
 * BatchTransferResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BatchTransferResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal balance;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo;

    private java.lang.String currency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositProblemBean[] depositProblem;

    private java.lang.Boolean doneCompletely;

    private java.lang.String transferId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BatchTransferResultBean[] transferResults;

    public BatchTransferResponseBean() {
    }

    public BatchTransferResponseBean(
           java.math.BigDecimal balance,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo,
           java.lang.String currency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositProblemBean[] depositProblem,
           java.lang.Boolean doneCompletely,
           java.lang.String transferId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BatchTransferResultBean[] transferResults) {
           this.balance = balance;
           this.commissionResultInfo = commissionResultInfo;
           this.currency = currency;
           this.depositProblem = depositProblem;
           this.doneCompletely = doneCompletely;
           this.transferId = transferId;
           this.transferResults = transferResults;
    }


    /**
     * Gets the balance value for this BatchTransferResponseBean.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this BatchTransferResponseBean.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the commissionResultInfo value for this BatchTransferResponseBean.
     * 
     * @return commissionResultInfo
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean getCommissionResultInfo() {
        return commissionResultInfo;
    }


    /**
     * Sets the commissionResultInfo value for this BatchTransferResponseBean.
     * 
     * @param commissionResultInfo
     */
    public void setCommissionResultInfo(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CommissionResultInfoBean commissionResultInfo) {
        this.commissionResultInfo = commissionResultInfo;
    }


    /**
     * Gets the currency value for this BatchTransferResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BatchTransferResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the depositProblem value for this BatchTransferResponseBean.
     * 
     * @return depositProblem
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositProblemBean[] getDepositProblem() {
        return depositProblem;
    }


    /**
     * Sets the depositProblem value for this BatchTransferResponseBean.
     * 
     * @param depositProblem
     */
    public void setDepositProblem(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositProblemBean[] depositProblem) {
        this.depositProblem = depositProblem;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositProblemBean getDepositProblem(int i) {
        return this.depositProblem[i];
    }

    public void setDepositProblem(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositProblemBean _value) {
        this.depositProblem[i] = _value;
    }


    /**
     * Gets the doneCompletely value for this BatchTransferResponseBean.
     * 
     * @return doneCompletely
     */
    public java.lang.Boolean getDoneCompletely() {
        return doneCompletely;
    }


    /**
     * Sets the doneCompletely value for this BatchTransferResponseBean.
     * 
     * @param doneCompletely
     */
    public void setDoneCompletely(java.lang.Boolean doneCompletely) {
        this.doneCompletely = doneCompletely;
    }


    /**
     * Gets the transferId value for this BatchTransferResponseBean.
     * 
     * @return transferId
     */
    public java.lang.String getTransferId() {
        return transferId;
    }


    /**
     * Sets the transferId value for this BatchTransferResponseBean.
     * 
     * @param transferId
     */
    public void setTransferId(java.lang.String transferId) {
        this.transferId = transferId;
    }


    /**
     * Gets the transferResults value for this BatchTransferResponseBean.
     * 
     * @return transferResults
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BatchTransferResultBean[] getTransferResults() {
        return transferResults;
    }


    /**
     * Sets the transferResults value for this BatchTransferResponseBean.
     * 
     * @param transferResults
     */
    public void setTransferResults(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BatchTransferResultBean[] transferResults) {
        this.transferResults = transferResults;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BatchTransferResultBean getTransferResults(int i) {
        return this.transferResults[i];
    }

    public void setTransferResults(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BatchTransferResultBean _value) {
        this.transferResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchTransferResponseBean)) return false;
        BatchTransferResponseBean other = (BatchTransferResponseBean) obj;
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
            ((this.commissionResultInfo==null && other.getCommissionResultInfo()==null) || 
             (this.commissionResultInfo!=null &&
              this.commissionResultInfo.equals(other.getCommissionResultInfo()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.depositProblem==null && other.getDepositProblem()==null) || 
             (this.depositProblem!=null &&
              java.util.Arrays.equals(this.depositProblem, other.getDepositProblem()))) &&
            ((this.doneCompletely==null && other.getDoneCompletely()==null) || 
             (this.doneCompletely!=null &&
              this.doneCompletely.equals(other.getDoneCompletely()))) &&
            ((this.transferId==null && other.getTransferId()==null) || 
             (this.transferId!=null &&
              this.transferId.equals(other.getTransferId()))) &&
            ((this.transferResults==null && other.getTransferResults()==null) || 
             (this.transferResults!=null &&
              java.util.Arrays.equals(this.transferResults, other.getTransferResults())));
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
        if (getCommissionResultInfo() != null) {
            _hashCode += getCommissionResultInfo().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDepositProblem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositProblem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositProblem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDoneCompletely() != null) {
            _hashCode += getDoneCompletely().hashCode();
        }
        if (getTransferId() != null) {
            _hashCode += getTransferId().hashCode();
        }
        if (getTransferResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferResults(), i);
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
        new org.apache.axis.description.TypeDesc(BatchTransferResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchTransferResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionResultInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commissionResultInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "commissionResultInfoBean"));
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
        elemField.setFieldName("depositProblem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositProblem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositProblemBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doneCompletely");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doneCompletely"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchTransferResultBean"));
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
