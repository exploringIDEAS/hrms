package com.ralien.erp_system.employee.entities.composite_id;

import org.springframework.data.domain.Persistable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DeptEmployeeId implements Serializable {
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "dept_id")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeptEmployeeId)) return false;
        DeptEmployeeId that = (DeptEmployeeId) o;
        return empId == that.empId &&
                deptId == that.deptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, deptId);
    }
}
