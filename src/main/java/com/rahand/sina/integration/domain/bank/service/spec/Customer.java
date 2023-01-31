package com.rahand.sina.integration.domain.bank.service.spec;

import com.rahand.sina.integration.domain.bank.dto.*;

public interface Customer {

    CheckCustomerResponse checkCustomer(CheckCustomerRequest checkCustomerRequest);

    GenerateChannelUserResponse generateChannelUser(GenerateChannelUserRequest generateChannelUserRequest);

    ChangeChannelPasswordResponse changeChannelPassword(ChangeChannelPasswordRequest changeChannelPasswordRequest);

    CreateCustomerResponse createCustomer(CreateCustomerRequest createCustomerRequest);

    CustomerInfoResponse getCustomerInfo(CustomerInfoRequest customerInfoRequest);

    CustomerInfoDetailResponse getCustomerInfoDetail(CustomerInfoDetailRequest customerInfoDetailRequest);

    CustomerAddressResponse getCustomerAddress(CustomerAddressRequest customerAddressRequest);

    CustomerSignaturesResponse getCustomerSignatures(CustomerSignaturesRequest customerSignaturesRequest);
}
