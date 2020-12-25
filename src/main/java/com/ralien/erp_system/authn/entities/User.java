package com.ralien.erp_system.authn.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class User extends BaseEntity {
    private String username;
    private String password;
    private boolean active;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
