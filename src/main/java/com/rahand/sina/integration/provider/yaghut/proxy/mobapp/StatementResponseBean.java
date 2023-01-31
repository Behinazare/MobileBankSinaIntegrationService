/**
 * StatementResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class StatementResponseBean  implements java.io.Serializable {
    private boolean hasMoreItem;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementBean[] statementBeans;

    private long totalRecord;

    public StatementResponseBean() {
    }

    public StatementResponseBean(
           boolean hasMoreItem,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementBean[] statementBeans,
           long totalRecord) {
           this.hasMoreItem = hasMoreItem;
           this.statementBeans = statementBeans;
           this.totalRecord = totalRecord;
    }


    /**
     * Gets the hasMoreItem value for this StatementResponseBean.
     * 
     * @return hasMoreItem
     */
    public boolean isHasMoreItem() {
        return hasMoreItem;
    }


    /**
     * Sets the hasMoreItem value for this StatementResponseBean.
     * 
     * @param hasMoreItem
     */
    public void setHasMoreItem(boolean hasMoreItem) {
        this.hasMoreItem = hasMoreItem;
    }


    /**
     * Gets the statementBeans value for this StatementResponseBean.
     * 
     * @return statementBeans
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementBean[] getStatementBeans() {
        return statementBeans;
    }


    /**
     * Sets the statementBeans value for this StatementResponseBean.
     * 
     * @param statementBeans
     */
    public void setStatementBeans(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementBean[] statementBeans) {
        this.statementBeans = statementBeans;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementBean getStatementBeans(int i) {
        return this.statementBeans[i];
    }

    public void setStatementBeans(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.StatementBean _value) {
        this.statementBeans[i] = _value;
    }


    /**
     * Gets the totalRecord value for this StatementResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this StatementResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatementResponseBean)) return false;
        StatementResponseBean other = (StatementResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.hasMoreItem == other.isHasMoreItem() &&
            ((this.statementBeans==null && other.getStatementBeans()==null) || 
             (this.statementBeans!=null &&
              java.util.Arrays.equals(this.statementBeans, other.getStatementBeans()))) &&
            this.totalRecord == other.getTotalRecord();
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
        _hashCode += (isHasMoreItem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatementBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatementBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatementBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getTotalRecord()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatementResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "statementResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMoreItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasMoreItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementBeans");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statementBeans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "statementBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
