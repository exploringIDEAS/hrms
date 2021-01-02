package com.ralien.erp_system.employee.dto;

import java.util.ArrayList;
import java.util.List;

public class GetAllDeptResp {
    private List<GetDeptResp> departments;

    public GetAllDeptResp() {
        departments = new ArrayList<>();
    }

    public List<GetDeptResp> getDepartments() {
        return departments;
    }

    public void setDepartments(List<GetDeptResp> departments) {
        this.departments = departments;
    }
}
