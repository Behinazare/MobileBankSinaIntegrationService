/**
 * FinancialServiceResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class FinancialServiceResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean deposit;

    private java.lang.String switchResponseRRN;

    public FinancialServiceResponseBean() {
    }

    public FinancialServiceResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean deposit,
           java.lang.String switchResponseRRN) {
           this.deposit = deposit;
           this.switchResponseRRN = switchResponseRRN;
    }


    /**
     * Gets the deposit value for this FinancialServiceResponseBean.
     * 
     * @return deposit
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this FinancialServiceResponseBean.
     * 
     * @param deposit
     */
    public void setDeposit(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CardDepositBean deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the switchResponseRRN value for this FinancialServiceResponseBean.
     * 
     * @return switchResponseRRN
     */
    public java.lang.String getSwitchResponseRRN() {
        return switchResponseRRN;
    }


    /**
     * Sets the switchResponseRRN value for this FinancialServiceResponseBean.
     * 
     * @param switchResponseRRN
     */
    public void setSwitchResponseRRN(java.lang.String switchResponseRRN) {
        this.switchResponseRRN = switchResponseRRN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinancialServiceResponseBean)) return false;
        FinancialServiceResponseBean other = (FinancialServiceResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.switchResponseRRN==null && other.getSwitchResponseRRN()==null) || 
             (this.switchResponseRRN!=null &&
              this.switchResponseRRN.equals(other.getSwitchResponseRRN())));
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
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getSwitchResponseRRN() != null) {
            _hashCode += getSwitchResponseRRN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FinancialServiceResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "financialServiceResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "cardDepositBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchResponseRRN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchResponseRRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
