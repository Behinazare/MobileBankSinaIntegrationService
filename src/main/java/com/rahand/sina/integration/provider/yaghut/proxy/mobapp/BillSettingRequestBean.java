/**
 * BillSettingRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BillSettingRequestBean  implements java.io.Serializable {
    private java.lang.Short billPageSize;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementTypeWS defaultBillStatementType;

    private java.lang.Short defaultLastN;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillFieldWS[] fields;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS order;

    public BillSettingRequestBean() {
    }

    public BillSettingRequestBean(
           java.lang.Short billPageSize,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementTypeWS defaultBillStatementType,
           java.lang.Short defaultLastN,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillFieldWS[] fields,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS order) {
           this.billPageSize = billPageSize;
           this.defaultBillStatementType = defaultBillStatementType;
           this.defaultLastN = defaultLastN;
           this.fields = fields;
           this.order = order;
    }


    /**
     * Gets the billPageSize value for this BillSettingRequestBean.
     * 
     * @return billPageSize
     */
    public java.lang.Short getBillPageSize() {
        return billPageSize;
    }


    /**
     * Sets the billPageSize value for this BillSettingRequestBean.
     * 
     * @param billPageSize
     */
    public void setBillPageSize(java.lang.Short billPageSize) {
        this.billPageSize = billPageSize;
    }


    /**
     * Gets the defaultBillStatementType value for this BillSettingRequestBean.
     * 
     * @return defaultBillStatementType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementTypeWS getDefaultBillStatementType() {
        return defaultBillStatementType;
    }


    /**
     * Sets the defaultBillStatementType value for this BillSettingRequestBean.
     * 
     * @param defaultBillStatementType
     */
    public void setDefaultBillStatementType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DefaultBillStatementTypeWS defaultBillStatementType) {
        this.defaultBillStatementType = defaultBillStatementType;
    }


    /**
     * Gets the defaultLastN value for this BillSettingRequestBean.
     * 
     * @return defaultLastN
     */
    public java.lang.Short getDefaultLastN() {
        return defaultLastN;
    }


    /**
     * Sets the defaultLastN value for this BillSettingRequestBean.
     * 
     * @param defaultLastN
     */
    public void setDefaultLastN(java.lang.Short defaultLastN) {
        this.defaultLastN = defaultLastN;
    }


    /**
     * Gets the fields value for this BillSettingRequestBean.
     * 
     * @return fields
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillFieldWS[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this BillSettingRequestBean.
     * 
     * @param fields
     */
    public void setFields(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillFieldWS[] fields) {
        this.fields = fields;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillFieldWS getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillFieldWS _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the order value for this BillSettingRequestBean.
     * 
     * @return order
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS getOrder() {
        return order;
    }


    /**
     * Sets the order value for this BillSettingRequestBean.
     * 
     * @param order
     */
    public void setOrder(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.OrderDirectionWS order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillSettingRequestBean)) return false;
        BillSettingRequestBean other = (BillSettingRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billPageSize==null && other.getBillPageSize()==null) || 
             (this.billPageSize!=null &&
              this.billPageSize.equals(other.getBillPageSize()))) &&
            ((this.defaultBillStatementType==null && other.getDefaultBillStatementType()==null) || 
             (this.defaultBillStatementType!=null &&
              this.defaultBillStatementType.equals(other.getDefaultBillStatementType()))) &&
            ((this.defaultLastN==null && other.getDefaultLastN()==null) || 
             (this.defaultLastN!=null &&
              this.defaultLastN.equals(other.getDefaultLastN()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder())));
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
        if (getBillPageSize() != null) {
            _hashCode += getBillPageSize().hashCode();
        }
        if (getDefaultBillStatementType() != null) {
            _hashCode += getDefaultBillStatementType().hashCode();
        }
        if (getDefaultLastN() != null) {
            _hashCode += getDefaultLastN().hashCode();
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillSettingRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billSettingRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billPageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultBillStatementType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultBillStatementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "defaultBillStatementTypeWS"));
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
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billFieldWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "orderDirectionWS"));
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
