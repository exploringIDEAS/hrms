package com.ralien.erp_system.user.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_client_branch")
public class ClientBranch extends BaseEntity {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id")
    private Client client;
    private String branch;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
