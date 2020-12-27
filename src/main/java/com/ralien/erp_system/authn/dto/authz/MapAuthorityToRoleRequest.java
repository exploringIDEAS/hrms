package com.ralien.erp_system.authn.dto.authz;

import javax.validation.constraints.NotBlank;

public class MapAuthorityToRoleRequest {
    @NotBlank
    private String roleId;
    @NotBlank
    private String authorityId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId;
    }
}
