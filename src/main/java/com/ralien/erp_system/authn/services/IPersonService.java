package com.ralien.erp_system.authn.services;

import com.ralien.erp_system.authn.dto.person.CreatePersonRequest;
import com.ralien.erp_system.authn.dto.person.PlainPerson;
import com.ralien.erp_system.authn.dto.person.UpdatePersonRequest;

import java.util.UUID;

public interface IPersonService {
    PlainPerson get(UUID personId);
    PlainPerson create(CreatePersonRequest request);
    PlainPerson update(UpdatePersonRequest request);
    void deactivate(UUID personId);
    void activate(UUID personId);
}
