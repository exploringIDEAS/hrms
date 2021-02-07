package com.ralien.erp_system.user.services;

import com.ralien.erp_system.user.dto.authn.LoginRequest;
import com.ralien.erp_system.user.dto.authn.LoginResponse;
import com.ralien.erp_system.user.dto.authn.UpdatePasswordRequest;

public interface IAuthnService {
    LoginResponse login(LoginRequest request);
    void updatePassword(UpdatePasswordRequest request);
}
