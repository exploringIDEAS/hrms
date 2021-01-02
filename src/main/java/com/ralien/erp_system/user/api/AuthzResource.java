package com.ralien.erp_system.user.api;

import com.ralien.erp_system.user.dto.authz.*;
import com.ralien.erp_system.user.services.impl.AuthzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("authz")
public class AuthzResource {

    @Autowired
    private AuthzService authzService;

    @PostMapping("/authorities")
    public ResponseEntity<String> addNewAuthority(@Valid @RequestBody AddNewAuthorityReq request) throws URISyntaxException {
        authzService.addAuthority(request);
        return ResponseEntity.created(new URI("")).body("");
    }

    @GetMapping("/authorities/all")
    public ResponseEntity<GetAllAuthoritiesResp> authorityList() {
        return ResponseEntity.ok(authzService.getAllAuthorities());
    }

    @DeleteMapping("/authorities/{authority_id}")
    public ResponseEntity<String> delAuthority(@PathVariable("authority_id") int authorityId) {
        authzService.deleteAuthority(authorityId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/roles")
    public ResponseEntity<String> addNewRole(@Valid @RequestBody AddNewRoleReq request) throws URISyntaxException {
        authzService.addRole(request);
        return ResponseEntity.created(new URI("")).body("");
    }

    @GetMapping("/roles/all")
    public ResponseEntity<GetAllRolesResp> roleList() {
        return ResponseEntity.ok(authzService.getAllRoles());
    }

    @DeleteMapping("/roles/{role_id}")
    public ResponseEntity<String> delRole(@PathVariable("role_id") int roleId) {
        authzService.deleteRole(roleId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("authority/role/map")
    public ResponseEntity<String> mapAuthorityToRole(@Valid @RequestBody MapAuthorityToRoleReq request) throws URISyntaxException {
        authzService.mapAuthorityToRole(request);
        return ResponseEntity.created(new URI("")).body("");
    }

    @DeleteMapping("authority/{authority_id}/role/{role_id}/map")
    public ResponseEntity<String> deleteRoleAuthorityMapping(@PathVariable("authority_id") int authorityId, @PathVariable("role_id") int roleId) {
        authzService.deleteMapping(roleId, authorityId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/user/role/mappings")
    public ResponseEntity<String> addPersonRoleMapping(@Valid @RequestBody AddNewPersonRoleMappingReq request) throws URISyntaxException {
        authzService.addPersonRoleMapping(request);
        return ResponseEntity.created(new URI("")).body("added mapping");
    }
}
