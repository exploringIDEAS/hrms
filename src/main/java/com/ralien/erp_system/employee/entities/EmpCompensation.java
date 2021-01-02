package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.entities.composite_id.EmpCompensationId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emp_compensation")
@IdClass(EmpCompensationId.class)
public class EmpCompensation {
    @Id
    @Column(name = "emp_id")
    private int empId;

    @Id
    @Column(name = "compensation_id")
    private short compensationId;

    private Date fromDate;
    private Date toDate;
    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public short getCompensationId() {
        return compensationId;
    }

    public void setCompensationId(short compensationId) {
        this.compensationId = compensationId;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
