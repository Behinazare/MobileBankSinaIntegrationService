/**
 * LoanClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.yaghut.proxy.mobapp;

public class LoanClass implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LoanClass(java.lang.String value) {
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
    public static final java.lang.String _ESTESNA = "ESTESNA";
    public static final java.lang.String _MORABEHE = "MORABEHE";
    public static final LoanClass MOZAREBE = new LoanClass(_MOZAREBE);
    public static final LoanClass MOSHAREKATE_MADANI = new LoanClass(_MOSHAREKATE_MADANI);
    public static final LoanClass MOSHAREKATE_HOGHOGHY = new LoanClass(_MOSHAREKATE_HOGHOGHY);
    public static final LoanClass FOROOSHE_AGHSATY = new LoanClass(_FOROOSHE_AGHSATY);
    public static final LoanClass EJARE_BE_SHARTE_TAMLIK = new LoanClass(_EJARE_BE_SHARTE_TAMLIK);
    public static final LoanClass SALAF = new LoanClass(_SALAF);
    public static final LoanClass JOALE = new LoanClass(_JOALE);
    public static final LoanClass SARMAYEGOZARIE_MOSTAGHIM = new LoanClass(_SARMAYEGOZARIE_MOSTAGHIM);
    public static final LoanClass GHARZOLHASANE = new LoanClass(_GHARZOLHASANE);
    public static final LoanClass ZEMAN = new LoanClass(_ZEMAN);
    public static final LoanClass KHARIDE_DEYN = new LoanClass(_KHARIDE_DEYN);
    public static final LoanClass MOZARE_EH = new LoanClass(_MOZARE_EH);
    public static final LoanClass MOSAGHAT = new LoanClass(_MOSAGHAT);
    public static final LoanClass KHADAMATE_ETEBARY = new LoanClass(_KHADAMATE_ETEBARY);
    public static final LoanClass MOZAREBE_AAM = new LoanClass(_MOZAREBE_AAM);
    public static final LoanClass MOSHAREKAT_AAM = new LoanClass(_MOSHAREKAT_AAM);
    public static final LoanClass ESTESNA = new LoanClass(_ESTESNA);
    public static final LoanClass MORABEHE = new LoanClass(_MORABEHE);
    public java.lang.String getValue() { return _value_;}
    public static LoanClass fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LoanClass enumeration = (LoanClass)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LoanClass fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LoanClass.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.yaghut.modern.tosan.com/", "loanClass"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
