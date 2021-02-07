package com.ralien.erp_system.employee.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emp_compensation")
public class Compensation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int basicSalary;
    private int da; // dearness allowance
    private int hra; // house rental allowance
    private int ca; // conveyance allowance
    private int lta; // leave travel allowance
    private int ma; // medical allowance
    private int bpa; // Books and Periodicals Allowance
    private int gratuity;
    private int epf; // employer provident fund
    private int pt; // professional tax
    private int perfBonus; // performance bonus
    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    public int getId() {
        return id;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getDa() {
        return da;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public int getHra() {
        return hra;
    }

    public void setHra(int hra) {
        this.hra = hra;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getLta() {
        return lta;
    }

    public void setLta(int lta) {
        this.lta = lta;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getBpa() {
        return bpa;
    }

    public void setBpa(int bpa) {
        this.bpa = bpa;
    }

    public int getGratuity() {
        return gratuity;
    }

    public void setGratuity(int gratuity) {
        this.gratuity = gratuity;
    }

    public int getEpf() {
        return epf;
    }

    public void setEpf(int epf) {
        this.epf = epf;
    }

    public int getPt() {
        return pt;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }

    public int getPerfBonus() {
        return perfBonus;
    }

    public void setPerfBonus(int perfBonus) {
        this.perfBonus = perfBonus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
