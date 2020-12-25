package com.ralien.erp_system.authn.services;

import com.ralien.erp_system.authn.models.CreateUserRequest;
import com.ralien.erp_system.authn.models.PlainUser;
import com.ralien.erp_system.authn.models.UpdateUserRequest;

public interface IUserService {
    PlainUser get(String userId);
    PlainUser create(CreateUserRequest request);
    PlainUser update(UpdateUserRequest request);
    void deactivate(String userId);
}
