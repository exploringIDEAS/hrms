package com.ralien.erp_system.user.entities;

import com.ralien.erp_system.user.entities.composite_id.PersonRoleId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person_role")
public class PersonRole extends AbstractIdentity<PersonRoleId> {
    @EmbeddedId
    private PersonRoleId id;

    @Column(nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @Column(nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    @Override
    public PersonRoleId getId() {
        return id;
    }

    public void setId(PersonRoleId id) {
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
