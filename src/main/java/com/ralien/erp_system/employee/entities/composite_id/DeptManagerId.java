package com.ralien.erp_system.employee.entities.composite_id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DeptManagerId implements Serializable {
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "dept_id")
    private int deptId;

    public DeptManagerId() {}

    public DeptManagerId(int empId, int deptId) {
        this.empId = empId;
        this.deptId = deptId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeptManagerId)) return false;
        DeptManagerId that = (DeptManagerId) o;
        return empId == that.empId &&
                deptId == that.deptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, deptId);
    }
}
