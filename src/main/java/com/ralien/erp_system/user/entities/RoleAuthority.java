package com.ralien.erp_system.user.entities;

import com.ralien.erp_system.user.entities.composite_id.RoleAuthorityId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "role_authority")
public class RoleAuthority extends AbstractIdentity<RoleAuthorityId> {
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
