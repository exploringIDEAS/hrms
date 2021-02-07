package com.ralien.erp_system.user.services;

import com.ralien.erp_system.user.dto.person.CreatePersonRequest;
import com.ralien.erp_system.user.dto.person.PlainPerson;
import com.ralien.erp_system.user.dto.person.UpdatePersonRequest;

import java.util.UUID;

public interface IPersonService {
    PlainPerson get(UUID personId);
    PlainPerson create(CreatePersonRequest request);
    PlainPerson update(UpdatePersonRequest request);
    void deactivate(UUID personId);
    void activate(UUID personId);
}
