package com.ralien.erp_system.authn.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "role_authority")
@IdClass(RoleAuthorityId.class)
public class RoleAuthority {
    @Id
    @Column(name="role_id")
    private int roleId;
    @Id
    @Column(name="authority_id")
    private int authorityId;
    private Date createdAt;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
