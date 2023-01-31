/**
 * BeOpenedDepositBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BeOpenedDepositBean  implements java.io.Serializable {
    private java.lang.String currency;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup;

    private long depositType;

    private java.lang.String depositTypeName;

    private java.lang.Short interestDay;

    private java.lang.Short lifeCycleMonth;

    private java.math.BigDecimal minimumApplicableAmount;

    private java.math.BigDecimal stampPrice;

    public BeOpenedDepositBean() {
    }

    public BeOpenedDepositBean(
           java.lang.String currency,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup,
           long depositType,
           java.lang.String depositTypeName,
           java.lang.Short interestDay,
           java.lang.Short lifeCycleMonth,
           java.math.BigDecimal minimumApplicableAmount,
           java.math.BigDecimal stampPrice) {
           this.currency = currency;
           this.depositGroup = depositGroup;
           this.depositType = depositType;
           this.depositTypeName = depositTypeName;
           this.interestDay = interestDay;
           this.lifeCycleMonth = lifeCycleMonth;
           this.minimumApplicableAmount = minimumApplicableAmount;
           this.stampPrice = stampPrice;
    }


    /**
     * Gets the currency value for this BeOpenedDepositBean.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BeOpenedDepositBean.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the depositGroup value for this BeOpenedDepositBean.
     * 
     * @return depositGroup
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS getDepositGroup() {
        return depositGroup;
    }


    /**
     * Sets the depositGroup value for this BeOpenedDepositBean.
     * 
     * @param depositGroup
     */
    public void setDepositGroup(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.DepositGroupTypeWS depositGroup) {
        this.depositGroup = depositGroup;
    }


    /**
     * Gets the depositType value for this BeOpenedDepositBean.
     * 
     * @return depositType
     */
    public long getDepositType() {
        return depositType;
    }


    /**
     * Sets the depositType value for this BeOpenedDepositBean.
     * 
     * @param depositType
     */
    public void setDepositType(long depositType) {
        this.depositType = depositType;
    }


    /**
     * Gets the depositTypeName value for this BeOpenedDepositBean.
     * 
     * @return depositTypeName
     */
    public java.lang.String getDepositTypeName() {
        return depositTypeName;
    }


    /**
     * Sets the depositTypeName value for this BeOpenedDepositBean.
     * 
     * @param depositTypeName
     */
    public void setDepositTypeName(java.lang.String depositTypeName) {
        this.depositTypeName = depositTypeName;
    }


    /**
     * Gets the interestDay value for this BeOpenedDepositBean.
     * 
     * @return interestDay
     */
    public java.lang.Short getInterestDay() {
        return interestDay;
    }


    /**
     * Sets the interestDay value for this BeOpenedDepositBean.
     * 
     * @param interestDay
     */
    public void setInterestDay(java.lang.Short interestDay) {
        this.interestDay = interestDay;
    }


    /**
     * Gets the lifeCycleMonth value for this BeOpenedDepositBean.
     * 
     * @return lifeCycleMonth
     */
    public java.lang.Short getLifeCycleMonth() {
        return lifeCycleMonth;
    }


    /**
     * Sets the lifeCycleMonth value for this BeOpenedDepositBean.
     * 
     * @param lifeCycleMonth
     */
    public void setLifeCycleMonth(java.lang.Short lifeCycleMonth) {
        this.lifeCycleMonth = lifeCycleMonth;
    }


    /**
     * Gets the minimumApplicableAmount value for this BeOpenedDepositBean.
     * 
     * @return minimumApplicableAmount
     */
    public java.math.BigDecimal getMinimumApplicableAmount() {
        return minimumApplicableAmount;
    }


    /**
     * Sets the minimumApplicableAmount value for this BeOpenedDepositBean.
     * 
     * @param minimumApplicableAmount
     */
    public void setMinimumApplicableAmount(java.math.BigDecimal minimumApplicableAmount) {
        this.minimumApplicableAmount = minimumApplicableAmount;
    }


    /**
     * Gets the stampPrice value for this BeOpenedDepositBean.
     * 
     * @return stampPrice
     */
    public java.math.BigDecimal getStampPrice() {
        return stampPrice;
    }


    /**
     * Sets the stampPrice value for this BeOpenedDepositBean.
     * 
     * @param stampPrice
     */
    public void setStampPrice(java.math.BigDecimal stampPrice) {
        this.stampPrice = stampPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BeOpenedDepositBean)) return false;
        BeOpenedDepositBean other = (BeOpenedDepositBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.depositGroup==null && other.getDepositGroup()==null) || 
             (this.depositGroup!=null &&
              this.depositGroup.equals(other.getDepositGroup()))) &&
            this.depositType == other.getDepositType() &&
            ((this.depositTypeName==null && other.getDepositTypeName()==null) || 
             (this.depositTypeName!=null &&
              this.depositTypeName.equals(other.getDepositTypeName()))) &&
            ((this.interestDay==null && other.getInterestDay()==null) || 
             (this.interestDay!=null &&
              this.interestDay.equals(other.getInterestDay()))) &&
            ((this.lifeCycleMonth==null && other.getLifeCycleMonth()==null) || 
             (this.lifeCycleMonth!=null &&
              this.lifeCycleMonth.equals(other.getLifeCycleMonth()))) &&
            ((this.minimumApplicableAmount==null && other.getMinimumApplicableAmount()==null) || 
             (this.minimumApplicableAmount!=null &&
              this.minimumApplicableAmount.equals(other.getMinimumApplicableAmount()))) &&
            ((this.stampPrice==null && other.getStampPrice()==null) || 
             (this.stampPrice!=null &&
              this.stampPrice.equals(other.getStampPrice())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDepositGroup() != null) {
            _hashCode += getDepositGroup().hashCode();
        }
        _hashCode += new Long(getDepositType()).hashCode();
        if (getDepositTypeName() != null) {
            _hashCode += getDepositTypeName().hashCode();
        }
        if (getInterestDay() != null) {
            _hashCode += getInterestDay().hashCode();
        }
        if (getLifeCycleMonth() != null) {
            _hashCode += getLifeCycleMonth().hashCode();
        }
        if (getMinimumApplicableAmount() != null) {
            _hashCode += getMinimumApplicableAmount().hashCode();
        }
        if (getStampPrice() != null) {
            _hashCode += getStampPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BeOpenedDepositBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "beOpenedDepositBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interestDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeCycleMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifeCycleMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumApplicableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumApplicableAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stampPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stampPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
