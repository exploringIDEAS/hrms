package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.entities.composite_id.DeptEmployeeId;
import com.ralien.erp_system.employee.entities.composite_id.DeptManagerId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dept_manager")
public class DeptManager extends AbstractIdentity<DeptManagerId> {
    @EmbeddedId
    private DeptManagerId id;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    private Date fromDate;
    private Date toDate;

    @Override
    public DeptManagerId getId() {
        return id;
    }

    public void setId(DeptManagerId id) {
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
