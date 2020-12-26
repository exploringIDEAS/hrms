package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.dao.ClientBranchRepository;
import com.ralien.erp_system.authn.dao.PersonRepository;
import com.ralien.erp_system.authn.entities.Person;
import com.ralien.erp_system.authn.dto.person.CreateUserRequest;
import com.ralien.erp_system.authn.dto.person.PlainUser;
import com.ralien.erp_system.authn.dto.person.UpdateUserRequest;
import com.ralien.erp_system.authn.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository personRepo;
    @Autowired
    private ClientBranchRepository clientBranchRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public PlainUser get(UUID userId) {
        return new PlainUser(personRepo.getOne(userId));
    }

    @Override
    @Transactional
    public PlainUser create(CreateUserRequest request) {
        Person newPerson = new Person();
        newPerson.setId(UUID.randomUUID());
        newPerson.setUsername(request.getUsername());
        newPerson.setPassword(passwordEncoder.encode(request.getPassword()));
        newPerson.setEmail(request.getEmail());
        newPerson.setMobile(request.getMobile());
        newPerson.setMobileCountryCode(request.getMobileCountryCode());
        newPerson.setClientBranch(clientBranchRepository.findById(request.getClientBranchId()).orElse(null));
        personRepo.saveAndFlush(newPerson);

        Person addedPerson = personRepo.findByUsername(request.getUsername());
        return new PlainUser(addedPerson);
    }

    @Override
    public PlainUser update(UpdateUserRequest request) {
        return null;
    }

    @Override
    @Transactional
    public void deactivate(UUID userId) {
        personRepo.markUserIdDeactivated(userId);
    }

    @Override
    @Transactional
    public void activate(UUID userId) {
        personRepo.markUserIdActivated(userId);
    }
}
