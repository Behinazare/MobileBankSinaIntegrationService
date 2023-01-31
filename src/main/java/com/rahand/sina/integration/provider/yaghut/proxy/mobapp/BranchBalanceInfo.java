/**
 * BranchBalanceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BranchBalanceInfo  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBalanceInfoDetail[] balanceInfo;

    private java.lang.String branchCode;

    private java.lang.String branchName;

    private java.lang.String cityCode;

    private java.lang.String cityName;

    public BranchBalanceInfo() {
    }

    public BranchBalanceInfo(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBalanceInfoDetail[] balanceInfo,
           java.lang.String branchCode,
           java.lang.String branchName,
           java.lang.String cityCode,
           java.lang.String cityName) {
           this.balanceInfo = balanceInfo;
           this.branchCode = branchCode;
           this.branchName = branchName;
           this.cityCode = cityCode;
           this.cityName = cityName;
    }


    /**
     * Gets the balanceInfo value for this BranchBalanceInfo.
     * 
     * @return balanceInfo
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBalanceInfoDetail[] getBalanceInfo() {
        return balanceInfo;
    }


    /**
     * Sets the balanceInfo value for this BranchBalanceInfo.
     * 
     * @param balanceInfo
     */
    public void setBalanceInfo(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBalanceInfoDetail[] balanceInfo) {
        this.balanceInfo = balanceInfo;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBalanceInfoDetail getBalanceInfo(int i) {
        return this.balanceInfo[i];
    }

    public void setBalanceInfo(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.BranchBalanceInfoDetail _value) {
        this.balanceInfo[i] = _value;
    }


    /**
     * Gets the branchCode value for this BranchBalanceInfo.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this BranchBalanceInfo.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the branchName value for this BranchBalanceInfo.
     * 
     * @return branchName
     */
    public java.lang.String getBranchName() {
        return branchName;
    }


    /**
     * Sets the branchName value for this BranchBalanceInfo.
     * 
     * @param branchName
     */
    public void setBranchName(java.lang.String branchName) {
        this.branchName = branchName;
    }


    /**
     * Gets the cityCode value for this BranchBalanceInfo.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this BranchBalanceInfo.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the cityName value for this BranchBalanceInfo.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this BranchBalanceInfo.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BranchBalanceInfo)) return false;
        BranchBalanceInfo other = (BranchBalanceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceInfo==null && other.getBalanceInfo()==null) || 
             (this.balanceInfo!=null &&
              java.util.Arrays.equals(this.balanceInfo, other.getBalanceInfo()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.branchName==null && other.getBranchName()==null) || 
             (this.branchName!=null &&
              this.branchName.equals(other.getBranchName()))) &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName())));
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
        if (getBalanceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getBranchName() != null) {
            _hashCode += getBranchName().hashCode();
        }
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BranchBalanceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "branchBalanceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "branchBalanceInfoDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityName"));
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
