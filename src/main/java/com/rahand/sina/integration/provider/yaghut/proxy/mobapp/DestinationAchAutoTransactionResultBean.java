/**
 * DestinationAchAutoTransactionResultBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DestinationAchAutoTransactionResultBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationAchTransactionResultBean  implements java.io.Serializable {
    private java.util.Calendar issueDate;

    public DestinationAchAutoTransactionResultBean() {
    }

    public DestinationAchAutoTransactionResultBean(
           java.math.BigDecimal amount,
           java.lang.String description,
           java.lang.String factorNumber,
           java.lang.String ibanNumber,
           java.lang.String id,
           java.lang.String ownerName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AchProblemTypeWS problemType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DestinationTransactionStatusWS status,
           java.util.Calendar issueDate) {
        super(
            amount,
            description,
            factorNumber,
            ibanNumber,
            id,
            ownerName,
            problemType,
            status);
        this.issueDate = issueDate;
    }


    /**
     * Gets the issueDate value for this DestinationAchAutoTransactionResultBean.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this DestinationAchAutoTransactionResultBean.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DestinationAchAutoTransactionResultBean)) return false;
        DestinationAchAutoTransactionResultBean other = (DestinationAchAutoTransactionResultBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate())));
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
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DestinationAchAutoTransactionResultBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "destinationAchAutoTransactionResultBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueDate"));
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
