package com.ralien.erp_system.user.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "role_authority")
public class RoleAuthority {
    @EmbeddedId
    private RoleAuthorityId id;

    @Column(name="created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    public RoleAuthorityId getId() {
        return id;
    }

    public void setId(RoleAuthorityId id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
