package com.ralien.erp_system.employee.entities;

import com.ralien.erp_system.employee.entities.composite_id.EmpCompensationId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "emp_compensation")
public class EmpCompensation extends AbstractIdentity<EmpCompensationId> {
    @EmbeddedId
    private EmpCompensationId id;

    private Date fromDate;
    private Date toDate;
    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @Override
    public EmpCompensationId getId() {
        return id;
    }

    public void setId(EmpCompensationId id) {
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


}
