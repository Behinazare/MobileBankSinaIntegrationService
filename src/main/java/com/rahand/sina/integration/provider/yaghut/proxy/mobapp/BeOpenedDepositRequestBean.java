/**
 * BeOpenedDepositRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BeOpenedDepositRequestBean  implements java.io.Serializable {
    private java.lang.String[] currencies;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup;

    private java.lang.Long depositType;

    private java.lang.Long length;

    private java.lang.Long offset;

    public BeOpenedDepositRequestBean() {
    }

    public BeOpenedDepositRequestBean(
           java.lang.String[] currencies,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup,
           java.lang.Long depositType,
           java.lang.Long length,
           java.lang.Long offset) {
           this.currencies = currencies;
           this.depositGroup = depositGroup;
           this.depositType = depositType;
           this.length = length;
           this.offset = offset;
    }


    /**
     * Gets the currencies value for this BeOpenedDepositRequestBean.
     * 
     * @return currencies
     */
    public java.lang.String[] getCurrencies() {
        return currencies;
    }


    /**
     * Sets the currencies value for this BeOpenedDepositRequestBean.
     * 
     * @param currencies
     */
    public void setCurrencies(java.lang.String[] currencies) {
        this.currencies = currencies;
    }

    public java.lang.String getCurrencies(int i) {
        return this.currencies[i];
    }

    public void setCurrencies(int i, java.lang.String _value) {
        this.currencies[i] = _value;
    }


    /**
     * Gets the depositGroup value for this BeOpenedDepositRequestBean.
     * 
     * @return depositGroup
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getDepositGroup() {
        return depositGroup;
    }


    /**
     * Sets the depositGroup value for this BeOpenedDepositRequestBean.
     * 
     * @param depositGroup
     */
    public void setDepositGroup(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup) {
        this.depositGroup = depositGroup;
    }


    /**
     * Gets the depositType value for this BeOpenedDepositRequestBean.
     * 
     * @return depositType
     */
    public java.lang.Long getDepositType() {
        return depositType;
    }


    /**
     * Sets the depositType value for this BeOpenedDepositRequestBean.
     * 
     * @param depositType
     */
    public void setDepositType(java.lang.Long depositType) {
        this.depositType = depositType;
    }


    /**
     * Gets the length value for this BeOpenedDepositRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this BeOpenedDepositRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this BeOpenedDepositRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this BeOpenedDepositRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BeOpenedDepositRequestBean)) return false;
        BeOpenedDepositRequestBean other = (BeOpenedDepositRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencies==null && other.getCurrencies()==null) || 
             (this.currencies!=null &&
              java.util.Arrays.equals(this.currencies, other.getCurrencies()))) &&
            ((this.depositGroup==null && other.getDepositGroup()==null) || 
             (this.depositGroup!=null &&
              this.depositGroup.equals(other.getDepositGroup()))) &&
            ((this.depositType==null && other.getDepositType()==null) || 
             (this.depositType!=null &&
              this.depositType.equals(other.getDepositType()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset())));
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
        if (getCurrencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositGroup() != null) {
            _hashCode += getDepositGroup().hashCode();
        }
        if (getDepositType() != null) {
            _hashCode += getDepositType().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BeOpenedDepositRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "beOpenedDepositRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "depositGroupTypeWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
