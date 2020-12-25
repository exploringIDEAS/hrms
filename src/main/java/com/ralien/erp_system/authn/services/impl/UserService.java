package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.models.CreateUserRequest;
import com.ralien.erp_system.authn.models.PlainUser;
import com.ralien.erp_system.authn.models.UpdateUserRequest;
import com.ralien.erp_system.authn.services.IUserService;

public class UserService implements IUserService {
    @Override
    public PlainUser get(String userId) {
        return null;
    }

    @Override
    public PlainUser create(CreateUserRequest request) {
        return null;
    }

    @Override
    public PlainUser update(UpdateUserRequest request) {
        return null;
    }

    @Override
    public void deactivate(String userId) {

    }
}
