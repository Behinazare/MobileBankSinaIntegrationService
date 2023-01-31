package com.rahand.sina.integration.domain.inquiry.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rahand.common.dto.BaseResponse;
import lombok.Builder;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalInfoResponse extends BaseResponse {

    @JsonProperty("nationalCode")
    private String nationalCode;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("serial")
    private String serial;
    @JsonProperty("isSmartImage")
    private boolean isSmartImage;
    @JsonProperty("employeeCode")
    private String employeeCode;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("passsword")
    private String password;
    @JsonProperty("pcode")
    private String pcode;
    @JsonProperty("branchCode")
    private String branchCode;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("name")
    private String name;
    @JsonProperty("family")
    private String family;
    @JsonProperty("fatherName")
    private String fatherName;
    @JsonProperty("isValid")
    private boolean isValid;
    @JsonProperty("shenasnameNo")
    private String shenasnameNo;
    @JsonProperty("shenasnameSeri")
    private String shenasnameSeri;
    @JsonProperty("shenasnameSerial")
    private String shenasnameSerial;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("zipCode_Desc")
    private String zipCode_Desc;
    @JsonProperty("image")
    private String image;
    @JsonProperty("deathDate")
    private String deathDate;
    @JsonProperty("message")
    private String message;
    @JsonProperty("reInquiry")
    private boolean  reInquiry;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("deathStatus")
    private String deathStatus;
    @JsonProperty("zipCodeDesc")
    private String zipCodeDesc;
    @JsonProperty("exceptionMessage")
    private String exceptionMessage;
    @JsonProperty("trackingInfo")
    private String trackingInfo;

    public PersonalInfoResponse() {
    }

    @Builder
    public PersonalInfoResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String nationalCode, String birthDate, String serial, boolean isSmartImage, String employeeCode, String userName, String password, String pcode, String branchCode, String ip, String name, String family, String fatherName, boolean isValid, String shenasnameNo, String shenasnameSeri, String shenasnameSerial, String zipCode, String zipCode_Desc, String image, String deathDate, String message, boolean reInquiry, String gender, String deathStatus, String zipCodeDesc, String exceptionMessage, String trackingInfo) {
        super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
        this.nationalCode = nationalCode;
        this.birthDate = birthDate;
        this.serial = serial;
        this.isSmartImage = isSmartImage;
        this.employeeCode = employeeCode;
        this.userName = userName;
        this.password = password;
        this.pcode = pcode;
        this.branchCode = branchCode;
        this.ip = ip;
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.isValid = isValid;
        this.shenasnameNo = shenasnameNo;
        this.shenasnameSeri = shenasnameSeri;
        this.shenasnameSerial = shenasnameSerial;
        this.zipCode = zipCode;
        this.zipCode_Desc = zipCode_Desc;
        this.image = image;
        this.deathDate = deathDate;
        this.message = message;
        this.reInquiry = reInquiry;
        this.gender = gender;
        this.deathStatus = deathStatus;
        this.zipCodeDesc = zipCodeDesc;
        this.exceptionMessage = exceptionMessage;
        this.trackingInfo = trackingInfo;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public boolean isSmartImage() {
        return isSmartImage;
    }

    public void setSmartImage(boolean smartImage) {
        isSmartImage = smartImage;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getShenasnameNo() {
        return shenasnameNo;
    }

    public void setShenasnameNo(String shenasnameNo) {
        this.shenasnameNo = shenasnameNo;
    }

    public String getShenasnameSeri() {
        return shenasnameSeri;
    }

    public void setShenasnameSeri(String shenasnameSeri) {
        this.shenasnameSeri = shenasnameSeri;
    }

    public String getShenasnameSerial() {
        return shenasnameSerial;
    }

    public void setShenasnameSerial(String shenasnameSerial) {
        this.shenasnameSerial = shenasnameSerial;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode_Desc() {
        return zipCode_Desc;
    }

    public void setZipCode_Desc(String zipCode_Desc) {
        this.zipCode_Desc = zipCode_Desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isReInquiry() {
        return reInquiry;
    }

    public void setReInquiry(boolean reInquiry) {
        this.reInquiry = reInquiry;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeathStatus() {
        return deathStatus;
    }

    public void setDeathStatus(String deathStatus) {
        this.deathStatus = deathStatus;
    }

    public String getZipCodeDesc() {
        return zipCodeDesc;
    }

    public void setZipCodeDesc(String zipCodeDesc) {
        this.zipCodeDesc = zipCodeDesc;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getTrackingInfo() {
        return trackingInfo;
    }

    public void setTrackingInfo(String trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
}
