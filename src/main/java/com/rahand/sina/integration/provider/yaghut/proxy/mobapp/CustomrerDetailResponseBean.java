/**
 * CustomrerDetailResponseBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class CustomrerDetailResponseBean  implements java.io.Serializable {
    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AddressBean[] addresses;

    private java.util.Calendar birthDate;

    private java.lang.String birthLocation;

    private java.lang.String birthLocationCode;

    private java.lang.String certificateSerial;

    private java.lang.String certificateSeries;

    private java.lang.String cif;

    private java.lang.String code;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationBean[] customerRelations;

    private java.lang.String fatherLatinName;

    private java.lang.String fatherName;

    private java.lang.String firstName;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender;

    private java.lang.String group;

    private java.lang.String lastName;

    private java.lang.String latinFirstName;

    private java.lang.String latinLastName;

    private java.lang.String latinTitle;

    private java.lang.String mobile;

    private java.lang.String name;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personalityType;

    private java.lang.String pervasiveId;

    private java.lang.String ssn;

    private java.lang.String title;

    public CustomrerDetailResponseBean() {
    }

    public CustomrerDetailResponseBean(
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AddressBean[] addresses,
           java.util.Calendar birthDate,
           java.lang.String birthLocation,
           java.lang.String birthLocationCode,
           java.lang.String certificateSerial,
           java.lang.String certificateSeries,
           java.lang.String cif,
           java.lang.String code,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationBean[] customerRelations,
           java.lang.String fatherLatinName,
           java.lang.String fatherName,
           java.lang.String firstName,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender,
           java.lang.String group,
           java.lang.String lastName,
           java.lang.String latinFirstName,
           java.lang.String latinLastName,
           java.lang.String latinTitle,
           java.lang.String mobile,
           java.lang.String name,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personalityType,
           java.lang.String pervasiveId,
           java.lang.String ssn,
           java.lang.String title) {
           this.addresses = addresses;
           this.birthDate = birthDate;
           this.birthLocation = birthLocation;
           this.birthLocationCode = birthLocationCode;
           this.certificateSerial = certificateSerial;
           this.certificateSeries = certificateSeries;
           this.cif = cif;
           this.code = code;
           this.customerRelations = customerRelations;
           this.fatherLatinName = fatherLatinName;
           this.fatherName = fatherName;
           this.firstName = firstName;
           this.gender = gender;
           this.group = group;
           this.lastName = lastName;
           this.latinFirstName = latinFirstName;
           this.latinLastName = latinLastName;
           this.latinTitle = latinTitle;
           this.mobile = mobile;
           this.name = name;
           this.personalityType = personalityType;
           this.pervasiveId = pervasiveId;
           this.ssn = ssn;
           this.title = title;
    }


    /**
     * Gets the addresses value for this CustomrerDetailResponseBean.
     * 
     * @return addresses
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AddressBean[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this CustomrerDetailResponseBean.
     * 
     * @param addresses
     */
    public void setAddresses(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AddressBean[] addresses) {
        this.addresses = addresses;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AddressBean getAddresses(int i) {
        return this.addresses[i];
    }

    public void setAddresses(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.AddressBean _value) {
        this.addresses[i] = _value;
    }


    /**
     * Gets the birthDate value for this CustomrerDetailResponseBean.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this CustomrerDetailResponseBean.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the birthLocation value for this CustomrerDetailResponseBean.
     * 
     * @return birthLocation
     */
    public java.lang.String getBirthLocation() {
        return birthLocation;
    }


    /**
     * Sets the birthLocation value for this CustomrerDetailResponseBean.
     * 
     * @param birthLocation
     */
    public void setBirthLocation(java.lang.String birthLocation) {
        this.birthLocation = birthLocation;
    }


    /**
     * Gets the birthLocationCode value for this CustomrerDetailResponseBean.
     * 
     * @return birthLocationCode
     */
    public java.lang.String getBirthLocationCode() {
        return birthLocationCode;
    }


    /**
     * Sets the birthLocationCode value for this CustomrerDetailResponseBean.
     * 
     * @param birthLocationCode
     */
    public void setBirthLocationCode(java.lang.String birthLocationCode) {
        this.birthLocationCode = birthLocationCode;
    }


    /**
     * Gets the certificateSerial value for this CustomrerDetailResponseBean.
     * 
     * @return certificateSerial
     */
    public java.lang.String getCertificateSerial() {
        return certificateSerial;
    }


    /**
     * Sets the certificateSerial value for this CustomrerDetailResponseBean.
     * 
     * @param certificateSerial
     */
    public void setCertificateSerial(java.lang.String certificateSerial) {
        this.certificateSerial = certificateSerial;
    }


    /**
     * Gets the certificateSeries value for this CustomrerDetailResponseBean.
     * 
     * @return certificateSeries
     */
    public java.lang.String getCertificateSeries() {
        return certificateSeries;
    }


    /**
     * Sets the certificateSeries value for this CustomrerDetailResponseBean.
     * 
     * @param certificateSeries
     */
    public void setCertificateSeries(java.lang.String certificateSeries) {
        this.certificateSeries = certificateSeries;
    }


    /**
     * Gets the cif value for this CustomrerDetailResponseBean.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this CustomrerDetailResponseBean.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the code value for this CustomrerDetailResponseBean.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this CustomrerDetailResponseBean.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the customerRelations value for this CustomrerDetailResponseBean.
     * 
     * @return customerRelations
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationBean[] getCustomerRelations() {
        return customerRelations;
    }


    /**
     * Sets the customerRelations value for this CustomrerDetailResponseBean.
     * 
     * @param customerRelations
     */
    public void setCustomerRelations(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationBean[] customerRelations) {
        this.customerRelations = customerRelations;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationBean getCustomerRelations(int i) {
        return this.customerRelations[i];
    }

    public void setCustomerRelations(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.CustomerRelationBean _value) {
        this.customerRelations[i] = _value;
    }


    /**
     * Gets the fatherLatinName value for this CustomrerDetailResponseBean.
     * 
     * @return fatherLatinName
     */
    public java.lang.String getFatherLatinName() {
        return fatherLatinName;
    }


    /**
     * Sets the fatherLatinName value for this CustomrerDetailResponseBean.
     * 
     * @param fatherLatinName
     */
    public void setFatherLatinName(java.lang.String fatherLatinName) {
        this.fatherLatinName = fatherLatinName;
    }


    /**
     * Gets the fatherName value for this CustomrerDetailResponseBean.
     * 
     * @return fatherName
     */
    public java.lang.String getFatherName() {
        return fatherName;
    }


    /**
     * Sets the fatherName value for this CustomrerDetailResponseBean.
     * 
     * @param fatherName
     */
    public void setFatherName(java.lang.String fatherName) {
        this.fatherName = fatherName;
    }


    /**
     * Gets the firstName value for this CustomrerDetailResponseBean.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CustomrerDetailResponseBean.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this CustomrerDetailResponseBean.
     * 
     * @return gender
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this CustomrerDetailResponseBean.
     * 
     * @param gender
     */
    public void setGender(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.GenderWS gender) {
        this.gender = gender;
    }


    /**
     * Gets the group value for this CustomrerDetailResponseBean.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CustomrerDetailResponseBean.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the lastName value for this CustomrerDetailResponseBean.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CustomrerDetailResponseBean.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the latinFirstName value for this CustomrerDetailResponseBean.
     * 
     * @return latinFirstName
     */
    public java.lang.String getLatinFirstName() {
        return latinFirstName;
    }


    /**
     * Sets the latinFirstName value for this CustomrerDetailResponseBean.
     * 
     * @param latinFirstName
     */
    public void setLatinFirstName(java.lang.String latinFirstName) {
        this.latinFirstName = latinFirstName;
    }


    /**
     * Gets the latinLastName value for this CustomrerDetailResponseBean.
     * 
     * @return latinLastName
     */
    public java.lang.String getLatinLastName() {
        return latinLastName;
    }


    /**
     * Sets the latinLastName value for this CustomrerDetailResponseBean.
     * 
     * @param latinLastName
     */
    public void setLatinLastName(java.lang.String latinLastName) {
        this.latinLastName = latinLastName;
    }


    /**
     * Gets the latinTitle value for this CustomrerDetailResponseBean.
     * 
     * @return latinTitle
     */
    public java.lang.String getLatinTitle() {
        return latinTitle;
    }


    /**
     * Sets the latinTitle value for this CustomrerDetailResponseBean.
     * 
     * @param latinTitle
     */
    public void setLatinTitle(java.lang.String latinTitle) {
        this.latinTitle = latinTitle;
    }


    /**
     * Gets the mobile value for this CustomrerDetailResponseBean.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this CustomrerDetailResponseBean.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the name value for this CustomrerDetailResponseBean.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CustomrerDetailResponseBean.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the personalityType value for this CustomrerDetailResponseBean.
     * 
     * @return personalityType
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType getPersonalityType() {
        return personalityType;
    }


    /**
     * Sets the personalityType value for this CustomrerDetailResponseBean.
     * 
     * @param personalityType
     */
    public void setPersonalityType(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PersonalityType personalityType) {
        this.personalityType = personalityType;
    }


    /**
     * Gets the pervasiveId value for this CustomrerDetailResponseBean.
     * 
     * @return pervasiveId
     */
    public java.lang.String getPervasiveId() {
        return pervasiveId;
    }


    /**
     * Sets the pervasiveId value for this CustomrerDetailResponseBean.
     * 
     * @param pervasiveId
     */
    public void setPervasiveId(java.lang.String pervasiveId) {
        this.pervasiveId = pervasiveId;
    }


    /**
     * Gets the ssn value for this CustomrerDetailResponseBean.
     * 
     * @return ssn
     */
    public java.lang.String getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this CustomrerDetailResponseBean.
     * 
     * @param ssn
     */
    public void setSsn(java.lang.String ssn) {
        this.ssn = ssn;
    }


    /**
     * Gets the title value for this CustomrerDetailResponseBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CustomrerDetailResponseBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomrerDetailResponseBean)) return false;
        CustomrerDetailResponseBean other = (CustomrerDetailResponseBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.birthLocation==null && other.getBirthLocation()==null) || 
             (this.birthLocation!=null &&
              this.birthLocation.equals(other.getBirthLocation()))) &&
            ((this.birthLocationCode==null && other.getBirthLocationCode()==null) || 
             (this.birthLocationCode!=null &&
              this.birthLocationCode.equals(other.getBirthLocationCode()))) &&
            ((this.certificateSerial==null && other.getCertificateSerial()==null) || 
             (this.certificateSerial!=null &&
              this.certificateSerial.equals(other.getCertificateSerial()))) &&
            ((this.certificateSeries==null && other.getCertificateSeries()==null) || 
             (this.certificateSeries!=null &&
              this.certificateSeries.equals(other.getCertificateSeries()))) &&
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.customerRelations==null && other.getCustomerRelations()==null) || 
             (this.customerRelations!=null &&
              java.util.Arrays.equals(this.customerRelations, other.getCustomerRelations()))) &&
            ((this.fatherLatinName==null && other.getFatherLatinName()==null) || 
             (this.fatherLatinName!=null &&
              this.fatherLatinName.equals(other.getFatherLatinName()))) &&
            ((this.fatherName==null && other.getFatherName()==null) || 
             (this.fatherName!=null &&
              this.fatherName.equals(other.getFatherName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.latinFirstName==null && other.getLatinFirstName()==null) || 
             (this.latinFirstName!=null &&
              this.latinFirstName.equals(other.getLatinFirstName()))) &&
            ((this.latinLastName==null && other.getLatinLastName()==null) || 
             (this.latinLastName!=null &&
              this.latinLastName.equals(other.getLatinLastName()))) &&
            ((this.latinTitle==null && other.getLatinTitle()==null) || 
             (this.latinTitle!=null &&
              this.latinTitle.equals(other.getLatinTitle()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.personalityType==null && other.getPersonalityType()==null) || 
             (this.personalityType!=null &&
              this.personalityType.equals(other.getPersonalityType()))) &&
            ((this.pervasiveId==null && other.getPervasiveId()==null) || 
             (this.pervasiveId!=null &&
              this.pervasiveId.equals(other.getPervasiveId()))) &&
            ((this.ssn==null && other.getSsn()==null) || 
             (this.ssn!=null &&
              this.ssn.equals(other.getSsn()))) &&
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
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getBirthLocation() != null) {
            _hashCode += getBirthLocation().hashCode();
        }
        if (getBirthLocationCode() != null) {
            _hashCode += getBirthLocationCode().hashCode();
        }
        if (getCertificateSerial() != null) {
            _hashCode += getCertificateSerial().hashCode();
        }
        if (getCertificateSeries() != null) {
            _hashCode += getCertificateSeries().hashCode();
        }
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCustomerRelations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerRelations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerRelations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFatherLatinName() != null) {
            _hashCode += getFatherLatinName().hashCode();
        }
        if (getFatherName() != null) {
            _hashCode += getFatherName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLatinFirstName() != null) {
            _hashCode += getLatinFirstName().hashCode();
        }
        if (getLatinLastName() != null) {
            _hashCode += getLatinLastName().hashCode();
        }
        if (getLatinTitle() != null) {
            _hashCode += getLatinTitle().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPersonalityType() != null) {
            _hashCode += getPersonalityType().hashCode();
        }
        if (getPervasiveId() != null) {
            _hashCode += getPervasiveId().hashCode();
        }
        if (getSsn() != null) {
            _hashCode += getSsn().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomrerDetailResponseBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customrerDetailResponseBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "addressBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthLocationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthLocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateSeries"));
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
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "customerRelationBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherLatinName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fatherLatinName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fatherName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
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
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latinFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latinFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latinLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latinLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latinTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latinTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("personalityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "personalityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pervasiveId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pervasiveId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssn"));
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
