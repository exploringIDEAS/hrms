package com.ralien.erp_system.employee.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ralien.erp_system.employee.entities.Compensation;
import com.ralien.erp_system.employee.util.UnixDateTimeSerializer;

import java.util.Date;

public class CompensationResp {
    private int id;
    private int basicSalary;
    private int da;
    private int hra;
    private int ca;
    private int lta;
    private int ma;
    private int bpa;
    private int gratuity;
    private int epf;
    private int pt;
    private int perfBonus;
    @JsonSerialize(using = UnixDateTimeSerializer.class)
    private Date createdAt;

    public CompensationResp() {}

    public CompensationResp(Compensation compensation) {
        id = compensation.getId();
        basicSalary = compensation.getBasicSalary();
        da = compensation.getDa();
        hra = compensation.getHra();
        ca = compensation.getCa();
        lta = compensation.getLta();
        ma = compensation.getMa();
        bpa = compensation.getBpa();
        gratuity = compensation.getGratuity();
        epf = compensation.getEpf();
        pt = compensation.getPt();
        perfBonus = compensation.getPerfBonus();
        createdAt = compensation.getCreatedAt();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
