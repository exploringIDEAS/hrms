package com.ralien.erp_system.employee.dto;

import com.ralien.erp_system.employee.entities.Employee;
import com.ralien.erp_system.employee.util.Gender;

import java.util.Date;
import java.util.UUID;

public class GetEmpResp {
    private int empId;
    private UUID userId;
    private Date dob;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private Date hireDate;
    private long mobile;
    private long altMobile;
    private String department;
    private String designation;
    private String currAddress;
    private int currZipcode;
    private String currCountry;
    private String permAddress;
    private int permZipcode;
    private String permCountry;

    public GetEmpResp() {}

    public GetEmpResp(Employee emp) {
        empId = emp.getId();
        userId = emp.getUserId();
        dob = emp.getDob();
        firstName = emp.getFirstName();
        lastName = emp.getLastName();
        gender = emp.getGender();
        email = emp.getEmail();
        hireDate = emp.getHireDate();
        mobile = emp.getMobile();
        altMobile = emp.getAltMobile();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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
        return "GetEmpResp{" +
                "empId=" + empId +
                ", userId=" + userId +
                ", dob=" + dob +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", hireDate=" + hireDate +
                ", mobile=" + mobile +
                ", altMobile=" + altMobile +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", currAddress='" + currAddress + '\'' +
                ", currZipcode=" + currZipcode +
                ", currCountry='" + currCountry + '\'' +
                ", permAddress='" + permAddress + '\'' +
                ", permZipcode=" + permZipcode +
                ", permCountry='" + permCountry + '\'' +
                '}';
    }
}
