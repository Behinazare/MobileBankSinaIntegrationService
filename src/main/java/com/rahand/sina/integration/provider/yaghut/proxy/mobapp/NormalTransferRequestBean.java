/**
 * NormalTransferRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class NormalTransferRequestBean  implements java.io.Serializable {
    private java.lang.String additionalDocumentDesc;

    private java.math.BigDecimal amount;

    private java.lang.String cif;

    private java.lang.String destinationComment;

    private java.lang.String destinationDeposit;

    private java.lang.String payId;

    private java.lang.String reasonCode;

    private java.lang.String referenceNumber;

    private java.lang.String sourceComment;

    private java.lang.String sourceDeposit;

    public NormalTransferRequestBean() {
    }

    public NormalTransferRequestBean(
           java.lang.String additionalDocumentDesc,
           java.math.BigDecimal amount,
           java.lang.String cif,
           java.lang.String destinationComment,
           java.lang.String destinationDeposit,
           java.lang.String payId,
           java.lang.String reasonCode,
           java.lang.String referenceNumber,
           java.lang.String sourceComment,
           java.lang.String sourceDeposit) {
           this.additionalDocumentDesc = additionalDocumentDesc;
           this.amount = amount;
           this.cif = cif;
           this.destinationComment = destinationComment;
           this.destinationDeposit = destinationDeposit;
           this.payId = payId;
           this.reasonCode = reasonCode;
           this.referenceNumber = referenceNumber;
           this.sourceComment = sourceComment;
           this.sourceDeposit = sourceDeposit;
    }


    /**
     * Gets the additionalDocumentDesc value for this NormalTransferRequestBean.
     * 
     * @return additionalDocumentDesc
     */
    public java.lang.String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }


    /**
     * Sets the additionalDocumentDesc value for this NormalTransferRequestBean.
     * 
     * @param additionalDocumentDesc
     */
    public void setAdditionalDocumentDesc(java.lang.String additionalDocumentDesc) {
        this.additionalDocumentDesc = additionalDocumentDesc;
    }


    /**
     * Gets the amount value for this NormalTransferRequestBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this NormalTransferRequestBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cif value for this NormalTransferRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this NormalTransferRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the destinationComment value for this NormalTransferRequestBean.
     * 
     * @return destinationComment
     */
    public java.lang.String getDestinationComment() {
        return destinationComment;
    }


    /**
     * Sets the destinationComment value for this NormalTransferRequestBean.
     * 
     * @param destinationComment
     */
    public void setDestinationComment(java.lang.String destinationComment) {
        this.destinationComment = destinationComment;
    }


    /**
     * Gets the destinationDeposit value for this NormalTransferRequestBean.
     * 
     * @return destinationDeposit
     */
    public java.lang.String getDestinationDeposit() {
        return destinationDeposit;
    }


    /**
     * Sets the destinationDeposit value for this NormalTransferRequestBean.
     * 
     * @param destinationDeposit
     */
    public void setDestinationDeposit(java.lang.String destinationDeposit) {
        this.destinationDeposit = destinationDeposit;
    }


    /**
     * Gets the payId value for this NormalTransferRequestBean.
     * 
     * @return payId
     */
    public java.lang.String getPayId() {
        return payId;
    }


    /**
     * Sets the payId value for this NormalTransferRequestBean.
     * 
     * @param payId
     */
    public void setPayId(java.lang.String payId) {
        this.payId = payId;
    }


    /**
     * Gets the reasonCode value for this NormalTransferRequestBean.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this NormalTransferRequestBean.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the referenceNumber value for this NormalTransferRequestBean.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this NormalTransferRequestBean.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the sourceComment value for this NormalTransferRequestBean.
     * 
     * @return sourceComment
     */
    public java.lang.String getSourceComment() {
        return sourceComment;
    }


    /**
     * Sets the sourceComment value for this NormalTransferRequestBean.
     * 
     * @param sourceComment
     */
    public void setSourceComment(java.lang.String sourceComment) {
        this.sourceComment = sourceComment;
    }


    /**
     * Gets the sourceDeposit value for this NormalTransferRequestBean.
     * 
     * @return sourceDeposit
     */
    public java.lang.String getSourceDeposit() {
        return sourceDeposit;
    }


    /**
     * Sets the sourceDeposit value for this NormalTransferRequestBean.
     * 
     * @param sourceDeposit
     */
    public void setSourceDeposit(java.lang.String sourceDeposit) {
        this.sourceDeposit = sourceDeposit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NormalTransferRequestBean)) return false;
        NormalTransferRequestBean other = (NormalTransferRequestBean) obj;
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
            ((this.destinationComment==null && other.getDestinationComment()==null) || 
             (this.destinationComment!=null &&
              this.destinationComment.equals(other.getDestinationComment()))) &&
            ((this.destinationDeposit==null && other.getDestinationDeposit()==null) || 
             (this.destinationDeposit!=null &&
              this.destinationDeposit.equals(other.getDestinationDeposit()))) &&
            ((this.payId==null && other.getPayId()==null) || 
             (this.payId!=null &&
              this.payId.equals(other.getPayId()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.sourceComment==null && other.getSourceComment()==null) || 
             (this.sourceComment!=null &&
              this.sourceComment.equals(other.getSourceComment()))) &&
            ((this.sourceDeposit==null && other.getSourceDeposit()==null) || 
             (this.sourceDeposit!=null &&
              this.sourceDeposit.equals(other.getSourceDeposit())));
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
        if (getDestinationComment() != null) {
            _hashCode += getDestinationComment().hashCode();
        }
        if (getDestinationDeposit() != null) {
            _hashCode += getDestinationDeposit().hashCode();
        }
        if (getPayId() != null) {
            _hashCode += getPayId().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getSourceComment() != null) {
            _hashCode += getSourceComment().hashCode();
        }
        if (getSourceDeposit() != null) {
            _hashCode += getSourceDeposit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NormalTransferRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "normalTransferRequestBean"));
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
        elemField.setFieldName("destinationComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationDeposit"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceComment"));
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
