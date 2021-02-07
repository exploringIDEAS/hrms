package com.ralien.erp_system.user.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_client")
public class Client extends BaseEntity {
    private String title;

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }
}
