package com.ralien.erp_system.employee.dto;

import java.util.ArrayList;
import java.util.List;

public class AllDeptResp {
    private List<DeptResp> departments;

    public AllDeptResp() {
        departments = new ArrayList<>();
    }

    public List<DeptResp> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DeptResp> departments) {
        this.departments = departments;
    }
}
