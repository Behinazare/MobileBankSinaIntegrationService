/**
 * MessageStateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.armaghan.proxy;

public class MessageStateResult  implements java.io.Serializable {
    private MessageState[] states;

    private Error error;

    public MessageStateResult() {
    }

    public MessageStateResult(
           MessageState[] states,
           Error error) {
           this.states = states;
           this.error = error;
    }


    /**
     * Gets the states value for this MessageStateResult.
     * 
     * @return states
     */
    public MessageState[] getStates() {
        return states;
    }


    /**
     * Sets the states value for this MessageStateResult.
     * 
     * @param states
     */
    public void setStates(MessageState[] states) {
        this.states = states;
    }

    public MessageState getStates(int i) {
        return this.states[i];
    }

    public void setStates(int i, MessageState _value) {
        this.states[i] = _value;
    }


    /**
     * Gets the error value for this MessageStateResult.
     * 
     * @return error
     */
    public Error getError() {
        return error;
    }


    /**
     * Sets the error value for this MessageStateResult.
     * 
     * @param error
     */
    public void setError(Error error) {
        this.error = error;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MessageStateResult)) return false;
        MessageStateResult other = (MessageStateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.states==null && other.getStates()==null) || 
             (this.states!=null &&
              java.util.Arrays.equals(this.states, other.getStates()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStates());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageStateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "messageStateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("states");
        elemField.setXmlName(new javax.xml.namespace.QName("", "states"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "messageState"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "error"));
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
