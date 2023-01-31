/**
 * LoanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoanType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MOZAREBE = "MOZAREBE";
    public static final java.lang.String _MOSHAREKATE_MADANI = "MOSHAREKATE_MADANI";
    public static final java.lang.String _MOSHAREKATE_HOGHOGHY = "MOSHAREKATE_HOGHOGHY";
    public static final java.lang.String _FOROOSHE_AGHSATY = "FOROOSHE_AGHSATY";
    public static final java.lang.String _EJARE_BE_SHARTE_TAMLIK = "EJARE_BE_SHARTE_TAMLIK";
    public static final java.lang.String _SALAF = "SALAF";
    public static final java.lang.String _JOALE = "JOALE";
    public static final java.lang.String _SARMAYEGOZARIE_MOSTAGHIM = "SARMAYEGOZARIE_MOSTAGHIM";
    public static final java.lang.String _GHARZOLHASANE = "GHARZOLHASANE";
    public static final java.lang.String _ZEMAN = "ZEMAN";
    public static final java.lang.String _KHARIDE_DEYN = "KHARIDE_DEYN";
    public static final java.lang.String _MOZARE_EH = "MOZARE_EH";
    public static final java.lang.String _MOSAGHAT = "MOSAGHAT";
    public static final java.lang.String _KHADAMATE_ETEBARY = "KHADAMATE_ETEBARY";
    public static final java.lang.String _MOZAREBE_AAM = "MOZAREBE_AAM";
    public static final java.lang.String _MOSHAREKAT_AAM = "MOSHAREKAT_AAM";
    public static final LoanType MOZAREBE = new LoanType(_MOZAREBE);
    public static final LoanType MOSHAREKATE_MADANI = new LoanType(_MOSHAREKATE_MADANI);
    public static final LoanType MOSHAREKATE_HOGHOGHY = new LoanType(_MOSHAREKATE_HOGHOGHY);
    public static final LoanType FOROOSHE_AGHSATY = new LoanType(_FOROOSHE_AGHSATY);
    public static final LoanType EJARE_BE_SHARTE_TAMLIK = new LoanType(_EJARE_BE_SHARTE_TAMLIK);
    public static final LoanType SALAF = new LoanType(_SALAF);
    public static final LoanType JOALE = new LoanType(_JOALE);
    public static final LoanType SARMAYEGOZARIE_MOSTAGHIM = new LoanType(_SARMAYEGOZARIE_MOSTAGHIM);
    public static final LoanType GHARZOLHASANE = new LoanType(_GHARZOLHASANE);
    public static final LoanType ZEMAN = new LoanType(_ZEMAN);
    public static final LoanType KHARIDE_DEYN = new LoanType(_KHARIDE_DEYN);
    public static final LoanType MOZARE_EH = new LoanType(_MOZARE_EH);
    public static final LoanType MOSAGHAT = new LoanType(_MOSAGHAT);
    public static final LoanType KHADAMATE_ETEBARY = new LoanType(_KHADAMATE_ETEBARY);
    public static final LoanType MOZAREBE_AAM = new LoanType(_MOZAREBE_AAM);
    public static final LoanType MOSHAREKAT_AAM = new LoanType(_MOSHAREKAT_AAM);
    public java.lang.String getValue() { return _value_;}
    public static LoanType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoanType enumeration = (LoanType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LoanType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoanType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
