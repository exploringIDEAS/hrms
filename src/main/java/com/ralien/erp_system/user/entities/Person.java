package com.ralien.erp_system.user.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

// Person is User only

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    private String username;
    private String password;
    private boolean active;
    private String email;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @Column(name = "last_updated_at", nullable = false, insertable = false, updatable = false)
    private Date lastUpdatedAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_branch_id")
    private ClientBranch clientBranch;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="person_role",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClientBranch getClientBranch() {
        return clientBranch;
    }

    public void setClientBranch(ClientBranch clientBranch) {
        this.clientBranch = clientBranch;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
