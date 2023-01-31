/**
 * InstantInterbankTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class InstantInterbankTransferRequestBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String cif;

    private java.lang.String destinationIBAN;

    private java.lang.String destinationIbanOwnerName;

    private java.lang.String payId;

    private java.lang.String reasonCode;

    private java.lang.String reasonTitle;

    private java.lang.String sourceDeposit;

    private java.lang.String sourceDescription;

    public InstantInterbankTransferRequestBean() {
    }

    public InstantInterbankTransferRequestBean(
           java.math.BigDecimal amount,
           java.lang.String cif,
           java.lang.String destinationIBAN,
           java.lang.String destinationIbanOwnerName,
           java.lang.String payId,
           java.lang.String reasonCode,
           java.lang.String reasonTitle,
           java.lang.String sourceDeposit,
           java.lang.String sourceDescription) {
           this.amount = amount;
           this.cif = cif;
           this.destinationIBAN = destinationIBAN;
           this.destinationIbanOwnerName = destinationIbanOwnerName;
           this.payId = payId;
           this.reasonCode = reasonCode;
           this.reasonTitle = reasonTitle;
           this.sourceDeposit = sourceDeposit;
           this.sourceDescription = sourceDescription;
    }


    /**
     * Gets the amount value for this InstantInterbankTransferRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this InstantInterbankTransferRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cif value for this InstantInterbankTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this InstantInterbankTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the destinationIBAN value for this InstantInterbankTransferRequestBean.
     * 
     * @return destinationIBAN
     */
    public java.lang.String getDestinationIBAN() {
        return destinationIBAN;
    }


    /**
     * Sets the destinationIBAN value for this InstantInterbankTransferRequestBean.
     * 
     * @param destinationIBAN
     */
    public void setDestinationIBAN(java.lang.String destinationIBAN) {
        this.destinationIBAN = destinationIBAN;
    }


    /**
     * Gets the destinationIbanOwnerName value for this InstantInterbankTransferRequestBean.
     * 
     * @return destinationIbanOwnerName
     */
    public java.lang.String getDestinationIbanOwnerName() {
        return destinationIbanOwnerName;
    }


    /**
     * Sets the destinationIbanOwnerName value for this InstantInterbankTransferRequestBean.
     * 
     * @param destinationIbanOwnerName
     */
    public void setDestinationIbanOwnerName(java.lang.String destinationIbanOwnerName) {
        this.destinationIbanOwnerName = destinationIbanOwnerName;
    }


    /**
     * Gets the payId value for this InstantInterbankTransferRequestBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this InstantInterbankTransferRequestBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the reasonCode value for this InstantInterbankTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this InstantInterbankTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the reasonTitle value for this InstantInterbankTransferRequestBean.
     * 
     * @return reasonTitle
     */
    public java.lang.String getReasonTitle() {
        return reasonTitle;
    }


    /**
     * Sets the reasonTitle value for this InstantInterbankTransferRequestBean.
     * 
     * @param reasonTitle
     */
    public void setReasonTitle(java.lang.String reasonTitle) {
        this.reasonTitle = reasonTitle;
    }


    /**
     * Gets the sourceDeposit value for this InstantInterbankTransferRequestBean.
     * 
     * @return sourceDeposit
     */
    public java.lang.String getSourceDeposit() {
        return sourceDeposit;
    }


    /**
     * Sets the sourceDeposit value for this InstantInterbankTransferRequestBean.
     * 
     * @param sourceDeposit
     */
    public void setSourceDeposit(java.lang.String sourceDeposit) {
        this.sourceDeposit = sourceDeposit;
    }


    /**
     * Gets the sourceDescription value for this InstantInterbankTransferRequestBean.
     * 
     * @return sourceDescription
     */
    public java.lang.String getSourceDescription() {
        return sourceDescription;
    }


    /**
     * Sets the sourceDescription value for this InstantInterbankTransferRequestBean.
     * 
     * @param sourceDescription
     */
    public void setSourceDescription(java.lang.String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstantInterbankTransferRequestBean)) return false;
        InstantInterbankTransferRequestBean other = (InstantInterbankTransferRequestBean) obj;
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
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.destinationIBAN==null && other.getDestinationIBAN()==null) || 
             (this.destinationIBAN!=null &&
              this.destinationIBAN.equals(other.getDestinationIBAN()))) &&
            ((this.destinationIbanOwnerName==null && other.getDestinationIbanOwnerName()==null) || 
             (this.destinationIbanOwnerName!=null &&
              this.destinationIbanOwnerName.equals(other.getDestinationIbanOwnerName()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.reasonTitle==null && other.getReasonTitle()==null) || 
             (this.reasonTitle!=null &&
              this.reasonTitle.equals(other.getReasonTitle()))) &&
            ((this.sourceDeposit==null && other.getSourceDeposit()==null) || 
             (this.sourceDeposit!=null &&
              this.sourceDeposit.equals(other.getSourceDeposit()))) &&
            ((this.sourceDescription==null && other.getSourceDescription()==null) || 
             (this.sourceDescription!=null &&
              this.sourceDescription.equals(other.getSourceDescription())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDestinationIBAN() != null) {
            _hashCode += getDestinationIBAN().hashCode();
        }
        if (getDestinationIbanOwnerName() != null) {
            _hashCode += getDestinationIbanOwnerName().hashCode();
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
        if (getSourceDeposit() != null) {
            _hashCode += getSourceDeposit().hashCode();
        }
        if (getSourceDescription() != null) {
            _hashCode += getSourceDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstantInterbankTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "instantInterbankTransferRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("destinationIBAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationIBAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationIbanOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationIbanOwnerName"));
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
        elemField.setFieldName("sourceDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceDescription"));
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
