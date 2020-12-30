package com.ralien.erp_system.authn.dao;

import com.ralien.erp_system.authn.entities.RoleAuthority;
import com.ralien.erp_system.authn.entities.RoleAuthorityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface RoleAuthorityRepository extends JpaRepository<RoleAuthority, RoleAuthorityId> {
    List<RoleAuthority> findByAuthorityId(Integer authorityId);
    List<RoleAuthority> findByRoleId(Integer roleId);
    @Modifying
    @Query("delete from RoleAuthority where roleId IN (?1) and authorityId = ?2")
    void deleteMappingsByAuthorityId(Set<Integer> roleIds, Integer authorityId);

    @Modifying
    @Query("delete from RoleAuthority where roleId = ?1 and authorityId IN (?2)")
    void deleteMappingsByRoleId(Integer roleId, Set<Integer> authoritiesId);
}
