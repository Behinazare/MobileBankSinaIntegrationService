/**
 * TransferChequeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class TransferChequeBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String depositNumber;

    private java.lang.String deviseeBank;

    private java.lang.String deviseeBankCode;

    private java.lang.String deviseeDepositNumber;

    private java.util.Calendar dueDate;

    private java.lang.String number;

    private java.util.Calendar passDate;

    private java.util.Calendar registerDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS status;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS type;

    public TransferChequeBean() {
    }

    public TransferChequeBean(
           java.math.BigDecimal amount,
           java.lang.String depositNumber,
           java.lang.String deviseeBank,
           java.lang.String deviseeBankCode,
           java.lang.String deviseeDepositNumber,
           java.util.Calendar dueDate,
           java.lang.String number,
           java.util.Calendar passDate,
           java.util.Calendar registerDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS status,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS type) {
           this.amount = amount;
           this.depositNumber = depositNumber;
           this.deviseeBank = deviseeBank;
           this.deviseeBankCode = deviseeBankCode;
           this.deviseeDepositNumber = deviseeDepositNumber;
           this.dueDate = dueDate;
           this.number = number;
           this.passDate = passDate;
           this.registerDate = registerDate;
           this.status = status;
           this.type = type;
    }


    /**
     * Gets the amount value for this TransferChequeBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferChequeBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the depositNumber value for this TransferChequeBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this TransferChequeBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the deviseeBank value for this TransferChequeBean.
     * 
     * @return deviseeBank
     */
    public java.lang.String getDeviseeBank() {
        return deviseeBank;
    }


    /**
     * Sets the deviseeBank value for this TransferChequeBean.
     * 
     * @param deviseeBank
     */
    public void setDeviseeBank(java.lang.String deviseeBank) {
        this.deviseeBank = deviseeBank;
    }


    /**
     * Gets the deviseeBankCode value for this TransferChequeBean.
     * 
     * @return deviseeBankCode
     */
    public java.lang.String getDeviseeBankCode() {
        return deviseeBankCode;
    }


    /**
     * Sets the deviseeBankCode value for this TransferChequeBean.
     * 
     * @param deviseeBankCode
     */
    public void setDeviseeBankCode(java.lang.String deviseeBankCode) {
        this.deviseeBankCode = deviseeBankCode;
    }


    /**
     * Gets the deviseeDepositNumber value for this TransferChequeBean.
     * 
     * @return deviseeDepositNumber
     */
    public java.lang.String getDeviseeDepositNumber() {
        return deviseeDepositNumber;
    }


    /**
     * Sets the deviseeDepositNumber value for this TransferChequeBean.
     * 
     * @param deviseeDepositNumber
     */
    public void setDeviseeDepositNumber(java.lang.String deviseeDepositNumber) {
        this.deviseeDepositNumber = deviseeDepositNumber;
    }


    /**
     * Gets the dueDate value for this TransferChequeBean.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this TransferChequeBean.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the number value for this TransferChequeBean.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TransferChequeBean.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the passDate value for this TransferChequeBean.
     * 
     * @return passDate
     */
    public java.util.Calendar getPassDate() {
        return passDate;
    }


    /**
     * Sets the passDate value for this TransferChequeBean.
     * 
     * @param passDate
     */
    public void setPassDate(java.util.Calendar passDate) {
        this.passDate = passDate;
    }


    /**
     * Gets the registerDate value for this TransferChequeBean.
     * 
     * @return registerDate
     */
    public java.util.Calendar getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this TransferChequeBean.
     * 
     * @param registerDate
     */
    public void setRegisterDate(java.util.Calendar registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the status value for this TransferChequeBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransferChequeBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the type value for this TransferChequeBean.
     * 
     * @return type
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS getType() {
        return type;
    }


    /**
     * Sets the type value for this TransferChequeBean.
     * 
     * @param type
     */
    public void setType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferChequeBean)) return false;
        TransferChequeBean other = (TransferChequeBean) obj;
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
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.deviseeBank==null && other.getDeviseeBank()==null) || 
             (this.deviseeBank!=null &&
              this.deviseeBank.equals(other.getDeviseeBank()))) &&
            ((this.deviseeBankCode==null && other.getDeviseeBankCode()==null) || 
             (this.deviseeBankCode!=null &&
              this.deviseeBankCode.equals(other.getDeviseeBankCode()))) &&
            ((this.deviseeDepositNumber==null && other.getDeviseeDepositNumber()==null) || 
             (this.deviseeDepositNumber!=null &&
              this.deviseeDepositNumber.equals(other.getDeviseeDepositNumber()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.passDate==null && other.getPassDate()==null) || 
             (this.passDate!=null &&
              this.passDate.equals(other.getPassDate()))) &&
            ((this.registerDate==null && other.getRegisterDate()==null) || 
             (this.registerDate!=null &&
              this.registerDate.equals(other.getRegisterDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getDeviseeBank() != null) {
            _hashCode += getDeviseeBank().hashCode();
        }
        if (getDeviseeBankCode() != null) {
            _hashCode += getDeviseeBankCode().hashCode();
        }
        if (getDeviseeDepositNumber() != null) {
            _hashCode += getDeviseeDepositNumber().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPassDate() != null) {
            _hashCode += getPassDate().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferChequeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferChequeBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviseeBank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviseeBank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviseeBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviseeBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviseeDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviseeDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("passDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferChequeStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeTypeWS"));
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
