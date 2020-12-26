package com.ralien.erp_system.authn.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authority")
public class Authority extends BaseEntity {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
