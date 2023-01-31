/**
 * DefaultStatementResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class DefaultStatementResponseBean  extends com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillBeanField[] billFields;

    private java.lang.Short billPageSize;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType defaultBillStatementType;

    private java.lang.Short defaultLastN;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderStatus defaultOrder;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    public DefaultStatementResponseBean() {
    }

    public DefaultStatementResponseBean(
           boolean hasMoreItem,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementBean[] statementBeans,
           long totalRecord,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillBeanField[] billFields,
           java.lang.Short billPageSize,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType defaultBillStatementType,
           java.lang.Short defaultLastN,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderStatus defaultOrder,
           java.util.Calendar fromDate,
           java.util.Calendar toDate) {
        super(
            hasMoreItem,
            statementBeans,
            totalRecord);
        this.billFields = billFields;
        this.billPageSize = billPageSize;
        this.defaultBillStatementType = defaultBillStatementType;
        this.defaultLastN = defaultLastN;
        this.defaultOrder = defaultOrder;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }


    /**
     * Gets the billFields value for this DefaultStatementResponseBean.
     * 
     * @return billFields
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillBeanField[] getBillFields() {
        return billFields;
    }


    /**
     * Sets the billFields value for this DefaultStatementResponseBean.
     * 
     * @param billFields
     */
    public void setBillFields(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillBeanField[] billFields) {
        this.billFields = billFields;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillBeanField getBillFields(int i) {
        return this.billFields[i];
    }

    public void setBillFields(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillBeanField _value) {
        this.billFields[i] = _value;
    }


    /**
     * Gets the billPageSize value for this DefaultStatementResponseBean.
     * 
     * @return billPageSize
     */
    public java.lang.Short getBillPageSize() {
        return billPageSize;
    }


    /**
     * Sets the billPageSize value for this DefaultStatementResponseBean.
     * 
     * @param billPageSize
     */
    public void setBillPageSize(java.lang.Short billPageSize) {
        this.billPageSize = billPageSize;
    }


    /**
     * Gets the defaultBillStatementType value for this DefaultStatementResponseBean.
     * 
     * @return defaultBillStatementType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType getDefaultBillStatementType() {
        return defaultBillStatementType;
    }


    /**
     * Sets the defaultBillStatementType value for this DefaultStatementResponseBean.
     * 
     * @param defaultBillStatementType
     */
    public void setDefaultBillStatementType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementBeanType defaultBillStatementType) {
        this.defaultBillStatementType = defaultBillStatementType;
    }


    /**
     * Gets the defaultLastN value for this DefaultStatementResponseBean.
     * 
     * @return defaultLastN
     */
    public java.lang.Short getDefaultLastN() {
        return defaultLastN;
    }


    /**
     * Sets the defaultLastN value for this DefaultStatementResponseBean.
     * 
     * @param defaultLastN
     */
    public void setDefaultLastN(java.lang.Short defaultLastN) {
        this.defaultLastN = defaultLastN;
    }


    /**
     * Gets the defaultOrder value for this DefaultStatementResponseBean.
     * 
     * @return defaultOrder
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderStatus getDefaultOrder() {
        return defaultOrder;
    }


    /**
     * Sets the defaultOrder value for this DefaultStatementResponseBean.
     * 
     * @param defaultOrder
     */
    public void setDefaultOrder(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderStatus defaultOrder) {
        this.defaultOrder = defaultOrder;
    }


    /**
     * Gets the fromDate value for this DefaultStatementResponseBean.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this DefaultStatementResponseBean.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this DefaultStatementResponseBean.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this DefaultStatementResponseBean.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefaultStatementResponseBean)) return false;
        DefaultStatementResponseBean other = (DefaultStatementResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.billFields==null && other.getBillFields()==null) || 
             (this.billFields!=null &&
              java.util.Arrays.equals(this.billFields, other.getBillFields()))) &&
            ((this.billPageSize==null && other.getBillPageSize()==null) || 
             (this.billPageSize!=null &&
              this.billPageSize.equals(other.getBillPageSize()))) &&
            ((this.defaultBillStatementType==null && other.getDefaultBillStatementType()==null) || 
             (this.defaultBillStatementType!=null &&
              this.defaultBillStatementType.equals(other.getDefaultBillStatementType()))) &&
            ((this.defaultLastN==null && other.getDefaultLastN()==null) || 
             (this.defaultLastN!=null &&
              this.defaultLastN.equals(other.getDefaultLastN()))) &&
            ((this.defaultOrder==null && other.getDefaultOrder()==null) || 
             (this.defaultOrder!=null &&
              this.defaultOrder.equals(other.getDefaultOrder()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
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
        if (getBillFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillPageSize() != null) {
            _hashCode += getBillPageSize().hashCode();
        }
        if (getDefaultBillStatementType() != null) {
            _hashCode += getDefaultBillStatementType().hashCode();
        }
        if (getDefaultLastN() != null) {
            _hashCode += getDefaultLastN().hashCode();
        }
        if (getDefaultOrder() != null) {
            _hashCode += getDefaultOrder().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefaultStatementResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "defaultStatementResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billBeanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billPageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultBillStatementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultBillStatementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "defaultBillStatementBeanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLastN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLastN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "orderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
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
