package com.ralien.erp_system.authn.dto.authz;

import com.ralien.erp_system.authn.entities.Authority;
import com.ralien.erp_system.authn.entities.Role;

import java.util.ArrayList;
import java.util.List;

public class GetRoleResp {
    private final long id;
    private final String title;
    private List<GetAuthorityResp> authorities;

    public GetRoleResp(Role role) {
        this.id = role.getId();
        this.title = role.getTitle();
        authorities = new ArrayList<>();
        for (Authority authority: role.getAuthorities()) {
            authorities.add(new GetAuthorityResp(authority));
        }
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<GetAuthorityResp> getAuthorities() {
        return authorities;
    }
}
