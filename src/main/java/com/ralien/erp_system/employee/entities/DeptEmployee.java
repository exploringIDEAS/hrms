package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.entities.composite_id.DeptEmployeeId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dept_employee")
public class DeptEmployee extends AbstractIdentity<DeptEmployeeId> {
    @EmbeddedId
    private DeptEmployeeId id;
    private Date fromDate;
    private Date toDate;
    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    @Override
    public DeptEmployeeId getId() {
        return id;
    }

    public void setId(DeptEmployeeId id) {
        this.id = id;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
