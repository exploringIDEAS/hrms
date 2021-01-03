package com.ralien.erp_system.employee.dto;

import java.util.ArrayList;
import java.util.List;

public class AllEmpResp {
    private List<EmpResp> empRespList;

    public AllEmpResp() {
        empRespList = new ArrayList<>();
    }

    public List<EmpResp> getEmpRespList() {
        return empRespList;
    }

    public void setEmpRespList(List<EmpResp> empRespList) {
        this.empRespList = empRespList;
    }
}
