package com.ralien.erp_system.user.dto.authn;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

import static com.ralien.erp_system.user.util.Constants.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatePasswordRequest {
    @NotBlank
    @Length(min=MIN_PASSWORD_LENGTH, max=MAX_PASSWORD_LENGTH, message = INVALID_PASSWORD_LENGTH_MESSAGE)
    @JsonProperty("new_password")
    private String newPassword;

    @NotBlank
    @Length(min=MIN_PASSWORD_LENGTH, max=MAX_PASSWORD_LENGTH, message = INVALID_PASSWORD_LENGTH_MESSAGE)
    @JsonProperty("old_password")
    private String oldPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
}
