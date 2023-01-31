package com.rahand.sina.integration.domain.bank.dto;

import com.rahand.common.dto.BaseResponse;
import com.rahand.common.enums.Gender;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;


public class CustomerInfoDetailResponse extends BaseResponse {

  private String cif;
  private String identityCode;
  private String mobileNumber;
  private String firstName;
  private String lastName;
  private String fullName;
  private String fatherName;
  private String latinFirstName;
  private String latinLastName;
  private String latinFatherName;
  private String certificateNumber;
  private String certificateSerial;
  private String certificateSeries;
  private String numberCertificateSeries;
  private String alphabetCertificateSeries;
  private String birthLocation;
  private String birthLocationCode;
  private LocalDateTime birthDate;
  private Gender gender;
  private List<Address> addresses;

  public CustomerInfoDetailResponse() {
  }

  @Builder
  public CustomerInfoDetailResponse(boolean error, String errorMessage, String extraErrorData, boolean sessionExpired, String extraInfo, String cif, String identityCode, String mobileNumber, String firstName, String lastName, String fullName, String fatherName, String latinFirstName, String latinLastName, String latinFatherName, String certificateNumber, String certificateSerial, String certificateSeries, String numberCertificateSeries, String alphabetCertificateSeries, String birthLocation, String birthLocationCode, LocalDateTime birthDate, Gender gender, List<Address> addresses) {
    super(error, errorMessage, extraErrorData, sessionExpired, extraInfo);
    this.cif = cif;
    this.identityCode = identityCode;
    this.mobileNumber = mobileNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = fullName;
    this.fatherName = fatherName;
    this.latinFirstName = latinFirstName;
    this.latinLastName = latinLastName;
    this.latinFatherName = latinFatherName;
    this.certificateNumber = certificateNumber;
    this.certificateSerial = certificateSerial;
    this.certificateSeries = certificateSeries;
    this.numberCertificateSeries = numberCertificateSeries;
    this.alphabetCertificateSeries = alphabetCertificateSeries;
    this.birthLocation = birthLocation;
    this.birthLocationCode = birthLocationCode;
    this.birthDate = birthDate;
    this.gender = gender;
    this.addresses = addresses;
  }

  public String getCif() {
    return cif;
  }

  public void setCif(String cif) {
    this.cif = cif;
  }

  public String getIdentityCode() {
    return identityCode;
  }

  public void setIdentityCode(String identityCode) {
    this.identityCode = identityCode;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
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

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
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

  public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public String getCertificateSerial() {
    return certificateSerial;
  }

  public void setCertificateSerial(String certificateSerial) {
    this.certificateSerial = certificateSerial;
  }

  public String getCertificateSeries() {
    return certificateSeries;
  }

  public void setCertificateSeries(String certificateSeries) {
    this.certificateSeries = certificateSeries;
  }

  public String getNumberCertificateSeries() {
    return numberCertificateSeries;
  }

  public void setNumberCertificateSeries(String numberCertificateSeries) {
    this.numberCertificateSeries = numberCertificateSeries;
  }

  public String getAlphabetCertificateSeries() {
    return alphabetCertificateSeries;
  }

  public void setAlphabetCertificateSeries(String alphabetCertificateSeries) {
    this.alphabetCertificateSeries = alphabetCertificateSeries;
  }

  public String getBirthLocation() {
    return birthLocation;
  }

  public void setBirthLocation(String birthLocation) {
    this.birthLocation = birthLocation;
  }

  public String getBirthLocationCode() {
    return birthLocationCode;
  }

  public void setBirthLocationCode(String birthLocationCode) {
    this.birthLocationCode = birthLocationCode;
  }

  public LocalDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}