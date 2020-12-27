package com.ralien.erp_system.authn.entities;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authority")
public class Authority extends BaseEntity implements GrantedAuthority {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthority() {
        return title;
    }
}
