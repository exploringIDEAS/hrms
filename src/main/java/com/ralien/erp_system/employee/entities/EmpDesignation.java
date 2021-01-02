package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.entities.composite_id.EmpDesignationId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emp_designation")
@IdClass(EmpDesignationId.class)
public class EmpDesignation extends BaseEntity {
    @Id
    @Column(name = "emp_id")
    private int empId;
    @Id
    @Column(name = "designation_id")
    private short designationId;
    private Date fromDate;
    private Date toDate;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public short getDesignationId() {
        return designationId;
    }

    public void setDesignationId(short designationId) {
        this.designationId = designationId;
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
