package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.dao.ClientBranchRepository;
import com.ralien.erp_system.authn.dao.PersonRepository;
import com.ralien.erp_system.authn.dto.person.CreatePersonRequest;
import com.ralien.erp_system.authn.dto.person.PlainPerson;
import com.ralien.erp_system.authn.dto.person.UpdatePersonRequest;
import com.ralien.erp_system.authn.entities.Person;
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
    public PlainPerson get(UUID personId) {
        return new PlainPerson(personRepo.getOne(personId));
    }

    @Override
    @Transactional
    public PlainPerson create(CreatePersonRequest request) {
        Person newPerson = new Person();
        newPerson.setId(UUID.randomUUID());
        newPerson.setUsername(request.getUsername());
        newPerson.setPassword(passwordEncoder.encode(request.getPassword()));
        newPerson.setEmail(request.getEmail());
        newPerson.setClientBranch(clientBranchRepository.findById(request.getClientBranchId()).orElse(null));
        personRepo.saveAndFlush(newPerson);
        Person addedPerson = personRepo.findByUsername(request.getUsername());
        return new PlainPerson(addedPerson);
    }

    @Override
    public PlainPerson update(UpdatePersonRequest request) {
        return null;
    }

    @Override
    @Transactional
    public void deactivate(UUID personId) {
        personRepo.markPersonIdDeactivated(personId);
    }

    @Override
    @Transactional
    public void activate(UUID personId) {
        personRepo.markPersonIdActivated(personId);
    }
}
