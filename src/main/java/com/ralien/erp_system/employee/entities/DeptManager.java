package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.entities.composite_id.DeptManagerId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dept_manager")
@IdClass(DeptManagerId.class)
public class DeptManager extends BaseEntity {
    @Id
    @Column(name = "emp_id")
    private int empId;

    @Id
    @Column(name = "dept_id")
    private short deptId;

    private Date fromDate;
    private Date toDate;

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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
