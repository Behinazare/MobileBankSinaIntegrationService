/**
 * BriefTransferConstraintInfoResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class BriefTransferConstraintInfoResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Currency currency;

    private java.math.BigDecimal maxPriceDaily;

    private java.math.BigDecimal maxPriceDailyToOtherDeposit;

    private java.math.BigDecimal maxPriceDailyToOwnDeposit;

    private java.math.BigDecimal maxPriceMonthly;

    private java.math.BigDecimal maxPriceMonthlyToOtherDeposit;

    private java.math.BigDecimal maxPriceMonthlyToOwnDeposit;

    private java.math.BigDecimal maxTransferAmount;

    private java.math.BigDecimal maxTransferAmountToOtherDeposit;

    private java.math.BigDecimal maxTransferAmountToOwnDeposit;

    private java.math.BigDecimal minPriceDaily;

    private java.math.BigDecimal minSecondPasswordAmount;

    private java.math.BigDecimal minSecondPasswordToOthersAmount;

    private java.math.BigDecimal minSignatureAmount;

    private java.math.BigDecimal minTicketAmount;

    private java.math.BigDecimal minTicketToOthersAmount;

    private java.math.BigDecimal minTransferAmount;

    private java.math.BigDecimal priceThatUserTransferInMonth;

    private java.math.BigDecimal priceThatUserTransferToday;

    public BriefTransferConstraintInfoResponseBean() {
    }

    public BriefTransferConstraintInfoResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Currency currency,
           java.math.BigDecimal maxPriceDaily,
           java.math.BigDecimal maxPriceDailyToOtherDeposit,
           java.math.BigDecimal maxPriceDailyToOwnDeposit,
           java.math.BigDecimal maxPriceMonthly,
           java.math.BigDecimal maxPriceMonthlyToOtherDeposit,
           java.math.BigDecimal maxPriceMonthlyToOwnDeposit,
           java.math.BigDecimal maxTransferAmount,
           java.math.BigDecimal maxTransferAmountToOtherDeposit,
           java.math.BigDecimal maxTransferAmountToOwnDeposit,
           java.math.BigDecimal minPriceDaily,
           java.math.BigDecimal minSecondPasswordAmount,
           java.math.BigDecimal minSecondPasswordToOthersAmount,
           java.math.BigDecimal minSignatureAmount,
           java.math.BigDecimal minTicketAmount,
           java.math.BigDecimal minTicketToOthersAmount,
           java.math.BigDecimal minTransferAmount,
           java.math.BigDecimal priceThatUserTransferInMonth,
           java.math.BigDecimal priceThatUserTransferToday) {
           this.currency = currency;
           this.maxPriceDaily = maxPriceDaily;
           this.maxPriceDailyToOtherDeposit = maxPriceDailyToOtherDeposit;
           this.maxPriceDailyToOwnDeposit = maxPriceDailyToOwnDeposit;
           this.maxPriceMonthly = maxPriceMonthly;
           this.maxPriceMonthlyToOtherDeposit = maxPriceMonthlyToOtherDeposit;
           this.maxPriceMonthlyToOwnDeposit = maxPriceMonthlyToOwnDeposit;
           this.maxTransferAmount = maxTransferAmount;
           this.maxTransferAmountToOtherDeposit = maxTransferAmountToOtherDeposit;
           this.maxTransferAmountToOwnDeposit = maxTransferAmountToOwnDeposit;
           this.minPriceDaily = minPriceDaily;
           this.minSecondPasswordAmount = minSecondPasswordAmount;
           this.minSecondPasswordToOthersAmount = minSecondPasswordToOthersAmount;
           this.minSignatureAmount = minSignatureAmount;
           this.minTicketAmount = minTicketAmount;
           this.minTicketToOthersAmount = minTicketToOthersAmount;
           this.minTransferAmount = minTransferAmount;
           this.priceThatUserTransferInMonth = priceThatUserTransferInMonth;
           this.priceThatUserTransferToday = priceThatUserTransferToday;
    }


    /**
     * Gets the currency value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return currency
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param currency
     */
    public void setCurrency(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the maxPriceDaily value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxPriceDaily
     */
    public java.math.BigDecimal getMaxPriceDaily() {
        return maxPriceDaily;
    }


    /**
     * Sets the maxPriceDaily value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxPriceDaily
     */
    public void setMaxPriceDaily(java.math.BigDecimal maxPriceDaily) {
        this.maxPriceDaily = maxPriceDaily;
    }


    /**
     * Gets the maxPriceDailyToOtherDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxPriceDailyToOtherDeposit
     */
    public java.math.BigDecimal getMaxPriceDailyToOtherDeposit() {
        return maxPriceDailyToOtherDeposit;
    }


    /**
     * Sets the maxPriceDailyToOtherDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxPriceDailyToOtherDeposit
     */
    public void setMaxPriceDailyToOtherDeposit(java.math.BigDecimal maxPriceDailyToOtherDeposit) {
        this.maxPriceDailyToOtherDeposit = maxPriceDailyToOtherDeposit;
    }


    /**
     * Gets the maxPriceDailyToOwnDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxPriceDailyToOwnDeposit
     */
    public java.math.BigDecimal getMaxPriceDailyToOwnDeposit() {
        return maxPriceDailyToOwnDeposit;
    }


    /**
     * Sets the maxPriceDailyToOwnDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxPriceDailyToOwnDeposit
     */
    public void setMaxPriceDailyToOwnDeposit(java.math.BigDecimal maxPriceDailyToOwnDeposit) {
        this.maxPriceDailyToOwnDeposit = maxPriceDailyToOwnDeposit;
    }


    /**
     * Gets the maxPriceMonthly value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxPriceMonthly
     */
    public java.math.BigDecimal getMaxPriceMonthly() {
        return maxPriceMonthly;
    }


    /**
     * Sets the maxPriceMonthly value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxPriceMonthly
     */
    public void setMaxPriceMonthly(java.math.BigDecimal maxPriceMonthly) {
        this.maxPriceMonthly = maxPriceMonthly;
    }


    /**
     * Gets the maxPriceMonthlyToOtherDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxPriceMonthlyToOtherDeposit
     */
    public java.math.BigDecimal getMaxPriceMonthlyToOtherDeposit() {
        return maxPriceMonthlyToOtherDeposit;
    }


    /**
     * Sets the maxPriceMonthlyToOtherDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxPriceMonthlyToOtherDeposit
     */
    public void setMaxPriceMonthlyToOtherDeposit(java.math.BigDecimal maxPriceMonthlyToOtherDeposit) {
        this.maxPriceMonthlyToOtherDeposit = maxPriceMonthlyToOtherDeposit;
    }


    /**
     * Gets the maxPriceMonthlyToOwnDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxPriceMonthlyToOwnDeposit
     */
    public java.math.BigDecimal getMaxPriceMonthlyToOwnDeposit() {
        return maxPriceMonthlyToOwnDeposit;
    }


    /**
     * Sets the maxPriceMonthlyToOwnDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxPriceMonthlyToOwnDeposit
     */
    public void setMaxPriceMonthlyToOwnDeposit(java.math.BigDecimal maxPriceMonthlyToOwnDeposit) {
        this.maxPriceMonthlyToOwnDeposit = maxPriceMonthlyToOwnDeposit;
    }


    /**
     * Gets the maxTransferAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxTransferAmount
     */
    public java.math.BigDecimal getMaxTransferAmount() {
        return maxTransferAmount;
    }


    /**
     * Sets the maxTransferAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxTransferAmount
     */
    public void setMaxTransferAmount(java.math.BigDecimal maxTransferAmount) {
        this.maxTransferAmount = maxTransferAmount;
    }


    /**
     * Gets the maxTransferAmountToOtherDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxTransferAmountToOtherDeposit
     */
    public java.math.BigDecimal getMaxTransferAmountToOtherDeposit() {
        return maxTransferAmountToOtherDeposit;
    }


    /**
     * Sets the maxTransferAmountToOtherDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxTransferAmountToOtherDeposit
     */
    public void setMaxTransferAmountToOtherDeposit(java.math.BigDecimal maxTransferAmountToOtherDeposit) {
        this.maxTransferAmountToOtherDeposit = maxTransferAmountToOtherDeposit;
    }


    /**
     * Gets the maxTransferAmountToOwnDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return maxTransferAmountToOwnDeposit
     */
    public java.math.BigDecimal getMaxTransferAmountToOwnDeposit() {
        return maxTransferAmountToOwnDeposit;
    }


    /**
     * Sets the maxTransferAmountToOwnDeposit value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param maxTransferAmountToOwnDeposit
     */
    public void setMaxTransferAmountToOwnDeposit(java.math.BigDecimal maxTransferAmountToOwnDeposit) {
        this.maxTransferAmountToOwnDeposit = maxTransferAmountToOwnDeposit;
    }


    /**
     * Gets the minPriceDaily value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return minPriceDaily
     */
    public java.math.BigDecimal getMinPriceDaily() {
        return minPriceDaily;
    }


    /**
     * Sets the minPriceDaily value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param minPriceDaily
     */
    public void setMinPriceDaily(java.math.BigDecimal minPriceDaily) {
        this.minPriceDaily = minPriceDaily;
    }


    /**
     * Gets the minSecondPasswordAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return minSecondPasswordAmount
     */
    public java.math.BigDecimal getMinSecondPasswordAmount() {
        return minSecondPasswordAmount;
    }


    /**
     * Sets the minSecondPasswordAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param minSecondPasswordAmount
     */
    public void setMinSecondPasswordAmount(java.math.BigDecimal minSecondPasswordAmount) {
        this.minSecondPasswordAmount = minSecondPasswordAmount;
    }


    /**
     * Gets the minSecondPasswordToOthersAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return minSecondPasswordToOthersAmount
     */
    public java.math.BigDecimal getMinSecondPasswordToOthersAmount() {
        return minSecondPasswordToOthersAmount;
    }


    /**
     * Sets the minSecondPasswordToOthersAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param minSecondPasswordToOthersAmount
     */
    public void setMinSecondPasswordToOthersAmount(java.math.BigDecimal minSecondPasswordToOthersAmount) {
        this.minSecondPasswordToOthersAmount = minSecondPasswordToOthersAmount;
    }


    /**
     * Gets the minSignatureAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return minSignatureAmount
     */
    public java.math.BigDecimal getMinSignatureAmount() {
        return minSignatureAmount;
    }


    /**
     * Sets the minSignatureAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param minSignatureAmount
     */
    public void setMinSignatureAmount(java.math.BigDecimal minSignatureAmount) {
        this.minSignatureAmount = minSignatureAmount;
    }


    /**
     * Gets the minTicketAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return minTicketAmount
     */
    public java.math.BigDecimal getMinTicketAmount() {
        return minTicketAmount;
    }


    /**
     * Sets the minTicketAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param minTicketAmount
     */
    public void setMinTicketAmount(java.math.BigDecimal minTicketAmount) {
        this.minTicketAmount = minTicketAmount;
    }


    /**
     * Gets the minTicketToOthersAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return minTicketToOthersAmount
     */
    public java.math.BigDecimal getMinTicketToOthersAmount() {
        return minTicketToOthersAmount;
    }


    /**
     * Sets the minTicketToOthersAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param minTicketToOthersAmount
     */
    public void setMinTicketToOthersAmount(java.math.BigDecimal minTicketToOthersAmount) {
        this.minTicketToOthersAmount = minTicketToOthersAmount;
    }


    /**
     * Gets the minTransferAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return minTransferAmount
     */
    public java.math.BigDecimal getMinTransferAmount() {
        return minTransferAmount;
    }


    /**
     * Sets the minTransferAmount value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param minTransferAmount
     */
    public void setMinTransferAmount(java.math.BigDecimal minTransferAmount) {
        this.minTransferAmount = minTransferAmount;
    }


    /**
     * Gets the priceThatUserTransferInMonth value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return priceThatUserTransferInMonth
     */
    public java.math.BigDecimal getPriceThatUserTransferInMonth() {
        return priceThatUserTransferInMonth;
    }


    /**
     * Sets the priceThatUserTransferInMonth value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param priceThatUserTransferInMonth
     */
    public void setPriceThatUserTransferInMonth(java.math.BigDecimal priceThatUserTransferInMonth) {
        this.priceThatUserTransferInMonth = priceThatUserTransferInMonth;
    }


    /**
     * Gets the priceThatUserTransferToday value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @return priceThatUserTransferToday
     */
    public java.math.BigDecimal getPriceThatUserTransferToday() {
        return priceThatUserTransferToday;
    }


    /**
     * Sets the priceThatUserTransferToday value for this BriefTransferConstraintInfoResponseBean.
     * 
     * @param priceThatUserTransferToday
     */
    public void setPriceThatUserTransferToday(java.math.BigDecimal priceThatUserTransferToday) {
        this.priceThatUserTransferToday = priceThatUserTransferToday;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BriefTransferConstraintInfoResponseBean)) return false;
        BriefTransferConstraintInfoResponseBean other = (BriefTransferConstraintInfoResponseBean) obj;
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
            ((this.maxPriceDaily==null && other.getMaxPriceDaily()==null) || 
             (this.maxPriceDaily!=null &&
              this.maxPriceDaily.equals(other.getMaxPriceDaily()))) &&
            ((this.maxPriceDailyToOtherDeposit==null && other.getMaxPriceDailyToOtherDeposit()==null) || 
             (this.maxPriceDailyToOtherDeposit!=null &&
              this.maxPriceDailyToOtherDeposit.equals(other.getMaxPriceDailyToOtherDeposit()))) &&
            ((this.maxPriceDailyToOwnDeposit==null && other.getMaxPriceDailyToOwnDeposit()==null) || 
             (this.maxPriceDailyToOwnDeposit!=null &&
              this.maxPriceDailyToOwnDeposit.equals(other.getMaxPriceDailyToOwnDeposit()))) &&
            ((this.maxPriceMonthly==null && other.getMaxPriceMonthly()==null) || 
             (this.maxPriceMonthly!=null &&
              this.maxPriceMonthly.equals(other.getMaxPriceMonthly()))) &&
            ((this.maxPriceMonthlyToOtherDeposit==null && other.getMaxPriceMonthlyToOtherDeposit()==null) || 
             (this.maxPriceMonthlyToOtherDeposit!=null &&
              this.maxPriceMonthlyToOtherDeposit.equals(other.getMaxPriceMonthlyToOtherDeposit()))) &&
            ((this.maxPriceMonthlyToOwnDeposit==null && other.getMaxPriceMonthlyToOwnDeposit()==null) || 
             (this.maxPriceMonthlyToOwnDeposit!=null &&
              this.maxPriceMonthlyToOwnDeposit.equals(other.getMaxPriceMonthlyToOwnDeposit()))) &&
            ((this.maxTransferAmount==null && other.getMaxTransferAmount()==null) || 
             (this.maxTransferAmount!=null &&
              this.maxTransferAmount.equals(other.getMaxTransferAmount()))) &&
            ((this.maxTransferAmountToOtherDeposit==null && other.getMaxTransferAmountToOtherDeposit()==null) || 
             (this.maxTransferAmountToOtherDeposit!=null &&
              this.maxTransferAmountToOtherDeposit.equals(other.getMaxTransferAmountToOtherDeposit()))) &&
            ((this.maxTransferAmountToOwnDeposit==null && other.getMaxTransferAmountToOwnDeposit()==null) || 
             (this.maxTransferAmountToOwnDeposit!=null &&
              this.maxTransferAmountToOwnDeposit.equals(other.getMaxTransferAmountToOwnDeposit()))) &&
            ((this.minPriceDaily==null && other.getMinPriceDaily()==null) || 
             (this.minPriceDaily!=null &&
              this.minPriceDaily.equals(other.getMinPriceDaily()))) &&
            ((this.minSecondPasswordAmount==null && other.getMinSecondPasswordAmount()==null) || 
             (this.minSecondPasswordAmount!=null &&
              this.minSecondPasswordAmount.equals(other.getMinSecondPasswordAmount()))) &&
            ((this.minSecondPasswordToOthersAmount==null && other.getMinSecondPasswordToOthersAmount()==null) || 
             (this.minSecondPasswordToOthersAmount!=null &&
              this.minSecondPasswordToOthersAmount.equals(other.getMinSecondPasswordToOthersAmount()))) &&
            ((this.minSignatureAmount==null && other.getMinSignatureAmount()==null) || 
             (this.minSignatureAmount!=null &&
              this.minSignatureAmount.equals(other.getMinSignatureAmount()))) &&
            ((this.minTicketAmount==null && other.getMinTicketAmount()==null) || 
             (this.minTicketAmount!=null &&
              this.minTicketAmount.equals(other.getMinTicketAmount()))) &&
            ((this.minTicketToOthersAmount==null && other.getMinTicketToOthersAmount()==null) || 
             (this.minTicketToOthersAmount!=null &&
              this.minTicketToOthersAmount.equals(other.getMinTicketToOthersAmount()))) &&
            ((this.minTransferAmount==null && other.getMinTransferAmount()==null) || 
             (this.minTransferAmount!=null &&
              this.minTransferAmount.equals(other.getMinTransferAmount()))) &&
            ((this.priceThatUserTransferInMonth==null && other.getPriceThatUserTransferInMonth()==null) || 
             (this.priceThatUserTransferInMonth!=null &&
              this.priceThatUserTransferInMonth.equals(other.getPriceThatUserTransferInMonth()))) &&
            ((this.priceThatUserTransferToday==null && other.getPriceThatUserTransferToday()==null) || 
             (this.priceThatUserTransferToday!=null &&
              this.priceThatUserTransferToday.equals(other.getPriceThatUserTransferToday())));
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
        if (getMaxPriceDaily() != null) {
            _hashCode += getMaxPriceDaily().hashCode();
        }
        if (getMaxPriceDailyToOtherDeposit() != null) {
            _hashCode += getMaxPriceDailyToOtherDeposit().hashCode();
        }
        if (getMaxPriceDailyToOwnDeposit() != null) {
            _hashCode += getMaxPriceDailyToOwnDeposit().hashCode();
        }
        if (getMaxPriceMonthly() != null) {
            _hashCode += getMaxPriceMonthly().hashCode();
        }
        if (getMaxPriceMonthlyToOtherDeposit() != null) {
            _hashCode += getMaxPriceMonthlyToOtherDeposit().hashCode();
        }
        if (getMaxPriceMonthlyToOwnDeposit() != null) {
            _hashCode += getMaxPriceMonthlyToOwnDeposit().hashCode();
        }
        if (getMaxTransferAmount() != null) {
            _hashCode += getMaxTransferAmount().hashCode();
        }
        if (getMaxTransferAmountToOtherDeposit() != null) {
            _hashCode += getMaxTransferAmountToOtherDeposit().hashCode();
        }
        if (getMaxTransferAmountToOwnDeposit() != null) {
            _hashCode += getMaxTransferAmountToOwnDeposit().hashCode();
        }
        if (getMinPriceDaily() != null) {
            _hashCode += getMinPriceDaily().hashCode();
        }
        if (getMinSecondPasswordAmount() != null) {
            _hashCode += getMinSecondPasswordAmount().hashCode();
        }
        if (getMinSecondPasswordToOthersAmount() != null) {
            _hashCode += getMinSecondPasswordToOthersAmount().hashCode();
        }
        if (getMinSignatureAmount() != null) {
            _hashCode += getMinSignatureAmount().hashCode();
        }
        if (getMinTicketAmount() != null) {
            _hashCode += getMinTicketAmount().hashCode();
        }
        if (getMinTicketToOthersAmount() != null) {
            _hashCode += getMinTicketToOthersAmount().hashCode();
        }
        if (getMinTransferAmount() != null) {
            _hashCode += getMinTransferAmount().hashCode();
        }
        if (getPriceThatUserTransferInMonth() != null) {
            _hashCode += getPriceThatUserTransferInMonth().hashCode();
        }
        if (getPriceThatUserTransferToday() != null) {
            _hashCode += getPriceThatUserTransferToday().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BriefTransferConstraintInfoResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "briefTransferConstraintInfoResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "currency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPriceDaily");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPriceDaily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPriceDailyToOtherDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPriceDailyToOtherDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPriceDailyToOwnDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPriceDailyToOwnDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPriceMonthly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPriceMonthly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPriceMonthlyToOtherDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPriceMonthlyToOtherDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPriceMonthlyToOwnDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPriceMonthlyToOwnDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTransferAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTransferAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTransferAmountToOtherDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTransferAmountToOtherDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTransferAmountToOwnDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTransferAmountToOwnDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minPriceDaily");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minPriceDaily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSecondPasswordAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minSecondPasswordAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSecondPasswordToOthersAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minSecondPasswordToOthersAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSignatureAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minSignatureAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTicketAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minTicketAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTicketToOthersAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minTicketToOthersAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minTransferAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minTransferAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceThatUserTransferInMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceThatUserTransferInMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceThatUserTransferToday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceThatUserTransferToday"));
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
