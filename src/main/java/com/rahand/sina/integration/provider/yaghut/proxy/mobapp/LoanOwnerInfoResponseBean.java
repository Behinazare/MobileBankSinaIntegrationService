/**
 * LoanOwnerInfoResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanOwnerInfoResponseBean  implements java.io.Serializable {
    private java.util.Calendar birthDate;

    private java.lang.String cif;

    private java.lang.String customerCode;

    private java.lang.String customerFatherName;

    private java.lang.String customerName;

    private boolean legal;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInformationBean[] loansInfo;

    private java.lang.String ssn;

    public LoanOwnerInfoResponseBean() {
    }

    public LoanOwnerInfoResponseBean(
           java.util.Calendar birthDate,
           java.lang.String cif,
           java.lang.String customerCode,
           java.lang.String customerFatherName,
           java.lang.String customerName,
           boolean legal,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInformationBean[] loansInfo,
           java.lang.String ssn) {
           this.birthDate = birthDate;
           this.cif = cif;
           this.customerCode = customerCode;
           this.customerFatherName = customerFatherName;
           this.customerName = customerName;
           this.legal = legal;
           this.loansInfo = loansInfo;
           this.ssn = ssn;
    }


    /**
     * Gets the birthDate value for this LoanOwnerInfoResponseBean.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this LoanOwnerInfoResponseBean.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the cif value for this LoanOwnerInfoResponseBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this LoanOwnerInfoResponseBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the customerCode value for this LoanOwnerInfoResponseBean.
     * 
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     * Sets the customerCode value for this LoanOwnerInfoResponseBean.
     * 
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * Gets the customerFatherName value for this LoanOwnerInfoResponseBean.
     * 
     * @return customerFatherName
     */
    public java.lang.String getCustomerFatherName() {
        return customerFatherName;
    }


    /**
     * Sets the customerFatherName value for this LoanOwnerInfoResponseBean.
     * 
     * @param customerFatherName
     */
    public void setCustomerFatherName(java.lang.String customerFatherName) {
        this.customerFatherName = customerFatherName;
    }


    /**
     * Gets the customerName value for this LoanOwnerInfoResponseBean.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this LoanOwnerInfoResponseBean.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the legal value for this LoanOwnerInfoResponseBean.
     * 
     * @return legal
     */
    public boolean isLegal() {
        return legal;
    }


    /**
     * Sets the legal value for this LoanOwnerInfoResponseBean.
     * 
     * @param legal
     */
    public void setLegal(boolean legal) {
        this.legal = legal;
    }


    /**
     * Gets the loansInfo value for this LoanOwnerInfoResponseBean.
     * 
     * @return loansInfo
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInformationBean[] getLoansInfo() {
        return loansInfo;
    }


    /**
     * Sets the loansInfo value for this LoanOwnerInfoResponseBean.
     * 
     * @param loansInfo
     */
    public void setLoansInfo(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInformationBean[] loansInfo) {
        this.loansInfo = loansInfo;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInformationBean getLoansInfo(int i) {
        return this.loansInfo[i];
    }

    public void setLoansInfo(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.LoanInformationBean _value) {
        this.loansInfo[i] = _value;
    }


    /**
     * Gets the ssn value for this LoanOwnerInfoResponseBean.
     * 
     * @return ssn
     */
    public java.lang.String getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this LoanOwnerInfoResponseBean.
     * 
     * @param ssn
     */
    public void setSsn(java.lang.String ssn) {
        this.ssn = ssn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoanOwnerInfoResponseBean)) return false;
        LoanOwnerInfoResponseBean other = (LoanOwnerInfoResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.customerCode==null && other.getCustomerCode()==null) || 
             (this.customerCode!=null &&
              this.customerCode.equals(other.getCustomerCode()))) &&
            ((this.customerFatherName==null && other.getCustomerFatherName()==null) || 
             (this.customerFatherName!=null &&
              this.customerFatherName.equals(other.getCustomerFatherName()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            this.legal == other.isLegal() &&
            ((this.loansInfo==null && other.getLoansInfo()==null) || 
             (this.loansInfo!=null &&
              java.util.Arrays.equals(this.loansInfo, other.getLoansInfo()))) &&
            ((this.ssn==null && other.getSsn()==null) || 
             (this.ssn!=null &&
              this.ssn.equals(other.getSsn())));
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
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getCustomerFatherName() != null) {
            _hashCode += getCustomerFatherName().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        _hashCode += (isLegal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLoansInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoansInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoansInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSsn() != null) {
            _hashCode += getSsn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanOwnerInfoResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanOwnerInfoResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFatherName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerFatherName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loansInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loansInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanInformationBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssn"));
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
