package com.rahand.sina.integration.provider.yaghut.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.common.enums.Gender;
import com.rahand.common.util.CommonUtil;
import com.rahand.sina.integration.domain.bank.dto.*;
import com.rahand.sina.integration.domain.bank.enums.Currency;
import com.rahand.sina.integration.domain.bank.enums.LoanStatus;
import com.rahand.sina.integration.domain.bank.enums.LoanType;
import com.rahand.sina.integration.domain.bank.enums.*;
import com.rahand.sina.integration.provider.yaghut.proxy.mobapp.*;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessParameterInputValueBean;
import com.rahand.sina.integration.provider.yaghut.proxy.sinabpms.ProcessParameterValueBean;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class YaghutMapper {

    public static ProcessParameterValueBean[] initCreateCustomerProcessParameter(CreateCustomerRequest createCustomerRequest) {

        List<ProcessParameterValueBean> processParameterValueBeans = new ArrayList<>();

        if (createCustomerRequest.getCustomerId() != null) {
            ProcessParameterValueBean customerIdProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean customerId = new ProcessParameterInputValueBean();
            customerId.setValues(new String[]{createCustomerRequest.getCustomerId()});
            customerIdProcessParameterValueBean.setParameterValue(customerId);
            customerIdProcessParameterValueBean.setParameterId("CustomerId");
            processParameterValueBeans.add(customerIdProcessParameterValueBean);
        }


        if (createCustomerRequest.getGroupCode() != null) {
            ProcessParameterValueBean groupCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean groupCode = new ProcessParameterInputValueBean();
            groupCode.setValues(new String[]{createCustomerRequest.getGroupCode()});
            groupCodeProcessParameterValueBean.setParameterValue(groupCode);
            groupCodeProcessParameterValueBean.setParameterId("GroupCode");
            processParameterValueBeans.add(groupCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getNationalityCode() != null) {
            ProcessParameterValueBean nationalityCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean nationalityCode = new ProcessParameterInputValueBean();
            nationalityCode.setValues(new String[]{createCustomerRequest.getNationalityCode()});
            nationalityCodeProcessParameterValueBean.setParameterValue(nationalityCode);
            nationalityCodeProcessParameterValueBean.setParameterId("NationalityCode");
            processParameterValueBeans.add(nationalityCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getFirstName() != null) {
            ProcessParameterValueBean firstNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean firstName = new ProcessParameterInputValueBean();
            firstName.setValues(new String[]{createCustomerRequest.getFirstName()});
            firstNameProcessParameterValueBean.setParameterValue(firstName);
            firstNameProcessParameterValueBean.setParameterId("FirstName");
            processParameterValueBeans.add(firstNameProcessParameterValueBean);
        }


        if (createCustomerRequest.getLastName() != null) {
            ProcessParameterValueBean lastNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean lastName = new ProcessParameterInputValueBean();
            lastName.setValues(new String[]{createCustomerRequest.getLastName()});
            lastNameProcessParameterValueBean.setParameterValue(lastName);
            lastNameProcessParameterValueBean.setParameterId("LastName");
            processParameterValueBeans.add(lastNameProcessParameterValueBean);
        }


        if (createCustomerRequest.getFatherName() != null) {
            ProcessParameterValueBean fatherNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean fatherName = new ProcessParameterInputValueBean();
            fatherName.setValues(new String[]{createCustomerRequest.getFatherName()});
            fatherNameProcessParameterValueBean.setParameterValue(fatherName);
            fatherNameProcessParameterValueBean.setParameterId("FatherName");
            processParameterValueBeans.add(fatherNameProcessParameterValueBean);
        }


        if (createCustomerRequest.getBirthDate() != null) {
            ProcessParameterValueBean birthDateProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean birthDate = new ProcessParameterInputValueBean();
            LocalDateTime inputBirthDate = createCustomerRequest.getBirthDate();
            String birthDateStringFormat = String.format("%s/%s/%s", inputBirthDate.getYear(), inputBirthDate.getMonthValue(), inputBirthDate.getDayOfMonth());
            birthDate.setValues(new String[]{birthDateStringFormat});
            birthDateProcessParameterValueBean.setParameterValue(birthDate);
            birthDateProcessParameterValueBean.setParameterId("BirthDate");
            processParameterValueBeans.add(birthDateProcessParameterValueBean);
        }


        if (createCustomerRequest.getIdCardNumber() != null) {
            ProcessParameterValueBean idCardNumberProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean idCardNumber = new ProcessParameterInputValueBean();
            idCardNumber.setValues(new String[]{createCustomerRequest.getIdCardNumber()});
            idCardNumberProcessParameterValueBean.setParameterValue(idCardNumber);
            idCardNumberProcessParameterValueBean.setParameterId("IdCardNumber");
            processParameterValueBeans.add(idCardNumberProcessParameterValueBean);
        }


        if (createCustomerRequest.getGender() != null) {
            ProcessParameterValueBean genderProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean gender = new ProcessParameterInputValueBean();
            gender.setValues(new String[]{String.valueOf(createCustomerRequest.getGender().getId())});
            genderProcessParameterValueBean.setParameterValue(gender);
            genderProcessParameterValueBean.setParameterId("Gender");
            processParameterValueBeans.add(genderProcessParameterValueBean);
        }


        if (createCustomerRequest.getLatinFirstName() != null) {
            ProcessParameterValueBean latinFirstNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean latinFirstName = new ProcessParameterInputValueBean();
            latinFirstName.setValues(new String[]{createCustomerRequest.getLatinFirstName()});
            latinFirstNameProcessParameterValueBean.setParameterValue(latinFirstName);
            latinFirstNameProcessParameterValueBean.setParameterId("LatinFirstName");
            processParameterValueBeans.add(latinFirstNameProcessParameterValueBean);
        }

        if (createCustomerRequest.getLatinLastName() != null) {
            ProcessParameterValueBean latinLastNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean latinLastName = new ProcessParameterInputValueBean();
            latinLastName.setValues(new String[]{createCustomerRequest.getLatinLastName()});
            latinLastNameProcessParameterValueBean.setParameterValue(latinLastName);
            latinLastNameProcessParameterValueBean.setParameterId("LatinLastName");
            processParameterValueBeans.add(latinLastNameProcessParameterValueBean);
        }


        if (createCustomerRequest.getLatinFatherName() != null) {
            ProcessParameterValueBean latinFatherNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean latinFatherName = new ProcessParameterInputValueBean();
            latinFatherName.setValues(new String[]{createCustomerRequest.getLatinFatherName()});
            latinFatherNameProcessParameterValueBean.setParameterValue(latinFatherName);
            latinFatherNameProcessParameterValueBean.setParameterId("LatinFatherName");
            processParameterValueBeans.add(latinFatherNameProcessParameterValueBean);
        }


        if (createCustomerRequest.getNationalCode() != null) {
            ProcessParameterValueBean nationalCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean nationalCode = new ProcessParameterInputValueBean();
            nationalCode.setValues(new String[]{createCustomerRequest.getNationalCode()});
            nationalCodeProcessParameterValueBean.setParameterValue(nationalCode);
            nationalCodeProcessParameterValueBean.setParameterId("NationalCode");
            processParameterValueBeans.add(nationalCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getRegionStatus() != null) {
            ProcessParameterValueBean regionStatusProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean regionStatus = new ProcessParameterInputValueBean();
            regionStatus.setValues(new String[]{createCustomerRequest.getRegionStatus()});
            regionStatusProcessParameterValueBean.setParameterValue(regionStatus);
            regionStatusProcessParameterValueBean.setParameterId("RegionStatus");
            processParameterValueBeans.add(regionStatusProcessParameterValueBean);
        }

        if (createCustomerRequest.getHomeAreaRange() != null) {
            ProcessParameterValueBean homeRentRangeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean homeRentRange = new ProcessParameterInputValueBean();
            homeRentRange.setValues(new String[]{createCustomerRequest.getHomeRentRange()});
            homeRentRangeProcessParameterValueBean.setParameterValue(homeRentRange);
            homeRentRangeProcessParameterValueBean.setParameterId("HomeRentRange");
            processParameterValueBeans.add(homeRentRangeProcessParameterValueBean);
        }


        if (createCustomerRequest.getBookIdAlphabeticSerie() != null) {
            ProcessParameterValueBean bookIdAlphabeticSerieProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean bookIdAlphabeticSerie = new ProcessParameterInputValueBean();
            bookIdAlphabeticSerie.setValues(new String[]{createCustomerRequest.getBookIdAlphabeticSerie()});
            bookIdAlphabeticSerieProcessParameterValueBean.setParameterValue(bookIdAlphabeticSerie);
            bookIdAlphabeticSerieProcessParameterValueBean.setParameterId("BookIdAlphabeticSerie");
            processParameterValueBeans.add(bookIdAlphabeticSerieProcessParameterValueBean);
        }


        if (createCustomerRequest.getBookIdNumericSerie() != null) {
            ProcessParameterValueBean bookIdNumericSerieProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean bookIdNumericSerie = new ProcessParameterInputValueBean();
            bookIdNumericSerie.setValues(new String[]{createCustomerRequest.getBookIdNumericSerie()});
            bookIdNumericSerieProcessParameterValueBean.setParameterValue(bookIdNumericSerie);
            bookIdNumericSerieProcessParameterValueBean.setParameterId("BookIdNumericSerie");
            processParameterValueBeans.add(bookIdNumericSerieProcessParameterValueBean);
        }


        if (createCustomerRequest.getBookIdSerial() != null) {
            ProcessParameterValueBean bookIdSerialProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean bookIdSerial = new ProcessParameterInputValueBean();
            bookIdSerial.setValues(new String[]{createCustomerRequest.getBookIdSerial()});
            bookIdSerialProcessParameterValueBean.setParameterValue(bookIdSerial);
            bookIdSerialProcessParameterValueBean.setParameterId("BookIdSerial");
            processParameterValueBeans.add(bookIdSerialProcessParameterValueBean);
        }


        if (createCustomerRequest.getBirthPlaceCountry() != null) {
            ProcessParameterValueBean birthPlaceCountryProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean birthPlaceCountry = new ProcessParameterInputValueBean();
            birthPlaceCountry.setValues(new String[]{createCustomerRequest.getBirthPlaceCountry()});
            birthPlaceCountryProcessParameterValueBean.setParameterValue(birthPlaceCountry);
            birthPlaceCountryProcessParameterValueBean.setParameterId("BirthPlaceCountry");
            processParameterValueBeans.add(birthPlaceCountryProcessParameterValueBean);
        }


        if (createCustomerRequest.getIssueDomainCode() != null) {
            ProcessParameterValueBean issueDomainCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean issueDomainCode = new ProcessParameterInputValueBean();
            issueDomainCode.setValues(new String[]{createCustomerRequest.getIssueDomainCode()});
            issueDomainCodeProcessParameterValueBean.setParameterValue(issueDomainCode);
            issueDomainCodeProcessParameterValueBean.setParameterId("IssueDomainCode");
            processParameterValueBeans.add(issueDomainCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getIssueLocationName() != null) {
            ProcessParameterValueBean issueLocationNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean issueLocationName = new ProcessParameterInputValueBean();
            issueLocationName.setValues(new String[]{createCustomerRequest.getIssueLocationName()});
            issueLocationNameProcessParameterValueBean.setParameterValue(issueLocationName);
            issueLocationNameProcessParameterValueBean.setParameterId("IssueLocationName");
            processParameterValueBeans.add(issueLocationNameProcessParameterValueBean);
        }


        if (createCustomerRequest.getIdentificationCardSeriesCode() != null) {
            ProcessParameterValueBean identificationCardSeriesCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean identificationCardSeriesCode = new ProcessParameterInputValueBean();
            identificationCardSeriesCode.setValues(new String[]{createCustomerRequest.getIdentificationCardSeriesCode()});
            identificationCardSeriesCodeProcessParameterValueBean.setParameterValue(identificationCardSeriesCode);
            identificationCardSeriesCodeProcessParameterValueBean.setParameterId("IdentificationCardSeriesCode");
            processParameterValueBeans.add(identificationCardSeriesCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getIssueCityCode() != null) {
            ProcessParameterValueBean issueCityCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean issueCityCode = new ProcessParameterInputValueBean();
            issueCityCode.setValues(new String[]{createCustomerRequest.getIssueCityCode()});
            issueCityCodeProcessParameterValueBean.setParameterValue(issueCityCode);
            issueCityCodeProcessParameterValueBean.setParameterId("IssueCityCode");
            processParameterValueBeans.add(issueCityCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getReligionCode() != null) {
            ProcessParameterValueBean religionCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean religionCode = new ProcessParameterInputValueBean();
            religionCode.setValues(new String[]{createCustomerRequest.getReligionCode()});
            religionCodeProcessParameterValueBean.setParameterValue(religionCode);
            religionCodeProcessParameterValueBean.setParameterId("ReligionCode");
            processParameterValueBeans.add(religionCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getGradeCode() != null) {
            ProcessParameterValueBean gradeCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean gradeCode = new ProcessParameterInputValueBean();
            gradeCode.setValues(new String[]{createCustomerRequest.getGroupCode()});
            gradeCodeProcessParameterValueBean.setParameterValue(gradeCode);
            gradeCodeProcessParameterValueBean.setParameterId("GradeCode");
            processParameterValueBeans.add(gradeCodeProcessParameterValueBean);
        }

        if (createCustomerRequest.getTitleCode() != null) {
            ProcessParameterValueBean titleCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean titleCode = new ProcessParameterInputValueBean();
            titleCode.setValues(new String[]{createCustomerRequest.getTitleCode()});
            titleCodeProcessParameterValueBean.setParameterValue(titleCode);
            titleCodeProcessParameterValueBean.setParameterId("TitleCode");
            processParameterValueBeans.add(titleCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getNamePrefixCode() != null) {
            ProcessParameterValueBean namePrefixCodeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean namePrefixCode = new ProcessParameterInputValueBean();
            namePrefixCode.setValues(new String[]{createCustomerRequest.getNamePrefixCode()});
            namePrefixCodeProcessParameterValueBean.setParameterValue(namePrefixCode);
            namePrefixCodeProcessParameterValueBean.setParameterId("NamePrefixCode");
            processParameterValueBeans.add(namePrefixCodeProcessParameterValueBean);
        }


        if (createCustomerRequest.getMarried() != null) {
            ProcessParameterValueBean marriedProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean married = new ProcessParameterInputValueBean();
            married.setValues(new String[]{createCustomerRequest.getMarried()});
            marriedProcessParameterValueBean.setParameterValue(married);
            marriedProcessParameterValueBean.setParameterId("Married");
            processParameterValueBeans.add(marriedProcessParameterValueBean);
        }


        if (createCustomerRequest.getHomeOwnerShipStatus() != null) {
            ProcessParameterValueBean homeOwnerShipStatusProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean homeOwnerShipStatus = new ProcessParameterInputValueBean();
            homeOwnerShipStatus.setValues(new String[]{createCustomerRequest.getHomeOwnerShipStatus()});
            homeOwnerShipStatusProcessParameterValueBean.setParameterValue(homeOwnerShipStatus);
            homeOwnerShipStatusProcessParameterValueBean.setParameterId("HomeOwnerShipStatus");
            processParameterValueBeans.add(homeOwnerShipStatusProcessParameterValueBean);
        }


        if (createCustomerRequest.getMobileNumber() != null) {
            ProcessParameterValueBean mobileNumberProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean mobileNumber = new ProcessParameterInputValueBean();
            mobileNumber.setValues(new String[]{createCustomerRequest.getMobileNumber()});
            mobileNumberProcessParameterValueBean.setParameterValue(mobileNumber);
            mobileNumberProcessParameterValueBean.setParameterId("MobileNumber");
            processParameterValueBeans.add(mobileNumberProcessParameterValueBean);
        }


        if (createCustomerRequest.getIncomeRange() != null) {
            ProcessParameterValueBean incomeRangeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean incomeRange = new ProcessParameterInputValueBean();
            incomeRange.setValues(new String[]{createCustomerRequest.getIncomeRange()});
            incomeRangeProcessParameterValueBean.setParameterValue(incomeRange);
            incomeRangeProcessParameterValueBean.setParameterId("IncomeRange");
            processParameterValueBeans.add(incomeRangeProcessParameterValueBean);
        }


        if (createCustomerRequest.getHomeAreaRange() != null) {
            ProcessParameterValueBean homeAreaRangeProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean homeAreaRange = new ProcessParameterInputValueBean();
            homeAreaRange.setValues(new String[]{createCustomerRequest.getHomeAreaRange()});
            homeAreaRangeProcessParameterValueBean.setParameterValue(homeAreaRange);
            homeAreaRangeProcessParameterValueBean.setParameterId("HomeAreaRange");
            processParameterValueBeans.add(homeAreaRangeProcessParameterValueBean);
        }


        if (createCustomerRequest.getHeirloomValue() != null) {
            ProcessParameterValueBean heirloomValueProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean heirloomValue = new ProcessParameterInputValueBean();
            heirloomValue.setValues(new String[]{createCustomerRequest.getHeirloomValue()});
            heirloomValueProcessParameterValueBean.setParameterValue(heirloomValue);
            heirloomValueProcessParameterValueBean.setParameterId("HeirloomValue");
            processParameterValueBeans.add(heirloomValueProcessParameterValueBean);
        }


        if (createCustomerRequest.getImages() != null) {
            ProcessParameterValueBean imagesProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean images = new ProcessParameterInputValueBean();
            images.setValues(new String[]{createCustomerRequest.createImagesJson()});
            imagesProcessParameterValueBean.setParameterValue(images);
            imagesProcessParameterValueBean.setParameterId("Images");
            processParameterValueBeans.add(imagesProcessParameterValueBean);
        }

        if (createCustomerRequest.getRealtyValue() != null) {
            ProcessParameterValueBean realtyValueProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean realtyValue = new ProcessParameterInputValueBean();
            realtyValue.setValues(new String[]{createCustomerRequest.getRealtyValue()});
            realtyValueProcessParameterValueBean.setParameterValue(realtyValue);
            realtyValueProcessParameterValueBean.setParameterId("RealtyValue");
            processParameterValueBeans.add(realtyValueProcessParameterValueBean);
        }

        if (createCustomerRequest.getAddress() != null) {
            ProcessParameterValueBean addressesProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean addresses = new ProcessParameterInputValueBean();
            addresses.setValues(new String[]{createCustomerRequest.createAddressJson()});
            addressesProcessParameterValueBean.setParameterValue(addresses);
            addressesProcessParameterValueBean.setParameterId("Addresses");
            processParameterValueBeans.add(addressesProcessParameterValueBean);
        }

        if (createCustomerRequest.getJobs() != null) {
            ProcessParameterValueBean jobsProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean jobs = new ProcessParameterInputValueBean();
            jobs.setValues(new String[]{createCustomerRequest.createJobsJson()});
            jobsProcessParameterValueBean.setParameterValue(jobs);
            jobsProcessParameterValueBean.setParameterId("Jobs");
            processParameterValueBeans.add(jobsProcessParameterValueBean);
        }


        ProcessParameterValueBean[] parameterValueBeans = new ProcessParameterValueBean[processParameterValueBeans.size()];
        processParameterValueBeans.toArray(parameterValueBeans);
        return parameterValueBeans;
    }

    public static ProcessParameterValueBean[] initOpenDepositProcessParameter(OpenDepositRequest openDepositRequest) {

        ProcessParameterValueBean[] processParameterValueBeans = new ProcessParameterValueBean[1];

        ProcessParameterValueBean jsonInputProcessParameterValueBean = new ProcessParameterValueBean();
        ProcessParameterInputValueBean jsonInput = new ProcessParameterInputValueBean();
        jsonInput.setValues(new String[]{openDepositRequest.toJson()});
        jsonInputProcessParameterValueBean.setParameterValue(jsonInput);
        jsonInputProcessParameterValueBean.setParameterId("v_jsonInput");
        processParameterValueBeans[0] = jsonInputProcessParameterValueBean;

        return processParameterValueBeans;
    }

    public static ProcessParameterValueBean[] initRtgsProcessParameter(UnlimitedRtgsTransferRequest unlimitedRtgsTransferRequest) {

        List<ProcessParameterValueBean> processParameterValueBeans = new ArrayList<>();

        if (unlimitedRtgsTransferRequest.getMethode() != null) {
            ProcessParameterValueBean methodProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean method = new ProcessParameterInputValueBean();
            method.setValues(new String[]{unlimitedRtgsTransferRequest.getMethode()});
            methodProcessParameterValueBean.setParameterValue(method);
            methodProcessParameterValueBean.setParameterId("method");
            processParameterValueBeans.add(methodProcessParameterValueBean);
        }

        if (unlimitedRtgsTransferRequest.getSourceDepositNumber() != null) {
            ProcessParameterValueBean depositProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean deposit = new ProcessParameterInputValueBean();
            deposit.setValues(new String[]{unlimitedRtgsTransferRequest.getSourceDepositNumber()});
            depositProcessParameterValueBean.setParameterValue(deposit);
            depositProcessParameterValueBean.setParameterId("deposit");
            processParameterValueBeans.add(depositProcessParameterValueBean);
        }

        if (unlimitedRtgsTransferRequest.getCif() != null) {
            ProcessParameterValueBean cifProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean cif = new ProcessParameterInputValueBean();
            cif.setValues(new String[]{unlimitedRtgsTransferRequest.getCif()});
            cifProcessParameterValueBean.setParameterValue(cif);
            cifProcessParameterValueBean.setParameterId("cif");
            processParameterValueBeans.add(cifProcessParameterValueBean);
        }

        if (unlimitedRtgsTransferRequest.getAmountString() != null) {
            ProcessParameterValueBean amountProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean amount = new ProcessParameterInputValueBean();
            amount.setValues(new String[]{unlimitedRtgsTransferRequest.getAmountString()});
            amountProcessParameterValueBean.setParameterValue(amount);
            amountProcessParameterValueBean.setParameterId("amount");
            processParameterValueBeans.add(amountProcessParameterValueBean);
        }


        if (unlimitedRtgsTransferRequest.getCreditorName() != null) {
            ProcessParameterValueBean creditorNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean creditorName = new ProcessParameterInputValueBean();
            creditorName.setValues(new String[]{unlimitedRtgsTransferRequest.getCreditorName()});
            creditorNameProcessParameterValueBean.setParameterValue(creditorName);
            creditorNameProcessParameterValueBean.setParameterId("creditorName");
            processParameterValueBeans.add(creditorNameProcessParameterValueBean);
        }

        if (unlimitedRtgsTransferRequest.getCreditorLastName() != null) {
            ProcessParameterValueBean creditorLastNameProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean creditorLastName = new ProcessParameterInputValueBean();
            creditorLastName.setValues(new String[]{unlimitedRtgsTransferRequest.getCreditorLastName()});
            creditorLastNameProcessParameterValueBean.setParameterValue(creditorLastName);
            creditorLastNameProcessParameterValueBean.setParameterId("CreditorLastName");
            processParameterValueBeans.add(creditorLastNameProcessParameterValueBean);
        }

        if (unlimitedRtgsTransferRequest.getDestinationIban() != null) {
            ProcessParameterValueBean ibanProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean iban = new ProcessParameterInputValueBean();
            iban.setValues(new String[]{unlimitedRtgsTransferRequest.getDestinationIban()});
            ibanProcessParameterValueBean.setParameterValue(iban);
            ibanProcessParameterValueBean.setParameterId("iban");
            processParameterValueBeans.add(ibanProcessParameterValueBean);
        }

        if (unlimitedRtgsTransferRequest.getReasonCode() != null) {
            ProcessParameterValueBean transferReasonProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean transferReason = new ProcessParameterInputValueBean();
            transferReason.setValues(new String[]{unlimitedRtgsTransferRequest.getReasonCode()});
            transferReasonProcessParameterValueBean.setParameterValue(transferReason);
            transferReasonProcessParameterValueBean.setParameterId("transferReason");
            processParameterValueBeans.add(transferReasonProcessParameterValueBean);
        }

        if (unlimitedRtgsTransferRequest.getSignersCif() != null) {
            ProcessParameterValueBean signersProcessParameterValueBean = new ProcessParameterValueBean();
            ProcessParameterInputValueBean signers = new ProcessParameterInputValueBean();
            String signersCif = String.valueOf(unlimitedRtgsTransferRequest.getSignersCif());
            signers.setValues(new String[]{signersCif});
            signersProcessParameterValueBean.setParameterValue(signers);
            signersProcessParameterValueBean.setParameterId("signers");
            processParameterValueBeans.add(signersProcessParameterValueBean);
        }

        ProcessParameterValueBean[] parameterValueBeans = new ProcessParameterValueBean[processParameterValueBeans.size()];
        processParameterValueBeans.toArray(parameterValueBeans);
        return parameterValueBeans;
    }


    public static OpenDepositInfoDto mapToOpenDepositInfo(String outputJson) {

        OpenDepositInfoDto depositInfoDto = new OpenDepositInfoDto();
        ObjectMapper mapper = new ObjectMapper();
        try {
            depositInfoDto = mapper.readValue(outputJson, OpenDepositInfoDto.class);
        } catch (JsonProcessingException e) {
            CommonUtil.logError(YaghutMapper.class.getSimpleName(), "mapToOpenDepositInfo", e.getMessage());
        } catch (IOException e) {
            CommonUtil.logError(YaghutMapper.class.getSimpleName(), "mapToOpenDepositInfo", e.getMessage());
        }
        return depositInfoDto;
    }

    public static CustomerInfoResponse mapToCustomerInfo(UserResponseBean userResponseBean) {

        CustomerInfoResponse customerInfoResponse = new CustomerInfoResponse();
        customerInfoResponse.setCif(userResponseBean.getCif());
        customerInfoResponse.setFullName(userResponseBean.getName());
        customerInfoResponse.setIdentityCode(userResponseBean.getCode());
        customerInfoResponse.setGender(Gender.get(userResponseBean.getGender().getValue()));
        customerInfoResponse.setLatinName(userResponseBean.getForeignName());
        return customerInfoResponse;
    }

    public static CustomerInfoDetailResponse mapToCustomerInfoDetail(CustomrerDetailResponseBean customrerDetailResponseBean) {

        CustomerInfoDetailResponse customerInfoDetailResponse = new CustomerInfoDetailResponse();
        customerInfoDetailResponse.setFirstName(customrerDetailResponseBean.getFirstName());
        customerInfoDetailResponse.setLastName(customrerDetailResponseBean.getLastName());
        customerInfoDetailResponse.setFullName(customrerDetailResponseBean.getName());
        customerInfoDetailResponse.setLatinFirstName(customrerDetailResponseBean.getLatinFirstName());
        customerInfoDetailResponse.setLatinLastName(customrerDetailResponseBean.getLatinLastName());
        customerInfoDetailResponse.setFatherName(customrerDetailResponseBean.getFatherName());
        customerInfoDetailResponse.setLatinFatherName(customrerDetailResponseBean.getFatherLatinName());
        customerInfoDetailResponse.setCif(customrerDetailResponseBean.getCif());
        customerInfoDetailResponse.setIdentityCode(customrerDetailResponseBean.getCode());
        customerInfoDetailResponse.setMobileNumber(customrerDetailResponseBean.getMobile());
        customerInfoDetailResponse.setCertificateNumber(customrerDetailResponseBean.getSsn());
        customerInfoDetailResponse.setCertificateSerial(customrerDetailResponseBean.getCertificateSerial());
        customerInfoDetailResponse.setCertificateSeries(customrerDetailResponseBean.getCertificateSeries());

        if (customrerDetailResponseBean.getCertificateSeries() != null) {
            customerInfoDetailResponse.setNumberCertificateSeries(
                    customrerDetailResponseBean.getCertificateSeries()
            );
        }

        if (customrerDetailResponseBean.getCertificateSeries() != null) {
            customerInfoDetailResponse.setAlphabetCertificateSeries(
                    customrerDetailResponseBean.getCertificateSeries()
            );
        }

        customerInfoDetailResponse.setBirthLocation(customerInfoDetailResponse.getBirthLocation());
        customerInfoDetailResponse.setBirthLocationCode(customrerDetailResponseBean.getBirthLocationCode());
        customerInfoDetailResponse.setBirthDate(YaghutUtil.CalenderToLocalDateTime(customrerDetailResponseBean.getBirthDate()));
        customerInfoDetailResponse.setGender(Gender.get(customrerDetailResponseBean.getGender().getValue()));
        List<Address> addresses = new ArrayList<>();
        Address address;

        for (int i = 0; i < customrerDetailResponseBean.getAddresses().length; i++) {
            AddressBean addressBean = customrerDetailResponseBean.getAddresses(i);
            address = new Address();
            address.setAddressType(addressBean.getAddressType().getValue());
            address.setPostalCode(addressBean.getPostalCode());
            address.setPostalAddress(addressBean.getPostalAddress());
            address.setPhoneNumber(addressBean.getPhoneNumber());
            address.setFax(addressBean.getFaxNumber());
            address.setEmail(addressBean.getEmail());
            addresses.add(address);
        }
        customerInfoDetailResponse.setAddresses(addresses);

        return customerInfoDetailResponse;
    }

    public static DepositDto mapToDepositDto(DepositBean depositBean) {

        DepositDto depositDto = new DepositDto();

        depositDto.setDepositNumber(depositBean.getDepositNumber());
        depositDto.setDepositTitle(depositBean.getDepositTitle());
        depositDto.setIban(depositBean.getIbanNumber());
        depositDto.setBalance(depositBean.getBalance());
        depositDto.setAvailableBalance(depositBean.getAvailableBalance());
        depositDto.setBlockedBalance(depositBean.getBlockedAmount());
        depositDto.setExtraAvailableBalance(depositBean.getExtraAvailableBalance());
        depositDto.setMaximumBalance(depositBean.getMaximumBalance());
        depositDto.setMinimumBalance(depositBean.getMinimumBalance());
        depositDto.setMinAmountForInterestInclusion(depositBean.getMinAmountForInterestInclusion());
        depositDto.setCurrency(Currency.get(depositBean.getCurrency()));
        depositDto.setDepositType(DepositType.get(depositBean.getGroup().getValue()));
        depositDto.setDepositOwnerType(DepositOwnerType.get(depositBean.getOwner().getValue()));
        depositDto.setDepositStatus(DepositStatus.get(depositBean.getDepositStatus().getValue()));
        depositDto.setPersonalityType(DepositPersonalityType.get(depositBean.getPersonality().getValue()));
        depositDto.setSignatureStatus(SignatureStatus.get(depositBean.getSignature().getValue()));
        depositDto.setDepositWithdrawalOption(DepositWithdrawalOption.get(depositBean.getWithdrawalOption().getValue()));
        depositDto.setBranchCode(depositBean.getBranchCode());
        depositDto.setInaugurationDate(depositBean.getInaugurationDate() != null ? YaghutUtil.CalenderToLocalDateTime(depositBean.getInaugurationDate()) : null);
        depositDto.setExpireDate(depositBean.getExpireDate() != null ? YaghutUtil.CalenderToLocalDateTime(depositBean.getExpireDate()) : null);
        depositDto.setPersianInaugurationDate(depositDto.getInaugurationDate() != null ? CommonUtil.convertToPersianDate(depositDto.getInaugurationDate()) : null);
        depositDto.setPersianExpireDate(depositDto.getExpireDate() != null ? CommonUtil.convertToPersianDate(depositDto.getExpireDate()) : null);
        depositDto.setSupportDepositNumber(depositBean.getSupportDepositNumber());
        depositDto.setSupportDepositStatus(depositBean.getSupportDepositStatus() != null ? DepositStatus.get(depositBean.getSupportDepositStatus().getValue()) : null);
        depositDto.setSupportStatus(depositBean.getSupportStatus() != null ? DepositSupportStatus.get(depositBean.getSupportStatus().getValue()) : null);
        depositDto.setSupportCurrency(Currency.get(depositBean.getCurrency()));
        depositDto.setCreditDeposit(depositBean.getCreditDeposit());
        depositDto.setCreditRemainAmount(depositBean.getCreditRemainAmount());
        depositDto.setCreditLoanRemainAmount(depositBean.getCreditLoanRemainAmount());
        depositDto.setCreditRateAmount(depositBean.getCreditRateAmount());

        return depositDto;
    }

    public static StatementDto mapToStatementDto(StatementBean statementBean) {

        StatementDto statementDto = new StatementDto();
        statementDto.setAmount(statementBean.getTransferAmount());
        statementDto.setBalance(statementBean.getBalance());
        statementDto.setTransactionDate(YaghutUtil.CalenderToLocalDateTime(statementBean.getDate()));
        statementDto.setPersianDate(CommonUtil.convertToPersianDateTime(statementDto.getTransactionDate()));
        statementDto.setDescription(statementBean.getDescription());
        statementDto.setReferenceNumber(statementBean.getReferenceNumber());
        statementDto.setSerial(String.valueOf(statementBean.getSerial()));
        statementDto.setSerialNumber(statementBean.getSerialNumber());
        statementDto.setPaymentId(statementBean.getPaymentId());
        statementDto.setStatementId(statementBean.getStatementId());
        statementDto.setRegistrationNumber(String.valueOf(statementBean.getSerialNumber()));
        statementDto.setBranchCode(statementBean.getBranchCode());
        statementDto.setBranchName(statementBean.getBranchName());
        statementDto.setAgentBranchCode(statementBean.getAgentBranchCode());
        statementDto.setAgentBranchName(statementBean.getBranchName());

        return statementDto;
    }

    public static BankCardDto mapToBankCardDto(CardBean cardBean) {
        BankCardDto bankCardDto = new BankCardDto();
        bankCardDto.setPan(cardBean.getPan());
        bankCardDto.setIssueDate(YaghutUtil.CalenderToLocalDateTime(cardBean.getIssueDate()));
        bankCardDto.setExpireDate(YaghutUtil.CalenderToLocalDateTime(cardBean.getExpireDate()));
        bankCardDto.setPersianExpireDate(CommonUtil.convertToPersianDateTime(bankCardDto.getExpireDate()).substring(2, 7).replace("/", ""));
        bankCardDto.setDepositNumber(cardBean.getDepositNumber());
        bankCardDto.setCustomerFirstName(cardBean.getCustomerFirstName());
        bankCardDto.setCustomerLastname(cardBean.getCustomerLastName());
        bankCardDto.setCardType(com.rahand.sina.integration.domain.bank.enums.CardType.get(cardBean.getCardType().getValue()));
        bankCardDto.setCardStatus(com.rahand.sina.integration.domain.bank.enums.CardStatus.get(cardBean.getCardStatus().getValue()));
        return bankCardDto;
    }

    public static LoanDto mapToLoanDto(LoanBean loanBean) {

        return LoanDto.builder()
                .loanNumber(loanBean.getLoanNumber())
                .cbLoanNumber(loanBean.getCbLoanNumber())
                .loanStatus(LoanStatus.get(loanBean.getStatus().getValue()))
                .loanType(LoanType.get(loanBean.getType()))
                .amount(loanBean.getAmount())
                .installmentCount(loanBean.getPayNumber().intValue())
                .preAmount(loanBean.getPreAmount())
                .beginDate(YaghutUtil.CalenderToLocalDateTime(loanBean.getBeginDate()))
                .persianBeginDate(CommonUtil.convertToPersianDate(YaghutUtil.CalenderToLocalDateTime(loanBean.getBeginDate())))
                .endDate(YaghutUtil.CalenderToLocalDateTime(loanBean.getEndDate()))
                .persianEndDate(CommonUtil.convertToPersianDate(YaghutUtil.CalenderToLocalDateTime(loanBean.getEndDate())))
                .loanRemainder(loanBean.getLoanRemainder())
                .currency(Currency.get(loanBean.getCurrency()))
                .branchCode(loanBean.getBranchCode())
                .branchName(loanBean.getBranchName())
                .build();

    }

    public static LoanDto mapToLoanDto(LoanListBean loanListBean) {

        return LoanDto.builder()
                .loanNumber(loanListBean.getLoanNumber())
                .cbLoanNumber(loanListBean.getCbLoanNumber())
                .loanStatus(LoanStatus.get(loanListBean.getStates().getValue()))
                .loanType(LoanType.get(loanListBean.getType()))
                .amount(loanListBean.getAmount())
                .installmentCount(loanListBean.getPayNumber().intValue())
                .preAmount(loanListBean.getPreAmount())
                .beginDate(YaghutUtil.CalenderToLocalDateTime(loanListBean.getBeginDate()))
                .persianBeginDate(CommonUtil.convertToPersianDate(YaghutUtil.CalenderToLocalDateTime(loanListBean.getBeginDate())))
                .endDate(YaghutUtil.CalenderToLocalDateTime(loanListBean.getEndDate()))
                .persianEndDate(CommonUtil.convertToPersianDate(YaghutUtil.CalenderToLocalDateTime(loanListBean.getEndDate())))
                .loanRemainder(loanListBean.getLoanRemainder())
                .currency(Currency.get(loanListBean.getCurrency()))
                .branchCode(loanListBean.getBranchCode())
                .branchName(loanListBean.getBranchName())
                .build();

    }

    public static CardTransactionDto mapToCardTransactionDto(CardTransactionResponseBean cardTransactionResponseBean) {

        CardTransactionDto cardTransactionDto = new CardTransactionDto();

        cardTransactionDto.setAmount(cardTransactionResponseBean.getAmount());
        cardTransactionDto.setPan(cardTransactionResponseBean.getPan());
        cardTransactionDto.setDescription(cardTransactionResponseBean.getDescription());
        cardTransactionDto.setTransactionDate(YaghutUtil.CalenderToLocalDateTime(cardTransactionResponseBean.getTransactionDate()));
        cardTransactionDto.setPersianTransactionDate(CommonUtil.convertToPersianDateTime(cardTransactionDto.getTransactionDate()));
        cardTransactionDto.setTransactionSentDate(YaghutUtil.CalenderToLocalDateTime(cardTransactionResponseBean.getTransactionSentDate()));
        cardTransactionDto.setPersianTransactionSentDate(CommonUtil.convertToPersianDateTime(cardTransactionDto.getTransactionSentDate()));
        cardTransactionDto.setIssuerNumber(cardTransactionResponseBean.getIssuerNumber());
        cardTransactionDto.setIssuerName(cardTransactionResponseBean.getOpponentIssuerName());
        cardTransactionDto.setOpponentIssuerName(cardTransactionResponseBean.getOpponentIssuerName());
        cardTransactionDto.setOpponentIssuerNumber(cardTransactionResponseBean.getOpponentIssuerNumber());
        cardTransactionDto.setOpponentDepositNumber(cardTransactionResponseBean.getOpponentDepositNumber());
        cardTransactionDto.setOpponentPan(cardTransactionResponseBean.getOpponentPan());
        cardTransactionDto.setReferenceNumber(cardTransactionResponseBean.getReferenceNumber());
        cardTransactionDto.setTraceNumber(cardTransactionResponseBean.getTraceNumber());
        cardTransactionDto.setCardTransactionType(cardTransactionResponseBean.getTransactionType() != null ?
                CardTransactionType.get(cardTransactionResponseBean.getTransactionType().getValue()) : CardTransactionType.UNKNOWN);
        cardTransactionDto.setCardActivityType(cardTransactionResponseBean.getActivityType() != null ?
                CardActivityType.get(cardTransactionResponseBean.getActivityType().getValue()) : CardActivityType.UNKNOWN);

        return cardTransactionDto;
    }

}
