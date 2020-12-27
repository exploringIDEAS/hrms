package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.dao.AuthorityRepository;
import com.ralien.erp_system.authn.dao.RoleRepository;
import com.ralien.erp_system.authn.dto.authz.AddNewAuthorityRequest;
import com.ralien.erp_system.authn.dto.authz.AddNewRoleRequest;
import com.ralien.erp_system.authn.dto.authz.MapAuthorityToRoleRequest;
import com.ralien.erp_system.authn.entities.Authority;
import com.ralien.erp_system.authn.entities.Role;
import com.ralien.erp_system.authn.services.IAuthzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class AuthzService implements IAuthzService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    @Transactional
    public void addRole(AddNewRoleRequest request) {
        Role role = new Role();
        role.setTitle(request.getRoleTitle());
        roleRepository.save(role);
    }

    @Override
    @Transactional
    public void addAuthority(AddNewAuthorityRequest request) {
        Authority authority = new Authority();
        authority.setTitle(request.getAuthorityTitle());
        authorityRepository.save(authority);
    }

    @Override
    public void mapAuthorityToRole(MapAuthorityToRoleRequest request) {

    }
}
