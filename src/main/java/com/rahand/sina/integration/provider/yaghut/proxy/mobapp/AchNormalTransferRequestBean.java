/**
 * AchNormalTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class AchNormalTransferRequestBean  implements java.io.Serializable {
    private java.lang.String additionalDocumentDesc;

    private java.math.BigDecimal amount;

    private java.lang.String cif;

    private java.lang.String description;

    private java.lang.String factorNumber;

    private java.lang.String ibanNumber;

    private java.lang.String ownerName;

    private java.lang.String payId;

    private java.lang.String reasonCode;

    private java.lang.String reasonTitle;

    private java.lang.String sourceDepositNumber;

    private java.lang.String transferDescription;

    public AchNormalTransferRequestBean() {
    }

    public AchNormalTransferRequestBean(
           java.lang.String additionalDocumentDesc,
           java.math.BigDecimal amount,
           java.lang.String cif,
           java.lang.String description,
           java.lang.String factorNumber,
           java.lang.String ibanNumber,
           java.lang.String ownerName,
           java.lang.String payId,
           java.lang.String reasonCode,
           java.lang.String reasonTitle,
           java.lang.String sourceDepositNumber,
           java.lang.String transferDescription) {
           this.additionalDocumentDesc = additionalDocumentDesc;
           this.amount = amount;
           this.cif = cif;
           this.description = description;
           this.factorNumber = factorNumber;
           this.ibanNumber = ibanNumber;
           this.ownerName = ownerName;
           this.payId = payId;
           this.reasonCode = reasonCode;
           this.reasonTitle = reasonTitle;
           this.sourceDepositNumber = sourceDepositNumber;
           this.transferDescription = transferDescription;
    }


    /**
     * Gets the additionalDocumentDesc value for this AchNormalTransferRequestBean.
     * 
     * @return additionalDocumentDesc
     */
    public java.lang.String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }


    /**
     * Sets the additionalDocumentDesc value for this AchNormalTransferRequestBean.
     * 
     * @param additionalDocumentDesc
     */
    public void setAdditionalDocumentDesc(java.lang.String additionalDocumentDesc) {
        this.additionalDocumentDesc = additionalDocumentDesc;
    }


    /**
     * Gets the amount value for this AchNormalTransferRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AchNormalTransferRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cif value for this AchNormalTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this AchNormalTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the description value for this AchNormalTransferRequestBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AchNormalTransferRequestBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the factorNumber value for this AchNormalTransferRequestBean.
     * 
     * @return factorNumber
     */
    public java.lang.String getFactorNumber() {
        return factorNumber;
    }


    /**
     * Sets the factorNumber value for this AchNormalTransferRequestBean.
     * 
     * @param factorNumber
     */
    public void setFactorNumber(java.lang.String factorNumber) {
        this.factorNumber = factorNumber;
    }


    /**
     * Gets the ibanNumber value for this AchNormalTransferRequestBean.
     * 
     * @return ibanNumber
     */
    public java.lang.String getIbanNumber() {
        return ibanNumber;
    }


    /**
     * Sets the ibanNumber value for this AchNormalTransferRequestBean.
     * 
     * @param ibanNumber
     */
    public void setIbanNumber(java.lang.String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }


    /**
     * Gets the ownerName value for this AchNormalTransferRequestBean.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this AchNormalTransferRequestBean.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the payId value for this AchNormalTransferRequestBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this AchNormalTransferRequestBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the reasonCode value for this AchNormalTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this AchNormalTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the reasonTitle value for this AchNormalTransferRequestBean.
     * 
     * @return reasonTitle
     */
    public java.lang.String getReasonTitle() {
        return reasonTitle;
    }


    /**
     * Sets the reasonTitle value for this AchNormalTransferRequestBean.
     * 
     * @param reasonTitle
     */
    public void setReasonTitle(java.lang.String reasonTitle) {
        this.reasonTitle = reasonTitle;
    }


    /**
     * Gets the sourceDepositNumber value for this AchNormalTransferRequestBean.
     * 
     * @return sourceDepositNumber
     */
    public java.lang.String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this AchNormalTransferRequestBean.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(java.lang.String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the transferDescription value for this AchNormalTransferRequestBean.
     * 
     * @return transferDescription
     */
    public java.lang.String getTransferDescription() {
        return transferDescription;
    }


    /**
     * Sets the transferDescription value for this AchNormalTransferRequestBean.
     * 
     * @param transferDescription
     */
    public void setTransferDescription(java.lang.String transferDescription) {
        this.transferDescription = transferDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AchNormalTransferRequestBean)) return false;
        AchNormalTransferRequestBean other = (AchNormalTransferRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalDocumentDesc==null && other.getAdditionalDocumentDesc()==null) || 
             (this.additionalDocumentDesc!=null &&
              this.additionalDocumentDesc.equals(other.getAdditionalDocumentDesc()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.factorNumber==null && other.getFactorNumber()==null) || 
             (this.factorNumber!=null &&
              this.factorNumber.equals(other.getFactorNumber()))) &&
            ((this.ibanNumber==null && other.getIbanNumber()==null) || 
             (this.ibanNumber!=null &&
              this.ibanNumber.equals(other.getIbanNumber()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.reasonTitle==null && other.getReasonTitle()==null) || 
             (this.reasonTitle!=null &&
              this.reasonTitle.equals(other.getReasonTitle()))) &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.transferDescription==null && other.getTransferDescription()==null) || 
             (this.transferDescription!=null &&
              this.transferDescription.equals(other.getTransferDescription())));
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
        if (getAdditionalDocumentDesc() != null) {
            _hashCode += getAdditionalDocumentDesc().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFactorNumber() != null) {
            _hashCode += getFactorNumber().hashCode();
        }
        if (getIbanNumber() != null) {
            _hashCode += getIbanNumber().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReasonTitle() != null) {
            _hashCode += getReasonTitle().hashCode();
        }
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getTransferDescription() != null) {
            _hashCode += getTransferDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AchNormalTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achNormalTransferRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalDocumentDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalDocumentDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factorNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "factorNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ibanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferDescription"));
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
