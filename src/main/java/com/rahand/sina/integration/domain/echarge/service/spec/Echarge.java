package com.rahand.sina.integration.domain.echarge.service.spec;

import com.rahand.sina.integration.domain.echarge.dto.*;

public interface Echarge {

    BuyChargeResponse buyCharge(BuyChargeRequest buyChargeRequest);

    GetInternetPackageResponse getInternetPackageList(GetInternetPackageRequest getInternetPackageRequest);

    BuyInternetPackageResponse buyInternetPackage(BuyInternetPackageRequest buyInternetPackageRequest);
}
