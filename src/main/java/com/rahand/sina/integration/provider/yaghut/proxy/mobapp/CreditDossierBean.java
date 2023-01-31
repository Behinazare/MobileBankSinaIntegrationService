/**
 * CreditDossierBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CreditDossierBean  implements java.io.Serializable {
    private java.math.BigDecimal availableFund;

    private java.lang.String currency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerInformationBean customer;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DossierCycleLengthWS cycleLength;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CompleteCardBean defaultCard;

    private java.util.Calendar expireDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierModernStatusWS modernStatus;

    private java.lang.String number;

    private java.util.Calendar openDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS status;

    private java.math.BigDecimal totalFund;

    public CreditDossierBean() {
    }

    public CreditDossierBean(
           java.math.BigDecimal availableFund,
           java.lang.String currency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerInformationBean customer,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DossierCycleLengthWS cycleLength,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CompleteCardBean defaultCard,
           java.util.Calendar expireDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierModernStatusWS modernStatus,
           java.lang.String number,
           java.util.Calendar openDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS status,
           java.math.BigDecimal totalFund) {
           this.availableFund = availableFund;
           this.currency = currency;
           this.customer = customer;
           this.cycleLength = cycleLength;
           this.defaultCard = defaultCard;
           this.expireDate = expireDate;
           this.modernStatus = modernStatus;
           this.number = number;
           this.openDate = openDate;
           this.status = status;
           this.totalFund = totalFund;
    }


    /**
     * Gets the availableFund value for this CreditDossierBean.
     * 
     * @return availableFund
     */
    public java.math.BigDecimal getAvailableFund() {
        return availableFund;
    }


    /**
     * Sets the availableFund value for this CreditDossierBean.
     * 
     * @param availableFund
     */
    public void setAvailableFund(java.math.BigDecimal availableFund) {
        this.availableFund = availableFund;
    }


    /**
     * Gets the currency value for this CreditDossierBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CreditDossierBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the customer value for this CreditDossierBean.
     * 
     * @return customer
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerInformationBean getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this CreditDossierBean.
     * 
     * @param customer
     */
    public void setCustomer(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerInformationBean customer) {
        this.customer = customer;
    }


    /**
     * Gets the cycleLength value for this CreditDossierBean.
     * 
     * @return cycleLength
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DossierCycleLengthWS getCycleLength() {
        return cycleLength;
    }


    /**
     * Sets the cycleLength value for this CreditDossierBean.
     * 
     * @param cycleLength
     */
    public void setCycleLength(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DossierCycleLengthWS cycleLength) {
        this.cycleLength = cycleLength;
    }


    /**
     * Gets the defaultCard value for this CreditDossierBean.
     * 
     * @return defaultCard
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CompleteCardBean getDefaultCard() {
        return defaultCard;
    }


    /**
     * Sets the defaultCard value for this CreditDossierBean.
     * 
     * @param defaultCard
     */
    public void setDefaultCard(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CompleteCardBean defaultCard) {
        this.defaultCard = defaultCard;
    }


    /**
     * Gets the expireDate value for this CreditDossierBean.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this CreditDossierBean.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the modernStatus value for this CreditDossierBean.
     * 
     * @return modernStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierModernStatusWS getModernStatus() {
        return modernStatus;
    }


    /**
     * Sets the modernStatus value for this CreditDossierBean.
     * 
     * @param modernStatus
     */
    public void setModernStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierModernStatusWS modernStatus) {
        this.modernStatus = modernStatus;
    }


    /**
     * Gets the number value for this CreditDossierBean.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CreditDossierBean.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the openDate value for this CreditDossierBean.
     * 
     * @return openDate
     */
    public java.util.Calendar getOpenDate() {
        return openDate;
    }


    /**
     * Sets the openDate value for this CreditDossierBean.
     * 
     * @param openDate
     */
    public void setOpenDate(java.util.Calendar openDate) {
        this.openDate = openDate;
    }


    /**
     * Gets the status value for this CreditDossierBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CreditDossierBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the totalFund value for this CreditDossierBean.
     * 
     * @return totalFund
     */
    public java.math.BigDecimal getTotalFund() {
        return totalFund;
    }


    /**
     * Sets the totalFund value for this CreditDossierBean.
     * 
     * @param totalFund
     */
    public void setTotalFund(java.math.BigDecimal totalFund) {
        this.totalFund = totalFund;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditDossierBean)) return false;
        CreditDossierBean other = (CreditDossierBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableFund==null && other.getAvailableFund()==null) || 
             (this.availableFund!=null &&
              this.availableFund.equals(other.getAvailableFund()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.cycleLength==null && other.getCycleLength()==null) || 
             (this.cycleLength!=null &&
              this.cycleLength.equals(other.getCycleLength()))) &&
            ((this.defaultCard==null && other.getDefaultCard()==null) || 
             (this.defaultCard!=null &&
              this.defaultCard.equals(other.getDefaultCard()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.modernStatus==null && other.getModernStatus()==null) || 
             (this.modernStatus!=null &&
              this.modernStatus.equals(other.getModernStatus()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.openDate==null && other.getOpenDate()==null) || 
             (this.openDate!=null &&
              this.openDate.equals(other.getOpenDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.totalFund==null && other.getTotalFund()==null) || 
             (this.totalFund!=null &&
              this.totalFund.equals(other.getTotalFund())));
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
        if (getAvailableFund() != null) {
            _hashCode += getAvailableFund().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCycleLength() != null) {
            _hashCode += getCycleLength().hashCode();
        }
        if (getDefaultCard() != null) {
            _hashCode += getDefaultCard().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getModernStatus() != null) {
            _hashCode += getModernStatus().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOpenDate() != null) {
            _hashCode += getOpenDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTotalFund() != null) {
            _hashCode += getTotalFund().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditDossierBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableFund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableFund"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerInformationBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "dossierCycleLengthWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "completeCardBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modernStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modernStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierModernStatusWS"));
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
        elemField.setFieldName("openDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "openDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalFund"));
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
