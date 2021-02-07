package com.ralien.erp_system.user.dto.authz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAllAuthoritiesResp {
    private List<GetAuthorityResp> authorities;

    public GetAllAuthoritiesResp() {
        authorities = new ArrayList<>();
    }

    public GetAllAuthoritiesResp(List<GetAuthorityResp> authorities) {
        this.authorities = new ArrayList<>();
        this.authorities = authorities;
    }

    public List<GetAuthorityResp> getAuthorities() {
        return authorities;
    }
}
