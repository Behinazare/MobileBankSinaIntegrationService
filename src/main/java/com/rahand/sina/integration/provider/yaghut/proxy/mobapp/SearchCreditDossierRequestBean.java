/**
 * SearchCreditDossierRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SearchCreditDossierRequestBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardPaginationBean  implements java.io.Serializable {
    private java.lang.String cif;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCustomerBean customer;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCardBean defaultCard;

    private java.lang.String firstName;

    private java.math.BigDecimal fromAvailableFund;

    private java.util.Calendar fromExpireDate;

    private java.util.Calendar fromOpenDate;

    private java.lang.String lastName;

    private java.lang.String nationalCode;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderDirection;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierOrderFieldWS orderField;

    private boolean showTotalRecord;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS status;

    private java.math.BigDecimal toAvailableFund;

    private java.util.Calendar toExpireDate;

    private java.util.Calendar toOpenDate;

    public SearchCreditDossierRequestBean() {
    }

    public SearchCreditDossierRequestBean(
           java.lang.Long length,
           java.lang.Long offset,
           java.lang.String cif,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCustomerBean customer,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCardBean defaultCard,
           java.lang.String firstName,
           java.math.BigDecimal fromAvailableFund,
           java.util.Calendar fromExpireDate,
           java.util.Calendar fromOpenDate,
           java.lang.String lastName,
           java.lang.String nationalCode,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderDirection,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierOrderFieldWS orderField,
           boolean showTotalRecord,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS status,
           java.math.BigDecimal toAvailableFund,
           java.util.Calendar toExpireDate,
           java.util.Calendar toOpenDate) {
        super(
            length,
            offset);
        this.cif = cif;
        this.customer = customer;
        this.defaultCard = defaultCard;
        this.firstName = firstName;
        this.fromAvailableFund = fromAvailableFund;
        this.fromExpireDate = fromExpireDate;
        this.fromOpenDate = fromOpenDate;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.orderDirection = orderDirection;
        this.orderField = orderField;
        this.showTotalRecord = showTotalRecord;
        this.status = status;
        this.toAvailableFund = toAvailableFund;
        this.toExpireDate = toExpireDate;
        this.toOpenDate = toOpenDate;
    }


    /**
     * Gets the cif value for this SearchCreditDossierRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this SearchCreditDossierRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the customer value for this SearchCreditDossierRequestBean.
     * 
     * @return customer
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCustomerBean getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this SearchCreditDossierRequestBean.
     * 
     * @param customer
     */
    public void setCustomer(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCustomerBean customer) {
        this.customer = customer;
    }


    /**
     * Gets the defaultCard value for this SearchCreditDossierRequestBean.
     * 
     * @return defaultCard
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCardBean getDefaultCard() {
        return defaultCard;
    }


    /**
     * Sets the defaultCard value for this SearchCreditDossierRequestBean.
     * 
     * @param defaultCard
     */
    public void setDefaultCard(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SearchCardBean defaultCard) {
        this.defaultCard = defaultCard;
    }


    /**
     * Gets the firstName value for this SearchCreditDossierRequestBean.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SearchCreditDossierRequestBean.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the fromAvailableFund value for this SearchCreditDossierRequestBean.
     * 
     * @return fromAvailableFund
     */
    public java.math.BigDecimal getFromAvailableFund() {
        return fromAvailableFund;
    }


    /**
     * Sets the fromAvailableFund value for this SearchCreditDossierRequestBean.
     * 
     * @param fromAvailableFund
     */
    public void setFromAvailableFund(java.math.BigDecimal fromAvailableFund) {
        this.fromAvailableFund = fromAvailableFund;
    }


    /**
     * Gets the fromExpireDate value for this SearchCreditDossierRequestBean.
     * 
     * @return fromExpireDate
     */
    public java.util.Calendar getFromExpireDate() {
        return fromExpireDate;
    }


    /**
     * Sets the fromExpireDate value for this SearchCreditDossierRequestBean.
     * 
     * @param fromExpireDate
     */
    public void setFromExpireDate(java.util.Calendar fromExpireDate) {
        this.fromExpireDate = fromExpireDate;
    }


    /**
     * Gets the fromOpenDate value for this SearchCreditDossierRequestBean.
     * 
     * @return fromOpenDate
     */
    public java.util.Calendar getFromOpenDate() {
        return fromOpenDate;
    }


    /**
     * Sets the fromOpenDate value for this SearchCreditDossierRequestBean.
     * 
     * @param fromOpenDate
     */
    public void setFromOpenDate(java.util.Calendar fromOpenDate) {
        this.fromOpenDate = fromOpenDate;
    }


    /**
     * Gets the lastName value for this SearchCreditDossierRequestBean.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SearchCreditDossierRequestBean.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the nationalCode value for this SearchCreditDossierRequestBean.
     * 
     * @return nationalCode
     */
    public java.lang.String getNationalCode() {
        return nationalCode;
    }


    /**
     * Sets the nationalCode value for this SearchCreditDossierRequestBean.
     * 
     * @param nationalCode
     */
    public void setNationalCode(java.lang.String nationalCode) {
        this.nationalCode = nationalCode;
    }


    /**
     * Gets the orderDirection value for this SearchCreditDossierRequestBean.
     * 
     * @return orderDirection
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS getOrderDirection() {
        return orderDirection;
    }


    /**
     * Sets the orderDirection value for this SearchCreditDossierRequestBean.
     * 
     * @param orderDirection
     */
    public void setOrderDirection(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS orderDirection) {
        this.orderDirection = orderDirection;
    }


    /**
     * Gets the orderField value for this SearchCreditDossierRequestBean.
     * 
     * @return orderField
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierOrderFieldWS getOrderField() {
        return orderField;
    }


    /**
     * Sets the orderField value for this SearchCreditDossierRequestBean.
     * 
     * @param orderField
     */
    public void setOrderField(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierOrderFieldWS orderField) {
        this.orderField = orderField;
    }


    /**
     * Gets the showTotalRecord value for this SearchCreditDossierRequestBean.
     * 
     * @return showTotalRecord
     */
    public boolean isShowTotalRecord() {
        return showTotalRecord;
    }


    /**
     * Sets the showTotalRecord value for this SearchCreditDossierRequestBean.
     * 
     * @param showTotalRecord
     */
    public void setShowTotalRecord(boolean showTotalRecord) {
        this.showTotalRecord = showTotalRecord;
    }


    /**
     * Gets the status value for this SearchCreditDossierRequestBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SearchCreditDossierRequestBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CreditDossierStatusWS status) {
        this.status = status;
    }


    /**
     * Gets the toAvailableFund value for this SearchCreditDossierRequestBean.
     * 
     * @return toAvailableFund
     */
    public java.math.BigDecimal getToAvailableFund() {
        return toAvailableFund;
    }


    /**
     * Sets the toAvailableFund value for this SearchCreditDossierRequestBean.
     * 
     * @param toAvailableFund
     */
    public void setToAvailableFund(java.math.BigDecimal toAvailableFund) {
        this.toAvailableFund = toAvailableFund;
    }


    /**
     * Gets the toExpireDate value for this SearchCreditDossierRequestBean.
     * 
     * @return toExpireDate
     */
    public java.util.Calendar getToExpireDate() {
        return toExpireDate;
    }


    /**
     * Sets the toExpireDate value for this SearchCreditDossierRequestBean.
     * 
     * @param toExpireDate
     */
    public void setToExpireDate(java.util.Calendar toExpireDate) {
        this.toExpireDate = toExpireDate;
    }


    /**
     * Gets the toOpenDate value for this SearchCreditDossierRequestBean.
     * 
     * @return toOpenDate
     */
    public java.util.Calendar getToOpenDate() {
        return toOpenDate;
    }


    /**
     * Sets the toOpenDate value for this SearchCreditDossierRequestBean.
     * 
     * @param toOpenDate
     */
    public void setToOpenDate(java.util.Calendar toOpenDate) {
        this.toOpenDate = toOpenDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCreditDossierRequestBean)) return false;
        SearchCreditDossierRequestBean other = (SearchCreditDossierRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.defaultCard==null && other.getDefaultCard()==null) || 
             (this.defaultCard!=null &&
              this.defaultCard.equals(other.getDefaultCard()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.fromAvailableFund==null && other.getFromAvailableFund()==null) || 
             (this.fromAvailableFund!=null &&
              this.fromAvailableFund.equals(other.getFromAvailableFund()))) &&
            ((this.fromExpireDate==null && other.getFromExpireDate()==null) || 
             (this.fromExpireDate!=null &&
              this.fromExpireDate.equals(other.getFromExpireDate()))) &&
            ((this.fromOpenDate==null && other.getFromOpenDate()==null) || 
             (this.fromOpenDate!=null &&
              this.fromOpenDate.equals(other.getFromOpenDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.nationalCode==null && other.getNationalCode()==null) || 
             (this.nationalCode!=null &&
              this.nationalCode.equals(other.getNationalCode()))) &&
            ((this.orderDirection==null && other.getOrderDirection()==null) || 
             (this.orderDirection!=null &&
              this.orderDirection.equals(other.getOrderDirection()))) &&
            ((this.orderField==null && other.getOrderField()==null) || 
             (this.orderField!=null &&
              this.orderField.equals(other.getOrderField()))) &&
            this.showTotalRecord == other.isShowTotalRecord() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.toAvailableFund==null && other.getToAvailableFund()==null) || 
             (this.toAvailableFund!=null &&
              this.toAvailableFund.equals(other.getToAvailableFund()))) &&
            ((this.toExpireDate==null && other.getToExpireDate()==null) || 
             (this.toExpireDate!=null &&
              this.toExpireDate.equals(other.getToExpireDate()))) &&
            ((this.toOpenDate==null && other.getToOpenDate()==null) || 
             (this.toOpenDate!=null &&
              this.toOpenDate.equals(other.getToOpenDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDefaultCard() != null) {
            _hashCode += getDefaultCard().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFromAvailableFund() != null) {
            _hashCode += getFromAvailableFund().hashCode();
        }
        if (getFromExpireDate() != null) {
            _hashCode += getFromExpireDate().hashCode();
        }
        if (getFromOpenDate() != null) {
            _hashCode += getFromOpenDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getNationalCode() != null) {
            _hashCode += getNationalCode().hashCode();
        }
        if (getOrderDirection() != null) {
            _hashCode += getOrderDirection().hashCode();
        }
        if (getOrderField() != null) {
            _hashCode += getOrderField().hashCode();
        }
        _hashCode += (isShowTotalRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getToAvailableFund() != null) {
            _hashCode += getToAvailableFund().hashCode();
        }
        if (getToExpireDate() != null) {
            _hashCode += getToExpireDate().hashCode();
        }
        if (getToOpenDate() != null) {
            _hashCode += getToOpenDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchCreditDossierRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchCreditDossierRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchCustomerBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchCardBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromAvailableFund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromAvailableFund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromOpenDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromOpenDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "orderDirectionWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "creditDossierOrderFieldWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showTotalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showTotalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("toAvailableFund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toAvailableFund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toOpenDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toOpenDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
