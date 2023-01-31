/**
 * DestinationAchTransactionResultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DestinationAchTransactionResultBean  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String description;

    private java.lang.String factorNumber;

    private java.lang.String ibanNumber;

    private java.lang.String id;

    private java.lang.String ownerName;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchProblemTypeWS problemType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS status;

    public DestinationAchTransactionResultBean() {
    }

    public DestinationAchTransactionResultBean(
           java.math.BigDecimal amount,
           java.lang.String description,
           java.lang.String factorNumber,
           java.lang.String ibanNumber,
           java.lang.String id,
           java.lang.String ownerName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchProblemTypeWS problemType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS status) {
           this.amount = amount;
           this.description = description;
           this.factorNumber = factorNumber;
           this.ibanNumber = ibanNumber;
           this.id = id;
           this.ownerName = ownerName;
           this.problemType = problemType;
           this.status = status;
    }


    /**
     * Gets the amount value for this DestinationAchTransactionResultBean.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DestinationAchTransactionResultBean.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the description value for this DestinationAchTransactionResultBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DestinationAchTransactionResultBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the factorNumber value for this DestinationAchTransactionResultBean.
     * 
     * @return factorNumber
     */
    public java.lang.String getFactorNumber() {
        return factorNumber;
    }


    /**
     * Sets the factorNumber value for this DestinationAchTransactionResultBean.
     * 
     * @param factorNumber
     */
    public void setFactorNumber(java.lang.String factorNumber) {
        this.factorNumber = factorNumber;
    }


    /**
     * Gets the ibanNumber value for this DestinationAchTransactionResultBean.
     * 
     * @return ibanNumber
     */
    public java.lang.String getIbanNumber() {
        return ibanNumber;
    }


    /**
     * Sets the ibanNumber value for this DestinationAchTransactionResultBean.
     * 
     * @param ibanNumber
     */
    public void setIbanNumber(java.lang.String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }


    /**
     * Gets the id value for this DestinationAchTransactionResultBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DestinationAchTransactionResultBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ownerName value for this DestinationAchTransactionResultBean.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this DestinationAchTransactionResultBean.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the problemType value for this DestinationAchTransactionResultBean.
     * 
     * @return problemType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchProblemTypeWS getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this DestinationAchTransactionResultBean.
     * 
     * @param problemType
     */
    public void setProblemType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchProblemTypeWS problemType) {
        this.problemType = problemType;
    }


    /**
     * Gets the status value for this DestinationAchTransactionResultBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DestinationAchTransactionResultBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DestinationAchTransactionResultBean)) return false;
        DestinationAchTransactionResultBean other = (DestinationAchTransactionResultBean) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.factorNumber==null && other.getFactorNumber()==null) || 
             (this.factorNumber!=null &&
              this.factorNumber.equals(other.getFactorNumber()))) &&
            ((this.ibanNumber==null && other.getIbanNumber()==null) || 
             (this.ibanNumber!=null &&
              this.ibanNumber.equals(other.getIbanNumber()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.problemType==null && other.getProblemType()==null) || 
             (this.problemType!=null &&
              this.problemType.equals(other.getProblemType()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFactorNumber() != null) {
            _hashCode += getFactorNumber().hashCode();
        }
        if (getIbanNumber() != null) {
            _hashCode += getIbanNumber().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getProblemType() != null) {
            _hashCode += getProblemType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DestinationAchTransactionResultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationAchTransactionResultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "achProblemTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationTransactionStatusWS"));
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
