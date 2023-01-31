/**
 * ChequeSheetBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChequeSheetBean  implements java.io.Serializable {
    private java.math.BigDecimal balance;

    private java.util.Calendar changeStatusDate;

    private java.lang.String description;

    private java.lang.String number;

    private java.util.Calendar registerChequeDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus status;

    public ChequeSheetBean() {
    }

    public ChequeSheetBean(
           java.math.BigDecimal balance,
           java.util.Calendar changeStatusDate,
           java.lang.String description,
           java.lang.String number,
           java.util.Calendar registerChequeDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus status) {
           this.balance = balance;
           this.changeStatusDate = changeStatusDate;
           this.description = description;
           this.number = number;
           this.registerChequeDate = registerChequeDate;
           this.status = status;
    }


    /**
     * Gets the balance value for this ChequeSheetBean.
     * 
     * @return balance
     */
    public java.math.BigDecimal getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this ChequeSheetBean.
     * 
     * @param balance
     */
    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }


    /**
     * Gets the changeStatusDate value for this ChequeSheetBean.
     * 
     * @return changeStatusDate
     */
    public java.util.Calendar getChangeStatusDate() {
        return changeStatusDate;
    }


    /**
     * Sets the changeStatusDate value for this ChequeSheetBean.
     * 
     * @param changeStatusDate
     */
    public void setChangeStatusDate(java.util.Calendar changeStatusDate) {
        this.changeStatusDate = changeStatusDate;
    }


    /**
     * Gets the description value for this ChequeSheetBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ChequeSheetBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the number value for this ChequeSheetBean.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this ChequeSheetBean.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the registerChequeDate value for this ChequeSheetBean.
     * 
     * @return registerChequeDate
     */
    public java.util.Calendar getRegisterChequeDate() {
        return registerChequeDate;
    }


    /**
     * Sets the registerChequeDate value for this ChequeSheetBean.
     * 
     * @param registerChequeDate
     */
    public void setRegisterChequeDate(java.util.Calendar registerChequeDate) {
        this.registerChequeDate = registerChequeDate;
    }


    /**
     * Gets the status value for this ChequeSheetBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ChequeSheetBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChequeSheetBean)) return false;
        ChequeSheetBean other = (ChequeSheetBean) obj;
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
            ((this.changeStatusDate==null && other.getChangeStatusDate()==null) || 
             (this.changeStatusDate!=null &&
              this.changeStatusDate.equals(other.getChangeStatusDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.registerChequeDate==null && other.getRegisterChequeDate()==null) || 
             (this.registerChequeDate!=null &&
              this.registerChequeDate.equals(other.getRegisterChequeDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getChangeStatusDate() != null) {
            _hashCode += getChangeStatusDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getRegisterChequeDate() != null) {
            _hashCode += getRegisterChequeDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChequeSheetBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeSheetBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeStatusDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeStatusDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerChequeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerChequeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeStatus"));
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
