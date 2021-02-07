package com.ralien.erp_system.user.dto.authz;

import java.util.ArrayList;
import java.util.List;

public class GetAllRolesResp {
    private List<GetRoleResp> roles;

    public GetAllRolesResp() {
        roles = new ArrayList<>();
    }

    public GetAllRolesResp(List<GetRoleResp> roles) {
        this.roles =roles;
    }

    public List<GetRoleResp> getRoles() {
        return roles;
    }
}
