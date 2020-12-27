package com.ralien.erp_system.authn.services;

import com.ralien.erp_system.authn.dto.authz.AddNewAuthorityRequest;
import com.ralien.erp_system.authn.dto.authz.AddNewRoleRequest;
import com.ralien.erp_system.authn.dto.authz.MapAuthorityToRoleRequest;

public interface IAuthzService {
    void addRole(AddNewRoleRequest request);
    void addAuthority(AddNewAuthorityRequest request);
    void mapAuthorityToRole(MapAuthorityToRoleRequest request);
}
