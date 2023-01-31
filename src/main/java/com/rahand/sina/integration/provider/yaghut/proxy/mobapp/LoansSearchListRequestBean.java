/**
 * LoansSearchListRequestBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoansSearchListRequestBean  implements java.io.Serializable {
    private java.lang.String branchCode;

    private java.lang.String cbLoanNumber;

    private java.lang.String cif;

    private java.lang.String currency;

    private java.lang.Long length;

    private java.lang.String loanNumber;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState[] loanStates;

    private java.lang.String loanTitle;

    private java.lang.Long offset;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanClass type;

    public LoansSearchListRequestBean() {
    }

    public LoansSearchListRequestBean(
           java.lang.String branchCode,
           java.lang.String cbLoanNumber,
           java.lang.String cif,
           java.lang.String currency,
           java.lang.Long length,
           java.lang.String loanNumber,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState[] loanStates,
           java.lang.String loanTitle,
           java.lang.Long offset,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanClass type) {
           this.branchCode = branchCode;
           this.cbLoanNumber = cbLoanNumber;
           this.cif = cif;
           this.currency = currency;
           this.length = length;
           this.loanNumber = loanNumber;
           this.loanStates = loanStates;
           this.loanTitle = loanTitle;
           this.offset = offset;
           this.type = type;
    }


    /**
     * Gets the branchCode value for this LoansSearchListRequestBean.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this LoansSearchListRequestBean.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the cbLoanNumber value for this LoansSearchListRequestBean.
     * 
     * @return cbLoanNumber
     */
    public java.lang.String getCbLoanNumber() {
        return cbLoanNumber;
    }


    /**
     * Sets the cbLoanNumber value for this LoansSearchListRequestBean.
     * 
     * @param cbLoanNumber
     */
    public void setCbLoanNumber(java.lang.String cbLoanNumber) {
        this.cbLoanNumber = cbLoanNumber;
    }


    /**
     * Gets the cif value for this LoansSearchListRequestBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this LoansSearchListRequestBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the currency value for this LoansSearchListRequestBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this LoansSearchListRequestBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the length value for this LoansSearchListRequestBean.
     * 
     * @return length
     */
    public java.lang.Long getLength() {
        return length;
    }


    /**
     * Sets the length value for this LoansSearchListRequestBean.
     * 
     * @param length
     */
    public void setLength(java.lang.Long length) {
        this.length = length;
    }


    /**
     * Gets the loanNumber value for this LoansSearchListRequestBean.
     * 
     * @return loanNumber
     */
    public java.lang.String getLoanNumber() {
        return loanNumber;
    }


    /**
     * Sets the loanNumber value for this LoansSearchListRequestBean.
     * 
     * @param loanNumber
     */
    public void setLoanNumber(java.lang.String loanNumber) {
        this.loanNumber = loanNumber;
    }


    /**
     * Gets the loanStates value for this LoansSearchListRequestBean.
     * 
     * @return loanStates
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState[] getLoanStates() {
        return loanStates;
    }


    /**
     * Sets the loanStates value for this LoansSearchListRequestBean.
     * 
     * @param loanStates
     */
    public void setLoanStates(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState[] loanStates) {
        this.loanStates = loanStates;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState getLoanStates(int i) {
        return this.loanStates[i];
    }

    public void setLoanStates(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanState _value) {
        this.loanStates[i] = _value;
    }


    /**
     * Gets the loanTitle value for this LoansSearchListRequestBean.
     * 
     * @return loanTitle
     */
    public java.lang.String getLoanTitle() {
        return loanTitle;
    }


    /**
     * Sets the loanTitle value for this LoansSearchListRequestBean.
     * 
     * @param loanTitle
     */
    public void setLoanTitle(java.lang.String loanTitle) {
        this.loanTitle = loanTitle;
    }


    /**
     * Gets the offset value for this LoansSearchListRequestBean.
     * 
     * @return offset
     */
    public java.lang.Long getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this LoansSearchListRequestBean.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Long offset) {
        this.offset = offset;
    }


    /**
     * Gets the type value for this LoansSearchListRequestBean.
     * 
     * @return type
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanClass getType() {
        return type;
    }


    /**
     * Sets the type value for this LoansSearchListRequestBean.
     * 
     * @param type
     */
    public void setType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanClass type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoansSearchListRequestBean)) return false;
        LoansSearchListRequestBean other = (LoansSearchListRequestBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.cbLoanNumber==null && other.getCbLoanNumber()==null) || 
             (this.cbLoanNumber!=null &&
              this.cbLoanNumber.equals(other.getCbLoanNumber()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.loanNumber==null && other.getLoanNumber()==null) || 
             (this.loanNumber!=null &&
              this.loanNumber.equals(other.getLoanNumber()))) &&
            ((this.loanStates==null && other.getLoanStates()==null) || 
             (this.loanStates!=null &&
              java.util.Arrays.equals(this.loanStates, other.getLoanStates()))) &&
            ((this.loanTitle==null && other.getLoanTitle()==null) || 
             (this.loanTitle!=null &&
              this.loanTitle.equals(other.getLoanTitle()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getCbLoanNumber() != null) {
            _hashCode += getCbLoanNumber().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getLoanNumber() != null) {
            _hashCode += getLoanNumber().hashCode();
        }
        if (getLoanStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoanStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoanStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoanTitle() != null) {
            _hashCode += getLoanTitle().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoansSearchListRequestBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loansSearchListRequestBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("loanNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanStates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loanTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loanTitle"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanClass"));
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
