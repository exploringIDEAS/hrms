package com.ralien.erp_system.employee.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetDeptResp {
    private short deptId;
    private String deptTitle;

    public GetDeptResp() {}

    public GetDeptResp(short deptId, String deptTitle) {
        this.deptId = deptId;
        this.deptTitle = deptTitle;
    }

    public short getDeptId() {
        return deptId;
    }

    public void setDeptId(short deptId) {
        this.deptId = deptId;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }
}
