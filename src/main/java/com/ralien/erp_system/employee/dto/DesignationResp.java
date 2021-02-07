package com.ralien.erp_system.employee.dto;

public class DesignationResp {
    private int id;
    private String designationTitle;
    private int grade;

    public DesignationResp() {}

    public DesignationResp(int id, String designationTitle, int grade) {
        this.id = id;
        this.designationTitle = designationTitle;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignationTitle() {
        return designationTitle;
    }

    public void setDesignationTitle(String designationTitle) {
        this.designationTitle = designationTitle;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
