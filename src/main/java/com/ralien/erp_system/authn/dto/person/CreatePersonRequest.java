package com.ralien.erp_system.authn.dto.person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePersonRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotNull
    @JsonProperty("client_branch_id")
    private int clientBranchId;

    private String mobile;
    private String email;

    @JsonProperty("mobile_country_code")
    private String mobileCountryCode;

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

    public int getClientBranchId() {
        return clientBranchId;
    }

    public void setClientBranchId(int clientBranchId) {
        this.clientBranchId = clientBranchId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }
}
