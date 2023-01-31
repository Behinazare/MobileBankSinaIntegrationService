/**
 * SearchTransferChequeRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SearchTransferChequeRequestBean  implements java.io.Serializable {
    private java.lang.String branchCode;

    private java.lang.String cif;

    private java.lang.String depositNumber;

    private java.lang.String deviseeBankCode;

    private java.math.BigDecimal fromBalance;

    private java.util.Calendar fromDueDate;

    private java.lang.String fromNumber;

    private java.util.Calendar fromPassDate;

    private java.util.Calendar fromRegisterDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS includeStatus;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS includeType;

    private java.lang.Long length;

    private java.lang.Long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeFieldOrderWS orderMethod;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderTypeWS orderType;

    private java.math.BigDecimal toBalance;

    private java.util.Calendar toDueDate;

    private java.lang.String toNumber;

    private java.util.Calendar toPassDate;

    private java.util.Calendar toRegisterDate;

    public SearchTransferChequeRequestBean() {
    }

    public SearchTransferChequeRequestBean(
           java.lang.String branchCode,
           java.lang.String cif,
           java.lang.String depositNumber,
           java.lang.String deviseeBankCode,
           java.math.BigDecimal fromBalance,
           java.util.Calendar fromDueDate,
           java.lang.String fromNumber,
           java.util.Calendar fromPassDate,
           java.util.Calendar fromRegisterDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS includeStatus,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS includeType,
           java.lang.Long length,
           java.lang.Long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeFieldOrderWS orderMethod,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderTypeWS orderType,
           java.math.BigDecimal toBalance,
           java.util.Calendar toDueDate,
           java.lang.String toNumber,
           java.util.Calendar toPassDate,
           java.util.Calendar toRegisterDate) {
           this.branchCode = branchCode;
           this.cif = cif;
           this.depositNumber = depositNumber;
           this.deviseeBankCode = deviseeBankCode;
           this.fromBalance = fromBalance;
           this.fromDueDate = fromDueDate;
           this.fromNumber = fromNumber;
           this.fromPassDate = fromPassDate;
           this.fromRegisterDate = fromRegisterDate;
           this.includeStatus = includeStatus;
           this.includeType = includeType;
           this.length = length;
           this.offset = offset;
           this.orderMethod = orderMethod;
           this.orderType = orderType;
           this.toBalance = toBalance;
           this.toDueDate = toDueDate;
           this.toNumber = toNumber;
           this.toPassDate = toPassDate;
           this.toRegisterDate = toRegisterDate;
    }


    /**
     * Gets the branchCode value for this SearchTransferChequeRequestBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this SearchTransferChequeRequestBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the cif value for this SearchTransferChequeRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this SearchTransferChequeRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this SearchTransferChequeRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this SearchTransferChequeRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the deviseeBankCode value for this SearchTransferChequeRequestBean.
     * 
     * @return deviseeBankCode
     */
    public java.lang.String getDeviseeBankCode() {
        return deviseeBankCode;
    }


    /**
     * Sets the deviseeBankCode value for this SearchTransferChequeRequestBean.
     * 
     * @param deviseeBankCode
     */
    public void setDeviseeBankCode(java.lang.String deviseeBankCode) {
        this.deviseeBankCode = deviseeBankCode;
    }


    /**
     * Gets the fromBalance value for this SearchTransferChequeRequestBean.
     * 
     * @return fromBalance
     */
    public java.math.BigDecimal getFromBalance() {
        return fromBalance;
    }


    /**
     * Sets the fromBalance value for this SearchTransferChequeRequestBean.
     * 
     * @param fromBalance
     */
    public void setFromBalance(java.math.BigDecimal fromBalance) {
        this.fromBalance = fromBalance;
    }


    /**
     * Gets the fromDueDate value for this SearchTransferChequeRequestBean.
     * 
     * @return fromDueDate
     */
    public java.util.Calendar getFromDueDate() {
        return fromDueDate;
    }


    /**
     * Sets the fromDueDate value for this SearchTransferChequeRequestBean.
     * 
     * @param fromDueDate
     */
    public void setFromDueDate(java.util.Calendar fromDueDate) {
        this.fromDueDate = fromDueDate;
    }


    /**
     * Gets the fromNumber value for this SearchTransferChequeRequestBean.
     * 
     * @return fromNumber
     */
    public java.lang.String getFromNumber() {
        return fromNumber;
    }


    /**
     * Sets the fromNumber value for this SearchTransferChequeRequestBean.
     * 
     * @param fromNumber
     */
    public void setFromNumber(java.lang.String fromNumber) {
        this.fromNumber = fromNumber;
    }


    /**
     * Gets the fromPassDate value for this SearchTransferChequeRequestBean.
     * 
     * @return fromPassDate
     */
    public java.util.Calendar getFromPassDate() {
        return fromPassDate;
    }


    /**
     * Sets the fromPassDate value for this SearchTransferChequeRequestBean.
     * 
     * @param fromPassDate
     */
    public void setFromPassDate(java.util.Calendar fromPassDate) {
        this.fromPassDate = fromPassDate;
    }


    /**
     * Gets the fromRegisterDate value for this SearchTransferChequeRequestBean.
     * 
     * @return fromRegisterDate
     */
    public java.util.Calendar getFromRegisterDate() {
        return fromRegisterDate;
    }


    /**
     * Sets the fromRegisterDate value for this SearchTransferChequeRequestBean.
     * 
     * @param fromRegisterDate
     */
    public void setFromRegisterDate(java.util.Calendar fromRegisterDate) {
        this.fromRegisterDate = fromRegisterDate;
    }


    /**
     * Gets the includeStatus value for this SearchTransferChequeRequestBean.
     * 
     * @return includeStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS getIncludeStatus() {
        return includeStatus;
    }


    /**
     * Sets the includeStatus value for this SearchTransferChequeRequestBean.
     * 
     * @param includeStatus
     */
    public void setIncludeStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.TransferChequeStatusWS includeStatus) {
        this.includeStatus = includeStatus;
    }


    /**
     * Gets the includeType value for this SearchTransferChequeRequestBean.
     * 
     * @return includeType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS getIncludeType() {
        return includeType;
    }


    /**
     * Sets the includeType value for this SearchTransferChequeRequestBean.
     * 
     * @param includeType
     */
    public void setIncludeType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeTypeWS includeType) {
        this.includeType = includeType;
    }


    /**
     * Gets the length value for this SearchTransferChequeRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this SearchTransferChequeRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this SearchTransferChequeRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this SearchTransferChequeRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the orderMethod value for this SearchTransferChequeRequestBean.
     * 
     * @return orderMethod
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeFieldOrderWS getOrderMethod() {
        return orderMethod;
    }


    /**
     * Sets the orderMethod value for this SearchTransferChequeRequestBean.
     * 
     * @param orderMethod
     */
    public void setOrderMethod(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeFieldOrderWS orderMethod) {
        this.orderMethod = orderMethod;
    }


    /**
     * Gets the orderType value for this SearchTransferChequeRequestBean.
     * 
     * @return orderType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderTypeWS getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this SearchTransferChequeRequestBean.
     * 
     * @param orderType
     */
    public void setOrderType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderTypeWS orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the toBalance value for this SearchTransferChequeRequestBean.
     * 
     * @return toBalance
     */
    public java.math.BigDecimal getToBalance() {
        return toBalance;
    }


    /**
     * Sets the toBalance value for this SearchTransferChequeRequestBean.
     * 
     * @param toBalance
     */
    public void setToBalance(java.math.BigDecimal toBalance) {
        this.toBalance = toBalance;
    }


    /**
     * Gets the toDueDate value for this SearchTransferChequeRequestBean.
     * 
     * @return toDueDate
     */
    public java.util.Calendar getToDueDate() {
        return toDueDate;
    }


    /**
     * Sets the toDueDate value for this SearchTransferChequeRequestBean.
     * 
     * @param toDueDate
     */
    public void setToDueDate(java.util.Calendar toDueDate) {
        this.toDueDate = toDueDate;
    }


    /**
     * Gets the toNumber value for this SearchTransferChequeRequestBean.
     * 
     * @return toNumber
     */
    public java.lang.String getToNumber() {
        return toNumber;
    }


    /**
     * Sets the toNumber value for this SearchTransferChequeRequestBean.
     * 
     * @param toNumber
     */
    public void setToNumber(java.lang.String toNumber) {
        this.toNumber = toNumber;
    }


    /**
     * Gets the toPassDate value for this SearchTransferChequeRequestBean.
     * 
     * @return toPassDate
     */
    public java.util.Calendar getToPassDate() {
        return toPassDate;
    }


    /**
     * Sets the toPassDate value for this SearchTransferChequeRequestBean.
     * 
     * @param toPassDate
     */
    public void setToPassDate(java.util.Calendar toPassDate) {
        this.toPassDate = toPassDate;
    }


    /**
     * Gets the toRegisterDate value for this SearchTransferChequeRequestBean.
     * 
     * @return toRegisterDate
     */
    public java.util.Calendar getToRegisterDate() {
        return toRegisterDate;
    }


    /**
     * Sets the toRegisterDate value for this SearchTransferChequeRequestBean.
     * 
     * @param toRegisterDate
     */
    public void setToRegisterDate(java.util.Calendar toRegisterDate) {
        this.toRegisterDate = toRegisterDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchTransferChequeRequestBean)) return false;
        SearchTransferChequeRequestBean other = (SearchTransferChequeRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.deviseeBankCode==null && other.getDeviseeBankCode()==null) || 
             (this.deviseeBankCode!=null &&
              this.deviseeBankCode.equals(other.getDeviseeBankCode()))) &&
            ((this.fromBalance==null && other.getFromBalance()==null) || 
             (this.fromBalance!=null &&
              this.fromBalance.equals(other.getFromBalance()))) &&
            ((this.fromDueDate==null && other.getFromDueDate()==null) || 
             (this.fromDueDate!=null &&
              this.fromDueDate.equals(other.getFromDueDate()))) &&
            ((this.fromNumber==null && other.getFromNumber()==null) || 
             (this.fromNumber!=null &&
              this.fromNumber.equals(other.getFromNumber()))) &&
            ((this.fromPassDate==null && other.getFromPassDate()==null) || 
             (this.fromPassDate!=null &&
              this.fromPassDate.equals(other.getFromPassDate()))) &&
            ((this.fromRegisterDate==null && other.getFromRegisterDate()==null) || 
             (this.fromRegisterDate!=null &&
              this.fromRegisterDate.equals(other.getFromRegisterDate()))) &&
            ((this.includeStatus==null && other.getIncludeStatus()==null) || 
             (this.includeStatus!=null &&
              this.includeStatus.equals(other.getIncludeStatus()))) &&
            ((this.includeType==null && other.getIncludeType()==null) || 
             (this.includeType!=null &&
              this.includeType.equals(other.getIncludeType()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.orderMethod==null && other.getOrderMethod()==null) || 
             (this.orderMethod!=null &&
              this.orderMethod.equals(other.getOrderMethod()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.toBalance==null && other.getToBalance()==null) || 
             (this.toBalance!=null &&
              this.toBalance.equals(other.getToBalance()))) &&
            ((this.toDueDate==null && other.getToDueDate()==null) || 
             (this.toDueDate!=null &&
              this.toDueDate.equals(other.getToDueDate()))) &&
            ((this.toNumber==null && other.getToNumber()==null) || 
             (this.toNumber!=null &&
              this.toNumber.equals(other.getToNumber()))) &&
            ((this.toPassDate==null && other.getToPassDate()==null) || 
             (this.toPassDate!=null &&
              this.toPassDate.equals(other.getToPassDate()))) &&
            ((this.toRegisterDate==null && other.getToRegisterDate()==null) || 
             (this.toRegisterDate!=null &&
              this.toRegisterDate.equals(other.getToRegisterDate())));
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
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getDeviseeBankCode() != null) {
            _hashCode += getDeviseeBankCode().hashCode();
        }
        if (getFromBalance() != null) {
            _hashCode += getFromBalance().hashCode();
        }
        if (getFromDueDate() != null) {
            _hashCode += getFromDueDate().hashCode();
        }
        if (getFromNumber() != null) {
            _hashCode += getFromNumber().hashCode();
        }
        if (getFromPassDate() != null) {
            _hashCode += getFromPassDate().hashCode();
        }
        if (getFromRegisterDate() != null) {
            _hashCode += getFromRegisterDate().hashCode();
        }
        if (getIncludeStatus() != null) {
            _hashCode += getIncludeStatus().hashCode();
        }
        if (getIncludeType() != null) {
            _hashCode += getIncludeType().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getOrderMethod() != null) {
            _hashCode += getOrderMethod().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getToBalance() != null) {
            _hashCode += getToBalance().hashCode();
        }
        if (getToDueDate() != null) {
            _hashCode += getToDueDate().hashCode();
        }
        if (getToNumber() != null) {
            _hashCode += getToNumber().hashCode();
        }
        if (getToPassDate() != null) {
            _hashCode += getToPassDate().hashCode();
        }
        if (getToRegisterDate() != null) {
            _hashCode += getToRegisterDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchTransferChequeRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchTransferChequeRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fromBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromPassDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromPassDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromRegisterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromRegisterDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "transferChequeStatusWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeFieldOrderWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "orderTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toPassDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toPassDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toRegisterDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toRegisterDate"));
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
