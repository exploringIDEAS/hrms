package com.ralien.erp_system.authn.services;

import com.ralien.erp_system.authn.dto.person.CreateUserRequest;
import com.ralien.erp_system.authn.dto.person.PlainUser;
import com.ralien.erp_system.authn.dto.person.UpdateUserRequest;

import java.util.UUID;

public interface IPersonService {
    PlainUser get(UUID userId);
    PlainUser create(CreateUserRequest request);
    PlainUser update(UpdateUserRequest request);
    void deactivate(UUID userId);
    void activate(UUID userId);
}
