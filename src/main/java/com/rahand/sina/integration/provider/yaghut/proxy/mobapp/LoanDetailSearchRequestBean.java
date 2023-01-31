/**
 * LoanDetailSearchRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanDetailSearchRequestBean  implements java.io.Serializable {
    private java.lang.String cbLoanNumber;

    private java.lang.String cif;

    private boolean hasDetail;

    private java.lang.Long length;

    private java.lang.String loanNumber;

    private java.lang.Long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS payStatus;

    public LoanDetailSearchRequestBean() {
    }

    public LoanDetailSearchRequestBean(
           java.lang.String cbLoanNumber,
           java.lang.String cif,
           boolean hasDetail,
           java.lang.Long length,
           java.lang.String loanNumber,
           java.lang.Long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS payStatus) {
           this.cbLoanNumber = cbLoanNumber;
           this.cif = cif;
           this.hasDetail = hasDetail;
           this.length = length;
           this.loanNumber = loanNumber;
           this.offset = offset;
           this.payStatus = payStatus;
    }


    /**
     * Gets the cbLoanNumber value for this LoanDetailSearchRequestBean.
     * 
     * @return cbLoanNumber
     */
    public java.lang.String getCbLoanNumber() {
        return cbLoanNumber;
    }


    /**
     * Sets the cbLoanNumber value for this LoanDetailSearchRequestBean.
     * 
     * @param cbLoanNumber
     */
    public void setCbLoanNumber(java.lang.String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }


    /**
     * Gets the cif value for this LoanDetailSearchRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this LoanDetailSearchRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the hasDetail value for this LoanDetailSearchRequestBean.
     * 
     * @return hasDetail
     */
    public boolean isHasDetail() {
        return hasDetail;
    }


    /**
     * Sets the hasDetail value for this LoanDetailSearchRequestBean.
     * 
     * @param hasDetail
     */
    public void setHasDetail(boolean hasDetail) {
        this.hasDetail = hasDetail;
    }


    /**
     * Gets the length value for this LoanDetailSearchRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this LoanDetailSearchRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the loanNumber value for this LoanDetailSearchRequestBean.
     * 
     * @return loanNumber
     */
    public java.lang.String getLoanNumber() {
        return loanNumber;
    }


    /**
     * Sets the loanNumber value for this LoanDetailSearchRequestBean.
     * 
     * @param loanNumber
     */
    public void setLoanNumber(java.lang.String loanNumber) {
        this.loanNumber = loanNumber;
    }


    /**
     * Gets the offset value for this LoanDetailSearchRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this LoanDetailSearchRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the payStatus value for this LoanDetailSearchRequestBean.
     * 
     * @return payStatus
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS getPayStatus() {
        return payStatus;
    }


    /**
     * Sets the payStatus value for this LoanDetailSearchRequestBean.
     * 
     * @param payStatus
     */
    public void setPayStatus(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PayStatusWS payStatus) {
        this.payStatus = payStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanDetailSearchRequestBean)) return false;
        LoanDetailSearchRequestBean other = (LoanDetailSearchRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbLoanNumber==null && other.getCbLoanNumber()==null) || 
             (this.cbLoanNumber!=null &&
              this.cbLoanNumber.equals(other.getCbLoanNumber()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            this.hasDetail == other.isHasDetail() &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.loanNumber==null && other.getLoanNumber()==null) || 
             (this.loanNumber!=null &&
              this.loanNumber.equals(other.getLoanNumber()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.payStatus==null && other.getPayStatus()==null) || 
             (this.payStatus!=null &&
              this.payStatus.equals(other.getPayStatus())));
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
        if (getCbLoanNumber() != null) {
            _hashCode += getCbLoanNumber().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        _hashCode += (isHasDetail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getLoanNumber() != null) {
            _hashCode += getLoanNumber().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getPayStatus() != null) {
            _hashCode += getPayStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanDetailSearchRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanDetailSearchRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbLoanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbLoanNumber"));
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
        elemField.setFieldName("hasDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("loanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("payStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "payStatusWS"));
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
