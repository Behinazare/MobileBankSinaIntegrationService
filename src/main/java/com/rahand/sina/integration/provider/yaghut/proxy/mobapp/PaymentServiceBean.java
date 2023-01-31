/**
 * PaymentServiceBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class PaymentServiceBean  implements java.io.Serializable {
    private java.lang.String description;

    private java.math.BigDecimal fixAmount;

    private java.lang.String foreignDescription;

    private java.lang.String foreignTitle;

    private java.lang.String id;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputParameterBean[] inputParameters;

    private com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceOutputParameterBean[] outputParameters;

    private java.lang.String title;

    public PaymentServiceBean() {
    }

    public PaymentServiceBean(
           java.lang.String description,
           java.math.BigDecimal fixAmount,
           java.lang.String foreignDescription,
           java.lang.String foreignTitle,
           java.lang.String id,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputParameterBean[] inputParameters,
           com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceOutputParameterBean[] outputParameters,
           java.lang.String title) {
           this.description = description;
           this.fixAmount = fixAmount;
           this.foreignDescription = foreignDescription;
           this.foreignTitle = foreignTitle;
           this.id = id;
           this.inputParameters = inputParameters;
           this.outputParameters = outputParameters;
           this.title = title;
    }


    /**
     * Gets the description value for this PaymentServiceBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PaymentServiceBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fixAmount value for this PaymentServiceBean.
     * 
     * @return fixAmount
     */
    public java.math.BigDecimal getFixAmount() {
        return fixAmount;
    }


    /**
     * Sets the fixAmount value for this PaymentServiceBean.
     * 
     * @param fixAmount
     */
    public void setFixAmount(java.math.BigDecimal fixAmount) {
        this.fixAmount = fixAmount;
    }


    /**
     * Gets the foreignDescription value for this PaymentServiceBean.
     * 
     * @return foreignDescription
     */
    public java.lang.String getForeignDescription() {
        return foreignDescription;
    }


    /**
     * Sets the foreignDescription value for this PaymentServiceBean.
     * 
     * @param foreignDescription
     */
    public void setForeignDescription(java.lang.String foreignDescription) {
        this.foreignDescription = foreignDescription;
    }


    /**
     * Gets the foreignTitle value for this PaymentServiceBean.
     * 
     * @return foreignTitle
     */
    public java.lang.String getForeignTitle() {
        return foreignTitle;
    }


    /**
     * Sets the foreignTitle value for this PaymentServiceBean.
     * 
     * @param foreignTitle
     */
    public void setForeignTitle(java.lang.String foreignTitle) {
        this.foreignTitle = foreignTitle;
    }


    /**
     * Gets the id value for this PaymentServiceBean.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PaymentServiceBean.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the inputParameters value for this PaymentServiceBean.
     * 
     * @return inputParameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputParameterBean[] getInputParameters() {
        return inputParameters;
    }


    /**
     * Sets the inputParameters value for this PaymentServiceBean.
     * 
     * @param inputParameters
     */
    public void setInputParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputParameterBean[] inputParameters) {
        this.inputParameters = inputParameters;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputParameterBean getInputParameters(int i) {
        return this.inputParameters[i];
    }

    public void setInputParameters(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceInputParameterBean _value) {
        this.inputParameters[i] = _value;
    }


    /**
     * Gets the outputParameters value for this PaymentServiceBean.
     * 
     * @return outputParameters
     */
    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceOutputParameterBean[] getOutputParameters() {
        return outputParameters;
    }


    /**
     * Sets the outputParameters value for this PaymentServiceBean.
     * 
     * @param outputParameters
     */
    public void setOutputParameters(com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceOutputParameterBean[] outputParameters) {
        this.outputParameters = outputParameters;
    }

    public com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceOutputParameterBean getOutputParameters(int i) {
        return this.outputParameters[i];
    }

    public void setOutputParameters(int i, com.rahand.sina.integration.provider.yaghut.proxy.mobapp.PaymentServiceOutputParameterBean _value) {
        this.outputParameters[i] = _value;
    }


    /**
     * Gets the title value for this PaymentServiceBean.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PaymentServiceBean.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentServiceBean)) return false;
        PaymentServiceBean other = (PaymentServiceBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fixAmount==null && other.getFixAmount()==null) || 
             (this.fixAmount!=null &&
              this.fixAmount.equals(other.getFixAmount()))) &&
            ((this.foreignDescription==null && other.getForeignDescription()==null) || 
             (this.foreignDescription!=null &&
              this.foreignDescription.equals(other.getForeignDescription()))) &&
            ((this.foreignTitle==null && other.getForeignTitle()==null) || 
             (this.foreignTitle!=null &&
              this.foreignTitle.equals(other.getForeignTitle()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.inputParameters==null && other.getInputParameters()==null) || 
             (this.inputParameters!=null &&
              java.util.Arrays.equals(this.inputParameters, other.getInputParameters()))) &&
            ((this.outputParameters==null && other.getOutputParameters()==null) || 
             (this.outputParameters!=null &&
              java.util.Arrays.equals(this.outputParameters, other.getOutputParameters()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFixAmount() != null) {
            _hashCode += getFixAmount().hashCode();
        }
        if (getForeignDescription() != null) {
            _hashCode += getForeignDescription().hashCode();
        }
        if (getForeignTitle() != null) {
            _hashCode += getForeignTitle().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInputParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentServiceBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fixAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceInputParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "paymentServiceOutputParameterBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
