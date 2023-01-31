/**
 * UserTaskResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.sinabpms;

public class UserTaskResponseBean  implements java.io.Serializable {
    private long totalRecord;

    private UserTaskBean[] userTasks;

    public UserTaskResponseBean() {
    }

    public UserTaskResponseBean(
           long totalRecord,
           UserTaskBean[] userTasks) {
           this.totalRecord = totalRecord;
           this.userTasks = userTasks;
    }


    /**
     * Gets the totalRecord value for this UserTaskResponseBean.
     * 
     * @return totalRecord
     */
    public long getTotalRecord() {
        return totalRecord;
    }


    /**
     * Sets the totalRecord value for this UserTaskResponseBean.
     * 
     * @param totalRecord
     */
    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }


    /**
     * Gets the userTasks value for this UserTaskResponseBean.
     * 
     * @return userTasks
     */
    public UserTaskBean[] getUserTasks() {
        return userTasks;
    }


    /**
     * Sets the userTasks value for this UserTaskResponseBean.
     * 
     * @param userTasks
     */
    public void setUserTasks(UserTaskBean[] userTasks) {
        this.userTasks = userTasks;
    }

    public UserTaskBean getUserTasks(int i) {
        return this.userTasks[i];
    }

    public void setUserTasks(int i, UserTaskBean _value) {
        this.userTasks[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserTaskResponseBean)) return false;
        UserTaskResponseBean other = (UserTaskResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.totalRecord == other.getTotalRecord() &&
            ((this.userTasks==null && other.getUserTasks()==null) || 
             (this.userTasks!=null &&
              java.util.Arrays.equals(this.userTasks, other.getUserTasks())));
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
        _hashCode += new Long(getTotalRecord()).hashCode();
        if (getUserTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserTasks());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUserTasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTaskResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userTaskResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "userTaskBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
