/**
 * DepositStatementSummaryResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DepositStatementSummaryResponseBean  implements java.io.Serializable {
    private java.math.BigDecimal beginBalance;

    private java.lang.String currency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatementSummaryBean[] depositStatements;

    public DepositStatementSummaryResponseBean() {
    }

    public DepositStatementSummaryResponseBean(
           java.math.BigDecimal beginBalance,
           java.lang.String currency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatementSummaryBean[] depositStatements) {
           this.beginBalance = beginBalance;
           this.currency = currency;
           this.depositStatements = depositStatements;
    }


    /**
     * Gets the beginBalance value for this DepositStatementSummaryResponseBean.
     * 
     * @return beginBalance
     */
    public java.math.BigDecimal getBeginBalance() {
        return beginBalance;
    }


    /**
     * Sets the beginBalance value for this DepositStatementSummaryResponseBean.
     * 
     * @param beginBalance
     */
    public void setBeginBalance(java.math.BigDecimal beginBalance) {
        this.beginBalance = beginBalance;
    }


    /**
     * Gets the currency value for this DepositStatementSummaryResponseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this DepositStatementSummaryResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the depositStatements value for this DepositStatementSummaryResponseBean.
     * 
     * @return depositStatements
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatementSummaryBean[] getDepositStatements() {
        return depositStatements;
    }


    /**
     * Sets the depositStatements value for this DepositStatementSummaryResponseBean.
     * 
     * @param depositStatements
     */
    public void setDepositStatements(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatementSummaryBean[] depositStatements) {
        this.depositStatements = depositStatements;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatementSummaryBean getDepositStatements(int i) {
        return this.depositStatements[i];
    }

    public void setDepositStatements(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositStatementSummaryBean _value) {
        this.depositStatements[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepositStatementSummaryResponseBean)) return false;
        DepositStatementSummaryResponseBean other = (DepositStatementSummaryResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beginBalance==null && other.getBeginBalance()==null) || 
             (this.beginBalance!=null &&
              this.beginBalance.equals(other.getBeginBalance()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.depositStatements==null && other.getDepositStatements()==null) || 
             (this.depositStatements!=null &&
              java.util.Arrays.equals(this.depositStatements, other.getDepositStatements())));
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
        if (getBeginBalance() != null) {
            _hashCode += getBeginBalance().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDepositStatements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositStatements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositStatements(), i);
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
        new org.apache.axis.description.TypeDesc(DepositStatementSummaryResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositStatementSummaryResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("depositStatements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositStatements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositStatementSummaryBean"));
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
