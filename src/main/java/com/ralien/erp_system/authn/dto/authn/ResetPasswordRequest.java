package com.ralien.erp_system.authn.dto.authn;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

import static com.ralien.erp_system.authn.util.Constants.*;

public class ResetPasswordRequest {
    @NotBlank
    @Length(min=MIN_PASSWORD_LENGTH, max=MAX_PASSWORD_LENGTH, message = INVALID_PASSWORD_LENGTH_MESSAGE)
    @JsonProperty("new_password")
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
