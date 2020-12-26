package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.PersonPrincipal;
import com.ralien.erp_system.authn.dao.PersonRepository;
import com.ralien.erp_system.authn.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return new PersonPrincipal(person);
    }
}
