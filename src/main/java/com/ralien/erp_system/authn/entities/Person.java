package com.ralien.erp_system.authn.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

// Person is User only

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Type(type="uuid-char")
    private UUID id;
    private String username;
    private String password;
    private boolean active;
    private String email;
    private String mobile;
    private String mobileCountryCode;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Date createdAt;

    @CreationTimestamp
    @Column(name = "updated_at", nullable = false, insertable = false, updatable = false)
    private Date updatedAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_branch_id")
    private ClientBranch clientBranch;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="user_role",
            joinColumns = @JoinColumn(name = "user_id"),
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}