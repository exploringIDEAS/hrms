package com.ralien.erp_system.user.entities.composite_id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleAuthorityId)) return false;
        RoleAuthorityId that = (RoleAuthorityId) o;
        return roleId == that.roleId &&
                authorityId == that.authorityId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, authorityId);
    }
}
