package com.ralien.erp_system.user.dto.authz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Positive;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MapAuthorityToRoleReq {
    @Positive
    @JsonProperty("role_id")
    private int roleId;
    @Positive
    @JsonProperty("authority_id")
    private int authorityId;

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
