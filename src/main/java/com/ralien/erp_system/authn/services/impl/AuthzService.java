package com.ralien.erp_system.authn.services.impl;

import com.ralien.erp_system.authn.dao.*;
import com.ralien.erp_system.authn.dto.authz.*;
import com.ralien.erp_system.authn.entities.*;
import com.ralien.erp_system.authn.services.IAuthzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class AuthzService implements IAuthzService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    private PersonRoleRepository personRoleRepository;

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional
    public void addRole(AddNewRoleReq request) {
        Role role = new Role();
        role.setTitle(request.getRoleTitle());
        roleRepository.save(role);
    }

    @Override
    public GetAllRolesResp getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        GetAllRolesResp resp = new GetAllRolesResp();
        for (Role role: roles) {
            resp.getRoles().add(new GetRoleResp(role));
        }
        return resp;
    }

    @Override
    @Transactional
    public void deleteRole(int roleId) {
        roleRepository.deleteById(roleId);
        List<RoleAuthority> roleAuthorities = roleAuthorityRepository.findByRoleId(roleId);
        if (!roleAuthorities.isEmpty()) {
            Set<Integer> authorityIds = new HashSet<>();
            for (RoleAuthority roleAuthority: roleAuthorities) {
                authorityIds.add(roleAuthority.getAuthorityId());
            }
            roleAuthorityRepository.deleteMappingsByRoleId(roleId, authorityIds);
        }
        List<PersonRole> personRoleMappings = personRoleRepository.findByRoleId(roleId);
        if (!personRoleMappings.isEmpty()) {
            List<UUID> personIds = new ArrayList<>();
            for (PersonRole personRoleMapping : personRoleMappings) {
                personIds.add(personRoleMapping.getPersonId());
            }
            personRoleRepository.deleteMappingsByRoleId(personIds, roleId);
        }
    }

    @Override
    @Transactional
    public void addAuthority(AddNewAuthorityReq request) {
        Authority authority = new Authority();
        authority.setTitle(request.getAuthorityTitle());
        authorityRepository.save(authority);
    }

    @Override
    public GetAllAuthoritiesResp getAllAuthorities() {
        List<Authority> authorities = authorityRepository.findAll();
        GetAllAuthoritiesResp resp = new GetAllAuthoritiesResp();
        for (Authority authority: authorities) {
            resp.getAuthorities().add(new GetAuthorityResp(authority));
        }
        return resp;
    }

    @Override
    @Transactional
    public void deleteAuthority(int authorityId) {
        authorityRepository.deleteById(authorityId);
        List<RoleAuthority> roleAuthorityMappings = roleAuthorityRepository.findByAuthorityId(authorityId);
        if (!roleAuthorityMappings.isEmpty()) {
            Set<Integer> roleIds = new HashSet<>();
            for (RoleAuthority roleAuthority : roleAuthorityMappings) {
                roleIds.add(roleAuthority.getRoleId());
            }
            roleAuthorityRepository.deleteMappingsByAuthorityId(roleIds, authorityId);
            List<PersonRole> personRoleMappings = personRoleRepository.findByRoleIds(roleIds);
            if (!personRoleMappings.isEmpty()) {
                List<UUID> personIds = new ArrayList<>();
                for (PersonRole personRoleMapping : personRoleMappings) {
                    personIds.add(personRoleMapping.getPersonId());
                }
                personRoleRepository.deleteMappingsByRoleIds(personIds, roleIds);
            }
        }

    }

    @Override
    @Transactional
    public void mapAuthorityToRole(MapAuthorityToRoleReq request) {
        Optional<Role> role = roleRepository.findById(request.getRoleId());
        Optional<Authority> authority = authorityRepository.findById(request.getAuthorityId());
        if (role.isPresent() && authority.isPresent()) {
            RoleAuthority roleAuthority = new RoleAuthority();
            roleAuthority.setAuthorityId(request.getAuthorityId());
            roleAuthority.setRoleId(request.getRoleId());
            roleAuthorityRepository.save(roleAuthority);
        } else if (!role.isPresent() && !authority.isPresent()){
            System.out.println("both not exist");
        } else if (!role.isPresent()) {
            System.out.println("role id not exist");
        } else {
            System.out.println("authority is not exist");
        }
    }

    @Override
    @Transactional
    public void deleteMapping(int roleId, int authorityId) {
        roleAuthorityRepository.deleteById(new RoleAuthorityId(roleId, authorityId));
    }

    @Override
    @Transactional
    public void addPersonRoleMapping(AddNewPersonRoleMappingReq request) {
        Person person = personRepository.findByUsername(request.getUsername());
        Optional<Role> role = roleRepository.findById(request.getRoleId());
        if (role.isPresent() && person != null){
            personRoleRepository.save(new PersonRole(person.getId(), request.getRoleId()));
        }
    }
}
