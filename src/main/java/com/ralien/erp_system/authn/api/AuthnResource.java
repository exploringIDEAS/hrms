package com.ralien.erp_system.authn.api;

import com.ralien.erp_system.authn.dto.authn.LoginRequest;
import com.ralien.erp_system.authn.dto.authn.LoginResponse;
import com.ralien.erp_system.authn.dto.authn.ResetPasswordRequest;
import com.ralien.erp_system.authn.dto.authn.UpdatePasswordRequest;
import com.ralien.erp_system.authn.services.impl.AuthnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("authn")
public class AuthnResource {

    @Autowired
    private AuthnService authnService;

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
