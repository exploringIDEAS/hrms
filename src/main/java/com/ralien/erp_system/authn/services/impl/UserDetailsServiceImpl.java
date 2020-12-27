package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.dao.PersonRepository;
import com.ralien.erp_system.authn.entities.Authority;
import com.ralien.erp_system.authn.entities.Person;
import com.ralien.erp_system.authn.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    public PersonRepository repo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Person person = repo.findByUsername(s);
        if (person == null) {
            throw new UsernameNotFoundException("User 404");
        }
        Collection<Authority> authorities = new ArrayList<>();
        for (Role role: person.getRoles()) {
            authorities.addAll(role.getAuthorities());
        }
        return new User(person.getUsername(), person.getPassword(), person.isActive(), true, true, true, authorities);
    }
}