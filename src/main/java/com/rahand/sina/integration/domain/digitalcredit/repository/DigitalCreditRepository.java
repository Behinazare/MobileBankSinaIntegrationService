package com.rahand.sina.integration.domain.digitalcredit.repository;

import com.rahand.common.util.CommonUtil;
import com.rahand.common.util.DBUtility;
import com.rahand.sina.integration.domain.digitalcredit.dto.DigitalCreditDossiersDto;
import com.rahand.sina.integration.domain.digitalcredit.dto.DigitalCreditProviderDossierInfo;
import com.rahand.sina.integration.domain.digitalcredit.enums.DigitalCreditProvider;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DigitalCreditRepository {

    public Optional<List<DigitalCreditDossiersDto>> getUserDigitalCreditDossiers(String userId) {

        Optional<List<DigitalCreditDossiersDto>> digitalCreditDossiersDtoOptional = Optional.empty();
        List<DigitalCreditDossiersDto> digitalCreditDossiers = new ArrayList<>();

        String query = "SELECT * FROM XTI22CREDITWALLET xc WHERE xc.USERID = ? AND xc.INTERNALSTATUS ='1'";

        try (PreparedStatement preparedStatement = DBUtility.createPreparedStatement(query)) {

            preparedStatement.setString(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                digitalCreditDossiers.add(DigitalCreditDossiersDto.builder()
                        .title(resultSet.getString("TITLE"))
                        .pan(resultSet.getString("WALLETID"))
                        .dossierNumber(resultSet.getString("DOSSIERNUMBER"))
                        .totalFund(new BigDecimal(resultSet.getLong("AMOUNT")))
                        .availableFund(new BigDecimal(resultSet.getLong("REMAIN")))
                        .digitalCreditProviderDossierInfo(DigitalCreditProviderDossierInfo.builder()
                                .digitalCreditProvider(DigitalCreditProvider.get(resultSet.getString("PROVIDER")))
                                .businessCode(resultSet.getString("BSCODE"))
                                .build())
                        .build());
            }

            if (!digitalCreditDossiers.isEmpty()) {
                digitalCreditDossiersDtoOptional = Optional.of(digitalCreditDossiers);
            }

        } catch (SQLException e) {
            CommonUtil.logError(getClass().getSimpleName(), "getUserDigitalCreditDossiers", e.toString());

        }

        return digitalCreditDossiersDtoOptional;
    }
}
