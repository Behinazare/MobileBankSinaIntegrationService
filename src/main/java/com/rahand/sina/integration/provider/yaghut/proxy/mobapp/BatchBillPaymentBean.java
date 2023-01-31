/**
 * BatchBillPaymentBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BatchBillPaymentBean  implements java.io.Serializable {
    private boolean doneCompletely;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS problemType;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentResponseBean response;

    public BatchBillPaymentBean() {
    }

    public BatchBillPaymentBean(
           boolean doneCompletely,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS problemType,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentResponseBean response) {
           this.doneCompletely = doneCompletely;
           this.problemType = problemType;
           this.response = response;
    }


    /**
     * Gets the doneCompletely value for this BatchBillPaymentBean.
     * 
     * @return doneCompletely
     */
    public boolean isDoneCompletely() {
        return doneCompletely;
    }


    /**
     * Sets the doneCompletely value for this BatchBillPaymentBean.
     * 
     * @param doneCompletely
     */
    public void setDoneCompletely(boolean doneCompletely) {
        this.doneCompletely = doneCompletely;
    }


    /**
     * Gets the problemType value for this BatchBillPaymentBean.
     * 
     * @return problemType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS getProblemType() {
        return problemType;
    }


    /**
     * Sets the problemType value for this BatchBillPaymentBean.
     * 
     * @param problemType
     */
    public void setProblemType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ProblemTypeWS problemType) {
        this.problemType = problemType;
    }


    /**
     * Gets the response value for this BatchBillPaymentBean.
     * 
     * @return response
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentResponseBean getResponse() {
        return response;
    }


    /**
     * Sets the response value for this BatchBillPaymentBean.
     * 
     * @param response
     */
    public void setResponse(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BillPaymentResponseBean response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BatchBillPaymentBean)) return false;
        BatchBillPaymentBean other = (BatchBillPaymentBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.doneCompletely == other.isDoneCompletely() &&
            ((this.problemType==null && other.getProblemType()==null) || 
             (this.problemType!=null &&
              this.problemType.equals(other.getProblemType()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        _hashCode += (isDoneCompletely() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProblemType() != null) {
            _hashCode += getProblemType().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchBillPaymentBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "batchBillPaymentBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doneCompletely");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doneCompletely"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "problemTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "billPaymentResponseBean"));
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
