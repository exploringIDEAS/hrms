package com.ralien.erp_system.user.dao;

import com.ralien.erp_system.user.entities.RoleAuthority;
import com.ralien.erp_system.user.entities.composite_id.RoleAuthorityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface RoleAuthorityRepository extends JpaRepository<RoleAuthority, RoleAuthorityId> {
    @Query("from RoleAuthority t where t.id.authorityId = ?1")
    List<RoleAuthority> findByAuthorityId(Integer authorityId);
    @Query("from RoleAuthority t where t.id.roleId = ?1")
    List<RoleAuthority> findByRoleId(Integer roleId);
    @Modifying
    @Query("delete from RoleAuthority t where t.id.roleId IN (?1) and t.id.authorityId = ?2")
    void deleteMappingsByAuthorityId(Set<Integer> roleIds, Integer authorityId);

    @Modifying
    @Query("delete from RoleAuthority t where t.id.roleId = ?1 and t.id.authorityId IN (?2)")
    void deleteMappingsByRoleId(Integer roleId, Set<Integer> authoritiesId);
}
