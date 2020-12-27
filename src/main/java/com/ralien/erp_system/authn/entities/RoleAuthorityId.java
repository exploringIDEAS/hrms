package com.ralien.erp_system.authn.entities;

import java.io.Serializable;

public class RoleAuthorityId implements Serializable {
    private int roleId;
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
}
