package com.ralien.erp_system.employee.dto;

import com.ralien.erp_system.employee.entities.Employee;
import com.ralien.erp_system.employee.util.Gender;

import java.util.Date;
import java.util.UUID;

public class EmpResp {
    private int empId;
    private UUID userId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private Date hireDate;
    private Date birthDate;
    private long mobile;
    private long altMobile;
    private String department;
    private String designation;
    private String currAddress;
    private String permAddress;

    public EmpResp() {}

    public EmpResp(Employee emp) {
        empId = emp.getId();
        userId = emp.getUserId();
        birthDate = emp.getBirthDate();
        firstName = emp.getFirstName();
        lastName = emp.getLastName();
        gender = emp.getGender();
        email = emp.getEmail();
        hireDate = emp.getHireDate();
        mobile = emp.getMobile();
        altMobile = emp.getAltMobile();
        department = emp.getDepartment().getTitle();
        designation = emp.getDesignation().getTitle();
        currAddress = emp.getCurrAddress();
        permAddress = emp.getPermAddress();
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPermAddress() {
        return permAddress;
    }

    public void setPermAddress(String permAddress) {
        this.permAddress = permAddress;
    }
}
