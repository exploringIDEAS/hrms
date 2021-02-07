package com.ralien.erp_system.user.services;

import com.ralien.erp_system.user.dto.authz.*;

public interface IAuthzService {
    void addRole(AddNewRoleReq request);
    GetAllRolesResp getAllRoles();
    void deleteRole(int roleId);
    void addAuthority(AddNewAuthorityReq request);
    GetAllAuthoritiesResp getAllAuthorities();
    void deleteAuthority(int authorityId);
    void mapAuthorityToRole(MapAuthorityToRoleReq request);
    void deleteMapping(int roleId, int authorityId);
    void addPersonRoleMapping(AddNewPersonRoleMappingReq request);
}
