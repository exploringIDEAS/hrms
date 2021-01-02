package com.ralien.erp_system.user.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RoleAuthorityId implements Serializable {
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "authority_id")
    private int authorityId;

    public RoleAuthorityId() {}

    public RoleAuthorityId(int roleId, int authorityId) {
        this.roleId = roleId;
        this.authorityId = authorityId;
    }

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roleId;
        result = prime * result + authorityId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        RoleAuthorityId that = (RoleAuthorityId) obj;
        return this.roleId == that.roleId && this.authorityId == that.authorityId;
    }
}
