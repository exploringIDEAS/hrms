package com.ralien.erp_system.user.api;

import com.ralien.erp_system.user.dto.authn.LoginRequest;
import com.ralien.erp_system.user.dto.authn.LoginResponse;
import com.ralien.erp_system.user.dto.authn.ResetPasswordRequest;
import com.ralien.erp_system.user.dto.authn.UpdatePasswordRequest;
import com.ralien.erp_system.user.services.IAuthnService;
import com.ralien.erp_system.user.services.impl.AuthnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("authn")
public class AuthnResource {

    @Autowired
    private IAuthnService authnService;

    @PostMapping("login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) throws Exception {
        return ResponseEntity.ok(authnService.login(request));
    }

    @PutMapping("password/update")
    public ResponseEntity<?> updatePassword(@Valid @RequestBody UpdatePasswordRequest request) throws Exception {
        return null;
    }

    @PutMapping("password/reset")
    public ResponseEntity<?> resetPassword(@Valid @RequestBody ResetPasswordRequest request) {
        return null;
    }
}
