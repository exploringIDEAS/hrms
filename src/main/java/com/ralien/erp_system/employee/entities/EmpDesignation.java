package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.entities.composite_id.EmpDesignationId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emp_designation")
public class EmpDesignation extends AbstractIdentity<EmpDesignationId> {
    @EmbeddedId
    private EmpDesignationId id;
    private Date fromDate;
    private Date toDate;
    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

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

    @Override
    public EmpDesignationId getId() {
        return id;
    }

    public void setId(EmpDesignationId id) {
        this.id = id;
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
