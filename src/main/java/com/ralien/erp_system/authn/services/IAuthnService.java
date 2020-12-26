package com.ralien.erp_system.authn.services;

import com.ralien.erp_system.authn.dto.authn.LoginRequest;
import com.ralien.erp_system.authn.dto.authn.LoginResponse;
import com.ralien.erp_system.authn.dto.authn.UpdatePasswordRequest;

public interface IAuthnService {
    LoginResponse login(LoginRequest request);
    void updatePassword(UpdatePasswordRequest request);
}
