package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.dto.authn.LoginRequest;
import com.ralien.erp_system.authn.dto.authn.LoginResponse;
import com.ralien.erp_system.authn.dto.authn.UpdatePasswordRequest;
import com.ralien.erp_system.authn.services.IAuthnService;
import com.ralien.erp_system.authn.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class AuthnService implements IAuthnService {
    @Autowired
    private AuthenticationManager authnManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public LoginResponse login(LoginRequest request) throws BadCredentialsException {
        authnManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
        final String token = jwtUtil.generateToken(userDetails);
        return new LoginResponse(token);
    }

    @Override
    public void updatePassword(UpdatePasswordRequest request) {

    }
}
