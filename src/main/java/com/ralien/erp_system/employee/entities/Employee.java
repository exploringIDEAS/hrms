package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.util.Gender;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="employee")
public class Employee extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "BINARY(16)")
    private UUID userId;

    private Date dob;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Date hireDate;
    private long mobile;
    private long altMobile;
    private String currAddress;
    private int currZipcode;
    private String currCountry;
    private String permAddress;
    private int permZipcode;
    private String permCountry;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "designation_id")
    private Designation designation;

    @OneToOne
    @JoinColumn(name = "compensation_id")
    private Compensation compensation;

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }
}
