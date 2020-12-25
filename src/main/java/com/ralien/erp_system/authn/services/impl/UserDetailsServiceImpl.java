package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.UserPrincipal;
import com.ralien.erp_system.authn.UserRepository;
import com.ralien.erp_system.authn.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    public UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = repo.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrincipal(user);
    }
}
