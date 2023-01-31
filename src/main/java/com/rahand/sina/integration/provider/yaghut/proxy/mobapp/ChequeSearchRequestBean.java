/**
 * ChequeSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class ChequeSearchRequestBean  implements java.io.Serializable {
    private java.lang.String chequeBookNumber;

    private java.lang.String chequeNumber;

    private java.lang.String cif;

    private java.lang.String depositNumber;

    private java.lang.Long length;

    private java.lang.Long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus[] statuses;

    public ChequeSearchRequestBean() {
    }

    public ChequeSearchRequestBean(
           java.lang.String chequeBookNumber,
           java.lang.String chequeNumber,
           java.lang.String cif,
           java.lang.String depositNumber,
           java.lang.Long length,
           java.lang.Long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus[] statuses) {
           this.chequeBookNumber = chequeBookNumber;
           this.chequeNumber = chequeNumber;
           this.cif = cif;
           this.depositNumber = depositNumber;
           this.length = length;
           this.offset = offset;
           this.statuses = statuses;
    }


    /**
     * Gets the chequeBookNumber value for this ChequeSearchRequestBean.
     * 
     * @return chequeBookNumber
     */
    public java.lang.String getChequeBookNumber() {
        return chequeBookNumber;
    }


    /**
     * Sets the chequeBookNumber value for this ChequeSearchRequestBean.
     * 
     * @param chequeBookNumber
     */
    public void setChequeBookNumber(java.lang.String chequeBookNumber) {
        this.chequeBookNumber = chequeBookNumber;
    }


    /**
     * Gets the chequeNumber value for this ChequeSearchRequestBean.
     * 
     * @return chequeNumber
     */
    public java.lang.String getChequeNumber() {
        return chequeNumber;
    }


    /**
     * Sets the chequeNumber value for this ChequeSearchRequestBean.
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(java.lang.String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }


    /**
     * Gets the cif value for this ChequeSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this ChequeSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the depositNumber value for this ChequeSearchRequestBean.
     * 
     * @return depositNumber
     */
    public java.lang.String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this ChequeSearchRequestBean.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(java.lang.String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the length value for this ChequeSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this ChequeSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the offset value for this ChequeSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this ChequeSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the statuses value for this ChequeSearchRequestBean.
     * 
     * @return statuses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this ChequeSearchRequestBean.
     * 
     * @param statuses
     */
    public void setStatuses(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus[] statuses) {
        this.statuses = statuses;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus getStatuses(int i) {
        return this.statuses[i];
    }

    public void setStatuses(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.ChequeStatus _value) {
        this.statuses[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChequeSearchRequestBean)) return false;
        ChequeSearchRequestBean other = (ChequeSearchRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chequeBookNumber==null && other.getChequeBookNumber()==null) || 
             (this.chequeBookNumber!=null &&
              this.chequeBookNumber.equals(other.getChequeBookNumber()))) &&
            ((this.chequeNumber==null && other.getChequeNumber()==null) || 
             (this.chequeNumber!=null &&
              this.chequeNumber.equals(other.getChequeNumber()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses())));
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
        if (getChequeBookNumber() != null) {
            _hashCode += getChequeBookNumber().hashCode();
        }
        if (getChequeNumber() != null) {
            _hashCode += getChequeNumber().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
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
        new org.apache.axis.description.TypeDesc(ChequeSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeBookNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeBookNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "chequeStatus"));
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
