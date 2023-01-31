/**
 * SearchCardBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class SearchCardBean  implements java.io.Serializable {
    private java.util.Calendar fromExpireDate;

    private java.util.Calendar fromIssueDate;

    private java.lang.String pan;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus status;

    private java.util.Calendar toExpireDate;

    private java.util.Calendar toIssueDate;

    public SearchCardBean() {
    }

    public SearchCardBean(
           java.util.Calendar fromExpireDate,
           java.util.Calendar fromIssueDate,
           java.lang.String pan,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus status,
           java.util.Calendar toExpireDate,
           java.util.Calendar toIssueDate) {
           this.fromExpireDate = fromExpireDate;
           this.fromIssueDate = fromIssueDate;
           this.pan = pan;
           this.status = status;
           this.toExpireDate = toExpireDate;
           this.toIssueDate = toIssueDate;
    }


    /**
     * Gets the fromExpireDate value for this SearchCardBean.
     * 
     * @return fromExpireDate
     */
    public java.util.Calendar getFromExpireDate() {
        return fromExpireDate;
    }


    /**
     * Sets the fromExpireDate value for this SearchCardBean.
     * 
     * @param fromExpireDate
     */
    public void setFromExpireDate(java.util.Calendar fromExpireDate) {
        this.fromExpireDate = fromExpireDate;
    }


    /**
     * Gets the fromIssueDate value for this SearchCardBean.
     * 
     * @return fromIssueDate
     */
    public java.util.Calendar getFromIssueDate() {
        return fromIssueDate;
    }


    /**
     * Sets the fromIssueDate value for this SearchCardBean.
     * 
     * @param fromIssueDate
     */
    public void setFromIssueDate(java.util.Calendar fromIssueDate) {
        this.fromIssueDate = fromIssueDate;
    }


    /**
     * Gets the pan value for this SearchCardBean.
     * 
     * @return pan
     */
    public java.lang.String getPan() {
        return pan;
    }


    /**
     * Sets the pan value for this SearchCardBean.
     * 
     * @param pan
     */
    public void setPan(java.lang.String pan) {
        this.pan = pan;
    }


    /**
     * Gets the status value for this SearchCardBean.
     * 
     * @return status
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SearchCardBean.
     * 
     * @param status
     */
    public void setStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardStatus status) {
        this.status = status;
    }


    /**
     * Gets the toExpireDate value for this SearchCardBean.
     * 
     * @return toExpireDate
     */
    public java.util.Calendar getToExpireDate() {
        return toExpireDate;
    }


    /**
     * Sets the toExpireDate value for this SearchCardBean.
     * 
     * @param toExpireDate
     */
    public void setToExpireDate(java.util.Calendar toExpireDate) {
        this.toExpireDate = toExpireDate;
    }


    /**
     * Gets the toIssueDate value for this SearchCardBean.
     * 
     * @return toIssueDate
     */
    public java.util.Calendar getToIssueDate() {
        return toIssueDate;
    }


    /**
     * Sets the toIssueDate value for this SearchCardBean.
     * 
     * @param toIssueDate
     */
    public void setToIssueDate(java.util.Calendar toIssueDate) {
        this.toIssueDate = toIssueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCardBean)) return false;
        SearchCardBean other = (SearchCardBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromExpireDate==null && other.getFromExpireDate()==null) || 
             (this.fromExpireDate!=null &&
              this.fromExpireDate.equals(other.getFromExpireDate()))) &&
            ((this.fromIssueDate==null && other.getFromIssueDate()==null) || 
             (this.fromIssueDate!=null &&
              this.fromIssueDate.equals(other.getFromIssueDate()))) &&
            ((this.pan==null && other.getPan()==null) || 
             (this.pan!=null &&
              this.pan.equals(other.getPan()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.toExpireDate==null && other.getToExpireDate()==null) || 
             (this.toExpireDate!=null &&
              this.toExpireDate.equals(other.getToExpireDate()))) &&
            ((this.toIssueDate==null && other.getToIssueDate()==null) || 
             (this.toIssueDate!=null &&
              this.toIssueDate.equals(other.getToIssueDate())));
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
        if (getFromExpireDate() != null) {
            _hashCode += getFromExpireDate().hashCode();
        }
        if (getFromIssueDate() != null) {
            _hashCode += getFromIssueDate().hashCode();
        }
        if (getPan() != null) {
            _hashCode += getPan().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getToExpireDate() != null) {
            _hashCode += getToExpireDate().hashCode();
        }
        if (getToIssueDate() != null) {
            _hashCode += getToIssueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchCardBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "searchCardBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromIssueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardStatus"));
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
        elemField.setFieldName("toIssueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toIssueDate"));
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
