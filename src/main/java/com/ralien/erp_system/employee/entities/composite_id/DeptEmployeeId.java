package com.ralien.erp_system.employee.entities.composite_id;

import java.io.Serializable;

public class DeptEmployeeId implements Serializable {
    private int empId;
    private short deptId;

    public DeptEmployeeId() {}

    public DeptEmployeeId(int empId, short deptId) {
        this.empId = empId;
        this.deptId = deptId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public short getDeptId() {
        return deptId;
    }

    public void setDeptId(short deptId) {
        this.deptId = deptId;
    }
}
