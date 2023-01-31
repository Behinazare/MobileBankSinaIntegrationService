package com.rahand.sina.integration.provider.yaghut.service;

import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.config.IntegrationLibConfig;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.SoapServices;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.Soap_sinaMobAppLocator;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.Soap_sinaBPMSLocator;
import com.rahand.sina.integration.provider.yaghut.util.YaghutUtil;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;

public class YaghutServiceLocator {

    static {
        YaghutUtil.loadSslCertificate();
    }

    public static SoapServices getMobAppService() {

        SoapServices mobAppService;

        try {

            URL url = new URL(IntegrationLibConfig.getProperty("MOB_APP_SOAP_PORT_ADDRESS"));
            Soap_sinaMobAppLocator soap_sinaMobAppLocator = new Soap_sinaMobAppLocator();
            mobAppService = soap_sinaMobAppLocator.getsoapPort(url);

        } catch (ServiceException | MalformedURLException e) {
            CommonUtil.logError(YaghutServiceLocator.class.getSimpleName(), "getMobAppService", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);

        }

        return mobAppService;
    }

    public static com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.SoapServices getSinaBpmsService() {

        com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.SoapServices bpmsService;

        try {

            URL url = new URL(IntegrationLibConfig.getProperty("SINA_BPMS_PORT_ADDRESS"));
            Soap_sinaBPMSLocator soap_sinaBPMSLocator = new Soap_sinaBPMSLocator();
            bpmsService = soap_sinaBPMSLocator.getsoapPort(url);

        } catch (ServiceException | MalformedURLException e) {
            CommonUtil.logError(YaghutServiceLocator.class.getSimpleName(), "getSinaBpmsService", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }

        return bpmsService;
    }

}
