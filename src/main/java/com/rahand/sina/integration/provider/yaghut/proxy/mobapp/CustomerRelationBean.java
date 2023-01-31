/**
 * CustomerRelationBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CustomerRelationBean  implements java.io.Serializable {
    private java.lang.String customerLatinName;

    private java.lang.String customerName;

    private java.lang.String relatedCif;

    private java.util.Calendar relationExpirationDate;

    private java.util.Calendar relationStartDate;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationType relationType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationTypeNameBean relationTypeName;

    public CustomerRelationBean() {
    }

    public CustomerRelationBean(
           java.lang.String customerLatinName,
           java.lang.String customerName,
           java.lang.String relatedCif,
           java.util.Calendar relationExpirationDate,
           java.util.Calendar relationStartDate,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationType relationType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationTypeNameBean relationTypeName) {
           this.customerLatinName = customerLatinName;
           this.customerName = customerName;
           this.relatedCif = relatedCif;
           this.relationExpirationDate = relationExpirationDate;
           this.relationStartDate = relationStartDate;
           this.relationType = relationType;
           this.relationTypeName = relationTypeName;
    }


    /**
     * Gets the customerLatinName value for this CustomerRelationBean.
     * 
     * @return customerLatinName
     */
    public java.lang.String getCustomerLatinName() {
        return customerLatinName;
    }


    /**
     * Sets the customerLatinName value for this CustomerRelationBean.
     * 
     * @param customerLatinName
     */
    public void setCustomerLatinName(java.lang.String customerLatinName) {
        this.customerLatinName = customerLatinName;
    }


    /**
     * Gets the customerName value for this CustomerRelationBean.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this CustomerRelationBean.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the relatedCif value for this CustomerRelationBean.
     * 
     * @return relatedCif
     */
    public java.lang.String getRelatedCif() {
        return relatedCif;
    }


    /**
     * Sets the relatedCif value for this CustomerRelationBean.
     * 
     * @param relatedCif
     */
    public void setRelatedCif(java.lang.String relatedCif) {
        this.relatedCif = relatedCif;
    }


    /**
     * Gets the relationExpirationDate value for this CustomerRelationBean.
     * 
     * @return relationExpirationDate
     */
    public java.util.Calendar getRelationExpirationDate() {
        return relationExpirationDate;
    }


    /**
     * Sets the relationExpirationDate value for this CustomerRelationBean.
     * 
     * @param relationExpirationDate
     */
    public void setRelationExpirationDate(java.util.Calendar relationExpirationDate) {
        this.relationExpirationDate = relationExpirationDate;
    }


    /**
     * Gets the relationStartDate value for this CustomerRelationBean.
     * 
     * @return relationStartDate
     */
    public java.util.Calendar getRelationStartDate() {
        return relationStartDate;
    }


    /**
     * Sets the relationStartDate value for this CustomerRelationBean.
     * 
     * @param relationStartDate
     */
    public void setRelationStartDate(java.util.Calendar relationStartDate) {
        this.relationStartDate = relationStartDate;
    }


    /**
     * Gets the relationType value for this CustomerRelationBean.
     * 
     * @return relationType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationType getRelationType() {
        return relationType;
    }


    /**
     * Sets the relationType value for this CustomerRelationBean.
     * 
     * @param relationType
     */
    public void setRelationType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationType relationType) {
        this.relationType = relationType;
    }


    /**
     * Gets the relationTypeName value for this CustomerRelationBean.
     * 
     * @return relationTypeName
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationTypeNameBean getRelationTypeName() {
        return relationTypeName;
    }


    /**
     * Sets the relationTypeName value for this CustomerRelationBean.
     * 
     * @param relationTypeName
     */
    public void setRelationTypeName(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationTypeNameBean relationTypeName) {
        this.relationTypeName = relationTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerRelationBean)) return false;
        CustomerRelationBean other = (CustomerRelationBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerLatinName==null && other.getCustomerLatinName()==null) || 
             (this.customerLatinName!=null &&
              this.customerLatinName.equals(other.getCustomerLatinName()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.relatedCif==null && other.getRelatedCif()==null) || 
             (this.relatedCif!=null &&
              this.relatedCif.equals(other.getRelatedCif()))) &&
            ((this.relationExpirationDate==null && other.getRelationExpirationDate()==null) || 
             (this.relationExpirationDate!=null &&
              this.relationExpirationDate.equals(other.getRelationExpirationDate()))) &&
            ((this.relationStartDate==null && other.getRelationStartDate()==null) || 
             (this.relationStartDate!=null &&
              this.relationStartDate.equals(other.getRelationStartDate()))) &&
            ((this.relationType==null && other.getRelationType()==null) || 
             (this.relationType!=null &&
              this.relationType.equals(other.getRelationType()))) &&
            ((this.relationTypeName==null && other.getRelationTypeName()==null) || 
             (this.relationTypeName!=null &&
              this.relationTypeName.equals(other.getRelationTypeName())));
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
        if (getCustomerLatinName() != null) {
            _hashCode += getCustomerLatinName().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getRelatedCif() != null) {
            _hashCode += getRelatedCif().hashCode();
        }
        if (getRelationExpirationDate() != null) {
            _hashCode += getRelationExpirationDate().hashCode();
        }
        if (getRelationStartDate() != null) {
            _hashCode += getRelationStartDate().hashCode();
        }
        if (getRelationType() != null) {
            _hashCode += getRelationType().hashCode();
        }
        if (getRelationTypeName() != null) {
            _hashCode += getRelationTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerRelationBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerRelationBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerLatinName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerLatinName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedCif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedCif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerRelationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerRelationTypeNameBean"));
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
