package com.rahand.sina.integration.domain.digitalcertificate.service.spec;

import com.rahand.sina.integration.domain.digitalcertificate.dto.*;

public interface DigitalCertificate {

    DigitalCertificateIntroduceResponse introduce(DigitalCertificateIntroduceRequest digitalCertificateIntroduceRequest);

    DigitalCertificateCreateResponse create(DigitalCertificateCreateRequest digitalCertificateCreateRequest);

    DigitalCertificateRemoveResponse remove(DigitalCertificateRemoveRequest digitalCertificateRemoveRequest);
}
