/**
 * BaseProductV7.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class BaseProductV7  implements java.io.Serializable {
    private java.lang.Integer durationInHours;

    private java.lang.Integer id;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isObsolete;

    private java.lang.String name;

    private java.lang.Integer price;

    public BaseProductV7() {
    }

    public BaseProductV7(
           java.lang.Integer durationInHours,
           java.lang.Integer id,
           java.lang.Boolean isActive,
           java.lang.Boolean isObsolete,
           java.lang.String name,
           java.lang.Integer price) {
           this.durationInHours = durationInHours;
           this.id = id;
           this.isActive = isActive;
           this.isObsolete = isObsolete;
           this.name = name;
           this.price = price;
    }


    /**
     * Gets the durationInHours value for this BaseProductV7.
     * 
     * @return durationInHours
     */
    public java.lang.Integer getDurationInHours() {
        return durationInHours;
    }


    /**
     * Sets the durationInHours value for this BaseProductV7.
     * 
     * @param durationInHours
     */
    public void setDurationInHours(java.lang.Integer durationInHours) {
        this.durationInHours = durationInHours;
    }


    /**
     * Gets the id value for this BaseProductV7.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this BaseProductV7.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the isActive value for this BaseProductV7.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this BaseProductV7.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isObsolete value for this BaseProductV7.
     * 
     * @return isObsolete
     */
    public java.lang.Boolean getIsObsolete() {
        return isObsolete;
    }


    /**
     * Sets the isObsolete value for this BaseProductV7.
     * 
     * @param isObsolete
     */
    public void setIsObsolete(java.lang.Boolean isObsolete) {
        this.isObsolete = isObsolete;
    }


    /**
     * Gets the name value for this BaseProductV7.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BaseProductV7.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the price value for this BaseProductV7.
     * 
     * @return price
     */
    public java.lang.Integer getPrice() {
        return price;
    }


    /**
     * Sets the price value for this BaseProductV7.
     * 
     * @param price
     */
    public void setPrice(java.lang.Integer price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseProductV7)) return false;
        BaseProductV7 other = (BaseProductV7) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.durationInHours==null && other.getDurationInHours()==null) || 
             (this.durationInHours!=null &&
              this.durationInHours.equals(other.getDurationInHours()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isObsolete==null && other.getIsObsolete()==null) || 
             (this.isObsolete!=null &&
              this.isObsolete.equals(other.getIsObsolete()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice())));
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
        if (getDurationInHours() != null) {
            _hashCode += getDurationInHours().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsObsolete() != null) {
            _hashCode += getIsObsolete().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseProductV7.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BaseProductV7"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationInHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "DurationInHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isObsolete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "IsObsolete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
