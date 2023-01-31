package com.rahand.sina.integration.domain.bank.service.spec;

import com.rahand.sina.integration.domain.bank.dto.GetBankRequest;
import com.rahand.sina.integration.domain.bank.dto.GetBanksResponse;
import com.rahand.sina.integration.domain.bank.dto.GetBranchRequest;
import com.rahand.sina.integration.domain.bank.dto.GetBranchResponse;

public interface General {


    GetBanksResponse getBanksInfo(GetBankRequest getBankRequest);

    GetBranchResponse getBranchInfo(GetBranchRequest getBranchRequest);
}
