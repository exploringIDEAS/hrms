package com.ralien.erp_system.authn.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "person_role")
@IdClass(PersonRoleId.class)
public class PersonRole {
    @Id
    @Column(name = "person_id", columnDefinition = "BINARY(16)")
    private UUID personId;

    @Id
    @Column(name = "role_id")
    private int roleId;

    @Column(nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @Column(nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    public PersonRole() {}

    public PersonRole(UUID personId, int roleId) {
        this.personId = personId;
        this.roleId = roleId;
    }

    public UUID getPersonId() {
        return personId;
    }

    public void setPersonId(UUID personId) {
        this.personId = personId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
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
