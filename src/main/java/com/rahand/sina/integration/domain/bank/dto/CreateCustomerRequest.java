package com.rahand.sina.integration.domain.bank.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahand.common.constant.CommonErrorMessage;
import com.rahand.common.dto.BaseRequest;
import com.rahand.common.enums.Gender;
import com.rahand.common.exception.CustomRuntimeException;
import com.rahand.common.util.CommonUtil;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;


public class CreateCustomerRequest extends BaseRequest {

    private String customerId;
    private String groupCode;
    private String nationalityCode;
    private String firstName;
    private String lastName;
    private String fatherName;
    private LocalDateTime birthDate;
    private String idCardNumber;
    private Gender gender;
    private String latinFirstName;
    private String latinLastName;
    private String latinFatherName;
    private String nationalCode;
    private String regionStatus;
    private String homeRentRange;
    private String bookIdAlphabeticSerie;
    private String bookIdNumericSerie;
    private String bookIdSerial;
    private String birthPlaceCountry;
    private String issueDomainCode;
    private String issueLocationName;
    private String IdentificationCardSeriesCode;
    private String IssueCityCode;
    private String religionCode;
    private String gradeCode;
    private String titleCode;
    private String namePrefixCode;
    private String married;
    private String homeOwnerShipStatus;
    private String mobileNumber;
    private String incomeRange;
    private String homeAreaRange;
    private String heirloomValue;
    private List<CreateCustomerImagesDto> images;
    private String realtyValue;
    private List<CreateCustomerAddressDto> address;
    private List<CreateCustomerJobsDto> jobs;

    public CreateCustomerRequest() {
    }

    @Builder
    public CreateCustomerRequest(String userId, String customerId, String groupCode, String nationalityCode, String firstName, String lastName, String fatherName, LocalDateTime birthDate, String idCardNumber, Gender gender, String latinFirstName, String latinLastName, String latinFatherName, String nationalCode, String regionStatus, String homeRentRange, String bookIdAlphabeticSerie, String bookIdNumericSerie, String bookIdSerial, String birthPlaceCountry, String issueDomainCode, String issueLocationName, String identificationCardSeriesCode, String issueCityCode, String religionCode, String gradeCode, String titleCode, String namePrefixCode, String married, String homeOwnerShipStatus, String mobileNumber, String incomeRange, String homeAreaRange, String heirloomValue, List<CreateCustomerImagesDto> images, String realtyValue, List<CreateCustomerAddressDto> address, List<CreateCustomerJobsDto> jobs) {
        super(userId);
        this.customerId = customerId;
        this.groupCode = groupCode;
        this.nationalityCode = nationalityCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
        this.idCardNumber = idCardNumber;
        this.gender = gender;
        this.latinFirstName = latinFirstName;
        this.latinLastName = latinLastName;
        this.latinFatherName = latinFatherName;
        this.nationalCode = nationalCode;
        this.regionStatus = regionStatus;
        this.homeRentRange = homeRentRange;
        this.bookIdAlphabeticSerie = bookIdAlphabeticSerie;
        this.bookIdNumericSerie = bookIdNumericSerie;
        this.bookIdSerial = bookIdSerial;
        this.birthPlaceCountry = birthPlaceCountry;
        this.issueDomainCode = issueDomainCode;
        this.issueLocationName = issueLocationName;
        IdentificationCardSeriesCode = identificationCardSeriesCode;
        IssueCityCode = issueCityCode;
        this.religionCode = religionCode;
        this.gradeCode = gradeCode;
        this.titleCode = titleCode;
        this.namePrefixCode = namePrefixCode;
        this.married = married;
        this.homeOwnerShipStatus = homeOwnerShipStatus;
        this.mobileNumber = mobileNumber;
        this.incomeRange = incomeRange;
        this.homeAreaRange = homeAreaRange;
        this.heirloomValue = heirloomValue;
        this.images = images;
        this.realtyValue = realtyValue;
        this.address = address;
        this.jobs = jobs;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLatinFirstName() {
        return latinFirstName;
    }

    public void setLatinFirstName(String latinFirstName) {
        this.latinFirstName = latinFirstName;
    }

    public String getLatinLastName() {
        return latinLastName;
    }

    public void setLatinLastName(String latinLastName) {
        this.latinLastName = latinLastName;
    }

    public String getLatinFatherName() {
        return latinFatherName;
    }

    public void setLatinFatherName(String latinFatherName) {
        this.latinFatherName = latinFatherName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getRegionStatus() {
        return regionStatus;
    }

    public void setRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
    }

    public String getHomeRentRange() {
        return homeRentRange;
    }

    public void setHomeRentRange(String homeRentRange) {
        this.homeRentRange = homeRentRange;
    }

    public String getBookIdAlphabeticSerie() {
        return bookIdAlphabeticSerie;
    }

    public void setBookIdAlphabeticSerie(String bookIdAlphabeticSerie) {
        this.bookIdAlphabeticSerie = bookIdAlphabeticSerie;
    }

    public String getBookIdNumericSerie() {
        return bookIdNumericSerie;
    }

    public void setBookIdNumericSerie(String bookIdNumericSerie) {
        this.bookIdNumericSerie = bookIdNumericSerie;
    }

    public String getBookIdSerial() {
        return bookIdSerial;
    }

    public void setBookIdSerial(String bookIdSerial) {
        this.bookIdSerial = bookIdSerial;
    }

    public String getBirthPlaceCountry() {
        return birthPlaceCountry;
    }

    public void setBirthPlaceCountry(String birthPlaceCountry) {
        this.birthPlaceCountry = birthPlaceCountry;
    }

    public String getIssueDomainCode() {
        return issueDomainCode;
    }

    public void setIssueDomainCode(String issueDomainCode) {
        this.issueDomainCode = issueDomainCode;
    }

    public String getIssueLocationName() {
        return issueLocationName;
    }

    public void setIssueLocationName(String issueLocationName) {
        this.issueLocationName = issueLocationName;
    }

    public String getIdentificationCardSeriesCode() {
        return IdentificationCardSeriesCode;
    }

    public void setIdentificationCardSeriesCode(String identificationCardSeriesCode) {
        IdentificationCardSeriesCode = identificationCardSeriesCode;
    }

    public String getIssueCityCode() {
        return IssueCityCode;
    }

    public void setIssueCityCode(String issueCityCode) {
        IssueCityCode = issueCityCode;
    }

    public String getReligionCode() {
        return religionCode;
    }

    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public String getNamePrefixCode() {
        return namePrefixCode;
    }

    public void setNamePrefixCode(String namePrefixCode) {
        this.namePrefixCode = namePrefixCode;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getHomeOwnerShipStatus() {
        return homeOwnerShipStatus;
    }

    public void setHomeOwnerShipStatus(String homeOwnerShipStatus) {
        this.homeOwnerShipStatus = homeOwnerShipStatus;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getIncomeRange() {
        return incomeRange;
    }

    public void setIncomeRange(String incomeRange) {
        this.incomeRange = incomeRange;
    }

    public String getHomeAreaRange() {
        return homeAreaRange;
    }

    public void setHomeAreaRange(String homeAreaRange) {
        this.homeAreaRange = homeAreaRange;
    }

    public String getHeirloomValue() {
        return heirloomValue;
    }

    public void setHeirloomValue(String heirloomValue) {
        this.heirloomValue = heirloomValue;
    }



    public String getRealtyValue() {
        return realtyValue;
    }

    public void setRealtyValue(String realtyValue) {
        this.realtyValue = realtyValue;
    }

    public List<CreateCustomerImagesDto> getImages() {
        return images;
    }

    public void setImages(List<CreateCustomerImagesDto> images) {
        this.images = images;
    }

    public List<CreateCustomerAddressDto> getAddress() {
        return address;
    }

    public void setAddress(List<CreateCustomerAddressDto> address) {
        this.address = address;
    }

    public List<CreateCustomerJobsDto> getJobs() {
        return jobs;
    }

    public void setJobs(List<CreateCustomerJobsDto> jobs) {
        this.jobs = jobs;
    }

    public String createAddressJson() {
        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(this.address);
        } catch (JsonProcessingException e) {
            CommonUtil.logError(getClass().getSimpleName(), "createAddressJson", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }
        return json;
    }

    public String createJobsJson() {
        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(this.jobs);
        } catch (JsonProcessingException e) {
            CommonUtil.logError(getClass().getSimpleName(), "createJobsJson", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }
        return json;
    }

    public String createImagesJson() {
        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(this.images);
        } catch (JsonProcessingException e) {
            CommonUtil.logError(getClass().getSimpleName(), "createImagesJson", e.getMessage());
            throw new CustomRuntimeException(CommonErrorMessage.SERVER_EXCEPTION_MESSAGE);
        }
        return json;
    }

}
