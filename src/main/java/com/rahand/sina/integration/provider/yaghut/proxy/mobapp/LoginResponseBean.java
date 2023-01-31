/**
 * LoginResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoginResponseBean  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String code;

    private java.lang.String email;

    private java.lang.String foreignName;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender;

    private java.util.Calendar lastLoginTime;

    private java.lang.String mobile;

    private java.lang.String name;

    private java.lang.String refreshToken;

    private java.lang.String sessionId;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SubscriberUserInfoBean[] subscribers;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SessionTemporaryCause temporaryCause;

    private java.lang.String temporarySessionId;

    private java.lang.String title;

    public LoginResponseBean() {
    }

    public LoginResponseBean(
           java.lang.String cif,
           java.lang.String code,
           java.lang.String email,
           java.lang.String foreignName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender,
           java.util.Calendar lastLoginTime,
           java.lang.String mobile,
           java.lang.String name,
           java.lang.String refreshToken,
           java.lang.String sessionId,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SubscriberUserInfoBean[] subscribers,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SessionTemporaryCause temporaryCause,
           java.lang.String temporarySessionId,
           java.lang.String title) {
           this.cif = cif;
           this.code = code;
           this.email = email;
           this.foreignName = foreignName;
           this.gender = gender;
           this.lastLoginTime = lastLoginTime;
           this.mobile = mobile;
           this.name = name;
           this.refreshToken = refreshToken;
           this.sessionId = sessionId;
           this.subscribers = subscribers;
           this.temporaryCause = temporaryCause;
           this.temporarySessionId = temporarySessionId;
           this.title = title;
    }


    /**
     * Gets the cif value for this LoginResponseBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this LoginResponseBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the code value for this LoginResponseBean.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this LoginResponseBean.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the email value for this LoginResponseBean.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this LoginResponseBean.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the foreignName value for this LoginResponseBean.
     * 
     * @return foreignName
     */
    public java.lang.String getForeignName() {
        return foreignName;
    }


    /**
     * Sets the foreignName value for this LoginResponseBean.
     * 
     * @param foreignName
     */
    public void setForeignName(java.lang.String foreignName) {
        this.foreignName = foreignName;
    }


    /**
     * Gets the gender value for this LoginResponseBean.
     * 
     * @return gender
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this LoginResponseBean.
     * 
     * @param gender
     */
    public void setGender(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender) {
        this.gender = gender;
    }


    /**
     * Gets the lastLoginTime value for this LoginResponseBean.
     * 
     * @return lastLoginTime
     */
    public java.util.Calendar getLastLoginTime() {
        return lastLoginTime;
    }


    /**
     * Sets the lastLoginTime value for this LoginResponseBean.
     * 
     * @param lastLoginTime
     */
    public void setLastLoginTime(java.util.Calendar lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }


    /**
     * Gets the mobile value for this LoginResponseBean.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this LoginResponseBean.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the name value for this LoginResponseBean.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LoginResponseBean.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the refreshToken value for this LoginResponseBean.
     * 
     * @return refreshToken
     */
    public java.lang.String getRefreshToken() {
        return refreshToken;
    }


    /**
     * Sets the refreshToken value for this LoginResponseBean.
     * 
     * @param refreshToken
     */
    public void setRefreshToken(java.lang.String refreshToken) {
        this.refreshToken = refreshToken;
    }


    /**
     * Gets the sessionId value for this LoginResponseBean.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this LoginResponseBean.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the subscribers value for this LoginResponseBean.
     * 
     * @return subscribers
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SubscriberUserInfoBean[] getSubscribers() {
        return subscribers;
    }


    /**
     * Sets the subscribers value for this LoginResponseBean.
     * 
     * @param subscribers
     */
    public void setSubscribers(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SubscriberUserInfoBean[] subscribers) {
        this.subscribers = subscribers;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SubscriberUserInfoBean getSubscribers(int i) {
        return this.subscribers[i];
    }

    public void setSubscribers(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SubscriberUserInfoBean _value) {
        this.subscribers[i] = _value;
    }


    /**
     * Gets the temporaryCause value for this LoginResponseBean.
     * 
     * @return temporaryCause
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SessionTemporaryCause getTemporaryCause() {
        return temporaryCause;
    }


    /**
     * Sets the temporaryCause value for this LoginResponseBean.
     * 
     * @param temporaryCause
     */
    public void setTemporaryCause(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SessionTemporaryCause temporaryCause) {
        this.temporaryCause = temporaryCause;
    }


    /**
     * Gets the temporarySessionId value for this LoginResponseBean.
     * 
     * @return temporarySessionId
     */
    public java.lang.String getTemporarySessionId() {
        return temporarySessionId;
    }


    /**
     * Sets the temporarySessionId value for this LoginResponseBean.
     * 
     * @param temporarySessionId
     */
    public void setTemporarySessionId(java.lang.String temporarySessionId) {
        this.temporarySessionId = temporarySessionId;
    }


    /**
     * Gets the title value for this LoginResponseBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this LoginResponseBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginResponseBean)) return false;
        LoginResponseBean other = (LoginResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.foreignName==null && other.getForeignName()==null) || 
             (this.foreignName!=null &&
              this.foreignName.equals(other.getForeignName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.lastLoginTime==null && other.getLastLoginTime()==null) || 
             (this.lastLoginTime!=null &&
              this.lastLoginTime.equals(other.getLastLoginTime()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.refreshToken==null && other.getRefreshToken()==null) || 
             (this.refreshToken!=null &&
              this.refreshToken.equals(other.getRefreshToken()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.subscribers==null && other.getSubscribers()==null) || 
             (this.subscribers!=null &&
              java.util.Arrays.equals(this.subscribers, other.getSubscribers()))) &&
            ((this.temporaryCause==null && other.getTemporaryCause()==null) || 
             (this.temporaryCause!=null &&
              this.temporaryCause.equals(other.getTemporaryCause()))) &&
            ((this.temporarySessionId==null && other.getTemporarySessionId()==null) || 
             (this.temporarySessionId!=null &&
              this.temporarySessionId.equals(other.getTemporarySessionId()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getForeignName() != null) {
            _hashCode += getForeignName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getLastLoginTime() != null) {
            _hashCode += getLastLoginTime().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRefreshToken() != null) {
            _hashCode += getRefreshToken().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getSubscribers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscribers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscribers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporaryCause() != null) {
            _hashCode += getTemporaryCause().hashCode();
        }
        if (getTemporarySessionId() != null) {
            _hashCode += getTemporarySessionId().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loginResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "genderWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastLoginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refreshToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscribers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "subscriberUserInfoBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temporaryCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "sessionTemporaryCause"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporarySessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "temporarySessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
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
