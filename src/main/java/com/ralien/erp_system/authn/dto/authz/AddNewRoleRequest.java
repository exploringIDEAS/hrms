package com.ralien.erp_system.authn.dto.authz;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class AddNewRoleRequest {
    @NotBlank
    @JsonProperty("role")
    @Length(min=3, max=30, message = "role length allowed between 3-20 characters")
    String roleTitle;

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }
}
