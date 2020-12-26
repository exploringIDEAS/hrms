package com.ralien.erp_system.authn.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends BaseEntity {
    private String title;

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }
}
