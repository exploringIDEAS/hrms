package com.ralien.erp_system.employee.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ralien.erp_system.employee.util.Gender;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddNewEmployeeReq {
    @NotBlank
    @Length(max=30)
    private String username;
    @NotBlank
    @Length(max=30)
    private String firstName;
    @NotBlank
    @Length(max=20)
    private String lastName;
    @NotNull
    private Gender gender;
    @NotBlank
    @Length(max=30)
    private String email;
    private Date hireDate;
    private long mobile;
    private long altMobile;
    private short deptId;
    private short designationId;
    private int compensationId;
    @NotBlank
    @Length(max=400)
    private String currAddress;
    private int currZipcode;
    @NotBlank
    @Length(max=30)
    private String currCountry;
    @NotBlank
    @Length(max=400)
    private String permAddress;
    private int permZipcode;
    @NotBlank
    @Length(max=30)
    private String permCountry;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public long getAltMobile() {
        return altMobile;
    }

    public void setAltMobile(long altMobile) {
        this.altMobile = altMobile;
    }

    public short getDeptId() {
        return deptId;
    }

    public void setDeptId(short deptId) {
        this.deptId = deptId;
    }

    public short getDesignationId() {
        return designationId;
    }

    public void setDesignationId(short designationId) {
        this.designationId = designationId;
    }

    public int getCompensationId() {
        return compensationId;
    }

    public void setCompensationId(int compensationId) {
        this.compensationId = compensationId;
    }

    public String getCurrAddress() {
        return currAddress;
    }

    public void setCurrAddress(String currAddress) {
        this.currAddress = currAddress;
    }

    public int getCurrZipcode() {
        return currZipcode;
    }

    public void setCurrZipcode(int currZipcode) {
        this.currZipcode = currZipcode;
    }

    public String getCurrCountry() {
        return currCountry;
    }

    public void setCurrCountry(String currCountry) {
        this.currCountry = currCountry;
    }

    public String getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }

    public int getPermZipcode() {
        return permZipcode;
    }

    public void setPermZipcode(int permZipcode) {
        this.permZipcode = permZipcode;
    }

    public String getPermCountry() {
        return permCountry;
    }

    public void setPermCountry(String permCountry) {
        this.permCountry = permCountry;
    }

    @Override
    public String toString() {
        return "AddNewEmployeeReq{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", hireDate=" + hireDate +
                ", mobile=" + mobile +
                ", altMobile=" + altMobile +
                ", deptId=" + deptId +
                ", designationId=" + designationId +
                ", compensationId=" + compensationId +
                ", currAddress='" + currAddress + '\'' +
                ", currZipcode=" + currZipcode +
                ", currCountry='" + currCountry + '\'' +
                ", permAddress='" + permAddress + '\'' +
                ", permZipcode=" + permZipcode +
                ", permCountry='" + permCountry + '\'' +
                '}';
    }
}
