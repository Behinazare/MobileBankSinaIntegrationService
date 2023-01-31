/**
 * KartablBaseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class KartablBaseBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.util.Calendar creationDate;

    private java.lang.String currency;

    private java.lang.String description;

    private java.util.Calendar expirationDate;

    private java.lang.String failureCode;

    private java.lang.String failureReason;

    private java.lang.String kartablId;

    private java.util.Calendar lastStatusChangeDate;

    private java.lang.String referenceId;

    private java.lang.String serviceName;

    private java.lang.String sourceDeposit;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS status;

    public KartablBaseBean() {
    }

    public KartablBaseBean(
           java.math.BigDecimal amount,
           java.util.Calendar creationDate,
           java.lang.String currency,
           java.lang.String description,
           java.util.Calendar expirationDate,
           java.lang.String failureCode,
           java.lang.String failureReason,
           java.lang.String kartablId,
           java.util.Calendar lastStatusChangeDate,
           java.lang.String referenceId,
           java.lang.String serviceName,
           java.lang.String sourceDeposit,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS status) {
           this.amount = amount;
           this.creationDate = creationDate;
           this.currency = currency;
           this.description = description;
           this.expirationDate = expirationDate;
           this.failureCode = failureCode;
           this.failureReason = failureReason;
           this.kartablId = kartablId;
           this.lastStatusChangeDate = lastStatusChangeDate;
           this.referenceId = referenceId;
           this.serviceName = serviceName;
           this.sourceDeposit = sourceDeposit;
           this.status = status;
    }


    /**
     * Gets the amount value for this KartablBaseBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this KartablBaseBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the creationDate value for this KartablBaseBean.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this KartablBaseBean.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the currency value for this KartablBaseBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this KartablBaseBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the description value for this KartablBaseBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this KartablBaseBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the expirationDate value for this KartablBaseBean.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this KartablBaseBean.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the failureCode value for this KartablBaseBean.
     * 
     * @return failureCode
     */
    public java.lang.String getFailureCode() {
        return failureCode;
    }


    /**
     * Sets the failureCode value for this KartablBaseBean.
     * 
     * @param failureCode
     */
    public void setFailureCode(java.lang.String failureCode) {
        this.failureCode = failureCode;
    }


    /**
     * Gets the failureReason value for this KartablBaseBean.
     * 
     * @return failureReason
     */
    public java.lang.String getFailureReason() {
        return failureReason;
    }


    /**
     * Sets the failureReason value for this KartablBaseBean.
     * 
     * @param failureReason
     */
    public void setFailureReason(java.lang.String failureReason) {
        this.failureReason = failureReason;
    }


    /**
     * Gets the kartablId value for this KartablBaseBean.
     * 
     * @return kartablId
     */
    public java.lang.String getKartablId() {
        return kartablId;
    }


    /**
     * Sets the kartablId value for this KartablBaseBean.
     * 
     * @param kartablId
     */
    public void setKartablId(java.lang.String kartablId) {
        this.kartablId = kartablId;
    }


    /**
     * Gets the lastStatusChangeDate value for this KartablBaseBean.
     * 
     * @return lastStatusChangeDate
     */
    public java.util.Calendar getLastStatusChangeDate() {
        return lastStatusChangeDate;
    }


    /**
     * Sets the lastStatusChangeDate value for this KartablBaseBean.
     * 
     * @param lastStatusChangeDate
     */
    public void setLastStatusChangeDate(java.util.Calendar lastStatusChangeDate) {
        this.lastStatusChangeDate = lastStatusChangeDate;
    }


    /**
     * Gets the referenceId value for this KartablBaseBean.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this KartablBaseBean.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the serviceName value for this KartablBaseBean.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this KartablBaseBean.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the sourceDeposit value for this KartablBaseBean.
     * 
     * @return sourceDeposit
     */
    public java.lang.String getSourceDeposit() {
        return sourceDeposit;
    }


    /**
     * Sets the sourceDeposit value for this KartablBaseBean.
     * 
     * @param sourceDeposit
     */
    public void setSourceDeposit(java.lang.String sourceDeposit) {
        this.sourceDeposit = sourceDeposit;
    }


    /**
     * Gets the status value for this KartablBaseBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this KartablBaseBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.KartablStatusWS status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KartablBaseBean)) return false;
        KartablBaseBean other = (KartablBaseBean) obj;
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
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.failureCode==null && other.getFailureCode()==null) || 
             (this.failureCode!=null &&
              this.failureCode.equals(other.getFailureCode()))) &&
            ((this.failureReason==null && other.getFailureReason()==null) || 
             (this.failureReason!=null &&
              this.failureReason.equals(other.getFailureReason()))) &&
            ((this.kartablId==null && other.getKartablId()==null) || 
             (this.kartablId!=null &&
              this.kartablId.equals(other.getKartablId()))) &&
            ((this.lastStatusChangeDate==null && other.getLastStatusChangeDate()==null) || 
             (this.lastStatusChangeDate!=null &&
              this.lastStatusChangeDate.equals(other.getLastStatusChangeDate()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.sourceDeposit==null && other.getSourceDeposit()==null) || 
             (this.sourceDeposit!=null &&
              this.sourceDeposit.equals(other.getSourceDeposit()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getFailureCode() != null) {
            _hashCode += getFailureCode().hashCode();
        }
        if (getFailureReason() != null) {
            _hashCode += getFailureReason().hashCode();
        }
        if (getKartablId() != null) {
            _hashCode += getKartablId().hashCode();
        }
        if (getLastStatusChangeDate() != null) {
            _hashCode += getLastStatusChangeDate().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getSourceDeposit() != null) {
            _hashCode += getSourceDeposit().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KartablBaseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablBaseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failureReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kartablId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kartablId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatusChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastStatusChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "kartablStatusWS"));
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
