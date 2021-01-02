package com.ralien.erp_system.user.dto.authz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddNewPersonRoleMappingReq {
    @NotBlank
    private String username;
    @Positive
    @JsonProperty("role_id")
    private int roleId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
