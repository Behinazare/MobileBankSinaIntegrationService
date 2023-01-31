/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.armaghan.proxy;

public class User  implements java.io.Serializable {
    private String username;

    private double credit;

    private String deliveryUrl;

    private String receiveUrl;

    private java.util.Calendar expirationDate;

    private String[] IPs;

    private String[] numbers;

    public User() {
    }

    public User(
           String username,
           double credit,
           String deliveryUrl,
           String receiveUrl,
           java.util.Calendar expirationDate,
           String[] IPs,
           String[] numbers) {
           this.username = username;
           this.credit = credit;
           this.deliveryUrl = deliveryUrl;
           this.receiveUrl = receiveUrl;
           this.expirationDate = expirationDate;
           this.IPs = IPs;
           this.numbers = numbers;
    }


    /**
     * Gets the username value for this User.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this User.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the credit value for this User.
     * 
     * @return credit
     */
    public double getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this User.
     * 
     * @param credit
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }


    /**
     * Gets the deliveryUrl value for this User.
     * 
     * @return deliveryUrl
     */
    public String getDeliveryUrl() {
        return deliveryUrl;
    }


    /**
     * Sets the deliveryUrl value for this User.
     * 
     * @param deliveryUrl
     */
    public void setDeliveryUrl(String deliveryUrl) {
        this.deliveryUrl = deliveryUrl;
    }


    /**
     * Gets the receiveUrl value for this User.
     * 
     * @return receiveUrl
     */
    public String getReceiveUrl() {
        return receiveUrl;
    }


    /**
     * Sets the receiveUrl value for this User.
     * 
     * @param receiveUrl
     */
    public void setReceiveUrl(String receiveUrl) {
        this.receiveUrl = receiveUrl;
    }


    /**
     * Gets the expirationDate value for this User.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this User.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the IPs value for this User.
     * 
     * @return IPs
     */
    public String[] getIPs() {
        return IPs;
    }


    /**
     * Sets the IPs value for this User.
     * 
     * @param IPs
     */
    public void setIPs(String[] IPs) {
        this.IPs = IPs;
    }

    public String getIPs(int i) {
        return this.IPs[i];
    }

    public void setIPs(int i, String _value) {
        this.IPs[i] = _value;
    }


    /**
     * Gets the numbers value for this User.
     * 
     * @return numbers
     */
    public String[] getNumbers() {
        return numbers;
    }


    /**
     * Sets the numbers value for this User.
     * 
     * @param numbers
     */
    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public String getNumbers(int i) {
        return this.numbers[i];
    }

    public void setNumbers(int i, String _value) {
        this.numbers[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            this.credit == other.getCredit() &&
            ((this.deliveryUrl==null && other.getDeliveryUrl()==null) || 
             (this.deliveryUrl!=null &&
              this.deliveryUrl.equals(other.getDeliveryUrl()))) &&
            ((this.receiveUrl==null && other.getReceiveUrl()==null) || 
             (this.receiveUrl!=null &&
              this.receiveUrl.equals(other.getReceiveUrl()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.IPs==null && other.getIPs()==null) || 
             (this.IPs!=null &&
              java.util.Arrays.equals(this.IPs, other.getIPs()))) &&
            ((this.numbers==null && other.getNumbers()==null) || 
             (this.numbers!=null &&
              java.util.Arrays.equals(this.numbers, other.getNumbers())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        _hashCode += new Double(getCredit()).hashCode();
        if (getDeliveryUrl() != null) {
            _hashCode += getDeliveryUrl().hashCode();
        }
        if (getReceiveUrl() != null) {
            _hashCode += getReceiveUrl().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getIPs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIPs());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIPs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumbers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.smsrelay.armaghan.net/", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiveUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiveUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
