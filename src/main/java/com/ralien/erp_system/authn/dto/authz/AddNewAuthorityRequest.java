package com.ralien.erp_system.authn.dto.authz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddNewAuthorityRequest {
    @NotBlank
    @JsonProperty("authority")
    @Length(min=6, max=100, message = "authority length allowed between 3-20 characters")
    String authorityTitle;

    public String getAuthorityTitle() {
        return authorityTitle;
    }

    public void setAuthorityTitle(String authorityTitle) {
        this.authorityTitle = authorityTitle;
    }
}
