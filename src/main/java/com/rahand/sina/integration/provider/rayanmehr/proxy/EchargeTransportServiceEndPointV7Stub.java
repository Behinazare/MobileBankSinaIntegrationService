/**
 * EchargeTransportServiceEndPointV7Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.sina.integration.provider.rayanmehr.proxy;

public class EchargeTransportServiceEndPointV7Stub extends org.apache.axis.client.Stub implements com.rahand.sina.integration.provider.rayanmehr.proxy.IEchargeServiceV7 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RegisterTopup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "RegisterTopupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TwoPhaseTopupRegister");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupRegisterRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRegisterRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TwoPhaseTopupRegisterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TwoPhaseTopupProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupProcessRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TwoPhaseTopupProcessResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TwoPhaseTopupProcessWithEndUserInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupProcessWithEndUserInfoRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessWithEndUserInfoRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "TwoPhaseTopupProcessWithEndUserInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RegisterVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "VoucherRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "VoucherResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "RegisterVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReverseVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ReverseVoucherRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ReverseVoucherResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ReverseVoucherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RevealVouchers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.StatusRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "VoucherResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "RevealVouchersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsProductAvailable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ProductAvailableRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ProductAvailableResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "IsProductAvailableResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.StatusRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusByOptionalMerchantData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusByOptionalMerchantDataRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.StatusByOptionalMerchantDataRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStatusByOptionalMerchantDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BalanceRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BalanceResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBalanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInternetPackages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "InternetPackagesRequestV7"), com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesRequestV7.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "InternetPackagesResponseV7"));
        oper.setReturnClass(com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesResponseV7.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetInternetPackagesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

    }

    public EchargeTransportServiceEndPointV7Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EchargeTransportServiceEndPointV7Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EchargeTransportServiceEndPointV7Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ArrayOfBoltonV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.BoltonV7[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BoltonV7");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BoltonV7");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BalanceRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BalanceResponseV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceResponseV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BaseProductV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.BaseProductV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "BoltonV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.BoltonV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "InternetPackagesRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "InternetPackagesResponseV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesResponseV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ProductAvailableRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ProductAvailableResponseV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableResponseV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ReverseVoucherRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "ReverseVoucherResponseV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherResponseV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusByOptionalMerchantDataRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.StatusByOptionalMerchantDataRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.StatusRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "StatusResponseV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupProcessRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupProcessWithEndUserInfoRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessWithEndUserInfoRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupRegisterRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRegisterRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "TopupResponseV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "VoucherRequestV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherRequestV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.DataContracts.Strict.Version7", "VoucherResponseV7");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "ArrayOfVoucher");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.Voucher[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "Voucher");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "Voucher");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "EndUser");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.EndUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Rayanmehr.eCharge.WebService.Entity", "Voucher");
            cachedSerQNames.add(qName);
            cls = com.rahand.sina.integration.provider.rayanmehr.proxy.Voucher.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 registerTopup(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/RegisterTopup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "RegisterTopup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 twoPhaseTopupRegister(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupRegisterRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/TwoPhaseTopupRegister");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TwoPhaseTopupRegister"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 twoPhaseTopupProcess(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/TwoPhaseTopupProcess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TwoPhaseTopupProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7 twoPhaseTopupProcessWithEndUserInfo(com.rahand.sina.integration.provider.rayanmehr.proxy.TopupProcessWithEndUserInfoRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/TwoPhaseTopupProcessWithEndUserInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "TwoPhaseTopupProcessWithEndUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.TopupResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7 registerVoucher(com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/RegisterVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "RegisterVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherResponseV7 reverseVoucher(com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/ReverseVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ReverseVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.ReverseVoucherResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7 revealVouchers(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/RevealVouchers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "RevealVouchers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.VoucherResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableResponseV7 isProductAvailable(com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/IsProductAvailable");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "IsProductAvailable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.ProductAvailableResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7 getStatus(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/GetStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7 getStatusByOptionalMerchantData(com.rahand.sina.integration.provider.rayanmehr.proxy.StatusByOptionalMerchantDataRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/GetStatusByOptionalMerchantData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetStatusByOptionalMerchantData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.StatusResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceResponseV7 getBalance(com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/GetBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.BalanceResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesResponseV7 getInternetPackages(com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesRequestV7 request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IEchargeServiceV7/GetInternetPackages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetInternetPackages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesResponseV7) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesResponseV7) org.apache.axis.utils.JavaUtils.convert(_resp, com.rahand.sina.integration.provider.rayanmehr.proxy.InternetPackagesResponseV7.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
