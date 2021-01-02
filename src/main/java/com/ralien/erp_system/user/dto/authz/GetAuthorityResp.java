package com.ralien.erp_system.user.dto.authz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ralien.erp_system.user.entities.Authority;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAuthorityResp {
    private final long id;
    private final String title;

    public GetAuthorityResp(Authority authority) {
        this.id = authority.getId();
        this.title = authority.getAuthority();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
