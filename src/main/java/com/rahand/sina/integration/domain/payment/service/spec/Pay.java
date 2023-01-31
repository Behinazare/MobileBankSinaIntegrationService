package com.rahand.sina.integration.domain.payment.service.spec;

import com.rahand.common.dto.PaymentMethodConfigRequest;
import com.rahand.common.dto.PaymentMethodConfigResponse;
import com.rahand.sina.integration.domain.payment.dto.PaymentRequest;
import com.rahand.sina.integration.domain.payment.dto.PaymentResponse;
import com.rahand.sina.integration.domain.payment.dto.RollBackPayRequest;
import com.rahand.sina.integration.domain.payment.dto.RollBackPayResponse;

public interface Pay {

    PaymentResponse pay(PaymentRequest paymentRequest);

    RollBackPayResponse rollBack(RollBackPayRequest rollBackPayRequest);

    PaymentMethodConfigResponse getPaymentMethodConfig(PaymentMethodConfigRequest paymentMethodConfigRequest);
}
