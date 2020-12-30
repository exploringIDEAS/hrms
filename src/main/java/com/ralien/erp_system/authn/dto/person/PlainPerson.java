package com.ralien.erp_system.authn.dto.person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ralien.erp_system.authn.dto.authz.GetRoleResp;
import com.ralien.erp_system.authn.entities.Person;
import com.ralien.erp_system.authn.entities.Role;
import com.ralien.erp_system.authn.util.UnixDateTimeSerializer;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlainPerson {
    private UUID id;
    private String username;
    private String email;
    private String mobile;
    private GetClientBranchResp clientBranch;
    @JsonProperty("created_at")
    @JsonSerialize(using = UnixDateTimeSerializer.class)
    private Date createdAt;
    @JsonProperty("updated_at")
    @JsonSerialize(using = UnixDateTimeSerializer.class)
    private Date updatedAt;
    @JsonProperty("mobile_country_code")
    private String mobileCountryCode;
    private boolean active;
    private Set<GetRoleResp> roles = new HashSet<>();

    public PlainPerson(Person person) {
        id = person.getId();
        username = person.getUsername();
        email = person.getEmail();
        clientBranch = new GetClientBranchResp(
                new GetClientResp(person.getClientBranch().getClient().getName()),
                new GetBranchResp(person.getClientBranch().getBranch()));
        createdAt = person.getCreatedAt();
        updatedAt = person.getLastUpdatedAt();
        active = person.isActive();
        for (Role role: person.getRoles()) {
            roles.add(new GetRoleResp(role));
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<GetRoleResp> getRoles() {
        return roles;
    }

    public void setRoles(Set<GetRoleResp> roles) {
        this.roles = roles;
    }

    public GetClientBranchResp getClientBranch() {
        return clientBranch;
    }

    public void setClientBranch(GetClientBranchResp clientBranch) {
        this.clientBranch = clientBranch;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
